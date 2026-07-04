package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.enchantment.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;

public class InspireEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(InspireCommon.MOD_ID, Registry.ENCHANTMENT_REGISTRY);
    public static final RegistrySupplier<Enchantment> MOMENTUM_ENCHANTMENT;
    public static final RegistrySupplier<Enchantment> RHYTHM_ENCHANTMENT;
    public static final RegistrySupplier<Enchantment> COUNTING_ENCHANTMENT;
    public static final RegistrySupplier<Enchantment> SAVING_ENCHANTMENT;
    public static final RegistrySupplier<Enchantment> SHATTERING_CURSE;
    public static final RegistrySupplier<Enchantment> FRAGILE_CURSE;

    static {
        MOMENTUM_ENCHANTMENT = ENCHANTMENTS.register("momentum_enchantment", () -> new MomentumEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
        RHYTHM_ENCHANTMENT = ENCHANTMENTS.register("rhythm_enchantment", () -> new RhythmEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
        COUNTING_ENCHANTMENT = ENCHANTMENTS.register("counting_enchantment", () -> new CountingEnchantment(Enchantment.Rarity.COMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
        SAVING_ENCHANTMENT = ENCHANTMENTS.register("saving_enchantment", () -> new SavingEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.VANISHABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
        SHATTERING_CURSE = ENCHANTMENTS.register("shattering_curse", () -> new ShatteringCurse(Enchantment.Rarity.RARE, EnchantmentCategory.VANISHABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
        FRAGILE_CURSE = ENCHANTMENTS.register("fragile_curse", () -> new FragileCurse(Enchantment.Rarity.RARE, EnchantmentCategory.VANISHABLE, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    }
}
