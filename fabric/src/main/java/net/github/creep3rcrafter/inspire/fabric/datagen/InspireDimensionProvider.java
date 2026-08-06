package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.github.creep3rcrafter.inspire.register.InspireLevelStems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class InspireDimensionProvider implements DataProvider {
    private final FabricDataOutput output;
    private final CompletableFuture<HolderLookup.Provider> registriesFuture;

    public InspireDimensionProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        this.output = InspireSharedDataOutput.common(output);
        this.registriesFuture = registriesFuture;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cachedOutput) {
        PackOutput.PathProvider pathProvider = output.createRegistryElementsPathProvider(Registries.LEVEL_STEM);

        return registriesFuture.thenCompose(registries -> {
            LevelStem netherStem = InspireLevelStems.netherStem(
                    registries.lookupOrThrow(Registries.DIMENSION_TYPE),
                    registries.lookupOrThrow(Registries.BIOME),
                    registries.lookupOrThrow(Registries.NOISE_SETTINGS)
            );
            Path path = pathProvider.json(LevelStem.NETHER.location());
            return DataProvider.saveStable(cachedOutput, registries, LevelStem.CODEC, netherStem, path);
        });
    }

    @Override
    public String getName() {
        return "Inspire Dimensions";
    }
}
