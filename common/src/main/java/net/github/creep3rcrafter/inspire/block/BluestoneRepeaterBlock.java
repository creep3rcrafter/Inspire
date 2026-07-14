package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RepeaterBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

@SuppressWarnings("deprecation")
public class BluestoneRepeaterBlock extends RepeaterBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;
    private static final Vector3f COLOR;

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        COLOR = new Vector3f(0.1F, 0.1F, 1f);
    }

    public BluestoneRepeaterBlock(Properties settings) {
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
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos).setValue(WATERLOGGED, world.getFluidState(pos).getType() == Fluids.WATER);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (state.getValue(POWERED)) {
            Direction direction = state.getValue(FACING);
            double d = (double) pos.getX() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double e = (double) pos.getY() + 0.4 + (random.nextDouble() - 0.5) * 0.2;
            double f = (double) pos.getZ() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            float g = -5.0F;
            if (random.nextBoolean()) {
                g = (float) (state.getValue(DELAY) * 2 - 1);
            }

            g /= 16.0F;
            double h = g * direction.getStepX();
            double i = g * direction.getStepZ();
            world.addParticle(new DustParticleOptions(COLOR, 1.0f), d + h, e, f + i, 0.0, 0.0, 0.0);
        }
    }
}