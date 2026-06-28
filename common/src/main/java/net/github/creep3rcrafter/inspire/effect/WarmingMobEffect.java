package net.github.creep3rcrafter.inspire.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.SnowGolem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WarmingMobEffect extends MobEffect {

    public WarmingMobEffect(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    /*
    @Override
    public boolean applyEffectTick(@NotNull ServerLevel serverLevel, @NotNull LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide()) {
            livingEntity.setTicksFrozen(0);
            if (livingEntity instanceof SnowGolem && serverLevel.getServer().getTickCount() % 20 == 0) {
                livingEntity.hurtServer(serverLevel, livingEntity.damageSources().magic(), amplifier + 1);
            }
            return true;
        }
        return false;
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
