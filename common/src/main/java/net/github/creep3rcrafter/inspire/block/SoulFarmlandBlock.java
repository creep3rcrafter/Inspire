package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.InspireFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.piston.MovingPistonBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class SoulFarmlandBlock extends Block {
    public static final IntegerProperty MOISTURE;
    protected static final VoxelShape SHAPE;

    static {
        MOISTURE = BlockStateProperties.MOISTURE;
        SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 15.0F, 16.0F);
    }

    public SoulFarmlandBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(MOISTURE, 0));
    }

    public static void turnToSoulSoil(BlockState blockState, Level level, BlockPos blockPos) {
        level.setBlockAndUpdate(blockPos, pushEntitiesUp(blockState, Blocks.SOUL_SOIL.defaultBlockState(), level, blockPos));
    }

    private static boolean isUnderCrops(BlockGetter blockGetter, BlockPos blockPos) {
        Block block = blockGetter.getBlockState(blockPos.above()).getBlock();
        return block instanceof CropBlock || block instanceof StemBlock || block instanceof AttachedStemBlock;
    }

    private static boolean isNearSoulFluid(LevelReader levelReader, BlockPos blockPos) {
        for (BlockPos blockPos2 : BlockPos.betweenClosed(blockPos.offset(-4, 0, -4), blockPos.offset(4, 1, 4))) {
            if (levelReader.getFluidState(blockPos2).is(InspireFluids.SOUL_FLUID.get()) || levelReader.getFluidState(blockPos2).is(InspireFluids.SOUL_FLUID.get())) {
                return true;
            }
        }

        return false;
    }

    public @NotNull BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        if (direction == Direction.UP && !blockState.canSurvive(levelAccessor, blockPos)) {
            levelAccessor.scheduleTick(blockPos, this, 1);
        }

        return super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        BlockState blockState2 = levelReader.getBlockState(blockPos.above());
        return !blockState2.isSolid() || blockState2.getBlock() instanceof FenceGateBlock || blockState2.getBlock() instanceof MovingPistonBlock;
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return !this.defaultBlockState().canSurvive(blockPlaceContext.getLevel(), blockPlaceContext.getClickedPos()) ? Blocks.SOUL_SOIL.defaultBlockState() : super.getStateForPlacement(blockPlaceContext);
    }

    public boolean useShapeForLightOcclusion(BlockState blockState) {
        return true;
    }

    public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (!blockState.canSurvive(serverLevel, blockPos)) {
            turnToSoulSoil(blockState, serverLevel, blockPos);
        }

    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        int i = blockState.getValue(MOISTURE);
        if (!isNearSoulFluid(serverLevel, blockPos) && !serverLevel.isRainingAt(blockPos.above())) {
            if (i > 0) {
                serverLevel.setBlock(blockPos, blockState.setValue(MOISTURE, i - 1), 2);
            } else if (!isUnderCrops(serverLevel, blockPos)) {
                turnToSoulSoil(blockState, serverLevel, blockPos);
            }
        } else if (i < 7) {
            serverLevel.setBlock(blockPos, blockState.setValue(MOISTURE, 7), 2);
        }

    }

    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float f) {
        if (!level.isClientSide && level.random.nextFloat() < f - 0.5F && entity instanceof LivingEntity && (entity instanceof Player || level.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) && entity.getBbWidth() * entity.getBbWidth() * entity.getBbHeight() > 0.512F) {
            turnToSoulSoil(blockState, level, blockPos);
        }

        super.fallOn(level, blockState, blockPos, entity, f);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(MOISTURE);
    }

    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, PathComputationType pathComputationType) {
        return false;
    }
}
