package net.github.creep3rcrafter.inspire.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HomingMobEffect extends MobEffect {

    public HomingMobEffect(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    /*
    @Override
    public boolean applyEffectTick(@NotNull ServerLevel serverLevel, @NotNull LivingEntity livingEntity, int amplifier) {
        if (livingEntity instanceof ServerPlayer serverPlayer && !livingEntity.isSpectator()) {
            Vec3 pos;
            if(serverPlayer.getRespawnConfig() != null){
                if ((serverLevel.getBlockState(serverPlayer.getRespawnConfig().respawnData().pos()).getBlock() instanceof BedBlock)) {
                    pos = Vec3.atBottomCenterOf(serverPlayer.getRespawnConfig().respawnData().pos());
                    serverPlayer.connection.teleport(pos.x, pos.y, pos.z, Mth.wrapDegrees(serverPlayer.getYRot()), Mth.wrapDegrees(serverPlayer.getXRot()));
                } else {
                    pos = Vec3.atBottomCenterOf(serverPlayer.getRespawnConfig().respawnData().globalPos().pos());
                    serverPlayer.connection.teleport(pos.x, pos.y, pos.z, Mth.wrapDegrees(serverPlayer.getYRot()), Mth.wrapDegrees(serverPlayer.getXRot()));
                }
            }
        } else {
            Vec3 pos = Vec3.atBottomCenterOf(livingEntity.level().getRespawnData().globalPos().pos());
            livingEntity.teleportTo(pos.x, pos.y, pos.z);
        }
        return true;
    }

    @Override
    public void applyInstantenousEffect(@NotNull ServerLevel serverLevel, @Nullable Entity entity, @Nullable Entity entity2, LivingEntity livingEntity, int i, double d) {
        super.applyInstantenousEffect(serverLevel, entity, entity2, livingEntity, i, d);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration == 1;
    }
    */
}
