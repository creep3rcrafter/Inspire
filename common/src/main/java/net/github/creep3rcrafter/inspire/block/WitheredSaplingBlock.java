package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireConfiguredFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class WitheredSaplingBlock extends SaplingBlock {
    public static final MapCodec<WitheredSaplingBlock> CODEC = simpleCodec(WitheredSaplingBlock::new);

    public WitheredSaplingBlock(BlockBehaviour.Properties properties) {
        super(TreeGrower.OAK, properties);
    }

    @Override
    public MapCodec<WitheredSaplingBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.is(Blocks.SOUL_SOIL) || blockState.is(Blocks.BLACKSTONE) || super.mayPlaceOn(blockState, blockGetter, blockPos);
    }

    @Override
    public void advanceTree(ServerLevel serverLevel, BlockPos blockPos, BlockState blockState, RandomSource randomSource) {
        if (blockState.getValue(STAGE) == 0) {
            serverLevel.setBlock(blockPos, blockState.cycle(STAGE), 4);
            return;
        }

        Holder<ConfiguredFeature<?, ?>> configuredFeature = serverLevel.registryAccess()
                .lookupOrThrow(Registries.CONFIGURED_FEATURE)
                .getOrThrow(getConfiguredFeature(randomSource));
        serverLevel.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 4);
        if (!configuredFeature.value().place(serverLevel, serverLevel.getChunkSource().getGenerator(), randomSource, blockPos)) {
            serverLevel.setBlock(blockPos, blockState, 4);
        }
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource) {
        return switch (randomSource.nextInt(3)) {
            case 0 -> InspireConfiguredFeatures.WITHERED_BARE_TREE;
            case 1 -> InspireConfiguredFeatures.WITHERED_OAK;
            default -> InspireConfiguredFeatures.LARGE_WITHERED_OAK;
        };
    }
}
