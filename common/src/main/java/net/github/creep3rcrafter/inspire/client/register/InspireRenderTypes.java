package net.github.creep3rcrafter.inspire.client.register;

import com.github.creep3rcrafter.inspire.register.InspireBlocks;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.minecraft.client.render.RenderLayer;

public class InspireRenderTypes {
    static {
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.BLUESTONE_WIRE.get());
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.BLUESTONE_TORCH.get());
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.BLUESTONE_WALL_TORCH.get());
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.BLUESTONE_REPEATER.get());
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.BLUESTONE_COMPARATOR.get());
        RenderTypeRegistry.register(RenderLayer.getCutout(), InspireBlocks.HYDRO_FIRE.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(), InspireBlocks.THIN_ICE.get());
    }
}
