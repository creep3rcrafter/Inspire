package net.github.creep3rcrafter.inspire.entity.hostile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;

public class SunkenEntity extends AbstractSkeleton {
    public SunkenEntity(EntityType<? extends SunkenEntity> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_SKELETON_STEP;
    }
}
