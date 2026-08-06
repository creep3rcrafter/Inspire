package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public final class InspireConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_BARE_TREE = createKey("withered_bare_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_OAK = createKey("withered_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_WITHERED_OAK = createKey("large_withered_oak");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        FeatureUtils.register(context, WITHERED_BARE_TREE, Feature.TREE, witheredBareTree());
        FeatureUtils.register(context, WITHERED_OAK, Feature.TREE, witheredOak());
        FeatureUtils.register(context, LARGE_WITHERED_OAK, Feature.TREE, largeWitheredOak());
    }

    private static TreeConfiguration witheredBareTree() {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(InspireBlocks.WITHERED_LOG.get()),

                new FancyTrunkPlacer(
                        6, // base height
                        4, // random height
                        2  // extra branching
                ),

                BlockStateProvider.simple(InspireBlocks.SOUL_LEAVES.get()),

                new BlobFoliagePlacer(
                        ConstantInt.of(0),
                        ConstantInt.of(0),
                        0
                ),

                new TwoLayersFeatureSize(
                        1,
                        0,
                        1
                )
        ).dirt(BlockStateProvider.simple(Blocks.SOUL_SOIL)).ignoreVines().build();
    }

    private static TreeConfiguration witheredOak() {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(InspireBlocks.WITHERED_LOG.get()),
                new StraightTrunkPlacer(
                        5, // base_height
                        2, // height_rand_a
                        0  // height_rand_b
                ),
                BlockStateProvider.simple(InspireBlocks.SOUL_LEAVES.get()),
                new BlobFoliagePlacer(
                        ConstantInt.of(2), // radius
                        ConstantInt.of(0), // offset
                        3                  // height
                ),
                new TwoLayersFeatureSize(
                        1, // limit
                        0, // lower_size
                        1  // upper_size
                )
        ).dirt(BlockStateProvider.simple(Blocks.SOUL_SOIL)).ignoreVines().build();
    }

    private static TreeConfiguration largeWitheredOak() {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(InspireBlocks.WITHERED_LOG.get()),

                new FancyTrunkPlacer(
                        3,  // base_height
                        11, // height_rand_a
                        0   // height_rand_b
                ),

                BlockStateProvider.simple(InspireBlocks.SOUL_LEAVES.get()),

                new FancyFoliagePlacer(
                        ConstantInt.of(2), // radius
                        ConstantInt.of(4), // offset
                        4  // height
                ),

                new TwoLayersFeatureSize(
                        0, // limit
                        0, // lower_size
                        0  // upper_size
                )
        ).dirt(BlockStateProvider.simple(Blocks.SOUL_SOIL)).ignoreVines().build();
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name)
        );
    }
}
