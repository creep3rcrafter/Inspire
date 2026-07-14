package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.item.ClubItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.SweepingEdgeEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method = "canEnchant", at = @At("RETURN"), cancellable = true)
    private void injectCanEnchant(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        Enchantment enchantment = (Enchantment) (Object) this;
        if (enchantment.category == EnchantmentCategory.WEAPON && !(enchantment instanceof SweepingEdgeEnchantment) && !(enchantment.equals(Enchantments.SHARPNESS))) {
            if (itemStack.getItem() instanceof ClubItem) {
                cir.setReturnValue(true);
            }
        }
    }
}