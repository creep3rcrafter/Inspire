package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.github.creep3rcrafter.inspire.block.BluestoneWireBlock;
import net.github.creep3rcrafter.inspire.block.ChromaticLampBlock;
import net.github.creep3rcrafter.inspire.block.SoulGlassBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.Nullable;

public class InspireBlockColors {
    public static final BlockColor CHROMATIC_LAMP;
    public static final BlockColor BLUESTONE_WIRE;
    public static final BlockColor SOUL_GLASS;

    static {
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
            }
        };
        SOUL_GLASS = new BlockColor() {
            @Override
            public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
                int brightness = blockState.getValue(SoulGlassBlock.BRIGHTNESS);
                float f = (float) brightness / 15.0F;
                float r = (f > 0.98F ? 0.5F : 0.1F);
                float g = (0.4f + f) * 0.6f;
                float b = (0.4f + f) * 0.7f;
                return ((int)(r * 255) << 16) | ((int)(g * 255) << 8) | (int)(b * 255);
            }
        };
        ColorHandlerRegistry.registerBlockColors(BLUESTONE_WIRE, InspireBlocks.BLUESTONE_WIRE.get().defaultBlockState().getBlock());
        ColorHandlerRegistry.registerBlockColors(SOUL_GLASS, InspireBlocks.SOUL_GLASS.get().defaultBlockState().getBlock());
    }
}
