package net.github.creep3rcrafter.inspire.mixin;

import com.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@SuppressWarnings("unused")
@Mixin(World.class)
public abstract class WorldComparatorMixin {//Makes Prismarine/Bluestone Comparator work

    @Redirect(method = "updateComparators", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"), require = 2)
    private boolean redirectUpdateComparators(BlockState instance, Block block) {
        return instance.isOf(block) || instance.isOf(InspireBlocks.BLUESTONE_COMPARATOR.get());
    }
}

