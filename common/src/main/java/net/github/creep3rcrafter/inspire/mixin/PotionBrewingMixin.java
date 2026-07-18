package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.item.PotionJarItem;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.PotionContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(PotionBrewing.class)
public abstract class PotionBrewingMixin {

    @Inject(method = "hasMix", at = @At("HEAD"), cancellable = true)
    private static void injectHasMix(ItemStack itemStack, ItemStack itemStack2, CallbackInfoReturnable<Boolean> cir) {
        if (itemStack.is(InspireItems.POTION_JAR.get())) {
            if (itemStack2.is(Items.POTION)) {
                cir.setReturnValue(true);
            }
        }
    }

    @Inject(method = "isIngredient", at = @At("HEAD"), cancellable = true)
    private static void injectIsIngredient(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        if (itemStack.is(Items.POTION)) {
            PotionContents contents = itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
            if (!contents.customEffects().isEmpty() || contents.potion().isPresent()) {
                cir.setReturnValue(true);
            }
        }
    }

    @Inject(method = "mix", at = @At("HEAD"), cancellable = true)
    private static void injectMix(ItemStack itemStack, ItemStack itemStack2, CallbackInfoReturnable<ItemStack> cir) {
        if (!itemStack2.isEmpty()) {
            if (itemStack.getItem() instanceof PotionItem) {
                if (itemStack2.getItem() instanceof PotionJarItem) {
                    PotionContents ingredientContents = itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
                    PotionContents baseContents = itemStack2.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);

                    List<MobEffectInstance> ingredientEffects = new ArrayList<>();
                    for (MobEffectInstance mei : ingredientContents.getAllEffects()) ingredientEffects.add(mei);

                    List<MobEffectInstance> baseEffects = new ArrayList<>();
                    for (MobEffectInstance mei : baseContents.getAllEffects()) baseEffects.add(mei);

                    List<MobEffectInstance> totalEffects = new ArrayList<>(baseContents.customEffects());
                    for (MobEffectInstance mei : ingredientContents.getAllEffects()) totalEffects.add(mei);

                    List<Holder<MobEffect>> baseMobEffects = new ArrayList<>();
                    for (MobEffectInstance mei : baseEffects) baseMobEffects.add(mei.getEffect());

                    List<Holder<MobEffect>> ingredientMobEffects = new ArrayList<>();
                    for (MobEffectInstance mei : ingredientEffects) ingredientMobEffects.add(mei.getEffect());

                    if (!baseMobEffects.containsAll(ingredientMobEffects)) {
                        if ((baseMobEffects.size() + ingredientMobEffects.size()) <= 4) {
                            PotionContents updated = new PotionContents(baseContents.potion(), baseContents.customColor(), totalEffects);
                            itemStack2.set(DataComponents.POTION_CONTENTS, updated);
                            cir.setReturnValue(itemStack2);
                        }
                    }
                }
            }
        }
    }
}
