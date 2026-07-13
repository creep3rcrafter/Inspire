package net.github.creep3rcrafter.inspire.entity.projectile;


import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.utils.Utils;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrownDynamiteEntity extends ThrowableItemProjectile {
    public ThrownDynamiteEntity(EntityType<? extends ThrownDynamiteEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownDynamiteEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.DYNAMITE.get(), livingEntity, level);
    }

    public ThrownDynamiteEntity(Level level, double x, double y, double z) {
        super(InspireEntityTypes.DYNAMITE.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.TNT;
    }

    private ParticleOptions getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.ASH : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
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
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), 1);
        Utils.explode(this.level(), entity.blockPosition(), 2f);
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level().isClientSide) {
            Utils.explode(this.level(), blockHitResult.getBlockPos(), 2f);
            this.discard();
        }
    }
}
