package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.utils.ColorUtils;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;

public class ThrownBrickEntity extends ThrowableItemProjectile {
    public ThrownBrickEntity(EntityType<? extends ThrownBrickEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownBrickEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.BRICK.get(), livingEntity, level);
    }

    public ThrownBrickEntity(Level level, double x, double y, double z) {
        super(InspireEntityTypes.BRICK.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.BRICK;
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItem();
        return (ParticleOptions)(!itemStack.isEmpty() && !itemStack.is(this.getDefaultItem()) ? new ItemParticleOption(ParticleTypes.ITEM, itemStack) : ParticleTypes.DUST);
    }
    @Override
    public void handleEntityEvent(byte status) {
        if (status == 3) {
            ParticleOptions particleEffect = this.getParticle();

            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0F, 0.0F, 0.0F);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float) 4);
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
