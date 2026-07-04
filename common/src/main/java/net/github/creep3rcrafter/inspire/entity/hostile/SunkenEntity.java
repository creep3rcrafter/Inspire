package net.github.creep3rcrafter.inspire.entity.hostile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class SunkenEntity extends AbstractSkeletonEntity {
    public SunkenEntity(EntityType<? extends SunkenEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_SKELETON_STEP;
    }
}
