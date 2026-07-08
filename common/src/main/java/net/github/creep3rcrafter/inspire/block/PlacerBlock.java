package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.block.entity.BreakerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Container;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"unused"})
public class PlacerBlock extends DispenserBlock {
    private static final DispenseItemBehavior BREAKER_BEHAVIOUR = new DefaultDispenseItemBehavior() {
        @Override
        protected @NotNull ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
            Direction direction = blockSource.getBlockState().getValue(DispenserBlock.FACING);
            ServerLevel serverLevel = blockSource.getLevel();
            BlockState blockState = serverLevel.getBlockState(blockSource.getPos().relative(direction));
            if (!serverLevel.isClientSide())
                if (itemStack.getItem() instanceof BlockItem blockItem) {
                    if (blockState.getMaterial().isReplaceable() || blockState.isAir()) {
                        serverLevel.setBlock(blockSource.getPos().relative(direction), blockItem.getBlock().defaultBlockState(), 3);
                        itemStack.shrink(1);
                    }
                }
            return itemStack;
        }
    };

    public PlacerBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull DispenseItemBehavior getDispenseMethod(ItemStack itemStack) {
        return BREAKER_BEHAVIOUR;
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BreakerBlockEntity(blockPos, blockState);
    }

    @Override
    protected void dispenseFrom(ServerLevel serverLevel, BlockPos blockPos) {
        // Legacy placer inventory logic is temporarily disabled for 1.21.1 compile stability.
        super.dispenseFrom(serverLevel, blockPos);
    }
}
