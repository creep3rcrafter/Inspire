package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.*;

import java.util.concurrent.CompletableFuture;

public class InspireFabricBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> ALL_BLOCKS = TagKey.create(
            Registries.BLOCK,
            ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "all_blocks")
    );

    public InspireFabricBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        FabricTagBuilder allBlocks = getOrCreateTagBuilder(ALL_BLOCKS);
        FabricTagBuilder walls = getOrCreateTagBuilder(BlockTags.WALLS);
        FabricTagBuilder slabs = getOrCreateTagBuilder(BlockTags.SLABS);
        FabricTagBuilder stairs = getOrCreateTagBuilder(BlockTags.STAIRS);
        FabricTagBuilder fences = getOrCreateTagBuilder(BlockTags.FENCES);
        FabricTagBuilder fenceGates = getOrCreateTagBuilder(BlockTags.FENCE_GATES);
        FabricTagBuilder doors = getOrCreateTagBuilder(BlockTags.DOORS);
        FabricTagBuilder trapdoors = getOrCreateTagBuilder(BlockTags.TRAPDOORS);
        FabricTagBuilder buttons = getOrCreateTagBuilder(BlockTags.BUTTONS);
        FabricTagBuilder pressurePlates = getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES);

        BuiltInRegistries.BLOCK.forEach(block -> {
            ResourceLocation key = BuiltInRegistries.BLOCK.getKey(block);
            if (InspireCommon.MOD_ID.equals(key.getNamespace())) {
                allBlocks.add(block);
                if (block instanceof WallBlock) walls.add(block);
                if (block instanceof SlabBlock) slabs.add(block);
                if (block instanceof StairBlock) stairs.add(block);
                if (block instanceof FenceBlock) fences.add(block);
                if (block instanceof FenceGateBlock) fenceGates.add(block);
                if (block instanceof DoorBlock) doors.add(block);
                if (block instanceof TrapDoorBlock) trapdoors.add(block);
                if (block instanceof ButtonBlock) buttons.add(block);
                if (block instanceof PressurePlateBlock) pressurePlates.add(block);
            }
        });
    }
}
