package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.utils.ColorUtils;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrownNetherBrickEntity extends ThrowableItemProjectile {
    public ThrownNetherBrickEntity(EntityType<? extends ThrownNetherBrickEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownNetherBrickEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.NETHER_BRICK.get(), livingEntity, level);
    }

    public ThrownNetherBrickEntity(Level level, double x, double y, double z) {
        super(InspireEntityTypes.NETHER_BRICK.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.NETHER_BRICK;
    }

    private ParticleOptions getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? (ParticleOptions) new net.minecraft.core.particles.DustParticleOptions(new org.joml.Vector3f(0.5f, 0.1f, 0.1f), 1.0f) : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleEntityEvent(byte status) {
        if (status == 3) {
            ParticleOptions particleEffect = this.getParticleParameters();

            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0F, 0.0F, 0.0F);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), 5);
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        Level level = this.level();
        if (!level.isClientSide) {
            if (ColorUtils.isGlass(level, blockHitResult.getBlockPos())) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (this.random.nextBoolean()) {
                    this.discard();
                }
            } else if (ColorUtils.isGlassPane(level, blockHitResult.getBlockPos())) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (this.random.nextBoolean()) {
                    this.discard();
                }
            } else if (level.getBlockState(blockHitResult.getBlockPos()).is(Blocks.FLOWER_POT)) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (this.random.nextBoolean()) {
                    this.discard();
                }
            } else {
                this.discard();
            }
        }
    }
}
