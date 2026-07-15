package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireEnchantments;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DiggerItem.class)
public abstract class DiggerItemMixin {

    @Shadow
    @Final
    protected float speed;
    @Shadow
    @Final
    private TagKey<Block> blocks;

    @Inject(method = "getDestroySpeed", at = @At("HEAD"), cancellable = true)
    public void injectGetDestroySpeed(ItemStack itemStack, BlockState blockState, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        ItemEnchantments itemEnchantments = itemStack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
        boolean hasRhythm = itemEnchantments.keySet().stream().anyMatch(h -> h.is(InspireEnchantments.RHYTHM_ENCHANTMENT));
        if (hasRhythm) {
            CompoundTag compoundTag = itemStack.getOrDefault(DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.EMPTY).copyTag();
            if (compoundTag.contains("rhythmBlockCount")) {
                callbackInfoReturnable.setReturnValue(blockState.is(blocks) ? (float) Math.ceil(speed + (5f * architectury_theupdatemod$easeInEaseOutSin(compoundTag.getInt("rhythmBlockCount") / 100f))) : 1f);
                System.out.println("Speed: " + (blockState.is(blocks) ? (float) Math.ceil(speed + (5f * architectury_theupdatemod$easeInEaseOutSin(compoundTag.getInt("rhythmBlockCount") / 100f))) : 1f));
            }
        }
    }

    @Unique
    public float architectury_theupdatemod$easeInEaseOutSin(float value) {
        return (float) (-(Math.cos(Math.PI * value) - 1) / 2);
    }
}
