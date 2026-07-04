package net.github.creep3rcrafter.inspire.entity;


import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import static net.minecraft.block.RedstoneWireBlock.POWER;

public class TrappedChestBoatEntity extends ChestBoatEntity {

    public TrappedChestBoatEntity(EntityType<? extends TrappedChestBoatEntity> entityType, World level) {
        super(entityType, level);
    }

    public TrappedChestBoatEntity(World world, double d, double e, double f) {
        this(InspireEntityTypes.TRAPPED_CHEST_BOAT.get(), world);
        this.setPos(d, e, f);
        this.prevX = d;
        this.prevY = e;
        this.prevZ = f;
    }


    @Override
    public void openInventory(PlayerEntity player) {
        super.openInventory(player);
    }


    @Override
    public Item asItem() {
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
    public void onOpen(PlayerEntity player) {
        World world = getWorld();
        if (!world.isClient()) {
            BlockState blockState = world.getBlockState(this.getBlockPos().down());
            if (blockState.contains(POWER)) {
                if (!(blockState.get(POWER) >= 1)) {
                    world.setBlockState(this.getBlockPos(), blockState.with(POWER, 15), 3);
                    world.updateNeighbors(this.getBlockPos(), blockState.getBlock());
                    //world.setBlock(blockPosition(), blockState.setValue(POWER, 0), 3);
                    //world.updateNeighborsAt(blockPosition(), blockState.getBlock());
                }
            }
            for (Direction direction : net.minecraft.util.math.Direction.values()) {
                if (direction != Direction.UP) {
                    BlockState blockState2 = world.getBlockState(this.getBlockPos().offset(direction));
                    if (blockState2.contains(POWER)) {
                        if (!(blockState2.get(POWER) >= 1)) {
                            world.setBlockState(this.getBlockPos().offset(direction), blockState2.with(POWER, 15), 3);
                            world.updateNeighbors(this.getBlockPos().offset(direction), blockState2.getBlock());
                            //world.setBlock(blockPosition().relative(direction), blockState2.setValue(POWER, 0), 3);
                            //world.updateNeighborsAt(blockPosition().relative(direction), blockState.getBlock());
                        }
                    }
                }
            }
        }
        super.onOpen(player);
    }
}