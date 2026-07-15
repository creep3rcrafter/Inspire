package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.item.ClubItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method = "canEnchant", at = @At("RETURN"), cancellable = true)
    private void injectCanEnchant(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        if (itemStack.getItem() instanceof ClubItem) {
            cir.setReturnValue(true);
        }
    }
}