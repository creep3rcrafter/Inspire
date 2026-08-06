package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.register.InspireBiomes;
import net.github.creep3rcrafter.inspire.register.InspireBiomeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;

import java.util.concurrent.CompletableFuture;

public class InspireFabricBiomeTagProvider extends FabricTagProvider<Biome> {
    public InspireFabricBiomeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(InspireSharedDataOutput.common(output), Registries.BIOME, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(InspireBiomeTags.HAS_WITHERED_TREES)
                .add(InspireBiomes.WITHERED_WASTES)
                .add(InspireBiomes.SOUL_FOREST);
        getOrCreateTagBuilder(BiomeTags.IS_NETHER)
                .add(InspireBiomes.WITHERED_WASTES)
                .add(InspireBiomes.SOUL_FOREST);
        getOrCreateTagBuilder(BiomeTags.HAS_NETHER_FOSSIL)
                .add(InspireBiomes.WITHERED_WASTES)
                .add(InspireBiomes.SOUL_FOREST);
    }
}
