package net.github.creep3rcrafter.inspire.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.github.creep3rcrafter.inspire.client.InspireCommonClient;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.client.renderer.RenderType;

public final class InspireFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(InspireBlocks.WARPED_NYLIUM_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InspireBlocks.CRIMSON_NYLIUM_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InspireBlocks.TINTED_GLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(InspireBlocks.ICICLE.get(), RenderType.cutout());
        InspireCommonClient.init();
    }
}
