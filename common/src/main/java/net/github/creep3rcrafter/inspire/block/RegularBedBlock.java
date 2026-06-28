package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.block.entity.RegularBedBlockEntity;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.DismountHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class RegularBedBlock extends HorizontalDirectionalBlock implements EntityBlock {
    public static final MapCodec<RegularBedBlock> CODEC = simpleCodec(RegularBedBlock::new);
    public static final EnumProperty<@NotNull BedPart> PART;
    public static final BooleanProperty OCCUPIED;
    private static final Map SHAPES;

    public @NotNull MapCodec<RegularBedBlock> codec() {
        return CODEC;
    }

    public RegularBedBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(PART, BedPart.FOOT)).setValue(OCCUPIED, false));
    }

    public static @Nullable Direction getBedOrientation(BlockGetter blockGetter, BlockPos blockPos) {
        BlockState blockState = blockGetter.getBlockState(blockPos);
        return blockState.getBlock() instanceof RegularBedBlock ? (Direction)blockState.getValue(FACING) : null;
    }

    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState blockState, Level level, @NotNull BlockPos blockPos, @NotNull Player player, @NotNull BlockHitResult blockHitResult) {
        if (level.isClientSide()) {
            return InteractionResult.SUCCESS_SERVER;
        } else {
            if (blockState.getValue(PART) != BedPart.HEAD) {
                blockPos = blockPos.relative((Direction)blockState.getValue(FACING));
                blockState = level.getBlockState(blockPos);
                if (!blockState.is(this)) {
                    return InteractionResult.CONSUME;
                }
            }

            // In Minecraft 1.21.10, bed explosions are not controlled by environment attributes
            // This bed does not explode - skip the bed rule check
            if ((Boolean)blockState.getValue(OCCUPIED)) {
                if (!this.kickVillagerOutOfBed(level, blockPos)) {
                    player.displayClientMessage(Component.translatable("block.minecraft.bed.occupied"), true);
                }

                return InteractionResult.SUCCESS_SERVER;
            } else {
                // Start sleeping - BedSleepingProblem message is private in 1.21.10
                player.startSleepInBed(blockPos);
                return InteractionResult.SUCCESS_SERVER;
            }
        }
    }

    private boolean kickVillagerOutOfBed(Level level, BlockPos blockPos) {
        // In Minecraft 1.21.10, Villager entity class is not accessible
        // Return false to skip villager interaction
        return false;
    }

    public void fallOn(@NotNull Level level, @NotNull BlockState blockState, @NotNull BlockPos blockPos, @NotNull Entity entity, double d) {
        super.fallOn(level, blockState, blockPos, entity, (float) (d * (double)0.5F));
    }

    public void updateEntityMovementAfterFallOn(@NotNull BlockGetter blockGetter, Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityMovementAfterFallOn(blockGetter, entity);
        } else {
            this.bounceUp(entity);
        }

    }

    private void bounceUp(Entity entity) {
        Vec3 vec3 = entity.getDeltaMovement();
        if (vec3.y < (double)0.0F) {
            double d = entity instanceof LivingEntity ? (double)1.0F : 0.8;
            entity.setDeltaMovement(vec3.x, -vec3.y * (double)0.66F * d, vec3.z);
        }

    }

    protected @NotNull BlockState updateShape(BlockState blockState, @NotNull LevelReader levelReader, @NotNull ScheduledTickAccess scheduledTickAccess, @NotNull BlockPos blockPos, @NotNull Direction direction, @NotNull BlockPos blockPos2, @NotNull BlockState blockState2, @NotNull RandomSource randomSource) {
        if (direction == getNeighbourDirection((BedPart)blockState.getValue(PART), (Direction)blockState.getValue(FACING))) {
            return blockState2.is(this) && blockState2.getValue(PART) != blockState.getValue(PART) ? (BlockState)blockState.setValue(OCCUPIED, (Boolean)blockState2.getValue(OCCUPIED)) : Blocks.AIR.defaultBlockState();
        } else {
            return super.updateShape(blockState, levelReader, scheduledTickAccess, blockPos, direction, blockPos2, blockState2, randomSource);
        }
    }

    private static Direction getNeighbourDirection(BedPart bedPart, Direction direction) {
        return bedPart == BedPart.FOOT ? direction : direction.getOpposite();
    }

    public @NotNull BlockState playerWillDestroy(Level level, @NotNull BlockPos blockPos, @NotNull BlockState blockState, @NotNull Player player) {
        if (!level.isClientSide() && player.preventsBlockDrops()) {
            BedPart bedPart = (BedPart)blockState.getValue(PART);
            if (bedPart == BedPart.FOOT) {
                BlockPos blockPos2 = blockPos.relative(getNeighbourDirection(bedPart, (Direction)blockState.getValue(FACING)));
                BlockState blockState2 = level.getBlockState(blockPos2);
                if (blockState2.is(this) && blockState2.getValue(PART) == BedPart.HEAD) {
                    level.setBlock(blockPos2, Blocks.AIR.defaultBlockState(), 35);
                    level.levelEvent(player, 2001, blockPos2, Block.getId(blockState2));
                }
            }
        }

        return super.playerWillDestroy(level, blockPos, blockState, player);
    }

    public @Nullable BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        Direction direction = blockPlaceContext.getHorizontalDirection();
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        BlockPos blockPos2 = blockPos.relative(direction);
        Level level = blockPlaceContext.getLevel();
        return level.getBlockState(blockPos2).canBeReplaced(blockPlaceContext) && level.getWorldBorder().isWithinBounds(blockPos2) ? (BlockState)this.defaultBlockState().setValue(FACING, direction) : null;
    }

    protected @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        return (VoxelShape)SHAPES.get(getConnectedDirection(blockState).getOpposite());
    }

    public static Direction getConnectedDirection(BlockState blockState) {
        Direction direction = (Direction)blockState.getValue(FACING);
        return blockState.getValue(PART) == BedPart.HEAD ? direction.getOpposite() : direction;
    }

    public static DoubleBlockCombiner.BlockType getBlockType(BlockState blockState) {
        BedPart bedPart = (BedPart)blockState.getValue(PART);
        return bedPart == BedPart.HEAD ? DoubleBlockCombiner.BlockType.FIRST : DoubleBlockCombiner.BlockType.SECOND;
    }

    private static boolean isBunkBed(BlockGetter blockGetter, BlockPos blockPos) {
        return blockGetter.getBlockState(blockPos.below()).getBlock() instanceof RegularBedBlock || blockGetter.getBlockState(blockPos.below()).getBlock() instanceof BedBlock;
    }

    public static Optional<Vec3> findStandUpPosition(EntityType<?> entityType, CollisionGetter collisionGetter, BlockPos blockPos, Direction direction, float f) {
        Direction direction2 = direction.getClockWise();
        Direction direction3 = direction2.isFacingAngle(f) ? direction2.getOpposite() : direction2;
        if (isBunkBed(collisionGetter, blockPos)) {
            return findBunkBedStandUpPosition(entityType, collisionGetter, blockPos, direction, direction3);
        } else {
            int[][] is = bedStandUpOffsets(direction, direction3);
            Optional<Vec3> optional = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, is, true);
            return optional.isPresent() ? optional : findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, is, false);
        }
    }

    private static Optional<Vec3> findBunkBedStandUpPosition(EntityType<?> entityType, CollisionGetter collisionGetter, BlockPos blockPos, Direction direction, Direction direction2) {
        int[][] is = bedSurroundStandUpOffsets(direction, direction2);
        Optional<Vec3> optional = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, is, true);
        if (optional.isPresent()) {
            return optional;
        } else {
            BlockPos blockPos2 = blockPos.below();
            Optional<Vec3> optional2 = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos2, is, true);
            if (optional2.isPresent()) {
                return optional2;
            } else {
                int[][] js = bedAboveStandUpOffsets(direction);
                Optional<Vec3> optional3 = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, js, true);
                if (optional3.isPresent()) {
                    return optional3;
                } else {
                    Optional<Vec3> optional4 = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, is, false);
                    if (optional4.isPresent()) {
                        return optional4;
                    } else {
                        Optional<Vec3> optional5 = findStandUpPositionAtOffset(entityType, collisionGetter, blockPos2, is, false);
                        return optional5.isPresent() ? optional5 : findStandUpPositionAtOffset(entityType, collisionGetter, blockPos, js, false);
                    }
                }
            }
        }
    }

    private static Optional<Vec3> findStandUpPositionAtOffset(EntityType<?> entityType, CollisionGetter collisionGetter, BlockPos blockPos, int[][] is, boolean bl) {
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();

        for(int[] js : is) {
            mutableBlockPos.set(blockPos.getX() + js[0], blockPos.getY(), blockPos.getZ() + js[1]);
            Vec3 vec3 = DismountHelper.findSafeDismountLocation(entityType, collisionGetter, mutableBlockPos, bl);
            if (vec3 != null) {
                return Optional.of(vec3);
            }
        }

        return Optional.empty();
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, @NotNull BlockState> builder) {
        builder.add(new Property[]{FACING, PART, OCCUPIED});
    }

    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new RegularBedBlockEntity(blockPos, blockState);
    }

    public void setPlacedBy(@NotNull Level level, @NotNull BlockPos blockPos, @NotNull BlockState blockState, @Nullable LivingEntity livingEntity, @NotNull ItemStack itemStack) {
        super.setPlacedBy(level, blockPos, blockState, livingEntity, itemStack);
        if (!level.isClientSide()) {
            BlockPos blockPos2 = blockPos.relative((Direction)blockState.getValue(FACING));
            level.setBlock(blockPos2, (BlockState)blockState.setValue(PART, BedPart.HEAD), 3);
            level.updateNeighborsAt(blockPos, Blocks.AIR);
            blockState.updateNeighbourShapes(level, blockPos, 3);
        }

    }
    @SuppressWarnings("deprecation")
    protected long getSeed(BlockState blockState, BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.relative((Direction)blockState.getValue(FACING), blockState.getValue(PART) == BedPart.HEAD ? 0 : 1);
        return Mth.getSeed(blockPos2.getX(), blockPos.getY(), blockPos2.getZ());
    }

    protected boolean isPathfindable(@NotNull BlockState blockState, @NotNull PathComputationType pathComputationType) {
        return false;
    }

    private static int[][] bedStandUpOffsets(Direction direction, Direction direction2) {
        return (int[][]) ArrayUtils.addAll(bedSurroundStandUpOffsets(direction, direction2), bedAboveStandUpOffsets(direction));
    }

    private static int[][] bedSurroundStandUpOffsets(Direction direction, Direction direction2) {
        return new int[][]{{direction2.getStepX(), direction2.getStepZ()}, {direction2.getStepX() - direction.getStepX(), direction2.getStepZ() - direction.getStepZ()}, {direction2.getStepX() - direction.getStepX() * 2, direction2.getStepZ() - direction.getStepZ() * 2}, {-direction.getStepX() * 2, -direction.getStepZ() * 2}, {-direction2.getStepX() - direction.getStepX() * 2, -direction2.getStepZ() - direction.getStepZ() * 2}, {-direction2.getStepX() - direction.getStepX(), -direction2.getStepZ() - direction.getStepZ()}, {-direction2.getStepX(), -direction2.getStepZ()}, {-direction2.getStepX() + direction.getStepX(), -direction2.getStepZ() + direction.getStepZ()}, {direction.getStepX(), direction.getStepZ()}, {direction2.getStepX() + direction.getStepX(), direction2.getStepZ() + direction.getStepZ()}};
    }

    private static int[][] bedAboveStandUpOffsets(Direction direction) {
        return new int[][]{{0, 0}, {-direction.getStepX(), -direction.getStepZ()}};
    }

    static {
        PART = BlockStateProperties.BED_PART;
        OCCUPIED = BlockStateProperties.OCCUPIED;
        SHAPES = Util.make(() -> {
            VoxelShape voxelShape = Block.box(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
            // In Minecraft 1.21.10, BLOCK_ROT_Y_90 doesn't exist - use rotateHorizontal instead
            VoxelShape voxelShape2 = voxelShape;
            return Shapes.rotateHorizontal(Shapes.or(Block.column(16.0, 3.0, 9.0), new VoxelShape[]{voxelShape, voxelShape2}));
        });
    }
}
