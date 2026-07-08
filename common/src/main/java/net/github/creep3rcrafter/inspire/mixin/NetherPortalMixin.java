package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Consumer;

@Mixin(NetherPortal.class)
public class NetherPortalMixin {
    @Shadow
    @Final
    private WorldAccess world;

    @Shadow
    @Final
    private Direction.Axis axis;

    @Inject(method = "validStateInsidePortal", at = @At("RETURN"), cancellable = true)
    private static void injectValidStateInsidePortal(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(cir.getReturnValue() || state.isOf(Blocks.WATER) || state.isOf(InspireBlocks.HYDRO_FIRE.get()));
    }

    @Redirect(method = "createPortal", at = @At(value = "INVOKE", target = "Ljava/lang/Iterable;forEach(Ljava/util/function/Consumer;)V"))
    private void injectValidStateInsidePortal(Iterable<BlockPos> instance, Consumer<Void> consumer) {
        BlockState blockState = (BlockState) Blocks.NETHER_PORTAL.getDefaultState().with(NetherPortalBlock.AXIS, axis);
        instance.forEach(blockPos -> this.world.setBlockState(blockPos, blockState.with(Properties.WATERLOGGED, world.getFluidState(blockPos).getFluid() == Fluids.WATER), 18));
    }

}
