package net.github.creep3rcrafter.inspire.utils;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.world.level.block.Blocks;

public class BetterBlockFamilies {
    public static final BetterBlockFamily CYAN_NETHER_BRICKS_FAMILY;
    public static final BetterBlockFamily CYAN_NETHER_TILES_FAMILY;
    public static final BetterBlockFamily RED_NETHER_BRICKS_FAMILY;
    public static final BetterBlockFamily RED_NETHER_TILES_FAMILY;
    public static final BetterBlockFamily NETHER_BRICKS_FAMILY;
    public static final BetterBlockFamily NETHER_TILES_FAMILY;
    public static final BetterBlockFamily BRICK_TILES_FAMILY;
    public static final BetterBlockFamily QUARTZ_BRICKS_FAMILY;
    public static final BetterBlockFamily QUARTZ_TILES_FAMILY;
    public static final BetterBlockFamily PRISMARINE_TILES_FAMILY;
    public static final BetterBlockFamily DARK_PRISMARINE_FAMILY;
    public static final BetterBlockFamily END_STONE_TILES_FAMILY;
    public static final BetterBlockFamily PURPUR_TILES_FAMILY;
    public static final BetterBlockFamily STONE_BRICKS_FAMILY;
    public static final BetterBlockFamily MOSSY_STONE_TILES_FAMILY;
    public static final BetterBlockFamily POLISHED_DEEPSLATE_TILES_FAMILY;
    public static final BetterBlockFamily POLISHED_DEEPSLATE_FAMILY;
    public static final BetterBlockFamily POLISHED_BLACKSTONE_FAMILY;
    public static final BetterBlockFamily GILDED_BLACKSTONE_FAMILY;
    public static final BetterBlockFamily SMOOTH_STONE_FAMILY;
    public static final BetterBlockFamily REDSTONE_BLOCK_FAMILY;
    public static final BetterBlockFamily AMETHYST_BLOCK_FAMILY;
    public static final BetterBlockFamily GLOWSTONE_FAMILY;
    public static final BetterBlockFamily SMOOTH_BASALT_FAMILY;
    public static final BetterBlockFamily POLISHED_BASALT_FAMILY;
    public static final BetterBlockFamily BASALT_FAMILY;
    public static final BetterBlockFamily POLISHED_GLOWSTONE_FAMILY;
    public static final BetterBlockFamily POLISHED_GLOWSTONE_BRICKS_FAMILY;
    public static final BetterBlockFamily POLISHED_GLOWSTONE_TILES_FAMILY;
    public static final BetterBlockFamily POLISHED_TUFF_FAMILY;
    public static final BetterBlockFamily TUFF_BRICKS_FAMILY;
    public static final BetterBlockFamily QUARTZ_FAMILY;
    public static final BetterBlockFamily SMOOTH_QUARTZ_FAMILY;
    public static final BetterBlockFamily RESIN_FAMILY;
    public static final BetterBlockFamily POLISHED_GRANITE_FAMILY;
    public static final BetterBlockFamily POLISHED_DIORITE_FAMILY;
    public static final BetterBlockFamily POLISHED_ANDESITE_FAMILY;
    public static final BetterBlockFamily SANDSTONE_FAMILY;
    public static final BetterBlockFamily IRON_BLOCK_FAMILY;
    public static final BetterBlockFamily GOLD_BLOCK_FAMILY;
    public static final BetterBlockFamily EMERALD_BLOCK_FAMILY;
    public static final BetterBlockFamily DIAMOND_BLOCK_FAMILY;
    public static final BetterBlockFamily NETHERITE_BLOCK_FAMILY;
    public static final BetterBlockFamily OBSIDIAN_FAMILY;
    public static final BetterBlockFamily CRYING_OBSIDIAN_FAMILY;
    public static final BetterBlockFamily BEDROCK_FAMILY;
    public static final BetterBlockFamily SOUL_SANDSTONE_FAMILY;
    public static final BetterBlockFamily SOUL_SLATE_FAMILY;
    public static final BetterBlockFamily DRIPSTONE_FAMILY;
    public static final BetterBlockFamily POLISHED_CALCITE_FAMILY;
    public static final BetterBlockFamily DEEPSLATE_BRICKS_FAMILY;
    public static final BetterBlockFamily MUD_BRICKS;
    public static final BetterBlockFamily POLISHED_BLACKSTONE_BRICKS_FAMILY;
    public static final BetterBlockFamily MOSSY_STONE_BRICKS_FAMILY;
    public static final BetterBlockFamily STONE_TILES_FAMILY;
    public static final BetterBlockFamily PURPUR_FAMILY;
    public static final BetterBlockFamily END_STONE_BRICKS_FAMILY;
    public static final BetterBlockFamily PRISMARINE_BRICKS_FAMILY;
    public static final BetterBlockFamily OAK_FAMILY;
    public static final BetterBlockFamily SPRUCE_FAMILY;
    public static final BetterBlockFamily BIRCH_FAMILY;
    public static final BetterBlockFamily JUNGLE_FAMILY;
    public static final BetterBlockFamily ACACIA_FAMILY;
    public static final BetterBlockFamily DARK_OAK_FAMILY;
    public static final BetterBlockFamily MANGROVE_FAMILY;
    public static final BetterBlockFamily CHERRY_FAMILY;
    public static final BetterBlockFamily BRICKS_FAMILY;

