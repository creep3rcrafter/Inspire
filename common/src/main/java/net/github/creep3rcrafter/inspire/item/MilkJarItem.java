package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MilkJarItem extends FoodJarItem {

    public MilkJarItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack itemStack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, itemStack);
        }

        if (!level.isClientSide) {
            livingEntity.removeAllEffects();
            FoodProperties foodProps = itemStack.get(DataComponents.FOOD);
            if (foodProps != null) {
                level.playSound((Player) null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), this.getEatingSound(), SoundSource.NEUTRAL, 1.0F, 1.0F + (level.random.nextFloat() - level.random.nextFloat()) * 0.4F);
                for (FoodProperties.PossibleEffect possibleEffect : foodProps.effects()) {
                    if (possibleEffect.effect() != null && level.random.nextFloat() < possibleEffect.probability()) {
                        livingEntity.addEffect(new MobEffectInstance(possibleEffect.effect()));
                    }
                }
                livingEntity.gameEvent(GameEvent.EAT);
                if (player != null) {
                    player.getFoodData().eat(foodProps.nutrition(), foodProps.saturation());
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
        return itemStack;
    }

    @Override
    public @NotNull SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public int getUseDuration(@NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
        return 32;
    }

    @Override
    public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.DRINK;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        return ItemUtils.startUsingInstantly(level, player, interactionHand);
    }
}
