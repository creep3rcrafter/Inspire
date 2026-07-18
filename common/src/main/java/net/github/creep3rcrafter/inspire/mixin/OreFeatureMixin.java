package net.github.creep3rcrafter.inspire.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.BulkSectionAccess;
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
    @Inject(method = "doPlace", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/LevelChunkSection;setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;", shift = At.Shift.AFTER))
    private void injectDoPlace(WorldGenLevel worldGenLevel, RandomSource randomSource, OreConfiguration oreConfiguration, double d, double e, double f, double g, double h, double i, int j, int k, int l, int m, int n, CallbackInfoReturnable<Boolean> cir, @Local(name = "mutableBlockPos") BlockPos.MutableBlockPos mutableBlockPos, @Local(name = "levelChunkSection") LevelChunkSection levelChunkSection, @Local(name = "al") int al, @Local(name = "am") int am, @Local(name = "an") int an, @Local(name = "targetBlockState") OreConfiguration.TargetBlockState targetBlockState) {
        if (targetBlockState.state.is(Blocks.REDSTONE_ORE)) {
            boolean adjacentToWater = false;
            for (net.minecraft.core.Direction dir : net.minecraft.core.Direction.values()) {
                if (worldGenLevel.getFluidState(mutableBlockPos.relative(dir)).is(Fluids.WATER)) {
                    adjacentToWater = true;
                    break;
                }
            }
            if (adjacentToWater) {
                levelChunkSection.setBlockState(al, am, an, InspireBlocks.BLUESTONE_ORE.get().defaultBlockState(), false);
            }
        } else if (targetBlockState.state.is(Blocks.DEEPSLATE_REDSTONE_ORE)) {
            boolean adjacentToWater = false;
            for (net.minecraft.core.Direction dir : net.minecraft.core.Direction.values()) {
                if (worldGenLevel.getFluidState(mutableBlockPos.relative(dir)).is(Fluids.WATER)) {
                    adjacentToWater = true;
                    break;
                }
            }
            if (adjacentToWater) {
                levelChunkSection.setBlockState(al, am, an, InspireBlocks.DEEPSLATE_BLUESTONE_ORE.get().defaultBlockState(), false);
            }
        }
    }
}
