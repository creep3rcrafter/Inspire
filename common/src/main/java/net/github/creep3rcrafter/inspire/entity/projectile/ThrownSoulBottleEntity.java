package net.github.creep3rcrafter.inspire.entity.projectile;

import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class ThrownSoulBottleEntity extends ThrownItemEntity {
    public ThrownSoulBottleEntity(EntityType<? extends ThrownSoulBottleEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrownSoulBottleEntity(World world, LivingEntity livingEntity) {
        super(InspireEntityTypes.DYNAMITE.get(), livingEntity, world);
    }

    public ThrownSoulBottleEntity(World level, double x, double y, double z) {
        super(InspireEntityTypes.DYNAMITE.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SOUL_SAND;//change to soul bottle
    }

    @Override
    protected float getGravity() {
        return 0.07F;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (this.getWorld() instanceof ServerWorld serverWorld) {
            this.discard();
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (this.getWorld() instanceof ServerWorld serverWorld) {
            /*
            if (serverWorld.getBlockState(blockHitResult.getBlockPos()).getBlock() instanceof SoulGlassBlock) {
                serverWorld.setBlockAndUpdate(blockHitResult.getBlockPos(), InspireBlocks.SOUL_GLASS.get().defaultBlockState());
            }

             */
            this.discard();
        }
    }
}
