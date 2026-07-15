package net.github.creep3rcrafter.inspire.item;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ClubItem extends TieredItem {
    protected static final ResourceLocation BASE_KNOCKBACK_ID = ResourceLocation.fromNamespaceAndPath("inspire", "base_attack_knockback");

    public ClubItem(Tier tier, int baseDamage, float attackSpeed, int knockback, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, baseDamage, attackSpeed, knockback)));
    }

    private static ItemAttributeModifiers createAttributes(Tier tier, int baseDamage, float attackSpeed, int knockback) {
        float attackDamage = (float) baseDamage + tier.getAttackDamageBonus();
        return ItemAttributeModifiers.builder()
            .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, attackDamage, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
            .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double) attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
            .add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(BASE_KNOCKBACK_ID, (double) knockback, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
            .build();
    }

    public boolean canAttackBlock(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        return !player.isCreative();
    }

    public boolean hurtEnemy(ItemStack itemStack, LivingEntity livingEntity, LivingEntity livingEntity2) {
        itemStack.hurtAndBreak(2, livingEntity2, EquipmentSlot.MAINHAND);
        return true;
    }

    public boolean mineBlock(ItemStack itemStack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if (blockState.getDestroySpeed(level, blockPos) != 0.0F) {
            itemStack.hurtAndBreak(4, livingEntity, EquipmentSlot.MAINHAND);
        }
        return true;
    }
}
