package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class InspireItemColors {
    public static ItemColor POTION_JAR;
    public static ItemColor SOUL_GLASS;

    static {
        POTION_JAR = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                return i == 0 ? PotionUtils.getColor(itemStack) : -1;
            }
        };
        SOUL_GLASS = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                //int brightness = itemStack.getOrCreateTag().getCompound("BlockStateTag").getInt("brightness");
                float r = 0.5F;//Mth.map(0f, 15f, 0f, 0.3f, f);
                float g = (0.4f + 1) * 0.6f;
                float b = (0.4f + 1) * 0.7f;
                return Color.ofRGB(r, g, b).getColor();
            }
        };
        ColorHandlerRegistry.registerItemColors(POTION_JAR, InspireItems.POTION_JAR.get());
        ColorHandlerRegistry.registerItemColors(SOUL_GLASS, InspireItems.SOUL_GLASS.get());
    }
}
