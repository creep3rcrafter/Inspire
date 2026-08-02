package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireWoodBark;
import net.github.creep3rcrafter.inspire.utils.AxeItemStrippingHooks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {
    @Inject(method = "useOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", shift = At.Shift.AFTER))
    private void InjectOnHitBlock(UseOnContext useOnContext, CallbackInfoReturnable<InteractionResult> cir) {
        BlockPos blockPos = useOnContext.getClickedPos().relative(useOnContext.getClickedFace());
        Level level = useOnContext.getLevel();
        if (!level.isClientSide()) {
            Block block = level.getBlockState(useOnContext.getClickedPos()).getBlock();
            if (InspireWoodBark.BLOCK_ITEM_STACK_MAP.containsKey(block)) {
                System.out.println("Injected!");
                level.addFreshEntity(new ItemEntity(level, blockPos.getX() + 0.5f, blockPos.getY() + 0.5f, blockPos.getZ() + 0.5f, InspireWoodBark.BLOCK_ITEM_STACK_MAP.get(block).copy()));
            }
        }
    }
    @Inject(
            method = "evaluateNewBlockState",
            at = @At("HEAD"),
            cancellable = true
    )
    private static void inspire$wallStripping(
            Level level, BlockPos blockPos, Player player, BlockState blockState, CallbackInfoReturnable<Optional<BlockState>> cir) {

        Block replacement = AxeItemStrippingHooks.get(blockState.getBlock());

        if (replacement != null) {
            cir.setReturnValue(Optional.of(
                    replacement.withPropertiesOf(blockState)
            ));
        }
    }
}
