package net.github.creep3rcrafter.inspire.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class BaseArrowItem extends ArrowItem {
    public BaseArrowItem(Properties properties) {
        super(properties);
    }

    public double getBaseDamage() {
        return 0;
    }

    public double getBaseDamage(ItemStack itemStack) {
        return 0;
    }

    @Override
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity, @NotNull ItemStack weapon) {
        return super.createArrow(level, itemStack, livingEntity, weapon);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Item.TooltipContext tooltipContext, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable(getBaseDamage(itemStack) + " Base Damage").withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
    }
}
