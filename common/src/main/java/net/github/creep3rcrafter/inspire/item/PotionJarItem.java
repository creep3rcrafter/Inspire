package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PotionJarItem extends PotionItem {
    public PotionJarItem(Properties properties) {
        super(properties);
    }

    public static boolean isValidPotion(Holder<Potion> potion) {
        return !potion.is(Potions.AWKWARD) || !potion.is(Potions.MUNDANE) || !potion.is(Potions.THICK) || !potion.is(Potions.WATER);
    }

    public static boolean isEmptyPotion(Holder<Potion> potion) {
        return potion.is(Potions.WATER);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack itemStack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, itemStack);
        }

        if (!level.isClientSide) {
            PotionContents potionContents = itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
            for (MobEffectInstance mobEffectInstance : potionContents.getAllEffects()) {
                if (mobEffectInstance.getEffect().value().isInstantenous()) {
                    mobEffectInstance.getEffect().value().applyInstantenousEffect(player, player, livingEntity, mobEffectInstance.getAmplifier(), 1.0);
                } else {
                    livingEntity.addEffect(new MobEffectInstance(mobEffectInstance));
                }
            }
        }

        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.getAbilities().instabuild) {
                if (itemStack.getDamageValue() < itemStack.getMaxDamage() - 1) {
                    itemStack.setDamageValue(itemStack.getDamageValue() + 1);
                } else {
                    itemStack.shrink(1);
                    player.getInventory().add(new ItemStack(InspireItems.EMPTY_JAR.get()));
                }
            }
        }

        livingEntity.gameEvent(GameEvent.DRINK);
        return itemStack;
    }

    public void fillItemCategory(@NotNull CreativeModeTab creativeModeTab, @NotNull NonNullList<ItemStack> nonNullList) {
        for (Holder.Reference<Potion> potionHolder : BuiltInRegistries.POTION.holders().toList()) {
            if (!potionHolder.is(Potions.WATER)) {
                nonNullList.add(PotionContents.createItemStack((Item) this, potionHolder));
            }
        }
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack itemStack) {
        PotionContents contents = itemStack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
        StringBuilder potionID;
        if (!contents.customEffects().isEmpty()) {
            List<MobEffectInstance> mobEffectInstances = new ArrayList<>();
            for (MobEffectInstance effect : contents.getAllEffects()) {
                mobEffectInstances.add(effect);
            }
            potionID = new StringBuilder();
            if (mobEffectInstances.size() == 1) {
                String potion1 = mobEffectInstances.get(0).getDescriptionId().substring(17);
                int length = potion1.length();
                int c1 = 0;
                int c2 = 0;
                int c3 = 0;
                int total = 0;
                for (int i = 0; i < length; i++) {
                    c1 = potion1.charAt(i) / 3;
                    total = c1 + c2 + c3;
                    potionID.append((char) total);
                }
            } else if (mobEffectInstances.size() == 2) {
                String potion1 = mobEffectInstances.get(0).getDescriptionId().substring(17);
                String potion2 = mobEffectInstances.get(1).getDescriptionId().substring(17);
                int length = Math.min(potion1.length(), potion2.length());
                int c1 = 0;
                int c2 = 0;
                int c3 = 0;
                int total = 0;
                for (int i = 0; i < length; i++) {
                    c1 = potion1.charAt(i) / 3;
                    c2 = potion2.charAt(i) / 3;
                    total = c1 + c2 + c3;
                    potionID.append((char) total);
                }
            } else if (mobEffectInstances.size() >= 3) {
                String potion1 = mobEffectInstances.get(0).getDescriptionId().substring(17);
                String potion2 = mobEffectInstances.get(1).getDescriptionId().substring(17);
                String potion3 = mobEffectInstances.get(2).getDescriptionId().substring(17);
                int length = Math.min(potion1.length(), Math.min(potion2.length(), potion3.length()));
                int c1 = 0;
                int c2 = 0;
                int c3 = 0;
                int total = 0;
                for (int i = 0; i < length; i++) {
                    c1 = potion1.charAt(i) / 3;
                    c2 = potion2.charAt(i) / 3;
                    c3 = potion3.charAt(i) / 3;
                    total = c1 + c2 + c3;
                    potionID.append((char) total);
                }
            }
            return Component.translatable(this.getDescriptionId())
                    .append(Component.literal("§k" + potionID.toString()).append(Component.literal("§r")).append(Component.translatable("inspire.jar.potion")));
        } else if (contents.potion().isEmpty()) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.uncraftable")).append(Component.translatable("inspire.jar.potion"));
        } else if (contents.is(Potions.WATER)) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.water"));
        } else if (contents.is(Potions.AWKWARD)) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.awkward")).append(Component.translatable("inspire.jar.potion"));
        } else if (contents.is(Potions.THICK)) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.thick")).append(Component.translatable("inspire.jar.potion"));
        } else if (contents.is(Potions.MUNDANE)) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.mundane")).append(Component.translatable("inspire.jar.potion"));
        } else {
            potionID = new StringBuilder(Component.translatable(Potion.getName(contents.potion(), "item.minecraft.potion.effect.")).getString());
            return Component.translatable(this.getDescriptionId()).append(Component.translatable(potionID.toString()));
        }
    }
}