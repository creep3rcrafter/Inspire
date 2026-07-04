package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.Fluids;

public class InspireRenderTypes {
    static {
        RenderTypeRegistry.register(RenderType.translucent(), Fluids.LAVA);//performance hit oof
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.FILTER.get());
        RenderTypeRegistry.register(RenderType.translucent(), InspireBlocks.SOUL_GLASS.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_WIRE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_TORCH.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_WALL_TORCH.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_REPEATER.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_COMPARATOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_DOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_TRAPDOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_SAPLING.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.POTTED_WITHERED_SAPLING.get());
    }
}
