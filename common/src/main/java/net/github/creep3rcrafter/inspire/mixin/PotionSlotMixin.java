package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModItems;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.world.inventory.BrewingStandMenu.PotionSlot.class)
public abstract class PotionSlotMixin extends Slot {
    public PotionSlotMixin(Container container, int i, int j, int k) {
        super(container, i, j, k);
    }

    @Inject(method = "mayPlaceItem", at = @At("RETURN"), cancellable = true)
    private static void injectMayPlaceItem(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(cir.getReturnValue() || (itemStack.is(ModItems.POTION_JAR.get()) && !itemStack.isDamaged()));
    }

}
