package net.github.creep3rcrafter.inspire.block;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import org.joml.Vector3f;

@SuppressWarnings({"unused"})
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
    public @NotNull BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        BlockState updated = super.updateShape(state, direction, neighborState, level, pos, neighborPos);
        if (updated.isAir()) {
            return state.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : updated;
        }
        return updated.setValue(WATERLOGGED, state.getValue(WATERLOGGED));
    }


    private void spawnParticlesAlongLine(Level level, RandomSource random, BlockPos pos, Vec3 color, Direction dir1, Direction dir2, float minOffset, float maxOffset) {
        float spread = maxOffset - minOffset;
        if (random.nextFloat() < 0.2F) {
            float f = minOffset + spread * random.nextFloat();
            double x = pos.getX() + 0.5 + 0.4375 * dir1.getStepX() + f * dir2.getStepX();
            double y = pos.getY() + 0.0625 + f * dir2.getStepY();
            double z = pos.getZ() + 0.5 + 0.4375 * dir1.getStepZ() + f * dir2.getStepZ();
            level.addParticle(new DustParticleOptions(new Vector3f((float) color.x(), (float) color.y(), (float) color.z()), 1.0F), x, y, z, 0.0, 0.0, 0.0);
        }
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
    @Override
    protected boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }
    @Override
    public @NotNull BlockState getConnectionState(BlockGetter blockGetter, BlockState blockState, BlockPos blockPos) {
        BlockState result = super.getConnectionState(blockGetter, blockState, blockPos);
        return result.setValue(WATERLOGGED, blockState.getValue(WATERLOGGED));
    }
}
