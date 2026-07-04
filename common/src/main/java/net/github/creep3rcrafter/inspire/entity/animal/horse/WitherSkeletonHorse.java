package net.github.creep3rcrafter.inspire.entity.animal.horse;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class WitherSkeletonHorse extends AbstractHorse {

    public WitherSkeletonHorse(EntityType<? extends WitherSkeletonHorse> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return createBaseHorseAttributes().add(Attributes.MAX_HEALTH, 20.0).add(Attributes.MOVEMENT_SPEED, 0.3);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    protected void randomizeAttributes(RandomSource randomSource) {
        this.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(this.generateRandomJumpStrength(randomSource) + 1f);
    }

    protected void addBehaviourGoals() {
    }

    protected SoundEvent getAmbientSound() {
        super.getAmbientSound();
        return this.isEyeInFluid(FluidTags.WATER) ? SoundEvents.SKELETON_HORSE_AMBIENT_WATER : SoundEvents.SKELETON_HORSE_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        super.getDeathSound();
        return SoundEvents.SKELETON_HORSE_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        super.getHurtSound(damageSource);
        return SoundEvents.SKELETON_HORSE_HURT;
    }

    protected SoundEvent getSwimSound() {
        if (this.onGround) {
            if (!this.isVehicle()) {
                return SoundEvents.SKELETON_HORSE_STEP_WATER;
            }

            ++this.gallopSoundCounter;
            if (this.gallopSoundCounter > 5 && this.gallopSoundCounter % 3 == 0) {
                return SoundEvents.SKELETON_HORSE_GALLOP_WATER;
            }

            if (this.gallopSoundCounter <= 5) {
                return SoundEvents.SKELETON_HORSE_STEP_WATER;
            }
        }

        return SoundEvents.SKELETON_HORSE_SWIM;
    }

    protected void playSwimSound(float f) {
        if (this.onGround) {
            super.playSwimSound(0.3F);
        } else {
            super.playSwimSound(Math.min(0.1F, f * 25.0F));
        }

    }

    protected void playJumpSound() {
        if (this.isInWater()) {
            this.playSound(SoundEvents.SKELETON_HORSE_JUMP_WATER, 0.4F, 1.0F);
        } else {
            super.playJumpSound();
        }

    }

    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    @Override
    protected void spawnSoulSpeedParticle() {
        super.spawnSoulSpeedParticle();
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 0.05;
    }

    @Override
    protected float getBlockSpeedFactor() {
        return this.onSoulSpeedBlock() ? 1.0F : super.getBlockSpeedFactor();
    }

    @Override
    public boolean canSpawnSoulSpeedParticle() {
        return this.tickCount % 5 == 0 && this.getDeltaMovement().x != 0.0 && this.getDeltaMovement().z != 0.0 && !this.isSpectator() && this.onSoulSpeedBlock();
    }

    public boolean rideableUnderWater() {
        return true;
    }

    protected float getWaterSlowDown() {
        return 0.96F;
    }

    @Nullable
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return (AgeableMob) EntityType.SKELETON_HORSE.create(serverLevel);
    }

    public InteractionResult mobInteract(Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!this.isTamed()) {
            return InteractionResult.PASS;
        } else if (this.isBaby()) {
            return super.mobInteract(player, interactionHand);
        } else if (player.isSecondaryUseActive()) {
            this.openCustomInventoryScreen(player);
            return InteractionResult.sidedSuccess(this.level.isClientSide);
        } else if (this.isVehicle()) {
            return super.mobInteract(player, interactionHand);
        } else {
            if (!itemStack.isEmpty()) {
                if (itemStack.is(Items.SADDLE) && !this.isSaddled()) {
                    this.openCustomInventoryScreen(player);
                    return InteractionResult.sidedSuccess(this.level.isClientSide);
                }

                InteractionResult interactionResult = itemStack.interactLivingEntity(player, this, interactionHand);
                if (interactionResult.consumesAction()) {
                    return interactionResult;
                }
            }

            this.doPlayerRide(player);
            return InteractionResult.sidedSuccess(this.level.isClientSide);
        }
    }
}
