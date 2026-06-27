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

// Deepslate Tiles Family
        //BlockFamilies.DEEPSLATE_TILES.ad
        /*
        DEEPSLATE_TILES_FAMILY = familyBuilder(Blocks.DEEPSLATE_TILES)
                //.cracked(InspireBlocks.CRACKED_DEEPSLATE_TILES.get())
                //.stairs(InspireBlocks.DEEPSLATE_TILE_STAIRS.get())
                //.slab(InspireBlocks.DEEPSLATE_TILE_SLAB.get())
                //.wall(InspireBlocks.DEEPSLATE_TILE_WALL.get())
                .fence(InspireBlocks.DEEPSLATE_TILE_FENCE.get())
                .fenceGate(InspireBlocks.DEEPSLATE_TILE_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_DEEPSLATE_TILES.get())
                //.pillar(InspireBlocks.DEEPSLATE_TILE_PILLAR.get())
                .door(InspireBlocks.DEEPSLATE_TILE_DOOR.get())
                .trapdoor(InspireBlocks.DEEPSLATE_TILE_TRAPDOOR.get())
                .button(InspireBlocks.DEEPSLATE_TILE_BUTTON.get())
                .pressurePlate(InspireBlocks.DEEPSLATE_TILE_PRESSURE_PLATE.get())
                //.lamp(InspireBlocks.DEEPSLATE_TILE_LAMP.get())
                .getFamily();

         */
        /*
        try {
            Field bricksField = BlockFamilies.class.getDeclaredField("BRICKS");
            bricksField.setAccessible(true);

            // Rebuild the family using the same base block
            BlockFamily newBricksFamily = new BlockFamily.Builder(Blocks.BRICKS)
                    .cracked(InspireBlocks.CRACKED_BRICKS.get())
                    .stairs(Blocks.BRICK_STAIRS)
                    .slab(Blocks.BRICK_SLAB)
                    .wall(Blocks.BRICK_WALL)
                    .fence(InspireBlocks.BRICK_FENCE.get())
                    .fenceGate(InspireBlocks.BRICK_FENCE_GATE.get())
                    .chiseled(InspireBlocks.CHISELED_BRICKS.get())
                    .trapdoor(InspireBlocks.BRICK_TRAPDOOR.get())
                    .door(InspireBlocks.BRICK_DOOR.get())
                    .button(InspireBlocks.BRICK_FENCE_GATE.get())
                    .pressurePlate(InspireBlocks.BRICK_PRESSURE_PLATE.get())
                    .getFamily();

            // Overwrite the vanilla field
            bricksField.set(null, newBricksFamily);
        } catch (Exception e) {
            e.printStackTrace();
        }

         */
        /*
        POLISHED_RED_NETHER_BRICKS = familyBuilder(InspireBlocks.POLISHED_RED_NETHER_BRICKS.get())
                .cracked(InspireBlocks.CRACKED_POLISHED_RED_NETHER_BRICKS.get())
                .stairs(InspireBlocks.POLISHED_RED_NETHER_BRICK_STAIRS.get())
                .slab(InspireBlocks.POLISHED_RED_NETHER_BRICK_SLAB.get())
                .wall(InspireBlocks.POLISHED_RED_NETHER_BRICK_WALL.get())
                .fence(InspireBlocks.POLISHED_RED_NETHER_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.POLISHED_RED_NETHER_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_POLISHED_RED_NETHER_BRICK.get())
                .door(InspireBlocks.POLISHED_RED_NETHER_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.POLISHED_RED_NETHER_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.POLISHED_RED_NETHER_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE.get())
                .getFamily();
        POLISHED_CYAN_NETHER_BRICKS = familyBuilder(InspireBlocks.POLISHED_CYAN_NETHER_BRICKS.get())
                .cracked(InspireBlocks.CRACKED_POLISHED_CYAN_NETHER_BRICKS.get())
                .stairs(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_STAIRS.get())
                .slab(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_SLAB.get())
                .wall(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_WALL.get())
                .fence(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_FENCE.get())
                .fenceGate(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_FENCE_GATE.get())
                .chiseled(InspireBlocks.CHISELED_POLISHED_CYAN_NETHER_BRICK.get())
                .door(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_DOOR.get())
                .trapdoor(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_TRAPDOOR.get())
                .button(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_BUTTON.get())
                .pressurePlate(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE.get())
                .getFamily();
         */
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
