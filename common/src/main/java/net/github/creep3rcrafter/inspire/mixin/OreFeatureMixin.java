package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ChunkSectionCache;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.BitSet;
import java.util.Iterator;

@Mixin(OreFeature.class)
public abstract class OreFeatureMixin {//genertates bluestone ore only where redstone was and only if it was touching water

    @Inject(method = "generateVeinPart", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/chunk/ChunkSection;setBlockState(IIILnet/minecraft/block/BlockState;Z)Lnet/minecraft/block/BlockState;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void injectGenerateVeinPart(StructureWorldAccess world, Random random, OreFeatureConfig config, double startX, double endX, double startZ, double endZ, double startY, double endY, int x, int y, int z, int horizontalSize, int verticalSize, CallbackInfoReturnable<BlockState> cir, int i, BitSet bitSet, BlockPos.Mutable mutable, int j, double[] ds, ChunkSectionCache chunkSectionCache, int m, double d, double e, double g, double h, int n, int o, int p, int q, int r, int s, int t, double u, int v, double w, int aa, double ab, int ac, ChunkSection chunkSection, int ad, int ae, int af, BlockState blockState, Iterator var57, OreFeatureConfig.Target target) {
        if (target.state.isOf(Blocks.REDSTONE_ORE)) {
            if (Feature.testAdjacentStates(chunkSectionCache::getBlockState, mutable, state2 -> state2.getFluidState().isOf(Fluids.WATER))) {
                chunkSection.setBlockState(ad, ae, af, InspireBlocks.BLUESTONE_ORE.get().getDefaultState(), false);
            }
        } else if (target.state.isOf(Blocks.DEEPSLATE_REDSTONE_ORE)) {
            if (Feature.testAdjacentStates(chunkSectionCache::getBlockState, mutable, state2 -> state2.getFluidState().isOf(Fluids.WATER))) {
                chunkSection.setBlockState(ad, ae, af, InspireBlocks.DEEPSLATE_BLUESTONE_ORE.get().getDefaultState(), false);
            }
        }
    }
}
