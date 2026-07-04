package net.github.creep3rcrafter.inspire.entity.hostile;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;

public class SkeletonCreeperEntity extends CreeperEntity {

    public SkeletonCreeperEntity(EntityType<? extends SkeletonCreeperEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(2, new AvoidSunlightGoal(this));
        this.goalSelector.add(3, new EscapeSunlightGoal(this, (double)1.0F));
        this.goalSelector.add(3, new FleeEntityGoal(this, WolfEntity.class, 6.0F, (double)1.0F, 1.2));
        super.initGoals();
        //this.goalSelector.add(6, new CrossbowAttackGoal<>(this, 1, 20));
    }

    @Override
    public boolean canFreeze() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SKELETON_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        if (this.getRandom().nextInt(10)> 5){
            return super.getHurtSound(source);
        }else {
            return SoundEvents.ENTITY_SKELETON_HURT;
        }
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_SKELETON_STEP, 0.15F, 1.0F);
    }
}
