package net.github.creep3rcrafter.inspire.entity;

import net.github.creep3rcrafter.inspire.register.InspireEntityDataSerializers;
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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;

public class JukeboxBoat extends Boat implements Clearable {
    //Dismount Location for Passenger ______________________________________________________________---__-___________________--_-__
    private static final EntityDataAccessor<ItemStack> RECORD;
    private static final EntityDataAccessor<Integer> TICKS_SINCE_LAST_EVENT;
    //private static final EntityDataAccessor<Long> TICK_COUNT;
    private static final EntityDataAccessor<Long> RECORD_STARTED_TICK;
    private static final EntityDataAccessor<Boolean> IS_PLAYING;
    private static final EntityDataAccessor<Boolean> HAS_RECORD;

    static {
        RECORD = SynchedEntityData.defineId(JukeboxBoat.class, EntityDataSerializers.ITEM_STACK);
        TICKS_SINCE_LAST_EVENT = SynchedEntityData.defineId(JukeboxBoat.class, EntityDataSerializers.INT);
        //TICK_COUNT = SynchedEntityData.defineId(JukeboxBoat.class, InspireEntityDataSerializers.LONG);
        RECORD_STARTED_TICK = SynchedEntityData.defineId(JukeboxBoat.class, InspireEntityDataSerializers.LONG);
        IS_PLAYING = SynchedEntityData.defineId(JukeboxBoat.class, EntityDataSerializers.BOOLEAN);
        HAS_RECORD = SynchedEntityData.defineId(JukeboxBoat.class, EntityDataSerializers.BOOLEAN);
    }

    public JukeboxBoat(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level);
    }

    public JukeboxBoat(Level level, double d, double e, double f) {
        super(level, d, e, f);
    }

    public static void playRecordTick(BiConsumer<GameEvent, Entity> biConsumer, JukeboxBoat jukeboxBoat) {
        jukeboxBoat.setTicksSinceLastEvent(jukeboxBoat.getTicksSinceLastEvent() + 1);
        if (recordIsPlaying(jukeboxBoat)) {
            Item item = jukeboxBoat.getRecord().getItem();
            if (item instanceof RecordItem recordItem) {
                if (recordShouldStopPlaying(jukeboxBoat, recordItem)) {
                    biConsumer.accept(GameEvent.JUKEBOX_STOP_PLAY, jukeboxBoat);
                    jukeboxBoat.setIsPlaying(false);
                } else if (shouldSendJukeboxPlayingEvent(jukeboxBoat)) {
                    jukeboxBoat.setTicksSinceLastEvent(0);
                    biConsumer.accept(GameEvent.JUKEBOX_PLAY, jukeboxBoat);
                }
            }
        }

        //jukeboxBoat.setTickCount(jukeboxBoat.getTickCount() + 1);
    }

    private static boolean recordIsPlaying(JukeboxBoat jukeboxBoat) {
        return (Boolean) jukeboxBoat.getHasRecord() && jukeboxBoat.getIsPlaying();
    }

    private static boolean recordShouldStopPlaying(JukeboxBoat jukeboxBoat, RecordItem recordItem) {
        return jukeboxBoat.tickCount >= jukeboxBoat.getRecordStartedTick() + (long) recordItem.getLengthInTicks();
    }

    /*
    public Long getTickCount() {
        return (Long) this.entityData.get(TICK_COUNT);
    }

    public void setTickCount(Long ticks) {
        this.entityData.set(TICK_COUNT, ticks);
    }

     */

    private static boolean shouldSendJukeboxPlayingEvent(JukeboxBoat jukeboxBoat) {
        return jukeboxBoat.getTicksSinceLastEvent() >= 20;
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

    protected void defineSynchedData() {
        this.entityData.define(RECORD, ItemStack.EMPTY);
        this.entityData.define(TICKS_SINCE_LAST_EVENT, 0);
        //this.entityData.define(TICK_COUNT, 0L);
        this.entityData.define(RECORD_STARTED_TICK, 0L);
        this.entityData.define(IS_PLAYING, false);
        this.entityData.define(HAS_RECORD, false);
        super.defineSynchedData();
    }

    public void setAndPlayRecord(JukeboxBoat jukeboxBoat, ItemStack itemStack) {
        jukeboxBoat.setRecord(itemStack.copy());
        jukeboxBoat.playRecord();
        jukeboxBoat.setHasRecord(true);

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
    public boolean wasKilled(ServerLevel serverLevel, LivingEntity livingEntity) {
        dropRecording(serverLevel);
        return super.wasKilled(serverLevel, livingEntity);
    }

    @Override
    public @NotNull InteractionResult interact(Player player, InteractionHand interactionHand) {
        return this.canAddPassenger(player) && !player.isSecondaryUseActive() ? super.interact(player, interactionHand) : this.interactWithJukeboxVehicle(this::gameEvent, player, interactionHand);
    }

    public InteractionResult interactWithJukeboxVehicle(BiConsumer<GameEvent, Entity> biConsumer, Player player, InteractionHand interactionHand) {
        if (!getHasRecord()) {
            if (!getLevel().isClientSide) {
                ItemStack itemStack = player.getItemInHand(interactionHand);
                if (itemStack.getItem() instanceof RecordItem) {
                    this.setAndPlayRecord(this, itemStack);
                    itemStack.shrink(1);
                    biConsumer.accept(GameEvent.JUKEBOX_PLAY, this);
                    player.awardStat(Stats.PLAY_RECORD);
                    System.out.print("boom1");
                }
                System.out.print("boom2");
            }
            System.out.print("boom3");
            return InteractionResult.sidedSuccess(getLevel().isClientSide);
        } else {
            System.out.print("boom4");
            return InteractionResult.PASS;
        }
        /*
        if ((Boolean) this.getHasRecord() && !(itemStack.getItem() instanceof RecordItem)) {
            this.dropRecording(level);
            this.setHasRecord(false);
            biConsumer.accept(GameEvent.JUKEBOX_STOP_PLAY, this);
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            if (!level.isClientSide) {
                if (itemStack.getItem() instanceof RecordItem) {
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
            compoundTag.put("RecordItem", this.getRecord().save(new CompoundTag()));
        }

        compoundTag.putBoolean("IsPlaying", this.getIsPlaying());
        compoundTag.putLong("RecordStartTick", this.getRecordStartedTick());
        //compoundTag.putLong("TickCount", this.getTickCount());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("RecordItem", 10)) {
            this.setRecord(ItemStack.of(compoundTag.getCompound("RecordItem")));
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
}
