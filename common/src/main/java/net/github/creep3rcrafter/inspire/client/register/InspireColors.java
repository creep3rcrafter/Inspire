package net.github.creep3rcrafter.inspire.client.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.github.creep3rcrafter.inspire.block.BluestoneWireBlock;
import net.github.creep3rcrafter.inspire.block.ChromaticLampBlock;
import net.github.creep3rcrafter.inspire.block.SoulGlassBlock;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;

public class InspireColors {
    public static final BlockColor BLUESTONE_WIRE;
    public static final BlockColor SOUL_GLASS;
    public static final BlockColor CHROMATIC_LAMP;
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
        //ColorHandlerRegistry.registerBlockColors(CHROMATIC_LAMP, InspireBlocks.SOUL_GLASS.get());
    }
}