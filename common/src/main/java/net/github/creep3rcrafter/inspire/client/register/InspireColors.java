package net.github.creep3rcrafter.inspire.client.register;

import com.github.creep3rcrafter.inspire.block.BluestoneWireBlock;
import com.github.creep3rcrafter.inspire.register.InspireBlocks;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.MathHelper;

public class InspireColors {
    public static final BlockColorProvider BLUESTONE_WIRE;

    static {
        BLUESTONE_WIRE = (state, world, pos, tintIndex) -> BluestoneWireBlock.getColorForPower(state.get(Properties.POWER));

        ColorHandlerRegistry.registerBlockColors(BLUESTONE_WIRE, InspireBlocks.BLUESTONE_WIRE.get());
    }

    public static int color(float f, float g, float h) {
        return color(MathHelper.floor(f * 255.0F), MathHelper.floor(g * 255.0F), MathHelper.floor(h * 255.0F));
    }

    public static int color(int i, int j, int k) {
        int l = (i << 8) + j;
        l = (l << 8) + k;
        return l;
    }
}