package net.github.creep3rcrafter.inspire.mixin;


import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.RepeaterBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RedStoneWireBlock.class)
public abstract class RedstoneWireBlockMixin extends Block {//Makes Bluestone and Redstone and new Repeater connect

    @Unique
    private static boolean inspire$wiresGivePower;

    public RedstoneWireBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "connectsTo(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/Direction;)Z", at = @At(value = "RETURN"), cancellable = true)
    private static void InjectConnectsTo(BlockState state, Direction dir, CallbackInfoReturnable<Boolean> cir) {
        if (state.is(InspireBlocks.BLUESTONE_WIRE.get()) || state.is(Blocks.REDSTONE_WIRE)) {
            cir.setReturnValue(true);
        } else if (state.is(InspireBlocks.BLUESTONE_REPEATER.get()) || state.is(Blocks.REPEATER)) {
            Direction direction2 = state.getValue(RepeaterBlock.FACING);
            cir.setReturnValue(direction2 == dir || direction2.getOpposite() == dir);
        }
    }

    @Redirect(method = {"updateNeighbors", "prepare", "increasePower"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"), require = 5)
    private boolean redirectIsOf(BlockState instance, Block block) {
        if (instance.is(InspireBlocks.BLUESTONE_WIRE.get()) || instance.is(Blocks.REDSTONE_WIRE)) {
            return true;
        }
        return instance.is(block);
    }

    @Redirect(method = "getReceivedRedstonePower", at = @At(value = "FIELD", target = "Lnet/minecraft/block/RedstoneWireBlock;wiresGivePower:Z"), require = 2)
    private void redirectPowerWrite(RedStoneWireBlock instance, boolean value) {
        inspire$wiresGivePower = value;
    }

    @Redirect(method = {"getWeakRedstonePower", "getStrongRedstonePower", "emitsRedstonePower"}, at = @At(value = "FIELD", target = "Lnet/minecraft/block/RedstoneWireBlock;wiresGivePower:Z"), require = 3)
    private boolean redirectPowerRead(RedStoneWireBlock instance) {
        return inspire$wiresGivePower;
    }
}