package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class InspireCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(InspireCommon.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> TAB_INSPIRE = TABS.register(
            "inspire",
            () -> CreativeTabRegistry.create(
                    Component.translatable("itemGroup." + InspireCommon.MOD_ID + ".inspire"), // Title
                    () -> new ItemStack(InspireItems.SOUL_GLASS.get()) // Icon supplier
            )
    );
}
