package net.github.creep3rcrafter.inspire.entity;

import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.RideableInventory;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class EnderChestBoatEntity extends BoatEntity implements RideableInventory, NamedScreenHandlerFactory {
    public static final Text CONTAINER_TITLE;

    static {
        CONTAINER_TITLE = Text.translatable("container.enderchest");
    }

    public EnderChestBoatEntity(EntityType<? extends EnderChestBoatEntity> entityType, World level) {
        super(entityType, level);
    }

    public EnderChestBoatEntity(World world, double d, double e, double f) {
        this(InspireEntityTypes.ENDER_CHEST_BOAT.get(), world);
        this.setPos(d, e, f);
        this.prevX = d;
        this.prevY = e;
        this.prevZ = f;
    }

    @Override
    protected float getPassengerHorizontalOffset() {
        return 0.15F;
    }

    @Override
    protected int getMaxPassengers() {
        return 1;
    }

    @Override
    public ActionResult interact(PlayerEntity player, Hand hand) {
        return this.canAddPassenger(player) && !player.shouldCancelInteraction() ? super.interact(player, hand) : this.interactWithChestVehicle(this::emitGameEvent, player);
    }

    public ActionResult interactWithChestVehicle(BiConsumer<GameEvent, Entity> biConsumer, PlayerEntity player) {
        player.openHandledScreen(this);
        if (!player.getWorld().isClient()) {
            biConsumer.accept(GameEvent.CONTAINER_OPEN, player);
            PiglinBrain.onGuardedBlockInteracted(player, true);
            return ActionResult.CONSUME;
        } else {
            return ActionResult.SUCCESS;
        }
    }

    @Override
    @Nullable
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        if (playerEntity.isSpectator()) {
            return null;
        } else {
            EnderChestInventory EnderChestInventory = playerEntity.getEnderChestInventory();
            return GenericContainerScreenHandler.createGeneric9x3(i, playerInventory, EnderChestInventory);
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

    @Override
    public void openInventory(PlayerEntity player) {
        player.openHandledScreen(this);
        if (!player.getWorld().isClient()) {
            this.emitGameEvent(GameEvent.CONTAINER_OPEN, player);
            PiglinBrain.onGuardedBlockInteracted(player, true);
        }
    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();
    }
}
