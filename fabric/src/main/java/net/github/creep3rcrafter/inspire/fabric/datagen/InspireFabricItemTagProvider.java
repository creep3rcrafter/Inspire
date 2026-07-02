package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class InspireFabricItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> ALL_ITEMS = TagKey.create(
            Registries.ITEM,
            ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "all_items")
    );

    public InspireFabricItemTagProvider(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture,
            FabricTagProvider.BlockTagProvider blockTagProvider
    ) {
        super(output, registriesFuture, blockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        copy(BlockTags.DOORS, ItemTags.DOORS);
        copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);

        FabricTagBuilder allItems = getOrCreateTagBuilder(ALL_ITEMS);
        BuiltInRegistries.ITEM.forEach(item -> {
            ResourceLocation key = BuiltInRegistries.ITEM.getKey(item);
            if (InspireCommon.MOD_ID.equals(key.getNamespace())) {
                allItems.add(item);
            }
        });
    }
}
