package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
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
import org.jetbrains.annotations.NotNull;

public class ThrownSlimeball extends ThrowableItemProjectile {
    public ThrownSlimeball(EntityType<? extends ThrownSlimeball> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownSlimeball(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.SLIMEBALL.get(), livingEntity, level);
    }

    public ThrownSlimeball(Level level, double x, double y, double z) {
        super(InspireEntityTypes.SLIMEBALL.get(), x, y, z, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return Items.SLIME_BALL;
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItemRaw();
        return itemStack.isEmpty() ? ParticleTypes.ASH : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
    }

    public void handleEntityEvent(byte b) {
        if (b == 3) {
            ParticleOptions particleOptions = this.getParticle();

            for (int i = 0; i < 8; ++i) {
                this.level.addParticle(particleOptions, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }

    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.hurt(DamageSource.thrown(this, this.getOwner()), (float) 0.5);
            double d = Math.max((double) 0.0F, (double) 1.0F - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
            Vec3 vec3 = this.getDeltaMovement().multiply((double) 1.0F, (double) 0.0F, (double) 1.0F).normalize().scale((double) 5 * 0.6 * d);
            if (vec3.lengthSqr() > (double) 0.0F) {
                livingEntity.push(vec3.x, 0.1, vec3.z);
            }
        }
        discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            discard();
        }
    }
}
