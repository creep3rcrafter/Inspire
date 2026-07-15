package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;

public class InspireArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(InspireCommon.MOD_ID, Registries.ARMOR_MATERIAL);

    public static final RegistrySupplier<ArmorMaterial> STRIDER_SCALE;

    static {
        STRIDER_SCALE = ARMOR_MATERIALS.register("strider_scale", () -> new ArmorMaterial(
                Map.of(
                        ArmorItem.Type.BOOTS, 3,
                        ArmorItem.Type.LEGGINGS, 6,
                        ArmorItem.Type.CHESTPLATE, 8,
                        ArmorItem.Type.HELMET, 3
                ),
                10,
                SoundEvents.ARMOR_EQUIP_GENERIC,
                () -> Ingredient.of(InspireItems.STRIDER_SCALE.get()),
                List.of(new ArmorMaterial.Layer(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "strider_scale"))),
                2.0F,
                0.0F
        ));
    }
}
