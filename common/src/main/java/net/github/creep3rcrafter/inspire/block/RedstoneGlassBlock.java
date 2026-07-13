package net.github.creep3rcrafter.inspire.block;

import com.google.common.collect.Sets;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.Set;

@SuppressWarnings("deprecation")
public class RedstoneGlassBlock extends Block {
    public static final IntegerProperty POWER;
    private boolean shouldSignal = true;

    static {
        POWER = BlockStateProperties.POWER;
    }

    public RedstoneGlassBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(POWER, 15));
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return level.getBlockState((blockPos)).getValue(POWER);
    }

    @Override
    public boolean isSignalSource(BlockState blockState) {
        return true;
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        return super.isRandomlyTicking(blockState);
    }

    public int getDirectSignal(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, Direction direction) {
        return !this.shouldSignal ? 0 : blockState.getSignal(blockGetter, blockPos, direction);
    }
    public int getSignal(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, Direction direction) {
        if (this.shouldSignal) {
            return (Integer)blockState.getValue(POWER);
        } else {
            return 0;
        }
    }


    private BlockState getConnectionState(BlockGetter blockGetter, BlockState blockState, BlockPos blockPos) {
        return this.defaultBlockState().setValue(POWER, (Integer)blockState.getValue(POWER));
    }
    private int calculateTargetStrength(Level level, BlockPos blockPos) {
        this.shouldSignal = false;
        int i = level.getBestNeighborSignal(blockPos);
        this.shouldSignal = true;
        int j = 0;
        if (i < 15) {
            for(Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.relative(direction);
                BlockState blockState = level.getBlockState(blockPos2);
                j = Math.max(j, this.getWireSignal(blockState));
            }
        }

        return Math.max(i, j - 1);
    }
    private void updatePowerStrength(Level level, BlockPos blockPos, BlockState blockState) {
        int i = this.calculateTargetStrength(level, blockPos);
        if ((Integer)blockState.getValue(POWER) != i) {
            if (level.getBlockState(blockPos) == blockState) {
                level.setBlock(blockPos, (BlockState)blockState.setValue(POWER, i), 2);
            }

            Set<BlockPos> set = Sets.newHashSet();
            set.add(blockPos);for(Direction direction : Direction.values()) {
                set.add(blockPos.relative(direction));
            }

            for(BlockPos blockPos2 : set) {
                level.updateNeighborsAt(blockPos2, this);
            }
        }

    }
    public void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        if (!blockState2.is(blockState.getBlock()) && !level.isClientSide) {
            this.updatePowerStrength(level, blockPos, blockState);

            for(Direction direction : Direction.values()) {
                level.updateNeighborsAt(blockPos.relative(direction), this);
            }
        }
    }

    public void onRemove(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        if (!blockState.is(blockState2.getBlock())) {
            super.onRemove(blockState, level, blockPos, blockState2, false);
            if (!level.isClientSide) {
                for(Direction direction : Direction.values()) {
                    level.updateNeighborsAt(blockPos.relative(direction), this);
                }

                this.updatePowerStrength(level, blockPos, blockState);
            }
        }
    }

    private int getWireSignal(BlockState blockState) {
        return blockState.is(this) ? (Integer)blockState.getValue(POWER) : 0;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWER);
    }
}
