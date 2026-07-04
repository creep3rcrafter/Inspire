package net.github.creep3rcrafter.inspire.entity;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.MinecartChest;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TrappedChestMinecart extends MinecartChest {
    public TrappedChestMinecart(EntityType<? extends TrappedChestMinecart> entityType, Level level) {
        super(entityType, level);
    }

    protected @NotNull Item getDropItem() {
        return Items.CHEST_MINECART;
    }

    public int getContainerSize() {
        return 27;
    }

    public @NotNull Type getMinecartType() {
        return Type.CHEST;
    }

    public @NotNull BlockState getDefaultDisplayBlockState() {
        return (BlockState) Blocks.TRAPPED_CHEST.defaultBlockState().setValue(ChestBlock.FACING, Direction.NORTH);
    }

    public int getDefaultDisplayOffset() {
        return 8;
    }

    public @NotNull AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return ChestMenu.threeRows(i, inventory, this);
    }
}
