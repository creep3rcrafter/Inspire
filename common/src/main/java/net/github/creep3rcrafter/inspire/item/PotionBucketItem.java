package net.github.creep3rcrafter.inspire.item;

import dev.architectury.core.item.ArchitecturyBucketItem;
import net.github.creep3rcrafter.inspire.block.entity.PotionLiquidBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class PotionBucketItem extends ArchitecturyBucketItem {
    public PotionBucketItem(Supplier<? extends Fluid> fluid, Properties properties) {
        super(fluid, properties);
    }

    public @NotNull ItemStack getDefaultInstance() {
        return PotionUtils.setPotion(super.getDefaultInstance(), Potions.WATER);
    }

    public @NotNull String getDescriptionId(@NotNull ItemStack itemStack) {
        return PotionUtils.getPotion(itemStack).getName(this.getDescriptionId() + ".effect.");

    }

    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        PotionUtils.addPotionTooltip(itemStack, list, 0.75F);
    }

    public boolean isFoil(@NotNull ItemStack itemStack) {
        return super.isFoil(itemStack) || !PotionUtils.getMobEffects(itemStack).isEmpty();
    }

    public void fillItemCategory(@NotNull CreativeModeTab creativeModeTab, @NotNull NonNullList<ItemStack> nonNullList) {
       /*
        if (this.allowedIn(creativeModeTab)) {
            for (Potion potion : Registry.POTION) {
                if (potion != Potions.EMPTY && potion != Potions.WATER) {
                    ItemStack itemStack = PotionUtils.setPotion(new ItemStack(this), potion);
                    ColorHandlerRegistry.registerItemColors(new ItemColor() {
                        @Override
                        public int getColor(@NotNull ItemStack itemStack, int i) {
                            return i == 0 ? PotionUtils.getColor(itemStack) : -1;
                        }
                    }, InspireItems.POTION_BUCKET.get());
                    nonNullList.add(itemStack);
                }
            }
        }
        */
    }

    public void checkExtraContent(@Nullable Player player, Level level, ItemStack itemStack, BlockPos blockPos) {
        if (!level.isClientSide) {
            if (level.getBlockEntity(blockPos) != null) {
                if (level.getBlockEntity(blockPos) instanceof PotionLiquidBlockEntity potionLiquidBlockEntity) {
                    potionLiquidBlockEntity.setPotion(PotionUtils.getPotion(itemStack));
                }
            }
        }
        super.checkExtraContent(player, level, itemStack, blockPos);
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack itemStack) {
        String potionID;
        if (PotionUtils.getPotion(itemStack) == Potions.EMPTY) {
            potionID = "Uncraftable";
            return Component.translatable(potionID).append(Component.translatable(this.getDescriptionId()));
        } else if (PotionUtils.getPotion(itemStack) == Potions.WATER) {
            potionID = "Water";
            return Component.translatable(potionID).append(Component.translatable(this.getDescriptionId()));
        } else if (PotionUtils.getPotion(itemStack) == Potions.AWKWARD) {
            potionID = "Awkward";
            return Component.translatable(potionID).append(Component.translatable(this.getDescriptionId()));
        } else if (PotionUtils.getPotion(itemStack) == Potions.THICK) {
            potionID = "Thick";
            return Component.translatable(potionID).append(Component.translatable(this.getDescriptionId()));
        } else if (PotionUtils.getPotion(itemStack) == Potions.MUNDANE) {
            potionID = "Mundane";
            return Component.translatable(potionID).append(Component.translatable(this.getDescriptionId()));
        } else {
            potionID = Component.translatable(PotionUtils.getPotion(itemStack).getName("item.minecraft.potion.effect.")).getString();
            String capPotionName = Component.translatable(potionID.substring(10)).getString();
            capPotionName = capPotionName.substring(0, 1).toUpperCase() + capPotionName.substring(1);
            return Component.translatable(capPotionName).append(Component.translatable(this.getDescriptionId()));
        }

        //return Component.translatable(this.getDescriptionId());
    }
}
