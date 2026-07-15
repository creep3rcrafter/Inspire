package net.github.creep3rcrafter.inspire.client;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import it.unimi.dsi.fastutil.ints.Int2LongMap;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import net.github.creep3rcrafter.inspire.client.register.InspireColors;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.client.register.InspireRenderTypes;
import net.github.creep3rcrafter.inspire.network.InspireNetworking;
import net.github.creep3rcrafter.inspire.client.renderer.RegularBedRenderer;
import net.github.creep3rcrafter.inspire.item.PortableJukeboxItem;
import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
// ChunkSectionLayer import removed - not available in 1.21.1
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class InspireCommonClient {
    public static final Int2LongMap LAST_PARTICLE = new Int2LongOpenHashMap();
    public static void init(){
        // ChunkSectionLayer.CUTOUT and TRANSLUCENT not available in 1.21.1
        // RenderTypeRegistry.register(ChunkSectionLayer.CUTOUT, InspireBlocks.WARPED_NYLIUM_SHELF.get());
        // RenderTypeRegistry.register(ChunkSectionLayer.CUTOUT, InspireBlocks.CRIMSON_NYLIUM_SHELF.get());
        // RenderTypeRegistry.register(ChunkSectionLayer.TRANSLUCENT, InspireBlocks.TINTED_GLASS_PANE.get());
        // RenderTypeRegistry.register(ChunkSectionLayer.TRANSLUCENT, InspireBlocks.ICICLE.get());
        // BlockEntityType registration disabled due to 1.21.1 API changes
        // BlockEntityRendererRegistry.register(InspireBlockEntityTypes.BED.get(), RegularBedRenderer::new);
        /*
        ClientTickEvent.CLIENT_POST.register(client -> {
            if (client.level == null) return;
            Player player = client.player;
            if (player == null) return;
            if (PortableJukeboxItem.CURRENT_SOUND == null) return;
            if (!client.getSoundManager().isActive(PortableJukeboxItem.CURRENT_SOUND)) return;
            InteractionHand activeHand = null;
            ItemStack main = player.getMainHandItem();
            ItemStack off = player.getOffhandItem();
            if (main.getItem() instanceof PortableJukeboxItem)
                activeHand = InteractionHand.MAIN_HAND;
            else if (off.getItem() instanceof PortableJukeboxItem)
                activeHand = InteractionHand.OFF_HAND;
            else
                return;
            long now = System.currentTimeMillis();
            if (now - PortableJukeboxItem.LAST_PARTICLE_TIME < 1000) return;
            PortableJukeboxItem.LAST_PARTICLE_TIME = now;
            PortableJukeboxItem.spawnMusicParticles(player, activeHand);
        });
        ClientTickEvent.CLIENT_POST.register(client -> {
            if (client.level == null) return;
            for (int id : ACTIVE_JUKEBOX_PLAYERS) {
                Entity e = client.level.getEntity(id);
                if (e instanceof Player player) {
                    PortableJukeboxItem.spawnMusicParticles(player, InteractionHand.MAIN_HAND);
                }
            }
        });//kinda worked
        ClientTickEvent.CLIENT_POST.register(client -> {
            if (client.level == null) return;

            long now = System.currentTimeMillis();

            for (int id : ACTIVE_JUKEBOX_PLAYERS) {
                Entity e = client.level.getEntity(id);

                if (!(e instanceof Player player)) continue;

                InteractionHand hand = PLAYING_HAND.getOrDefault(id, InteractionHand.MAIN_HAND);

                long last = LAST_PARTICLE_TIME.getOrDefault(id, 0L);

                if (now - last >= 1000) {
                    PortableJukeboxItem.spawnMusicParticles(player, hand);
                    LAST_PARTICLE_TIME.put(id, now);
                }
            }
        });
         */
        ClientTickEvent.CLIENT_POST.register(client -> {
            new InspireRenderTypes();
            new InspireColors();
            if (client.level == null) return;

            long now = System.currentTimeMillis();

            for (int playerId : InspireNetworking.CLIENT_ACTIVE_JUKEBOX_HAND.keySet()) {
                Entity entity = client.level.getEntity(playerId);
                if (entity instanceof Player player){
                    InteractionHand hand = InspireNetworking.CLIENT_ACTIVE_JUKEBOX_HAND.getOrDefault(playerId, InteractionHand.MAIN_HAND);

                    long last = LAST_PARTICLE.getOrDefault(playerId, 0);
                    if (now - last >= 1000) {
                        PortableJukeboxItem.spawnMusicParticles(player, hand);
                        LAST_PARTICLE.put(playerId, now);
                    }
                }
            }
        });
    }
}
