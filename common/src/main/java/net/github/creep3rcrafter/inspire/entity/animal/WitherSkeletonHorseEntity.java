package net.github.creep3rcrafter.inspire.entity.animal;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class WitherSkeletonHorseEntity extends AbstractHorseEntity {

    public WitherSkeletonHorseEntity(EntityType<? extends WitherSkeletonHorseEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createSkeletonHorseAttributes() {
        return createBaseHorseAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, (double) 20.0F).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, (double) 0.3F);
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }

    @Override
    protected void initAttributes(Random random) {
        EntityAttributeInstance var10000 = this.getAttributeInstance(EntityAttributes.HORSE_JUMP_STRENGTH);
        Objects.requireNonNull(random);
        var10000.setBaseValue(getChildJumpStrengthBonus(random::nextDouble) + 1f);
    }

    @Override
    protected void initCustomGoals() {
    }


    @Override
    protected SoundEvent getAmbientSound() {
        super.getAmbientSound();
        return this.isSubmergedIn(FluidTags.WATER) ? SoundEvents.ENTITY_SKELETON_HORSE_AMBIENT_WATER : SoundEvents.ENTITY_SKELETON_HORSE_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        super.getDeathSound();
        return SoundEvents.ENTITY_SKELETON_HORSE_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        super.getHurtSound(damageSource);
        return SoundEvents.ENTITY_SKELETON_HORSE_HURT;
    }

    @Override
    protected SoundEvent getSwimSound() {
        if (this.isOnGround()) {
            if (!this.hasPassengers()) {
                return SoundEvents.ENTITY_SKELETON_HORSE_STEP_WATER;
            }

            ++this.soundTicks;
            if (this.soundTicks > 5 && this.soundTicks % 3 == 0) {
                return SoundEvents.ENTITY_SKELETON_HORSE_GALLOP_WATER;
            }

            if (this.soundTicks <= 5) {
                return SoundEvents.ENTITY_SKELETON_HORSE_STEP_WATER;
            }
        }

        return SoundEvents.ENTITY_SKELETON_HORSE_SWIM;
    }

    @Override
    protected void playSwimSound(float f) {
        if (this.isOnGround()) {
            super.playSwimSound(0.3F);
        } else {
            super.playSwimSound(Math.min(0.1F, f * 25.0F));
        }

    }

    @Override
    protected void playJumpSound() {
        if (this.isTouchingWater()) {
            this.playSound(SoundEvents.ENTITY_SKELETON_HORSE_JUMP_WATER, 0.4F, 1.0F);
        } else {
            super.playJumpSound();
        }

    }

    @Override
    public EntityGroup getGroup() {
        return EntityGroup.UNDEAD;
    }

    @Override
    protected void displaySoulSpeedEffects() {
        super.displaySoulSpeedEffects();
    }


    @Override
    public double getMountedHeightOffset() {
        return super.getMountedHeightOffset() + 0.05;
    }

    @Override
    protected float getVelocityMultiplier() {
        return this.isOnSoulSpeedBlock() ? 1.0f : super.getVelocityMultiplier();
    }

    @Override
    public boolean shouldDisplaySoulSpeedEffects() {
        return this.age % 5 == 0 && this.getVelocity().x != (double) 0.0F && this.getVelocity().z != (double) 0.0F && !this.isSpectator() && this.isOnSoulSpeedBlock();
    }

    @Override
    public boolean shouldDismountUnderwater() {
        return false;
    }

    @Override
    @Nullable
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return (PassiveEntity) EntityType.SKELETON_HORSE.create(world);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!this.isTame()) {
            return ActionResult.PASS;
        } else if (this.isBaby()) {
            return super.interactMob(player, hand);
        } else if (player.shouldCancelInteraction()) {
            this.openInventory(player);
            return ActionResult.success(this.getWorld().isClient());
        } else if (this.hasPassengers()) {
            return super.interactMob(player, hand);
        } else {
            if (!itemStack.isEmpty()) {
                if (itemStack.isOf(Items.SADDLE) && !this.isSaddled()) {
                    this.openInventory(player);
                    return ActionResult.success(this.getWorld().isClient());
                }
                ActionResult interactionResult = itemStack.useOnEntity(player, this, hand);
                if (interactionResult.isAccepted()) {
                    return interactionResult;
                }
            }
            this.putPlayerOnBack(player);
            return ActionResult.success(this.getWorld().isClient());
        }
    }

    @Override
    public EntityView method_48926() {
        return null;
    }
}
