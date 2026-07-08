package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrownSoulBottleEntity extends ThrowableItemProjectile {
    public ThrownSoulBottleEntity(EntityType<? extends ThrownSoulBottleEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownSoulBottleEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.SOUL_BOTTLE.get(), livingEntity, level);
    }

    public ThrownSoulBottleEntity(Level level, double x, double y, double z) {
        super(InspireEntityTypes.SOUL_BOTTLE.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SOUL_SAND;
    }

    @Override
    protected double getDefaultGravity() {
        return 0.07F;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (this.level() instanceof ServerLevel) {
            this.discard();
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (this.level() instanceof ServerLevel) {
            /*
            if (serverLevel.getBlockState(blockHitResult.getBlockPos()).getBlock() instanceof SoulGlassBlock) {
                serverLevel.setBlockAndUpdate(blockHitResult.getBlockPos(), InspireBlocks.SOUL_GLASS.get().defaultBlockState());
            }

             */
            this.discard();
        }
    }
}
