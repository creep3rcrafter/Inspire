package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class InspireCreativeTabs {
    public static final CreativeModeTab TAB_INSPIRE;

    static {
        TAB_INSPIRE = CreativeTabRegistry.create(new ResourceLocation(InspireCommon.MOD_ID, "inspire"), () -> {
            ItemStack itemStack = new ItemStack(InspireItems.CUSTOM_ARROW.get());
            itemStack.getOrCreateTag().putFloat("rod", 0.1f);
            itemStack.getOrCreateTag().putFloat("tail", 0.05f);
            return itemStack.copy();
        });
    }
}
