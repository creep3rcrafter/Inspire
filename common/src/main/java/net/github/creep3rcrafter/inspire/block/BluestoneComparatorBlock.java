package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComparatorBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class BluestoneComparatorBlock extends ComparatorBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }

    public BluestoneComparatorBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        BlockState blockState = super.getStateForPlacement(ctx);
        if (blockState != null) {
            return blockState.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        } else {
            return super.getStateForPlacement(ctx);
        }
    }

    @Override
    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(WATERLOGGED));
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        BlockState blockState1 = super.updateShape(state, direction, neighborState, world, pos, neighborPos);
        if (blockState1 == Blocks.AIR.defaultBlockState() && state.getValue(WATERLOGGED)) {
            return Blocks.WATER.defaultBlockState();
        } else if (blockState1 == Blocks.AIR.defaultBlockState() && !state.getValue(WATERLOGGED)) {
            return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
        } else {
            return super.updateShape(state, direction, neighborState, world, pos, neighborPos).setValue(WATERLOGGED, world.getFluidState(pos).getType() == Fluids.WATER);
        }
    }
}
