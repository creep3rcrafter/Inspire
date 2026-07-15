package net.github.creep3rcrafter.inspire.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;

public class ColorUtils {


    public static void dyeEntity(Entity entity, int colorID) {
        if (entity instanceof LivingEntity livingEntity) {
            if (!livingEntity.level().isClientSide) {
                if (livingEntity instanceof Sheep sheep) {
                    if (sheep.isAlive() && !sheep.isSheared() && sheep.getColor() != DyeColor.byId(colorID)) {
                        sheep.setColor(DyeColor.byId(colorID));
                    }
                }
                if (livingEntity instanceof Wolf wolf) {
                    if (wolf.isAlive() && wolf.isTame()) {
                        wolf.setCollarColor(DyeColor.byId(colorID));
                    }
                } else if (livingEntity instanceof Cat cat) {
                    if (cat.isAlive() && cat.isTame()) {
                        cat.setCollarColor(DyeColor.byId(colorID));
                    }
                }
                ItemStack itemStackHead = livingEntity.getItemBySlot(EquipmentSlot.HEAD);
                ItemStack itemStackChest = livingEntity.getItemBySlot(EquipmentSlot.CHEST);
                ItemStack itemStackLegs = livingEntity.getItemBySlot(EquipmentSlot.LEGS);
                ItemStack itemStackFeet = livingEntity.getItemBySlot(EquipmentSlot.FEET);
                if (itemStackHead.is(Items.LEATHER_HELMET)) {
                    itemStackHead.set(DataComponents.DYED_COLOR, new DyedItemColor(DyeColor.byId(colorID).getTextColor(), false));
                }
                if (itemStackChest.is(Items.LEATHER_CHESTPLATE) || itemStackChest.is(Items.LEATHER_HORSE_ARMOR)) {
                    itemStackChest.set(DataComponents.DYED_COLOR, new DyedItemColor(DyeColor.byId(colorID).getTextColor(), false));
                }
                if (itemStackLegs.is(Items.LEATHER_LEGGINGS)) {
                    itemStackLegs.set(DataComponents.DYED_COLOR, new DyedItemColor(DyeColor.byId(colorID).getTextColor(), false));
                }
                if (itemStackFeet.is(Items.LEATHER_BOOTS)) {
                    itemStackFeet.set(DataComponents.DYED_COLOR, new DyedItemColor(DyeColor.byId(colorID).getTextColor(), false));
                }
            }
        }
    }

    public static void dyeBlocks(LevelAccessor level, BlockPos blockPos, int colorID, BlockState blockState) {
        if (isWool(level, blockPos)) {
            setWool(level, blockPos, colorID, blockState);
        } else if (isConcrete(level, blockPos)) {
            setConcrete(level, blockPos, colorID, blockState);
        } else if (isConcretePowder(level, blockPos)) {
            setConcretePowder(level, blockPos, colorID, blockState);
        } else if (isCandle(level, blockPos)) {
            setCandle(level, blockPos, colorID, blockState);
        } else if (isBed(level, blockPos)) {
            setBed(level, blockPos, colorID, blockState);
        } else if (isCarpet(level, blockPos)) {
            setCarpet(level, blockPos, colorID, blockState);
        } else if (isTerracotta(level, blockPos)) {
            setTerracotta(level, blockPos, colorID, blockState);
        } else if (isGlazedTerracotta(level, blockPos)) {
            setGlazedTerracotta(level, blockPos, colorID, blockState);
        } else if (isCandleCake(level, blockPos)) {
            setCandleCake(level, blockPos, colorID, blockState);
        } else if (isShulkerBox(level, blockPos)) {
            setShulkerBox(level, blockPos, colorID, blockState);
        } else if (isGlass(level, blockPos)) {
            setGlass(level, blockPos, colorID, blockState);
        } else if (isGlassPane(level, blockPos)) {
            setGlassPane(level, blockPos, colorID, blockState);
        }
    }

