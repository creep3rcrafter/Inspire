package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModCreativeTabOrder;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(CreativeModeTab.class)
public abstract class CreativeModeTabMixin implements ItemLike {

    @Inject(method = "fillItemList", at = @At("TAIL"))
    public void injectUseOn(NonNullList<ItemStack> nonNullList, CallbackInfo ci) {
        nonNullList.forEach(itemStack -> {
            if (ModCreativeTabOrder.ITEM_MAP.containsKey(itemStack.getItem())) {
                nonNullList.addAll(nonNullList.indexOf(itemStack) + 1, List.of(ModCreativeTabOrder.ITEM_MAP.get(itemStack.getItem())));
            }
        });
    }
}