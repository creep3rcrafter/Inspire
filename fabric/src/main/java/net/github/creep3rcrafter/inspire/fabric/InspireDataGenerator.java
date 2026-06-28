package net.github.creep3rcrafter.inspire.fabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricBlockTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricItemTagProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricLootTableProvider;
import net.github.creep3rcrafter.inspire.fabric.datagen.InspireFabricModelProvider;

public class InspireDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(InspireFabricLootTableProvider::new);
        // DISABLED: Tag and model providers use APIs that don't exist in Minecraft 1.21.1
        // pack.addProvider(InspireFabricBlockTagProvider::new);
        // pack.addProvider(InspireFabricItemTagProvider::new);
        // pack.addProvider(InspireFabricModelProvider::new);
    }
}
