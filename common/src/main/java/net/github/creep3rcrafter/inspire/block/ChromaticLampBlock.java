package net.github.creep3rcrafter.inspire.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.ticks.TickPriority;

import java.util.function.ToIntFunction;

@SuppressWarnings("deprecation")
public class ChromaticLampBlock extends Block {
    public static final IntegerProperty COLOR;
    public static final ToIntFunction<BlockState> LIGHT_EMISSION;

    static {
        COLOR = IntegerProperty.create("color", 0, 15);
        LIGHT_EMISSION = (blockState) -> {
            if (blockState.getValue(COLOR) == 0) {
                return 0;
            } else {
                return 15;
            }
        };
    }

    public ChromaticLampBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(COLOR, 0));
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        if (blockPlaceContext.getLevel().hasNeighborSignal(blockPlaceContext.getClickedPos())) {
            return this.defaultBlockState().setValue(COLOR, blockPlaceContext.getLevel().getBestNeighborSignal(blockPlaceContext.getClickedPos()));
        } else {
            return this.defaultBlockState();
        }
    }

    public void neighborChanged(BlockState blockState, Level level, BlockPos blockPos, Block block, BlockPos blockPos2, boolean bl) {
        if (!level.isClientSide) {
            int colorValue = blockState.getValue(COLOR);
            if (level.hasNeighborSignal(blockPos)) {
                if (colorValue != level.getBestNeighborSignal(blockPos)) {
                    if (colorValue != 0) {
                        level.scheduleTick(blockPos, this, 4, TickPriority.EXTREMELY_HIGH);
                    } else {
                        level.setBlockAndUpdate(blockPos, blockState.setValue(COLOR, level.getBestNeighborSignal(blockPos)));
                    }
                }
            } else {
                level.setBlockAndUpdate(blockPos, blockState.setValue(COLOR, 1));
            }
        }
    }

    @Override
    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(COLOR) > 0 && !serverLevel.hasNeighborSignal(blockPos)) {
            serverLevel.setBlockAndUpdate(blockPos, blockState.setValue(COLOR, 0));
        }
    }

    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> arg) {
        arg.add(COLOR);
    }
}
