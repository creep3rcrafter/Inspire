package net.github.creep3rcrafter.inspire.entity;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.POWER;

public class TrappedChestBoat extends ChestBoat {

    public TrappedChestBoat(EntityType<? extends TrappedChestBoat> entityType, Level level) {
        super(entityType, level);
    }

    public TrappedChestBoat(Level level, double d, double e, double f) {
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
    public @NotNull Item getDropItem() {
        Item item;
        if (this.getBoatType() == Type.byName("crimson")) {
            return InspireItems.CRIMSON_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("warped")) {
            return InspireItems.WARPED_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("withered")) {
            return InspireItems.WITHERED_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("pine")) {
            return InspireItems.PINE_TRAPPED_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("redwood")) {
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

    @Override
    public void startOpen(Player player) {
        if (!this.getLevel().isClientSide()) {
            BlockState blockState = level.getBlockState(blockPosition().below());
            if (blockState.hasProperty(POWER)) {
                if (!(blockState.getValue(POWER) >= 1)) {
                    level.setBlock(blockPosition(), blockState.setValue(POWER, 15), 3);
                    level.updateNeighborsAt(blockPosition(), blockState.getBlock());
                    //level.setBlock(blockPosition(), blockState.setValue(POWER, 0), 3);
                    //level.updateNeighborsAt(blockPosition(), blockState.getBlock());
                }
            }
            for (Direction direction : Direction.values()) {
                if (direction != Direction.UP) {
                    BlockState blockState2 = level.getBlockState(blockPosition().relative(direction));
                    if (blockState2.hasProperty(POWER)) {
                        if (!(blockState2.getValue(POWER) >= 1)) {
                            level.setBlock(blockPosition().relative(direction), blockState2.setValue(POWER, 15), 3);
                            level.updateNeighborsAt(blockPosition().relative(direction), blockState2.getBlock());
                            //level.setBlock(blockPosition().relative(direction), blockState2.setValue(POWER, 0), 3);
                            //level.updateNeighborsAt(blockPosition().relative(direction), blockState.getBlock());
                        }
                    }
                }
            }
        }
        super.startOpen(player);
    }
}