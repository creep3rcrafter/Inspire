package net.github.creep3rcrafter.inspire.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class ThrownSpear extends CustomArrowEntity {
    public ThrownSpear(EntityType<? extends ThrownSpear> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownSpear(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    public ThrownSpear(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }
}
