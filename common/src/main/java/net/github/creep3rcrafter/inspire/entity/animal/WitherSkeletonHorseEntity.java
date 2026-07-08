package net.github.creep3rcrafter.inspire.entity.animal;

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
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class WitherSkeletonHorseEntity extends AbstractHorse {

    public WitherSkeletonHorseEntity(EntityType<? extends WitherSkeletonHorseEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createSkeletonHorseAttributes() {
        return createBaseHorseAttributes().add(Attributes.MAX_HEALTH, 20.0F).add(Attributes.MOVEMENT_SPEED, 0.3F);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    protected void randomizeAttributes(RandomSource random) {
        AttributeInstance attributeInstance = this.getAttribute(Attributes.JUMP_STRENGTH);
        Objects.requireNonNull(random);
        if (attributeInstance != null) {
            attributeInstance.setBaseValue(getOffspringAttribute(random::nextDouble) + 1f);
        }
    }

    @Override
    protected void addBehaviourGoals() {
    }


    @Override
    protected SoundEvent getAmbientSound() {
        super.getAmbientSound();
        return this.isEyeInFluid(FluidTags.WATER) ? SoundEvents.SKELETON_HORSE_AMBIENT_WATER : SoundEvents.SKELETON_HORSE_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        super.getDeathSound();
        return SoundEvents.SKELETON_HORSE_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        super.getHurtSound(damageSource);
        return SoundEvents.SKELETON_HORSE_HURT;
    }

    @Override
    protected SoundEvent getSwimSound() {
        if (this.onGround()) {
            if (!this.hasExactlyOnePlayerPassenger()) {
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

    @Override
    protected void playSwimSound(float f) {
        if (this.onGround()) {
            super.playSwimSound(0.3F);
        } else {
            super.playSwimSound(Math.min(0.1F, f * 25.0F));
        }

    }

    @Override
    protected void playJumpSound() {
        if (this.isInWater()) {
            this.playSound(SoundEvents.SKELETON_HORSE_JUMP_WATER, 0.4F, 1.0F);
        } else {
            super.playJumpSound();
        }

    }

    @Override
    protected void spawnSoulSpeedParticle() {
        super.spawnSoulSpeedParticle();
    }


    @Override
    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 0.05;
    }

    @Override
    protected float getBlockSpeedFactor() {
        return this.onSoulSpeedBlock() ? 1.0f : super.getBlockSpeedFactor();
    }

    @Override
    public boolean canSpawnSprintParticle() {
        return this.tickCount % 5 == 0 && this.getDeltaMovement().x != 0.0F && this.getDeltaMovement().z != 0.0F && !this.isSpectator() && this.onSoulSpeedBlock();
    }

    @Override
    public boolean canBeControlledByRider() {
        return false;
    }

    @Override
    @Nullable
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob ageableMob) {
        return EntityType.SKELETON_HORSE.create(level);
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!this.isTamed()) {
            return InteractionResult.PASS;
        } else if (this.isBaby()) {
            return super.mobInteract(player, hand);
        } else if (player.isSecondaryUseActive()) {
            this.openCustomInventoryScreen(player);
            return InteractionResult.sidedSuccess(this.level().isClientSide);
        } else if (this.isVehicle()) {
            return super.mobInteract(player, hand);
        } else {
            if (!itemStack.isEmpty()) {
                if (itemStack.is(Items.SADDLE) && !this.isSaddled()) {
                    this.openCustomInventoryScreen(player);
                    return InteractionResult.sidedSuccess(this.level().isClientSide);
                }
                InteractionResult interactionResult = itemStack.interactLivingEntity(player, this, hand);
                if (interactionResult.consumesAction()) {
                    return interactionResult;
                }
            }
            this.doPlayerRide(player);
            return InteractionResult.sidedSuccess(this.level().isClientSide);
        }
    }
}
