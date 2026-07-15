package net.github.creep3rcrafter.inspire.mixin;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Inject(method = "getKnockbackBonus", at = @At("RETURN"), cancellable = true)
    private static void injectGetKnockbackBonus(LivingEntity livingEntity, CallbackInfoReturnable<Integer> cir) {
        ItemAttributeModifiers modifiers = livingEntity.getMainHandItem().getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, ItemAttributeModifiers.EMPTY);
        int[] kb = {0};
        modifiers.forEach(EquipmentSlot.MAINHAND, (attribute, modifier) -> {
            if (attribute.is(Attributes.ATTACK_KNOCKBACK)) {
                kb[0] += (int) modifier.amount();
            }
        });
        cir.setReturnValue(cir.getReturnValue() + kb[0]);
    }
}
