package net.github.creep3rcrafter.inspire.item;

import net.github.creep3rcrafter.inspire.block.HydroFireBlock;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

public class PrismarineAndSteelItem extends Item {
    public PrismarineAndSteelItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockPos blockPos2 = blockPos.relative(context.getClickedFace());
        if (!HydroFireBlock.canPlaceAt(level, blockPos2, context.getClickedFace())) {
            return InteractionResult.FAIL;
        }

        level.playSound(player, blockPos2, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.random.nextFloat() * 0.4F + 0.8F);
        BlockState blockState = HydroFireBlock.getState(level, blockPos2);
        level.setBlock(blockPos2, blockState, 11);
        level.gameEvent(player, GameEvent.BLOCK_PLACE, blockPos);
        ItemStack itemStack = context.getItemInHand();
        if (player instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.PLACED_BLOCK.trigger(serverPlayer, blockPos2, itemStack);
            itemStack.hurtAndBreak(1, player, context.getHand() == net.minecraft.world.InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
