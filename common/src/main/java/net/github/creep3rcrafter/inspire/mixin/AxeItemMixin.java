package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireWoodBark;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {
    @Inject(method = "useOn", at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z", shift = At.Shift.AFTER, ordinal = 3))
    private void InjectOnHitBlock(UseOnContext useOnContext, CallbackInfoReturnable<InteractionResult> cir) {
        BlockPos blockPos = useOnContext.getClickedPos().relative(useOnContext.getClickedFace());
        Level level = useOnContext.getLevel();
        if (!level.isClientSide()) {
            Block block = level.getBlockState(useOnContext.getClickedPos()).getBlock();
            if (InspireWoodBark.BLOCK_ITEM_STACK_MAP.containsKey(block)) {
                level.addFreshEntity(new ItemEntity(level, blockPos.getX() + 0.5f, blockPos.getY() + 0.5f, blockPos.getZ() + 0.5f, InspireWoodBark.BLOCK_ITEM_STACK_MAP.get(block)));
            }
        }
    }
}
