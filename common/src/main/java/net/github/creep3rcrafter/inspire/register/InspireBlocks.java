package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.RegularBedBlock;
import net.github.creep3rcrafter.inspire.block.ShelfFungiBlock;
import net.github.creep3rcrafter.inspire.block.entity.IcicleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class InspireBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(InspireCommon.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> WARPED_NYLIUM_SHELF;
    public static final RegistrySupplier<Block> CRIMSON_NYLIUM_SHELF;

    //MATERIAL
    //VARRIENTS bricks,tiled,polished/smooth,cracked
    //TYPES stair,slab,wall,fence,fence gate,chiseled,pillar,door,trapdoor,button,pressure plate, lamp

    public static final RegistrySupplier<Block> AMARANTH_FROGLIGHT;
    public static final RegistrySupplier<Block> BLUSH_FROGLIGHT;
    public static final RegistrySupplier<Block> CELADON_FROGLIGHT;
    public static final RegistrySupplier<Block> CLOUDY_FROGLIGHT;
    public static final RegistrySupplier<Block> COBALT_FROGLIGHT;
    public static final RegistrySupplier<Block> CRIMSON_FROGLIGHT;
    public static final RegistrySupplier<Block> FROSTED_FROGLIGHT;
    public static final RegistrySupplier<Block> MIDNIGHT_FROGLIGHT;
    public static final RegistrySupplier<Block> MISTY_FROGLIGHT;
    public static final RegistrySupplier<Block> SEAFOAM_FROGLIGHT;
    public static final RegistrySupplier<Block> UMBER_FROGLIGHT;
    public static final RegistrySupplier<Block> WARM_FROGLIGHT;
    public static final RegistrySupplier<Block> SKY_FROGLIGHT;

    public static final RegistrySupplier<Block> BED;
    public static final RegistrySupplier<Block> CARPET;
    public static final RegistrySupplier<Block> WOOL;
    public static final RegistrySupplier<Block> CONCRETE;
    public static final RegistrySupplier<Block> CONCRETE_POWDER;
    public static final RegistrySupplier<Block> GLAZED_TERRACOTTA;
    public static final RegistrySupplier<Block> TINTED_GLASS_PANE;
    public static final RegistrySupplier<Block> FROGLIGHT;
    public static final RegistrySupplier<Block> ICICLE;

    public static final RegistrySupplier<Block> OAK_WALL;
    public static final RegistrySupplier<Block> SPRUCE_WALL;
    public static final RegistrySupplier<Block> BIRCH_WALL;
    public static final RegistrySupplier<Block> JUNGLE_WALL;
    public static final RegistrySupplier<Block> ACACIA_WALL;
    public static final RegistrySupplier<Block> DARK_OAK_WALL;
    public static final RegistrySupplier<Block> MANGROVE_WALL;
    public static final RegistrySupplier<Block> CHERRY_WALL;
    public static final RegistrySupplier<Block> PALE_OAK_WALL;
    public static final RegistrySupplier<Block> BAMBOO_WALL;
    public static final RegistrySupplier<Block> CRIMSON_WALL;
    public static final RegistrySupplier<Block> WARPED_WALL;

    public static final RegistrySupplier<Block> NETHER_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Block> NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Block> NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Block> NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Block> NETHER_TILES;
    public static final RegistrySupplier<Block> CRACKED_NETHER_TILES;
    public static final RegistrySupplier<Block> NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Block> NETHER_TILE_SLAB;
    public static final RegistrySupplier<Block> NETHER_TILE_WALL;
    public static final RegistrySupplier<Block> NETHER_TILE_FENCE;
    public static final RegistrySupplier<Block> NETHER_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_NETHER_TILES;
    public static final RegistrySupplier<Block> NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Block> NETHER_TILE_DOOR;
    public static final RegistrySupplier<Block> NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Block> NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> NETHER_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_BRICKS;
    public static final RegistrySupplier<Block> BRICK_FENCE;
    public static final RegistrySupplier<Block> BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_BRICKS;
    public static final RegistrySupplier<Block> BRICK_PILLAR;
    public static final RegistrySupplier<Block> BRICK_DOOR;
    public static final RegistrySupplier<Block> BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> BRICK_BUTTON;
    public static final RegistrySupplier<Block> BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> BRICK_LAMP;

    public static final RegistrySupplier<Block> BRICK_TILES;
    public static final RegistrySupplier<Block> CRACKED_BRICK_TILES;
    public static final RegistrySupplier<Block> BRICK_TILE_STAIRS;
    public static final RegistrySupplier<Block> BRICK_TILE_SLAB;
    public static final RegistrySupplier<Block> BRICK_TILE_WALL;
    public static final RegistrySupplier<Block> BRICK_TILE_FENCE;
    public static final RegistrySupplier<Block> BRICK_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_BRICK_TILES;
    public static final RegistrySupplier<Block> BRICK_TILE_PILLAR;
    public static final RegistrySupplier<Block> BRICK_TILE_DOOR;
    public static final RegistrySupplier<Block> BRICK_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> BRICK_TILE_BUTTON;
    public static final RegistrySupplier<Block> BRICK_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> BRICK_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_MUD_BRICKS;
    public static final RegistrySupplier<Block> MUD_BRICK_FENCE;
    public static final RegistrySupplier<Block> MUD_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_MUD_BRICKS;
    public static final RegistrySupplier<Block> MUD_BRICK_PILLAR;
    public static final RegistrySupplier<Block> MUD_BRICK_DOOR;
    public static final RegistrySupplier<Block> MUD_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> MUD_BRICK_BUTTON;
    public static final RegistrySupplier<Block> MUD_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> MUD_BRICK_LAMP;

    public static final RegistrySupplier<Block> MUD_TILES;
    public static final RegistrySupplier<Block> CRACKED_MUD_TILES;
    public static final RegistrySupplier<Block> MUD_TILE_STAIRS;
    public static final RegistrySupplier<Block> MUD_TILE_SLAB;
    public static final RegistrySupplier<Block> MUD_TILE_WALL;
    public static final RegistrySupplier<Block> MUD_TILE_FENCE;
    public static final RegistrySupplier<Block> MUD_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_MUD_TILES;
    public static final RegistrySupplier<Block> MUD_TILE_PILLAR;
    public static final RegistrySupplier<Block> MUD_TILE_DOOR;
    public static final RegistrySupplier<Block> MUD_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> MUD_TILE_BUTTON;
    public static final RegistrySupplier<Block> MUD_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> MUD_TILE_LAMP;

    public static final RegistrySupplier<Block> PRISMARINE_BRICK_WALL;
    public static final RegistrySupplier<Block> CRACKED_PRISMARINE_BRICKS;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_FENCE;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_PRISMARINE_BRICKS;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_DOOR;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> PRISMARINE_BRICK_PRESSURE_PLATE;

    public static final RegistrySupplier<Block> PRISMARINE_TILES;
    public static final RegistrySupplier<Block> CRACKED_PRISMARINE_TILES;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_STAIRS;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_SLAB;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_WALL;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_FENCE;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_PRISMARINE_TILES;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_PILLAR;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_DOOR;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_BUTTON;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> PRISMARINE_TILE_SEA_LANTERN;

    public static final RegistrySupplier<Block> DARK_PRISMARINE_WALL;
    public static final RegistrySupplier<Block> CRACKED_DARK_PRISMARINE;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_FENCE;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_DARK_PRISMARINE;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_PILLAR;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_DOOR;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_TRAPDOOR;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_BUTTON;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> DARK_PRISMARINE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_END_STONE_BRICKS;
    public static final RegistrySupplier<Block> END_STONE_BRICK_FENCE;
    public static final RegistrySupplier<Block> END_STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_END_STONE_BRICKS;
    public static final RegistrySupplier<Block> END_STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> END_STONE_BRICK_DOOR;
    public static final RegistrySupplier<Block> END_STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> END_STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> END_STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> END_STONE_BRICK_LAMP;

    public static final RegistrySupplier<Block> END_STONE_TILES;
    public static final RegistrySupplier<Block> CRACKED_END_STONE_TILES;
    public static final RegistrySupplier<Block> END_STONE_TILE_STAIRS;
    public static final RegistrySupplier<Block> END_STONE_TILE_SLAB;
    public static final RegistrySupplier<Block> END_STONE_TILE_WALL;
    public static final RegistrySupplier<Block> END_STONE_TILE_FENCE;
    public static final RegistrySupplier<Block> END_STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_END_STONE_TILES;
    public static final RegistrySupplier<Block> END_STONE_TILE_PILLAR;
    public static final RegistrySupplier<Block> END_STONE_TILE_DOOR;
    public static final RegistrySupplier<Block> END_STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> END_STONE_TILE_BUTTON;
    public static final RegistrySupplier<Block> END_STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> END_STONE_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_PURPUR;
    public static final RegistrySupplier<Block> PURPUR_WALL;
    public static final RegistrySupplier<Block> PURPUR_FENCE;
    public static final RegistrySupplier<Block> PURPUR_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_PURPUR;
    public static final RegistrySupplier<Block> PURPUR_DOOR;
    public static final RegistrySupplier<Block> PURPUR_TRAPDOOR;
    public static final RegistrySupplier<Block> PURPUR_BUTTON;
    public static final RegistrySupplier<Block> PURPUR_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> PURPUR_LAMP;

    public static final RegistrySupplier<Block> PURPUR_TILES;
    public static final RegistrySupplier<Block> CRACKED_PURPUR_TILES;
    public static final RegistrySupplier<Block> PURPUR_TILE_STAIRS;
    public static final RegistrySupplier<Block> PURPUR_TILE_SLAB;
    public static final RegistrySupplier<Block> PURPUR_TILE_WALL;
    public static final RegistrySupplier<Block> PURPUR_TILE_FENCE;
    public static final RegistrySupplier<Block> PURPUR_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_PURPUR_TILES;
    public static final RegistrySupplier<Block> PURPUR_TILE_PILLAR;
    public static final RegistrySupplier<Block> PURPUR_TILE_DOOR;
    public static final RegistrySupplier<Block> PURPUR_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> PURPUR_TILE_BUTTON;
    public static final RegistrySupplier<Block> PURPUR_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> PURPUR_TILE_LAMP;

    public static final RegistrySupplier<Block> STONE_BRICK_FENCE;
    public static final RegistrySupplier<Block> STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> STONE_BRICK_DOOR;
    public static final RegistrySupplier<Block> STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> STONE_BRICK_LAMP;

    public static final RegistrySupplier<Block> STONE_TILES;
    public static final RegistrySupplier<Block> CRACKED_STONE_TILES;
    public static final RegistrySupplier<Block> STONE_TILE_STAIRS;
    public static final RegistrySupplier<Block> STONE_TILE_SLAB;
    public static final RegistrySupplier<Block> STONE_TILE_WALL;
    public static final RegistrySupplier<Block> STONE_TILE_FENCE;
    public static final RegistrySupplier<Block> STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_STONE_TILES;
    public static final RegistrySupplier<Block> STONE_TILE_PILLAR;
    public static final RegistrySupplier<Block> STONE_TILE_DOOR;
    public static final RegistrySupplier<Block> STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> STONE_TILE_BUTTON;
    public static final RegistrySupplier<Block> STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> STONE_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_MOSSY_STONE_BRICK;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_FENCE;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> CHISELED_MOSSY_STONE_BRICKS;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_DOOR;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_LAMP;

    public static final RegistrySupplier<Block> MOSSY_STONE_TILES;
    public static final RegistrySupplier<Block> CRACKED_MOSSY_STONE_TILES;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_STAIRS;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_SLAB;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_WALL;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_FENCE;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_MOSSY_STONE_TILES;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_PILLAR;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_DOOR;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_BUTTON;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> MOSSY_STONE_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_POLISHED_DEEPSLATE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_FENCE_GATE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_PILLAR;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_DEEPSLATE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_LAMP;

    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_SLAB;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_WALL;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_TILE_LAMP;

    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_FENCE;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> CHISELED_DEEPSLATE_BRICKS;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_DOOR;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> DEEPSLATE_BRICK_LAMP;

    public static final RegistrySupplier<Block> DEEPSLATE_TILE_FENCE;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_PILLAR;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_DOOR;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_BUTTON;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> DEEPSLATE_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_QUARTZ_BRICKS;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_STAIRS;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_SLAB;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_WALL;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_FENCE;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_QUARTZ_BRICKS;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_PILLAR;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_DOOR;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_BUTTON;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> QUARTZ_BRICK_LAMP;

    public static final RegistrySupplier<Block> QUARTZ_TILES;
    public static final RegistrySupplier<Block> CRACKED_QUARTZ_TILES;
    public static final RegistrySupplier<Block> QUARTZ_TILE_STAIRS;
    public static final RegistrySupplier<Block> QUARTZ_TILE_SLAB;
    public static final RegistrySupplier<Block> QUARTZ_TILE_WALL;
    public static final RegistrySupplier<Block> QUARTZ_TILE_FENCE;
    public static final RegistrySupplier<Block> QUARTZ_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_QUARTZ_TILES;
    public static final RegistrySupplier<Block> QUARTZ_TILE_PILLAR;
    public static final RegistrySupplier<Block> QUARTZ_TILE_DOOR;
    public static final RegistrySupplier<Block> QUARTZ_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> QUARTZ_TILE_BUTTON;
    public static final RegistrySupplier<Block> QUARTZ_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> QUARTZ_TILE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> RED_NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Block> RED_NETHER_TILES;
    public static final RegistrySupplier<Block> CRACKED_RED_NETHER_TILES;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_SLAB;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_WALL;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_FENCE;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_RED_NETHER_TILES;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_DOOR;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> RED_NETHER_TILE_LAMP;

    public static final RegistrySupplier<Block> CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> CRACKED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> CYAN_NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Block> CYAN_NETHER_TILES;
    public static final RegistrySupplier<Block> CRACKED_CYAN_NETHER_TILES;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_SLAB;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_WALL;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_FENCE;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_CYAN_NETHER_TILES;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_DOOR;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> CYAN_NETHER_TILE_LAMP;

    /*
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_RED_NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_CYAN_NETHER_BRICK_LAMP;
     */
    static {
        AMARANTH_FROGLIGHT = BLOCKS.register("amaranth_froglight", ()-> new RotatedPillarBlock(basicProperties("amaranth_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        BLUSH_FROGLIGHT = BLOCKS.register("blush_froglight", ()-> new RotatedPillarBlock(basicProperties("blush_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        CELADON_FROGLIGHT = BLOCKS.register("celadon_froglight", ()-> new RotatedPillarBlock(basicProperties("celadon_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        CLOUDY_FROGLIGHT = BLOCKS.register("cloudy_froglight", ()-> new RotatedPillarBlock(basicProperties("cloudy_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        COBALT_FROGLIGHT = BLOCKS.register("cobalt_froglight", ()-> new RotatedPillarBlock(basicProperties("cobalt_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        CRIMSON_FROGLIGHT = BLOCKS.register("crimson_froglight", ()-> new RotatedPillarBlock(basicProperties("crimson_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        FROSTED_FROGLIGHT = BLOCKS.register("frosted_froglight", ()-> new RotatedPillarBlock(basicProperties("frosted_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        MIDNIGHT_FROGLIGHT = BLOCKS.register("midnight_froglight", ()-> new RotatedPillarBlock(basicProperties("midnight_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        MISTY_FROGLIGHT = BLOCKS.register("misty_froglight", ()-> new RotatedPillarBlock(basicProperties("misty_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        SEAFOAM_FROGLIGHT = BLOCKS.register("seafoam_froglight", ()-> new RotatedPillarBlock(basicProperties("seafoam_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        UMBER_FROGLIGHT = BLOCKS.register("umber_froglight", ()-> new RotatedPillarBlock(basicProperties("umber_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        WARM_FROGLIGHT = BLOCKS.register("warm_froglight", ()-> new RotatedPillarBlock(basicProperties("warm_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));
        SKY_FROGLIGHT = BLOCKS.register("sky_froglight", ()-> new RotatedPillarBlock(basicProperties("sky_froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));

        BED = BLOCKS.register("bed", ()-> new RegularBedBlock(basicProperties("bed").mapColor((blockState) -> blockState.getValue(BedBlock.PART) == BedPart.FOOT ? DyeColor.byName("regular", DyeColor.WHITE).getMapColor() : MapColor.WOOL).sound(SoundType.WOOD).strength(0.2F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY)));
        CARPET = BLOCKS.register("carpet", ()-> new CarpetBlock(basicProperties("carpet").mapColor(DyeColor.byName("regular", DyeColor.WHITE)).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
        WOOL = BLOCKS.register("wool", ()-> new Block(basicProperties("wool").mapColor(DyeColor.byName("regular", DyeColor.WHITE)).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
        CONCRETE = BLOCKS.register("concrete", ()-> new Block(basicProperties("concrete").mapColor(DyeColor.byName("regular", DyeColor.WHITE)).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        CONCRETE_POWDER = BLOCKS.register("concrete_powder", ()-> new ConcretePowderBlock(CONCRETE.get(), basicProperties("concrete_powder").mapColor(DyeColor.byName("regular", DyeColor.WHITE)).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
        GLAZED_TERRACOTTA = BLOCKS.register("glazed_terracotta", ()-> new GlazedTerracottaBlock(basicProperties("glazed_terracotta").mapColor(DyeColor.byName("regular", DyeColor.WHITE)).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.4F).pushReaction(PushReaction.PUSH_ONLY)));
        TINTED_GLASS_PANE = BLOCKS.register("tinted_glass_pane", ()-> new IronBarsBlock(basicProperties("tinted_glass_pane").instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion()));
        FROGLIGHT = BLOCKS.register("froglight", ()-> new RotatedPillarBlock(basicProperties("froglight").mapColor(MapColor.SAND).strength(0.3F).lightLevel((blockStatex) -> 15).sound(SoundType.FROGLIGHT)));

        ICICLE = BLOCKS.register("icicle", ()-> new IcicleBlock(basicProperties("icicle").mapColor(MapColor.ICE).friction(0.98F).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GLASS).noOcclusion().randomTicks().strength(0.5F).dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY).isRedstoneConductor(InspireBlocks::never).noOcclusion()));

        OAK_WALL = BLOCKS.register("oak_wall", ()-> new WallBlock(copyProperties("oak_wall", Blocks.OAK_PLANKS).forceSolidOn()));
        SPRUCE_WALL = BLOCKS.register("spruce_wall", ()-> new WallBlock(copyProperties("spruce_wall", Blocks.SPRUCE_PLANKS).forceSolidOn()));
        BIRCH_WALL = BLOCKS.register("birch_wall", ()-> new WallBlock(copyProperties("birch_wall", Blocks.BIRCH_PLANKS).forceSolidOn()));
        JUNGLE_WALL = BLOCKS.register("jungle_wall", ()-> new WallBlock(copyProperties("jungle_wall", Blocks.JUNGLE_PLANKS).forceSolidOn()));
        ACACIA_WALL = BLOCKS.register("acacia_wall", ()-> new WallBlock(copyProperties("acacia_wall", Blocks.ACACIA_PLANKS).forceSolidOn()));
        DARK_OAK_WALL = BLOCKS.register("dark_oak_wall", ()-> new WallBlock(copyProperties("dark_oak_wall", Blocks.DARK_OAK_PLANKS).forceSolidOn()));
        MANGROVE_WALL = BLOCKS.register("mangrove_wall", ()-> new WallBlock(copyProperties("mangrove_wall", Blocks.MANGROVE_PLANKS).forceSolidOn()));
        CHERRY_WALL = BLOCKS.register("cherry_wall", ()-> new WallBlock(copyProperties("cherry_wall", Blocks.CHERRY_PLANKS).forceSolidOn()));
        PALE_OAK_WALL = BLOCKS.register("pale_oak_wall", ()-> new WallBlock(copyProperties("pale_oak_wall", Blocks.DARK_OAK_PLANKS).forceSolidOn()));
        BAMBOO_WALL = BLOCKS.register("bamboo_wall", ()-> new WallBlock(copyProperties("bamboo_wall", Blocks.BAMBOO_PLANKS).forceSolidOn()));
        CRIMSON_WALL = BLOCKS.register("crimson_wall", ()-> new WallBlock(copyProperties("crimson_wall", Blocks.CRIMSON_PLANKS).forceSolidOn()));
        WARPED_WALL = BLOCKS.register("warped_wall", ()-> new WallBlock(copyProperties("warped_wall", Blocks.WARPED_PLANKS).forceSolidOn()));

        CRACKED_RED_NETHER_BRICKS = BLOCKS.register("cracked_red_nether_bricks", ()-> new Block(copyProperties("cracked_red_nether_bricks", Blocks.RED_NETHER_BRICKS)));
        RED_NETHER_BRICK_FENCE = BLOCKS.register("red_nether_brick_fence", ()-> new FenceBlock(copyProperties("red_nether_brick_fence", Blocks.RED_NETHER_BRICKS)));
        RED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("red_nether_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("red_nether_brick_fence_gate", Blocks.RED_NETHER_BRICKS)));
        CHISELED_RED_NETHER_BRICKS = BLOCKS.register("chiseled_red_nether_bricks", ()-> new Block(copyProperties("chiseled_red_nether_bricks", Blocks.RED_NETHER_BRICKS)));
        RED_NETHER_BRICK_PILLAR = BLOCKS.register("red_nether_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("red_nether_brick_pillar", Blocks.RED_NETHER_BRICKS)));
        RED_NETHER_BRICK_DOOR = BLOCKS.register("red_nether_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("red_nether_brick_door", Blocks.RED_NETHER_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        RED_NETHER_BRICK_TRAPDOOR = BLOCKS.register("red_nether_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("red_nether_brick_trapdoor", Blocks.RED_NETHER_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        RED_NETHER_BRICK_BUTTON = BLOCKS.register("red_nether_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("red_nether_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RED_NETHER_BRICK_PRESSURE_PLATE = BLOCKS.register("red_nether_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("red_nether_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RED_NETHER_BRICK_LAMP = BLOCKS.register("red_nether_brick_lamp", ()-> new Block(basicProperties("red_nether_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        RED_NETHER_TILES = BLOCKS.register("red_nether_tiles", ()-> new Block(basicProperties("red_nether_tiles").mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
        CRACKED_RED_NETHER_TILES = BLOCKS.register("cracked_red_nether_tiles", ()-> new Block(copyProperties("cracked_red_nether_tiles", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_STAIRS = BLOCKS.register("red_nether_tile_stairs", ()-> new StairBlock(RED_NETHER_TILES.get().defaultBlockState(), copyProperties("red_nether_tile_stairs", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_SLAB = BLOCKS.register("red_nether_tile_slab", ()-> new SlabBlock(copyProperties("red_nether_tile_slab", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_WALL = BLOCKS.register("red_nether_tile_wall", ()-> new WallBlock(copyProperties("red_nether_tile_wall", RED_NETHER_TILES.get()).forceSolidOn()));
        RED_NETHER_TILE_FENCE = BLOCKS.register("red_nether_tile_fence", ()-> new FenceBlock(copyProperties("red_nether_tile_fence", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_FENCE_GATE = BLOCKS.register("red_nether_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("red_nether_tile_fence_gate", RED_NETHER_TILES.get())));
        CHISELED_RED_NETHER_TILES = BLOCKS.register("chiseled_red_nether_tiles", ()-> new Block(copyProperties("chiseled_red_nether_tiles", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_PILLAR = BLOCKS.register("red_nether_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("red_nether_tile_pillar", RED_NETHER_TILES.get())));
        RED_NETHER_TILE_DOOR = BLOCKS.register("red_nether_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("red_nether_tile_door", RED_NETHER_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        RED_NETHER_TILE_TRAPDOOR = BLOCKS.register("red_nether_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("red_nether_tile_trapdoor", RED_NETHER_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        RED_NETHER_TILE_BUTTON = BLOCKS.register("red_nether_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("red_nether_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RED_NETHER_TILE_PRESSURE_PLATE = BLOCKS.register("red_nether_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("red_nether_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RED_NETHER_TILE_LAMP = BLOCKS.register("red_nether_tile_lamp", ()-> new Block(basicProperties("red_nether_tile_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        //Cyan
        CYAN_NETHER_BRICKS = BLOCKS.register("cyan_nether_bricks", ()-> new Block(basicProperties("cyan_nether_bricks").mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
        CRACKED_CYAN_NETHER_BRICKS = BLOCKS.register("cracked_cyan_nether_bricks", ()-> new Block(copyProperties("cracked_cyan_nether_bricks", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_STAIRS = BLOCKS.register("cyan_nether_brick_stairs", ()-> new StairBlock(CYAN_NETHER_BRICKS.get().defaultBlockState(), copyProperties("cyan_nether_brick_stairs", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_SLAB = BLOCKS.register("cyan_nether_brick_slab", ()-> new SlabBlock(copyProperties("cyan_nether_brick_slab", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_WALL = BLOCKS.register("cyan_nether_brick_wall", ()-> new WallBlock(copyProperties("cyan_nether_brick_wall", CYAN_NETHER_BRICKS.get()).forceSolidOn()));
        CYAN_NETHER_BRICK_FENCE = BLOCKS.register("cyan_nether_brick_fence", ()-> new FenceBlock(copyProperties("cyan_nether_brick_fence", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_FENCE_GATE = BLOCKS.register("cyan_nether_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("cyan_nether_brick_fence_gate", CYAN_NETHER_BRICKS.get())));
        CHISELED_CYAN_NETHER_BRICKS = BLOCKS.register("chiseled_cyan_nether_bricks", ()-> new Block(copyProperties("chiseled_cyan_nether_bricks", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_PILLAR = BLOCKS.register("cyan_nether_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("cyan_nether_brick_pillar", CYAN_NETHER_BRICKS.get())));
        CYAN_NETHER_BRICK_DOOR = BLOCKS.register("cyan_nether_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("cyan_nether_brick_door", CYAN_NETHER_BRICKS.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_BRICK_TRAPDOOR = BLOCKS.register("cyan_nether_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("cyan_nether_brick_trapdoor", CYAN_NETHER_BRICKS.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        CYAN_NETHER_BRICK_BUTTON = BLOCKS.register("cyan_nether_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("cyan_nether_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_BRICK_PRESSURE_PLATE = BLOCKS.register("cyan_nether_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("cyan_nether_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_BRICK_LAMP = BLOCKS.register("cyan_nether_brick_lamp", ()-> new Block(basicProperties("cyan_nether_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        CYAN_NETHER_TILES = BLOCKS.register("cyan_nether_tiles", ()-> new Block(basicProperties("cyan_nether_tiles").mapColor(MapColor.COLOR_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
        CRACKED_CYAN_NETHER_TILES = BLOCKS.register("cracked_cyan_nether_tiles", ()-> new Block(copyProperties("cracked_cyan_nether_tiles", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_STAIRS = BLOCKS.register("cyan_nether_tile_stairs", ()-> new StairBlock(CYAN_NETHER_TILES.get().defaultBlockState(), copyProperties("cyan_nether_tile_stairs", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_SLAB = BLOCKS.register("cyan_nether_tile_slab", ()-> new SlabBlock(copyProperties("cyan_nether_tile_slab", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_WALL = BLOCKS.register("cyan_nether_tile_wall", ()-> new WallBlock(copyProperties("cyan_nether_tile_wall", CYAN_NETHER_TILES.get()).forceSolidOn()));
        CYAN_NETHER_TILE_FENCE = BLOCKS.register("cyan_nether_tile_fence", ()-> new FenceBlock(copyProperties("cyan_nether_tile_fence", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_FENCE_GATE = BLOCKS.register("cyan_nether_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("cyan_nether_tile_fence_gate", CYAN_NETHER_TILES.get())));
        CHISELED_CYAN_NETHER_TILES = BLOCKS.register("chiseled_cyan_nether_tiles", ()-> new Block(copyProperties("chiseled_cyan_nether_tiles", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_PILLAR = BLOCKS.register("cyan_nether_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("cyan_nether_tile_pillar", CYAN_NETHER_TILES.get())));
        CYAN_NETHER_TILE_DOOR = BLOCKS.register("cyan_nether_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("cyan_nether_tile_door", CYAN_NETHER_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_TILE_TRAPDOOR = BLOCKS.register("cyan_nether_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("cyan_nether_tile_trapdoor", CYAN_NETHER_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        CYAN_NETHER_TILE_BUTTON = BLOCKS.register("cyan_nether_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("cyan_nether_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_TILE_PRESSURE_PLATE = BLOCKS.register("cyan_nether_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("cyan_nether_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CYAN_NETHER_TILE_LAMP = BLOCKS.register("cyan_nether_tile_lamp", ()-> new Block(basicProperties("cyan_nether_tile_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        NETHER_BRICK_FENCE_GATE = BLOCKS.register("nether_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("nether_brick_fence_gate", Blocks.NETHER_BRICKS)));
        NETHER_BRICK_PILLAR = BLOCKS.register("nether_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("nether_brick_pillar", Blocks.NETHER_BRICKS)));
        NETHER_BRICK_DOOR = BLOCKS.register("nether_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("nether_brick_door", Blocks.NETHER_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        NETHER_BRICK_TRAPDOOR = BLOCKS.register("nether_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("nether_brick_trapdoor", Blocks.NETHER_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        NETHER_BRICK_BUTTON = BLOCKS.register("nether_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("nether_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHER_BRICK_PRESSURE_PLATE = BLOCKS.register("nether_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("nether_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHER_BRICK_LAMP = BLOCKS.register("nether_brick_lamp", ()-> new Block(basicProperties("nether_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        NETHER_TILES = BLOCKS.register("nether_tiles", ()-> new Block(basicProperties("nether_tiles").mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
        CRACKED_NETHER_TILES = BLOCKS.register("cracked_nether_tiles", ()-> new Block(copyProperties("cracked_nether_tiles", NETHER_TILES.get())));
        NETHER_TILE_STAIRS = BLOCKS.register("nether_tile_stairs", ()-> new StairBlock(NETHER_TILES.get().defaultBlockState(), copyProperties("nether_tile_stairs", NETHER_TILES.get())));
        NETHER_TILE_SLAB = BLOCKS.register("nether_tile_slab", ()-> new SlabBlock(copyProperties("nether_tile_slab", NETHER_TILES.get())));
        NETHER_TILE_WALL = BLOCKS.register("nether_tile_wall", ()-> new WallBlock(copyProperties("nether_tile_wall", NETHER_TILES.get()).forceSolidOn()));
        NETHER_TILE_FENCE = BLOCKS.register("nether_tile_fence", ()-> new FenceBlock(copyProperties("nether_tile_fence", NETHER_TILES.get())));
        NETHER_TILE_FENCE_GATE = BLOCKS.register("nether_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("nether_tile_fence_gate", NETHER_TILES.get())));
        CHISELED_NETHER_TILES = BLOCKS.register("chiseled_nether_tiles", ()-> new Block(copyProperties("chiseled_nether_tiles", NETHER_TILES.get())));
        NETHER_TILE_PILLAR = BLOCKS.register("nether_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("nether_tile_pillar", NETHER_TILES.get())));
        NETHER_TILE_DOOR = BLOCKS.register("nether_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("nether_tile_door", NETHER_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        NETHER_TILE_TRAPDOOR = BLOCKS.register("nether_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("nether_tile_trapdoor", NETHER_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        NETHER_TILE_BUTTON = BLOCKS.register("nether_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("nether_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHER_TILE_PRESSURE_PLATE = BLOCKS.register("nether_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("nether_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHER_TILE_LAMP = BLOCKS.register("nether_tile_lamp", ()-> new Block(basicProperties("nether_tile_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        CRACKED_QUARTZ_BRICKS = BLOCKS.register("cracked_quartz_bricks", ()-> new Block(copyProperties("cracked_quartz_bricks", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_STAIRS = BLOCKS.register("quartz_brick_stairs", ()-> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), copyProperties("quartz_brick_stairs", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_SLAB = BLOCKS.register("quartz_brick_slab", ()-> new SlabBlock(copyProperties("quartz_brick_slab", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_WALL = BLOCKS.register("quartz_brick_wall", ()-> new WallBlock(copyProperties("quartz_brick_wall", Blocks.QUARTZ_BRICKS).forceSolidOn()));
        QUARTZ_BRICK_FENCE = BLOCKS.register("quartz_brick_fence", ()-> new FenceBlock(copyProperties("quartz_brick_fence", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_FENCE_GATE = BLOCKS.register("quartz_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("quartz_brick_fence_gate", Blocks.QUARTZ_BRICKS)));
        CHISELED_QUARTZ_BRICKS = BLOCKS.register("chiseled_quartz_bricks", ()-> new Block(copyProperties("chiseled_quartz_bricks", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_PILLAR = BLOCKS.register("quartz_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("quartz_brick_pillar", Blocks.QUARTZ_BRICKS)));
        QUARTZ_BRICK_DOOR = BLOCKS.register("quartz_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("quartz_brick_door", Blocks.QUARTZ_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        QUARTZ_BRICK_TRAPDOOR = BLOCKS.register("quartz_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("quartz_brick_trapdoor", Blocks.QUARTZ_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        QUARTZ_BRICK_BUTTON = BLOCKS.register("quartz_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("quartz_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_BRICK_PRESSURE_PLATE = BLOCKS.register("quartz_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("quartz_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_BRICK_LAMP = BLOCKS.register("quartz_brick_lamp", ()-> new Block(basicProperties("quartz_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        QUARTZ_TILES = BLOCKS.register("quartz_tiles", ()-> new Block(copyProperties("quartz_tiles", Blocks.QUARTZ_BRICKS)));
        CRACKED_QUARTZ_TILES = BLOCKS.register("cracked_quartz_tiles", ()-> new Block(copyProperties("cracked_quartz_tiles", QUARTZ_TILES.get())));
        QUARTZ_TILE_STAIRS = BLOCKS.register("quartz_tile_stairs", ()-> new StairBlock(QUARTZ_TILES.get().defaultBlockState(), copyProperties("quartz_tile_stairs", QUARTZ_TILES.get())));
        QUARTZ_TILE_SLAB = BLOCKS.register("quartz_tile_slab", ()-> new SlabBlock(copyProperties("quartz_tile_slab", QUARTZ_TILES.get())));
        QUARTZ_TILE_WALL = BLOCKS.register("quartz_tile_wall", ()-> new WallBlock(copyProperties("quartz_tile_wall", QUARTZ_TILES.get()).forceSolidOn()));
        QUARTZ_TILE_FENCE = BLOCKS.register("quartz_tile_fence", ()-> new FenceBlock(copyProperties("quartz_tile_fence", QUARTZ_TILES.get())));
        QUARTZ_TILE_FENCE_GATE = BLOCKS.register("quartz_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("quartz_tile_fence_gate", QUARTZ_TILES.get())));
        CHISELED_QUARTZ_TILES = BLOCKS.register("chiseled_quartz_tiles", ()-> new Block(copyProperties("chiseled_quartz_tiles", QUARTZ_TILES.get())));
        QUARTZ_TILE_PILLAR = BLOCKS.register("quartz_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("quartz_tile_pillar", QUARTZ_TILES.get())));
        QUARTZ_TILE_DOOR = BLOCKS.register("quartz_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("quartz_tile_door", QUARTZ_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        QUARTZ_TILE_TRAPDOOR = BLOCKS.register("quartz_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("quartz_tile_trapdoor", QUARTZ_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        QUARTZ_TILE_BUTTON = BLOCKS.register("quartz_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("quartz_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_TILE_PRESSURE_PLATE = BLOCKS.register("quartz_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("quartz_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_TILE_LAMP = BLOCKS.register("quartz_tile_lamp", ()-> new Block(basicProperties("quartz_tile_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        CRACKED_BRICKS = BLOCKS.register("cracked_bricks", ()-> new Block(copyProperties("cracked_bricks", Blocks.BRICKS)));
        BRICK_FENCE = BLOCKS.register("brick_fence", ()-> new FenceBlock(copyProperties("brick_fence", Blocks.BRICKS)));
        BRICK_FENCE_GATE = BLOCKS.register("brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("brick_fence_gate", Blocks.BRICKS)));
        CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", ()-> new Block(copyProperties("chiseled_bricks", Blocks.BRICKS)));
        BRICK_PILLAR = BLOCKS.register("brick_pillar", ()-> new RotatedPillarBlock(copyProperties("brick_pillar", Blocks.BRICKS)));
        BRICK_DOOR = BLOCKS.register("brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("brick_door", Blocks.BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        BRICK_TRAPDOOR = BLOCKS.register("brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("brick_trapdoor", Blocks.BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        BRICK_BUTTON = BLOCKS.register("brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BRICK_PRESSURE_PLATE = BLOCKS.register("brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BRICK_LAMP = BLOCKS.register("brick_lamp", ()-> new Block(basicProperties("brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        BRICK_TILES = BLOCKS.register("brick_tiles", ()-> new Block(copyProperties("brick_tiles", Blocks.BRICKS)));
        CRACKED_BRICK_TILES = BLOCKS.register("cracked_brick_tiles", ()-> new Block(copyProperties("cracked_brick_tiles", BRICK_TILES.get())));
        BRICK_TILE_STAIRS = BLOCKS.register("brick_tile_stairs", ()-> new StairBlock(BRICK_TILES.get().defaultBlockState(), copyProperties("brick_tile_stairs", BRICK_TILES.get())));
        BRICK_TILE_SLAB = BLOCKS.register("brick_tile_slab", ()-> new SlabBlock(copyProperties("brick_tile_slab", BRICK_TILES.get())));
        BRICK_TILE_WALL = BLOCKS.register("brick_tile_wall", ()-> new WallBlock(copyProperties("brick_tile_wall", BRICK_TILES.get()).forceSolidOn()));
        BRICK_TILE_FENCE = BLOCKS.register("brick_tile_fence", ()-> new FenceBlock(copyProperties("brick_tile_fence", BRICK_TILES.get())));
        BRICK_TILE_FENCE_GATE = BLOCKS.register("brick_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("brick_tile_fence_gate", BRICK_TILES.get())));
        CHISELED_BRICK_TILES = BLOCKS.register("chiseled_brick_tiles", ()-> new Block(copyProperties("chiseled_brick_tiles", BRICK_TILES.get())));
        BRICK_TILE_PILLAR = BLOCKS.register("brick_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("brick_tile_pillar", BRICK_TILES.get())));
        BRICK_TILE_DOOR = BLOCKS.register("brick_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("brick_tile_door", BRICK_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        BRICK_TILE_TRAPDOOR = BLOCKS.register("brick_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("brick_tile_trapdoor", BRICK_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        BRICK_TILE_BUTTON = BLOCKS.register("brick_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("brick_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BRICK_TILE_PRESSURE_PLATE = BLOCKS.register("brick_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("brick_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BRICK_TILE_LAMP = BLOCKS.register("brick_tile_lamp", ()-> new Block(basicProperties("brick_tile_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        CRACKED_MUD_BRICKS = BLOCKS.register("cracked_mud_bricks", ()-> new Block(copyProperties("cracked_mud_bricks", Blocks.MUD_BRICKS)));
        MUD_BRICK_FENCE = BLOCKS.register("mud_brick_fence", ()-> new FenceBlock(copyProperties("mud_brick_fence", Blocks.MUD_BRICKS)));
        MUD_BRICK_FENCE_GATE = BLOCKS.register("mud_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("mud_brick_fence_gate", Blocks.MUD_BRICKS)));
        CHISELED_MUD_BRICKS = BLOCKS.register("chiseled_mud_bricks", ()-> new Block(copyProperties("chiseled_mud_bricks", Blocks.MUD_BRICKS)));
        MUD_BRICK_PILLAR = BLOCKS.register("mud_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("mud_brick_pillar", Blocks.MUD_BRICKS)));
        MUD_BRICK_DOOR = BLOCKS.register("mud_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("mud_brick_door", Blocks.MUD_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        MUD_BRICK_TRAPDOOR = BLOCKS.register("mud_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("mud_brick_trapdoor", Blocks.MUD_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        MUD_BRICK_BUTTON = BLOCKS.register("mud_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("mud_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MUD_BRICK_PRESSURE_PLATE = BLOCKS.register("mud_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("mud_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MUD_BRICK_LAMP = BLOCKS.register("mud_brick_lamp", ()-> new Block(basicProperties("mud_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        MUD_TILES = BLOCKS.register("mud_brick_tiles", ()-> new Block(copyProperties("mud_brick_tiles", Blocks.MUD_BRICKS)));
        CRACKED_MUD_TILES = BLOCKS.register("cracked_mud_brick_tiles", ()-> new Block(copyProperties("cracked_mud_brick_tiles", MUD_TILES.get())));
        MUD_TILE_STAIRS = BLOCKS.register("mud_brick_tile_stairs", ()-> new StairBlock(MUD_TILES.get().defaultBlockState(), copyProperties("mud_brick_tile_stairs", MUD_TILES.get())));
        MUD_TILE_SLAB = BLOCKS.register("mud_brick_tile_slab", ()-> new SlabBlock(copyProperties("mud_brick_tile_slab", MUD_TILES.get())));
        MUD_TILE_WALL = BLOCKS.register("mud_brick_tile_wall", ()-> new WallBlock(copyProperties("mud_brick_tile_wall", MUD_TILES.get()).forceSolidOn()));
        MUD_TILE_FENCE = BLOCKS.register("mud_brick_tile_fence", ()-> new FenceBlock(copyProperties("mud_brick_tile_fence", MUD_TILES.get())));
        MUD_TILE_FENCE_GATE = BLOCKS.register("mud_brick_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("mud_brick_tile_fence_gate", MUD_TILES.get())));
        CHISELED_MUD_TILES = BLOCKS.register("chiseled_mud_brick_tiles", ()-> new Block(copyProperties("chiseled_mud_brick_tiles", MUD_TILES.get())));
        MUD_TILE_PILLAR = BLOCKS.register("mud_brick_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("mud_brick_tile_pillar", MUD_TILES.get())));
        MUD_TILE_DOOR = BLOCKS.register("mud_brick_tile_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("mud_brick_tile_door", MUD_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        MUD_TILE_TRAPDOOR = BLOCKS.register("mud_brick_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("mud_brick_tile_trapdoor", MUD_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        MUD_TILE_BUTTON = BLOCKS.register("mud_brick_tile_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("mud_brick_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MUD_TILE_PRESSURE_PLATE = BLOCKS.register("mud_brick_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("mud_brick_tile_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MUD_TILE_LAMP = BLOCKS.register("mud_brick_tile_lamp", ()-> new Block(basicProperties("mud_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        PRISMARINE_BRICK_WALL = BLOCKS.register("prismarine_brick_wall", () -> new WallBlock(copyProperties("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS).forceSolidOn()));
        CRACKED_PRISMARINE_BRICKS = BLOCKS.register("cracked_prismarine_bricks", () -> new Block(copyProperties("cracked_prismarine_bricks",  Blocks.PRISMARINE_BRICKS)));
        PRISMARINE_BRICK_FENCE = BLOCKS.register("prismarine_brick_fence", () -> new FenceBlock(copyProperties("prismarine_brick_fence",  Blocks.PRISMARINE_BRICKS)));
        PRISMARINE_BRICK_FENCE_GATE = BLOCKS.register("prismarine_brick_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("prismarine_brick_fence_gate",  Blocks.PRISMARINE_BRICKS)));
        CHISELED_PRISMARINE_BRICKS = BLOCKS.register("chiseled_prismarine_bricks", () -> new Block(copyProperties("chiseled_prismarine_bricks",  Blocks.PRISMARINE_BRICKS)));
        PRISMARINE_BRICK_PILLAR = BLOCKS.register("prismarine_brick_pillar", () -> new RotatedPillarBlock(copyProperties("prismarine_brick_pillar",  Blocks.PRISMARINE_BRICKS)));
        PRISMARINE_BRICK_DOOR = BLOCKS.register("prismarine_brick_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("prismarine_brick_door",  Blocks.PRISMARINE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        PRISMARINE_BRICK_TRAPDOOR = BLOCKS.register("prismarine_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("prismarine_brick_trapdoor",  Blocks.PRISMARINE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        PRISMARINE_BRICK_BUTTON = BLOCKS.register("prismarine_brick_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("prismarine_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        PRISMARINE_BRICK_PRESSURE_PLATE = BLOCKS.register("prismarine_brick_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("prismarine_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));

        PRISMARINE_TILES = BLOCKS.register("prismarine_tiles", () -> new Block(copyProperties("prismarine_tiles", Blocks.PRISMARINE_BRICKS)));
        CRACKED_PRISMARINE_TILES = BLOCKS.register("cracked_prismarine_tiles", () -> new Block(copyProperties("cracked_prismarine_tiles", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_STAIRS = BLOCKS.register("prismarine_tile_stairs", () -> new StairBlock(PRISMARINE_TILES.get().defaultBlockState(), copyProperties("prismarine_tile_stairs", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_SLAB = BLOCKS.register("prismarine_tile_slab",() -> new SlabBlock(copyProperties("prismarine_tile_slab", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_WALL = BLOCKS.register("prismarine_tile_wall",() -> new WallBlock(copyProperties("prismarine_tile_wall", PRISMARINE_TILES.get()).forceSolidOn()));
        PRISMARINE_TILE_FENCE = BLOCKS.register("prismarine_tile_fence",() -> new FenceBlock(copyProperties("prismarine_tile_fence", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_FENCE_GATE = BLOCKS.register("prismarine_tile_fence_gate",() -> new FenceGateBlock(WoodType.ACACIA, copyProperties("prismarine_tile_fence_gate", PRISMARINE_TILES.get())));
        CHISELED_PRISMARINE_TILES = BLOCKS.register("chiseled_prismarine_tiles",() -> new Block(copyProperties("chiseled_prismarine_tiles", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_PILLAR = BLOCKS.register("prismarine_tile_pillar",() -> new RotatedPillarBlock(copyProperties("prismarine_tile_pillar", PRISMARINE_TILES.get())));
        PRISMARINE_TILE_DOOR = BLOCKS.register("prismarine_tile_door",() -> new DoorBlock(BlockSetType.STONE, copyProperties("prismarine_tile_door", PRISMARINE_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        PRISMARINE_TILE_TRAPDOOR = BLOCKS.register("prismarine_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("prismarine_tile_trapdoor", PRISMARINE_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        PRISMARINE_TILE_BUTTON = BLOCKS.register("prismarine_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("prismarine_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        PRISMARINE_TILE_PRESSURE_PLATE = BLOCKS.register("prismarine_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("prismarine_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        PRISMARINE_TILE_SEA_LANTERN = BLOCKS.register("prismarine_tile_sea_lantern", () -> new Block(basicProperties("prismarine_tile_sea_lantern") .strength(0.3F) .sound(SoundType.GLASS) .lightLevel(s -> 15)));

        CRACKED_END_STONE_BRICKS = BLOCKS.register("cracked_end_stone_bricks", () -> new Block(copyProperties("cracked_end_stone_bricks", Blocks.END_STONE_BRICKS)));
        END_STONE_BRICK_FENCE = BLOCKS.register("end_stone_brick_fence", () -> new FenceBlock(copyProperties("end_stone_brick_fence", Blocks.END_STONE_BRICKS)));
        END_STONE_BRICK_FENCE_GATE = BLOCKS.register("end_stone_brick_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("end_stone_brick_fence_gate", Blocks.END_STONE_BRICKS)));
        CHISELED_END_STONE_BRICKS = BLOCKS.register("chiseled_end_stone_bricks", () -> new Block(copyProperties("chiseled_end_stone_bricks", Blocks.END_STONE_BRICKS)));
        END_STONE_BRICK_PILLAR = BLOCKS.register("end_stone_brick_pillar", () -> new RotatedPillarBlock(copyProperties("end_stone_brick_pillar", Blocks.END_STONE_BRICKS)));
        END_STONE_BRICK_DOOR = BLOCKS.register("end_stone_brick_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("end_stone_brick_door", Blocks.END_STONE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        END_STONE_BRICK_TRAPDOOR = BLOCKS.register("end_stone_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("end_stone_brick_trapdoor", Blocks.END_STONE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        END_STONE_BRICK_BUTTON = BLOCKS.register("end_stone_brick_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("end_stone_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        END_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("end_stone_brick_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("end_stone_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        END_STONE_BRICK_LAMP = BLOCKS.register("end_stone_brick_lamp", () -> new Block(basicProperties("end_stone_brick_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        END_STONE_TILES = BLOCKS.register("end_stone_tiles", () -> new Block(copyProperties("end_stone_tiles", Blocks.END_STONE_BRICKS)));
        CRACKED_END_STONE_TILES = BLOCKS.register("cracked_end_stone_tiles", () -> new Block(copyProperties("cracked_end_stone_tiles", END_STONE_TILES.get())));
        END_STONE_TILE_STAIRS = BLOCKS.register("end_stone_tile_stairs", () -> new StairBlock(END_STONE_TILES.get().defaultBlockState(), copyProperties("end_stone_tile_stairs", END_STONE_TILES.get())));
        END_STONE_TILE_SLAB = BLOCKS.register("end_stone_tile_slab", () -> new SlabBlock(copyProperties("end_stone_tile_slab", END_STONE_TILES.get())));
        END_STONE_TILE_WALL = BLOCKS.register("end_stone_tile_wall", () -> new WallBlock(copyProperties("end_stone_tile_wall", END_STONE_TILES.get()).forceSolidOn()));
        END_STONE_TILE_FENCE = BLOCKS.register("end_stone_tile_fence", () -> new FenceBlock(copyProperties("end_stone_tile_fence", END_STONE_TILES.get())));
        END_STONE_TILE_FENCE_GATE = BLOCKS.register("end_stone_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("end_stone_tile_fence_gate", END_STONE_TILES.get())));
        CHISELED_END_STONE_TILES = BLOCKS.register("chiseled_end_stone_tiles", () -> new Block(copyProperties("chiseled_end_stone_tiles", END_STONE_TILES.get())));
        END_STONE_TILE_PILLAR = BLOCKS.register("end_stone_tile_pillar", () -> new RotatedPillarBlock(copyProperties("end_stone_tile_pillar", END_STONE_TILES.get())));
        END_STONE_TILE_DOOR = BLOCKS.register("end_stone_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("end_stone_tile_door", END_STONE_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        END_STONE_TILE_TRAPDOOR = BLOCKS.register("end_stone_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("end_stone_tile_trapdoor", END_STONE_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        END_STONE_TILE_BUTTON = BLOCKS.register("end_stone_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("end_stone_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        END_STONE_TILE_PRESSURE_PLATE = BLOCKS.register("end_stone_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("end_stone_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        END_STONE_TILE_LAMP = BLOCKS.register("end_stone_tile_lamp", () -> new Block(basicProperties("end_stone_tile_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_PURPUR = BLOCKS.register("cracked_purpur", () -> new Block(copyProperties("cracked_purpur", Blocks.PURPUR_BLOCK)));
        PURPUR_WALL = BLOCKS.register("purpur_wall", () -> new WallBlock(copyProperties("purpur_wall", Blocks.PURPUR_BLOCK).forceSolidOn()));
        PURPUR_FENCE = BLOCKS.register("purpur_fence", () -> new FenceBlock(copyProperties("purpur_fence", Blocks.PURPUR_BLOCK)));
        PURPUR_FENCE_GATE = BLOCKS.register("purpur_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("purpur_fence_gate", Blocks.PURPUR_BLOCK)));
        CHISELED_PURPUR = BLOCKS.register("chiseled_purpur", () -> new Block(copyProperties("chiseled_purpur", Blocks.PURPUR_BLOCK)));
        PURPUR_DOOR = BLOCKS.register("purpur_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("purpur_door", Blocks.PURPUR_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        PURPUR_TRAPDOOR = BLOCKS.register("purpur_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("purpur_trapdoor", Blocks.PURPUR_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        PURPUR_BUTTON = BLOCKS.register("purpur_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("purpur_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        PURPUR_PRESSURE_PLATE = BLOCKS.register("purpur_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("purpur_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        PURPUR_LAMP = BLOCKS.register("purpur_lamp", () -> new Block(basicProperties("purpur_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        STONE_BRICK_FENCE = BLOCKS.register("stone_brick_fence", () -> new FenceBlock(copyProperties("stone_brick_fence", Blocks.STONE_BRICKS)));
        STONE_BRICK_FENCE_GATE = BLOCKS.register("stone_brick_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("stone_brick_fence_gate", Blocks.STONE_BRICKS)));
        STONE_BRICK_PILLAR = BLOCKS.register("stone_brick_pillar", () -> new RotatedPillarBlock(copyProperties("stone_brick_pillar", Blocks.STONE_BRICKS)));
        STONE_BRICK_DOOR = BLOCKS.register("stone_brick_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("stone_brick_door", Blocks.STONE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        STONE_BRICK_TRAPDOOR = BLOCKS.register("stone_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("stone_brick_trapdoor", Blocks.STONE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        STONE_BRICK_BUTTON = BLOCKS.register("stone_brick_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("stone_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("stone_brick_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("stone_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        STONE_BRICK_LAMP = BLOCKS.register("stone_brick_lamp", () -> new Block(basicProperties("stone_brick_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_DEEPSLATE = BLOCKS.register("cracked_polished_deepslate", () -> new Block(copyProperties("cracked_polished_deepslate", Blocks.POLISHED_DEEPSLATE)));
        POLISHED_DEEPSLATE_FENCE = BLOCKS.register("polished_deepslate_fence", () -> new FenceBlock(copyProperties("polished_deepslate_fence", Blocks.POLISHED_DEEPSLATE)));
        POLISHED_DEEPSLATE_FENCE_GATE = BLOCKS.register("polished_deepslate_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_deepslate_fence_gate", Blocks.POLISHED_DEEPSLATE)));
        POLISHED_DEEPSLATE_PILLAR = BLOCKS.register("polished_deepslate_pillar", () -> new RotatedPillarBlock(copyProperties("polished_deepslate_pillar", Blocks.POLISHED_DEEPSLATE)));
        CHISELED_POLISHED_DEEPSLATE = BLOCKS.register("chiseled_polished_deepslate", () -> new Block(copyProperties("chiseled_polished_deepslate", Blocks.POLISHED_DEEPSLATE)));
        POLISHED_DEEPSLATE_DOOR = BLOCKS.register("polished_deepslate_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("polished_deepslate_door", Blocks.POLISHED_DEEPSLATE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("polished_deepslate_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_deepslate_trapdoor", Blocks.POLISHED_DEEPSLATE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_DEEPSLATE_BUTTON = BLOCKS.register("polished_deepslate_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_deepslate_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_PRESSURE_PLATE = BLOCKS.register("polished_deepslate_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_deepslate_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_LAMP = BLOCKS.register("polished_deepslate_lamp", () -> new Block(basicProperties("polished_deepslate_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        DEEPSLATE_BRICK_FENCE = BLOCKS.register("deepslate_brick_fence", () -> new FenceBlock(copyProperties("deepslate_brick_fence", Blocks.DEEPSLATE_BRICKS)));
        DEEPSLATE_BRICK_FENCE_GATE = BLOCKS.register("deepslate_brick_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("deepslate_brick_fence_gate", Blocks.DEEPSLATE_BRICKS)));
        DEEPSLATE_BRICK_PILLAR = BLOCKS.register("deepslate_brick_pillar", () -> new RotatedPillarBlock(copyProperties("deepslate_brick_pillar", Blocks.DEEPSLATE_BRICKS)));
        CHISELED_DEEPSLATE_BRICKS = BLOCKS.register("chiseled_deepslate_bricks", () -> new Block(copyProperties("chiseled_deepslate_bricks", Blocks.DEEPSLATE_BRICKS)));
        DEEPSLATE_BRICK_DOOR = BLOCKS.register("deepslate_brick_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("deepslate_brick_door", Blocks.DEEPSLATE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_BRICK_TRAPDOOR = BLOCKS.register("deepslate_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("deepslate_brick_trapdoor", Blocks.DEEPSLATE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        DEEPSLATE_BRICK_BUTTON = BLOCKS.register("deepslate_brick_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("deepslate_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_BRICK_PRESSURE_PLATE = BLOCKS.register("deepslate_brick_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("deepslate_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_BRICK_LAMP = BLOCKS.register("deepslate_brick_lamp", () -> new Block(basicProperties("deepslate_brick_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        DEEPSLATE_TILE_FENCE = BLOCKS.register("deepslate_tile_fence", () -> new FenceBlock(copyProperties("deepslate_tile_fence", Blocks.DEEPSLATE_TILES)));
        DEEPSLATE_TILE_FENCE_GATE = BLOCKS.register("deepslate_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("deepslate_tile_fence_gate", Blocks.DEEPSLATE_TILES)));
        CHISELED_DEEPSLATE_TILES = BLOCKS.register("chiseled_deepslate_tiles", () -> new Block(copyProperties("chiseled_deepslate_tiles", Blocks.DEEPSLATE_TILES)));
        DEEPSLATE_TILE_PILLAR = BLOCKS.register("deepslate_tile_pillar", () -> new RotatedPillarBlock(copyProperties("deepslate_tile_pillar", Blocks.DEEPSLATE_TILES)));
        DEEPSLATE_TILE_DOOR = BLOCKS.register("deepslate_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("deepslate_tile_door", Blocks.DEEPSLATE_TILES).noOcclusion().pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_TILE_TRAPDOOR = BLOCKS.register("deepslate_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("deepslate_tile_trapdoor", Blocks.DEEPSLATE_TILES).noOcclusion().isValidSpawn(InspireBlocks::never)));
        DEEPSLATE_TILE_BUTTON = BLOCKS.register("deepslate_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("deepslate_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_TILE_PRESSURE_PLATE = BLOCKS.register("deepslate_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("deepslate_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DEEPSLATE_TILE_LAMP = BLOCKS.register("deepslate_tile_lamp", () -> new Block(basicProperties("deepslate_tile_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_MOSSY_STONE_BRICK = BLOCKS.register("cracked_mossy_stone_brick", () -> new Block(copyProperties("cracked_mossy_stone_brick", Blocks.MOSSY_STONE_BRICKS)));
        MOSSY_STONE_BRICK_FENCE = BLOCKS.register("mossy_stone_brick_fence", () -> new FenceBlock(copyProperties("mossy_stone_brick_fence", Blocks.MOSSY_STONE_BRICKS)));
        MOSSY_STONE_BRICK_FENCE_GATE = BLOCKS.register("mossy_stone_brick_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("mossy_stone_brick_fence_gate", Blocks.MOSSY_STONE_BRICKS)));
        MOSSY_STONE_BRICK_PILLAR = BLOCKS.register("mossy_stone_brick_pillar", () -> new RotatedPillarBlock(copyProperties("mossy_stone_brick_pillar", Blocks.MOSSY_STONE_BRICKS)));
        CHISELED_MOSSY_STONE_BRICKS = BLOCKS.register("chiseled_mossy_stone_bricks", () -> new Block(copyProperties("chiseled_mossy_stone_bricks", Blocks.MOSSY_STONE_BRICKS)));
        MOSSY_STONE_BRICK_DOOR = BLOCKS.register("mossy_stone_brick_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("mossy_stone_brick_door", Blocks.MOSSY_STONE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_BRICK_TRAPDOOR = BLOCKS.register("mossy_stone_brick_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("mossy_stone_brick_trapdoor", Blocks.MOSSY_STONE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        MOSSY_STONE_BRICK_BUTTON = BLOCKS.register("mossy_stone_brick_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("mossy_stone_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_BRICK_PRESSURE_PLATE = BLOCKS.register("mossy_stone_brick_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("mossy_stone_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_BRICK_LAMP = BLOCKS.register("mossy_stone_brick_lamp", () -> new Block(basicProperties("mossy_stone_brick_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        MOSSY_STONE_TILES = BLOCKS.register("mossy_stone_tiles", () -> new Block(copyProperties("mossy_stone_tiles", Blocks.MOSSY_STONE_BRICKS)));
        CRACKED_MOSSY_STONE_TILES = BLOCKS.register("cracked_mossy_stone_tiles", () -> new Block(copyProperties("cracked_mossy_stone_tiles", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_STAIRS = BLOCKS.register("mossy_stone_tile_stairs", () -> new StairBlock(MOSSY_STONE_TILES.get().defaultBlockState(), copyProperties("mossy_stone_tile_stairs", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_SLAB = BLOCKS.register("mossy_stone_tile_slab", () -> new SlabBlock(copyProperties("mossy_stone_tile_slab", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_WALL = BLOCKS.register("mossy_stone_tile_wall", () -> new WallBlock(copyProperties("mossy_stone_tile_wall", MOSSY_STONE_TILES.get()).forceSolidOn()));
        MOSSY_STONE_TILE_FENCE = BLOCKS.register("mossy_stone_tile_fence", () -> new FenceBlock(copyProperties("mossy_stone_tile_fence", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_FENCE_GATE = BLOCKS.register("mossy_stone_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("mossy_stone_tile_fence_gate", MOSSY_STONE_TILES.get())));
        CHISELED_MOSSY_STONE_TILES = BLOCKS.register("chiseled_mossy_stone_tiles", () -> new Block(copyProperties("chiseled_mossy_stone_tiles", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_PILLAR = BLOCKS.register("mossy_stone_tile_pillar", () -> new RotatedPillarBlock(copyProperties("mossy_stone_tile_pillar", MOSSY_STONE_TILES.get())));
        MOSSY_STONE_TILE_DOOR = BLOCKS.register("mossy_stone_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("mossy_stone_tile_door", MOSSY_STONE_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_TILE_TRAPDOOR = BLOCKS.register("mossy_stone_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("mossy_stone_tile_trapdoor", MOSSY_STONE_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        MOSSY_STONE_TILE_BUTTON = BLOCKS.register("mossy_stone_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("mossy_stone_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_TILE_PRESSURE_PLATE = BLOCKS.register("mossy_stone_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("mossy_stone_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        MOSSY_STONE_TILE_LAMP = BLOCKS.register("mossy_stone_tile_lamp", () -> new Block(basicProperties("mossy_stone_tile_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        DARK_PRISMARINE_WALL = BLOCKS.register("dark_prismarine_wall", () -> new WallBlock(copyProperties("dark_prismarine_wall", Blocks.DARK_PRISMARINE).forceSolidOn()));
        CRACKED_DARK_PRISMARINE = BLOCKS.register("cracked_dark_prismarine", () -> new Block(copyProperties("cracked_dark_prismarine", Blocks.DARK_PRISMARINE)));
        DARK_PRISMARINE_FENCE = BLOCKS.register("dark_prismarine_fence", () -> new FenceBlock(copyProperties("dark_prismarine_fence", Blocks.DARK_PRISMARINE)));
        DARK_PRISMARINE_FENCE_GATE = BLOCKS.register("dark_prismarine_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("dark_prismarine_fence_gate", Blocks.DARK_PRISMARINE)));
        CHISELED_DARK_PRISMARINE = BLOCKS.register("chiseled_dark_prismarine", () -> new Block(copyProperties("chiseled_dark_prismarine", Blocks.DARK_PRISMARINE)));
        DARK_PRISMARINE_PILLAR = BLOCKS.register("dark_prismarine_pillar", () -> new RotatedPillarBlock(copyProperties("dark_prismarine_pillar", Blocks.DARK_PRISMARINE)));
        DARK_PRISMARINE_DOOR = BLOCKS.register("dark_prismarine_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("dark_prismarine_door", Blocks.DARK_PRISMARINE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        DARK_PRISMARINE_TRAPDOOR = BLOCKS.register("dark_prismarine_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("dark_prismarine_trapdoor", Blocks.DARK_PRISMARINE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        DARK_PRISMARINE_BUTTON = BLOCKS.register("dark_prismarine_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("dark_prismarine_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DARK_PRISMARINE_PRESSURE_PLATE = BLOCKS.register("dark_prismarine_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("dark_prismarine_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DARK_PRISMARINE_LAMP = BLOCKS.register("dark_prismarine_lamp", () -> new Block(basicProperties("dark_prismarine_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        STONE_TILES = BLOCKS.register("stone_tiles", () -> new Block(copyProperties("stone_tiles", Blocks.STONE_BRICKS)));
        CRACKED_STONE_TILES = BLOCKS.register("cracked_stone_tiles", () -> new Block(copyProperties("cracked_stone_tiles", STONE_TILES.get())));
        STONE_TILE_STAIRS = BLOCKS.register("stone_tile_stairs", () -> new StairBlock(STONE_TILES.get().defaultBlockState(), copyProperties("stone_tile_stairs", STONE_TILES.get())));
        STONE_TILE_SLAB = BLOCKS.register("stone_tile_slab", () -> new SlabBlock(copyProperties("stone_tile_slab", STONE_TILES.get())));
        STONE_TILE_WALL = BLOCKS.register("stone_tile_wall", () -> new WallBlock(copyProperties("stone_tile_wall", STONE_TILES.get()).forceSolidOn()));
        STONE_TILE_FENCE = BLOCKS.register("stone_tile_fence", () -> new FenceBlock(copyProperties("stone_tile_fence", STONE_TILES.get())));
        STONE_TILE_FENCE_GATE = BLOCKS.register("stone_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("stone_tile_fence_gate", STONE_TILES.get())));
        CHISELED_STONE_TILES = BLOCKS.register("chiseled_stone_tiles", () -> new Block(copyProperties("chiseled_stone_tiles", STONE_TILES.get())));
        STONE_TILE_PILLAR = BLOCKS.register("stone_tile_pillar", () -> new RotatedPillarBlock(copyProperties("stone_tile_pillar", STONE_TILES.get())));
        STONE_TILE_DOOR = BLOCKS.register("stone_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("stone_tile_door", STONE_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        STONE_TILE_TRAPDOOR = BLOCKS.register("stone_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("stone_tile_trapdoor", STONE_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        STONE_TILE_BUTTON = BLOCKS.register("stone_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("stone_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        STONE_TILE_PRESSURE_PLATE = BLOCKS.register("stone_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("stone_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        STONE_TILE_LAMP = BLOCKS.register("stone_tile_lamp", () -> new Block(basicProperties("stone_tile_lamp") .strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_DEEPSLATE_TILES = BLOCKS.register("polished_deepslate_tiles", () -> new Block(copyProperties("polished_deepslate_tiles", Blocks.POLISHED_DEEPSLATE)));
        CRACKED_POLISHED_DEEPSLATE_TILES = BLOCKS.register("cracked_polished_deepslate_tiles", () -> new Block(copyProperties("cracked_polished_deepslate_tiles", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_STAIRS = BLOCKS.register("polished_deepslate_tile_stairs", () -> new StairBlock(POLISHED_DEEPSLATE_TILES.get().defaultBlockState(), copyProperties("polished_deepslate_tile_stairs", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_SLAB = BLOCKS.register("polished_deepslate_tile_slab", () -> new SlabBlock(copyProperties("polished_deepslate_tile_slab", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_WALL = BLOCKS.register("polished_deepslate_tile_wall", () -> new WallBlock(copyProperties("polished_deepslate_tile_wall", POLISHED_DEEPSLATE_TILES.get()).forceSolidOn()));
        POLISHED_DEEPSLATE_TILE_FENCE = BLOCKS.register("polished_deepslate_tile_fence", () -> new FenceBlock(copyProperties("polished_deepslate_tile_fence", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_FENCE_GATE = BLOCKS.register("polished_deepslate_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_deepslate_tile_fence_gate", POLISHED_DEEPSLATE_TILES.get())));
        CHISELED_POLISHED_DEEPSLATE_TILES = BLOCKS.register("chiseled_polished_deepslate_tiles", () -> new Block(copyProperties("chiseled_polished_deepslate_tiles", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_PILLAR = BLOCKS.register("polished_deepslate_tile_pillar", () -> new RotatedPillarBlock(copyProperties("polished_deepslate_tile_pillar", POLISHED_DEEPSLATE_TILES.get())));
        POLISHED_DEEPSLATE_TILE_DOOR = BLOCKS.register("polished_deepslate_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("polished_deepslate_tile_door", POLISHED_DEEPSLATE_TILES.get()) .noOcclusion() .pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_TILE_TRAPDOOR = BLOCKS.register("polished_deepslate_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_deepslate_tile_trapdoor", POLISHED_DEEPSLATE_TILES.get()) .noOcclusion() .isValidSpawn(InspireBlocks::never)));
        POLISHED_DEEPSLATE_TILE_BUTTON = BLOCKS.register("polished_deepslate_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_deepslate_tile_button")  .strength(0.5F) .pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE = BLOCKS.register("polished_deepslate_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_deepslate_tile_pressure_plate") .forceSolidOn()  .strength(0.5F) .pushReaction(PushReaction.DESTROY)));
        POLISHED_DEEPSLATE_TILE_LAMP = BLOCKS.register("polished_deepslate_tile_lamp", () -> new Block(basicProperties("polished_deepslate_tile_lamp") .strength(0.3F) .sound(SoundType.GLASS) .lightLevel(s -> 15)));

        PURPUR_TILES = BLOCKS.register("purpur_tiles", () -> new Block(copyProperties("purpur_tiles", Blocks.PURPUR_BLOCK)));
        CRACKED_PURPUR_TILES = BLOCKS.register("cracked_purpur_tiles", () -> new Block(copyProperties("cracked_purpur_tiles", PURPUR_TILES.get())));
        PURPUR_TILE_STAIRS = BLOCKS.register("purpur_tile_stairs", () -> new StairBlock(PURPUR_TILES.get().defaultBlockState(), copyProperties("purpur_tile_stairs", PURPUR_TILES.get())));
        PURPUR_TILE_SLAB = BLOCKS.register("purpur_tile_slab", () -> new SlabBlock(copyProperties("purpur_tile_slab", PURPUR_TILES.get())));
        PURPUR_TILE_WALL = BLOCKS.register("purpur_tile_wall", () -> new WallBlock(copyProperties("purpur_tile_wall", PURPUR_TILES.get()).forceSolidOn()));
        PURPUR_TILE_FENCE = BLOCKS.register("purpur_tile_fence", () -> new FenceBlock(copyProperties("purpur_tile_fence", PURPUR_TILES.get())));
        PURPUR_TILE_FENCE_GATE = BLOCKS.register("purpur_tile_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA, copyProperties("purpur_tile_fence_gate", PURPUR_TILES.get())));
        CHISELED_PURPUR_TILES = BLOCKS.register("chiseled_purpur_tiles", () -> new Block(copyProperties("chiseled_purpur_tiles", PURPUR_TILES.get())));
        PURPUR_TILE_PILLAR = BLOCKS.register("purpur_tile_pillar", () -> new RotatedPillarBlock(copyProperties("purpur_tile_pillar", PURPUR_TILES.get())));
        PURPUR_TILE_DOOR = BLOCKS.register("purpur_tile_door", () -> new DoorBlock(BlockSetType.STONE, copyProperties("purpur_tile_door", PURPUR_TILES.get()) .noOcclusion() .pushReaction(PushReaction.DESTROY)));
        PURPUR_TILE_TRAPDOOR = BLOCKS.register("purpur_tile_trapdoor", () -> new TrapDoorBlock(BlockSetType.STONE, copyProperties("purpur_tile_trapdoor", PURPUR_TILES.get()) .noOcclusion() .isValidSpawn(InspireBlocks::never)));
        PURPUR_TILE_BUTTON = BLOCKS.register("purpur_tile_button", () -> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("purpur_tile_button")  .strength(0.5F) .pushReaction(PushReaction.DESTROY)));
        PURPUR_TILE_PRESSURE_PLATE = BLOCKS.register("purpur_tile_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, basicProperties("purpur_tile_pressure_plate") .forceSolidOn()  .strength(0.5F) .pushReaction(PushReaction.DESTROY)));
        PURPUR_TILE_LAMP = BLOCKS.register("purpur_tile_lamp", () -> new Block(basicProperties("purpur_tile_lamp") .strength(0.3F) .sound(SoundType.GLASS) .lightLevel(s -> 15)));

        /*
        POLISHED_RED_NETHER_BRICKS = BLOCKS.register("polished_red_nether_bricks", ()-> new Block(copyProperties("polished_red_nether_bricks", Blocks.RED_NETHER_BRICKS)));
        CRACKED_POLISHED_RED_NETHER_BRICKS = BLOCKS.register("cracked_polished_red_nether_bricks", ()-> new Block(copyProperties("cracked_polished_red_nether_bricks", POLISHED_RED_NETHER_BRICKS.get())));
        POLISHED_RED_NETHER_BRICK_STAIRS = BLOCKS.register("polished_red_nether_brick_stairs", ()-> new StairBlock(POLISHED_RED_NETHER_BRICKS.get().defaultBlockState(), copyProperties("polished_red_nether_brick_stairs", Blocks.RED_NETHER_BRICKS)));
        POLISHED_RED_NETHER_BRICK_SLAB = BLOCKS.register("polished_red_nether_brick_slab", ()-> new SlabBlock(copyProperties("polished_red_nether_brick_slab", POLISHED_RED_NETHER_BRICKS.get())));
        POLISHED_RED_NETHER_BRICK_WALL = BLOCKS.register("polished_red_nether_brick_wall", ()-> new WallBlock(copyProperties("polished_red_nether_brick_wall", POLISHED_RED_NETHER_BRICKS.get()).forceSolidOn()));
        POLISHED_RED_NETHER_BRICK_FENCE = BLOCKS.register("polished_red_nether_brick_fence", ()-> new FenceBlock(copyProperties("polished_red_nether_brick_fence", POLISHED_RED_NETHER_BRICKS.get())));
        POLISHED_RED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("polished_red_nether_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_red_nether_brick_fence_gate", POLISHED_RED_NETHER_BRICKS.get())));
        CHISELED_POLISHED_RED_NETHER_BRICK = BLOCKS.register("chiseled_polished_red_nether_bricks", ()-> new Block(copyProperties("chiseled_polished_red_nether_bricks", POLISHED_RED_NETHER_BRICKS.get())));
        POLISHED_RED_NETHER_BRICK_PILLAR = BLOCKS.register("polished_red_nether_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_red_nether_brick_pillar", POLISHED_RED_NETHER_BRICKS.get())));
        POLISHED_RED_NETHER_BRICK_DOOR = BLOCKS.register("polished_red_nether_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_red_nether_brick_door", POLISHED_RED_NETHER_BRICKS.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_RED_NETHER_BRICK_TRAPDOOR = BLOCKS.register("polished_red_nether_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_red_nether_brick_trapdoor", POLISHED_RED_NETHER_BRICKS.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_RED_NETHER_BRICK_BUTTON = BLOCKS.register("polished_red_nether_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("polished_red_nether_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE = BLOCKS.register("polished_red_nether_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("polished_red_nether_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_RED_NETHER_BRICK_LAMP = BLOCKS.register("polished_red_nether_brick_lamp", ()-> new Block(basicProperties("polished_red_nether_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));

        POLISHED_CYAN_NETHER_BRICKS = BLOCKS.register("polished_cyan_nether_bricks", ()-> new Block(copyProperties("polished_cyan_nether_bricks", CYAN_NETHER_BRICKS.get())));
        CRACKED_POLISHED_CYAN_NETHER_BRICKS = BLOCKS.register("cracked_polished_cyan_nether_bricks", ()-> new Block(copyProperties("cracked_polished_cyan_nether_bricks", POLISHED_CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_STAIRS = BLOCKS.register("polished_cyan_nether_brick_stairs", ()-> new StairBlock(POLISHED_CYAN_NETHER_BRICKS.get().defaultBlockState(), copyProperties("polished_cyan_nether_brick_stairs", CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_SLAB = BLOCKS.register("polished_cyan_nether_brick_slab", ()-> new SlabBlock(copyProperties("polished_cyan_nether_brick_slab", POLISHED_CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_WALL = BLOCKS.register("polished_cyan_nether_brick_wall", ()-> new WallBlock(copyProperties("polished_cyan_nether_brick_wall", POLISHED_CYAN_NETHER_BRICKS.get()).forceSolidOn()));
        POLISHED_CYAN_NETHER_BRICK_FENCE = BLOCKS.register("polished_cyan_nether_brick_fence", ()-> new FenceBlock(copyProperties("polished_cyan_nether_brick_fence", POLISHED_CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_FENCE_GATE = BLOCKS.register("polished_cyan_nether_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_cyan_nether_brick_fence_gate", POLISHED_CYAN_NETHER_BRICKS.get())));
        CHISELED_POLISHED_CYAN_NETHER_BRICK = BLOCKS.register("chiseled_polished_cyan_nether_bricks", ()-> new Block(copyProperties("chiseled_polished_cyan_nether_bricks", POLISHED_CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_PILLAR = BLOCKS.register("polished_cyan_nether_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_cyan_nether_brick_pillar", POLISHED_CYAN_NETHER_BRICKS.get())));
        POLISHED_CYAN_NETHER_BRICK_DOOR = BLOCKS.register("polished_cyan_nether_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_cyan_nether_brick_door", POLISHED_CYAN_NETHER_BRICKS.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_CYAN_NETHER_BRICK_TRAPDOOR = BLOCKS.register("polished_cyan_nether_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_cyan_nether_brick_trapdoor", POLISHED_CYAN_NETHER_BRICKS.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_CYAN_NETHER_BRICK_BUTTON = BLOCKS.register("polished_cyan_nether_brick_button", ()-> new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, basicProperties("polished_cyan_nether_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE = BLOCKS.register("polished_cyan_nether_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, basicProperties("polished_cyan_nether_brick_pressure_plate").mapColor(MapColor.NETHER).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_CYAN_NETHER_BRICK_LAMP = BLOCKS.register("polished_cyan_nether_brick_lamp", ()-> new Block(basicProperties("polished_cyan_nether_brick_lamp").mapColor(MapColor.SAND).instrument(NoteBlockInstrument.PLING).strength(0.3F).sound(SoundType.GLASS).lightLevel((blockStatex) -> 15).isRedstoneConductor(InspireBlocks::never)));
 */

        WARPED_NYLIUM_SHELF = BLOCKS.register("warped_nylium_shelf", () -> new ShelfFungiBlock(basicProperties("warped_nylium_shelf")
                
                .instabreak()
                .sound(SoundType.FUNGUS)
                .pushReaction(PushReaction.DESTROY)
                .forceSolidOn()
                
                .noOcclusion()
                .lightLevel((blockStatex) -> 5)
                .hasPostProcess(InspireBlocks::always)
                .emissiveRendering(InspireBlocks::always)));
        CRIMSON_NYLIUM_SHELF = BLOCKS.register("crimson_nylium_shelf", () -> new ShelfFungiBlock(basicProperties("crimson_nylium_shelf")
                
                .instabreak()
                .sound(SoundType.FUNGUS)
                .pushReaction(PushReaction.DESTROY)
                .forceSolidOn()
                
                .noOcclusion()
                .lightLevel((blockStatex) -> 5)
                .hasPostProcess(InspireBlocks::always)
                .emissiveRendering(InspireBlocks::always)));
    }

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    private static BlockBehaviour.Properties basicProperties(String name) {
        // setId() is not available in Minecraft 1.21.1
        return BlockBehaviour.Properties.of();
    }

    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }
    @SuppressWarnings("deprecation")
    private static BlockBehaviour.Properties copyProperties(String name, Block block) {
        // setId() is not available in Minecraft 1.21.1
        return BlockBehaviour.Properties.ofLegacyCopy(block);
    }
}
