package net.github.creep3rcrafter.inspire.client.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.github.creep3rcrafter.inspire.block.*;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.NotNull;

public class InspireColors {
    public static final BlockColor BLUESTONE_WIRE;
    public static final BlockColor SOUL_GLASS;
    public static final BlockColor CHROMATIC_LAMP;
    public static final BlockColor SOUL_LEAVES;
    public static final BlockColor SOUL_HEDGE;
    public static final BlockColor SOUL_GRASS;
    static {
        BLUESTONE_WIRE = (state, world, pos, tintIndex) -> BluestoneWireBlock.getColorForPower(state.getValue(BlockStateProperties.POWER));
        SOUL_GLASS = (state, world, pos, tintIndex) -> {
            int brightness = state.getValue(SoulGlassBlock.BRIGHTNESS);
            float f = (float) brightness / 15.0F;
            float r = (f > 0.98F ? 0.5F : 0.1F);//Mth.map(0f, 15f, 0f, 0.3f, f);
            float g = (0.4f + f) * 0.6f;
            float b = (0.4f + f) * 0.7f;
            return Mth.color(r, g, b);
        };
        SOUL_LEAVES = (state, world, pos, tintIndex) -> {
            float f = (float) state.getValue(SoulLeavesBlock.SOUL_LEVEL) / 15.0F;
            // Transitions from near-black (f=0) to light blue (f=1)
            float r = 0.25f + f * 0.25f;
            float g = 0.25f + f * 0.75f;
            float b = 0.25f + f * 0.75f;
            return Mth.color(r, g, b);
        };
        SOUL_HEDGE = (state, world, pos, tintIndex) -> {
            float f = (float) state.getValue(SoulHedgeBlock.SOUL_LEVEL) / 8.0F;
            // Transitions from near-black (f=0) to light blue (f=1)
            float r = 0.25f + f * 0.25f;
            float g = 0.25f + f * 0.75f;
            float b = 0.25f + f * 0.75f;
            return Mth.color(r, g, b);
        };
        SOUL_GRASS = (state, world, pos, tintIndex) -> tintIndex == 0 ? Mth.color(0.09f, 0.84f, 0.9f) : -1;
        CHROMATIC_LAMP  = (state, world, pos, tintIndex) -> switch (state.getValue(ChromaticLampBlock.COLOR)) {
            case 1 -> MapColor.COLOR_GRAY.col;
            case 2 -> MapColor.COLOR_LIGHT_GRAY.col;
            case 3 -> MapColor.COLOR_BROWN.col;
            case 4 -> MapColor.COLOR_RED.col;
            case 5 -> MapColor.COLOR_ORANGE.col;
            case 6 -> MapColor.COLOR_YELLOW.col;
            case 7 -> MapColor.COLOR_LIGHT_GREEN.col;
            case 8 -> MapColor.COLOR_GREEN.col;
            case 9 -> MapColor.COLOR_CYAN.col;
            case 10 -> MapColor.COLOR_LIGHT_BLUE.col;
            case 11 -> MapColor.COLOR_BLUE.col;
            case 12 -> MapColor.COLOR_PURPLE.col;
            case 13 -> MapColor.COLOR_MAGENTA.col;
            case 14 -> MapColor.COLOR_PINK.col;
            case 15 -> 16777215;
            default -> MapColor.COLOR_BLACK.col;
        };
        ColorHandlerRegistry.registerBlockColors(BLUESTONE_WIRE, InspireBlocks.BLUESTONE_WIRE.get());
        ColorHandlerRegistry.registerBlockColors(SOUL_GLASS, InspireBlocks.SOUL_GLASS.get());
        ColorHandlerRegistry.registerBlockColors(SOUL_LEAVES, InspireBlocks.SOUL_LEAVES.get());
        ColorHandlerRegistry.registerBlockColors(SOUL_HEDGE, InspireBlocks.SOUL_HEDGE.get());
        ColorHandlerRegistry.registerBlockColors(SOUL_GRASS,
                InspireBlocks.SOUL_GRASS_BLOCK.get(),
                InspireBlocks.SOUL_GRASS.get(),
                InspireBlocks.SHORT_SOUL_GRASS.get(),
                InspireBlocks.TALL_SOUL_GRASS.get()
        );
        //ColorHandlerRegistry.registerBlockColors(CHROMATIC_LAMP, InspireBlocks.SOUL_GLASS.get());
        // Hedge foliage biome colors
        BlockColor foliage = (state, level, pos, tintIndex) ->
                level != null && pos != null ? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.getDefaultColor();
        ColorHandlerRegistry.registerBlockColors(foliage,
                InspireBlocks.OAK_HEDGE.get(),
                InspireBlocks.JUNGLE_HEDGE.get(),
                InspireBlocks.ACACIA_HEDGE.get(),
                InspireBlocks.DARK_OAK_HEDGE.get(),
                InspireBlocks.MANGROVE_HEDGE.get()
        );
        ColorHandlerRegistry.registerBlockColors(
                (state, level, pos, tintIndex) -> FoliageColor.getEvergreenColor(),
                InspireBlocks.SPRUCE_HEDGE.get()
        );
        ColorHandlerRegistry.registerBlockColors(
                (state, level, pos, tintIndex) -> FoliageColor.getBirchColor(),
                InspireBlocks.BIRCH_HEDGE.get()
        );
        /*
        ColorHandlerRegistry.registerBlockColors(
                (state, level, pos, tintIndex) -> Mth.color(0.08f, 0.15f, 0.35f),
                InspireBlocks.SOUL_HEDGE.get()
        );
         */
    }
    public static ItemColor POTION_JAR;
    public static ItemColor SOUL_GLASS_ITEM;

