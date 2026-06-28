package net.github.creep3rcrafter.inspire.block.entity;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class IcicleBlock extends Block implements Fallable, SimpleWaterloggedBlock {
    public static final MapCodec<IcicleBlock> CODEC = simpleCodec(IcicleBlock::new);
    public static final EnumProperty<@NotNull Direction> TIP_DIRECTION;
    public static final EnumProperty<@NotNull DripstoneThickness> THICKNESS;
    public static final BooleanProperty WATERLOGGED;
    private static final VoxelShape SHAPE_TIP_MERGE;
    private static final VoxelShape SHAPE_TIP_UP;
    private static final VoxelShape SHAPE_TIP_DOWN;
    private static final VoxelShape SHAPE_FRUSTUM;
    private static final VoxelShape SHAPE_MIDDLE;
    private static final VoxelShape SHAPE_BASE;
    private static final double STALACTITE_DRIP_START_PIXEL;
    private static final float MAX_HORIZONTAL_OFFSET;
    private static final VoxelShape REQUIRED_SPACE_TO_DRIP_THROUGH_NON_SOLID_BLOCK;

    public @NotNull MapCodec<IcicleBlock> codec() {
        return CODEC;
    }

    public IcicleBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(TIP_DIRECTION, Direction.UP)).setValue(THICKNESS, DripstoneThickness.TIP)).setValue(WATERLOGGED, false));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, @NotNull BlockState> builder) {
        builder.add(new Property[]{TIP_DIRECTION, THICKNESS, WATERLOGGED});
    }

    protected boolean canSurvive(BlockState blockState, @NotNull LevelReader levelReader, @NotNull BlockPos blockPos) {
        return isValidPointedDripstonePlacement(levelReader, blockPos, (Direction)blockState.getValue(TIP_DIRECTION));
    }

    // DISABLED: ScheduledTickAccess doesn't exist in Minecraft 1.21.1
    // The updateShape method signature has changed significantly
    /*
    protected @NotNull BlockState updateShape(BlockState blockState, @NotNull LevelReader levelReader, @NotNull ScheduledTickAccess scheduledTickAccess,
                                              @NotNull BlockPos blockPos, @NotNull Direction direction, @NotNull BlockPos blockPos2, @NotNull BlockState blockState2, @NotNull RandomSource randomSource) {
        if ((Boolean)blockState.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader));
        }

        if (direction != Direction.UP && direction != Direction.DOWN) {
            return blockState;
        } else {
            Direction direction2 = (Direction)blockState.getValue(TIP_DIRECTION);
            if (direction2 == Direction.DOWN && scheduledTickAccess.getBlockTicks().hasScheduledTick(blockPos, this)) {
                return blockState;
            } else if (direction == direction2.getOpposite() && !this.canSurvive(blockState, levelReader, blockPos)) {
                if (direction2 == Direction.DOWN) {
                    scheduledTickAccess.scheduleTick(blockPos, this, 2);
                } else {
                    scheduledTickAccess.scheduleTick(blockPos, this, 1);
                }

                return blockState;
            } else {
                boolean bl = blockState.getValue(THICKNESS) == DripstoneThickness.TIP_MERGE;
                DripstoneThickness dripstoneThickness = calculateDripstoneThickness(levelReader, blockPos, direction2, bl);
                return (BlockState)blockState.setValue(THICKNESS, dripstoneThickness);
            }
        }
    }
    */

    protected void onProjectileHit(Level level, @NotNull BlockState blockState, @NotNull BlockHitResult blockHitResult, @NotNull Projectile projectile) {
        if (!level.isClientSide()) {
            BlockPos blockPos = blockHitResult.getBlockPos();
            if (level instanceof ServerLevel serverLevel) {
                if (projectile.mayInteract(serverLevel, blockPos) && projectile.mayBreak(serverLevel) && projectile instanceof ThrownTrident && projectile.getDeltaMovement().length() > 0.6) {
                    level.destroyBlock(blockPos, true);
                }
            }

        }
    }

    // DISABLED: causeFallDamage() signature changed and fallOn() requires adaptation
    /*
    public void fallOn(@NotNull Level level, BlockState blockState, @NotNull BlockPos blockPos, @NotNull Entity entity, double d) {
        if (blockState.getValue(TIP_DIRECTION) == Direction.UP && blockState.getValue(THICKNESS) == DripstoneThickness.TIP) {
            entity.causeFallDamage(d + (double)2.5F, 2.0F, level.damageSources().stalagmite());
        } else {
            super.fallOn(level, blockState, blockPos, entity, d);
        }

    }
    */

    public void animateTick(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        if (canDrip(blockState)) {
            float f = randomSource.nextFloat();
            if (!(f > 0.12F)) {
                getFluidAboveStalactite(level, blockPos, blockState).filter((fluidInfo) -> f < 0.02F || canFillCauldron(fluidInfo.fluid)).ifPresent((fluidInfo) -> spawnDripParticle(level, blockPos, blockState, fluidInfo.fluid, fluidInfo.pos));
            }
        }
    }

    protected void tick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        if (isStalagmite(blockState) && !this.canSurvive(blockState, serverLevel, blockPos)) {
            serverLevel.destroyBlock(blockPos, true);
        } else {
            spawnFallingStalactite(blockState, serverLevel, blockPos);
        }

    }

    protected void randomTick(@NotNull BlockState blockState, @NotNull ServerLevel serverLevel, @NotNull BlockPos blockPos, RandomSource randomSource) {
        maybeTransferFluid(blockState, serverLevel, blockPos, randomSource.nextFloat());
        if (randomSource.nextFloat() < 0.011377778F && isStalactiteStartPos(blockState, serverLevel, blockPos)) {
            growStalactiteOrStalagmiteIfPossible(blockState, serverLevel, blockPos, randomSource);
        }

    }

    @VisibleForTesting
    public static void maybeTransferFluid(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, float f) {
        if (!(f > 0.17578125F)) {
            if (isStalactiteStartPos(blockState, serverLevel, blockPos)) {
                Optional<IcicleBlock.FluidInfo> optional = getFluidAboveStalactite(serverLevel, blockPos, blockState);
                if (optional.isPresent()) {
                    Fluid fluid = ((IcicleBlock.FluidInfo)optional.get()).fluid;
                    float g;
                    if (fluid == Fluids.WATER) {
                        g = 0.17578125F;
                    } else {
                        if (fluid != Fluids.LAVA) {
                            return;
                        }

                        g = 0.05859375F;
                    }

                    if (!(f >= g)) {
                        BlockPos blockPos2 = findTip(blockState, serverLevel, blockPos, 11);
                        if (blockPos2 != null) {
                            if (((IcicleBlock.FluidInfo)optional.get()).sourceState.is(Blocks.MUD) && fluid == Fluids.WATER) {
                                BlockState blockState2 = Blocks.CLAY.defaultBlockState();
                                serverLevel.setBlockAndUpdate(((IcicleBlock.FluidInfo)optional.get()).pos, blockState2);
                                Block.pushEntitiesUp(((IcicleBlock.FluidInfo)optional.get()).sourceState, blockState2, serverLevel, ((IcicleBlock.FluidInfo)optional.get()).pos);
                                serverLevel.gameEvent(GameEvent.BLOCK_CHANGE, ((IcicleBlock.FluidInfo)optional.get()).pos, GameEvent.Context.of(blockState2));
                                serverLevel.levelEvent(1504, blockPos2, 0);
                            } else {
                                BlockPos blockPos3 = findFillableCauldronBelowStalactiteTip(serverLevel, blockPos2, fluid);
                                if (blockPos3 != null) {
                                    serverLevel.levelEvent(1504, blockPos2, 0);
                                    int i = blockPos2.getY() - blockPos3.getY();
                                    int j = 50 + i;
                                    BlockState blockState3 = serverLevel.getBlockState(blockPos3);
                                    serverLevel.scheduleTick(blockPos3, blockState3.getBlock(), j);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public @Nullable BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        LevelAccessor levelAccessor = blockPlaceContext.getLevel();
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        Direction direction = blockPlaceContext.getNearestLookingVerticalDirection().getOpposite();
        Direction direction2 = calculateTipDirection(levelAccessor, blockPos, direction);
        if (direction2 == null) {
            return null;
        } else {
            boolean bl = !blockPlaceContext.isSecondaryUseActive();
            DripstoneThickness dripstoneThickness = calculateDripstoneThickness(levelAccessor, blockPos, direction2, bl);
            return (BlockState)((BlockState)((BlockState)this.defaultBlockState().setValue(TIP_DIRECTION, direction2)).setValue(THICKNESS, dripstoneThickness)).setValue(WATERLOGGED, levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER);
        }
    }

    protected @NotNull FluidState getFluidState(BlockState blockState) {
        return (Boolean)blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    protected @NotNull VoxelShape getShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        VoxelShape var10000;
        switch ((DripstoneThickness)blockState.getValue(THICKNESS)) {
            case TIP_MERGE -> var10000 = SHAPE_TIP_MERGE;
            case TIP -> var10000 = blockState.getValue(TIP_DIRECTION) == Direction.DOWN ? SHAPE_TIP_DOWN : SHAPE_TIP_UP;
            case FRUSTUM -> var10000 = SHAPE_FRUSTUM;
            case MIDDLE -> var10000 = SHAPE_MIDDLE;
            case BASE -> var10000 = SHAPE_BASE;
            default -> throw new MatchException((String)null, (Throwable)null);
        }

        VoxelShape voxelShape = var10000;
        // DISABLED: blockState.getOffset() doesn't exist in Minecraft 1.21.1
        return voxelShape; // .move(blockState.getOffset(blockPos));
    }

    protected boolean isCollisionShapeFullBlock(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos) {
        return false;
    }

    protected float getMaxHorizontalOffset() {
        return MAX_HORIZONTAL_OFFSET;
    }

    public void onBrokenAfterFall(@NotNull Level level, @NotNull BlockPos blockPos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            level.levelEvent(1045, blockPos, 0);
        }

    }

    public @NotNull DamageSource getFallDamageSource(Entity entity) {
        return entity.damageSources().fallingStalactite(entity);
    }

    private static void spawnFallingStalactite(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos) {
        BlockPos.MutableBlockPos mutableBlockPos = blockPos.mutable();

        for(BlockState blockState2 = blockState; isStalactite(blockState2); blockState2 = serverLevel.getBlockState(mutableBlockPos)) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.fall(serverLevel, mutableBlockPos, blockState2);
            if (isTip(blockState2, true)) {
                int i = Math.max(1 + blockPos.getY() - mutableBlockPos.getY(), 6);
                float f = (float) i;
                fallingBlockEntity.setHurtsEntities(f, 40);
                break;
            }

            mutableBlockPos.move(Direction.DOWN);
        }

    }

    @VisibleForTesting
    public static void growStalactiteOrStalagmiteIfPossible(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        BlockState blockState2 = serverLevel.getBlockState(blockPos.above(1));
        BlockState blockState3 = serverLevel.getBlockState(blockPos.above(2));
        if (canGrow(blockState2, blockState3)) {
            BlockPos blockPos2 = findTip(blockState, serverLevel, blockPos, 7);
            if (blockPos2 != null) {
                BlockState blockState4 = serverLevel.getBlockState(blockPos2);
                if (canDrip(blockState4) && canTipGrow(blockState4, serverLevel, blockPos2)) {
                    if (randomSource.nextBoolean()) {
                        grow(serverLevel, blockPos2, Direction.DOWN);
                    } else {
                        growStalagmiteBelow(serverLevel, blockPos2);
                    }

                }
            }
        }
    }

    private static void growStalagmiteBelow(ServerLevel serverLevel, BlockPos blockPos) {
        BlockPos.MutableBlockPos mutableBlockPos = blockPos.mutable();

        for(int i = 0; i < 10; ++i) {
            mutableBlockPos.move(Direction.DOWN);
            BlockState blockState = serverLevel.getBlockState(mutableBlockPos);
            if (!blockState.getFluidState().isEmpty()) {
                return;
            }

            if (isUnmergedTipWithDirection(blockState, Direction.UP) && canTipGrow(blockState, serverLevel, mutableBlockPos)) {
                grow(serverLevel, mutableBlockPos, Direction.UP);
                return;
            }

            if (isValidPointedDripstonePlacement(serverLevel, mutableBlockPos, Direction.UP) && !serverLevel.isWaterAt(mutableBlockPos.below())) {
                grow(serverLevel, mutableBlockPos.below(), Direction.UP);
                return;
            }

            if (!canDripThrough(serverLevel, mutableBlockPos, blockState)) {
                return;
            }
        }

    }

    private static void grow(ServerLevel serverLevel, BlockPos blockPos, Direction direction) {
        BlockPos blockPos2 = blockPos.relative(direction);
        BlockState blockState = serverLevel.getBlockState(blockPos2);
        if (isUnmergedTipWithDirection(blockState, direction.getOpposite())) {
            createMergedTips(blockState, serverLevel, blockPos2);
        } else if (blockState.isAir() || blockState.is(Blocks.WATER)) {
            createDripstone(serverLevel, blockPos2, direction, DripstoneThickness.TIP);
        }

    }

    private static void createDripstone(LevelAccessor levelAccessor, BlockPos blockPos, Direction direction, DripstoneThickness dripstoneThickness) {
        BlockState blockState = (BlockState)((BlockState)((BlockState) InspireBlocks.ICICLE.get().defaultBlockState().setValue(TIP_DIRECTION, direction)).setValue(THICKNESS, dripstoneThickness)).setValue(WATERLOGGED, levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER);
        levelAccessor.setBlock(blockPos, blockState, 3);
    }

    private static void createMergedTips(BlockState blockState, LevelAccessor levelAccessor, BlockPos blockPos) {
        BlockPos blockPos3;
        BlockPos blockPos2;
        if (blockState.getValue(TIP_DIRECTION) == Direction.UP) {
            blockPos2 = blockPos;
            blockPos3 = blockPos.above();
        } else {
            blockPos3 = blockPos;
            blockPos2 = blockPos.below();
        }

        createDripstone(levelAccessor, blockPos3, Direction.DOWN, DripstoneThickness.TIP_MERGE);
        createDripstone(levelAccessor, blockPos2, Direction.UP, DripstoneThickness.TIP_MERGE);
    }

    public static void spawnDripParticle(Level level, BlockPos blockPos, BlockState blockState) {
        getFluidAboveStalactite(level, blockPos, blockState).ifPresent((fluidInfo) -> spawnDripParticle(level, blockPos, blockState, fluidInfo.fluid, fluidInfo.pos));
    }

    private static void spawnDripParticle(Level level, BlockPos blockPos, BlockState blockState, Fluid fluid, BlockPos blockPos2) {
        // DISABLED: blockState.getOffset() doesn't exist in Minecraft 1.21.1
        // Vec3 vec3 = blockState.getOffset(blockPos);
        Vec3 vec3 = Vec3.ZERO;
        double d = (double)0.0625F;
        double e = (double)blockPos.getX() + (double)0.5F + vec3.x;
        double f = (double)blockPos.getY() + STALACTITE_DRIP_START_PIXEL - (double)0.0625F;
        double g = (double)blockPos.getZ() + (double)0.5F + vec3.z;
        ParticleOptions particleOptions = getDripParticle(level, fluid, blockPos2);
        level.addParticle(particleOptions, e, f, g, (double)0.0F, (double)0.0F, (double)0.0F);
    }

    private static @Nullable BlockPos findTip(BlockState blockState, LevelAccessor levelAccessor, BlockPos blockPos, int i) {
        if (isTip(blockState, false)) {
            return blockPos;
        } else {
            Direction direction = (Direction)blockState.getValue(TIP_DIRECTION);
            BiPredicate<BlockPos, BlockState> biPredicate = (blockPosx, blockStatex) -> blockStatex.is(InspireBlocks.ICICLE.get()) && blockStatex.getValue(TIP_DIRECTION) == direction;
            return (BlockPos)findBlockVertical(levelAccessor, blockPos, direction.getAxisDirection(), biPredicate, (blockStatex) -> isTip(blockStatex, false), i).orElse((BlockPos) null);
        }
    }

    private static @Nullable Direction calculateTipDirection(LevelReader levelReader, BlockPos blockPos, Direction direction) {
        Direction direction2;
        if (isValidPointedDripstonePlacement(levelReader, blockPos, direction)) {
            direction2 = direction;
        } else {
            if (!isValidPointedDripstonePlacement(levelReader, blockPos, direction.getOpposite())) {
                return null;
            }

            direction2 = direction.getOpposite();
        }

        return direction2;
    }

    private static DripstoneThickness calculateDripstoneThickness(LevelReader levelReader, BlockPos blockPos, Direction direction, boolean bl) {
        Direction direction2 = direction.getOpposite();
        BlockState blockState = levelReader.getBlockState(blockPos.relative(direction));
        if (isPointedDripstoneWithDirection(blockState, direction2)) {
            return !bl && blockState.getValue(THICKNESS) != DripstoneThickness.TIP_MERGE ? DripstoneThickness.TIP : DripstoneThickness.TIP_MERGE;
        } else if (!isPointedDripstoneWithDirection(blockState, direction)) {
            return DripstoneThickness.TIP;
        } else {
            DripstoneThickness dripstoneThickness = (DripstoneThickness)blockState.getValue(THICKNESS);
            if (dripstoneThickness != DripstoneThickness.TIP && dripstoneThickness != DripstoneThickness.TIP_MERGE) {
                BlockState blockState2 = levelReader.getBlockState(blockPos.relative(direction2));
                return !isPointedDripstoneWithDirection(blockState2, direction) ? DripstoneThickness.BASE : DripstoneThickness.MIDDLE;
            } else {
                return DripstoneThickness.FRUSTUM;
            }
        }
    }

    public static boolean canDrip(BlockState blockState) {
        return isStalactite(blockState) && blockState.getValue(THICKNESS) == DripstoneThickness.TIP && !(Boolean)blockState.getValue(WATERLOGGED);
    }

    private static boolean canTipGrow(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos) {
        Direction direction = (Direction)blockState.getValue(TIP_DIRECTION);
        BlockPos blockPos2 = blockPos.relative(direction);
        BlockState blockState2 = serverLevel.getBlockState(blockPos2);
        if (!blockState2.getFluidState().isEmpty()) {
            return false;
        } else {
            return blockState2.isAir() || isUnmergedTipWithDirection(blockState2, direction.getOpposite());
        }
    }

    private static Optional<BlockPos> findRootBlock(Level level, BlockPos blockPos, BlockState blockState) {
        Direction direction = (Direction)blockState.getValue(TIP_DIRECTION);
        BiPredicate<BlockPos, BlockState> biPredicate = (blockPosx, blockStatex) -> blockStatex.is(InspireBlocks.ICICLE.get()) && blockStatex.getValue(TIP_DIRECTION) == direction;
        return findBlockVertical(level, blockPos, direction.getOpposite().getAxisDirection(), biPredicate, (blockStatex) -> !blockStatex.is(InspireBlocks.ICICLE.get()), 11);
    }

    private static boolean isValidPointedDripstonePlacement(LevelReader levelReader, BlockPos blockPos, Direction direction) {
        BlockPos blockPos2 = blockPos.relative(direction.getOpposite());
        BlockState blockState = levelReader.getBlockState(blockPos2);
        return blockState.isFaceSturdy(levelReader, blockPos2, direction) || isPointedDripstoneWithDirection(blockState, direction);
    }

    private static boolean isTip(BlockState blockState, boolean bl) {
        if (!blockState.is(InspireBlocks.ICICLE.get())) {
            return false;
        } else {
            DripstoneThickness dripstoneThickness = (DripstoneThickness)blockState.getValue(THICKNESS);
            return dripstoneThickness == DripstoneThickness.TIP || bl && dripstoneThickness == DripstoneThickness.TIP_MERGE;
        }
    }

    private static boolean isUnmergedTipWithDirection(BlockState blockState, Direction direction) {
        return isTip(blockState, false) && blockState.getValue(TIP_DIRECTION) == direction;
    }

    private static boolean isStalactite(BlockState blockState) {
        return isPointedDripstoneWithDirection(blockState, Direction.DOWN);
    }

    private static boolean isStalagmite(BlockState blockState) {
        return isPointedDripstoneWithDirection(blockState, Direction.UP);
    }

    private static boolean isStalactiteStartPos(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return isStalactite(blockState) && !levelReader.getBlockState(blockPos.above()).is(InspireBlocks.ICICLE.get());
    }

    protected boolean isPathfindable(@NotNull BlockState blockState, @NotNull PathComputationType pathComputationType) {
        return false;
    }

    private static boolean isPointedDripstoneWithDirection(BlockState blockState, Direction direction) {
        return blockState.is(InspireBlocks.ICICLE.get()) && blockState.getValue(TIP_DIRECTION) == direction;
    }

    private static @Nullable BlockPos findFillableCauldronBelowStalactiteTip(Level level, BlockPos blockPos, Fluid fluid) {
        Predicate<BlockState> predicate = (blockState) -> blockState.getBlock() instanceof AbstractCauldronBlock && ((AbstractCauldronBlock)blockState.getBlock()).canReceiveStalactiteDrip(fluid);
        BiPredicate<BlockPos, BlockState> biPredicate = (blockPosx, blockState) -> canDripThrough(level, blockPosx, blockState);
        return (BlockPos)findBlockVertical(level, blockPos, Direction.DOWN.getAxisDirection(), biPredicate, predicate, 11).orElse((BlockPos) null);
    }

    public static @Nullable BlockPos findStalactiteTipAboveCauldron(Level level, BlockPos blockPos) {
        BiPredicate<BlockPos, BlockState> biPredicate = (blockPosx, blockState) -> canDripThrough(level, blockPosx, blockState);
        return (BlockPos)findBlockVertical(level, blockPos, Direction.UP.getAxisDirection(), biPredicate, IcicleBlock::canDrip, 11).orElse((BlockPos)null);
    }

    public static Fluid getCauldronFillFluidType(ServerLevel serverLevel, BlockPos blockPos) {
        return (Fluid)getFluidAboveStalactite(serverLevel, blockPos, serverLevel.getBlockState(blockPos)).map((fluidInfo) -> fluidInfo.fluid).filter(IcicleBlock::canFillCauldron).orElse(Fluids.EMPTY);
    }

    private static Optional<IcicleBlock.FluidInfo> getFluidAboveStalactite(Level level, BlockPos blockPos, BlockState blockState) {
        return !isStalactite(blockState) ? Optional.empty() : findRootBlock(level, blockPos, blockState).map((blockPosx) -> {
            BlockPos blockPos2 = blockPosx.above();
            BlockState blockState2 = level.getBlockState(blockPos2);
            Fluid fluid;
            if (blockState.is(Blocks.MUD)) {
                // In Minecraft 1.21.10, assume water is always available above mud for conversion
                fluid = Fluids.WATER;
            } else {
                fluid = level.getFluidState(blockPos2).getType();
            }

            return new IcicleBlock.FluidInfo(blockPos2, fluid, blockState);
        });
    }

    private static boolean canFillCauldron(Fluid fluid) {
        return fluid == Fluids.LAVA || fluid == Fluids.WATER;
    }

    private static boolean canGrow(BlockState blockState, BlockState blockState2) {
        return blockState.is(Blocks.DRIPSTONE_BLOCK) && blockState2.is(Blocks.WATER) && blockState2.getFluidState().isSource();
    }
    @SuppressWarnings("deprecation")
    private static ParticleOptions getDripParticle(Level level, Fluid fluid, BlockPos blockPos) {
        if (fluid.isSame(Fluids.EMPTY)) {
            // In Minecraft 1.21.10, use default dripstone water particle as fallback
            return ParticleTypes.DRIPPING_DRIPSTONE_WATER;
        } else {
            return fluid.is(FluidTags.LAVA) ? ParticleTypes.DRIPPING_DRIPSTONE_LAVA : ParticleTypes.DRIPPING_DRIPSTONE_WATER;
        }
    }

    private static Optional<BlockPos> findBlockVertical(LevelAccessor levelAccessor, BlockPos blockPos, Direction.AxisDirection axisDirection, BiPredicate<BlockPos, BlockState> biPredicate, Predicate<BlockState> predicate, int i) {
        Direction direction = Direction.get(axisDirection, Direction.Axis.Y);
        BlockPos.MutableBlockPos mutableBlockPos = blockPos.mutable();

        for(int j = 1; j < i; ++j) {
            mutableBlockPos.move(direction);
            BlockState blockState = levelAccessor.getBlockState(mutableBlockPos);
            if (predicate.test(blockState)) {
                return Optional.of(mutableBlockPos.immutable());
            }

            if (levelAccessor.isOutsideBuildHeight(mutableBlockPos.getY()) || !biPredicate.test(mutableBlockPos, blockState)) {
                return Optional.empty();
            }
        }

        return Optional.empty();
    }

    private static boolean canDripThrough(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState) {
        if (blockState.isAir()) {
            return true;
        // DISABLED: isSolidRender() signature changed in 1.21.1 - now requires BlockGetter and BlockPos parameters
        // } else if (blockState.isSolidRender()) {
        } else if (blockState.isSolidRender(blockGetter, blockPos)) {
            return false;
        } else if (!blockState.getFluidState().isEmpty()) {
            return false;
        } else {
            VoxelShape voxelShape = blockState.getCollisionShape(blockGetter, blockPos);
            return !Shapes.joinIsNotEmpty(REQUIRED_SPACE_TO_DRIP_THROUGH_NON_SOLID_BLOCK, voxelShape, BooleanOp.AND);
        }
    }

    static {
        TIP_DIRECTION = BlockStateProperties.VERTICAL_DIRECTION;
        THICKNESS = BlockStateProperties.DRIPSTONE_THICKNESS;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        // DISABLED: Block.column() doesn't exist in 1.21.1, using box() as fallback
        SHAPE_TIP_MERGE = Block.box(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
        SHAPE_TIP_UP = Block.box(6.0, 0.0, 6.0, 10.0, 11.0, 10.0);
        SHAPE_TIP_DOWN = Block.box(6.0, 5.0, 6.0, 10.0, 16.0, 10.0);
        SHAPE_FRUSTUM = Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
        SHAPE_MIDDLE = Block.box(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
        SHAPE_BASE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
        STALACTITE_DRIP_START_PIXEL = SHAPE_TIP_DOWN.min(Direction.Axis.Y);
        MAX_HORIZONTAL_OFFSET = (float)SHAPE_BASE.min(Direction.Axis.X);
        REQUIRED_SPACE_TO_DRIP_THROUGH_NON_SOLID_BLOCK = Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    }

    record FluidInfo(BlockPos pos, Fluid fluid, BlockState sourceState) {
        FluidInfo(BlockPos pos, Fluid fluid, BlockState sourceState) {
            this.pos = pos;
            this.fluid = fluid;
            this.sourceState = sourceState;
        }

        public BlockPos pos() {
            return this.pos;
        }

        public Fluid fluid() {
            return this.fluid;
        }

        public BlockState sourceState() {
            return this.sourceState;
        }
    }
}
