package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.FossilFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLeavesDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

import java.util.List;

public final class InspireConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_BARE_TREE = createKey("withered_bare_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_OAK = createKey("withered_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_WITHERED_OAK = createKey("large_withered_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_TREE = createKey("soul_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SOUL_TREE = createKey("large_soul_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_GRASS_PATCH = createKey("soul_grass_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHORT_SOUL_GRASS_PATCH = createKey("short_soul_grass_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_SOUL_GRASS_PATCH = createKey("tall_soul_grass_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WITHERED_BONE_FOSSIL = createKey("withered_bone_fossil");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<StructureProcessorList> processorLists = context.lookup(Registries.PROCESSOR_LIST);
        FeatureUtils.register(context, WITHERED_BARE_TREE, Feature.TREE, witheredBareTree());
        FeatureUtils.register(context, WITHERED_OAK, Feature.TREE, witheredOak());
        FeatureUtils.register(context, LARGE_WITHERED_OAK, Feature.TREE, largeWitheredOak());
        FeatureUtils.register(context, SOUL_TREE, Feature.TREE, soulTree());
        FeatureUtils.register(context, LARGE_SOUL_TREE, Feature.TREE, largeSoulTree());
        FeatureUtils.register(context, SOUL_GRASS_PATCH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(InspireBlocks.SOUL_GRASS.get()))));
        FeatureUtils.register(context, SHORT_SOUL_GRASS_PATCH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(InspireBlocks.SHORT_SOUL_GRASS.get()))));
        FeatureUtils.register(context, TALL_SOUL_GRASS_PATCH, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(InspireBlocks.TALL_SOUL_GRASS.get()))));
        FeatureUtils.register(context, WITHERED_BONE_FOSSIL, Feature.FOSSIL, witheredBoneFossil(processorLists));
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

    private static TreeConfiguration soulTree() {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(InspireBlocks.SOUL_LOG.get()),
                new StraightTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(InspireBlocks.SOUL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).dirt(BlockStateProvider.simple(InspireBlocks.SOUL_GRASS_BLOCK.get()))
                .decorators(List.of(new AttachedToLeavesDecorator(
                        0.35f,
                        1,
                        0,
                        BlockStateProvider.simple(InspireBlocks.HANGING_SOUL_VINES.get()),
                        3,
                        List.of(Direction.DOWN)
                )))
                .ignoreVines()
                .build();
    }

    private static TreeConfiguration largeSoulTree() {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(InspireBlocks.SOUL_LOG.get()),
                new FancyTrunkPlacer(3, 11, 0),
                BlockStateProvider.simple(InspireBlocks.SOUL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(0, 0, 0)
        ).dirt(BlockStateProvider.simple(InspireBlocks.SOUL_GRASS_BLOCK.get()))
                .decorators(List.of(new AttachedToLeavesDecorator(
                        0.45f,
                        1,
                        0,
                        BlockStateProvider.simple(InspireBlocks.HANGING_SOUL_VINES.get()),
                        4,
                        List.of(Direction.DOWN)
                )))
                .ignoreVines()
                .build();
    }

    private static FossilFeatureConfiguration witheredBoneFossil(HolderGetter<StructureProcessorList> processorLists) {
        List<ResourceLocation> fossils = List.of(
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_1"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_2"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_3"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_4"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_5"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_6"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_7"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_8"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_9"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_10"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_11"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_12"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_13"),
                ResourceLocation.withDefaultNamespace("nether_fossils/fossil_14")
        );
        return new FossilFeatureConfiguration(
                fossils,
                fossils,
                processorLists.getOrThrow(InspireProcessorLists.WITHERED_BONE_FOSSIL),
                processorLists.getOrThrow(InspireProcessorLists.EMPTY),
                4
        );
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, name)
        );
    }
}
