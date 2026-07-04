package net.github.creep3rcrafter.inspire.block.entity;

import net.github.creep3rcrafter.inspire.inventory.BreakerMenu;
import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.DispenserBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BreakerBlockEntity extends DispenserBlockEntity {
    public BreakerBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(InspireBlockEntityTypes.BREAKER.get(), blockPos, blockState);
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new BreakerMenu(i, inventory, this);// change to 1 slot
    }

    protected @NotNull Component getDefaultName() {
        return Component.translatable("inspire.container.breaker");
    }
}
