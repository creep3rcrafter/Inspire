package net.github.creep3rcrafter.inspire.entity;


import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.RedStoneWireBlock.POWER;

public class TrappedChestBoatEntity extends ChestBoat {

    public TrappedChestBoatEntity(EntityType<? extends TrappedChestBoatEntity> entityType, Level level) {
        super(entityType, level);
    }

    public TrappedChestBoatEntity(Level level, double d, double e, double f) {
        this(InspireEntityTypes.TRAPPED_CHEST_BOAT.get(), level);
        this.setPos(d, e, f);
        this.xo = d;
        this.yo = e;
        this.zo = f;
    }


    @Override
    public void openCustomInventoryScreen(Player player) {
        super.openCustomInventoryScreen(player);
    }


    @Override
    public Item getDropItem() {
        Item item;
        switch (this.getVariant()) {
            case SPRUCE -> item = Items.SPRUCE_CHEST_BOAT;
            case BIRCH -> item = Items.BIRCH_CHEST_BOAT;
            case JUNGLE -> item = Items.JUNGLE_CHEST_BOAT;
            case ACACIA -> item = Items.ACACIA_CHEST_BOAT;
            case CHERRY -> item = Items.CHERRY_CHEST_BOAT;
            case DARK_OAK -> item = Items.DARK_OAK_CHEST_BOAT;
            case MANGROVE -> item = Items.MANGROVE_CHEST_BOAT;
            case BAMBOO -> item = Items.BAMBOO_CHEST_RAFT;
            default -> item = Items.OAK_CHEST_BOAT;
        }

        return item;
    }
    /*
    @Override
    public @NotNull Item getDropItem() {
        Item item;
        if (this.getBoatType() == Boat.Type.byName("crimson")) {
            return InspireItems.CRIMSON_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Boat.Type.byName("warped")) {
            return InspireItems.WARPED_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Boat.Type.byName("withered")) {
            return InspireItems.WITHERED_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Boat.Type.byName("pine")) {
            return InspireItems.PINE_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Boat.Type.byName("redwood")) {
            return InspireItems.REDWOOD_TRAPPED_CHEST_BOAT.get();
        }
        item = switch (this.getBoatType()) {
            case SPRUCE -> InspireItems.SPRUCE_TRAPPED_CHEST_BOAT.get();
            case BIRCH -> InspireItems.BIRCH_TRAPPED_CHEST_BOAT.get();
            case JUNGLE -> InspireItems.JUNGLE_TRAPPED_CHEST_BOAT.get();
            case ACACIA -> InspireItems.ACACIA_TRAPPED_CHEST_BOAT.get();
            case DARK_OAK -> InspireItems.DARK_OAK_TRAPPED_CHEST_BOAT.get();
            case MANGROVE -> InspireItems.MANGROVE_TRAPPED_CHEST_BOAT.get();
            default -> InspireItems.OAK_TRAPPED_CHEST_BOAT.get();
        };

        return item;
    }
     */


    @Override
    public void startOpen(Player player) {
        Level level = this.level();
        if (!level.isClientSide) {
            BlockState blockState = level.getBlockState(this.blockPosition().below());
            if (blockState.hasProperty(POWER)) {
                if (!(blockState.getValue(POWER) >= 1)) {
                    level.setBlockAndUpdate(this.blockPosition(), blockState.setValue(POWER, 15));
                    level.updateNeighborsAt(this.blockPosition(), blockState.getBlock());
                }
            }
            for (Direction direction : Direction.values()) {
                if (direction != Direction.UP) {
                    BlockState blockState2 = level.getBlockState(this.blockPosition().relative(direction));
                    if (blockState2.hasProperty(POWER)) {
                        if (!(blockState2.getValue(POWER) >= 1)) {
                            level.setBlockAndUpdate(this.blockPosition().relative(direction), blockState2.setValue(POWER, 15));
                            level.updateNeighborsAt(this.blockPosition().relative(direction), blockState2.getBlock());
                        }
                    }
                }
            }
        }
        super.startOpen(player);
    }

    @Override
    public Boat.@NotNull Type getVariant() {
        return Boat.Type.OAK;
    }
}
