package net.github.creep3rcrafter.inspire.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.register.InspireBlockFamilies;
import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.github.creep3rcrafter.inspire.utils.BetterBlockFamilies;
import net.github.creep3rcrafter.inspire.utils.BetterBlockFamily;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InspireFabricModelProvider extends FabricModelProvider {
    public InspireFabricModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
            /*
        BuiltInRegistries.BLOCK.forEach(block -> {
            ResourceLocation key = BuiltInRegistries.BLOCK.getKey(block);
            if (!InspireCommon.MOD_ID.equals(key.getNamespace())) {
                return;
            }
            if (block instanceof DoorBlock) {
                blockStateModelGenerator.createDoor(block);
                return;
            }
            if (block instanceof TrapDoorBlock) {
                blockStateModelGenerator.createTrapdoor(block);
                return;
            }
            if (block instanceof RotatedPillarBlock) {
                blockStateModelGenerator.createAxisAlignedPillarBlock(block, TexturedModel.COLUMN);
                return;
            }
            blockStateModelGenerator.createTrivialCube(block);
        });
             */
        customBlockFamily(BetterBlockFamilies.CYAN_NETHER_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.CYAN_NETHER_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.RED_NETHER_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.RED_NETHER_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.NETHER_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.NETHER_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.BRICK_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.QUARTZ_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.QUARTZ_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.PRISMARINE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.DARK_PRISMARINE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.END_STONE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.PURPUR_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.STONE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.MOSSY_STONE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_DEEPSLATE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_DEEPSLATE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_BLACKSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.GILDED_BLACKSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SMOOTH_STONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.REDSTONE_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.AMETHYST_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.GLOWSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SMOOTH_BASALT_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_BASALT_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.BASALT_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_GLOWSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_GLOWSTONE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_GLOWSTONE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_TUFF_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.TUFF_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.QUARTZ_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SMOOTH_QUARTZ_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.RESIN_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_GRANITE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_DIORITE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_ANDESITE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SANDSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.IRON_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.GOLD_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.EMERALD_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.DIAMOND_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.NETHERITE_BLOCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.OBSIDIAN_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.CRYING_OBSIDIAN_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.BEDROCK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SOUL_SANDSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SOUL_SLATE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.DRIPSTONE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_CALCITE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.DEEPSLATE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.MUD_BRICKS, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.POLISHED_BLACKSTONE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.MOSSY_STONE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.STONE_TILES_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.PURPUR_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.END_STONE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.PRISMARINE_BRICKS_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.OAK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.SPRUCE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.BIRCH_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.JUNGLE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.ACACIA_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.DARK_OAK_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.MANGROVE_FAMILY, blockStateModelGenerator);
        customBlockFamily(BetterBlockFamilies.CHERRY_FAMILY, blockStateModelGenerator);

    }
    public static void customBlockFamily(BetterBlockFamily betterBlockFamily, BlockModelGenerators blockStateModelGenerator) {
        if(betterBlockFamily.main != null) {
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.main).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createTrivialCube(betterBlockFamily.main);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.cracked).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createTrivialCube(betterBlockFamily.cracked);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.chiseled).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createTrivialCube(betterBlockFamily.chiseled);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.grate).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createTrivialCube(betterBlockFamily.grate);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.lamp).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createTrivialCube(betterBlockFamily.lamp);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.pillar).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createRotatedPillarWithHorizontalVariant(betterBlockFamily.pillar, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.wall).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.WALL_POST.create(betterBlockFamily.wall, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.WALL_LOW_SIDE.create(betterBlockFamily.wall, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation3 = ModelTemplates.WALL_TALL_SIDE.create(betterBlockFamily.wall, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createWall(betterBlockFamily.wall, resourceLocation, resourceLocation2, resourceLocation3));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.slab).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                TextureMapping textureMapping2 = TextureMapping.column(TextureMapping.getBlockTexture(betterBlockFamily.main), textureMapping.get(TextureSlot.TOP));
                ResourceLocation resourceLocation = ModelTemplates.SLAB_BOTTOM.create(betterBlockFamily.slab, textureMapping2, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.SLAB_TOP.create(betterBlockFamily.slab, textureMapping2, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation3 = ModelTemplates.CUBE_COLUMN.createWithOverride(betterBlockFamily.slab, "_double", textureMapping2, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSlab(betterBlockFamily.slab, resourceLocation, resourceLocation2, resourceLocation3));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.stair).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.STAIRS_INNER.create(betterBlockFamily.stair, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.STAIRS_STRAIGHT.create(betterBlockFamily.stair, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation3 = ModelTemplates.STAIRS_OUTER.create(betterBlockFamily.stair, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createStairs(betterBlockFamily.stair, resourceLocation, resourceLocation2, resourceLocation3));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.fence).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.FENCE_POST.create(betterBlockFamily.fence, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.FENCE_SIDE.create(betterBlockFamily.fence, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFence(betterBlockFamily.fence, resourceLocation, resourceLocation2));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.fenceGate).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.FENCE_GATE_OPEN.create(betterBlockFamily.fenceGate, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.FENCE_GATE_CLOSED.create(betterBlockFamily.fenceGate, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation3 = ModelTemplates.FENCE_GATE_WALL_OPEN.create(betterBlockFamily.fenceGate, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation4 = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(betterBlockFamily.fenceGate, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFenceGate(betterBlockFamily.fenceGate, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4, true));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.pressurePlate).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.PRESSURE_PLATE_UP.create(betterBlockFamily.pressurePlate, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.PRESSURE_PLATE_DOWN.create(betterBlockFamily.pressurePlate, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(betterBlockFamily.pressurePlate, resourceLocation, resourceLocation2));
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.door).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createDoor(betterBlockFamily.door);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.trapdoor).getNamespace().equals(InspireCommon.MOD_ID)) {
                blockStateModelGenerator.createOrientableTrapdoor(betterBlockFamily.trapdoor);
            }
            if (BuiltInRegistries.BLOCK.getKey(betterBlockFamily.button).getNamespace().equals(InspireCommon.MOD_ID)) {
                TextureMapping textureMapping = TextureMapping.cube(betterBlockFamily.main);
                ResourceLocation resourceLocation = ModelTemplates.BUTTON.create(betterBlockFamily.button, textureMapping, blockStateModelGenerator.modelOutput);
                ResourceLocation resourceLocation2 = ModelTemplates.BUTTON_PRESSED.create(betterBlockFamily.button, textureMapping, blockStateModelGenerator.modelOutput);
                blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createButton(betterBlockFamily.button, resourceLocation, resourceLocation2));
            }
        }
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        BuiltInRegistries.ITEM.forEach(item -> {
            ResourceLocation key = BuiltInRegistries.ITEM.getKey(item);
            if (!InspireCommon.MOD_ID.equals(key.getNamespace())) {
                return;
            }
            if (item instanceof BlockItem) {
                return;
            }
            itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        });
    }
}
