package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
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

public class SoulSaplingBlock extends SaplingBlock {
    public static final MapCodec<SoulSaplingBlock> CODEC = simpleCodec(SoulSaplingBlock::new);

    public SoulSaplingBlock(BlockBehaviour.Properties properties) {
        super(TreeGrower.OAK, properties);
    }

    @Override
    public MapCodec<SoulSaplingBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(InspireBlocks.SOUL_GRASS_BLOCK.get()) || state.is(Blocks.SOUL_SOIL) || state.is(Blocks.BLACKSTONE) || super.mayPlaceOn(state, level, pos);
    }

    @Override
    public void advanceTree(ServerLevel level, BlockPos pos, BlockState state, RandomSource random) {
        if (state.getValue(STAGE) == 0) {
            level.setBlock(pos, state.cycle(STAGE), 4);
            return;
        }

        Holder<ConfiguredFeature<?, ?>> configuredFeature = level.registryAccess()
                .lookupOrThrow(Registries.CONFIGURED_FEATURE)
                .getOrThrow(getConfiguredFeature(random));
        level.setBlock(pos, Blocks.AIR.defaultBlockState(), 4);
        if (!configuredFeature.value().place(level, level.getChunkSource().getGenerator(), random, pos)) {
            level.setBlock(pos, state, 4);
        }
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random) {
        return random.nextBoolean() ? InspireConfiguredFeatures.SOUL_TREE : InspireConfiguredFeatures.LARGE_SOUL_TREE;
    }
}
