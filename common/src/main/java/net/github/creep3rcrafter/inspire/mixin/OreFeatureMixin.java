package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.material.Fluids;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.BitSet;
import java.util.Iterator;

@Mixin(OreFeature.class)
public abstract class OreFeatureMixin {//genertates bluestone ore only where redstone was and only if it was touching water

    @Inject(method = "generateVeinPart", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/LevelChunkSection;setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void injectGenerateVeinPart(WorldGenLevel world, RandomSource random, OreConfiguration config, double startX, double endX, double startZ, double endZ, double startY, double endY, int x, int y, int z, int horizontalSize, int verticalSize, CallbackInfoReturnable<BlockState> cir, int i, BitSet bitSet, BlockPos.MutableBlockPos mutable, int j, double[] ds, int k, int l, int m, double d, double e, double g, double h, int n, int o, int p, int q, int r, int s, int t, double u, int v, double w, int aa, double ab, int ac, LevelChunkSection chunkSection, int ad, int ae, int af, BlockState blockState, Iterator var57, OreConfiguration.TargetBlockState target) {
        if (target.state.is(Blocks.REDSTONE_ORE)) {
            boolean adjacentToWater = false;
            for (net.minecraft.core.Direction dir : net.minecraft.core.Direction.values()) {
                if (world.getFluidState(mutable.relative(dir)).is(Fluids.WATER)) {
                    adjacentToWater = true;
                    break;
                }
            }
            if (adjacentToWater) {
                chunkSection.setBlockState(ad, ae, af, InspireBlocks.BLUESTONE_ORE.get().defaultBlockState(), false);
            }
        } else if (target.state.is(Blocks.DEEPSLATE_REDSTONE_ORE)) {
            boolean adjacentToWater = false;
            for (net.minecraft.core.Direction dir : net.minecraft.core.Direction.values()) {
                if (world.getFluidState(mutable.relative(dir)).is(Fluids.WATER)) {
                    adjacentToWater = true;
                    break;
                }
            }
            if (adjacentToWater) {
                chunkSection.setBlockState(ad, ae, af, InspireBlocks.DEEPSLATE_BLUESTONE_ORE.get().defaultBlockState(), false);
            }
        }
    }
}
