package net.github.creep3rcrafter.inspire.register;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.BlockEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;

import java.util.List;

public class InspireEvents {
    static {
        BlockEvent.BREAK.register((level, blockPos, blockState, serverPlayer, value) -> {
            if (level instanceof ServerLevel) {
                if (!serverPlayer.isInvulnerable()) {
                    if (!serverPlayer.getMainHandItem().isEmpty()) {
                        ItemStack itemStack = serverPlayer.getMainHandItem();
                        CustomData customData = itemStack.get(DataComponents.CUSTOM_DATA);
                        CompoundTag compoundTag = customData != null ? customData.copyTag() : null;
                        ServerLevel serverLevel = level.getServer().getLevel(level.dimension());
                        BlockPos blockPos2 = blockPos.relative(serverPlayer.getDirection());
                        if (serverLevel != null) {
                            var enchantReg = serverLevel.registryAccess().registryOrThrow(Registries.ENCHANTMENT);
                            Holder<Enchantment> momentumHolder = enchantReg.getHolderOrThrow(InspireEnchantments.MOMENTUM_ENCHANTMENT);
                            Holder<Enchantment> rhythmHolder = enchantReg.getHolderOrThrow(InspireEnchantments.RHYTHM_ENCHANTMENT);
                            Holder<Enchantment> countingHolder = enchantReg.getHolderOrThrow(InspireEnchantments.COUNTING_ENCHANTMENT);
                            BlockState blockState2 = serverLevel.getBlockState(blockPos2);
                            BlockEntity blockEntity = serverLevel.getBlockEntity(blockPos2);
                            if (EnchantmentHelper.getItemEnchantmentLevel(momentumHolder, itemStack) > 0) {
                                RandomSource random = RandomSource.create();
                                if (random.nextFloat() > 0.6f) {
                                    if (blockState2.getBlock() == blockState.getBlock()) {
                                        if (itemStack.isCorrectToolForDrops(blockState2)) {
                                            playerDestroy(blockState2.getBlock(), serverLevel, serverPlayer, blockPos2, blockPos2, blockState2, blockEntity, itemStack);
                                            serverLevel.destroyBlock(blockPos2, false, serverPlayer);
                                        }
                                    }
                                }
                            }
                            if (compoundTag != null) {

                                if (EnchantmentHelper.getItemEnchantmentLevel(rhythmHolder, itemStack) > 0) {
                                    if (level.getServer().getTickCount() < compoundTag.getInt("lastTick") + 40) {
                                        if (compoundTag.getInt("rhythmBlockCount") >= 99) {
                                            compoundTag.putInt("rhythmBlockCount", 100);
                                            compoundTag.putInt("lastTick", level.getServer().getTickCount());
                                        } else {
                                            compoundTag.putInt("rhythmBlockCount", compoundTag.getInt("rhythmBlockCount") + 1);
                                            compoundTag.putInt("lastTick", level.getServer().getTickCount());
                                        }
                                    } else {
                                        compoundTag.putInt("rhythmBlockCount", 1);
                                        compoundTag.putInt("lastTick", level.getServer().getTickCount());
                                    }
                                }
                                if (EnchantmentHelper.getItemEnchantmentLevel(countingHolder, itemStack) > 0) {
                                    compoundTag.putInt("blockCount", compoundTag.getInt("blockCount") + 1);
                                    List<Component> components = itemStack.getTooltipLines(Item.TooltipContext.EMPTY, serverPlayer, TooltipFlag.Default.NORMAL);
                                    components.add(Component.translatable("Blocks Mined: " + compoundTag.getString("blockCount")));
                                    itemStack.getItem().appendHoverText(itemStack, Item.TooltipContext.EMPTY, components, TooltipFlag.Default.NORMAL);
                                }
                                itemStack.set(DataComponents.CUSTOM_DATA, CustomData.of(compoundTag));
                            }
                        }
                    }
                }
            }
            return EventResult.pass();
        });
    }

    public static void playerDestroy(Block block, Level level, Player player, BlockPos blockPos, BlockPos spawnPos, BlockState blockState, BlockEntity blockEntity, ItemStack itemStack) {
        player.awardStat(Stats.BLOCK_MINED.get(block));
        if (level instanceof ServerLevel) {
            Block.getDrops(blockState, (ServerLevel) level, blockPos, blockEntity).forEach(itemStack1 -> Block.popResource(level, spawnPos, itemStack1));
            blockState.spawnAfterBreak((ServerLevel) level, blockPos, itemStack, true);
        }
    }

}
