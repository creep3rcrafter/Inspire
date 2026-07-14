package net.github.creep3rcrafter.inspire.mixin;

import net.minecraft.world.item.enchantment.VanishingCurseEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VanishingCurseEnchantment.class)
public class VanishingCurseEnchantmentMixin {
    @Inject(method = "getMaxCost", at = @At(value = "RETURN"), cancellable = true)
    public void injectGetMaxCost(int i, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(30);
    }

    @Inject(method = "getMinCost", at = @At(value = "RETURN"), cancellable = true)
    public void injectGetMinCost(int i, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(10);
    }
}
