package net.github.creep3rcrafter.inspire.mixin;


import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RedstoneWireBlock.class)
public abstract class RedstoneWireBlockMixin extends Block {//Makes Bluestone and Redstone and new Repeater connect

    @Unique
    private static boolean inspire$wiresGivePower;

    public RedstoneWireBlockMixin(Settings properties) {
        super(properties);
    }

    @Inject(method = "connectsTo(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/Direction;)Z", at = @At(value = "RETURN"), cancellable = true)
    private static void InjectConnectsTo(BlockState state, Direction dir, CallbackInfoReturnable<Boolean> cir) {
        if (state.isOf(InspireBlocks.BLUESTONE_WIRE.get()) || state.isOf(Blocks.REDSTONE_WIRE)) {
            cir.setReturnValue(true);
        } else if (state.isOf(InspireBlocks.BLUESTONE_REPEATER.get()) || state.isOf(Blocks.REPEATER)) {
            Direction direction2 = (Direction) state.get(RepeaterBlock.FACING);
            cir.setReturnValue(direction2 == dir || direction2.getOpposite() == dir);
        }
    }

    @Redirect(method = {"updateNeighbors", "prepare", "increasePower"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"), require = 5)
    private boolean redirectIsOf(BlockState instance, Block block) {
        if (instance.isOf(InspireBlocks.BLUESTONE_WIRE.get()) || instance.isOf(Blocks.REDSTONE_WIRE)) {
            return true;
        }
        return instance.isOf(block);
    }

    @Redirect(method = "getReceivedRedstonePower", at = @At(value = "FIELD", target = "Lnet/minecraft/block/RedstoneWireBlock;wiresGivePower:Z"), require = 2)
    private void redirectPowerWrite(RedstoneWireBlock instance, boolean value) {
        inspire$wiresGivePower = value;
    }

    @Redirect(method = {"getWeakRedstonePower", "getStrongRedstonePower", "emitsRedstonePower"}, at = @At(value = "FIELD", target = "Lnet/minecraft/block/RedstoneWireBlock;wiresGivePower:Z"), require = 3)
    private boolean redirectPowerRead(RedstoneWireBlock instance) {
        return inspire$wiresGivePower;
    }
}