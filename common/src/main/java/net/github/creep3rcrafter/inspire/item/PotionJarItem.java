package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.Registries;
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

    public static boolean isValidPotion(Potion potion) {
        return potion != Potions.AWKWARD || potion != Potions.MUNDANE || potion != Potions.THICK || potion != Potions.WATER;
    }

    public static boolean isEmptyPotion(Potion potion) {
        if (potion == Potions.WATER) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack itemStack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, itemStack);
        }

        if (!level.isClientSide) {
            List<MobEffectInstance> list = PotionContents.getMobEffects(itemStack);

            for (MobEffectInstance mobEffectInstance : list) {
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

    @Override
    public void fillItemCategory(@NotNull CreativeModeTab creativeModeTab, @NotNull NonNullList<ItemStack> nonNullList) {
        if (this.allowedIn(creativeModeTab)) {
            for (Potion potion : Registries.POTION) {
                if (potion != Potions.WATER) {
                    nonNullList.add(PotionContents.createItemStack((Item) this, Holder.direct(potion)));
                }
            }
            /*
            for (Potion potion1 :Registries.POTION) {
                for (Potion potion2 :Registries.POTION) {
                    for (Potion potion3 :Registries.POTION) {
                        Collection<MobEffectInstance> mobEffectInstances = new ArrayList<>();
                        if(!isEmptyPotion(potion1) && isValidPotion(potion1)){
                            for (MobEffectInstance mobEffectInstance : potion1.getEffects()){
                                if (!mobEffectInstances.contains(mobEffectInstance)){
                                    mobEffectInstances.add(mobEffectInstance);
                                }
                            }
                        }
                        if(!isEmptyPotion(potion2) && isValidPotion(potion2)){
                            for (MobEffectInstance mobEffectInstance : potion2.getEffects()){
                                if (!mobEffectInstances.contains(mobEffectInstance)){
                                    mobEffectInstances.add(mobEffectInstance);
                                }
                            }
                        }
                        if(!isEmptyPotion(potion3) && isValidPotion(potion3)){
                            for (MobEffectInstance mobEffectInstance : potion3.getEffects()){
                                if (!mobEffectInstances.contains(mobEffectInstance)){
                                    mobEffectInstances.add(mobEffectInstance);
                                }
                            }
                        }
                        if (!mobEffectInstances.isEmpty()){
                            nonNullList.add(PotionUtils.setCustomEffects(new ItemStack(this), mobEffectInstances));
                        }
                    }
                }
            }
             */
        }
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack itemStack) {
        StringBuilder potionID;
        if (!PotionUtils.getCustomEffects(itemStack).isEmpty()) {
            List<MobEffectInstance> mobEffectInstances = new ArrayList<>();
            mobEffectInstances.addAll(PotionUtils.getMobEffects(itemStack));
            mobEffectInstances.addAll(PotionUtils.getCustomEffects(itemStack));
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
        } else if (PotionUtils.getPotion(itemStack) == Potions.EMPTY) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.uncraftable")).append(Component.translatable("inspire.jar.potion"));
        } else if (PotionUtils.getPotion(itemStack) == Potions.WATER) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.water"));
        } else if (PotionUtils.getPotion(itemStack) == Potions.AWKWARD) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.awkward")).append(Component.translatable("inspire.jar.potion"));
        } else if (PotionUtils.getPotion(itemStack) == Potions.THICK) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.thick")).append(Component.translatable("inspire.jar.potion"));
        } else if (PotionUtils.getPotion(itemStack) == Potions.MUNDANE) {
            return Component.translatable(this.getDescriptionId()).append(Component.translatable("inspire.jar.potion.mundane")).append(Component.translatable("inspire.jar.potion"));
        } else {
            potionID = new StringBuilder(Component.translatable(PotionUtils.getPotion(itemStack).getName("item.minecraft.potion.effect.")).getString());
            //String capPotionName = Component.translatable(potionID.substring(10)).getString();
            //capPotionName = capPotionName.substring(0, 1).toUpperCase() + capPotionName.substring(1);
            return Component.translatable(this.getDescriptionId()).append(Component.translatable(potionID.toString()));
        }
    }
}
