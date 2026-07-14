package net.github.creep3rcrafter.inspire.client.register;

import net.github.creep3rcrafter.inspire.block.BluestoneWireBlock;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class InspireColors {
    public static final BlockColor BLUESTONE_WIRE;

    static {
        BLUESTONE_WIRE = (state, world, pos, tintIndex) -> BluestoneWireBlock.getColorForPower(state.getValue(BlockStateProperties.POWER));

        ColorHandlerRegistry.registerBlockColors(BLUESTONE_WIRE, InspireBlocks.BLUESTONE_WIRE.get());
    }

    public static int color(float f, float g, float h) {
        return color(Mth.floor(f * 255.0F), Mth.floor(g * 255.0F), Mth.floor(h * 255.0F));
    }

    public static int color(int i, int j, int k) {
        int l = (i << 8) + j;
        l = (l << 8) + k;
        return l;
    }
}