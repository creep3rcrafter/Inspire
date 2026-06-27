package net.github.creep3rcrafter.inspire.network;

public class NowPlayingPacket {/*implements CustomPacketPayload {
    private final String songName;

    public NowPlayingPacket(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    // The codec used to serialize/deserialize this packet
    public static final StreamCodec<RegistryFriendlyByteBuf, NowPlayingPacket> CODEC =
            StreamCodec.of(
                    (buf, packet) -> buf.writeUtf(packet.getSongName()),
                    buf -> new NowPlayingPacket(buf.readUtf(32767))
            );

    // Type instance for registration (no subclassing needed)
    public static final CustomPacketPayload.Type<NowPlayingPacket> TYPE =
            //new CustomPacketPayload.Type<>(CODEC, ResourceLocation.fromNamespaceAndPath("inspire", "now_playing"));

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
    */
}
