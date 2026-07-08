package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.portal.PortalShape;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Consumer;

@Mixin(PortalShape.class)
public abstract class PortalShapeMixin {

    @Shadow
    @Final
    private Direction.Axis axis;

    @Shadow
    @Final
    private LevelAccessor levelAccessor;

    @Inject(method = "isEmpty", at = @At("RETURN"), cancellable = true)
    private static void injectValidStateInsidePortal(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(cir.getReturnValue() || state.is(Blocks.WATER) || state.is(InspireBlocks.HYDRO_FIRE.get()));
    }

    @Redirect(method = "createPortalBlocks", at = @At(value = "INVOKE", target = "Ljava/lang/Iterable;forEach(Ljava/util/function/Consumer;)V"))
    public void redirectcreatePortalBlocks(Iterable<BlockPos> instance, Consumer<Void> consumer) {
        BlockState blockState = (BlockState) Blocks.NETHER_PORTAL.defaultBlockState().setValue(NetherPortalBlock.AXIS, axis);
        instance.forEach(blockPos -> this.levelAccessor.setBlock(blockPos, blockState.setValue(BlockStateProperties.WATERLOGGED, levelAccessor.getFluidState(blockPos).getType() == Fluids.WATER), 18));
    }
}
