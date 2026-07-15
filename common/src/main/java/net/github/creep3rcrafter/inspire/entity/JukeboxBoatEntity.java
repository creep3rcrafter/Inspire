package net.github.creep3rcrafter.inspire.entity;

import net.github.creep3rcrafter.inspire.register.InspireEntityDataSerializers;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.Clearable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class JukeboxBoatEntity extends Boat implements Clearable {
    //Dismount Location for Passenger ______________________________________________________________---__-___________________--_-__
    private static final EntityDataAccessor<ItemStack> RECORD;
    private static final EntityDataAccessor<Integer> TICKS_SINCE_LAST_EVENT;
    //private static final EntityDataAccessor<Long> TICK_COUNT;
    private static final EntityDataAccessor<Long> RECORD_STARTED_TICK;
    private static final EntityDataAccessor<Boolean> IS_PLAYING;
    private static final EntityDataAccessor<Boolean> HAS_RECORD;

    static {
        RECORD = SynchedEntityData.defineId(JukeboxBoatEntity.class, EntityDataSerializers.ITEM_STACK);
        TICKS_SINCE_LAST_EVENT = SynchedEntityData.defineId(JukeboxBoatEntity.class, EntityDataSerializers.INT);
        //TICK_COUNT = SynchedEntityData.defineId(JukeboxBoatEntity.class, InspireEntityDataSerializers.LONG);
        RECORD_STARTED_TICK = SynchedEntityData.defineId(JukeboxBoatEntity.class, InspireEntityDataSerializers.LONG);
        IS_PLAYING = SynchedEntityData.defineId(JukeboxBoatEntity.class, EntityDataSerializers.BOOLEAN);
        HAS_RECORD = SynchedEntityData.defineId(JukeboxBoatEntity.class, EntityDataSerializers.BOOLEAN);
    }

    public JukeboxBoatEntity(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level);
    }

    public JukeboxBoatEntity(Level level, double d, double e, double f) {
        super(level, d, e, f);
    }

    public static void playRecordTick(BiConsumer<Holder<GameEvent>, Entity> biConsumer, JukeboxBoatEntity jukeboxBoatEntity) {
        jukeboxBoatEntity.setTicksSinceLastEvent(jukeboxBoatEntity.getTicksSinceLastEvent() + 1);
        if (recordIsPlaying(jukeboxBoatEntity)) {
            // For now, just accept any item without checking for specific music disc items
            // since MusicDiscItem class doesn't exist in 1.21.1
            if (shouldSendJukeboxPlayingEvent(jukeboxBoatEntity)) {
                jukeboxBoatEntity.setTicksSinceLastEvent(0);
                biConsumer.accept(GameEvent.JUKEBOX_PLAY, jukeboxBoatEntity);
            }
        }

        //jukeboxBoatEntity.setTickCount(jukeboxBoatEntity.getTickCount() + 1);
    }

    private static boolean recordIsPlaying(JukeboxBoatEntity jukeboxBoatEntity) {
        return (Boolean) jukeboxBoatEntity.getHasRecord() && jukeboxBoatEntity.getIsPlaying();
    }

    private static boolean recordShouldStopPlaying(JukeboxBoatEntity jukeboxBoatEntity) {
        // Simplified version without MusicDiscItem - just check after a reasonable duration
        return jukeboxBoatEntity.tickCount >= jukeboxBoatEntity.getRecordStartedTick() + 200L;
    }

    /*
    public Long getTickCount() {
        return (Long) this.entityData.get(TICK_COUNT);
    }

    public void setTickCount(Long ticks) {
        this.entityData.set(TICK_COUNT, ticks);
    }

     */

    private static boolean shouldSendJukeboxPlayingEvent(JukeboxBoatEntity jukeboxBoatEntity) {
        return jukeboxBoatEntity.getTicksSinceLastEvent() >= 20;
    }

    public ItemStack getRecord() {
        return (ItemStack) this.entityData.get(RECORD);
    }

    public void setRecord(ItemStack itemStack) {
        this.entityData.set(RECORD, itemStack);
    }

    public int getTicksSinceLastEvent() {
        return (int) this.entityData.get(TICKS_SINCE_LAST_EVENT);
    }

    public void setTicksSinceLastEvent(int ticks) {
        this.entityData.set(TICKS_SINCE_LAST_EVENT, ticks);
    }

    public Long getRecordStartedTick() {
        return (Long) this.entityData.get(RECORD_STARTED_TICK);
    }

    public void setRecordStartedTick(Long ticks) {
        this.entityData.set(RECORD_STARTED_TICK, ticks);
    }

    public Boolean getIsPlaying() {
        return (Boolean) this.entityData.get(IS_PLAYING);
    }

    public void setIsPlaying(Boolean isPlaying) {
        this.entityData.set(IS_PLAYING, isPlaying);
    }

    public Boolean getHasRecord() {
        return (Boolean) this.entityData.get(HAS_RECORD);
    }

    public void setHasRecord(Boolean hasRecord) {
        this.entityData.set(HAS_RECORD, hasRecord);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(RECORD, ItemStack.EMPTY);
        builder.define(TICKS_SINCE_LAST_EVENT, 0);
        //builder.define(TICK_COUNT, 0L);
        builder.define(RECORD_STARTED_TICK, 0L);
        builder.define(IS_PLAYING, false);
        builder.define(HAS_RECORD, false);
    }

    public void setAndPlayRecord(JukeboxBoatEntity jukeboxBoatEntity, ItemStack itemStack) {
        jukeboxBoatEntity.setRecord(itemStack.copy());
        jukeboxBoatEntity.playRecord();
        jukeboxBoatEntity.setHasRecord(true);

    }

    @Override
    public float getSinglePassengerXOffset() {
        return 0.15F;
    }

    @Override
    public int getMaxPassengers() {
        return 1;
    }

    @Override
    public void tick() {
        if (getHasRecord()) {
            playRecordTick(this::gameEvent, this);
        }
        super.tick();
    }

    @Override
    public boolean killedEntity(ServerLevel serverLevel, LivingEntity livingEntity) {
        dropRecording(serverLevel);
        return super.killedEntity(serverLevel, livingEntity);
    }

    @Override
    public @NotNull InteractionResult interact(Player player, InteractionHand interactionHand) {
        return this.canAddPassenger(player) && !player.isSecondaryUseActive() ? super.interact(player, interactionHand) : this.interactWithJukeboxVehicle(this::gameEvent, player, interactionHand);
    }

    public InteractionResult interactWithJukeboxVehicle(BiConsumer<Holder<GameEvent>, Entity> biConsumer, Player player, InteractionHand interactionHand) {
        if (!getHasRecord()) {
            if (!level().isClientSide) {
                ItemStack itemStack = player.getItemInHand(interactionHand);
                if (!itemStack.isEmpty()) {
                    this.setAndPlayRecord(this, itemStack);
                    itemStack.shrink(1);
                    biConsumer.accept(GameEvent.JUKEBOX_PLAY, this);
                    player.awardStat(Stats.PLAY_RECORD);
                    System.out.print("boom1");
                }
                System.out.print("boom2");
            }
            System.out.print("boom3");
            return InteractionResult.sidedSuccess(level().isClientSide);
        } else {
            System.out.print("boom4");
            return InteractionResult.PASS;
        }
        /*
        if ((Boolean) this.getHasRecord()) {
            this.dropRecording(level);
            this.setHasRecord(false);
            biConsumer.accept(GameEvent.JUKEBOX_STOP_PLAY, this);
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            if (!level.isClientSide) {
                ItemStack itemStack = player.getItemInHand(interactionHand);
                if (!itemStack.isEmpty()) {
                    this.setRecord(this, itemStack);
                    itemStack.shrink(1);
                    player.awardStat(Stats.PLAY_RECORD);
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
            return InteractionResult.PASS;
        }

         */
    }

    public void playRecord() {
        this.setRecordStartedTick((long) this.tickCount);
        this.setIsPlaying(true);
    }

    public void clearContent() {
        this.setRecord(ItemStack.EMPTY);
        this.setIsPlaying(false);
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        if (!this.getRecord().isEmpty()) {
            compoundTag.put("RecordItem", this.getRecord().save(this.level().registryAccess()));
        }

        compoundTag.putBoolean("IsPlaying", this.getIsPlaying());
        compoundTag.putLong("RecordStartTick", this.getRecordStartedTick());
        //compoundTag.putLong("TickCount", this.getTickCount());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("RecordItem", 10)) {
            this.setRecord(ItemStack.parseOptional(this.level().registryAccess(), compoundTag.getCompound("RecordItem")));
        }

        this.setIsPlaying(compoundTag.getBoolean("IsPlaying"));
        this.setRecordStartedTick(compoundTag.getLong("RecordStartTick"));
        //this.setTickCount(compoundTag.getLong("TickCount"));
    }

    public void dropRecording(Level level) {
        if (!level.isClientSide) {
            ItemStack itemStack = getRecord();
            if (!itemStack.isEmpty()) {
                clearContent();
                double d = (double) (level.random.nextFloat() * 0.7F) + 0.15000000596046448;
                double e = (double) (level.random.nextFloat() * 0.7F) + 0.06000000238418579 + 0.6;
                double g = (double) (level.random.nextFloat() * 0.7F) + 0.15000000596046448;
                ItemStack itemStack2 = itemStack.copy();
                ItemEntity itemEntity = new ItemEntity(level, (double) this.getX() + d, (double) this.getY() + e, (double) this.getZ() + g, itemStack2);
                itemEntity.setDefaultPickUpDelay();
                level.addFreshEntity(itemEntity);
            }
        }
    }

    @Override
    public Boat.@NotNull Type getVariant() {
        return Boat.Type.OAK;
    }
}
