package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

import static net.github.creep3rcrafter.inspire.utils.ColorUtils.*;

public class ThrownDyeGlob extends ThrowableItemProjectile {
    private static final EntityDataAccessor<Integer> COLOR_ID;

    static {
        COLOR_ID = SynchedEntityData.defineId(ThrownDyeGlob.class, EntityDataSerializers.INT);
    }

    public ThrownDyeGlob(EntityType<? extends ThrownDyeGlob> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownDyeGlob(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.DYE_GLOB.get(), livingEntity, level);
    }


    public ThrownDyeGlob(Level level, double x, double y, double z) {
        super(InspireEntityTypes.DYE_GLOB.get(), x, y, z, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return InspireItems.WHITE_DYE_GLOB.get();
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(COLOR_ID, 0);
    }

    public int getColorID() {
        return this.entityData.get(COLOR_ID);
    }

    public void setColorID(int colorID) {
        this.entityData.set(COLOR_ID, colorID);
    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(DamageSource.thrown(this, this.getOwner()), (float) 0.25f);
        dyeEntity(entity, getColorID());
        discard();
    }

    @Override
    public void tick() {
        super.tick();
        BlockPos blockPos = this.blockPosition();
        if (isBanner(level, blockPos)) {
            setBanner(level, blockPos, getColorID(), level.getBlockState(blockPos));
            discard();
        } else if (isWallBanner(level, blockPos)) {
            setWallBanner(level, blockPos, getColorID(), level.getBlockState(blockPos));
            discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            BlockPos blockPos = blockHitResult.getBlockPos();
            BlockState blockState = level.getBlockState(blockPos);
            if (isWool(level, blockPos)) {
                setWool(level, blockPos, getColorID(), blockState);
            } else if (isConcrete(level, blockPos)) {
                setConcrete(level, blockPos, getColorID(), blockState);
            } else if (isConcretePowder(level, blockPos)) {
                setConcretePowder(level, blockPos, getColorID(), blockState);
            } else if (isCandle(level, blockPos)) {
                setCandle(level, blockPos, getColorID(), blockState);
            } else if (isBed(level, blockPos)) {
                setBed(level, blockPos, getColorID(), blockState);
            } else if (isCarpet(level, blockPos)) {
                setCarpet(level, blockPos, getColorID(), blockState);
            } else if (isTerracotta(level, blockPos)) {
                setTerracotta(level, blockPos, getColorID(), blockState);
            } else if (isGlazedTerracotta(level, blockPos)) {
                setGlazedTerracotta(level, blockPos, getColorID(), blockState);
            } else if (isCandleCake(level, blockPos)) {
                setCandleCake(level, blockPos, getColorID(), blockState);
            } else if (isShulkerBox(level, blockPos)) {
                setShulkerBox(level, blockPos, getColorID(), blockState);
            } else if (isGlass(level, blockPos)) {
                setGlass(level, blockPos, getColorID(), blockState);
            } else if (isGlassPane(level, blockPos)) {
                setGlassPane(level, blockPos, getColorID(), blockState);
            }
            discard();
        }
    }
}
