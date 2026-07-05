package net.github.creep3rcrafter.inspire.block;

import net.github.creep3rcrafter.inspire.block.entity.BreakerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BreakerBlock extends DispenserBlock {
    private static final DispenseItemBehavior BREAKER_BEHAVIOUR = new DefaultDispenseItemBehavior() {
        @Override
        protected @NotNull ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
            Direction direction = blockSource.getBlockState().getValue(DispenserBlock.FACING);
            ServerLevel serverLevel = blockSource.getLevel();
            for (ServerPlayer serverPlayer : serverLevel.getServer().getPlayerList().getPlayers()) {
                serverLevel.destroyBlockProgress(blockSource.getPos().hashCode(), blockSource.getPos().relative(direction), serverPlayer.getId());
            }
            return itemStack;
        }
    };

    public BreakerBlock(Properties properties) {
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
        //BlockSourceImpl blockSourceImpl = new BlockSourceImpl(serverLevel, blockPos);
        BreakerBlockEntity dispenserBlockEntity = blockSourceImpl.getEntity();
        int i = dispenserBlockEntity.getRandomSlot(serverLevel.random);
        if (i < 0) {
            serverLevel.levelEvent(1001, blockPos, 0);
        } else {
            ItemStack itemStack = dispenserBlockEntity.getItem(i);
            if (!itemStack.isEmpty()) {
                Direction direction = serverLevel.getBlockState(blockPos).getValue(FACING);
                Container container = HopperBlockEntity.getContainerAt(serverLevel, blockPos.relative(direction));
                ItemStack itemStack2;
                if (container == null) {
                    //itemStack2 = BREAKER_BEHAVIOUR.dispense(blockSourceImpl, itemStack);
                } else {
                    itemStack2 = HopperBlockEntity.addItem(dispenserBlockEntity, container, itemStack.copy().split(1), direction.getOpposite());
                    if (itemStack2.isEmpty()) {
                        itemStack2 = itemStack.copy();
                        itemStack2.shrink(1);
                    } else {
                        itemStack2 = itemStack.copy();
                    }
                }

                dispenserBlockEntity.setItem(i, itemStack2);
            }
        }
    }
}
