package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;

public final class InspireEnchantments {
    private InspireEnchantments() {
    }

    public static final ResourceKey<Enchantment> MOMENTUM_ENCHANTMENT = key("momentum_enchantment");
    public static final ResourceKey<Enchantment> RHYTHM_ENCHANTMENT = key("rhythm_enchantment");
    public static final ResourceKey<Enchantment> COUNTING_ENCHANTMENT = key("counting_enchantment");
    public static final ResourceKey<Enchantment> SAVING_ENCHANTMENT = key("saving_enchantment");
    public static final ResourceKey<Enchantment> SHATTERING_CURSE = key("shattering_curse");
    public static final ResourceKey<Enchantment> FRAGILE_CURSE = key("fragile_curse");

    private static ResourceKey<Enchantment> key(String id) {
        return ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, id));
    }
}
