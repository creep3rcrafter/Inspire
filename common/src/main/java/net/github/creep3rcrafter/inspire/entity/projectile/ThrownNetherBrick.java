package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.utils.ColorUtils;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
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
import org.jetbrains.annotations.NotNull;

public class ThrownNetherBrick extends ThrowableItemProjectile {
    public ThrownNetherBrick(EntityType<? extends ThrownNetherBrick> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownNetherBrick(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.NETHER_BRICK.get(), livingEntity, level);
    }

    public ThrownNetherBrick(Level level, double x, double y, double z) {
        super(InspireEntityTypes.NETHER_BRICK.get(), x, y, z, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return Items.NETHER_BRICK;
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
        entity.hurt(DamageSource.thrown(this, this.getOwner()), (float) 5);
        //Utils.explode(this.getLevel(), entityHitResult.getEntity().blockPosition(), 2f);
        discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            if (ColorUtils.isGlass(this.level, blockHitResult.getBlockPos())) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else if (ColorUtils.isGlassPane(this.level, blockHitResult.getBlockPos())) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else if (level.getBlockState(blockHitResult.getBlockPos()).is(Blocks.FLOWER_POT)) {
                level.destroyBlock(blockHitResult.getBlockPos(), true, this);
                if (random.nextBoolean()) {
                    discard();
                }
            } else {
                discard();
            }
        }
    }
}
