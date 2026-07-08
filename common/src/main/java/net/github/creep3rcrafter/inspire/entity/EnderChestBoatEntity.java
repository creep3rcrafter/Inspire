package net.github.creep3rcrafter.inspire.entity;

import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class EnderChestBoatEntity extends Boat implements MenuProvider {
    public static final Component CONTAINER_TITLE = Component.translatable("container.enderchest");

    public EnderChestBoatEntity(EntityType<? extends EnderChestBoatEntity> entityType, Level level) {
        super(entityType, level);
    }

    public EnderChestBoatEntity(Level level, double d, double e, double f) {
        this(InspireEntityTypes.ENDER_CHEST_BOAT.get(), level);
        this.setPos(d, e, f);
        this.xo = d;
        this.yo = e;
        this.zo = f;
    }

    @Override
    protected float getSinglePassengerXOffset() {
        return 0.15F;
    }

    @Override
    protected int getMaxPassengers() {
        return 1;
    }

    @Override
    public InteractionResult interact(Player player, InteractionHand hand) {
        return this.canAddPassenger(player) && !player.isSecondaryUseActive() ? super.interact(player, hand) : this.interactWithChestVehicle(this::gameEvent, player);
    }

    public InteractionResult interactWithChestVehicle(BiConsumer<GameEvent, Entity> biConsumer, Player player) {
        player.openMenu(this);
        if (!player.level().isClientSide) {
            biConsumer.accept(GameEvent.CONTAINER_OPEN, player);
            PiglinAi.angerNearbyPiglins(player, true);
            return InteractionResult.CONSUME;
        } else {
            return InteractionResult.SUCCESS;
        }
    }

    @Override
    public Component getDisplayName() {
        return CONTAINER_TITLE;
    }

    @Override
    @Nullable
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        if (player.isSpectator()) {
            return null;
        } else {
            PlayerEnderChestContainer enderChestInventory = player.getEnderChestInventory();
            return ChestMenu.threeRows(i, inventory, enderChestInventory);
        }
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

    public void openInventory(Player player) {
        player.openMenu(this);
        if (!player.level().isClientSide) {
            this.gameEvent(GameEvent.CONTAINER_OPEN, player);
            PiglinAi.angerNearbyPiglins(player, true);
        }
    }

    @Override
    public boolean isFlapping() {
        return super.isFlapping();
    }
}