    static {
        BRICKS_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.BRICKS, // Main
                InspireBlocks.CRACKED_BRICKS.get(), // Cracked
                Blocks.BRICK_STAIRS, // Stair
                Blocks.BRICK_SLAB, // Slab
                Blocks.BRICK_WALL, // Wall
                InspireBlocks.BRICK_FENCE.get(), // Fence
                InspireBlocks.BRICK_FENCE_GATE.get(), // Fence Gate
                InspireBlocks.CHISELED_BRICKS.get(), // Chisled
                InspireBlocks.BRICK_PILLAR.get(), // Pillar
                InspireBlocks.BRICK_DOOR.get(), // Door
                InspireBlocks.BRICK_TRAPDOOR.get(), // Trap Door
                InspireBlocks.BRICK_BUTTON.get(), // Button
                InspireBlocks.BRICK_PRESSURE_PLATE.get(), // Pressure Plate
                InspireBlocks.BRICK_LAMP.get(), // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );
        CYAN_NETHER_BRICKS_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                InspireBlocks.CYAN_NETHER_BRICKS.get(), // Main
                InspireBlocks.CRACKED_CYAN_NETHER_BRICKS.get(), // Cracked
                InspireBlocks.CYAN_NETHER_BRICK_STAIRS.get(), // Stair
                InspireBlocks.CYAN_NETHER_BRICK_SLAB.get(), // Slab
                InspireBlocks.CYAN_NETHER_BRICK_WALL.get(), // Wall
                InspireBlocks.CYAN_NETHER_BRICK_FENCE.get(), // Fence
                InspireBlocks.CYAN_NETHER_BRICK_FENCE_GATE.get(), // Fence Gate
                InspireBlocks.CHISELED_CYAN_NETHER_BRICKS.get(), // Chisled
                null, // Pillar
                InspireBlocks.CYAN_NETHER_BRICK_DOOR.get(), // Door
                InspireBlocks.CYAN_NETHER_BRICK_TRAPDOOR.get(), // Trap Door
                InspireBlocks.CYAN_NETHER_BRICK_BUTTON.get(), // Button
                InspireBlocks.CYAN_NETHER_BRICK_PRESSURE_PLATE.get(), // Pressure Plate
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        CYAN_NETHER_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.CYAN_NETHER_TILES.get(), // Assuming a base block for tiles if not specified, using one of the tile definitions here. If specific blocks are needed, they should be added/corrected. Re-using the provided example structure:
                InspireBlocks.CRACKED_CYAN_NETHER_TILES.get(),
                InspireBlocks.CYAN_NETHER_TILE_STAIRS.get(),
                InspireBlocks.CYAN_NETHER_TILE_SLAB.get(),
                InspireBlocks.CYAN_NETHER_TILE_WALL.get(),
                InspireBlocks.CYAN_NETHER_TILE_FENCE.get(),
                InspireBlocks.CYAN_NETHER_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_CYAN_NETHER_TILES.get(),
                null, // Pillar
                InspireBlocks.CYAN_NETHER_TILE_DOOR.get(),
                InspireBlocks.CYAN_NETHER_TILE_TRAPDOOR.get(),
                InspireBlocks.CYAN_NETHER_TILE_BUTTON.get(),
                InspireBlocks.CYAN_NETHER_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        RED_NETHER_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.RED_NETHER_BRICKS,
                InspireBlocks.CRACKED_RED_NETHER_BRICKS.get(),
                Blocks.RED_NETHER_BRICK_STAIRS,
                Blocks.RED_NETHER_BRICK_SLAB,
                Blocks.RED_NETHER_BRICKS,
                InspireBlocks.RED_NETHER_BRICK_FENCE.get(),
                InspireBlocks.RED_NETHER_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_RED_NETHER_BRICKS.get(),
                null, // Pillar
                InspireBlocks.RED_NETHER_BRICK_DOOR.get(),
                InspireBlocks.RED_NETHER_BRICK_TRAPDOOR.get(),
                InspireBlocks.RED_NETHER_BRICK_BUTTON.get(),
                InspireBlocks.RED_NETHER_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        RED_NETHER_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.RED_NETHER_TILES.get(),
                InspireBlocks.CRACKED_RED_NETHER_TILES.get(),
                InspireBlocks.RED_NETHER_TILE_STAIRS.get(),
                InspireBlocks.RED_NETHER_TILE_SLAB.get(),
                InspireBlocks.RED_NETHER_TILE_WALL.get(),
                InspireBlocks.RED_NETHER_TILE_FENCE.get(),
                InspireBlocks.RED_NETHER_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_RED_NETHER_TILES.get(),
                null, // Pillar
                InspireBlocks.RED_NETHER_TILE_DOOR.get(),
                InspireBlocks.RED_NETHER_TILE_TRAPDOOR.get(),
                InspireBlocks.RED_NETHER_TILE_BUTTON.get(),
                InspireBlocks.RED_NETHER_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        NETHER_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.NETHER_BRICKS,
                Blocks.CRACKED_NETHER_BRICKS,
                Blocks.NETHER_BRICK_STAIRS,
                Blocks.NETHER_BRICK_SLAB,
                null, //InspireBlocks.NETHER_BRICK_WALL.get(),
                Blocks.NETHER_BRICK_FENCE,
                InspireBlocks.NETHER_BRICK_FENCE_GATE.get(),
                Blocks.CHISELED_NETHER_BRICKS,
                null, // Pillar
                InspireBlocks.NETHER_BRICK_DOOR.get(),
                InspireBlocks.NETHER_BRICK_TRAPDOOR.get(),
                InspireBlocks.NETHER_BRICK_BUTTON.get(),
                InspireBlocks.NETHER_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        NETHER_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.NETHER_TILES.get(),
                InspireBlocks.CRACKED_NETHER_TILES.get(),
                InspireBlocks.NETHER_TILE_STAIRS.get(),
                InspireBlocks.NETHER_TILE_SLAB.get(),
                InspireBlocks.NETHER_TILE_WALL.get(),
                InspireBlocks.NETHER_TILE_FENCE.get(),
                InspireBlocks.NETHER_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_NETHER_TILES.get(),
                InspireBlocks.NETHER_TILE_PILLAR.get(), // Pillar
                InspireBlocks.NETHER_TILE_DOOR.get(),
                InspireBlocks.NETHER_TILE_TRAPDOOR.get(),
                InspireBlocks.NETHER_TILE_BUTTON.get(),
                InspireBlocks.NETHER_TILE_PRESSURE_PLATE.get(),
                InspireBlocks.NETHER_TILE_LAMP.get(), // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        QUARTZ_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.QUARTZ_BRICKS,
                InspireBlocks.CRACKED_QUARTZ_BRICKS.get(),
                InspireBlocks.QUARTZ_BRICK_STAIRS.get(),
                InspireBlocks.QUARTZ_BRICK_SLAB.get(),
                InspireBlocks.QUARTZ_BRICK_WALL.get(),
                InspireBlocks.QUARTZ_BRICK_FENCE.get(),
                InspireBlocks.QUARTZ_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_QUARTZ_BRICKS.get(),
                null, // Pillar
                InspireBlocks.QUARTZ_BRICK_DOOR.get(),
                InspireBlocks.QUARTZ_BRICK_TRAPDOOR.get(),
                InspireBlocks.QUARTZ_BRICK_BUTTON.get(),
                InspireBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        QUARTZ_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.QUARTZ_TILES.get(),
                InspireBlocks.CRACKED_QUARTZ_TILES.get(),
                InspireBlocks.QUARTZ_TILE_STAIRS.get(),
                InspireBlocks.QUARTZ_TILE_SLAB.get(),
                InspireBlocks.QUARTZ_TILE_WALL.get(),
                InspireBlocks.QUARTZ_TILE_FENCE.get(),
                InspireBlocks.QUARTZ_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_QUARTZ_TILES.get(),
                null, // Pillar
                InspireBlocks.QUARTZ_TILE_DOOR.get(),
                InspireBlocks.QUARTZ_TILE_TRAPDOOR.get(),
                InspireBlocks.QUARTZ_TILE_BUTTON.get(),
                InspireBlocks.QUARTZ_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        BRICK_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.BRICK_TILES.get(),
                InspireBlocks.CRACKED_BRICK_TILES.get(),
                InspireBlocks.BRICK_TILE_STAIRS.get(),
                InspireBlocks.BRICK_TILE_SLAB.get(),
                InspireBlocks.BRICK_TILE_WALL.get(),
                InspireBlocks.BRICK_TILE_FENCE.get(),
                InspireBlocks.BRICK_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_BRICK_TILES.get(),
                null, // Pillar
                InspireBlocks.BRICK_TILE_DOOR.get(),
                InspireBlocks.BRICK_TILE_TRAPDOOR.get(),
                InspireBlocks.BRICK_TILE_BUTTON.get(),
                InspireBlocks.BRICK_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        PRISMARINE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.PRISMARINE_BRICKS,
                InspireBlocks.CRACKED_PRISMARINE_BRICKS.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                InspireBlocks.PRISMARINE_BRICK_WALL.get(),
                InspireBlocks.PRISMARINE_BRICK_FENCE.get(),
                InspireBlocks.PRISMARINE_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_PRISMARINE_BRICKS.get(),
                null, // Pillar
                InspireBlocks.PRISMARINE_BRICK_DOOR.get(),
                InspireBlocks.PRISMARINE_BRICK_TRAPDOOR.get(),
                InspireBlocks.PRISMARINE_BRICK_BUTTON.get(),
                InspireBlocks.PRISMARINE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        PRISMARINE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.PRISMARINE_TILES.get(),
                InspireBlocks.CRACKED_PRISMARINE_TILES.get(),
                InspireBlocks.PRISMARINE_TILE_STAIRS.get(),
                InspireBlocks.PRISMARINE_TILE_SLAB.get(),
                InspireBlocks.PRISMARINE_TILE_WALL.get(),
                InspireBlocks.PRISMARINE_TILE_FENCE.get(),
                InspireBlocks.PRISMARINE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_PRISMARINE_TILES.get(),
                null, // Pillar (Missing)
                InspireBlocks.PRISMARINE_TILE_DOOR.get(),
                InspireBlocks.PRISMARINE_TILE_TRAPDOOR.get(),
                InspireBlocks.PRISMARINE_TILE_BUTTON.get(),
                InspireBlocks.PRISMARINE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        DARK_PRISMARINE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.DARK_PRISMARINE,
                InspireBlocks.CRACKED_DARK_PRISMARINE.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                InspireBlocks.DARK_PRISMARINE_WALL.get(),
                InspireBlocks.DARK_PRISMARINE_FENCE.get(),
                InspireBlocks.DARK_PRISMARINE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_DARK_PRISMARINE.get(),
                null, // Pillar
                InspireBlocks.DARK_PRISMARINE_DOOR.get(),
                InspireBlocks.DARK_PRISMARINE_TRAPDOOR.get(),
                InspireBlocks.DARK_PRISMARINE_BUTTON.get(),
                InspireBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        END_STONE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.END_STONE_BRICKS,
                InspireBlocks.CRACKED_END_STONE_BRICKS.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                Blocks.END_STONE_BRICKS,
                InspireBlocks.END_STONE_BRICK_FENCE.get(),
                InspireBlocks.END_STONE_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_END_STONE_BRICKS.get(),
                null, // Pillar
                InspireBlocks.END_STONE_BRICK_DOOR.get(),
                InspireBlocks.END_STONE_BRICK_TRAPDOOR.get(),
                InspireBlocks.END_STONE_BRICK_BUTTON.get(),
                InspireBlocks.END_STONE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        END_STONE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.END_STONE_TILES.get(),
                InspireBlocks.CRACKED_END_STONE_TILES.get(),
                InspireBlocks.END_STONE_TILE_STAIRS.get(),
                InspireBlocks.END_STONE_TILE_SLAB.get(),
                InspireBlocks.END_STONE_TILE_WALL.get(),
                InspireBlocks.END_STONE_TILE_FENCE.get(),
                InspireBlocks.END_STONE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_END_STONE_TILES.get(),
                null, // Pillar
                InspireBlocks.END_STONE_TILE_DOOR.get(),
                InspireBlocks.END_STONE_TILE_TRAPDOOR.get(),
                InspireBlocks.END_STONE_TILE_BUTTON.get(),
                InspireBlocks.END_STONE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        PURPUR_FAMILY = new BetterBlockFamily(
                null,
                Blocks.PURPUR_BLOCK,
                InspireBlocks.CRACKED_PURPUR.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                InspireBlocks.PURPUR_WALL.get(),
                InspireBlocks.PURPUR_FENCE.get(),
                InspireBlocks.PURPUR_FENCE_GATE.get(),
                InspireBlocks.CHISELED_PURPUR.get(),
                null, // Pillar
                InspireBlocks.PURPUR_DOOR.get(),
                InspireBlocks.PURPUR_TRAPDOOR.get(),
                InspireBlocks.PURPUR_BUTTON.get(),
                InspireBlocks.PURPUR_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        PURPUR_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.PURPUR_TILES.get(),
                InspireBlocks.CRACKED_PURPUR_TILES.get(),
                InspireBlocks.PURPUR_TILE_STAIRS.get(),
                InspireBlocks.PURPUR_TILE_SLAB.get(),
                InspireBlocks.PURPUR_TILE_WALL.get(),
                InspireBlocks.PURPUR_TILE_FENCE.get(),
                InspireBlocks.PURPUR_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_PURPUR_TILES.get(),
                null, // Pillar
                InspireBlocks.PURPUR_TILE_DOOR.get(),
                InspireBlocks.PURPUR_TILE_TRAPDOOR.get(),
                InspireBlocks.PURPUR_TILE_BUTTON.get(),
                InspireBlocks.PURPUR_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        STONE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.STONE_BRICKS,
                null, // Cracked (Missing)
                null, // Stair (Missing)
                null, // Slab (Missing)
                Blocks.STONE_BRICK_WALL,
                InspireBlocks.STONE_BRICK_FENCE.get(),
                InspireBlocks.STONE_BRICK_FENCE_GATE.get(),
                null, // Chiseled (Missing)
                null, // Pillar
                InspireBlocks.STONE_BRICK_DOOR.get(),
                InspireBlocks.STONE_BRICK_TRAPDOOR.get(),
                InspireBlocks.STONE_BRICK_BUTTON.get(),
                InspireBlocks.STONE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        STONE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.STONE_TILES.get(),
                InspireBlocks.CRACKED_STONE_TILES.get(),
                InspireBlocks.STONE_TILE_STAIRS.get(),
                InspireBlocks.STONE_TILE_SLAB.get(),
                InspireBlocks.STONE_TILE_WALL.get(),
                InspireBlocks.STONE_TILE_FENCE.get(),
                InspireBlocks.STONE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_STONE_TILES.get(),
                null, // Pillar
                InspireBlocks.STONE_TILE_DOOR.get(),
                InspireBlocks.STONE_TILE_TRAPDOOR.get(),
                InspireBlocks.STONE_TILE_BUTTON.get(),
                InspireBlocks.STONE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        MOSSY_STONE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.MOSSY_STONE_BRICKS,
                InspireBlocks.CRACKED_MOSSY_STONE_BRICK.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                Blocks.MOSSY_STONE_BRICK_WALL,
                InspireBlocks.MOSSY_STONE_BRICK_FENCE.get(),
                InspireBlocks.MOSSY_STONE_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_MOSSY_STONE_BRICKS.get(),
                null, // Pillar
                InspireBlocks.MOSSY_STONE_BRICK_DOOR.get(),
                InspireBlocks.MOSSY_STONE_BRICK_TRAPDOOR.get(),
                InspireBlocks.MOSSY_STONE_BRICK_BUTTON.get(),
                InspireBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        MOSSY_STONE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.MOSSY_STONE_TILES.get(),
                InspireBlocks.CRACKED_MOSSY_STONE_TILES.get(),
                InspireBlocks.MOSSY_STONE_TILE_STAIRS.get(),
                InspireBlocks.MOSSY_STONE_TILE_SLAB.get(),
                InspireBlocks.MOSSY_STONE_TILE_WALL.get(),
                InspireBlocks.MOSSY_STONE_TILE_FENCE.get(),
                InspireBlocks.MOSSY_STONE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_MOSSY_STONE_TILES.get(),
                null, // Pillar
                InspireBlocks.MOSSY_STONE_TILE_DOOR.get(),
                InspireBlocks.MOSSY_STONE_TILE_TRAPDOOR.get(),
                InspireBlocks.MOSSY_STONE_TILE_BUTTON.get(),
                InspireBlocks.MOSSY_STONE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_DEEPSLATE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_DEEPSLATE,
                InspireBlocks.CRACKED_POLISHED_DEEPSLATE.get(),
                null, // Stair (Missing)
                null, // Slab (Missing)
                null,
                InspireBlocks.POLISHED_DEEPSLATE_FENCE.get(),
                InspireBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_DEEPSLATE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_DEEPSLATE_DOOR.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_DEEPSLATE_BUTTON.get(),
                InspireBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_DEEPSLATE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.POLISHED_DEEPSLATE_TILES.get(),
                InspireBlocks.CRACKED_POLISHED_DEEPSLATE_TILES.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_STAIRS.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_SLAB.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_WALL.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_DEEPSLATE_TILES.get(),
                null, // Pillar
                InspireBlocks.POLISHED_DEEPSLATE_TILE_DOOR.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_BUTTON.get(),
                InspireBlocks.POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_BLACKSTONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_BLACKSTONE,
                InspireBlocks.CRACKED_POLISHED_BLACKSTONE.get(),
                Blocks.POLISHED_BLACKSTONE_STAIRS,
                Blocks.POLISHED_BLACKSTONE_SLAB,
                Blocks.POLISHED_BLACKSTONE_WALL,
                InspireBlocks.POLISHED_BLACKSTONE_FENCE.get(),
                InspireBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get(),
                Blocks.CHISELED_POLISHED_BLACKSTONE,
                null, // Pillar
                InspireBlocks.POLISHED_BLACKSTONE_DOOR.get(),
                InspireBlocks.POLISHED_BLACKSTONE_TRAPDOOR.get(),
                Blocks.POLISHED_BLACKSTONE_BUTTON,
                Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE,
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_BLACKSTONE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_BLACKSTONE_BRICKS,
                null, // Cracked (Missing)
                Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS,
                Blocks.POLISHED_BLACKSTONE_BRICK_SLAB,
                Blocks.POLISHED_BLACKSTONE_BRICK_WALL,
                InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE.get(),
                InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE.get(),
                null, // Chiseled (Missing)
                null, // Pillar
                InspireBlocks.POLISHED_BLACKSTONE_BRICK_DOOR.get(),
                InspireBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR.get(),
                null, //InspireBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON.get(),
                null, //InspireBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        GILDED_BLACKSTONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.GILDED_BLACKSTONE,
                InspireBlocks.CRACKED_GILDED_BLACKSTONE.get(),
                InspireBlocks.GILDED_BLACKSTONE_STAIRS.get(),
                InspireBlocks.GILDED_BLACKSTONE_SLAB.get(),
                InspireBlocks.GILDED_BLACKSTONE_WALL.get(),
                InspireBlocks.GILDED_BLACKSTONE_FENCE.get(),
                InspireBlocks.GILDED_BLACKSTONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_GILDED_BLACKSTONE.get(),
                null, // Pillar
                InspireBlocks.GILDED_BLACKSTONE_DOOR.get(),
                InspireBlocks.GILDED_BLACKSTONE_TRAPDOOR.get(),
                InspireBlocks.GILDED_BLACKSTONE_BUTTON.get(),
                InspireBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SMOOTH_STONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.SMOOTH_STONE,
                InspireBlocks.CRACKED_SMOOTH_STONE.get(),
                InspireBlocks.SMOOTH_STONE_STAIRS.get(),
                Blocks.SMOOTH_STONE_SLAB,
                InspireBlocks.SMOOTH_STONE_WALL.get(),
                InspireBlocks.SMOOTH_STONE_FENCE.get(),
                InspireBlocks.SMOOTH_STONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_SMOOTH_STONE.get(),
                null, // Pillar
                InspireBlocks.SMOOTH_STONE_DOOR.get(),
                InspireBlocks.SMOOTH_STONE_TRAPDOOR.get(),
                InspireBlocks.SMOOTH_STONE_BUTTON.get(),
                InspireBlocks.SMOOTH_STONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        REDSTONE_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.REDSTONE_BLOCK,
                InspireBlocks.CRACKED_REDSTONE_BLOCK.get(),
                InspireBlocks.REDSTONE_BLOCK_STAIRS.get(),
                InspireBlocks.REDSTONE_BLOCK_SLAB.get(),
                InspireBlocks.REDSTONE_BLOCK_WALL.get(),
                InspireBlocks.REDSTONE_BLOCK_FENCE.get(),
                InspireBlocks.REDSTONE_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_REDSTONE_BLOCK.get(),
                null, // Pillar
                InspireBlocks.REDSTONE_BLOCK_DOOR.get(),
                InspireBlocks.REDSTONE_BLOCK_TRAPDOOR.get(),
                InspireBlocks.REDSTONE_BLOCK_BUTTON.get(),
                InspireBlocks.REDSTONE_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        AMETHYST_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.AMETHYST_BLOCK,
                InspireBlocks.CRACKED_AMETHYST_BLOCK.get(),
                InspireBlocks.AMETHYST_BLOCK_STAIRS.get(),
                InspireBlocks.AMETHYST_BLOCK_SLAB.get(),
                InspireBlocks.AMETHYST_BLOCK_WALL.get(),
                InspireBlocks.AMETHYST_BLOCK_FENCE.get(),
                InspireBlocks.AMETHYST_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_AMETHYST_BLOCK.get(),
                null, // Pillar
                InspireBlocks.AMETHYST_BLOCK_DOOR.get(),
                InspireBlocks.AMETHYST_BLOCK_TRAPDOOR.get(),
                InspireBlocks.AMETHYST_BLOCK_BUTTON.get(),
                InspireBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        GLOWSTONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.GLOWSTONE,
                InspireBlocks.CRACKED_GLOWSTONE.get(),
                InspireBlocks.GLOWSTONE_STAIRS.get(),
                InspireBlocks.GLOWSTONE_SLAB.get(),
                InspireBlocks.GLOWSTONE_WALL.get(),
                InspireBlocks.GLOWSTONE_FENCE.get(),
                InspireBlocks.GLOWSTONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_GLOWSTONE.get(),
                null, // Pillar
                InspireBlocks.GLOWSTONE_DOOR.get(),
                InspireBlocks.GLOWSTONE_TRAPDOOR.get(),
                InspireBlocks.GLOWSTONE_BUTTON.get(),
                InspireBlocks.GLOWSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SMOOTH_BASALT_FAMILY = new BetterBlockFamily(
                null,
                Blocks.SMOOTH_BASALT,
                InspireBlocks.CRACKED_SMOOTH_BASALT.get(),
                InspireBlocks.SMOOTH_BASALT_STAIRS.get(),
                InspireBlocks.SMOOTH_BASALT_SLAB.get(),
                InspireBlocks.SMOOTH_BASALT_WALL.get(),
                InspireBlocks.SMOOTH_BASALT_FENCE.get(),
                InspireBlocks.SMOOTH_BASALT_FENCE_GATE.get(),
                InspireBlocks.CHISELED_SMOOTH_BASALT.get(),
                null, // Pillar
                InspireBlocks.SMOOTH_BASALT_DOOR.get(),
                InspireBlocks.SMOOTH_BASALT_TRAPDOOR.get(),
                InspireBlocks.SMOOTH_BASALT_BUTTON.get(),
                InspireBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_BASALT_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_BASALT,
                InspireBlocks.CRACKED_POLISHED_BASALT.get(),
                InspireBlocks.POLISHED_BASALT_STAIRS.get(),
                InspireBlocks.POLISHED_BASALT_SLAB.get(),
                InspireBlocks.POLISHED_BASALT_WALL.get(),
                InspireBlocks.POLISHED_BASALT_FENCE.get(),
                InspireBlocks.POLISHED_BASALT_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_BASALT.get(),
                null, // Pillar
                InspireBlocks.POLISHED_BASALT_DOOR.get(),
                InspireBlocks.POLISHED_BASALT_TRAPDOOR.get(),
                InspireBlocks.POLISHED_BASALT_BUTTON.get(),
                InspireBlocks.POLISHED_BASALT_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        BASALT_FAMILY = new BetterBlockFamily(
                null,
                Blocks.BASALT,
                InspireBlocks.CRACKED_BASALT.get(),
                InspireBlocks.BASALT_STAIRS.get(),
                InspireBlocks.BASALT_SLAB.get(),
                InspireBlocks.BASALT_WALL.get(),
                InspireBlocks.BASALT_FENCE.get(),
                InspireBlocks.BASALT_FENCE_GATE.get(),
                InspireBlocks.CHISELED_BASALT.get(),
                null, // Pillar
                InspireBlocks.BASALT_DOOR.get(),
                InspireBlocks.BASALT_TRAPDOOR.get(),
                InspireBlocks.BASALT_BUTTON.get(),
                InspireBlocks.BASALT_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_GLOWSTONE_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.POLISHED_GLOWSTONE.get(),
                InspireBlocks.CRACKED_POLISHED_GLOWSTONE.get(),
                InspireBlocks.POLISHED_GLOWSTONE_STAIRS.get(),
                InspireBlocks.POLISHED_GLOWSTONE_SLAB.get(),
                InspireBlocks.POLISHED_GLOWSTONE_WALL.get(),
                InspireBlocks.POLISHED_GLOWSTONE_FENCE.get(),
                InspireBlocks.POLISHED_GLOWSTONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_GLOWSTONE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_GLOWSTONE_DOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BUTTON.get(),
                InspireBlocks.POLISHED_GLOWSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_GLOWSTONE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.POLISHED_GLOWSTONE_BRICKS.get(),
                InspireBlocks.CRACKED_POLISHED_GLOWSTONE_BRICKS.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_STAIRS.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_SLAB.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_WALL.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_GLOWSTONE_BRICKS.get(),
                null, // Pillar
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_DOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_TRAPDOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_BUTTON.get(),
                InspireBlocks.POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_GLOWSTONE_TILES_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.POLISHED_GLOWSTONE_TILES.get(),
                InspireBlocks.CRACKED_POLISHED_GLOWSTONE_TILES.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_STAIRS.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_SLAB.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_WALL.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_GLOWSTONE_TILES.get(),
                null, // Pillar
                InspireBlocks.POLISHED_GLOWSTONE_TILE_DOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_BUTTON.get(),
                InspireBlocks.POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_TUFF_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_TUFF,
                InspireBlocks.CRACKED_POLISHED_TUFF.get(),
                Blocks.POLISHED_TUFF_STAIRS,
                Blocks.POLISHED_TUFF_SLAB,
                Blocks.POLISHED_TUFF_WALL,
                InspireBlocks.POLISHED_TUFF_FENCE.get(),
                InspireBlocks.POLISHED_TUFF_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_TUFF.get(),
                null, // Pillar
                InspireBlocks.POLISHED_TUFF_DOOR.get(),
                InspireBlocks.POLISHED_TUFF_TRAPDOOR.get(),
                InspireBlocks.POLISHED_TUFF_BUTTON.get(),
                InspireBlocks.POLISHED_TUFF_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        TUFF_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.TUFF_BRICKS,
                InspireBlocks.CRACKED_TUFF_BRICKS.get(),
                Blocks.TUFF_BRICK_STAIRS,
                Blocks.TUFF_BRICK_SLAB,
                Blocks.TUFF_BRICK_WALL,
                InspireBlocks.TUFF_BRICK_FENCE.get(),
                InspireBlocks.TUFF_BRICK_FENCE_GATE.get(),
                Blocks.CHISELED_TUFF_BRICKS,
                null, // Pillar
                InspireBlocks.TUFF_BRICK_DOOR.get(),
                InspireBlocks.TUFF_BRICK_TRAPDOOR.get(),
                InspireBlocks.TUFF_BRICK_BUTTON.get(),
                InspireBlocks.TUFF_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        QUARTZ_FAMILY = new BetterBlockFamily(
                null,
                Blocks.QUARTZ_BLOCK,
                InspireBlocks.CRACKED_QUARTZ.get(),
                Blocks.QUARTZ_STAIRS,
                Blocks.QUARTZ_SLAB,
                InspireBlocks.QUARTZ_WALL.get(),
                InspireBlocks.QUARTZ_FENCE.get(),
                InspireBlocks.QUARTZ_FENCE_GATE.get(),
                Blocks.CHISELED_QUARTZ_BLOCK,
                null, // Pillar
                InspireBlocks.QUARTZ_DOOR.get(),
                InspireBlocks.QUARTZ_TRAPDOOR.get(),
                InspireBlocks.QUARTZ_BUTTON.get(),
                InspireBlocks.QUARTZ_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SMOOTH_QUARTZ_FAMILY = new BetterBlockFamily(
                null,
                Blocks.SMOOTH_QUARTZ,
                InspireBlocks.CRACKED_SMOOTH_QUARTZ.get(),
                Blocks.SMOOTH_QUARTZ_STAIRS,
                Blocks.SMOOTH_QUARTZ_SLAB,
                InspireBlocks.SMOOTH_QUARTZ_WALL.get(),
                InspireBlocks.SMOOTH_QUARTZ_FENCE.get(),
                InspireBlocks.SMOOTH_QUARTZ_FENCE_GATE.get(),
                InspireBlocks.CHISELED_SMOOTH_QUARTZ.get(),
                null, // Pillar
                InspireBlocks.SMOOTH_QUARTZ_DOOR.get(),
                InspireBlocks.SMOOTH_QUARTZ_TRAPDOOR.get(),
                InspireBlocks.SMOOTH_QUARTZ_BUTTON.get(),
                InspireBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        RESIN_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.RESIN.get(),
                InspireBlocks.CRACKED_RESIN.get(),
                InspireBlocks.RESIN_STAIRS.get(),
                InspireBlocks.RESIN_SLAB.get(),
                InspireBlocks.RESIN_WALL.get(),
                InspireBlocks.RESIN_FENCE.get(),
                InspireBlocks.RESIN_FENCE_GATE.get(),
                InspireBlocks.CHISELED_RESIN.get(),
                null, // Pillar
                InspireBlocks.RESIN_DOOR.get(),
                InspireBlocks.RESIN_TRAPDOOR.get(),
                InspireBlocks.RESIN_BUTTON.get(),
                InspireBlocks.RESIN_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_GRANITE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_GRANITE,
                InspireBlocks.CRACKED_POLISHED_GRANITE.get(),
                Blocks.POLISHED_GRANITE_STAIRS,
                Blocks.POLISHED_GRANITE_SLAB,
                InspireBlocks.POLISHED_GRANITE_WALL.get(),
                InspireBlocks.POLISHED_GRANITE_FENCE.get(),
                InspireBlocks.POLISHED_GRANITE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_GRANITE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_GRANITE_DOOR.get(),
                InspireBlocks.POLISHED_GRANITE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_GRANITE_BUTTON.get(),
                InspireBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_DIORITE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_DIORITE,
                InspireBlocks.CRACKED_POLISHED_DIORITE.get(),
                Blocks.POLISHED_DIORITE_STAIRS,
                Blocks.POLISHED_DIORITE_SLAB,
                InspireBlocks.POLISHED_DIORITE_WALL.get(),
                InspireBlocks.POLISHED_DIORITE_FENCE.get(),
                InspireBlocks.POLISHED_DIORITE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_DIORITE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_DIORITE_DOOR.get(),
                InspireBlocks.POLISHED_DIORITE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_DIORITE_BUTTON.get(),
                InspireBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_ANDESITE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.POLISHED_ANDESITE,
                InspireBlocks.CRACKED_POLISHED_ANDESITE.get(),
                Blocks.POLISHED_ANDESITE_STAIRS,
                Blocks.POLISHED_ANDESITE_SLAB,
                InspireBlocks.POLISHED_ANDESITE_WALL.get(),
                InspireBlocks.POLISHED_ANDESITE_FENCE.get(),
                InspireBlocks.POLISHED_ANDESITE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_ANDESITE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_ANDESITE_DOOR.get(),
                InspireBlocks.POLISHED_ANDESITE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_ANDESITE_BUTTON.get(),
                InspireBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SANDSTONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.SANDSTONE,
                InspireBlocks.CRACKED_SANDSTONE.get(),
                Blocks.SANDSTONE_STAIRS,
                Blocks.SANDSTONE_SLAB,
                Blocks.SANDSTONE_WALL,
                InspireBlocks.SANDSTONE_FENCE.get(),
                InspireBlocks.SANDSTONE_FENCE_GATE.get(),
                Blocks.CHISELED_SANDSTONE,
                null, // Pillar
                InspireBlocks.SANDSTONE_DOOR.get(),
                InspireBlocks.SANDSTONE_TRAPDOOR.get(),
                InspireBlocks.SANDSTONE_BUTTON.get(),
                InspireBlocks.SANDSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        IRON_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.IRON_BLOCK,
                InspireBlocks.CRACKED_IRON_BLOCK.get(),
                InspireBlocks.IRON_BLOCK_STAIRS.get(),
                InspireBlocks.IRON_BLOCK_SLAB.get(),
                InspireBlocks.IRON_BLOCK_WALL.get(),
                InspireBlocks.IRON_BLOCK_FENCE.get(),
                InspireBlocks.IRON_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_IRON_BLOCK.get(),
                null, // Pillar
                InspireBlocks.IRON_BLOCK_DOOR.get(),
                InspireBlocks.IRON_BLOCK_TRAPDOOR.get(),
                InspireBlocks.IRON_BLOCK_BUTTON.get(),
                InspireBlocks.IRON_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        GOLD_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.GOLD_BLOCK,
                InspireBlocks.CRACKED_GOLD_BLOCK.get(),
                InspireBlocks.GOLD_BLOCK_STAIRS.get(),
                InspireBlocks.GOLD_BLOCK_SLAB.get(),
                InspireBlocks.GOLD_BLOCK_WALL.get(),
                InspireBlocks.GOLD_BLOCK_FENCE.get(),
                InspireBlocks.GOLD_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_GOLD_BLOCK.get(),
                null, // Pillar
                InspireBlocks.GOLD_BLOCK_DOOR.get(),
                InspireBlocks.GOLD_BLOCK_TRAPDOOR.get(),
                InspireBlocks.GOLD_BLOCK_BUTTON.get(),
                InspireBlocks.GOLD_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        EMERALD_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.EMERALD_BLOCK,
                InspireBlocks.CRACKED_EMERALD_BLOCK.get(),
                InspireBlocks.EMERALD_BLOCK_STAIRS.get(),
                InspireBlocks.EMERALD_BLOCK_SLAB.get(),
                InspireBlocks.EMERALD_BLOCK_WALL.get(),
                InspireBlocks.EMERALD_BLOCK_FENCE.get(),
                InspireBlocks.EMERALD_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_EMERALD_BLOCK.get(),
                null, // Pillar
                InspireBlocks.EMERALD_BLOCK_DOOR.get(),
                InspireBlocks.EMERALD_BLOCK_TRAPDOOR.get(),
                InspireBlocks.EMERALD_BLOCK_BUTTON.get(),
                InspireBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        DIAMOND_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.DIAMOND_BLOCK,
                InspireBlocks.CRACKED_DIAMOND_BLOCK.get(),
                InspireBlocks.DIAMOND_BLOCK_STAIRS.get(),
                InspireBlocks.DIAMOND_BLOCK_SLAB.get(),
                InspireBlocks.DIAMOND_BLOCK_WALL.get(),
                InspireBlocks.DIAMOND_BLOCK_FENCE.get(),
                InspireBlocks.DIAMOND_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_DIAMOND_BLOCK.get(),
                null, // Pillar
                InspireBlocks.DIAMOND_BLOCK_DOOR.get(),
                InspireBlocks.DIAMOND_BLOCK_TRAPDOOR.get(),
                InspireBlocks.DIAMOND_BLOCK_BUTTON.get(),
                InspireBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        NETHERITE_BLOCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.NETHERITE_BLOCK,
                InspireBlocks.CRACKED_NETHERITE_BLOCK.get(),
                InspireBlocks.NETHERITE_BLOCK_STAIRS.get(),
                InspireBlocks.NETHERITE_BLOCK_SLAB.get(),
                InspireBlocks.NETHERITE_BLOCK_WALL.get(),
                InspireBlocks.NETHERITE_BLOCK_FENCE.get(),
                InspireBlocks.NETHERITE_BLOCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_NETHERITE_BLOCK.get(),
                null, // Pillar
                InspireBlocks.NETHERITE_BLOCK_DOOR.get(),
                InspireBlocks.NETHERITE_BLOCK_TRAPDOOR.get(),
                InspireBlocks.NETHERITE_BLOCK_BUTTON.get(),
                InspireBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        OBSIDIAN_FAMILY = new BetterBlockFamily(
                null,
                Blocks.OBSIDIAN,
                InspireBlocks.CRACKED_OBSIDIAN.get(),
                InspireBlocks.OBSIDIAN_STAIRS.get(),
                InspireBlocks.OBSIDIAN_SLAB.get(),
                InspireBlocks.OBSIDIAN_WALL.get(),
                InspireBlocks.OBSIDIAN_FENCE.get(),
                InspireBlocks.OBSIDIAN_FENCE_GATE.get(),
                InspireBlocks.CHISELED_OBSIDIAN.get(),
                null, // Pillar
                InspireBlocks.OBSIDIAN_DOOR.get(),
                InspireBlocks.OBSIDIAN_TRAPDOOR.get(),
                InspireBlocks.OBSIDIAN_BUTTON.get(),
                InspireBlocks.OBSIDIAN_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        CRYING_OBSIDIAN_FAMILY = new BetterBlockFamily(
                null,
                Blocks.CRYING_OBSIDIAN,
                InspireBlocks.CRACKED_CRYING_OBSIDIAN.get(),
                InspireBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                InspireBlocks.CRYING_OBSIDIAN_SLAB.get(),
                InspireBlocks.CRYING_OBSIDIAN_WALL.get(),
                InspireBlocks.CRYING_OBSIDIAN_FENCE.get(),
                InspireBlocks.CRYING_OBSIDIAN_FENCE_GATE.get(),
                InspireBlocks.CHISELED_CRYING_OBSIDIAN.get(),
                null, // Pillar
                InspireBlocks.CRYING_OBSIDIAN_DOOR.get(),
                InspireBlocks.CRYING_OBSIDIAN_TRAPDOOR.get(),
                InspireBlocks.CRYING_OBSIDIAN_BUTTON.get(),
                InspireBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        BEDROCK_FAMILY = new BetterBlockFamily(
                null,
                Blocks.BEDROCK,
                InspireBlocks.CRACKED_BEDROCK.get(),
                InspireBlocks.BEDROCK_STAIRS.get(),
                InspireBlocks.BEDROCK_SLAB.get(),
                InspireBlocks.BEDROCK_WALL.get(),
                InspireBlocks.BEDROCK_FENCE.get(),
                InspireBlocks.BEDROCK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_BEDROCK.get(),
                null, // Pillar
                InspireBlocks.BEDROCK_DOOR.get(),
                InspireBlocks.BEDROCK_TRAPDOOR.get(),
                InspireBlocks.BEDROCK_BUTTON.get(),
                InspireBlocks.BEDROCK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SOUL_SANDSTONE_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.SOUL_SANDSTONE.get(),
                InspireBlocks.CRACKED_SOUL_SANDSTONE.get(),
                InspireBlocks.SOUL_SANDSTONE_STAIRS.get(),
                InspireBlocks.SOUL_SANDSTONE_SLAB.get(),
                InspireBlocks.SOUL_SANDSTONE_WALL.get(),
                InspireBlocks.SOUL_SANDSTONE_FENCE.get(),
                InspireBlocks.SOUL_SANDSTONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_SOUL_SANDSTONE.get(),
                null, // Pillar
                InspireBlocks.SOUL_SANDSTONE_DOOR.get(),
                InspireBlocks.SOUL_SANDSTONE_TRAPDOOR.get(),
                InspireBlocks.SOUL_SANDSTONE_BUTTON.get(),
                InspireBlocks.SOUL_SANDSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        SOUL_SLATE_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.SOUL_SLATE.get(),
                InspireBlocks.CRACKED_SOUL_SLATE.get(),
                InspireBlocks.SOUL_SLATE_STAIRS.get(),
                InspireBlocks.SOUL_SLATE_SLAB.get(),
                InspireBlocks.SOUL_SLATE_WALL.get(),
                InspireBlocks.SOUL_SLATE_FENCE.get(),
                InspireBlocks.SOUL_SLATE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_SOUL_SLATE.get(),
                InspireBlocks.SOUL_SLATE_PILLAR.get() , // Pillar
                InspireBlocks.SOUL_SLATE_DOOR.get(),
                InspireBlocks.SOUL_SLATE_TRAPDOOR.get(),
                InspireBlocks.SOUL_SLATE_BUTTON.get(),
                InspireBlocks.SOUL_SLATE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        DRIPSTONE_FAMILY = new BetterBlockFamily(
                null,
                Blocks.DRIPSTONE_BLOCK,
                InspireBlocks.CRACKED_DRIPSTONE.get(),
                InspireBlocks.DRIPSTONE_STAIRS.get(),
                InspireBlocks.DRIPSTONE_SLAB.get(),
                InspireBlocks.DRIPSTONE_WALL.get(),
                InspireBlocks.DRIPSTONE_FENCE.get(),
                InspireBlocks.DRIPSTONE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_DRIPSTONE.get(),
                null, // Pillar
                InspireBlocks.DRIPSTONE_DOOR.get(),
                InspireBlocks.DRIPSTONE_TRAPDOOR.get(),
                InspireBlocks.DRIPSTONE_BUTTON.get(),
                InspireBlocks.DRIPSTONE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        POLISHED_CALCITE_FAMILY = new BetterBlockFamily(
                null,
                InspireBlocks.POLISHED_CALCITE.get(),
                InspireBlocks.CRACKED_POLISHED_CALCITE.get(),
                InspireBlocks.POLISHED_CALCITE_STAIRS.get(),
                InspireBlocks.POLISHED_CALCITE_SLAB.get(),
                InspireBlocks.POLISHED_CALCITE_WALL.get(),
                InspireBlocks.POLISHED_CALCITE_FENCE.get(),
                InspireBlocks.POLISHED_CALCITE_FENCE_GATE.get(),
                InspireBlocks.CHISELED_POLISHED_CALCITE.get(),
                null, // Pillar
                InspireBlocks.POLISHED_CALCITE_DOOR.get(),
                InspireBlocks.POLISHED_CALCITE_TRAPDOOR.get(),
                InspireBlocks.POLISHED_CALCITE_BUTTON.get(),
                InspireBlocks.POLISHED_CALCITE_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        DEEPSLATE_BRICKS_FAMILY = new BetterBlockFamily(
                null,
                Blocks.DEEPSLATE_BRICKS,
                null, // Cracked (Missing)
                null, // Stair (Missing)
                null, // Slab (Missing)
                Blocks.DEEPSLATE_BRICK_WALL,
                InspireBlocks.DEEPSLATE_BRICK_FENCE.get(),
                InspireBlocks.DEEPSLATE_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_DEEPSLATE_BRICKS.get(),
                null, // Pillar
                InspireBlocks.DEEPSLATE_BRICK_DOOR.get(),
                InspireBlocks.DEEPSLATE_BRICK_TRAPDOOR.get(),
                InspireBlocks.DEEPSLATE_BRICK_BUTTON.get(),
                InspireBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE.get(),
                null, // Lamp
                null, // Sign
                null, // HangingSign
                null, // Shelf
                null  // Grate
        );

        MUD_BRICKS = new BetterBlockFamily(
                null,
                Blocks.MUD_BRICKS,
                InspireBlocks.CRACKED_MUD_BRICKS.get(),
                Blocks.MUD_BRICK_STAIRS,
                Blocks.MUD_BRICK_SLAB,
                Blocks.MUD_BRICK_WALL,
                InspireBlocks.MUD_BRICK_FENCE.get(),
                InspireBlocks.MUD_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_MUD_BRICKS.get(),
                InspireBlocks.MUD_BRICK_PILLAR.get(),
                InspireBlocks.MUD_BRICK_DOOR.get(),
                InspireBlocks.MUD_BRICK_TRAPDOOR.get(),
                InspireBlocks.MUD_BRICK_BUTTON.get(),
                InspireBlocks.MUD_BRICK_PRESSURE_PLATE.get(),
                InspireBlocks.MUD_BRICK_LAMP.get(),
                null,
                null,
                null,
                null);

        OAK_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.OAK_LOG,
                null,
                Blocks.OAK_STAIRS,
                Blocks.OAK_SLAB,
                InspireBlocks.OAK_WALL.get(),
                Blocks.OAK_FENCE,
                Blocks.OAK_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.OAK_DOOR,
                Blocks.OAK_TRAPDOOR,
                Blocks.OAK_BUTTON,
                Blocks.OAK_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (Not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 2. Spruce Wood Families

        SPRUCE_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.SPRUCE_LOG,
                null,
                Blocks.SPRUCE_STAIRS,
                Blocks.SPRUCE_SLAB,
                InspireBlocks.SPRUCE_WALL.get(),
                Blocks.SPRUCE_FENCE,
                Blocks.SPRUCE_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.SPRUCE_DOOR,
                Blocks.SPRUCE_TRAPDOOR,
                Blocks.SPRUCE_BUTTON,
                Blocks.SPRUCE_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (Not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 3. Birch Wood Families

        BIRCH_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.BIRCH_LOG,
                null,
                Blocks.BIRCH_STAIRS,
                Blocks.BIRCH_SLAB,
                InspireBlocks.BIRCH_WALL.get(),
                Blocks.BIRCH_FENCE,
                Blocks.BIRCH_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.BIRCH_DOOR,
                Blocks.BIRCH_TRAPDOOR,
                Blocks.BIRCH_BUTTON,
                Blocks.BIRCH_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (Not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 4. Jungle Wood Families

        JUNGLE_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.JUNGLE_LOG,
                null,
                Blocks.JUNGLE_STAIRS,
                Blocks.JUNGLE_SLAB,
                InspireBlocks.JUNGLE_WALL.get(),
                Blocks.JUNGLE_FENCE,
                Blocks.JUNGLE_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.JUNGLE_DOOR,
                Blocks.JUNGLE_TRAPDOOR,
                Blocks.JUNGLE_BUTTON,
                Blocks.JUNGLE_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 5. Acacia Wood Families

        ACACIA_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.ACACIA_LOG,
                null,
                Blocks.ACACIA_STAIRS,
                Blocks.ACACIA_SLAB,
                InspireBlocks.ACACIA_WALL.get(),
                Blocks.ACACIA_FENCE,
                Blocks.ACACIA_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.ACACIA_DOOR,
                Blocks.ACACIA_TRAPDOOR,
                Blocks.ACACIA_BUTTON,
                Blocks.ACACIA_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 6. Dark Oak Wood Families

        DARK_OAK_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.DARK_OAK_LOG,
                null,
                Blocks.DARK_OAK_STAIRS,
                Blocks.DARK_OAK_SLAB,
                InspireBlocks.DARK_OAK_WALL.get(),
                Blocks.DARK_OAK_FENCE,
                Blocks.DARK_OAK_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.DARK_OAK_DOOR,
                Blocks.DARK_OAK_TRAPDOOR,
                Blocks.DARK_OAK_BUTTON,
                Blocks.DARK_OAK_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 7. Mangrove Wood Families

        MANGROVE_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.MANGROVE_LOG,
                null,
                Blocks.MANGROVE_STAIRS,
                Blocks.MANGROVE_SLAB,
                InspireBlocks.MANGROVE_WALL.get(),
                Blocks.MANGROVE_FENCE,
                Blocks.MANGROVE_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.MANGROVE_DOOR,
                Blocks.MANGROVE_TRAPDOOR,
                Blocks.MANGROVE_BUTTON,
                Blocks.MANGROVE_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );

// 8. Cherry Wood Families

        CHERRY_FAMILY = new BetterBlockFamily(
                null, // DyeColor
                Blocks.CHERRY_LOG,
                null,
                Blocks.CHERRY_STAIRS,
                Blocks.CHERRY_SLAB,
                InspireBlocks.CHERRY_WALL.get(),
                Blocks.CHERRY_FENCE,
                Blocks.CHERRY_FENCE_GATE,
                null,
                null, // Pillar (Not provided)
                Blocks.CHERRY_DOOR,
                Blocks.CHERRY_TRAPDOOR,
                Blocks.CHERRY_BUTTON,
                Blocks.CHERRY_PRESSURE_PLATE,
                null, // Lamp (Not provided)
                null, // Sign (Not provided)
                null, // HangingSign (not provided)
                null,  // Shelf (Not provided)
                null  // Grate (Not provided)
        );
        // The previous block definitions are now covered by the static fields above.
    }
}