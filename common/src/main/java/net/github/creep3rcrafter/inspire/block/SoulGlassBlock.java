package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.register.ModBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings({"deprecation", "unused"})
public class SoulGlassBlock extends Block {
    public static final IntegerProperty BRIGHTNESS;

    static {
        BRIGHTNESS = ModBlockStateProperties.BRIGHTNESS;
    }

    public SoulGlassBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(BRIGHTNESS, 15));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        if (blockPlaceContext.getPlayer() != null) {
            return this.defaultBlockState().setValue(BRIGHTNESS, 15);
        } else {
            return this.defaultBlockState().setValue(BRIGHTNESS, 0);
        }
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState blockState) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState blockState, Level level, BlockPos blockPos) {
        return level.getBlockState(blockPos).getValue(BRIGHTNESS);
    }

    @Override
    public boolean isSignalSource(BlockState blockState) {
        return true;
    }

    @Override
    public boolean isRandomlyTicking(BlockState blockState) {
        return super.isRandomlyTicking(blockState);
    }

    @Override
    public void tick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        super.tick(blockState, serverLevel, blockPos, randomSource);
        if (!serverLevel.isClientSide()) {
            if (blockState.hasProperty(BRIGHTNESS)) {
                int brightness = blockState.getValue(BRIGHTNESS);
                if (brightness > 0){
                    brightness = brightness - 1;
                    serverLevel.setBlock(blockPos, blockState.setValue(BRIGHTNESS, brightness), 3);
                    serverLevel.scheduleTick(blockPos, this, 20);
                    if (brightness > 2){
                        for (Direction direction : Direction.values()) {
                            BlockState blockState1 = serverLevel.getBlockState(blockPos.relative(direction));
                            if (blockState1.hasProperty(BRIGHTNESS)) {
                                if (randomSource.nextBoolean()){
                                    brightness = brightness - 1;
                                    serverLevel.setBlock(blockPos.relative(direction), blockState1.setValue(BRIGHTNESS, brightness), 3);
                                    serverLevel.scheduleTick(blockPos.relative(direction), this, 20);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void attack(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        super.attack(blockState, level, blockPos, player);
        if (!level.isClientSide()) {
            level.setBlock(blockPos, blockState.setValue(BRIGHTNESS, 15), 3);
            level.scheduleTick(blockPos, this, 20);
        }
    }

    @Override
    public void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        super.onPlace(blockState, level, blockPos, blockState2, bl);
        if (!level.isClientSide()) {
            level.scheduleTick(blockPos, this, 20);
        }
    }

    @Override
    public @NotNull InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (!level.isClientSide()) {
            level.setBlock(blockPos, blockState.setValue(BRIGHTNESS, 15), 3);
            level.scheduleTick(blockPos, this, 20);
        }
        ItemStack itemStack = player.getItemInHand(interactionHand);
        return itemStack.getItem() instanceof BlockItem && (new BlockPlaceContext(player, interactionHand, itemStack, blockHitResult)).canPlace() ? InteractionResult.PASS : InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        super.stepOn(level, blockPos, blockState, entity);
        if (!level.isClientSide()) {
            if (entity instanceof LivingEntity) {
                level.setBlock(blockPos, blockState.setValue(BRIGHTNESS, 15), 3);
                //level.scheduleTick(blockPos, this, 20);
            }
        }
    }

    @Override
    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        super.randomTick(blockState, serverLevel, blockPos, randomSource);
        if (!serverLevel.isClientSide()) {
            if (blockState.hasProperty(BRIGHTNESS)) {
                int brightness = blockState.getValue(BRIGHTNESS);
                float randomfloat = randomSource.nextFloat();
                if (randomfloat > 0.2f) {
                    if (brightness < 7) {
                        brightness = brightness + 7;
                        serverLevel.setBlock(blockPos, blockState.setValue(BRIGHTNESS, brightness), 3);
                    }
                } else if (randomfloat > 0.1f) {
                    if (brightness < 12) {
                        brightness = brightness + 2;
                        serverLevel.setBlock(blockPos, blockState.setValue(BRIGHTNESS, brightness), 3);
                    }
                } else {
                    if (brightness > 0) {
                        brightness = brightness - 1;
                        serverLevel.setBlock(blockPos, blockState.setValue(BRIGHTNESS, brightness), 3);
                        serverLevel.scheduleTick(blockPos, this, 20);
                    }
                }
            }
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BRIGHTNESS);
    }
}
