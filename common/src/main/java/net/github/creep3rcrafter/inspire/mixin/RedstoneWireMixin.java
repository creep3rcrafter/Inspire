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
public abstract class RedstoneWireMixin extends Block {

    @Unique
    private static boolean architectury_theupdatemod$shouldSignal2;

    public RedstoneWireMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "shouldConnectTo(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", at = @At(value = "RETURN"), cancellable = true)
    private static void InjectShouldConnectTo(BlockState blockState, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        // || blockState.is(ModBlocks.GLOWSTONE_WIRE.get()) || blockState.is(ModBlocks.SOULSTONE_WIRE.get())
        if (blockState.is(InspireBlocks.BLUESTONE_WIRE.get()) || blockState.is(Blocks.REDSTONE_WIRE)) {
            cir.setReturnValue(true);
        } else if (blockState.is(InspireBlocks.BLUESTONE_REPEATER.get()) || blockState.is(Blocks.REPEATER)) {
            Direction direction2 = (Direction) blockState.getValue(RepeaterBlock.FACING);
            cir.setReturnValue(direction2 == direction || direction2.getOpposite() == direction);
        }
    }

    @Redirect(method = {"checkCornerChangeAt", "updateIndirectNeighbourShapes", "getWireSignal"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"), require = 5)
    private boolean redirectCheckCornerChangeAt(BlockState blockState, Block block) {
        // || blockState.is(ModBlocks.GLOWSTONE_WIRE.get()) || blockState.is(ModBlocks.SOULSTONE_WIRE.get())
        if (blockState.is(InspireBlocks.BLUESTONE_WIRE.get()) || blockState.is(Blocks.REDSTONE_WIRE)) {
            return true;
        }
        return blockState.is(block);
    }

    @Redirect(method = "calculateTargetStrength", at = @At(value = "FIELD", target = "net/minecraft/world/level/block/RedStoneWireBlock.shouldSignal:Z"), require = 2)
    private void redirectPowerWrite(RedStoneWireBlock owner, boolean value) {
        architectury_theupdatemod$shouldSignal2 = value;
    }

    @Redirect(method = {"getSignal", "getDirectSignal", "isSignalSource"}, at = @At(value = "FIELD", target = "net/minecraft/world/level/block/RedStoneWireBlock.shouldSignal:Z"), require = 3)
    private boolean redirectPowerRead(RedStoneWireBlock owner) {
        return architectury_theupdatemod$shouldSignal2;
    }
}