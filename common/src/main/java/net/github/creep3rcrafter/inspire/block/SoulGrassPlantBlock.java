package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class SoulGrassPlantBlock extends TallGrassBlock {
    public static final MapCodec<TallGrassBlock> CODEC = simpleCodec(SoulGrassPlantBlock::new);

    public SoulGrassPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<TallGrassBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(InspireBlocks.SOUL_GRASS_BLOCK.get()) || state.is(Blocks.SOUL_SOIL) || super.mayPlaceOn(state, level, pos);
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        if (level.isEmptyBlock(pos.above()) && InspireBlocks.TALL_SOUL_GRASS.get().defaultBlockState().canSurvive(level, pos)) {
            DoublePlantBlock.placeAt(level, InspireBlocks.TALL_SOUL_GRASS.get().defaultBlockState(), pos, 2);
        }
    }
}
