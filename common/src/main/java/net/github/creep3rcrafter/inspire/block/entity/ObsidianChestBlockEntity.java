package net.github.creep3rcrafter.inspire.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;

public class ObsidianChestBlockEntity extends RandomizableContainerBlockEntity implements LidBlockEntity {

    private static final int EVENT_SET_OPEN_COUNT = 1;
    private final ContainerOpenersCounter openersCounter;
    private final ChestLidController chestLidController;
    private NonNullList<ItemStack> items;

    protected ObsidianChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
        this.items = NonNullList.withSize(27, ItemStack.EMPTY);
        this.openersCounter = new ContainerOpenersCounter() {
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                ObsidianChestBlockEntity.playSound(level, blockPos, blockState, SoundEvents.CHEST_OPEN);
            }

            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                ObsidianChestBlockEntity.playSound(level, blockPos, blockState, SoundEvents.CHEST_CLOSE);
            }

            protected void openerCountChanged(Level level, BlockPos blockPos, BlockState blockState, int i, int j) {
                ObsidianChestBlockEntity.this.signalOpenCount(level, blockPos, blockState, i, j);
            }

            protected boolean isOwnContainer(Player player) {
                if (!(player.containerMenu instanceof ChestMenu)) {
                    return false;
                } else {
                    Container container = ((ChestMenu) player.containerMenu).getContainer();
                    return container == ObsidianChestBlockEntity.this || container instanceof CompoundContainer && ((CompoundContainer) container).contains(ObsidianChestBlockEntity.this);
                }
            }
        };
        this.chestLidController = new ChestLidController();
    }

    public ObsidianChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        this(BlockEntityType.CHEST, blockPos, blockState);
    }

    public static void lidAnimateTick(Level ignoredLevel, BlockPos ignoredBlockPos, BlockState ignoredBlockState, ObsidianChestBlockEntity chestBlockEntity) {
        chestBlockEntity.chestLidController.tickLid();
    }

    static void playSound(Level level, BlockPos blockPos, BlockState blockState, SoundEvent soundEvent) {
        ChestType chestType = blockState.getValue(ChestBlock.TYPE);
        if (chestType != ChestType.LEFT) {
            double d = (double) blockPos.getX() + 0.5;
            double e = (double) blockPos.getY() + 0.5;
            double f = (double) blockPos.getZ() + 0.5;
            if (chestType == ChestType.RIGHT) {
                Direction direction = ChestBlock.getConnectedDirection(blockState);
                d += (double) direction.getStepX() * 0.5;
                f += (double) direction.getStepZ() * 0.5;
            }

            level.playSound((Player) null, d, e, f, soundEvent, SoundSource.BLOCKS, 0.5F, level.random.nextFloat() * 0.1F + 0.9F);
        }
    }

    public static int getOpenCount(BlockGetter blockGetter, BlockPos blockPos) {
        BlockState blockState = blockGetter.getBlockState(blockPos);
        if (blockState.hasBlockEntity()) {
            BlockEntity blockEntity = blockGetter.getBlockEntity(blockPos);
            if (blockEntity instanceof ObsidianChestBlockEntity) {
                return ((ObsidianChestBlockEntity) blockEntity).openersCounter.getOpenerCount();
            }
        }

        return 0;
    }

    public static void swapContents(ObsidianChestBlockEntity chestBlockEntity, ObsidianChestBlockEntity chestBlockEntity2) {
        NonNullList<ItemStack> nonNullList = chestBlockEntity.getItems();
        chestBlockEntity.setItems(chestBlockEntity2.getItems());
        chestBlockEntity2.setItems(nonNullList);
    }

    public int getContainerSize() {
        return 27;
    }

    protected Component getDefaultName() {
        return Component.translatable("container.chest");
    }

    public void loadAdditional(CompoundTag compoundTag, HolderLookup.Provider registries) {
        super.loadAdditional(compoundTag, registries);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(compoundTag)) {
            ContainerHelper.loadAllItems(compoundTag, this.items, registries);
        }

    }

    protected void saveAdditional(CompoundTag compoundTag, HolderLookup.Provider registries) {
        super.saveAdditional(compoundTag, registries);
        if (!this.trySaveLootTable(compoundTag)) {
            ContainerHelper.saveAllItems(compoundTag, this.items, registries);
        }

    }

    public boolean triggerEvent(int i, int j) {
        if (i == 1) {
            this.chestLidController.shouldBeOpen(j > 0);
            return true;
        } else {
            return super.triggerEvent(i, j);
        }
    }

    public void startOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.incrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void stopOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.decrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    protected void setItems(NonNullList<ItemStack> nonNullList) {
        this.items = nonNullList;
    }

    public float getOpenNess(float f) {
        return this.chestLidController.getOpenness(f);
    }

    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return ChestMenu.threeRows(i, inventory, this);
    }

    public void recheckOpen() {
        if (!this.remove) {
            this.openersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    protected void signalOpenCount(Level level, BlockPos blockPos, BlockState blockState, int i, int j) {
        Block block = blockState.getBlock();
        level.blockEvent(blockPos, block, 1, j);
    }
}
