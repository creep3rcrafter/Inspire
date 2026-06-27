package net.github.creep3rcrafter.inspire.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RedstoneActiveMobEffect extends MobEffect {

    public RedstoneActiveMobEffect(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    @Override
    public boolean applyEffectTick(@NotNull ServerLevel serverLevel, @NotNull LivingEntity livingEntity, int amplifier) {
        return super.applyEffectTick(serverLevel, livingEntity, amplifier);
    }

    @Override
    public void applyInstantenousEffect(@NotNull ServerLevel serverLevel, @Nullable Entity entity, @Nullable Entity entity2, LivingEntity livingEntity, int i, double d) {
        super.applyInstantenousEffect(serverLevel, entity, entity2, livingEntity, i, d);
    }

    @Override
    public boolean isInstantenous() {
        return super.isInstantenous();
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return false;
    }
}
