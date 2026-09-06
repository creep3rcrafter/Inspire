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
    public static final ResourceKey<PlacedFeature> SOUL_TREE_NETHER = createKey("soul_tree_nether");
    public static final ResourceKey<PlacedFeature> LARGE_SOUL_TREE_NETHER = createKey("large_soul_tree_nether");
    public static final ResourceKey<PlacedFeature> SOUL_GRASS_PATCH = createKey("soul_grass_patch");
    public static final ResourceKey<PlacedFeature> SHORT_SOUL_GRASS_PATCH = createKey("short_soul_grass_patch");
    public static final ResourceKey<PlacedFeature> TALL_SOUL_GRASS_PATCH = createKey("tall_soul_grass_patch");
    public static final ResourceKey<PlacedFeature> WITHERED_BONE_FOSSIL = createKey("withered_bone_fossil");

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
        context.register(
                SOUL_TREE_NETHER,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.SOUL_TREE),
                        netherTreePlacement(4, InspireBlocks.SOUL_SAPLING.get())
                )
        );
        context.register(
                LARGE_SOUL_TREE_NETHER,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.LARGE_SOUL_TREE),
                        netherTreePlacement(2, InspireBlocks.SOUL_SAPLING.get())
                )
        );
        context.register(
                SOUL_GRASS_PATCH,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.SOUL_GRASS_PATCH),
                        netherVegetationPlacement(6, InspireBlocks.SOUL_GRASS.get())
                )
        );
        context.register(
                SHORT_SOUL_GRASS_PATCH,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.SHORT_SOUL_GRASS_PATCH),
                        netherVegetationPlacement(4, InspireBlocks.SHORT_SOUL_GRASS.get())
                )
        );
        context.register(
                TALL_SOUL_GRASS_PATCH,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.TALL_SOUL_GRASS_PATCH),
                        netherVegetationPlacement(2, InspireBlocks.TALL_SOUL_GRASS.get())
                )
        );
        context.register(
                WITHERED_BONE_FOSSIL,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(InspireConfiguredFeatures.WITHERED_BONE_FOSSIL),
                        List.of(
                                CountOnEveryLayerPlacement.of(1),
                                BiomeFilter.biome()
                        )
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
        return netherTreePlacement(count, InspireBlocks.WITHERED_SAPLING.get());
    }

    private static List<PlacementModifier> netherTreePlacement(int count, net.minecraft.world.level.block.Block sapling) {
        return List.of(
                CountOnEveryLayerPlacement.of(count),
                PlacementUtils.filteredByBlockSurvival(sapling),
                BiomeFilter.biome()
        );
    }

    private static List<PlacementModifier> netherVegetationPlacement(int count, net.minecraft.world.level.block.Block block) {
        return List.of(
                CountOnEveryLayerPlacement.of(count),
                PlacementUtils.filteredByBlockSurvival(block),
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
