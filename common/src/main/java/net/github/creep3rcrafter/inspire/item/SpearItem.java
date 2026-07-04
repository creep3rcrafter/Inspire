package net.github.creep3rcrafter.inspire.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.github.creep3rcrafter.inspire.entity.projectile.ThrownSpear;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class SpearItem extends TieredItem implements Vanishable {
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public SpearItem(Tier tier, int baseDamage, Properties properties) {
        super(tier, properties);
        float attackDamage = (float) baseDamage + tier.getAttackDamageBonus();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", (double) attackDamage, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -2.9000000953674316, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    public boolean canAttackBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return !player.isCreative();
    }

    public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.SPEAR;
    }

    public int getUseDuration(ItemStack itemStack) {
        return 72000;
    }

    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        if (livingEntity instanceof Player player) {
            int j = this.getUseDuration(itemStack) - i;
            if (j >= 10) {
                if (!level.isClientSide) {
                    itemStack.hurtAndBreak(1, player, (playerx) -> {
                        playerx.broadcastBreakEvent(livingEntity.getUsedItemHand());
                    });
                    ThrownSpear thrownSpear = null; ///new ThrownSpear(level, player, itemStack); -----------------------------------------------
                    if (itemStack.getItem() == InspireItems.STONE_SPEAR.get()) {
                        thrownSpear.setTip(0.1f);
                    } else if (itemStack.getItem() == InspireItems.IRON_SPEAR.get()) {
                        thrownSpear.setTip(0.2f);
                    } else if (itemStack.getItem() == InspireItems.GOLD_SPEAR.get()) {
                        thrownSpear.setTip(0.3f);
                    } else if (itemStack.getItem() == InspireItems.DIAMOND_SPEAR.get()) {
                        thrownSpear.setTip(0.4f);
                    } else if (itemStack.getItem() == InspireItems.NETHERITE_SPEAR.get()) {
                        thrownSpear.setTip(0.5f);
                    } else {
                        thrownSpear.setTip(0.0f);
                    }
                    thrownSpear.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 2.5F + 0.5F, 1.0F);
                    if (player.getAbilities().instabuild) {
                        thrownSpear.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                    }

                    level.addFreshEntity(thrownSpear);
                    level.playSound((Player) null, thrownSpear, SoundEvents.TRIDENT_THROW, SoundSource.PLAYERS, 1.0F, 1.0F);
                    if (!player.getAbilities().instabuild) {
                        player.getInventory().removeItem(itemStack);
                    }
                }

                player.awardStat(Stats.ITEM_USED.get(this));
            }
        }
    }

    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.getDamageValue() >= itemStack.getMaxDamage() - 1) {
            return InteractionResultHolder.fail(itemStack);
        } else if (EnchantmentHelper.getRiptide(itemStack) > 0 && !player.isInWaterOrRain()) {
            return InteractionResultHolder.fail(itemStack);
        } else {
            player.startUsingItem(interactionHand);
            return InteractionResultHolder.consume(itemStack);
        }
    }

    public boolean hurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity2) {
        itemStack.hurtAndBreak(1, livingEntity2, (livingEntityx) -> {
            livingEntityx.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if ((double) blockState.getDestroySpeed(level, blockPos) != 0.0) {
            itemStack.hurtAndBreak(2, livingEntity, (livingEntityx) -> {
                livingEntityx.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    public @NotNull Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
        return equipmentSlot == EquipmentSlot.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(equipmentSlot);
    }

    public int getEnchantmentValue() {
        return 1;
    }
}
