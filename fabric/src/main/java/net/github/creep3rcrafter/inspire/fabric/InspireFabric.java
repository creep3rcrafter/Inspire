package net.github.creep3rcrafter.inspire.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public final class InspireFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        InspireCommon.init();
        LootTableEvents.MODIFY.register((resourceKey, builder, lootTableSource, provider) -> {
            if (resourceKey == BuiltInLootTables.DESERT_PYRAMID){
                LootPool.Builder lootPool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CRESCENT_DUNES.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.25f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool.build());
            }
            if (resourceKey == BuiltInLootTables.ANCIENT_CITY){
                LootPool.Builder lootPool1 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_ANCESTRY.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.1f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool1.build());
                LootPool.Builder lootPool2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_DEEPER.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.1f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool2.build());
            }
            if (resourceKey == BuiltInLootTables.OCEAN_RUIN_WARM_ARCHAEOLOGY
                    || resourceKey == BuiltInLootTables.OCEAN_RUIN_COLD_ARCHAEOLOGY
                    || resourceKey == BuiltInLootTables.UNDERWATER_RUIN_BIG
                    || resourceKey == BuiltInLootTables.UNDERWATER_RUIN_SMALL
                    || resourceKey == BuiltInLootTables.BURIED_TREASURE
                    || resourceKey == BuiltInLootTables.SHIPWRECK_TREASURE){
                LootPool.Builder lootPool1 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_AXOLOTL.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.5f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool1.build());
                LootPool.Builder lootPool2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_DRAGON_FISH.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.5f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool2.build());
                LootPool.Builder lootPool3 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_SHUNIJI.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.5f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool3.build());
            }
            if (resourceKey == BuiltInLootTables.FISHING_TREASURE){
                LootPool.Builder lootPool1 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_AXOLOTL.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool1.build());
                LootPool.Builder lootPool2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_DRAGON_FISH.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool2.build());
                LootPool.Builder lootPool3 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_SHUNIJI.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool3.build());
            }
            if (resourceKey == BuiltInLootTables.RUINED_PORTAL){
                LootPool.Builder lootPool1 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_BALLAD_OF_THE_CATS.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool1.build());
                LootPool.Builder lootPool2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CHRYSAPOEIA.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool2.build());
                LootPool.Builder lootPool3 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CONCRETE_HALLS.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool3.build());
                LootPool.Builder lootPool4 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_DEAD_VOXEL.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool4.build());
                LootPool.Builder lootPool5 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_RUBEDO.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool5.build());
                LootPool.Builder lootPool6 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_SO_BELOW.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool6.build());
                LootPool.Builder lootPool7 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_WARMTH.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.01f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool7.build());
            }

            if (resourceKey == BuiltInLootTables.NETHER_BRIDGE){
                LootPool.Builder lootPool1 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_BALLAD_OF_THE_CATS.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool1.build());
                LootPool.Builder lootPool2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CHRYSAPOEIA.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool2.build());
                LootPool.Builder lootPool3 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_CONCRETE_HALLS.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool3.build());
                LootPool.Builder lootPool4 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_DEAD_VOXEL.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool4.build());
                LootPool.Builder lootPool5 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_RUBEDO.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool5.build());
                LootPool.Builder lootPool6 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_SO_BELOW.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool6.build());
                LootPool.Builder lootPool7 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_WARMTH.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.30f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool7.build());
            }
            if (resourceKey == BuiltInLootTables.JUNGLE_TEMPLE){
                LootPool.Builder lootPool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_BROMELIAD.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.75f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool.build());
            }
            if (resourceKey == BuiltInLootTables.IGLOO_CHEST){
                LootPool.Builder lootPool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(InspireItems.MUSIC_DISC_STAND_TALL.get()))
                        .setRolls(ConstantValue.exactly(1))
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.75f).build())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                builder.pool(lootPool.build());
                //EnderDragon
            }
        });
    }
}
