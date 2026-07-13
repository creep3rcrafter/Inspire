package net.github.creep3rcrafter.inspire.entity.projectile;


import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class ThrownSlimeballEntity extends ThrowableItemProjectile {
    public ThrownSlimeballEntity(EntityType<? extends ThrownSlimeballEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownSlimeballEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.SLIMEBALL.get(), livingEntity, level);
    }

    public ThrownSlimeballEntity(Level level, double x, double y, double z) {
        super(InspireEntityTypes.SLIMEBALL.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SLIME_BALL;
    }

    private ParticleOptions getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.ITEM_SLIME : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
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
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.hurt(this.damageSources().thrown(this, this.getOwner()), 0.5f);
            double d = Math.max(0.0F, 1.0F - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
            Vec3 vec3 = this.getDeltaMovement().multiply(1.0F, 0.0F, 1.0F).normalize().multiply(5 * 0.6 * d);
            if (vec3.lengthSqr() > 0.0F) {
                livingEntity.push(vec3.x, 0.1, vec3.z);
            }
        }
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level().isClientSide) {
            this.discard();
        }
    }
}
