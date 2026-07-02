package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.RegularBedBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BedPart;

import java.util.concurrent.CompletableFuture;

public class InspireFabricBlockLootTableProvider extends FabricBlockLootTableProvider {
    public InspireFabricBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        BuiltInRegistries.BLOCK.forEach(block -> {
            ResourceLocation key = BuiltInRegistries.BLOCK.getKey(block);
            if (!InspireCommon.MOD_ID.equals(key.getNamespace())) {
                return;
            }

            if (block == null || block.asItem() == Items.AIR) {
                return;
            }

            if (block instanceof DoorBlock doorBlock) {
                add(doorBlock, createDoorTable(doorBlock));
                return;
            }

            if (block instanceof RegularBedBlock) {
                add(block, createSinglePropConditionTable(block, RegularBedBlock.PART, BedPart.FOOT));
                return;
            }

            dropSelf(block);
        });
    }
}
