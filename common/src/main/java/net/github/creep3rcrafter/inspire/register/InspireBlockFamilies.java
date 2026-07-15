package net.github.creep3rcrafter.inspire.register;

import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class InspireBlockFamilies extends BlockFamilies {
    private static final Map<Block, BlockFamily> MAP = Maps.newHashMap();
    public static final BlockFamily CYAN_NETHER_BRICKS_FAMILY;
    public static final BlockFamily CYAN_NETHER_TILES_FAMILY;
    public static final BlockFamily RED_NETHER_BRICKS_FAMILY;
    public static final BlockFamily RED_NETHER_TILES_FAMILY;
    public static final BlockFamily NETHER_BRICKS_FAMILY;
    public static final BlockFamily NETHER_TILES_FAMILY;
    //public static final BlockFamily BRICKS_FAMILY;
    public static final BlockFamily BRICK_TILES_FAMILY;
    public static final BlockFamily QUARTZ_BRICKS_FAMILY;
    public static final BlockFamily QUARTZ_TILES_FAMILY;
    public static final BlockFamily PRISMARINE_TILES_FAMILY;
    public static final BlockFamily DARK_PRISMARINE_FAMILY;
    public static final BlockFamily END_STONE_TILES_FAMILY;
    public static final BlockFamily PURPUR_TILES_FAMILY;
    public static final BlockFamily STONE_TILES_FAMILY;
    public static final BlockFamily STONE_BRICKS_FAMILY;
    public static final BlockFamily MOSSY_STONE_TILES_FAMILY;
    public static final BlockFamily MOSSY_STONE_BRICKS_FAMILY;
    public static final BlockFamily POLISHED_DEEPSLATE_TILES_FAMILY;
    public static final BlockFamily POLISHED_DEEPSLATE_FAMILY;
    public static final BlockFamily POLISHED_BLACKSTONE_FAMILY;
    public static final BlockFamily POLISHED_BLACKSTONE_BRICKS_FAMILY;
    public static final BlockFamily GILDED_BLACKSTONE_FAMILY;
    public static final BlockFamily SMOOTH_STONE_FAMILY;
    public static final BlockFamily REDSTONE_BLOCK_FAMILY;
    public static final BlockFamily AMETHYST_BLOCK_FAMILY;
    public static final BlockFamily GLOWSTONE_FAMILY;
    public static final BlockFamily SMOOTH_BASALT_FAMILY;
    public static final BlockFamily POLISHED_BASALT_FAMILY;
    public static final BlockFamily BASALT_FAMILY;
    public static final BlockFamily POLISHED_GLOWSTONE_FAMILY;
    public static final BlockFamily POLISHED_GLOWSTONE_BRICKS_FAMILY;
    public static final BlockFamily POLISHED_GLOWSTONE_TILES_FAMILY;
    public static final BlockFamily POLISHED_TUFF_FAMILY;
    public static final BlockFamily TUFF_BRICKS_FAMILY;
    public static final BlockFamily QUARTZ_FAMILY;
    public static final BlockFamily SMOOTH_QUARTZ_FAMILY;
    public static final BlockFamily RESIN_FAMILY;
    public static final BlockFamily POLISHED_GRANITE_FAMILY;
    public static final BlockFamily POLISHED_DIORITE_FAMILY;
    public static final BlockFamily POLISHED_ANDESITE_FAMILY;
    public static final BlockFamily SANDSTONE_FAMILY;
    public static final BlockFamily IRON_BLOCK_FAMILY;
    public static final BlockFamily GOLD_BLOCK_FAMILY;
    public static final BlockFamily EMERALD_BLOCK_FAMILY;
    public static final BlockFamily DIAMOND_BLOCK_FAMILY;
    public static final BlockFamily NETHERITE_BLOCK_FAMILY;
    public static final BlockFamily OBSIDIAN_FAMILY;
    public static final BlockFamily CRYING_OBSIDIAN_FAMILY;
    public static final BlockFamily BEDROCK_FAMILY;
    public static final BlockFamily SOUL_SANDSTONE_FAMILY;
    public static final BlockFamily SOUL_SLATE_FAMILY;
    public static final BlockFamily DRIPSTONE_FAMILY;
    public static final BlockFamily POLISHED_CALCITE_FAMILY;
    //public static final BlockFamily DEEPSLATE_TILES_FAMILY;
    public static final BlockFamily DEEPSLATE_BRICKS_FAMILY;
    public static final BlockFamily END_STONE_BRICKS_FAMILY;
    public static final BlockFamily PURPUR_FAMILY;
    public static final BlockFamily PRISMARINE_BRICKS_FAMILY;
    //public static final BlockFamily BRICKS_FAMILY;
    //public static final BlockFamily MUD_BRICKS_FAMILY;
    //public static final BlockFamily POLISHED_CYAN_NETHER_BRICKS_FAMILY;
    //public static final BlockFamily POLISHED_RED_NETHER_BRICKS_FAMILY;
    static {
        CYAN_NETHER_BRICKS_FAMILY = familyBuilder(InspireBlocks.CYAN_NETHER_BRICKS.get())
                .cracked(InspireBlocks.CRACKED_CYAN_NETHER_BRICKS.get())
                .mosaic(InspireBlocks.CYAN_NETHER_TILES.get())
                .stairs(InspireBlocks.CYAN_NETHER_BRICK_STAIRS.get())
                .slab(InspireBlocks.CYAN_NETHER_BRICK_SLAB.get())
                .wall(InspireBlocks.CYAN_NETHER_BRICK_WALL.get())
                .fence(InspireBlocks.CYAN_NETHER_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.CYAN_NETHER_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_CYAN_NETHER_BRICKS.get())
                .door(InspireBlocks.CYAN_NETHER_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.CYAN_NETHER_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.CYAN_NETHER_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.CYAN_NETHER_BRICK_PRESSURE_PLATE.get())
                .getFamily();
        CYAN_NETHER_TILES_FAMILY = familyBuilder(InspireBlocks.CYAN_NETHER_TILES.get())
                .cracked(InspireBlocks.CRACKED_CYAN_NETHER_TILES.get())
                .stairs(InspireBlocks.CYAN_NETHER_TILE_STAIRS.get())
                .slab(InspireBlocks.CYAN_NETHER_TILE_SLAB.get())
                .wall(InspireBlocks.CYAN_NETHER_TILE_WALL.get())
                .fence(InspireBlocks.CYAN_NETHER_TILE_FENCE.get())
                .fenceGate(InspireBlocks.CYAN_NETHER_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_CYAN_NETHER_TILES.get())
                .door(InspireBlocks.CYAN_NETHER_TILE_DOOR.get())
                .trapdoor(InspireBlocks.CYAN_NETHER_TILE_TRAPDOOR.get())
                .button(InspireBlocks.CYAN_NETHER_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.CYAN_NETHER_TILE_PRESSURE_PLATE.get())
                .getFamily();
        RED_NETHER_BRICKS_FAMILY = familyBuilder(Blocks.RED_NETHER_BRICKS)
                .cracked(InspireBlocks.CRACKED_RED_NETHER_BRICKS.get())
                .mosaic(InspireBlocks.RED_NETHER_TILES.get())
                //.polished(InspireBlocks.POLISHED_RED_NETHER_BRICKS.get())
                .fence(InspireBlocks.RED_NETHER_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.RED_NETHER_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_RED_NETHER_BRICKS.get())
                .door(InspireBlocks.RED_NETHER_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.RED_NETHER_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.RED_NETHER_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.RED_NETHER_BRICK_PRESSURE_PLATE.get())
                .getFamily();
        RED_NETHER_TILES_FAMILY = familyBuilder(InspireBlocks.RED_NETHER_TILES.get())
                .cracked(InspireBlocks.CRACKED_RED_NETHER_TILES.get())
                .stairs(InspireBlocks.RED_NETHER_TILE_STAIRS.get())
                .slab(InspireBlocks.RED_NETHER_TILE_SLAB.get())
                .wall(InspireBlocks.RED_NETHER_TILE_WALL.get())
                .fence(InspireBlocks.RED_NETHER_TILE_FENCE.get())
                .fenceGate(InspireBlocks.RED_NETHER_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_RED_NETHER_TILES.get())
                .door(InspireBlocks.RED_NETHER_TILE_DOOR.get())
                .trapdoor(InspireBlocks.RED_NETHER_TILE_TRAPDOOR.get())
                .button(InspireBlocks.RED_NETHER_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.RED_NETHER_TILE_PRESSURE_PLATE.get())
                .getFamily();
        NETHER_BRICKS_FAMILY = familyBuilder(Blocks.NETHER_BRICKS)
                .mosaic(InspireBlocks.NETHER_TILES.get())
                //.polished(InspireBlocks.POLISHED_NETHER_BRICKS.get())
                .fenceGate(InspireBlocks.NETHER_BRICK_FENCE_GATE.get())
                .door(InspireBlocks.NETHER_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.NETHER_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.NETHER_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.NETHER_BRICK_PRESSURE_PLATE.get())
                .getFamily();
        NETHER_TILES_FAMILY = familyBuilder(InspireBlocks.NETHER_TILES.get())
                .cracked(InspireBlocks.CRACKED_NETHER_TILES.get())
                .stairs(InspireBlocks.NETHER_TILE_STAIRS.get())
                .slab(InspireBlocks.NETHER_TILE_SLAB.get())
                .wall(InspireBlocks.NETHER_TILE_WALL.get())
                .fence(InspireBlocks.NETHER_TILE_FENCE.get())
                .fenceGate(InspireBlocks.NETHER_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_NETHER_TILES.get())
                .door(InspireBlocks.NETHER_TILE_DOOR.get())
                .trapdoor(InspireBlocks.NETHER_TILE_TRAPDOOR.get())
                .button(InspireBlocks.NETHER_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.NETHER_TILE_PRESSURE_PLATE.get())
                .getFamily();
        QUARTZ_BRICKS_FAMILY = familyBuilder(Blocks.QUARTZ_BRICKS)
                .cracked(InspireBlocks.CRACKED_QUARTZ_BRICKS.get())
                .stairs(InspireBlocks.QUARTZ_BRICK_STAIRS.get())
                .slab(InspireBlocks.QUARTZ_BRICK_SLAB.get())
                .wall(InspireBlocks.QUARTZ_BRICK_WALL.get())
                .fence(InspireBlocks.QUARTZ_BRICK_WALL.get())
                .chiseled(InspireBlocks.CHISELED_QUARTZ_BRICKS.get())
                .mosaic(InspireBlocks.QUARTZ_TILES.get())
                .fence(InspireBlocks.QUARTZ_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.QUARTZ_BRICK_FENCE_GATE.get())
                .door(InspireBlocks.QUARTZ_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.QUARTZ_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.QUARTZ_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get())
                .getFamily();
        QUARTZ_TILES_FAMILY = familyBuilder(InspireBlocks.QUARTZ_TILES.get())
                .cracked(InspireBlocks.CRACKED_QUARTZ_TILES.get())
                .stairs(InspireBlocks.QUARTZ_TILE_STAIRS.get())
                .slab(InspireBlocks.QUARTZ_TILE_SLAB.get())
                .wall(InspireBlocks.QUARTZ_TILE_WALL.get())
                .fence(InspireBlocks.QUARTZ_TILE_FENCE.get())
                .fenceGate(InspireBlocks.QUARTZ_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_QUARTZ_TILES.get())
                .door(InspireBlocks.QUARTZ_TILE_DOOR.get())
                .trapdoor(InspireBlocks.QUARTZ_TILE_TRAPDOOR.get())
                .button(InspireBlocks.QUARTZ_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.QUARTZ_TILE_PRESSURE_PLATE.get())
                .getFamily();
        BRICK_TILES_FAMILY = familyBuilder(InspireBlocks.BRICK_TILES.get())
                .cracked(InspireBlocks.CRACKED_BRICK_TILES.get())
                .stairs(InspireBlocks.BRICK_TILE_STAIRS.get())
                .slab(InspireBlocks.BRICK_TILE_SLAB.get())
                .wall(InspireBlocks.BRICK_TILE_WALL.get())
                .fence(InspireBlocks.BRICK_TILE_FENCE.get())
                .fenceGate(InspireBlocks.BRICK_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_BRICK_TILES.get())
                .door(InspireBlocks.BRICK_TILE_DOOR.get())
                .trapdoor(InspireBlocks.BRICK_TILE_TRAPDOOR.get())
                .button(InspireBlocks.BRICK_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.BRICK_TILE_PRESSURE_PLATE.get())
                .getFamily();
        // Prismarine Bricks Family
        PRISMARINE_BRICKS_FAMILY = familyBuilder(Blocks.PRISMARINE_BRICKS)
                .cracked(InspireBlocks.CRACKED_PRISMARINE_BRICKS.get())
                .mosaic(InspireBlocks.PRISMARINE_TILES.get())
                //.stairs(Blocks.PRISMARINE_BRICK_STAIRS)
                //.slab(Blocks.PRISMARINE_BRICK_SLAB)
                .wall(InspireBlocks.PRISMARINE_BRICK_WALL.get())
                .fence(InspireBlocks.PRISMARINE_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.PRISMARINE_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_PRISMARINE_BRICKS.get())
                .door(InspireBlocks.PRISMARINE_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.PRISMARINE_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.PRISMARINE_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.PRISMARINE_BRICK_PRESSURE_PLATE.get())
                .getFamily();

// Prismarine Tiles Family
        PRISMARINE_TILES_FAMILY = familyBuilder(InspireBlocks.PRISMARINE_TILES.get())
                .cracked(InspireBlocks.CRACKED_PRISMARINE_TILES.get())
                .stairs(InspireBlocks.PRISMARINE_TILE_STAIRS.get())
                .slab(InspireBlocks.PRISMARINE_TILE_SLAB.get())
                .wall(InspireBlocks.PRISMARINE_TILE_WALL.get())
                .fence(InspireBlocks.PRISMARINE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.PRISMARINE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_PRISMARINE_TILES.get())
                //.pillar(InspireBlocks.PRISMARINE_TILE_PILLAR.get())
                .door(InspireBlocks.PRISMARINE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.PRISMARINE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.PRISMARINE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.PRISMARINE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.PRISMARINE_TILE_SEA_LANTERN.get())
                .getFamily();

// Dark Prismarine Family
        DARK_PRISMARINE_FAMILY = familyBuilder(Blocks.DARK_PRISMARINE)
                .cracked(InspireBlocks.CRACKED_DARK_PRISMARINE.get())
                //.stairs(InspireBlocks.DARK_PRISMARINE_STAIRS.get())
                //.slab(InspireBlocks.DARK_PRISMARINE_SLAB.get())
                .wall(InspireBlocks.DARK_PRISMARINE_WALL.get())
                .fence(InspireBlocks.DARK_PRISMARINE_FENCE.get())
                .fenceGate(InspireBlocks.DARK_PRISMARINE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_DARK_PRISMARINE.get())
                //.pillar(InspireBlocks.DARK_PRISMARINE_PILLAR.get())
                .door(InspireBlocks.DARK_PRISMARINE_DOOR.get())
                .trapdoor(InspireBlocks.DARK_PRISMARINE_TRAPDOOR.get())
                .button(InspireBlocks.DARK_PRISMARINE_BUTTON.get())
                .pressurePlate(InspireBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.DARK_PRISMARINE_LAMP.get())
                .getFamily();

// End Stone Bricks Family
        END_STONE_BRICKS_FAMILY = familyBuilder(Blocks.END_STONE_BRICKS)
                .cracked(InspireBlocks.CRACKED_END_STONE_BRICKS.get())
                //.stairs(InspireBlocks.END_STONE_BRICK_STAIRS.get())
                //.slab(InspireBlocks.END_STONE_BRICK_SLAB.get())
                //.wall(InspireBlocks.END_STONE_BRICK_WALL.get())
                .fence(InspireBlocks.END_STONE_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.END_STONE_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_END_STONE_BRICKS.get())
                //.pillar(InspireBlocks.END_STONE_BRICK_PILLAR.get())
                .door(InspireBlocks.END_STONE_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.END_STONE_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.END_STONE_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.END_STONE_BRICK_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.END_STONE_BRICK_LAMP.get())
                .getFamily();

// End Stone Tiles Family
        END_STONE_TILES_FAMILY = familyBuilder(InspireBlocks.END_STONE_TILES.get())
                .cracked(InspireBlocks.CRACKED_END_STONE_TILES.get())
                .stairs(InspireBlocks.END_STONE_TILE_STAIRS.get())
                .slab(InspireBlocks.END_STONE_TILE_SLAB.get())
                .wall(InspireBlocks.END_STONE_TILE_WALL.get())
                .fence(InspireBlocks.END_STONE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.END_STONE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_END_STONE_TILES.get())
                //.pillar(InspireBlocks.END_STONE_TILE_PILLAR.get())
                .door(InspireBlocks.END_STONE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.END_STONE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.END_STONE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.END_STONE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.END_STONE_TILE_LAMP.get())
                .getFamily();

// Purpur Family
        PURPUR_FAMILY = familyBuilder(Blocks.PURPUR_BLOCK)
                .cracked(InspireBlocks.CRACKED_PURPUR.get())
                //.stairs(InspireBlocks.PURPUR_STAIRS.get())
                //.slab(InspireBlocks.PURPUR_SLAB.get())
                .wall(InspireBlocks.PURPUR_WALL.get())
                .fence(InspireBlocks.PURPUR_FENCE.get())
                .fenceGate(InspireBlocks.PURPUR_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_PURPUR.get())
                //.pillar(InspireBlocks.PURPUR_PILLAR.get())
                .door(InspireBlocks.PURPUR_DOOR.get())
                .trapdoor(InspireBlocks.PURPUR_TRAPDOOR.get())
                .button(InspireBlocks.PURPUR_BUTTON.get())
                .pressurePlate(InspireBlocks.PURPUR_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.PURPUR_LAMP.get())
                .getFamily();

// Purpur Tiles Family
        PURPUR_TILES_FAMILY = familyBuilder(InspireBlocks.PURPUR_TILES.get())
                .cracked(InspireBlocks.CRACKED_PURPUR_TILES.get())
                .stairs(InspireBlocks.PURPUR_TILE_STAIRS.get())
                .slab(InspireBlocks.PURPUR_TILE_SLAB.get())
                .wall(InspireBlocks.PURPUR_TILE_WALL.get())
                .fence(InspireBlocks.PURPUR_TILE_FENCE.get())
                .fenceGate(InspireBlocks.PURPUR_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_PURPUR_TILES.get())
                //.pillar(InspireBlocks.PURPUR_TILE_PILLAR.get())
                .door(InspireBlocks.PURPUR_TILE_DOOR.get())
                .trapdoor(InspireBlocks.PURPUR_TILE_TRAPDOOR.get())
                .button(InspireBlocks.PURPUR_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.PURPUR_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.PURPUR_TILE_LAMP.get())
                .getFamily();

// Stone Bricks Family
        STONE_BRICKS_FAMILY = familyBuilder(Blocks.STONE_BRICKS)
                //.stairs(InspireBlocks.STONE_BRICK_STAIRS.get())
                //.slab(InspireBlocks.STONE_BRICK_SLAB.get())
                .fence(InspireBlocks.STONE_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.STONE_BRICK_FENCE_GATE.get())
                //.pillar(InspireBlocks.STONE_BRICK_PILLAR.get())
                .door(InspireBlocks.STONE_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.STONE_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.STONE_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.STONE_BRICK_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.STONE_BRICK_LAMP.get())
                .getFamily();

// Stone Tiles Family
        STONE_TILES_FAMILY = familyBuilder(InspireBlocks.STONE_TILES.get())
                .cracked(InspireBlocks.CRACKED_STONE_TILES.get())
                .stairs(InspireBlocks.STONE_TILE_STAIRS.get())
                .slab(InspireBlocks.STONE_TILE_SLAB.get())
                .wall(InspireBlocks.STONE_TILE_WALL.get())
                .fence(InspireBlocks.STONE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.STONE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_STONE_TILES.get())
                //.pillar(InspireBlocks.STONE_TILE_PILLAR.get())
                .door(InspireBlocks.STONE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.STONE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.STONE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.STONE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.STONE_TILE_LAMP.get())
                .getFamily();

// Mossy Stone Bricks Family
        MOSSY_STONE_BRICKS_FAMILY = familyBuilder(Blocks.MOSSY_STONE_BRICKS)
                .cracked(InspireBlocks.CRACKED_MOSSY_STONE_BRICK.get())
                //.stairs(InspireBlocks.MOSSY_STONE_BRICK_STAIRS.get())
                //.slab(InspireBlocks.MOSSY_STONE_BRICK_SLAB.get())
                .fence(InspireBlocks.MOSSY_STONE_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.MOSSY_STONE_BRICK_FENCE_GATE.get())
                //.pillar(InspireBlocks.MOSSY_STONE_BRICK_PILLAR.get())
                .chiseled(InspireBlocks.CHISELED_MOSSY_STONE_BRICKS.get())
                .door(InspireBlocks.MOSSY_STONE_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.MOSSY_STONE_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.MOSSY_STONE_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.MOSSY_STONE_BRICK_LAMP.get())
                .getFamily();

// Mossy Stone Tiles Family
        MOSSY_STONE_TILES_FAMILY = familyBuilder(InspireBlocks.MOSSY_STONE_TILES.get())
                .cracked(InspireBlocks.CRACKED_MOSSY_STONE_TILES.get())
                .stairs(InspireBlocks.MOSSY_STONE_TILE_STAIRS.get())
                .slab(InspireBlocks.MOSSY_STONE_TILE_SLAB.get())
                .wall(InspireBlocks.MOSSY_STONE_TILE_WALL.get())
                .fence(InspireBlocks.MOSSY_STONE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.MOSSY_STONE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_MOSSY_STONE_TILES.get())
                //.pillar(InspireBlocks.MOSSY_STONE_TILE_PILLAR.get())
                .door(InspireBlocks.MOSSY_STONE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.MOSSY_STONE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.MOSSY_STONE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.MOSSY_STONE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.MOSSY_STONE_TILE_LAMP.get())
                .getFamily();

// Polished Deepslate Family
        POLISHED_DEEPSLATE_FAMILY = familyBuilder(Blocks.POLISHED_DEEPSLATE)
                .cracked(InspireBlocks.CRACKED_POLISHED_DEEPSLATE.get())
                //.stairs(InspireBlocks.POLISHED_DEEPSLATE_STAIRS.get())
                //.slab(InspireBlocks.POLISHED_DEEPSLATE_SLAB.get())
                .fence(InspireBlocks.POLISHED_DEEPSLATE_FENCE.get())
                .fenceGate(InspireBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get())
                //.pillar(InspireBlocks.POLISHED_DEEPSLATE_PILLAR.get())
                .chiseled(InspireBlocks.CHISELED_POLISHED_DEEPSLATE.get())
                .door(InspireBlocks.POLISHED_DEEPSLATE_DOOR.get())
                .trapdoor(InspireBlocks.POLISHED_DEEPSLATE_TRAPDOOR.get())
                .button(InspireBlocks.POLISHED_DEEPSLATE_BUTTON.get())
                .pressurePlate(InspireBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.POLISHED_DEEPSLATE_LAMP.get())
                .getFamily();

// Polished Deepslate Tiles Family
        POLISHED_DEEPSLATE_TILES_FAMILY = familyBuilder(InspireBlocks.POLISHED_DEEPSLATE_TILES.get())
                .cracked(InspireBlocks.CRACKED_POLISHED_DEEPSLATE_TILES.get())
                .stairs(InspireBlocks.POLISHED_DEEPSLATE_TILE_STAIRS.get())
                .slab(InspireBlocks.POLISHED_DEEPSLATE_TILE_SLAB.get())
                .wall(InspireBlocks.POLISHED_DEEPSLATE_TILE_WALL.get())
                .fence(InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_POLISHED_DEEPSLATE_TILES.get())
                //.pillar(InspireBlocks.POLISHED_DEEPSLATE_TILE_PILLAR.get())
                .door(InspireBlocks.POLISHED_DEEPSLATE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.POLISHED_DEEPSLATE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.POLISHED_DEEPSLATE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.POLISHED_DEEPSLATE_TILE_LAMP.get())
                .getFamily();

                // Polished Blackstone Family
                POLISHED_BLACKSTONE_FAMILY = familyBuilder(Blocks.POLISHED_BLACKSTONE)
                        .cracked(InspireBlocks.CRACKED_POLISHED_BLACKSTONE.get())
                        .stairs(Blocks.POLISHED_BLACKSTONE_STAIRS)
                        .slab(Blocks.POLISHED_BLACKSTONE_SLAB)
                        .wall(Blocks.POLISHED_BLACKSTONE_WALL)
                        .fence(InspireBlocks.POLISHED_BLACKSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get())
                        .door(InspireBlocks.POLISHED_BLACKSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_BLACKSTONE_TRAPDOOR.get())
                        .getFamily();

                // Polished Blackstone Bricks Family
                POLISHED_BLACKSTONE_BRICKS_FAMILY = familyBuilder(Blocks.POLISHED_BLACKSTONE_BRICKS)
                        .stairs(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
                        .slab(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
                        .wall(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
                        .fence(InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE.get())
                        .door(InspireBlocks.POLISHED_BLACKSTONE_BRICK_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR.get())
                        .getFamily();

                GILDED_BLACKSTONE_FAMILY = familyBuilder(Blocks.GILDED_BLACKSTONE)
                        .cracked(InspireBlocks.CRACKED_GILDED_BLACKSTONE.get())
                        .stairs(InspireBlocks.GILDED_BLACKSTONE_STAIRS.get())
                        .slab(InspireBlocks.GILDED_BLACKSTONE_SLAB.get())
                        .wall(InspireBlocks.GILDED_BLACKSTONE_WALL.get())
                        .fence(InspireBlocks.GILDED_BLACKSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.GILDED_BLACKSTONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_GILDED_BLACKSTONE.get())
                        .door(InspireBlocks.GILDED_BLACKSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.GILDED_BLACKSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.GILDED_BLACKSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                SMOOTH_STONE_FAMILY = familyBuilder(Blocks.SMOOTH_STONE)
                        .cracked(InspireBlocks.CRACKED_SMOOTH_STONE.get())
                        .stairs(InspireBlocks.SMOOTH_STONE_STAIRS.get())
                        .slab(Blocks.SMOOTH_STONE_SLAB)
                        .wall(InspireBlocks.SMOOTH_STONE_WALL.get())
                        .fence(InspireBlocks.SMOOTH_STONE_FENCE.get())
                        .fenceGate(InspireBlocks.SMOOTH_STONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_SMOOTH_STONE.get())
                        .door(InspireBlocks.SMOOTH_STONE_DOOR.get())
                        .trapdoor(InspireBlocks.SMOOTH_STONE_TRAPDOOR.get())
                        .button(InspireBlocks.SMOOTH_STONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.SMOOTH_STONE_PRESSURE_PLATE.get())
                        .getFamily();

                REDSTONE_BLOCK_FAMILY = familyBuilder(Blocks.REDSTONE_BLOCK)
                        .cracked(InspireBlocks.CRACKED_REDSTONE_BLOCK.get())
                        .stairs(InspireBlocks.REDSTONE_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.REDSTONE_BLOCK_SLAB.get())
                        .wall(InspireBlocks.REDSTONE_BLOCK_WALL.get())
                        .fence(InspireBlocks.REDSTONE_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.REDSTONE_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_REDSTONE_BLOCK.get())
                        .door(InspireBlocks.REDSTONE_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.REDSTONE_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.REDSTONE_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.REDSTONE_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                AMETHYST_BLOCK_FAMILY = familyBuilder(Blocks.AMETHYST_BLOCK)
                        .cracked(InspireBlocks.CRACKED_AMETHYST_BLOCK.get())
                        .stairs(InspireBlocks.AMETHYST_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.AMETHYST_BLOCK_SLAB.get())
                        .wall(InspireBlocks.AMETHYST_BLOCK_WALL.get())
                        .fence(InspireBlocks.AMETHYST_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.AMETHYST_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_AMETHYST_BLOCK.get())
                        .door(InspireBlocks.AMETHYST_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.AMETHYST_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.AMETHYST_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                GLOWSTONE_FAMILY = familyBuilder(Blocks.GLOWSTONE)
                        .cracked(InspireBlocks.CRACKED_GLOWSTONE.get())
                        .stairs(InspireBlocks.GLOWSTONE_STAIRS.get())
                        .slab(InspireBlocks.GLOWSTONE_SLAB.get())
                        .wall(InspireBlocks.GLOWSTONE_WALL.get())
                        .fence(InspireBlocks.GLOWSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.GLOWSTONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_GLOWSTONE.get())
                        .door(InspireBlocks.GLOWSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.GLOWSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.GLOWSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.GLOWSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                SMOOTH_BASALT_FAMILY = familyBuilder(Blocks.SMOOTH_BASALT)
                        .cracked(InspireBlocks.CRACKED_SMOOTH_BASALT.get())
                        .stairs(InspireBlocks.SMOOTH_BASALT_STAIRS.get())
                        .slab(InspireBlocks.SMOOTH_BASALT_SLAB.get())
                        .wall(InspireBlocks.SMOOTH_BASALT_WALL.get())
                        .fence(InspireBlocks.SMOOTH_BASALT_FENCE.get())
                        .fenceGate(InspireBlocks.SMOOTH_BASALT_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_SMOOTH_BASALT.get())
                        .door(InspireBlocks.SMOOTH_BASALT_DOOR.get())
                        .trapdoor(InspireBlocks.SMOOTH_BASALT_TRAPDOOR.get())
                        .button(InspireBlocks.SMOOTH_BASALT_BUTTON.get())
                        .pressurePlate(InspireBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_BASALT_FAMILY = familyBuilder(Blocks.POLISHED_BASALT)
                        .cracked(InspireBlocks.CRACKED_POLISHED_BASALT.get())
                        .stairs(InspireBlocks.POLISHED_BASALT_STAIRS.get())
                        .slab(InspireBlocks.POLISHED_BASALT_SLAB.get())
                        .wall(InspireBlocks.POLISHED_BASALT_WALL.get())
                        .fence(InspireBlocks.POLISHED_BASALT_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_BASALT_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_BASALT.get())
                        .door(InspireBlocks.POLISHED_BASALT_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_BASALT_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_BASALT_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_BASALT_PRESSURE_PLATE.get())
                        .getFamily();

                BASALT_FAMILY = familyBuilder(Blocks.BASALT)
                        .cracked(InspireBlocks.CRACKED_BASALT.get())
                        .stairs(InspireBlocks.BASALT_STAIRS.get())
                        .slab(InspireBlocks.BASALT_SLAB.get())
                        .wall(InspireBlocks.BASALT_WALL.get())
                        .fence(InspireBlocks.BASALT_FENCE.get())
                        .fenceGate(InspireBlocks.BASALT_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_BASALT.get())
                        .door(InspireBlocks.BASALT_DOOR.get())
                        .trapdoor(InspireBlocks.BASALT_TRAPDOOR.get())
                        .button(InspireBlocks.BASALT_BUTTON.get())
                        .pressurePlate(InspireBlocks.BASALT_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_GLOWSTONE_FAMILY = familyBuilder(InspireBlocks.POLISHED_GLOWSTONE.get())
                        .cracked(InspireBlocks.CRACKED_POLISHED_GLOWSTONE.get())
                        .mosaic(InspireBlocks.POLISHED_GLOWSTONE_BRICKS.get())
                        .stairs(InspireBlocks.POLISHED_GLOWSTONE_STAIRS.get())
                        .slab(InspireBlocks.POLISHED_GLOWSTONE_SLAB.get())
                        .wall(InspireBlocks.POLISHED_GLOWSTONE_WALL.get())
                        .fence(InspireBlocks.POLISHED_GLOWSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_GLOWSTONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_GLOWSTONE.get())
                        .door(InspireBlocks.POLISHED_GLOWSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_GLOWSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_GLOWSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_GLOWSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_GLOWSTONE_BRICKS_FAMILY = familyBuilder(InspireBlocks.POLISHED_GLOWSTONE_BRICKS.get())
                        .cracked(InspireBlocks.CRACKED_POLISHED_GLOWSTONE_BRICKS.get())
                        .mosaic(InspireBlocks.POLISHED_GLOWSTONE_TILES.get())
                        .stairs(InspireBlocks.POLISHED_GLOWSTONE_BRICK_STAIRS.get())
                        .slab(InspireBlocks.POLISHED_GLOWSTONE_BRICK_SLAB.get())
                        .wall(InspireBlocks.POLISHED_GLOWSTONE_BRICK_WALL.get())
                        .fence(InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_GLOWSTONE_BRICKS.get())
                        .door(InspireBlocks.POLISHED_GLOWSTONE_BRICK_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_GLOWSTONE_BRICK_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_GLOWSTONE_BRICK_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_GLOWSTONE_TILES_FAMILY = familyBuilder(InspireBlocks.POLISHED_GLOWSTONE_TILES.get())
                        .cracked(InspireBlocks.CRACKED_POLISHED_GLOWSTONE_TILES.get())
                        .stairs(InspireBlocks.POLISHED_GLOWSTONE_TILE_STAIRS.get())
                        .slab(InspireBlocks.POLISHED_GLOWSTONE_TILE_SLAB.get())
                        .wall(InspireBlocks.POLISHED_GLOWSTONE_TILE_WALL.get())
                        .fence(InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_GLOWSTONE_TILES.get())
                        .door(InspireBlocks.POLISHED_GLOWSTONE_TILE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_GLOWSTONE_TILE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_GLOWSTONE_TILE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_TUFF_FAMILY = familyBuilder(Blocks.POLISHED_TUFF)
                        .cracked(InspireBlocks.CRACKED_POLISHED_TUFF.get())
                        .stairs(Blocks.POLISHED_TUFF_STAIRS)
                        .slab(Blocks.POLISHED_TUFF_SLAB)
                        .wall(Blocks.POLISHED_TUFF_WALL)
                        .fence(InspireBlocks.POLISHED_TUFF_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_TUFF_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_TUFF.get())
                        .door(InspireBlocks.POLISHED_TUFF_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_TUFF_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_TUFF_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_TUFF_PRESSURE_PLATE.get())
                        .getFamily();

                TUFF_BRICKS_FAMILY = familyBuilder(Blocks.TUFF_BRICKS)
                        .cracked(InspireBlocks.CRACKED_TUFF_BRICKS.get())
                        .stairs(Blocks.TUFF_BRICK_STAIRS)
                        .slab(Blocks.TUFF_BRICK_SLAB)
                        .wall(Blocks.TUFF_BRICK_WALL)
                        .fence(InspireBlocks.TUFF_BRICK_FENCE.get())
                        .fenceGate(InspireBlocks.TUFF_BRICK_FENCE_GATE.get())
                        .chiseled(Blocks.CHISELED_TUFF_BRICKS)
                        .door(InspireBlocks.TUFF_BRICK_DOOR.get())
                        .trapdoor(InspireBlocks.TUFF_BRICK_TRAPDOOR.get())
                        .button(InspireBlocks.TUFF_BRICK_BUTTON.get())
                        .pressurePlate(InspireBlocks.TUFF_BRICK_PRESSURE_PLATE.get())
                        .getFamily();

                QUARTZ_FAMILY = familyBuilder(Blocks.QUARTZ_BLOCK)
                        .cracked(InspireBlocks.CRACKED_QUARTZ.get())
                        .stairs(Blocks.QUARTZ_STAIRS)
                        .slab(Blocks.QUARTZ_SLAB)
                        .wall(InspireBlocks.QUARTZ_WALL.get())
                        .fence(InspireBlocks.QUARTZ_FENCE.get())
                        .fenceGate(InspireBlocks.QUARTZ_FENCE_GATE.get())
                        .chiseled(Blocks.CHISELED_QUARTZ_BLOCK)
                        .door(InspireBlocks.QUARTZ_DOOR.get())
                        .trapdoor(InspireBlocks.QUARTZ_TRAPDOOR.get())
                        .button(InspireBlocks.QUARTZ_BUTTON.get())
                        .pressurePlate(InspireBlocks.QUARTZ_PRESSURE_PLATE.get())
                        .getFamily();

                SMOOTH_QUARTZ_FAMILY = familyBuilder(Blocks.SMOOTH_QUARTZ)
                        .cracked(InspireBlocks.CRACKED_SMOOTH_QUARTZ.get())
                        .stairs(Blocks.SMOOTH_QUARTZ_STAIRS)
                        .slab(Blocks.SMOOTH_QUARTZ_SLAB)
                        .wall(InspireBlocks.SMOOTH_QUARTZ_WALL.get())
                        .fence(InspireBlocks.SMOOTH_QUARTZ_FENCE.get())
                        .fenceGate(InspireBlocks.SMOOTH_QUARTZ_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_SMOOTH_QUARTZ.get())
                        .door(InspireBlocks.SMOOTH_QUARTZ_DOOR.get())
                        .trapdoor(InspireBlocks.SMOOTH_QUARTZ_TRAPDOOR.get())
                        .button(InspireBlocks.SMOOTH_QUARTZ_BUTTON.get())
                        .pressurePlate(InspireBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get())
                        .getFamily();

                RESIN_FAMILY = familyBuilder(InspireBlocks.RESIN.get())
                        .cracked(InspireBlocks.CRACKED_RESIN.get())
                        .stairs(InspireBlocks.RESIN_STAIRS.get())
                        .slab(InspireBlocks.RESIN_SLAB.get())
                        .wall(InspireBlocks.RESIN_WALL.get())
                        .fence(InspireBlocks.RESIN_FENCE.get())
                        .fenceGate(InspireBlocks.RESIN_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_RESIN.get())
                        .door(InspireBlocks.RESIN_DOOR.get())
                        .trapdoor(InspireBlocks.RESIN_TRAPDOOR.get())
                        .button(InspireBlocks.RESIN_BUTTON.get())
                        .pressurePlate(InspireBlocks.RESIN_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_GRANITE_FAMILY = familyBuilder(Blocks.POLISHED_GRANITE)
                        .cracked(InspireBlocks.CRACKED_POLISHED_GRANITE.get())
                        .stairs(Blocks.POLISHED_GRANITE_STAIRS)
                        .slab(Blocks.POLISHED_GRANITE_SLAB)
                        .wall(InspireBlocks.POLISHED_GRANITE_WALL.get())
                        .fence(InspireBlocks.POLISHED_GRANITE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_GRANITE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_GRANITE.get())
                        .door(InspireBlocks.POLISHED_GRANITE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_GRANITE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_GRANITE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_DIORITE_FAMILY = familyBuilder(Blocks.POLISHED_DIORITE)
                        .cracked(InspireBlocks.CRACKED_POLISHED_DIORITE.get())
                        .stairs(Blocks.POLISHED_DIORITE_STAIRS)
                        .slab(Blocks.POLISHED_DIORITE_SLAB)
                        .wall(InspireBlocks.POLISHED_DIORITE_WALL.get())
                        .fence(InspireBlocks.POLISHED_DIORITE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_DIORITE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_DIORITE.get())
                        .door(InspireBlocks.POLISHED_DIORITE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_DIORITE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_DIORITE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_ANDESITE_FAMILY = familyBuilder(Blocks.POLISHED_ANDESITE)
                        .cracked(InspireBlocks.CRACKED_POLISHED_ANDESITE.get())
                        .stairs(Blocks.POLISHED_ANDESITE_STAIRS)
                        .slab(Blocks.POLISHED_ANDESITE_SLAB)
                        .wall(InspireBlocks.POLISHED_ANDESITE_WALL.get())
                        .fence(InspireBlocks.POLISHED_ANDESITE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_ANDESITE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_ANDESITE.get())
                        .door(InspireBlocks.POLISHED_ANDESITE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_ANDESITE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_ANDESITE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get())
                        .getFamily();

                SANDSTONE_FAMILY = familyBuilder(Blocks.SANDSTONE)
                        .cracked(InspireBlocks.CRACKED_SANDSTONE.get())
                        .stairs(Blocks.SANDSTONE_STAIRS)
                        .slab(Blocks.SANDSTONE_SLAB)
                        .wall(Blocks.SANDSTONE_WALL)
                        .fence(InspireBlocks.SANDSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.SANDSTONE_FENCE_GATE.get())
                        .chiseled(Blocks.CHISELED_SANDSTONE)
                        .door(InspireBlocks.SANDSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.SANDSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.SANDSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.SANDSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                IRON_BLOCK_FAMILY = familyBuilder(Blocks.IRON_BLOCK)
                        .cracked(InspireBlocks.CRACKED_IRON_BLOCK.get())
                        .stairs(InspireBlocks.IRON_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.IRON_BLOCK_SLAB.get())
                        .wall(InspireBlocks.IRON_BLOCK_WALL.get())
                        .fence(InspireBlocks.IRON_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.IRON_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_IRON_BLOCK.get())
                        .door(InspireBlocks.IRON_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.IRON_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.IRON_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.IRON_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                GOLD_BLOCK_FAMILY = familyBuilder(Blocks.GOLD_BLOCK)
                        .cracked(InspireBlocks.CRACKED_GOLD_BLOCK.get())
                        .stairs(InspireBlocks.GOLD_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.GOLD_BLOCK_SLAB.get())
                        .wall(InspireBlocks.GOLD_BLOCK_WALL.get())
                        .fence(InspireBlocks.GOLD_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.GOLD_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_GOLD_BLOCK.get())
                        .door(InspireBlocks.GOLD_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.GOLD_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.GOLD_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.GOLD_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                EMERALD_BLOCK_FAMILY = familyBuilder(Blocks.EMERALD_BLOCK)
                        .cracked(InspireBlocks.CRACKED_EMERALD_BLOCK.get())
                        .stairs(InspireBlocks.EMERALD_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.EMERALD_BLOCK_SLAB.get())
                        .wall(InspireBlocks.EMERALD_BLOCK_WALL.get())
                        .fence(InspireBlocks.EMERALD_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.EMERALD_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_EMERALD_BLOCK.get())
                        .door(InspireBlocks.EMERALD_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.EMERALD_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.EMERALD_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                DIAMOND_BLOCK_FAMILY = familyBuilder(Blocks.DIAMOND_BLOCK)
                        .cracked(InspireBlocks.CRACKED_DIAMOND_BLOCK.get())
                        .stairs(InspireBlocks.DIAMOND_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.DIAMOND_BLOCK_SLAB.get())
                        .wall(InspireBlocks.DIAMOND_BLOCK_WALL.get())
                        .fence(InspireBlocks.DIAMOND_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.DIAMOND_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_DIAMOND_BLOCK.get())
                        .door(InspireBlocks.DIAMOND_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.DIAMOND_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.DIAMOND_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                NETHERITE_BLOCK_FAMILY = familyBuilder(Blocks.NETHERITE_BLOCK)
                        .cracked(InspireBlocks.CRACKED_NETHERITE_BLOCK.get())
                        .stairs(InspireBlocks.NETHERITE_BLOCK_STAIRS.get())
                        .slab(InspireBlocks.NETHERITE_BLOCK_SLAB.get())
                        .wall(InspireBlocks.NETHERITE_BLOCK_WALL.get())
                        .fence(InspireBlocks.NETHERITE_BLOCK_FENCE.get())
                        .fenceGate(InspireBlocks.NETHERITE_BLOCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_NETHERITE_BLOCK.get())
                        .door(InspireBlocks.NETHERITE_BLOCK_DOOR.get())
                        .trapdoor(InspireBlocks.NETHERITE_BLOCK_TRAPDOOR.get())
                        .button(InspireBlocks.NETHERITE_BLOCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get())
                        .getFamily();

                OBSIDIAN_FAMILY = familyBuilder(Blocks.OBSIDIAN)
                        .cracked(InspireBlocks.CRACKED_OBSIDIAN.get())
                        .stairs(InspireBlocks.OBSIDIAN_STAIRS.get())
                        .slab(InspireBlocks.OBSIDIAN_SLAB.get())
                        .wall(InspireBlocks.OBSIDIAN_WALL.get())
                        .fence(InspireBlocks.OBSIDIAN_FENCE.get())
                        .fenceGate(InspireBlocks.OBSIDIAN_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_OBSIDIAN.get())
                        .door(InspireBlocks.OBSIDIAN_DOOR.get())
                        .trapdoor(InspireBlocks.OBSIDIAN_TRAPDOOR.get())
                        .button(InspireBlocks.OBSIDIAN_BUTTON.get())
                        .pressurePlate(InspireBlocks.OBSIDIAN_PRESSURE_PLATE.get())
                        .getFamily();

                CRYING_OBSIDIAN_FAMILY = familyBuilder(Blocks.CRYING_OBSIDIAN)
                        .cracked(InspireBlocks.CRACKED_CRYING_OBSIDIAN.get())
                        .stairs(InspireBlocks.CRYING_OBSIDIAN_STAIRS.get())
                        .slab(InspireBlocks.CRYING_OBSIDIAN_SLAB.get())
                        .wall(InspireBlocks.CRYING_OBSIDIAN_WALL.get())
                        .fence(InspireBlocks.CRYING_OBSIDIAN_FENCE.get())
                        .fenceGate(InspireBlocks.CRYING_OBSIDIAN_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_CRYING_OBSIDIAN.get())
                        .door(InspireBlocks.CRYING_OBSIDIAN_DOOR.get())
                        .trapdoor(InspireBlocks.CRYING_OBSIDIAN_TRAPDOOR.get())
                        .button(InspireBlocks.CRYING_OBSIDIAN_BUTTON.get())
                        .pressurePlate(InspireBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get())
                        .getFamily();

                BEDROCK_FAMILY = familyBuilder(Blocks.BEDROCK)
                        .cracked(InspireBlocks.CRACKED_BEDROCK.get())
                        .stairs(InspireBlocks.BEDROCK_STAIRS.get())
                        .slab(InspireBlocks.BEDROCK_SLAB.get())
                        .wall(InspireBlocks.BEDROCK_WALL.get())
                        .fence(InspireBlocks.BEDROCK_FENCE.get())
                        .fenceGate(InspireBlocks.BEDROCK_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_BEDROCK.get())
                        .door(InspireBlocks.BEDROCK_DOOR.get())
                        .trapdoor(InspireBlocks.BEDROCK_TRAPDOOR.get())
                        .button(InspireBlocks.BEDROCK_BUTTON.get())
                        .pressurePlate(InspireBlocks.BEDROCK_PRESSURE_PLATE.get())
                        .getFamily();

                SOUL_SANDSTONE_FAMILY = familyBuilder(InspireBlocks.SOUL_SANDSTONE.get())
                        .cracked(InspireBlocks.CRACKED_SOUL_SANDSTONE.get())
                        .stairs(InspireBlocks.SOUL_SANDSTONE_STAIRS.get())
                        .slab(InspireBlocks.SOUL_SANDSTONE_SLAB.get())
                        .wall(InspireBlocks.SOUL_SANDSTONE_WALL.get())
                        .fence(InspireBlocks.SOUL_SANDSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.SOUL_SANDSTONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_SOUL_SANDSTONE.get())
                        .door(InspireBlocks.SOUL_SANDSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.SOUL_SANDSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.SOUL_SANDSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.SOUL_SANDSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                SOUL_SLATE_FAMILY = familyBuilder(InspireBlocks.SOUL_SLATE.get())
                        .cracked(InspireBlocks.CRACKED_SOUL_SLATE.get())
                        .stairs(InspireBlocks.SOUL_SLATE_STAIRS.get())
                        .slab(InspireBlocks.SOUL_SLATE_SLAB.get())
                        .wall(InspireBlocks.SOUL_SLATE_WALL.get())
                        .fence(InspireBlocks.SOUL_SLATE_FENCE.get())
                        .fenceGate(InspireBlocks.SOUL_SLATE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_SOUL_SLATE.get())
                        .door(InspireBlocks.SOUL_SLATE_DOOR.get())
                        .trapdoor(InspireBlocks.SOUL_SLATE_TRAPDOOR.get())
                        .button(InspireBlocks.SOUL_SLATE_BUTTON.get())
                        .pressurePlate(InspireBlocks.SOUL_SLATE_PRESSURE_PLATE.get())
                        .getFamily();

                DRIPSTONE_FAMILY = familyBuilder(Blocks.DRIPSTONE_BLOCK)
                        .cracked(InspireBlocks.CRACKED_DRIPSTONE.get())
                        .stairs(InspireBlocks.DRIPSTONE_STAIRS.get())
                        .slab(InspireBlocks.DRIPSTONE_SLAB.get())
                        .wall(InspireBlocks.DRIPSTONE_WALL.get())
                        .fence(InspireBlocks.DRIPSTONE_FENCE.get())
                        .fenceGate(InspireBlocks.DRIPSTONE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_DRIPSTONE.get())
                        .door(InspireBlocks.DRIPSTONE_DOOR.get())
                        .trapdoor(InspireBlocks.DRIPSTONE_TRAPDOOR.get())
                        .button(InspireBlocks.DRIPSTONE_BUTTON.get())
                        .pressurePlate(InspireBlocks.DRIPSTONE_PRESSURE_PLATE.get())
                        .getFamily();

                POLISHED_CALCITE_FAMILY = familyBuilder(InspireBlocks.POLISHED_CALCITE.get())
                        .cracked(InspireBlocks.CRACKED_POLISHED_CALCITE.get())
                        .stairs(InspireBlocks.POLISHED_CALCITE_STAIRS.get())
                        .slab(InspireBlocks.POLISHED_CALCITE_SLAB.get())
                        .wall(InspireBlocks.POLISHED_CALCITE_WALL.get())
                        .fence(InspireBlocks.POLISHED_CALCITE_FENCE.get())
                        .fenceGate(InspireBlocks.POLISHED_CALCITE_FENCE_GATE.get())
                        .chiseled(InspireBlocks.CHISELED_POLISHED_CALCITE.get())
                        .door(InspireBlocks.POLISHED_CALCITE_DOOR.get())
                        .trapdoor(InspireBlocks.POLISHED_CALCITE_TRAPDOOR.get())
                        .button(InspireBlocks.POLISHED_CALCITE_BUTTON.get())
                        .pressurePlate(InspireBlocks.POLISHED_CALCITE_PRESSURE_PLATE.get())
                        .getFamily();

                // Deepslate Bricks Family
                        DEEPSLATE_BRICKS_FAMILY = familyBuilder(Blocks.DEEPSLATE_BRICKS)
                        //.cracked(InspireBlocks.CRACKED_POLISHED_DEEPSLATE.get()) // or DEEPSLATE_BRICKS_CRACKED if you have a specific block
                        //.stairs(InspireBlocks.DEEPSLATE_BRICK_STAIRS.get())
                //.slab(InspireBlocks.DEEPSLATE_BRICK_SLAB.get())
                //.wall(InspireBlocks.DEEPSLATE_BRICK_WALL.get())
                .fence(InspireBlocks.DEEPSLATE_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.DEEPSLATE_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_DEEPSLATE_BRICKS.get())
                //.pillar(InspireBlocks.DEEPSLATE_BRICK_PILLAR.get())
                .door(InspireBlocks.DEEPSLATE_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.DEEPSLATE_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.DEEPSLATE_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.DEEPSLATE_BRICK_LAMP.get())
                .getFamily();
        /*
        BRICKS_FAMILY = familyBuilder(Blocks.BRICKS)
                .fence(InspireBlocks.BRICK_FENCE.get())
                .fenceGate(InspireBlocks.BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_BRICKS.get())
                .door(InspireBlocks.BRICK_DOOR.get())
                .trapdoor(InspireBlocks.BRICK_TRAPDOOR.get())
                .button(InspireBlocks.BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.BRICK_PRESSURE_PLATE.get())
                .getFamily();
        MUD_BRICKS_FAMILY = familyBuilder(Blocks.MUD_BRICKS)
                .fence(InspireBlocks.MUD_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.MUD_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_MUD_BRICKS.get())
                .door(InspireBlocks.MUD_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.MUD_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.MUD_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.MUD_BRICK_PRESSURE_PLATE.get())
                .getFamily();

         */

        MUD_BRICKS = familyBuilder(Blocks.MUD_BRICKS)
                .wall(Blocks.MUD_BRICK_WALL)
                .stairs(Blocks.MUD_BRICK_STAIRS)
                .slab(Blocks.MUD_BRICK_SLAB)
                .fence(InspireBlocks.MUD_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.MUD_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_MUD_BRICKS.get())
                .door(InspireBlocks.MUD_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.MUD_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.MUD_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.MUD_BRICK_PRESSURE_PLATE.get())
                .getFamily();

    }


    private static BlockFamily.Builder familyBuilder(Block block) {
        BlockFamily.Builder builder = new BlockFamily.Builder(block);
        BlockFamily blockFamily = (BlockFamily)MAP.put(block, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + String.valueOf(BuiltInRegistries.BLOCK.getKey(block)));
        } else {
            return builder;
        }
    }

}
