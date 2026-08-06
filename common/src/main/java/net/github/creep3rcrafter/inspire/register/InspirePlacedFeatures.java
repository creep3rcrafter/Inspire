package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;

import java.util.List;

public final class InspirePlacedFeatures {
    public static final ResourceKey<PlacedFeature> WITHERED_BARE_TREE = createKey("withered_bare_tree");
    public static final ResourceKey<PlacedFeature> WITHERED_BARE_TREE_NETHER = createKey("withered_bare_tree_nether");
    public static final ResourceKey<PlacedFeature> WITHERED_OAK = createKey("withered_oak");
    public static final ResourceKey<PlacedFeature> WITHERED_OAK_NETHER = createKey("withered_oak_nether");
    public static final ResourceKey<PlacedFeature> LARGE_WITHERED_OAK = createKey("large_withered_oak");
    public static final ResourceKey<PlacedFeature> LARGE_WITHERED_OAK_NETHER = createKey("large_withered_oak_nether");

    private InspirePlacedFeatures() {
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        context.register(
                WITHERED_BARE_TREE,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.WITHERED_BARE_TREE),
                        treePlacement(RarityFilter.onAverageOnceEvery(12))
                )
        );
        context.register(
                WITHERED_BARE_TREE_NETHER,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.WITHERED_BARE_TREE),
                        netherTreePlacement(2)
                )
        );
        context.register(
                WITHERED_OAK,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.WITHERED_OAK),
                        treePlacement(CountPlacement.of(2))
                )
        );
        context.register(
                WITHERED_OAK_NETHER,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.WITHERED_OAK),
                        netherTreePlacement(5)
                )
        );
        context.register(
                LARGE_WITHERED_OAK,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.LARGE_WITHERED_OAK),
                        treePlacement(RarityFilter.onAverageOnceEvery(18))
                )
        );
        context.register(
                LARGE_WITHERED_OAK_NETHER,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.LARGE_WITHERED_OAK),
                        netherTreePlacement(2)
                )
        );
    }

    private static List<PlacementModifier> treePlacement(PlacementModifier countModifier) {
        return List.of(
                countModifier,
                InSquarePlacement.spread(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                PlacementUtils.filteredByBlockSurvival(InspireBlocks.WITHERED_SAPLING.get()),
                BiomeFilter.biome()
        );
    }

    private static List<PlacementModifier> netherTreePlacement(int count) {
        return List.of(
                CountOnEveryLayerPlacement.of(count),
                PlacementUtils.filteredByBlockSurvival(InspireBlocks.WITHERED_SAPLING.get()),
                BiomeFilter.biome()
        );
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(
                Registries.PLACED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name)
        );
    }
}
