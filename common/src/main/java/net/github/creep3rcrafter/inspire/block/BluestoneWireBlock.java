package net.github.creep3rcrafter.inspire.block;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.RedstoneSide;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"deprecation", "unused"})
public class BluestoneWireBlock extends RedStoneWireBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;
    private static final Vec3[] COLORS;

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        COLORS = Util.make(new Vec3[16], (vec3s) -> {
            for (int i = 0; i <= 15; ++i) {
                float f = (float) i / 15.0F;
                float r = Mth.clamp(f * f * 0.6F - 0.7F, 0.0F, 1.0F);
                float g = Mth.clamp(f * f * 0.7F - 0.5F, 0.0F, 1.0F);
                float b = f * 0.6F + (f > 0.0F ? 0.4F : 0.3F);
                vec3s[i] = new Vec3(r, g, b);
            }
        });
    }

    public BluestoneWireBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    public static int getColorForPower(int i) {
        Vec3 vec3 = COLORS[i];
        return Mth.color((float) vec3.x(), (float) vec3.y(), (float) vec3.z());
    }

    @Override
    public @NotNull BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPlaceContext.getClickedPos());
        BlockState blockState = super.getStateForPlacement(blockPlaceContext);
        return blockState.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
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
    public @NotNull BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        if (blockState.getValue(WATERLOGGED)) {
            levelAccessor.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }
        return super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2).setValue(WATERLOGGED, levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER);
    }

    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        int i = blockState.getValue(POWER);
        if (i != 0) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                RedstoneSide redstoneSide = blockState.getValue(PROPERTY_BY_DIRECTION.get(direction));
                switch (redstoneSide) {
                    case UP:
                        this.spawnParticlesAlongLine(level, randomSource, blockPos, COLORS[i], direction, Direction.UP, -0.5F, 0.5F);
                    case SIDE:
                        this.spawnParticlesAlongLine(level, randomSource, blockPos, COLORS[i], Direction.DOWN, direction, 0.0F, 0.5F);
                        break;
                    case NONE:
                    default:
                        this.spawnParticlesAlongLine(level, randomSource, blockPos, COLORS[i], Direction.DOWN, direction, 0.0F, 0.3F);
                }
            }
        }
    }
}