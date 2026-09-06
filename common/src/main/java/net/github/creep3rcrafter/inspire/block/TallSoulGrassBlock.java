package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class TallSoulGrassBlock extends DoublePlantBlock {
    public static final MapCodec<TallSoulGrassBlock> CODEC = simpleCodec(TallSoulGrassBlock::new);

    public TallSoulGrassBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<TallSoulGrassBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(InspireBlocks.SOUL_GRASS_BLOCK.get()) || state.is(Blocks.SOUL_SOIL) || super.mayPlaceOn(state, level, pos);
    }
}
