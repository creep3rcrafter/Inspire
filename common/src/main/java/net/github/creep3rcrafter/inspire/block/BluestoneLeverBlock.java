package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

@SuppressWarnings("deprecation")
public class BluestoneLeverBlock extends LeverBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;
    private static final Vector3f COLOR;

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        COLOR = new Vector3f(0.1F, 0.1F, 1f);
    }

    public BluestoneLeverBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    private static void spawnParticles(BlockState state, Level world, BlockPos pos, float alpha) {
        Direction direction = state.getValue(FACING).getOpposite();
        Direction direction2 = getConnectedDirection(state).getOpposite();
        double d = (double) pos.getX() + 0.5 + 0.1 * (double) direction.getStepX() + 0.2 * (double) direction2.getStepX();
        double e = (double) pos.getY() + 0.5 + 0.1 * (double) direction.getStepY() + 0.2 * (double) direction2.getStepY();
        double g = (double) pos.getZ() + 0.5 + 0.1 * (double) direction.getStepZ() + 0.2 * (double) direction2.getStepZ();
        if (state.getValue(WATERLOGGED)) {
            world.addParticle(new DustParticleOptions(COLOR, alpha), d, e, g, 0.0, 0.0, 0.0);
        } else {
            world.addParticle(new DustParticleOptions(DustParticleOptions.REDSTONE_PARTICLE_COLOR, alpha), d, e, g, 0.0, 0.0, 0.0);
        }
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

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (state.getValue(POWERED) && random.nextFloat() < 0.25F) {
            spawnParticles(state, world, pos, 0.5F);
        }
    }

    @Override
    public @NotNull InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (world.isClientSide) {
            BlockState state2 = state.cycle(POWERED);
            if (state2.getValue(POWERED)) {
                spawnParticles(state2, world, pos, 1.0F);
            }
            return InteractionResult.SUCCESS;
        } else {
            return super.useWithoutItem(state, world, pos, player, hit);
        }
    }
}
