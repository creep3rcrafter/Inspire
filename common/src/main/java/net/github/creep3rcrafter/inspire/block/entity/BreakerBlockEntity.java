package net.github.creep3rcrafter.inspire.block.entity;

import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.DispenserMenu;
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
        // Legacy BreakerMenu is temporarily disabled for 1.21.1 compile stability.
        return new DispenserMenu(i, inventory, this);
    }

    protected @NotNull Component getDefaultName() {
        return Component.translatable("inspire.container.breaker");
    }
}
