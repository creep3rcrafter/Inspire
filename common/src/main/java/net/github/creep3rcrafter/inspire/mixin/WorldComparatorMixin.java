package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@SuppressWarnings("unused")
@Mixin(Level.class)
public abstract class WorldComparatorMixin {//Makes Prismarine/Bluestone Comparator work
    @Redirect(method = "updateNeighbourForOutputSignal", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"), require = 2)
    private boolean redirectUpdateComparators(BlockState instance, Block block) {
        return instance.is(block) || instance.is(InspireBlocks.BLUESTONE_COMPARATOR.get());
    }
}
