package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.register.InspirePlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.concurrent.CompletableFuture;

public class InspireFabricPlacedFeatureTagProvider extends FabricTagProvider<PlacedFeature> {
    public static final TagKey<PlacedFeature> WITHERED_TREES = TagKey.create(
            Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "withered_trees")
    );

    public InspireFabricPlacedFeatureTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(InspireSharedDataOutput.common(output), Registries.PLACED_FEATURE, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(WITHERED_TREES)
                .add(InspirePlacedFeatures.WITHERED_BARE_TREE)
                .add(InspirePlacedFeatures.WITHERED_BARE_TREE_NETHER)
                .add(InspirePlacedFeatures.WITHERED_OAK)
                .add(InspirePlacedFeatures.WITHERED_OAK_NETHER)
                .add(InspirePlacedFeatures.LARGE_WITHERED_OAK)
                .add(InspirePlacedFeatures.LARGE_WITHERED_OAK_NETHER);
    }
}
