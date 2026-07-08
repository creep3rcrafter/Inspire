package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CustomArrowItem extends BaseArrowItem {
    //float tip;
    public CustomArrowItem(Properties properties) {
        super(properties);
        //this.tip = tip;
    }

    @Override
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
        CustomArrowEntity arrow = new CustomArrowEntity(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        if (compoundTag.contains("tip")) {
            arrow.setTip(compoundTag.getFloat("tip"));
        }
        if (compoundTag.contains("rod")) {
            arrow.setRod(compoundTag.getFloat("rod"));
        }
        if (compoundTag.contains("tail")) {
            arrow.setTail(compoundTag.getFloat("tail"));
        }
        arrow.setBaseDamage(getBaseDamage(itemStack));
        return arrow;
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
        super.onCraftedBy(itemStack, level, player);
    }

    @Override
    public double getBaseDamage(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        double damage = 0;
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.0f) {
                damage += 0;
            } else if (compoundTag.getFloat("tip") == 0.05f) {
                damage += 1;
            } else if (compoundTag.getFloat("tip") == 0.1f) {
                damage += 1;
            } else if (compoundTag.getFloat("tip") == 0.15f) {
                damage += 2;
            } else if (compoundTag.getFloat("tip") == 0.2f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.25f) {
                damage += 4;
            } else if (compoundTag.getFloat("tip") == 0.3f) {
                damage += 5;
            } else if (compoundTag.getFloat("tip") == 0.35f) {
                damage += 6;
            } else if (compoundTag.getFloat("tip") == 0.4f) {
                damage += 4;
            } else if (compoundTag.getFloat("tip") == 0.45f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.5f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                damage -= 0.5;
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                damage -= 0.5;
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                damage -= 0.25;
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                damage += 2;
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.0f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("rod") == 0.05f) {
                damage += 1.5;
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                damage += 3;
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    damage -= 0.5;
                } else {
                    damage += 0.5;
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                damage += 1;
            }
        }
        return damage;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.05f) {
                list.add(Component.translatable("inspire.flint_tip.desc").withStyle(ChatFormatting.GOLD));
            } else if (compoundTag.getFloat("tip") == 0.15f) {
                list.add(Component.translatable("inspire.copper_tip.desc").withStyle(ChatFormatting.AQUA));
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                list.add(Component.translatable("inspire.prismarine_tip.desc").withStyle(ChatFormatting.BLUE));
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                list.add(Component.literal(String.valueOf(4f)).withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable("inspire.slime_tip.desc").withStyle(ChatFormatting.GREEN)));
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                list.add(Component.translatable("inspire.cobweb_tip.desc").withStyle(ChatFormatting.GRAY));
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                list.add(Component.translatable("inspire.chorus_tip.desc").withStyle(ChatFormatting.LIGHT_PURPLE));
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                list.add(Component.translatable("inspire.dynamite_tip.desc").withStyle(ChatFormatting.RED));
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                list.add(Component.translatable("inspire.ender_tip.desc").withStyle(ChatFormatting.DARK_BLUE));
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                list.add(Component.literal(String.valueOf(4f)).withStyle(ChatFormatting.AQUA)
                        .append(Component.translatable("inspire.echo_tip.desc").withStyle(ChatFormatting.AQUA)));
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                list.add(Component.translatable("inspire.soul_tip.desc").withStyle(ChatFormatting.AQUA));
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.05f) {
                list.add(Component.translatable("inspire.bamboo_rod.desc").withStyle(ChatFormatting.GRAY));
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                list.add(Component.translatable("inspire.blaze_rod.desc.1").withStyle(ChatFormatting.GOLD));
                list.add(Component.translatable("inspire.blaze_rod.desc.2").withStyle(ChatFormatting.YELLOW));
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    list.add(Component.translatable("inspire.burnt_feather_tail.desc").withStyle(ChatFormatting.RED));
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                list.add(Component.translatable("inspire.strider_scale_tail.desc").withStyle(ChatFormatting.GREEN));
            }
        }
    }


    @Override
    public void fillItemCategory(CreativeModeTab creativeModeTab, NonNullList<ItemStack> nonNullList) {
        if (creativeModeTab == this.getItemCategory()) {
            for (int rod = 0; rod < 3; rod++) {
                for (int tip = 0; tip < 19; tip++) {
                    for (int tail = 0; tail < 2; tail++) {
                        if (!(rod == 0 && tail == 0 && tip == 1)) {
                            ItemStack itemStack = new ItemStack(this);
                            CompoundTag compoundTag = itemStack.getOrCreateTag();
                            compoundTag.putFloat("tip", new BigDecimal(Float.toString(tip * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            //compoundTag.putFloat("tip", tip);
                            compoundTag.putFloat("rod", new BigDecimal(Float.toString(rod * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            compoundTag.putFloat("tail", new BigDecimal(Float.toString(tail * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            itemStack.save(compoundTag);
                            nonNullList.add(itemStack);
                        }
                    }
                }
            }
        }

    }

    @Override
    public @NotNull Component getName(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        String tip = "";
        String rod = "";
        String tail = "";
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.05f) {
                tip = "inspire.flint_tip";
            } else if (compoundTag.getFloat("tip") == 0.1f) {
                tip = "inspire.bone_tip";
            } else if (compoundTag.getFloat("tip") == 0.15f) {
                tip = "inspire.copper_tip";
            } else if (compoundTag.getFloat("tip") == 0.2f) {
                tip = "inspire.iron_tip";
            } else if (compoundTag.getFloat("tip") == 0.25f) {
                tip = "inspire.gold_tip";
            } else if (compoundTag.getFloat("tip") == 0.3f) {
                tip = "inspire.diamond_tip";
            } else if (compoundTag.getFloat("tip") == 0.35f) {
                tip = "inspire.netherite_tip";
            } else if (compoundTag.getFloat("tip") == 0.4f) {
                tip = "inspire.obsidian_tip";
            } else if (compoundTag.getFloat("tip") == 0.45f) {
                tip = "inspire.nether_quartz_tip";
            } else if (compoundTag.getFloat("tip") == 0.5f) {
                tip = "inspire.amethyst_tip";
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                tip = "inspire.prismarine_tip";
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                tip = "inspire.slime_tip";
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                tip = "inspire.cobweb_tip";
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                tip = "inspire.chorus_tip";
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                tip = "inspire.dynamite_tip";
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                tip = "inspire.ender_tip";
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                tip = "inspire.echo_tip";
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                tip = "inspire.soul_tip";
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.0f) {
                rod = "inspire.wood_rod";
            } else if (compoundTag.getFloat("rod") == 0.05f) {
                rod = "inspire.bamboo_rod";
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                rod = "inspire.blaze_rod";
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    tail = "inspire.burnt_feather_tail";
                } else {
                    tail = "inspire.feather_tail";
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                tail = "inspire.strider_scale_tail";
            }
        }

        return Component.translatable(tip).append(Component.translatable(rod).append(Component.translatable(tail).append(Component.translatable(this.getDescriptionId()))));
    }
}
