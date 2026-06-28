package net.github.creep3rcrafter.inspire.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ShelfFungiBlock extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<ShelfFungiBlock> CODEC = simpleCodec(ShelfFungiBlock::new);
    private static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Block.box(0.0, 0.0, 7.0, 16.0, 9.0, 9.0);
    private static final VoxelShape FLOOR_EAST_WEST_SHAPE = Block.box(7.0, 0.0, 0.0, 9.0, 9.0, 16.0);
    private static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Block.box(0.0, 7.0, 7.0, 16.0, 16.0, 9.0);
    private static final VoxelShape CEILING_EAST_WEST_SHAPE = Block.box(7.0, 7.0, 0.0, 9.0, 16.0, 16.0);
    private static final VoxelShape NORTH_WALL_SHAPE = Block.box(0.0, 7.0, 0.0, 16.0, 9.0, 9.0);
    private static final VoxelShape SOUTH_WALL_SHAPE = Block.box(0.0, 7.0, 7.0, 16.0, 9.0, 16.0);
    private static final VoxelShape WEST_WALL_SHAPE = Block.box(0.0, 7.0, 0.0, 9.0, 9.0, 16.0);
    private static final VoxelShape EAST_WALL_SHAPE = Block.box(7.0, 7.0, 0.0, 16.0, 9.0, 16.0);

    public ShelfFungiBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
    }

    @Override
    protected @NotNull MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, FACE});
    }

    @Override
    protected @NotNull BlockState rotate(BlockState blockState, Rotation rotation) {
        return (BlockState)blockState.setValue(FACING, rotation.rotate((Direction)blockState.getValue(FACING)));
    }

    @Override
    protected @NotNull BlockState mirror(BlockState blockState, Mirror mirror) {
        return blockState.rotate(mirror.getRotation((Direction)blockState.getValue(FACING)));
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        AttachFace face = blockState.getValue(FACE);
        if (face == AttachFace.FLOOR) {
            Direction facing = blockState.getValue(FACING);
            return (facing == Direction.EAST || facing == Direction.WEST) ? FLOOR_EAST_WEST_SHAPE : FLOOR_NORTH_SOUTH_SHAPE;
        }
        if (face == AttachFace.CEILING) {
            Direction facing = blockState.getValue(FACING);
            return (facing == Direction.EAST || facing == Direction.WEST) ? CEILING_EAST_WEST_SHAPE : CEILING_NORTH_SOUTH_SHAPE;
        }
        return switch (blockState.getValue(FACING).getOpposite()) {
            case NORTH -> NORTH_WALL_SHAPE;
            case SOUTH -> SOUTH_WALL_SHAPE;
            case WEST -> WEST_WALL_SHAPE;
            case EAST -> EAST_WALL_SHAPE;
            default -> FLOOR_NORTH_SOUTH_SHAPE;
        };
    }
}
