package net.github.creep3rcrafter.inspire.entity.projectile;


import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ThrownSlimeballEntity extends ThrownItemEntity {
    public ThrownSlimeballEntity(EntityType<? extends ThrownSlimeballEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrownSlimeballEntity(World world, LivingEntity livingEntity) {
        super(InspireEntityTypes.SLIMEBALL.get(), livingEntity, world);
    }

    public ThrownSlimeballEntity(World world, double x, double y, double z) {
        super(InspireEntityTypes.SLIMEBALL.get(), x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SLIME_BALL;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return (ParticleEffect) (itemStack.isEmpty() ? ParticleTypes.ITEM_SLIME : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack));
    }

    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), (double) 0.0F, (double) 0.0F, (double) 0.0F);
            }
        }

    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.damage(this.getDamageSources().thrown(this, this.getOwner()), (float) 0.5);
            double d = Math.max((double) 0.0F, (double) 1.0F - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
            Vec3d vec3 = this.movementMultiplier.multiply((double) 1.0F, (double) 0.0F, (double) 1.0F).normalize().multiply((double) 5 * 0.6 * d);
            if (vec3.lengthSquared() > (double) 0.0F) {
                livingEntity.addVelocity(vec3.x, 0.1, vec3.z);
            }
        }
        discard();
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (!this.getWorld().isClient()) {
            discard();
        }
    }
}
