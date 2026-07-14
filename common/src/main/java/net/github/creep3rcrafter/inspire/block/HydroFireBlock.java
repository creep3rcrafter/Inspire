package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.portal.PortalShape;
import org.jetbrains.annotations.Nullable;

public class HydroFireBlock extends BaseFireBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }

    public HydroFireBlock(Properties settings) {
        super(settings, 3f);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    public static boolean isPrismarineBase(BlockState state) {
        return state.isOf(Blocks.PRISMARINE);
    }

    public static boolean canPlaceAt(Level world, BlockPos pos, Direction direction) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.isAir()) {
            return false;
        } else {
            return getState(world, pos).canSurvive(world, pos) || shouldLightPortalAt(world, pos, direction);
        }
    }

    public static BlockState getState(BlockGetter world, BlockPos pos) {
        BlockPos blockPos = pos.below();
        BlockState blockState = world.getBlockState(blockPos);
        return InspireBlocks.HYDRO_FIRE.get().defaultBlockState().setValue(WATERLOGGED, world.getFluidState(pos).getType() == Fluids.WATER);
    }

    private static boolean shouldLightPortalAt(Level world, BlockPos pos, Direction direction) {
        if (!isOverworldOrNether(world)) {
            return false;
        } else {
            BlockPos.MutableBlockPos mutable = pos.mutable();
            boolean bl = false;

            for (Direction direction2 : Direction.values()) {
                if (world.getBlockState(mutable.set(pos).move(direction2)).is(Blocks.OBSIDIAN)) {
                    bl = true;
                    break;
                }
            }

            if (!bl) {
                return false;
            } else {
                Direction.Axis axis = direction.getAxis().isHorizontal() ? direction.getCounterClockWise().getAxis() : (world.random.nextBoolean() ? Direction.Axis.X : Direction.Axis.Z);
                return PortalShape.findEmptyPortalShape(world, pos, axis).isPresent();
            }
        }
    }

    private static boolean isOverworldOrNether(Level world) {
        ResourceKey<Level> dimension = world.dimension();
        return dimension == Level.OVERWORLD || dimension == Level.NETHER;
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
    protected boolean isFlammable(BlockState state) {
        return true;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(WATERLOGGED));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        return this.canSurvive(state, world, pos) ? this.defaultBlockState().setValue(WATERLOGGED, world.getFluidState(pos).getType() == Fluids.WATER) : Blocks.AIR.defaultBlockState();
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return isPrismarineBase(world.getBlockState(pos.below())) && world.getFluidState(pos).is(Fluids.WATER);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (random.nextInt(10) == 0) {
            world.playLocalSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, SoundEvents.FIRE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
        }

        BlockPos blockPos = pos.below();
        BlockState blockState = world.getBlockState(blockPos);
        if (!this.isFlammable(blockState) && !blockState.isFaceSturdy(world, blockPos, Direction.UP)) {
            if (this.isFlammable(world.getBlockState(pos.west()))) {
                for (int i = 0; i < 2; ++i) {
                    double d = (double) pos.getX() + random.nextDouble() * (double) 1F;
                    double e = (double) pos.getY() + random.nextDouble();
                    double f = (double) pos.getZ() + random.nextDouble();
                    world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
                }
            }

            if (this.isFlammable(world.getBlockState(pos.east()))) {
                for (int i = 0; i < 2; ++i) {
                    double d = (double) (pos.getX() + 1) - random.nextDouble() * (double) 1F;
                    double e = (double) pos.getY() + random.nextDouble();
                    double f = (double) pos.getZ() + random.nextDouble();
                    world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
                }
            }

            if (this.isFlammable(world.getBlockState(pos.north()))) {
                for (int i = 0; i < 2; ++i) {
                    double d = (double) pos.getX() + random.nextDouble();
                    double e = (double) pos.getY() + random.nextDouble();
                    double f = (double) pos.getZ() + random.nextDouble() * (double) 1F;
                    world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
                }
            }

            if (this.isFlammable(world.getBlockState(pos.south()))) {
                for (int i = 0; i < 2; ++i) {
                    double d = (double) pos.getX() + random.nextDouble();
                    double e = (double) pos.getY() + random.nextDouble();
                    double f = (double) (pos.getZ() + 1) - random.nextDouble() * (double) 1F;
                    world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
                }
            }

            if (this.isFlammable(world.getBlockState(pos.above()))) {
                for (int i = 0; i < 2; ++i) {
                    double d = (double) pos.getX() + random.nextDouble();
                    double e = (double) (pos.getY() + 1) - random.nextDouble() * (double) 1F;
                    double f = (double) pos.getZ() + random.nextDouble();
                    world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
                }
            }
        } else {
            for (int i = 0; i < 3; ++i) {
                double d = (double) pos.getX() + random.nextDouble();
                double e = (double) pos.getY() + random.nextDouble() * (double) 1F + (double) 1F;
                double f = (double) pos.getZ() + random.nextDouble();
                world.addParticle(ParticleTypes.BUBBLE, d, e, f, (double) 0.0F, (double) 2.0F, (double) 0.0F);
            }
        }

    }
}
