package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.block.WetSandBlock;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.class)
public abstract class BlockBehaviourMixin implements FeatureElement {
    @Inject(method = "isRandomlyTicking", at = @At(value = "RETURN"), cancellable = true)
    public void injectGetMaxCost2(BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
        if (blockState.getBlock() == Blocks.SAND) {
            cir.setReturnValue(true);
        }
    }
    @Inject(method = "randomTick", at = @At(value = "RETURN"))
    public void injectGetMaxCost(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource, CallbackInfo ci) {
        if (blockState.getBlock() == Blocks.SAND) {
            if ((WetSandBlock.getNearbyMoisture(serverLevel, blockPos) > 1)) {
                serverLevel.setBlock(blockPos, InspireBlocks.WET_SAND.get().defaultBlockState().setValue(WetSandBlock.MOISTURE, 1), Block.UPDATE_CLIENTS);
            }
            if ((WetSandBlock.getNearbyMoisture(serverLevel, blockPos) < 7) && serverLevel.isRainingAt(blockPos.above())) {
                serverLevel.setBlock(blockPos, InspireBlocks.WET_SAND.get().defaultBlockState().setValue(WetSandBlock.MOISTURE, 1), Block.UPDATE_CLIENTS);
            }
        }
    }
}
