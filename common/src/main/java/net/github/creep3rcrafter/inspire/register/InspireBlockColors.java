package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class InspireBlockColors {
    public static final BlockColor CHROMATIC_LAMP;
    public static final BlockColor BLUESTONE_WIRE;
    public static final BlockColor SOUL_GLASS;
    //public static final BlockColor GLOWSTONE_WIRE;
    //public static final BlockColor SOULSTONE_WIRE;

    static {
        /*
        SOULSTONE_WIRE = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                return SoulstoneWireBlock.getColorForPower(blockState.getValue(RedStoneWireBlock.POWER));
            }
        };
        GLOWSTONE_WIRE = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                return GlowstoneWireBlock.getColorForPower(blockState.getValue(RedStoneWireBlock.POWER));
            }
        };
         */
        BLUESTONE_WIRE = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                return BluestoneWireBlock.getColorForPower(blockState.getValue(RedStoneWireBlock.POWER));
            }
        };
        CHROMATIC_LAMP = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                return switch (blockState.getValue(ChromaticLampBlock.COLOR)) {
                    case 1 -> MaterialColor.COLOR_GRAY.col;
                    case 2 -> MaterialColor.COLOR_LIGHT_GRAY.col;
                    case 3 -> MaterialColor.COLOR_BROWN.col;
                    case 4 -> MaterialColor.COLOR_RED.col;
                    case 5 -> MaterialColor.COLOR_ORANGE.col;
                    case 6 -> MaterialColor.COLOR_YELLOW.col;
                    case 7 -> MaterialColor.COLOR_LIGHT_GREEN.col;
                    case 8 -> MaterialColor.COLOR_GREEN.col;
                    case 9 -> MaterialColor.COLOR_CYAN.col;
                    case 10 -> MaterialColor.COLOR_LIGHT_BLUE.col;
                    case 11 -> MaterialColor.COLOR_BLUE.col;
                    case 12 -> MaterialColor.COLOR_PURPLE.col;
                    case 13 -> MaterialColor.COLOR_MAGENTA.col;
                    case 14 -> MaterialColor.COLOR_PINK.col;
                    case 15 -> 16777215;
                    default -> MaterialColor.COLOR_BLACK.col;
                };
            }
        };
        SOUL_GLASS = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                int brightness = blockState.getValue(SoulGlassBlock.BRIGHTNESS);
                float f = (float) brightness / 15.0F;
                float r = (f > 0.98F ? 0.5F : 0.1F);//Mth.map(0f, 15f, 0f, 0.3f, f);
                float g = (0.4f + f) * 0.6f;
                float b = (0.4f + f) * 0.7f;
                return Color.ofRGB(r, g, b).getColor();
            }
        };
        //ColorHandlerRegistry.registerBlockColors(CHROMATIC_LAMP, InspireBlocks.CHROMATIC_LAMP.get().defaultBlockState().getBlock());
        ColorHandlerRegistry.registerBlockColors(BLUESTONE_WIRE, InspireBlocks.BLUESTONE_WIRE.get().defaultBlockState().getBlock());
        ColorHandlerRegistry.registerBlockColors(SOUL_GLASS, InspireBlocks.SOUL_GLASS.get().defaultBlockState().getBlock());
        //ColorHandlerRegistry.registerBlockColors(GLOWSTONE_WIRE, InspireBlocks.GLOWSTONE_WIRE.get().defaultBlockState().getBlock());
        //ColorHandlerRegistry.registerBlockColors(SOULSTONE_WIRE, InspireBlocks.SOULSTONE_WIRE.get().defaultBlockState().getBlock());
    }
}
