package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.network.InspireNetworking;
import net.github.creep3rcrafter.inspire.register.InspireDataComponents;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("deprecation")
public class PortableJukeboxItem extends Item {
    public static long LAST_PARTICLE_TIME = 0;

    public PortableJukeboxItem(Properties properties) {
        super(properties);
    }


    public static void setRecord(ItemStack jukeboxStack, ItemStack disc) {
        jukeboxStack.update(InspireDataComponents.PORTABLE_JUKEBOX_CONTENTS.get(), ItemStack.EMPTY, itemStack -> disc);

    }

    public static boolean isEmpty(ItemStack itemStack1) {
        return getRecord(itemStack1).isEmpty();
    }

    public static ItemStack getRecord(ItemStack recordStack) {
        return recordStack.get(InspireDataComponents.PORTABLE_JUKEBOX_CONTENTS.get());
    }
    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack1 = player.getItemInHand(interactionHand);
        ItemStack recordStack;
        if (!isEmpty(itemStack1)) {
            recordStack = getRecord(itemStack1);
            if (recordStack.get(DataComponents.JUKEBOX_PLAYABLE) != null && JukeboxSong.fromStack(level.registryAccess(), recordStack).isPresent()) {
                if (!level.isClientSide()) {
                    Holder<JukeboxSong> songHolder = JukeboxSong.fromStack(level.registryAccess(), recordStack).orElseThrow();
                    if (player.isSecondaryUseActive()) {
                        InspireNetworking.sendJukeboxStopSongTo(player, songHolder.value().soundEvent());
                        InspireNetworking.sendJukeboxStopSongAround((ServerLevel)level, player, songHolder.value().soundEvent(), 20);
                    } else {
                        InspireNetworking.sendJukeboxStopSongTo(player, songHolder.value().soundEvent());
                        InspireNetworking.sendJukeboxStopSongAround((ServerLevel)level, player, songHolder.value().soundEvent(), 20);
                        InspireNetworking.sendJukeboxSongTo(player, songHolder,interactionHand);
                        InspireNetworking.sendJukeboxSongAround((ServerLevel)level, player, songHolder, interactionHand,20);
                    }
                }

            }
        }
        return InteractionResultHolder.success(player.getItemInHand(interactionHand));
    }

    @Override
    public boolean overrideStackedOnOther(ItemStack stackedOnStack, Slot slot, ClickAction clickAction, Player player) {
        // Method signature incompatible with 1.21.1 Item class
        // Disabling @Override annotation
        if (clickAction != ClickAction.SECONDARY) return false;

        ItemStack slotStack = slot.getItem();
        if (slotStack.isEmpty() && !isEmpty(stackedOnStack)) {
            this.playRemoveOneSound(player);
            var optionalSong = JukeboxSong.fromStack(player.level().registryAccess(), stackedOnStack.copy());
            optionalSong.ifPresent(songHolder -> {
                InspireNetworking.sendJukeboxStopSongTo((ServerPlayer)player, songHolder.value().soundEvent());
                InspireNetworking.sendJukeboxStopSongAround((ServerLevel)player.level(), (ServerPlayer)player, songHolder.value().soundEvent(), 20);
            });
            setRecord(stackedOnStack, slot.safeInsert(getRecord(stackedOnStack).copy()));
        } else if (!slotStack.isEmpty() && slotStack.getItem().canFitInsideContainerItems() && isEmpty(stackedOnStack) && slotStack.getComponents().get(DataComponents.JUKEBOX_PLAYABLE) != null) {
            setRecord(stackedOnStack, slot.safeTake(slotStack.getCount(), 1, player));
            this.playInsertSound(player);
        }

        return true;
    }
    @Override
    public void inventoryTick(ItemStack itemStack, Level serverLevel, Entity entity, int slot, boolean isSelected) {
        // Method signature incompatible with 1.21.1 Item class (was: ServerLevel, EquipmentSlot parameters)
        super.inventoryTick(itemStack, serverLevel, entity, slot, isSelected);

        if (!(entity instanceof ServerPlayer player)) return;

        // Only track if the itemStack is actually held
        InteractionHand actualHand = null;
        if (player.getMainHandItem() == itemStack) {
            actualHand = InteractionHand.MAIN_HAND;
        } else if (player.getOffhandItem() == itemStack) {
            actualHand = InteractionHand.OFF_HAND;
        } else {
            return; // not held, skip
        }

        // Update last hand without sending the song
        InteractionHand lastHand = InspireNetworking.SERVER_LAST_HAND.get(player.getId());
        if (lastHand != actualHand) {
            InspireNetworking.SERVER_LAST_HAND.put(player.getId(), actualHand);
        }
    }

    private void playRemoveOneSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_REMOVE_ONE, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    private void playInsertSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_INSERT, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Item.TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        // Fixed method signature for 1.21.1
        if (!isEmpty(itemStack)) {
            for (Component component : getRecord(itemStack).getTooltipLines(tooltipContext, null, tooltipFlag)){
                list.add(component);
            }
        }
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
    }

    public static void spawnMusicParticles(Entity entity, InteractionHand interactionHand) {
        if (entity instanceof LivingEntity livingEntity) {
            if (!isFirstPerson(entity)) {
                Vec3 offset = Vec3.ZERO.add(interactionHand == InteractionHand.MAIN_HAND ? -0.4F : 0.4, 0.3, 0.5F);
                double xBody = Math.sin(-livingEntity.yBodyRot / 180.0 * Math.PI);
                double zBody = Math.cos(-livingEntity.yBodyRot / 180.0 * Math.PI);
                livingEntity.level().addParticle(ParticleTypes.NOTE,
                        livingEntity.getX() + xBody * offset.z + zBody * offset.x,
                        livingEntity.getY() + livingEntity.getBbHeight() / 2.0 + offset.y,
                        livingEntity.getZ() + zBody * offset.z - xBody * offset.x,
                        xBody * 5.0, 0.0, zBody * 5.0
                );
            } else {
                Vec3 eyePos = livingEntity.getEyePosition(1.0F);
                double sideOffset = (interactionHand == InteractionHand.MAIN_HAND ? -0.55 : 0.55);
                double forwardOffset = 0.35;
                double verticalOffset = 0;
                float yawRad = (float) Math.toRadians(livingEntity.getYHeadRot());
                float pitchRad = (float) Math.toRadians(livingEntity.getXRot());
                double fx = -Math.sin(yawRad) * Math.cos(pitchRad);
                double fy = -Math.sin(pitchRad);
                double fz = Math.cos(yawRad) * Math.cos(pitchRad);
                double rx = Math.cos(yawRad);
                double rz = Math.sin(yawRad);
                double x = eyePos.x + fx * forwardOffset + rx * sideOffset;
                double y = eyePos.y + fy * forwardOffset + verticalOffset;
                double z = eyePos.z + fz * forwardOffset + rz * sideOffset;
                double upwardSpeed = 0.01;
                Vec3 particleVelocity = livingEntity.getDeltaMovement().add(0, upwardSpeed, 0);
                livingEntity.level().addParticle(ParticleTypes.NOTE, x, y, z, particleVelocity.x(), particleVelocity.y(), particleVelocity.z());
            }
        }
    }

    public static boolean isFirstPerson(Entity entity) {
        return Minecraft.getInstance().getCameraEntity() == entity && !Minecraft.getInstance().gameRenderer.getMainCamera().isDetached();
    }
}


    /*
    @Override
    public @NotNull InteractionResult use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack1 = player.getItemInHand(interactionHand);
        ItemStack recordStack;
        if (!isEmpty(itemStack1)) {
            recordStack = getRecord(itemStack1);
            if (recordStack.get(DataComponents.JUKEBOX_PLAYABLE) != null && JukeboxSong.fromStack(level.registryAccess(), recordStack).isPresent()) {
                if (!level.isClientSide()) {
                    if (player.isSecondaryUseActive()) {
                        stopSound(JukeboxSong.fromStack(level.registryAccess(), recordStack).get().value().soundEvent().value());
                    } else {
                        stopSound(JukeboxSong.fromStack(level.registryAccess(), recordStack).get().value().soundEvent().value());
                        if (!level.isClientSide()) {
                            Holder<JukeboxSong> songHolder =
                                    JukeboxSong.fromStack(level.registryAccess(), recordStack)
                                            .orElseThrow();
                            InspireNetworking.sendJukeboxSongTo((ServerPlayer)player, songHolder);
                            InspireNetworking.sendJukeboxSongAround((ServerLevel)level, (ServerPlayer)player, songHolder, 20);
                        }
                        playSound(JukeboxSong.fromStack(level.registryAccess(), recordStack).get().value().soundEvent().value(), player);//JukeboxSong.fromStack(level.registryAccess(), recordStack).get().value()
                    }
                }

            }
        }
        return super.use(level, player, interactionHand);
    }

     */
    /*
    @Override
    public boolean overrideStackedOnOther(ItemStack stackedOnStack, Slot slot, ClickAction clickAction, Player player) {
        if (clickAction != ClickAction.SECONDARY) return false;

        ItemStack slotStack = slot.getItem();
        if (slotStack.isEmpty() && !isEmpty(stackedOnStack)) {
            this.playRemoveOneSound(player);
            var optionalSong = JukeboxSong.fromStack(player.level().registryAccess(), stackedOnStack.copy());
            optionalSong.ifPresent(s -> stopSound(s.value().soundEvent().value(), player));
            setRecord(stackedOnStack, slot.safeInsert(getRecord(stackedOnStack).copy()));
        } else if (!slotStack.isEmpty() && slotStack.getItem().canFitInsideContainerItems() && isEmpty(stackedOnStack) && slotStack.getComponents().get(DataComponents.JUKEBOX_PLAYABLE) != null) {
            setRecord(stackedOnStack, slot.safeTake(slotStack.getCount(), 1, player));
            this.playInsertSound(player);
        }

        return true;
    }
    public void playSound(SoundEvent soundEvent, Entity entity) {
        EntityTrackingHoldingSoundInstance sound =
                new EntityTrackingHoldingSoundInstance(soundEvent, SoundSource.RECORDS, 1f, 1f, entity, entity.getRandom().nextLong());

        //PortableJukeboxItem.CURRENT_SOUND = sound;

        //Minecraft mc = Minecraft.getInstance();
        //mc.getSoundManager().queueTickingSound(sound);
        //mc.gui.setNowPlaying(jukeboxSong.description());
        //mc.getToastManager().showNowPlayingToast();
    }

    public void stopSound(SoundEvent soundEvent) {
        Minecraft.getInstance().getSoundManager().stop(soundEvent.location(), SoundSource.RECORDS);
        //PortableJukeboxItem.CURRENT_SOUND = null;
    }

    @Override
    public boolean overrideStackedOnOther(ItemStack stackedOnStack, Slot slot, ClickAction clickAction, Player player) {
        if (clickAction != ClickAction.SECONDARY) {
            return false;
        } else {
            ItemStack slotStack = slot.getItem();
            if (slotStack.isEmpty() && !isEmpty(stackedOnStack)) {
                this.playRemoveOneSound(player);
                if(JukeboxSong.fromStack(player.level().registryAccess(), stackedOnStack.copy()).isPresent()){
                    stopSound(JukeboxSong.fromStack(player.level().registryAccess(), stackedOnStack).get().value().soundEvent().value());
                }
                setRecord(stackedOnStack, slot.safeInsert(getRecord(stackedOnStack).copy()));
            } else if (slotStack.getItem().canFitInsideContainerItems() && isEmpty(stackedOnStack) && !slotStack.isEmpty() && slotStack.getComponents().get(DataComponents.JUKEBOX_PLAYABLE) != null) {
                setRecord(stackedOnStack, slot.safeTake(slotStack.getCount(), 1, player));
                this.playInsertSound(player);
            }
            return true;
        }
    }

    private void playSound(SoundEvent soundEvent, Entity entity, JukeboxSong song) {
        if (entity.level().isClientSide()) {
            // Client-side: play sound and show toast
            EntityTrackingHoldingSoundInstance sound = new EntityTrackingHoldingSoundInstance(
                    soundEvent,
                    SoundSource.RECORDS,
                    1f,
                    1f,
                    entity,
                    entity.getRandom().nextLong()
            );

            Minecraft mc = Minecraft.getInstance();
            mc.getSoundManager().queueTickingSound(sound);

            mc.execute(() -> {
                mc.gui.setNowPlaying(song.description());
                mc.getToastManager().showNowPlayingToast();
            });
        }
    }

    private void playSoundClientSide(SoundEvent soundEvent, Entity entity, JukeboxSong song) {
        EntityTrackingHoldingSoundInstance sound = new EntityTrackingHoldingSoundInstance(
                soundEvent,
                SoundSource.RECORDS,
                1f,
                1f,
                entity,
                entity.getRandom().nextLong()
        );

        Minecraft mc = Minecraft.getInstance();
        mc.getSoundManager().queueTickingSound(sound);

        // Show "Now Playing" toast
        mc.execute(() -> {
            mc.gui.setNowPlaying(song.description());
            mc.getToastManager().showNowPlayingToast();
        });
    }


    public void stopSound(SoundEvent soundEvent, Entity entity) {
        if (entity.level().isClientSide()) {
            Minecraft.getInstance().getSoundManager().stop(soundEvent.location(), SoundSource.RECORDS);
        }
    }
     */