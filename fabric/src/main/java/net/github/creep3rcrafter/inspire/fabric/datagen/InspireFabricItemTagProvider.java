package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class InspireFabricItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public InspireFabricItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, registriesFuture, blockTagProvider);
    }

    public InspireFabricItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateRawBuilder(InspireCommon.MUSIC_DISCS);
        List<Item> items = new ArrayList<>();
        for (Item item : BuiltInRegistries.ITEM) {
            if (item.components().get(DataComponents.JUKEBOX_PLAYABLE) != null){
                items.add(item);
            }
        }
        for (Item item : items) {
            builder(InspireCommon.MUSIC_DISCS).add(ResourceKey.create(Registries.ITEM, BuiltInRegistries.ITEM.getKey(item)));
        }
    }
}
