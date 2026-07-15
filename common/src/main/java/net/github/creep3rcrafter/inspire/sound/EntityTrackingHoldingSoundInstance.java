package net.github.creep3rcrafter.inspire.sound;

import net.github.creep3rcrafter.inspire.item.PortableJukeboxItem;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.JukeboxSong;

import java.util.Optional;

public class EntityTrackingHoldingSoundInstance extends AbstractTickableSoundInstance {

    private final Entity entity;
    private final Holder<SoundEvent> soundEvent;

    public EntityTrackingHoldingSoundInstance(SoundEvent soundEvent, SoundSource soundSource, float volume, float pitch, Entity entity, long seed) {
        super(soundEvent, soundSource, RandomSource.create(seed));
        this.volume = volume;
        this.pitch = pitch;
        this.entity = entity;
        this.soundEvent = Holder.direct(soundEvent);
        updatePosition();
    }

    @Override
    public boolean canPlaySound() {
        return !entity.isSilent();
    }

    @Override
    public void tick() {
        if (entity.isRemoved() || !(entity instanceof Player player)) {
            stop();
            //InspireNetworking.sendJukeboxStopSongAround((ServerLevel) entity.level(), entity, soundEvent, 20);
            return;
        }
        if (isHoldingMatchingRecord(player, InteractionHand.MAIN_HAND) ||
                isHoldingMatchingRecord(player, InteractionHand.OFF_HAND)) {

            updatePosition();
        } else {
            stop();
        }
    }

    private boolean isHoldingMatchingRecord(Player player, InteractionHand hand) {
        ItemStack held = player.getItemInHand(hand);
        if (!(held.getItem() instanceof PortableJukeboxItem))
            return false;
        ItemStack record = PortableJukeboxItem.getRecord(held);
        if (record.get(DataComponents.JUKEBOX_PLAYABLE) == null)
            return false;
        Optional<Holder<JukeboxSong>> songOpt = JukeboxSong.fromStack(player.level().registryAccess(), record);
        if (songOpt.isEmpty())
            return false;
        // In 1.21.1, use soundEvent() directly instead of value().location()
        Holder<SoundEvent> recordSoundEvent = songOpt.get().value().soundEvent();
        return recordSoundEvent.equals(this.soundEvent);
    }

    private void updatePosition() {
        this.x = entity.getX();
        this.y = entity.getY();
        this.z = entity.getZ();
    }
}








/*
package net.github.creep3rcrafter.inspire.sound;


import net.github.creep3rcrafter.inspire.item.PortableJukeboxItem;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.JukeboxSong;

public class EntityTrackingHoldingSoundInstance extends AbstractTickableSoundInstance {
    //EntityBoundSoundInstance
    private final Entity entity;

    public EntityTrackingHoldingSoundInstance(SoundEvent soundEvent, SoundSource soundSource, float f, float g, Entity entity, long l) {
        super(soundEvent, soundSource, RandomSource.create(l));
        this.volume = f;
        this.pitch = g;
        this.entity = entity;
        this.x = (double)((float)this.entity.getX());
        this.y = (double)((float)this.entity.getY());
        this.z = (double)((float)this.entity.getZ());
    }

    @Override
    public boolean canPlaySound() {
        return !this.entity.isSilent();
    }

    @Override
    public void tick() {
        if (!this.entity.isRemoved() && entity instanceof Player player) {
            if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof PortableJukeboxItem) {
                ItemStack itemstack = PortableJukeboxItem.getRecord(player.getItemInHand(InteractionHand.MAIN_HAND));
                if (itemstack.get(DataComponents.JUKEBOX_PLAYABLE) != null && JukeboxSong.fromStack(player.level().registryAccess(), itemstack).isPresent()) {
                    if (JukeboxSong.fromStack(player.level().registryAccess(), itemstack).get().value().soundEvent().value().location() == getLocation()) {
                        this.x = (double) ((float) this.entity.getX());
                        this.y = (double) ((float) this.entity.getY());
                        this.z = (double) ((float) this.entity.getZ());
                    } else {
                        this.stop();
                    }
                } else {
                    this.stop();
                }
            } else if (player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof PortableJukeboxItem) {
                ItemStack itemstack = PortableJukeboxItem.getRecord(player.getItemInHand(InteractionHand.OFF_HAND));
                if (itemstack.get(DataComponents.JUKEBOX_PLAYABLE) != null && JukeboxSong.fromStack(player.level().registryAccess(), itemstack).isPresent()) {
                    if (JukeboxSong.fromStack(player.level().registryAccess(), itemstack).get().value().soundEvent().value().location() == getLocation()) {
                        this.x = (double) ((float) this.entity.getX());
                        this.y = (double) ((float) this.entity.getY());
                        this.z = (double) ((float) this.entity.getZ());
                    } else {
                        this.stop();
                    }
                } else {
                    this.stop();
                }
            } else {
                this.stop();
            }
        } else {
            this.stop();
        }
    }
}


 */