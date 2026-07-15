package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.item.ItemPropertiesRegistry;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;

public class InspireItemProperties {
    static {
        ItemPropertiesRegistry.register(InspireItems.CUSTOM_ARROW.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "tip"), (itemStack, level, livingEntity, i) -> {
            if (itemStack.has(DataComponents.CUSTOM_DATA)) {
                if (itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().contains("tip")) {
                    return itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().getFloat("tip");
                }
            }
            return 0.0f;
        });
        ItemPropertiesRegistry.register(InspireItems.CUSTOM_ARROW.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "rod"), (itemStack, level, livingEntity, i) -> {
            if (itemStack.has(DataComponents.CUSTOM_DATA)) {
                if (itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().contains("rod")) {
                    return itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().getFloat("rod");
                }
            }
            return 0.0f;
        });
        ItemPropertiesRegistry.register(InspireItems.CUSTOM_ARROW.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "tail"), (itemStack, level, livingEntity, i) -> {
            if (itemStack.has(DataComponents.CUSTOM_DATA)) {
                if (itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().contains("tail")) {
                    return itemStack.get(DataComponents.CUSTOM_DATA).getUnsafe().getFloat("tail");
                }
            }
            return 0.0f;
        });
        ItemPropertiesRegistry.register(InspireItems.POTION_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.MILK_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        /*
        ItemPropertiesRegistry.register(InspireItems.COOKIE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.APPLE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.APPLE_SLICES_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.APPLE_SAUCE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.GOLDEN_APPLE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.GOLDEN_APPLE_SAUCE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.GOLDEN_APPLE_SLICES_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.ENCHANTED_GOLDEN_APPLE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.ENCHANTED_GOLDEN_APPLE_SAUCE_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.ENCHANTED_GOLDEN_APPLE_SLICES_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i)->{
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.CHOCOLATE_MILK_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.SWEET_BERRY_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.SWEET_BERRY_JELLY_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.GLOW_BERRY_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        ItemPropertiesRegistry.register(InspireItems.GLOW_BERRY_JELLY_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });
        */
        ItemPropertiesRegistry.register(InspireItems.HONEY_JAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fill"), (itemStack, level, livingEntity, i) -> {
            return itemStack.getDamageValue() * 0.1f;
        });


        ItemPropertiesRegistry.register(InspireItems.STONE_SPEAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "throwing"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });

        ItemPropertiesRegistry.register(InspireItems.IRON_SPEAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "throwing"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });

        ItemPropertiesRegistry.register(InspireItems.GOLD_SPEAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "throwing"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });

        ItemPropertiesRegistry.register(InspireItems.DIAMOND_SPEAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "throwing"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
        ItemPropertiesRegistry.register(InspireItems.NETHERITE_SPEAR.get(), ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "throwing"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }
}

