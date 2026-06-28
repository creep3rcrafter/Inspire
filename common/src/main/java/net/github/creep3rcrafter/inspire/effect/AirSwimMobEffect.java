package net.github.creep3rcrafter.inspire.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AirSwimMobEffect extends MobEffect {
    
    public AirSwimMobEffect(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    /*
    @Override
    public boolean applyEffectTick(@NotNull ServerLevel serverLevel, @NotNull LivingEntity livingEntity, int amplifier) {
        float f;
        livingEntity.resetFallDistance();
        livingEntity.wasEyeInWater = true;
        livingEntity.wasTouchingWater = true;
        livingEntity.setSwimming(true);
        livingEntity.setPose(Pose.SWIMMING);
        Vec3 vec32 = livingEntity.getDeltaMovement();
        f = 1.08f;
        if (livingEntity.horizontalCollision && livingEntity.onClimbable()) {
            vec32 = new Vec3(vec32.x, 0.25D, vec32.z);
        }
        livingEntity.setDeltaMovement(vec32.multiply(f, f + 0.05, f));
        livingEntity.gameEvent(GameEvent.SWIM);
        System.out.println("BOB");
        return true;
    }

    @Override
    public void applyInstantenousEffect(@NotNull ServerLevel serverLevel, @Nullable Entity entity, @Nullable Entity entity2, LivingEntity livingEntity, int i, double d) {
        super.applyInstantenousEffect(serverLevel, entity, entity2, livingEntity, i, d);
    }

    @Override
    public boolean isInstantenous() {
        return false;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration >= 1;
    }
    */
}