    public static void setWool(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_WOOL.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_WOOL.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_WOOL.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setGlass(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_STAINED_GLASS.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setGlassPane(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_STAINED_GLASS_PANE.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setShulkerBox(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        ShulkerBoxBlockEntity shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
        NonNullList<ItemStack> itemStacks = shulkerBoxBlockEntity.getItems();
        Component name = shulkerBoxBlockEntity.getName();
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_SHULKER_BOX.withPropertiesOf(blockState), 3);
                shulkerBoxBlockEntity = (ShulkerBoxBlockEntity) level.getBlockEntity(blockPos);
                shulkerBoxBlockEntity.setItems(itemStacks);
                ((BaseContainerBlockEntity) shulkerBoxBlockEntity).name = name;
                shulkerBoxBlockEntity.setChanged();
                break;
        }
    }

    public static void setCandleCake(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_CANDLE_CAKE.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setTerracotta(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setGlazedTerracotta(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_GLAZED_TERRACOTTA.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setCarpet(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_CARPET.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_CARPET.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_CARPET.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setBanner(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_BANNER.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_BANNER.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setWallBanner(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_WALL_BANNER.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setConcrete(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_CONCRETE.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_CONCRETE.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setConcretePowder(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_CONCRETE_POWDER.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void setCandle(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        switch (color_id) {
            case 1:
                level.setBlock(blockPos, Blocks.ORANGE_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 2:
                level.setBlock(blockPos, Blocks.MAGENTA_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 3:
                level.setBlock(blockPos, Blocks.LIGHT_BLUE_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 4:
                level.setBlock(blockPos, Blocks.YELLOW_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 5:
                level.setBlock(blockPos, Blocks.LIME_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 6:
                level.setBlock(blockPos, Blocks.PINK_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 7:
                level.setBlock(blockPos, Blocks.GRAY_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 8:
                level.setBlock(blockPos, Blocks.LIGHT_GRAY_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 9:
                level.setBlock(blockPos, Blocks.CYAN_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 10:
                level.setBlock(blockPos, Blocks.PURPLE_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 11:
                level.setBlock(blockPos, Blocks.BLUE_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 12:
                level.setBlock(blockPos, Blocks.BROWN_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 13:
                level.setBlock(blockPos, Blocks.GREEN_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 14:
                level.setBlock(blockPos, Blocks.RED_CANDLE.withPropertiesOf(blockState), 3);
                break;
            case 15:
                level.setBlock(blockPos, Blocks.BLACK_CANDLE.withPropertiesOf(blockState), 3);
                break;
            default:
                level.setBlock(blockPos, Blocks.WHITE_CANDLE.withPropertiesOf(blockState), 3);
                break;
        }
    }

    public static void removeBedNoDrops(LevelAccessor level, BlockPos blockPos, BlockState blockState) {
        if (blockState.getValue(BedBlock.PART) == BedPart.HEAD) {
            level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
            level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.AIR.defaultBlockState(), 3);
        } else {
            level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.AIR.defaultBlockState(), 3);
            level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
        }
    }

    public static void setBed(LevelAccessor level, BlockPos blockPos, int color_id, BlockState blockState) {
        BlockState blockState2 = level.getBlockState(blockPos.relative(BedBlock.getConnectedDirection(blockState)));
        switch (color_id) {
            case 1:
                if (!blockState.is(Blocks.ORANGE_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.ORANGE_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.ORANGE_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 2:
                if (!blockState.is(Blocks.MAGENTA_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.MAGENTA_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.MAGENTA_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 3:
                if (!blockState.is(Blocks.LIGHT_BLUE_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.LIGHT_BLUE_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.LIGHT_BLUE_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 4:
                if (!blockState.is(Blocks.YELLOW_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.YELLOW_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.YELLOW_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 5:
                if (!blockState.is(Blocks.LIME_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.LIME_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.LIME_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 6:
                if (!blockState.is(Blocks.PINK_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.PINK_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.PINK_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 7:
                if (!blockState.is(Blocks.GRAY_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.GRAY_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.GRAY_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 8:
                if (!blockState.is(Blocks.LIGHT_GRAY_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.LIGHT_GRAY_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.LIGHT_GRAY_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 9:
                if (!blockState.is(Blocks.CYAN_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.CYAN_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.CYAN_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 10:
                if (!blockState.is(Blocks.PURPLE_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.PURPLE_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.PURPLE_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 11:
                if (!blockState.is(Blocks.BLUE_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.BLUE_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.BLUE_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 12:
                if (!blockState.is(Blocks.BROWN_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.BROWN_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.BROWN_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 13:
                if (!blockState.is(Blocks.GREEN_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.GREEN_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.GREEN_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 14:
                if (!blockState.is(Blocks.RED_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.RED_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.RED_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            case 15:
                if (!blockState.is(Blocks.BLACK_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.BLACK_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.BLACK_BED.withPropertiesOf(blockState2), 3);
                }
                break;
            default:
                if (!blockState.is(Blocks.WHITE_BED)) {
                    removeBedNoDrops(level, blockPos, blockState);
                    level.setBlock(blockPos, Blocks.WHITE_BED.withPropertiesOf(blockState), 3);
                    level.setBlock(blockPos.relative(BedBlock.getConnectedDirection(blockState)), Blocks.WHITE_BED.withPropertiesOf(blockState2), 3);
                }
                break;
        }
    }

    public static boolean isWool(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.LIME_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.PINK_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_WOOL)) {
            return true;
        } else if (blockState.is(Blocks.RED_WOOL)) {
            return true;
        } else return blockState.is(Blocks.BLACK_WOOL);
    }

    public static boolean isGlass(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.LIME_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.PINK_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.RED_STAINED_GLASS)) {
            return true;
        } else if (blockState.is(Blocks.BLACK_STAINED_GLASS)) {
            return true;
        } else return blockState.is(Blocks.GLASS);
    }

    public static boolean isGlassPane(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.LIME_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.PINK_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.RED_STAINED_GLASS_PANE)) {
            return true;
        } else if (blockState.is(Blocks.BLACK_STAINED_GLASS_PANE)) {
            return true;
        } else return blockState.is(Blocks.GLASS_PANE);
    }

    public static boolean isShulkerBox(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.LIME_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.PINK_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.RED_SHULKER_BOX)) {
            return true;
        } else if (blockState.is(Blocks.BLACK_SHULKER_BOX)) {
            return true;
        } else return blockState.is(Blocks.SHULKER_BOX);
    }

    public static boolean isCandleCake(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.LIME_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.PINK_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_CANDLE_CAKE)) {
            return true;
        } else if (blockState.is(Blocks.RED_CANDLE_CAKE)) {
            return true;
        } else return blockState.is(Blocks.BLACK_CANDLE_CAKE);
    }

    public static boolean isTerracotta(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIME_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.PINK_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.RED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.BLACK_TERRACOTTA)) {
            return true;
        } else return blockState.is(Blocks.TERRACOTTA);
    }

    public static boolean isGlazedTerracotta(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIME_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.PINK_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_GLAZED_TERRACOTTA)) {
            return true;
        } else if (blockState.is(Blocks.RED_GLAZED_TERRACOTTA)) {
            return true;
        } else return blockState.is(Blocks.BLACK_GLAZED_TERRACOTTA);
    }

    public static boolean isBed(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_BED)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_BED)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_BED)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_BED)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_BED)) {
            return true;
        } else if (blockState.is(Blocks.LIME_BED)) {
            return true;
        } else if (blockState.is(Blocks.PINK_BED)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_BED)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_BED)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_BED)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_BED)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_BED)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_BED)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_BED)) {
            return true;
        } else if (blockState.is(Blocks.RED_BED)) {
            return true;
        } else return blockState.is(Blocks.BLACK_BED);
    }

    public static boolean isCarpet(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.LIME_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.PINK_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_CARPET)) {
            return true;
        } else if (blockState.is(Blocks.RED_CARPET)) {
            return true;
        } else return blockState.is(Blocks.BLACK_CARPET);
    }

    public static boolean isCandle(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.LIME_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.PINK_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.RED_CANDLE)) {
            return true;
        } else if (blockState.is(Blocks.BLACK_CANDLE)) {
            return true;
        } else return blockState.is(Blocks.CANDLE);
    }

    public static boolean isBanner(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIME_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.PINK_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.RED_BANNER)) {
            return true;
        } else return blockState.is(Blocks.BLACK_BANNER);
    }

    public static boolean isWallBanner(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIME_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.PINK_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_WALL_BANNER)) {
            return true;
        } else if (blockState.is(Blocks.RED_WALL_BANNER)) {
            return true;
        } else return blockState.is(Blocks.BLACK_WALL_BANNER);
    }

    public static boolean isConcrete(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.LIME_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.PINK_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_CONCRETE)) {
            return true;
        } else if (blockState.is(Blocks.RED_CONCRETE)) {
            return true;
        } else return blockState.is(Blocks.BLACK_CONCRETE);
    }

    public static boolean isConcretePowder(LevelAccessor level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState.is(Blocks.WHITE_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.ORANGE_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.MAGENTA_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_BLUE_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.YELLOW_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.LIME_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.PINK_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.GRAY_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.LIGHT_GRAY_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.CYAN_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.PURPLE_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.BLUE_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.BROWN_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.GREEN_CONCRETE_POWDER)) {
            return true;
        } else if (blockState.is(Blocks.RED_CONCRETE_POWDER)) {
            return true;
        } else return blockState.is(Blocks.BLACK_CONCRETE_POWDER);
    }
}
