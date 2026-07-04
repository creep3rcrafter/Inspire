package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.block.SoulGlassBlock;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class ThrownSoulBottle extends ThrowableItemProjectile {
    public ThrownSoulBottle(EntityType<? extends ThrownSoulBottle> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownSoulBottle(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.SOUL_BOTTLE.get(), livingEntity, level);
    }

    public ThrownSoulBottle(Level level, double d, double e, double f) {
        super(InspireEntityTypes.SOUL_BOTTLE.get(), d, e, f, level);
    }

    protected @NotNull Item getDefaultItem() {
        return InspireItems.SOUL_BOTTLE.get();
    }

    protected float getGravity() {
        return 0.07F;
    }

    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (this.level instanceof ServerLevel serverLevel) {
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (this.level instanceof ServerLevel serverLevel) {
            if (serverLevel.getBlockState(blockHitResult.getBlockPos()).getBlock() instanceof SoulGlassBlock) {
                serverLevel.setBlockAndUpdate(blockHitResult.getBlockPos(), InspireBlocks.SOUL_GLASS.get().defaultBlockState());
            }
            this.discard();
        }
    }
}
