package net.github.creep3rcrafter.inspire.mixin;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Inject(method = "getKnockbackBonus", at = @At("RETURN"), cancellable = true)
    private static void injectGetKnockbackBonus(LivingEntity livingEntity, CallbackInfoReturnable<Integer> cir) {
        livingEntity.getMainHandItem().getAttributeModifiers(EquipmentSlot.MAINHAND).get(Attributes.ATTACK_KNOCKBACK).iterator();
        Iterator<AttributeModifier> iterator = livingEntity.getMainHandItem().getAttributeModifiers(EquipmentSlot.MAINHAND).get(Attributes.ATTACK_KNOCKBACK).iterator();
        int kb = 0;
        while (iterator.hasNext()) {
            kb += (int) iterator.next().getAmount();
        }
        cir.setReturnValue(cir.getReturnValue() + kb);
    }
}