    static {
        POTION_JAR = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                return i == 0 ? itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).getColor() : -1;
            }
        };
        SOUL_GLASS_ITEM = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                //int brightness = itemStack.getOrCreateTag().getCompound("BlockStateTag").getInt("brightness");
                float r = 0.5F;
                float g = (0.4f + 1) * 0.6f;
                float b = (0.4f + 1) * 0.7f;
                return ((int) (r * 255) & 0xFF) << 16 | ((int) (g * 255) & 0xFF) << 8 | ((int) (b * 255) & 0xFF);
            }
        };
        ColorHandlerRegistry.registerItemColors(POTION_JAR, InspireItems.POTION_JAR.get());
        ColorHandlerRegistry.registerItemColors(SOUL_GLASS_ITEM, InspireItems.SOUL_GLASS.get());
        ColorHandlerRegistry.registerItemColors(
                (stack, tintIndex) -> tintIndex == 0 ? Mth.color(0.09f, 0.84f, 0.9f) : -1,
                InspireItems.SOUL_GRASS_BLOCK.get(),
                InspireItems.SOUL_GRASS.get(),
                InspireItems.SHORT_SOUL_GRASS.get(),
                InspireItems.TALL_SOUL_GRASS.get()
        );
        ColorHandlerRegistry.registerItemColors(
                (stack, tintIndex) -> Mth.color(0.0f, 0.0f, 0.12f),
                InspireItems.SOUL_LEAVES.get()
        );
        // Hedge item foliage colors (inventory tinting)
        ItemColor foliageItem = (stack, tintIndex) -> FoliageColor.getDefaultColor();
        ColorHandlerRegistry.registerItemColors(foliageItem,
                InspireItems.OAK_HEDGE.get(),
                InspireItems.JUNGLE_HEDGE.get(),
                InspireItems.ACACIA_HEDGE.get(),
                InspireItems.DARK_OAK_HEDGE.get(),
                InspireItems.MANGROVE_HEDGE.get(),
                InspireItems.PALE_OAK_HEDGE.get()
        );
        ColorHandlerRegistry.registerItemColors(
                (stack, tintIndex) -> FoliageColor.getEvergreenColor(),
                InspireItems.SPRUCE_HEDGE.get()
        );
        ColorHandlerRegistry.registerItemColors(
                (stack, tintIndex) -> FoliageColor.getBirchColor(),
                InspireItems.BIRCH_HEDGE.get()
        );
        ColorHandlerRegistry.registerItemColors(
                (stack, tintIndex) -> Mth.color(0.08f, 0.15f, 0.35f),
                InspireItems.SOUL_HEDGE.get()
        );
    }
}