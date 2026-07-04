package net.github.creep3rcrafter.inspire.entity.projectile;

import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.github.creep3rcrafter.inspire.utils.ColorUtils.*;

public class ThrownDyeGlobEntity extends ThrownItemEntity {
    private static final TrackedData<Integer> COLOR_ID;

    static {
        COLOR_ID = DataTracker.registerData(ThrownDyeGlobEntity.class, TrackedDataHandlerRegistry.INTEGER);
    }

    public ThrownDyeGlobEntity(EntityType<? extends ThrownDyeGlobEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThrownDyeGlobEntity(World world, LivingEntity livingEntity) {
        super(InspireEntityTypes.DYE_GLOB.get(), livingEntity, world);
    }

    public ThrownDyeGlobEntity(World world, double x, double y, double z) {
        super(InspireEntityTypes.DYE_GLOB.get(), x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SLIME_BALL;//change to Dye Glob Item
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(COLOR_ID, 0);
    }

    public int getColorID() {
        return this.dataTracker.get(COLOR_ID);
    }

    public void setColorID(int colorID) {
        this.dataTracker.set(COLOR_ID, colorID);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), (float) 0.25f);
        dyeEntity(entity, getColorID());
        discard();
    }

    @Override
    public void tick() {
        super.tick();
        World world = this.getWorld();
        BlockPos blockPos = this.getBlockPos();
        if (isBanner(world, blockPos)) {
            setBanner(world, blockPos, getColorID(), world.getBlockState(blockPos));
            discard();
        } else if (isWallBanner(world, blockPos)) {
            setWallBanner(world, blockPos, getColorID(), world.getBlockState(blockPos));
            discard();
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        World world = this.getWorld();
        if (!this.getWorld().isClient()) {
            net.minecraft.util.math.BlockPos blockPos = blockHitResult.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            if (isWool(world, blockPos)) {
                setWool(world, blockPos, getColorID(), blockState);
            } else if (isConcrete(world, blockPos)) {
                setConcrete(world, blockPos, getColorID(), blockState);
            } else if (isConcretePowder(world, blockPos)) {
                setConcretePowder(world, blockPos, getColorID(), blockState);
            } else if (isCandle(world, blockPos)) {
                setCandle(world, blockPos, getColorID(), blockState);
            } else if (isBed(world, blockPos)) {
                setBed(world, blockPos, getColorID(), blockState);
            } else if (isCarpet(world, blockPos)) {
                setCarpet(world, blockPos, getColorID(), blockState);
            } else if (isTerracotta(world, blockPos)) {
                setTerracotta(world, blockPos, getColorID(), blockState);
            } else if (isGlazedTerracotta(world, blockPos)) {
                setGlazedTerracotta(world, blockPos, getColorID(), blockState);
            } else if (isCandleCake(world, blockPos)) {
                setCandleCake(world, blockPos, getColorID(), blockState);
            } else if (isShulkerBox(world, blockPos)) {
                setShulkerBox(world, blockPos, getColorID(), blockState);
            } else if (isGlass(world, blockPos)) {
                setGlass(world, blockPos, getColorID(), blockState);
            } else if (isGlassPane(world, blockPos)) {
                setGlassPane(world, blockPos, getColorID(), blockState);
            }
            discard();
        }
    }
}
