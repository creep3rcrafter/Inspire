package net.github.creep3rcrafter.inspire.network;

import dev.architectury.networking.NetworkManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.InspireCommonClient;
import net.github.creep3rcrafter.inspire.sound.EntityTrackingHoldingSoundInstance;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class InspireNetworking {
    public static final Int2ObjectMap<InteractionHand> SERVER_LAST_HAND = new Int2ObjectOpenHashMap<>();

    static {
        /*
        NetworkManager.registerReceiver(NetworkManager.Side.S2C, JukeboxSongPayload.TYPE, JukeboxSongPayload.CODEC, (payload, context) -> {
            Minecraft.getInstance().execute(() -> {
                Holder<JukeboxSong> songHolder = payload.song();
                JukeboxSong jukeboxSong = songHolder.value();
                EntityTrackingHoldingSoundInstance sound = new EntityTrackingHoldingSoundInstance(
                        jukeboxSong.soundEvent().value(),
                        SoundSource.RECORDS,
                        1f,
                        1f,
                        Minecraft.getInstance().player,
                        Minecraft.getInstance().player.getRandom().nextLong()
                );
                Minecraft.getInstance().getSoundManager().queueTickingSound(sound);
                Minecraft.getInstance().gui.setNowPlaying(jukeboxSong.description());
                Minecraft.getInstance().getToastManager().showNowPlayingToast();
            });
        });//tooltip works but no sound on other player
        NetworkManager.registerReceiver(NetworkManager.Side.S2C,
                JukeboxSongPayload.TYPE,
                JukeboxSongPayload.CODEC,
                (payload, context) -> {
                    Minecraft.getInstance().execute(() -> {
                        Minecraft mc = Minecraft.getInstance();
                        Level level = mc.level;

                        if (level == null) return;

                        Entity e = level.getEntity(payload.playerId());
                        if (!(e instanceof LivingEntity living)) return;

                        Holder<JukeboxSong> songHolder = payload.song();
                        JukeboxSong song = songHolder.value();

                        EntityTrackingHoldingSoundInstance sound =
                                new EntityTrackingHoldingSoundInstance(
                                        song.soundEvent().value(),
                                        SoundSource.RECORDS,
                                        1f,
                                        1f,
                                        living,  // ✔️ CORRECT ENTITY
                                        living.getRandom().nextLong()
                                );

                        mc.getSoundManager().queueTickingSound(sound);
                        mc.gui.setNowPlaying(song.description());
                        mc.getToastManager().showNowPlayingToast();
                    });
                });//works othet than particles

         */
        NetworkManager.registerReceiver(
                NetworkManager.Side.S2C,
                JukeboxSongPayload.TYPE,
                JukeboxSongPayload.CODEC,
                (payload, context) -> {
                    Minecraft.getInstance().execute(() -> {
                        Minecraft mc = Minecraft.getInstance();
                        Level level = mc.level;
                        if (level == null) return;
                        int id = payload.playerId();
                        Entity entity = level.getEntity(id);
                        if (!(entity instanceof LivingEntity living)) return;
                        // TRACK THIS PLAYER AS "PLAYING A SONG"
                        InspireCommonClient.ACTIVE_JUKEBOX_PLAYERS.add(id);
                        InspireCommonClient.PLAYING_HAND.put(id, payload.hand());
                        JukeboxSong song = payload.song().value();
                        EntityTrackingHoldingSoundInstance sound =
                                new EntityTrackingHoldingSoundInstance(
                                        song.soundEvent().value(),
                                        SoundSource.RECORDS,
                                        1f,
                                        1f,
                                        living,
                                        living.getRandom().nextLong()
                                );
                        mc.getSoundManager().queueTickingSound(sound);
                        mc.gui.setNowPlaying(song.description());
                        mc.getToastManager().showNowPlayingToast();
                    });
                }
        );
        NetworkManager.registerReceiver(NetworkManager.Side.S2C, JukeboxSongStopPayload.TYPE, JukeboxSongStopPayload.CODEC, (payload, context) -> {
            Minecraft.getInstance().execute(() -> {
                Holder<SoundEvent> songHolder = payload.song();
                int id = payload.playerId();
                InspireCommonClient.ACTIVE_JUKEBOX_PLAYERS.remove(id);
                Minecraft.getInstance().getSoundManager().stop(songHolder.value().location(), SoundSource.RECORDS);
            });
        });
    }
    public static void sendJukeboxSongTo(Player player, Holder<JukeboxSong> jukeboxSongHolder, InteractionHand interactionHand) {
        JukeboxSongPayload payload = new JukeboxSongPayload(player.getId(), jukeboxSongHolder, interactionHand);

        NetworkManager.sendToPlayer(
                (ServerPlayer) player,
                payload
        );
    }
    public static void sendJukeboxSongAround(ServerLevel serverLevel, Player player, Holder<JukeboxSong> jukeboxSongHolder, InteractionHand interactionHand, double radius) {
        JukeboxSongPayload payload = new JukeboxSongPayload(player.getId(), jukeboxSongHolder, interactionHand);
        List<ServerPlayer> nearby = serverLevel.getEntitiesOfClass(
                ServerPlayer.class,
                player.getBoundingBox().inflate(radius)
        );
        NetworkManager.sendToPlayers(
                nearby,
                payload
        );
    }
    public static void sendJukeboxStopSongTo(Player player, Holder<SoundEvent> soundEventHolder) {
        JukeboxSongStopPayload payload = new JukeboxSongStopPayload(player.getId(), soundEventHolder);
        NetworkManager.sendToPlayer(
                (ServerPlayer) player,
                payload
        );
    }
    public static void sendJukeboxStopSongAround(ServerLevel serverLevel, Player player, Holder<SoundEvent> soundEventHolder, double radius) {
        JukeboxSongStopPayload payload = new JukeboxSongStopPayload(player.getId(), soundEventHolder);
        List<ServerPlayer> nearby = serverLevel.getEntitiesOfClass(
                ServerPlayer.class,
                player.getBoundingBox().inflate(radius)
        );
        NetworkManager.sendToPlayers(
                nearby,
                payload
        );
    }
    public record JukeboxSongPayload(int playerId,
                                     Holder<JukeboxSong> song,
                                     InteractionHand hand)
            implements CustomPacketPayload {

        public static final Type<JukeboxSongPayload> TYPE =
                new Type<>(ResourceLocation.fromNamespaceAndPath(
                        InspireCommon.MOD_ID, "jukebox_song"
                ));

        @Override
        public @NotNull Type<JukeboxSongPayload> type() {
            return TYPE;
        }

        // ----- CODEC -----
        public static final StreamCodec<RegistryFriendlyByteBuf, JukeboxSongPayload> CODEC =
                new StreamCodec<>() {

                    @Override
                    public JukeboxSongPayload decode(RegistryFriendlyByteBuf buf) {
                        int id = buf.readVarInt();

                        Holder<JukeboxSong> song =
                                JukeboxSong.STREAM_CODEC.decode(buf);

                        boolean isMain = buf.readBoolean();
                        InteractionHand hand =
                                isMain ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND;

                        return new JukeboxSongPayload(id, song, hand);
                    }

                    @Override
                    public void encode(RegistryFriendlyByteBuf buf, JukeboxSongPayload payload) {
                        buf.writeVarInt(payload.playerId());

                        JukeboxSong.STREAM_CODEC.encode(buf, payload.song());

                        buf.writeBoolean(payload.hand() == InteractionHand.MAIN_HAND);
                    }
                };
    }
    /*
    public record JukeboxSongPayload(Holder<JukeboxSong> song)
            implements CustomPacketPayload {

        public static final Type<JukeboxSongPayload> TYPE =
                new Type<>(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "jukebox_song"));

        @Override
        public @NotNull Type<JukeboxSongPayload> type() {
            return TYPE;
        }

        public static final StreamCodec<RegistryFriendlyByteBuf, JukeboxSongPayload> CODEC =
                StreamCodec.composite(
                        JukeboxSong.STREAM_CODEC,
                        JukeboxSongPayload::song,
                        JukeboxSongPayload::new
                );
    }

    public record JukeboxSongPayload(int playerId, Holder<JukeboxSong> song)
            implements CustomPacketPayload {

        public static final Type<JukeboxSongPayload> TYPE =
                new Type<>(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "jukebox_song"));

        @Override
        public @NotNull Type<JukeboxSongPayload> type() {
            return TYPE;
        }

        // Updated codec including playerId + song
        public static final StreamCodec<RegistryFriendlyByteBuf, JukeboxSongPayload> CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.VAR_INT,                 // encode player ID
                        JukeboxSongPayload::playerId,
                        JukeboxSong.STREAM_CODEC,              // encode the JukeboxSong holder
                        JukeboxSongPayload::song,
                        InteractionHand.STREAM_CODEC, JukeboxSongPayload::hand,
                        JukeboxSongPayload::new                // constructor
                );
    }

     */
    public record JukeboxSongStopPayload(int playerId, Holder<SoundEvent> song)
            implements CustomPacketPayload {

        public static final Type<JukeboxSongStopPayload> TYPE =
                new Type<>(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "jukebox_song_stop"));

        @Override
        public @NotNull Type<JukeboxSongStopPayload> type() {
            return TYPE;
        }

        public static final StreamCodec<RegistryFriendlyByteBuf, JukeboxSongStopPayload> CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.VAR_INT,                 // encode player ID
                        JukeboxSongStopPayload::playerId,
                        SoundEvent.STREAM_CODEC,
                        JukeboxSongStopPayload::song,
                        JukeboxSongStopPayload::new
                );
    }
    /*
    public record StopJukeboxSongPayload() implements CustomPacketPayload {

        public static final Type<StopJukeboxSongPayload> TYPE =
                new Type<>(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "stop_jukebox_song"));

        @Override
        public @NotNull Type<StopJukeboxSongPayload> type() {
            return TYPE;
        }
        public static final StreamCodec<RegistryFriendlyByteBuf, StopJukeboxSongPayload> CODEC =
                StreamCodec.of(
                        (buf, payload) -> {
                            // nothing to write, payload is empty
                        },
                        buf -> new StopJukeboxSongPayload() // reading
                );
    }
     */
}
