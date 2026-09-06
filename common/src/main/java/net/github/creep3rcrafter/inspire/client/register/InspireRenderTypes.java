package net.github.creep3rcrafter.inspire.client.register;

import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.Fluids;

public class InspireRenderTypes {
    static {
        RenderTypeRegistry.register(RenderType.translucent(), InspireBlocks.THIN_ICE.get());
        RenderTypeRegistry.register(RenderType.translucent(), InspireBlocks.SOUL_GLASS.get());
        RenderTypeRegistry.register(RenderType.translucent(), Fluids.LAVA);//performance hit oof
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_WIRE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_TORCH.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_WALL_TORCH.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_REPEATER.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BLUESTONE_COMPARATOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.HYDRO_FIRE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.ICICLE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WARPED_NYLIUM_SHELF.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.CRIMSON_NYLIUM_SHELF.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.ICICLE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.FILTER.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_DOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_TRAPDOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.WITHERED_SAPLING.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.POTTED_WITHERED_SAPLING.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SOUL_DOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SOUL_TRAPDOOR.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SOUL_SAPLING.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.POTTED_SOUL_SAPLING.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SOUL_GRASS.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SHORT_SOUL_GRASS.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.TALL_SOUL_GRASS.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.HANGING_SOUL_VINES.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.HANGING_SOUL_VINES_PLANT.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.POTTED_DANDELION_PUFF.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.DANDELION_PUFF.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.OAK_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.SPRUCE_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.BIRCH_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.JUNGLE_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.ACACIA_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.DARK_OAK_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.MANGROVE_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.CHERRY_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.AZALEA_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutout(), InspireBlocks.FLOWERING_AZALEA_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), InspireBlocks.SOUL_LEAVES.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), InspireBlocks.SOUL_HEDGE.get());
        RenderTypeRegistry.register(RenderType.cutoutMipped(), InspireBlocks.PALE_OAK_HEDGE.get());
    }
}
