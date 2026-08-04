package net.github.creep3rcrafter.inspire.fabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBlockLootTableProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBlockTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricItemTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricModelProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspirePaintingVariantProvider;

public class InspireDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(InspireFabricBlockLootTableProvider::new);
        InspireFabricBlockTagProvider blockTagProvider = pack.addProvider(InspireFabricBlockTagProvider::new);
        pack.addProvider((output, registriesFuture) -> new InspireFabricItemTagProvider(output, registriesFuture, blockTagProvider));
        pack.addProvider(InspireFabricModelProvider::new);
        pack.addProvider(InspirePaintingVariantProvider::new);
    }
}
