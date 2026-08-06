package net.github.creep3rcrafter.inspire.register;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;

public final class InspireLevelStems {
    private InspireLevelStems() {
    }

    public static void bootstrap(BootstrapContext<LevelStem> context) {
        HolderGetter<DimensionType> dimensionTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<NoiseGeneratorSettings> noiseSettings = context.lookup(Registries.NOISE_SETTINGS);

        context.register(
                LevelStem.NETHER,
                netherStem(dimensionTypes, biomes, noiseSettings)
        );
    }

    public static LevelStem netherStem(
            HolderGetter<DimensionType> dimensionTypes,
            HolderGetter<Biome> biomes,
            HolderGetter<NoiseGeneratorSettings> noiseSettings
    ) {
        return new LevelStem(
                dimensionTypes.getOrThrow(BuiltinDimensionTypes.NETHER),
                new NoiseBasedChunkGenerator(
                        MultiNoiseBiomeSource.createFromList(witheredWastesBiomes(biomes)),
                        noiseSettings.getOrThrow(InspireNoiseGeneratorSettings.WITHERED_WASTES_NETHER)
                )
        );
    }

    private static Climate.ParameterList<Holder<Biome>> witheredWastesBiomes(HolderGetter<Biome> biomes) {
        return new Climate.ParameterList<>(List.of(
                Pair.of(Climate.parameters(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), biomes.getOrThrow(Biomes.NETHER_WASTES)),
                Pair.of(Climate.parameters(0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY)),
                Pair.of(Climate.parameters(0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.125f), biomes.getOrThrow(InspireBiomes.WITHERED_WASTES)),
                Pair.of(Climate.parameters(0.1f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f), biomes.getOrThrow(InspireBiomes.SOUL_FOREST)),
                Pair.of(Climate.parameters(0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), biomes.getOrThrow(Biomes.CRIMSON_FOREST)),
                Pair.of(Climate.parameters(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.375f), biomes.getOrThrow(Biomes.WARPED_FOREST)),
                Pair.of(Climate.parameters(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.175f), biomes.getOrThrow(Biomes.BASALT_DELTAS))
        ));
    }
}
