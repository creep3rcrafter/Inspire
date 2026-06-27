package net.github.creep3rcrafter.inspire;

import net.github.creep3rcrafter.inspire.network.InspireNetworking;
import net.github.creep3rcrafter.inspire.register.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


//@SuppressWarnings("deprecation")
public final class InspireCommon {
    public static final String MOD_ID = "inspire";
    public static final TagKey<Item> MUSIC_DISCS = TagKey.create(Registries.ITEM,  ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "music_discs"));
    public static final ResourceLocation PACKET = ResourceLocation.fromNamespaceAndPath(MOD_ID, "packet");
    public static void init() {
        new InspireJukeBoxSongs();
        new InspireNetworking();
        InspireSoundEvents.SOUND_EVENTS.register();
        InspireDataComponents.DATA_COMPONENT_TYPES.register();
        InspireBlocks.BLOCKS.register();
        InspireBlockEntityTypes.BLOCK_ENTITY_TYPES.register();
        InspireItems.ITEMS.register();
        InspireEffects.EFFECTS.register();
        //ShulkerBoxBlock
        //BlockFamilies
    }
}


