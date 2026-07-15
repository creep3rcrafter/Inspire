package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionContents;
import org.jetbrains.annotations.NotNull;

public class InspireItemColors {
    public static ItemColor POTION_JAR;
    public static ItemColor SOUL_GLASS;

    static {
        POTION_JAR = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                return i == 0 ? itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).getColor() : -1;
            }
        };
        SOUL_GLASS = new ItemColor() {
            @Override
            public int getColor(@NotNull ItemStack itemStack, int i) {
                //int brightness = itemStack.getOrCreateTag().getCompound("BlockStateTag").getInt("brightness");
                float r = 0.5F;
                float g = (0.4f + 1) * 0.6f;
                float b = (0.4f + 1) * 0.7f;
                return ((int)(r * 255) & 0xFF) << 16 | ((int)(g * 255) & 0xFF) << 8 | ((int)(b * 255) & 0xFF);
            }
        };
        ColorHandlerRegistry.registerItemColors(POTION_JAR, InspireItems.POTION_JAR.get());
        ColorHandlerRegistry.registerItemColors(SOUL_GLASS, InspireItems.SOUL_GLASS.get());
    }
}
