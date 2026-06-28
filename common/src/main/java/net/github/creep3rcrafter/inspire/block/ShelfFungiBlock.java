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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Function;

public class ShelfFungiBlock extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<ShelfFungiBlock> CODEC = simpleCodec(ShelfFungiBlock::new);
    private final Function<BlockState, VoxelShape> shapes;

    public ShelfFungiBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
        this.shapes = this.makeShapes();
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

    private VoxelShape getVoxelShape(BlockState blockState) {
        return (VoxelShape)this.shapes.apply(blockState);
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return this.getVoxelShape(blockState);
    }
    private Function<BlockState, VoxelShape> makeShapes() {
        VoxelShape voxelShape = Shapes.box(0,0.45,0.5, 1,0.55,1);
        // DISABLED: Shapes.rotateAttachFace() doesn't exist in 1.21.1
        // Using fallback: return the same shape for all states
        return (blockState) -> voxelShape;
        // Map<AttachFace, Map<Direction, VoxelShape>> map = Shapes.rotateAttachFace(voxelShape);
        // return this.getShapeForEachState((blockState) -> (VoxelShape)((Map<?, ?>)map.get(blockState.getValue(FACE))).get(blockState.getValue(FACING)));
    }
}
