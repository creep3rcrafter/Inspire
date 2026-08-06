package net.github.creep3rcrafter.inspire.fabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBlockLootTableProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBiomeTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBlockTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricItemTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricModelProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricPlacedFeatureTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireDimensionProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspirePaintingVariantProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireWorldgenProvider;
import net.github.creep3rcrafter.inspire.register.InspireBiomes;
import net.github.creep3rcrafter.inspire.register.InspireConfiguredFeatures;
import net.github.creep3rcrafter.inspire.register.InspireLevelStems;
import net.github.creep3rcrafter.inspire.register.InspireNoiseGeneratorSettings;
import net.github.creep3rcrafter.inspire.register.InspirePlacedFeatures;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class InspireDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(InspireFabricBlockLootTableProvider::new);
        InspireFabricBlockTagProvider blockTagProvider = pack.addProvider(InspireFabricBlockTagProvider::new);
        pack.addProvider((output, registriesFuture) -> new InspireFabricItemTagProvider(output, registriesFuture, blockTagProvider));
        pack.addProvider(InspireFabricBiomeTagProvider::new);
        pack.addProvider(InspireFabricPlacedFeatureTagProvider::new);
        pack.addProvider(InspireFabricModelProvider::new);
        pack.addProvider(InspirePaintingVariantProvider::new);
        pack.addProvider(InspireWorldgenProvider::new);
        pack.addProvider(InspireDimensionProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, InspireConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, InspirePlacedFeatures::bootstrap);
        registryBuilder.add(Registries.BIOME, InspireBiomes::bootstrap);
        registryBuilder.add(Registries.NOISE_SETTINGS, InspireNoiseGeneratorSettings::bootstrap);
        registryBuilder.add(Registries.LEVEL_STEM, InspireLevelStems::bootstrap);
    }
}
