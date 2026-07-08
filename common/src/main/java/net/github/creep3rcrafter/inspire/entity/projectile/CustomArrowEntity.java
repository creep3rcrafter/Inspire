package net.github.creep3rcrafter.inspire.entity.projectile;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomArrowEntity extends AbstractArrow {
    private static final EntityDataAccessor<Float> TIP =
            SynchedEntityData.defineId(CustomArrowEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Float> ROD =
            SynchedEntityData.defineId(CustomArrowEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Float> TAIL =
            SynchedEntityData.defineId(CustomArrowEntity.class, EntityDataSerializers.FLOAT);

    public CustomArrowEntity(EntityType<? extends CustomArrowEntity> entityType, Level level) {
        super(entityType, level);
    }

    public CustomArrowEntity(Level level, double x, double y, double z) {
        this(InspireEntityTypes.CUSTOM_ARROW.get(), level);
        setPos(x, y, z);
    }

    public CustomArrowEntity(Level level, LivingEntity livingEntity) {
        super(InspireEntityTypes.CUSTOM_ARROW.get(), livingEntity, level, ItemStack.EMPTY, null);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(TIP, 0.0f);
        builder.define(ROD, 0.0f);
        builder.define(TAIL, 0.0f);
    }

    @Override
    public void tick() {
        super.tick();
        if (getTip() == 0.55f) {
            clearFire();
        }
        if (getTip() == 0.9f) {
            setNoGravity(true);
        }
    }

    public float getTip() {
        return entityData.get(TIP);
    }

    public void setTip(float value) {
        entityData.set(TIP, value);
    }

    public float getRod() {
        return entityData.get(ROD);
    }

    public void setRod(float value) {
        entityData.set(ROD, value);
    }

    public float getTail() {
        return entityData.get(TAIL);
    }

    public void setTail(float value) {
        entityData.set(TAIL, value);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putFloat("tip", getTip());
        tag.putFloat("rod", getRod());
        tag.putFloat("tail", getTail());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("tip")) {
            setTip(tag.getFloat("tip"));
        }
        if (tag.contains("rod")) {
            setRod(tag.getFloat("rod"));
        }
        if (tag.contains("tail")) {
            setTail(tag.getFloat("tail"));
        }
    }
}
