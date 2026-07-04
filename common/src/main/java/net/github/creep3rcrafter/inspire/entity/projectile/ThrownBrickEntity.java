package net.github.creep3rcrafter.inspire.entity.projectile;

import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import com.github.creep3rcrafter.inspire.utils.ColorUtils;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class ThrownBrickEntity extends ThrownItemEntity {
    public ThrownBrickEntity(EntityType<? extends ThrownBrickEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrownBrickEntity(World world, LivingEntity livingEntity) {
        super(InspireEntityTypes.BRICK.get(), livingEntity, world);
    }

    public ThrownBrickEntity(World level, double x, double y, double z) {
        super(InspireEntityTypes.BRICK.get(), x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.BRICK;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return (ParticleEffect) (itemStack.isEmpty() ? ParticleTypes.DUST : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack));
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
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), (float) 4);
        discard();
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        World world = this.getWorld();
        if (!this.getWorld().isClient()) {
            if (ColorUtils.isGlass(world, blockHitResult.getBlockPos())) {
                world.breakBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else if (ColorUtils.isGlassPane(world, blockHitResult.getBlockPos())) {
                world.breakBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else if (world.getBlockState(blockHitResult.getBlockPos()).isOf(Blocks.FLOWER_POT)) {
                world.breakBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else {
                discard();
            }
        }
    }
}
