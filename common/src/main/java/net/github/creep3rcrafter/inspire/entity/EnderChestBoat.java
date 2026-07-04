package net.github.creep3rcrafter.inspire.entity;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.HasCustomInventoryScreen;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class EnderChestBoat extends Boat implements HasCustomInventoryScreen, MenuProvider {
    public static final Component CONTAINER_TITLE;

    static {
        CONTAINER_TITLE = Component.translatable("container.enderchest");
    }

    public EnderChestBoat(EntityType<? extends EnderChestBoat> entityType, Level level) {
        super(entityType, level);
    }

    public EnderChestBoat(Level level, double d, double e, double f) {
        this(InspireEntityTypes.ENDER_CHEST_BOAT.get(), level);
        this.setPos(d, e, f);
        this.xo = d;
        this.yo = e;
        this.zo = f;
    }

    public float getSinglePassengerXOffset() {
        return 0.15F;
    }

    public int getMaxPassengers() {
        return 1;
    }

    @Override
    public @NotNull InteractionResult interact(Player player, InteractionHand interactionHand) {
        return this.canAddPassenger(player) && !player.isSecondaryUseActive() ? super.interact(player, interactionHand) : this.interactWithChestVehicle(this::gameEvent, player);
    }

    public InteractionResult interactWithChestVehicle(BiConsumer<GameEvent, Entity> biConsumer, Player player) {
        player.openMenu(this);
        if (!player.level.isClientSide) {
            biConsumer.accept(GameEvent.CONTAINER_OPEN, player);
            PiglinAi.angerNearbyPiglins(player, true);
            return InteractionResult.CONSUME;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        if (player.isSpectator()) {
            return null;
        } else {
            PlayerEnderChestContainer playerEnderChestContainer = player.getEnderChestInventory();
            return ChestMenu.threeRows(i, inventory, playerEnderChestContainer);
        }
    }

    @Override
    public @NotNull Item getDropItem() {
        Item item;
        if (this.getBoatType() == Type.byName("crimson")) {
            return InspireItems.CRIMSON_ENDER_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("warped")) {
            return InspireItems.WARPED_ENDER_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("withered")) {
            return InspireItems.WITHERED_ENDER_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("pine")) {
            return InspireItems.PINE_ENDER_CHEST_BOAT.get();
        } else if (this.getBoatType() == Type.byName("redwood")) {
            return InspireItems.REDWOOD_ENDER_CHEST_BOAT.get();
        }
        item = switch (this.getBoatType()) {
            case SPRUCE -> InspireItems.SPRUCE_ENDER_CHEST_BOAT.get();
            case BIRCH -> InspireItems.BIRCH_ENDER_CHEST_BOAT.get();
            case JUNGLE -> InspireItems.JUNGLE_ENDER_CHEST_BOAT.get();
            case ACACIA -> InspireItems.ACACIA_ENDER_CHEST_BOAT.get();
            case DARK_OAK -> InspireItems.DARK_OAK_ENDER_CHEST_BOAT.get();
            case MANGROVE -> InspireItems.MANGROVE_ENDER_CHEST_BOAT.get();
            default -> InspireItems.OAK_ENDER_CHEST_BOAT.get();
        };

        return item;
    }

    @Override
    public void openCustomInventoryScreen(Player player) {
        player.openMenu(this);
        if (!player.level.isClientSide) {
            this.gameEvent(GameEvent.CONTAINER_OPEN, player);
            PiglinAi.angerNearbyPiglins(player, true);
        }

    }
}
