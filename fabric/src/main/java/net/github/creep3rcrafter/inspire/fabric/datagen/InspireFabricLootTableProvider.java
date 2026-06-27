package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class InspireFabricLootTableProvider extends SimpleFabricLootTableProvider {
    public InspireFabricLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup, LootContextParamSets.CHEST);
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {
        /*
        LootPool.Builder lootPool = LootPool.lootPool()
                .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CRESCENT_DUNES.get()))
                .setRolls(ConstantValue.exactly(1));
        ResourceKey<?>[] tablesToModify = new ResourceKey[] {
                BuiltInLootTables.DESERT_PYRAMID,
                BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.VILLAGE_DESERT_HOUSE // Example of another table
        };

        biConsumer.accept(BuiltInLootTables.DESERT_PYRAMID, LootTable.lootTable()
                .modifyPools(builder -> {
                    builder.add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CRESCENT_DUNES.get()))
                            .setRolls(ConstantValue.exactly(1)).build();
                }));
         */
        //LootEvent.LootTableModificationContext.
    }
}
