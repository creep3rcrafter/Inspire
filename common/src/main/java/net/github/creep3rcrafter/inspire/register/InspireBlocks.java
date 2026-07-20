package net.github.creep3rcrafter.inspire.register;

import dev.architectury.core.block.ArchitecturyLiquidBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.*;
import net.github.creep3rcrafter.inspire.block.entity.IcicleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.ToIntFunction;

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
    //public static final RegistrySupplier<Block> HYDRO_FIRE;
    public static final RegistrySupplier<Block> HYDRO_FIRE;

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

    public static final RegistrySupplier<Block> CRACKED_POLISHED_BLACKSTONE;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_LAMP;

    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_FENCE;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_DOOR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_BRICK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_GILDED_BLACKSTONE;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_STAIRS;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_SLAB;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_WALL;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_FENCE;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_GILDED_BLACKSTONE;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_PILLAR;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_DOOR;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_BUTTON;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> GILDED_BLACKSTONE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_SMOOTH_STONE;
    public static final RegistrySupplier<Block> SMOOTH_STONE_STAIRS;
    public static final RegistrySupplier<Block> SMOOTH_STONE_WALL;
    public static final RegistrySupplier<Block> SMOOTH_STONE_FENCE;
    public static final RegistrySupplier<Block> SMOOTH_STONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_SMOOTH_STONE;
    public static final RegistrySupplier<Block> SMOOTH_STONE_PILLAR;
    public static final RegistrySupplier<Block> SMOOTH_STONE_DOOR;
    public static final RegistrySupplier<Block> SMOOTH_STONE_TRAPDOOR;
    public static final RegistrySupplier<Block> SMOOTH_STONE_BUTTON;
    public static final RegistrySupplier<Block> SMOOTH_STONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SMOOTH_STONE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_REDSTONE_BLOCK;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_SLAB;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_WALL;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_FENCE;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_REDSTONE_BLOCK;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_DOOR;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> REDSTONE_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_AMETHYST_BLOCK;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_SLAB;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_WALL;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_FENCE;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_AMETHYST_BLOCK;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_DOOR;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> AMETHYST_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_GLOWSTONE;
    public static final RegistrySupplier<Block> GLOWSTONE_STAIRS;
    public static final RegistrySupplier<Block> GLOWSTONE_SLAB;
    public static final RegistrySupplier<Block> GLOWSTONE_WALL;
    public static final RegistrySupplier<Block> GLOWSTONE_FENCE;
    public static final RegistrySupplier<Block> GLOWSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_GLOWSTONE;
    public static final RegistrySupplier<Block> GLOWSTONE_PILLAR;
    public static final RegistrySupplier<Block> GLOWSTONE_DOOR;
    public static final RegistrySupplier<Block> GLOWSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> GLOWSTONE_BUTTON;
    public static final RegistrySupplier<Block> GLOWSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> GLOWSTONE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_SMOOTH_BASALT;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_STAIRS;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_SLAB;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_WALL;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_FENCE;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_SMOOTH_BASALT;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_PILLAR;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_DOOR;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_TRAPDOOR;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_BUTTON;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SMOOTH_BASALT_LAMP;

    public static final RegistrySupplier<Block> CRACKED_POLISHED_BASALT;
    public static final RegistrySupplier<Block> POLISHED_BASALT_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_BASALT_SLAB;
    public static final RegistrySupplier<Block> POLISHED_BASALT_WALL;
    public static final RegistrySupplier<Block> POLISHED_BASALT_FENCE;
    public static final RegistrySupplier<Block> POLISHED_BASALT_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_BASALT;
    public static final RegistrySupplier<Block> POLISHED_BASALT_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_BASALT_DOOR;
    public static final RegistrySupplier<Block> POLISHED_BASALT_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_BASALT_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_BASALT_LAMP;

    public static final RegistrySupplier<Block> CRACKED_BASALT;
    public static final RegistrySupplier<Block> BASALT_STAIRS;
    public static final RegistrySupplier<Block> BASALT_SLAB;
    public static final RegistrySupplier<Block> BASALT_WALL;
    public static final RegistrySupplier<Block> BASALT_FENCE;
    public static final RegistrySupplier<Block> BASALT_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_BASALT;
    public static final RegistrySupplier<Block> BASALT_PILLAR;
    public static final RegistrySupplier<Block> BASALT_DOOR;
    public static final RegistrySupplier<Block> BASALT_TRAPDOOR;
    public static final RegistrySupplier<Block> BASALT_BUTTON;
    public static final RegistrySupplier<Block> BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> BASALT_LAMP;

    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_SLAB;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_WALL;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_LAMP;

    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_SLAB;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_WALL;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_FENCE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_DOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_BRICK_LAMP;

    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_SLAB;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_WALL;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_GLOWSTONE_TILE_LAMP;

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

    public static final RegistrySupplier<Block> CRACKED_POLISHED_TUFF;
    public static final RegistrySupplier<Block> POLISHED_TUFF_FENCE;
    public static final RegistrySupplier<Block> POLISHED_TUFF_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_TUFF;
    public static final RegistrySupplier<Block> POLISHED_TUFF_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_TUFF_DOOR;
    public static final RegistrySupplier<Block> POLISHED_TUFF_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_TUFF_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_TUFF_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_TUFF_LAMP;

    public static final RegistrySupplier<Block> CRACKED_TUFF_BRICKS;
    public static final RegistrySupplier<Block> TUFF_BRICK_FENCE;
    public static final RegistrySupplier<Block> TUFF_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Block> TUFF_BRICK_PILLAR;
    public static final RegistrySupplier<Block> TUFF_BRICK_DOOR;
    public static final RegistrySupplier<Block> TUFF_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Block> TUFF_BRICK_BUTTON;
    public static final RegistrySupplier<Block> TUFF_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> TUFF_BRICK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_QUARTZ;
    public static final RegistrySupplier<Block> QUARTZ_WALL;
    public static final RegistrySupplier<Block> QUARTZ_FENCE;
    public static final RegistrySupplier<Block> QUARTZ_FENCE_GATE;
    public static final RegistrySupplier<Block> QUARTZ_DOOR;
    public static final RegistrySupplier<Block> QUARTZ_TRAPDOOR;
    public static final RegistrySupplier<Block> QUARTZ_BUTTON;
    public static final RegistrySupplier<Block> QUARTZ_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> QUARTZ_LAMP;

    public static final RegistrySupplier<Block> CRACKED_SMOOTH_QUARTZ;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_WALL;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_FENCE;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_SMOOTH_QUARTZ;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_PILLAR;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_DOOR;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_TRAPDOOR;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_BUTTON;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_LAMP;

    public static final RegistrySupplier<Block> RESIN;
    public static final RegistrySupplier<Block> CRACKED_RESIN;
    public static final RegistrySupplier<Block> RESIN_STAIRS;
    public static final RegistrySupplier<Block> RESIN_SLAB;
    public static final RegistrySupplier<Block> RESIN_WALL;
    public static final RegistrySupplier<Block> RESIN_FENCE;
    public static final RegistrySupplier<Block> RESIN_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_RESIN;
    public static final RegistrySupplier<Block> RESIN_PILLAR;
    public static final RegistrySupplier<Block> RESIN_DOOR;
    public static final RegistrySupplier<Block> RESIN_TRAPDOOR;
    public static final RegistrySupplier<Block> RESIN_BUTTON;
    public static final RegistrySupplier<Block> RESIN_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> RESIN_LAMP;

    public static final RegistrySupplier<Block> CRACKED_POLISHED_GRANITE;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_WALL;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_GRANITE;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_GRANITE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_POLISHED_DIORITE;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_WALL;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_DIORITE;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_DIORITE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_WALL;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_ANDESITE;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_ANDESITE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_SANDSTONE;
    public static final RegistrySupplier<Block> SANDSTONE_FENCE;
    public static final RegistrySupplier<Block> SANDSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> SANDSTONE_PILLAR;
    public static final RegistrySupplier<Block> SANDSTONE_DOOR;
    public static final RegistrySupplier<Block> SANDSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> SANDSTONE_BUTTON;
    public static final RegistrySupplier<Block> SANDSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SANDSTONE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_IRON_BLOCK;
    public static final RegistrySupplier<Block> IRON_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> IRON_BLOCK_SLAB;
    public static final RegistrySupplier<Block> IRON_BLOCK_WALL;
    public static final RegistrySupplier<Block> IRON_BLOCK_FENCE;
    public static final RegistrySupplier<Block> IRON_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_IRON_BLOCK;
    public static final RegistrySupplier<Block> IRON_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> IRON_BLOCK_DOOR;
    public static final RegistrySupplier<Block> IRON_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> IRON_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> IRON_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> IRON_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_GOLD_BLOCK;
    public static final RegistrySupplier<Block> GOLD_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> GOLD_BLOCK_SLAB;
    public static final RegistrySupplier<Block> GOLD_BLOCK_WALL;
    public static final RegistrySupplier<Block> GOLD_BLOCK_FENCE;
    public static final RegistrySupplier<Block> GOLD_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_GOLD_BLOCK;
    public static final RegistrySupplier<Block> GOLD_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> GOLD_BLOCK_DOOR;
    public static final RegistrySupplier<Block> GOLD_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> GOLD_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> GOLD_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> GOLD_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_EMERALD_BLOCK;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_SLAB;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_WALL;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_FENCE;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_EMERALD_BLOCK;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_DOOR;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> EMERALD_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_DIAMOND_BLOCK;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_SLAB;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_WALL;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_FENCE;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_DIAMOND_BLOCK;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_DOOR;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> DIAMOND_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_NETHERITE_BLOCK;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_STAIRS;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_SLAB;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_WALL;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_FENCE;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_NETHERITE_BLOCK;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_PILLAR;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_DOOR;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_BUTTON;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> NETHERITE_BLOCK_LAMP;

    public static final RegistrySupplier<Block> CRACKED_OBSIDIAN;
    public static final RegistrySupplier<Block> OBSIDIAN_STAIRS;
    public static final RegistrySupplier<Block> OBSIDIAN_SLAB;
    public static final RegistrySupplier<Block> OBSIDIAN_WALL;
    public static final RegistrySupplier<Block> OBSIDIAN_FENCE;
    public static final RegistrySupplier<Block> OBSIDIAN_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_OBSIDIAN;
    public static final RegistrySupplier<Block> OBSIDIAN_PILLAR;
    public static final RegistrySupplier<Block> OBSIDIAN_DOOR;
    public static final RegistrySupplier<Block> OBSIDIAN_TRAPDOOR;
    public static final RegistrySupplier<Block> OBSIDIAN_BUTTON;
    public static final RegistrySupplier<Block> OBSIDIAN_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> OBSIDIAN_LAMP;

    public static final RegistrySupplier<Block> CRACKED_CRYING_OBSIDIAN;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_STAIRS;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_SLAB;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_WALL;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_FENCE;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_CRYING_OBSIDIAN;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_PILLAR;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_DOOR;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TRAPDOOR;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BUTTON;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> CRYING_OBSIDIAN_LAMP;

    public static final RegistrySupplier<Block> CRACKED_BEDROCK;
    public static final RegistrySupplier<Block> BEDROCK_STAIRS;
    public static final RegistrySupplier<Block> BEDROCK_SLAB;
    public static final RegistrySupplier<Block> BEDROCK_WALL;
    public static final RegistrySupplier<Block> BEDROCK_FENCE;
    public static final RegistrySupplier<Block> BEDROCK_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_BEDROCK;
    public static final RegistrySupplier<Block> BEDROCK_PILLAR;
    public static final RegistrySupplier<Block> BEDROCK_DOOR;
    public static final RegistrySupplier<Block> BEDROCK_TRAPDOOR;
    public static final RegistrySupplier<Block> BEDROCK_BUTTON;
    public static final RegistrySupplier<Block> BEDROCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> BEDROCK_LAMP;

    public static final RegistrySupplier<Block> SOUL_SANDSTONE;
    public static final RegistrySupplier<Block> CRACKED_SOUL_SANDSTONE;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_STAIRS;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_SLAB;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_WALL;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_FENCE;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_SOUL_SANDSTONE;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_PILLAR;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_DOOR;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_BUTTON;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SOUL_SANDSTONE_LAMP;

    public static final RegistrySupplier<Block> SOUL_SLATE;
    public static final RegistrySupplier<Block> CRACKED_SOUL_SLATE;
    public static final RegistrySupplier<Block> SOUL_SLATE_STAIRS;
    public static final RegistrySupplier<Block> SOUL_SLATE_SLAB;
    public static final RegistrySupplier<Block> SOUL_SLATE_WALL;
    public static final RegistrySupplier<Block> SOUL_SLATE_FENCE;
    public static final RegistrySupplier<Block> SOUL_SLATE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_SOUL_SLATE;
    public static final RegistrySupplier<Block> SOUL_SLATE_PILLAR;
    public static final RegistrySupplier<Block> SOUL_SLATE_DOOR;
    public static final RegistrySupplier<Block> SOUL_SLATE_TRAPDOOR;
    public static final RegistrySupplier<Block> SOUL_SLATE_BUTTON;
    public static final RegistrySupplier<Block> SOUL_SLATE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> SOUL_SLATE_LAMP;

    public static final RegistrySupplier<Block> CRACKED_DRIPSTONE;
    public static final RegistrySupplier<Block> DRIPSTONE_STAIRS;
    public static final RegistrySupplier<Block> DRIPSTONE_SLAB;
    public static final RegistrySupplier<Block> DRIPSTONE_WALL;
    public static final RegistrySupplier<Block> DRIPSTONE_FENCE;
    public static final RegistrySupplier<Block> DRIPSTONE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_DRIPSTONE;
    public static final RegistrySupplier<Block> DRIPSTONE_PILLAR;
    public static final RegistrySupplier<Block> DRIPSTONE_DOOR;
    public static final RegistrySupplier<Block> DRIPSTONE_TRAPDOOR;
    public static final RegistrySupplier<Block> DRIPSTONE_BUTTON;
    public static final RegistrySupplier<Block> DRIPSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> DRIPSTONE_LAMP;

    public static final RegistrySupplier<Block> POLISHED_CALCITE;
    public static final RegistrySupplier<Block> CRACKED_POLISHED_CALCITE;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_STAIRS;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_SLAB;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_WALL;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_FENCE;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_FENCE_GATE;
    public static final RegistrySupplier<Block> CHISELED_POLISHED_CALCITE;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_PILLAR;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_DOOR;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_TRAPDOOR;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_BUTTON;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> POLISHED_CALCITE_LAMP;
    public static final RegistrySupplier<Block> WHITE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> ORANGE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> MAGENTA_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> LIGHT_BLUE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> YELLOW_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> LIME_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> PINK_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> GRAY_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> GREEN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> LIGHT_GRAY_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> CYAN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> PURPLE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> BLUE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> BROWN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> RED_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Block> BLACK_DYE_GLOB_BLOCK;
    //public static final RegistrySupplier<Block> DRY_CACTUS_BLOCK;
    //public static final RegistrySupplier<LiquidBlock> POTION_FLUID;
    //public static final RegistrySupplier<ChromaticLampBlock> CHROMATIC_LAMP;
    //public static final RegistrySupplier<Block> GLOWSTONE_WIRE;
    //public static final RegistrySupplier<Block> SOULSTONE_WIRE;
    public static final RegistrySupplier<Block> SOULSTONE_WIRE;
    public static final RegistrySupplier<Block> THIN_ICE;
    public static final RegistrySupplier<Block> UNSTABLE_COBBLESTONE;
    public static final RegistrySupplier<Block> BLUESTONE_WIRE;
    public static final RegistrySupplier<Block> BLUESTONE_TORCH;
    public static final RegistrySupplier<Block> BLUESTONE_WALL_TORCH;
    public static final RegistrySupplier<Block> PRISMARINE_LEVER;
    public static final RegistrySupplier<Block> PRISMARINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> PRISMARINE_BUTTON;
    public static final RegistrySupplier<Block> BLUESTONE_REPEATER;
    public static final RegistrySupplier<Block> BLUESTONE_COMPARATOR;

    //public static final RegistrySupplier<Block> OBSIDIAN_CHEST;

    public static final RegistrySupplier<Block> PRISMARINE_LAMP;

    public static final RegistrySupplier<Block> BLUESTONE_ORE;
    public static final RegistrySupplier<Block> DEEPSLATE_BLUESTONE_ORE;
    public static final RegistrySupplier<Block> AMETHYST_ORE;
    public static final RegistrySupplier<Block> DEEPSLATE_AMETHYST_ORE;
    public static final RegistrySupplier<Block> PRISMARINE_ORE;
    public static final RegistrySupplier<Block> DEEPSLATE_PRISMARINE_ORE;

    public static final RegistrySupplier<Block> BLUESTONE_BLOCK;

    public static final RegistrySupplier<Block> WITHERED_BONE_BLOCK;

    public static final RegistrySupplier<Block> WITHERED_LOG;
    public static final RegistrySupplier<Block> STRIPPED_WITHERED_LOG;
    public static final RegistrySupplier<Block> WITHERED_WOOD;
    public static final RegistrySupplier<Block> WITHERED_PLANKS;
    public static final RegistrySupplier<Block> WITHERED_SAPLING;
    public static final RegistrySupplier<Block> WITHERED_STAIRS;
    public static final RegistrySupplier<Block> WITHERED_SIGN;
    public static final RegistrySupplier<Block> WITHERED_DOOR;
    public static final RegistrySupplier<Block> WITHERED_WALL_SIGN;
    public static final RegistrySupplier<Block> WITHERED_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> WITHERED_FENCE;
    public static final RegistrySupplier<Block> WITHERED_TRAPDOOR;
    public static final RegistrySupplier<Block> WITHERED_FENCE_GATE;
    public static final RegistrySupplier<Block> POTTED_WITHERED_SAPLING;
    public static final RegistrySupplier<Block> WITHERED_BUTTON;
    public static final RegistrySupplier<Block> WITHERED_SLAB;
    public static final RegistrySupplier<Block> STRIPPED_WITHERED_WOOD;

    public static final RegistrySupplier<Block> PINE_LOG;
    public static final RegistrySupplier<Block> STRIPPED_PINE_LOG;
    public static final RegistrySupplier<Block> PINE_WOOD;
    public static final RegistrySupplier<Block> PINE_PLANKS;
    public static final RegistrySupplier<Block> PINE_SAPLING;
    public static final RegistrySupplier<Block> PINE_STAIRS;
    public static final RegistrySupplier<Block> PINE_SIGN;
    public static final RegistrySupplier<Block> PINE_DOOR;
    public static final RegistrySupplier<Block> PINE_WALL_SIGN;
    public static final RegistrySupplier<Block> PINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> PINE_FENCE;
    public static final RegistrySupplier<Block> PINE_TRAPDOOR;
    public static final RegistrySupplier<Block> PINE_FENCE_GATE;
    public static final RegistrySupplier<Block> POTTED_PINE_SAPLING;
    public static final RegistrySupplier<Block> PINE_BUTTON;
    public static final RegistrySupplier<Block> PINE_SLAB;
    public static final RegistrySupplier<Block> STRIPPED_PINE_WOOD;

    public static final RegistrySupplier<Block> REDWOOD_LOG;
    public static final RegistrySupplier<Block> STRIPPED_REDWOOD_LOG;
    public static final RegistrySupplier<Block> REDWOOD_WOOD;
    public static final RegistrySupplier<Block> REDWOOD_PLANKS;
    public static final RegistrySupplier<Block> REDWOOD_SAPLING;
    public static final RegistrySupplier<Block> REDWOOD_STAIRS;
    public static final RegistrySupplier<Block> REDWOOD_SIGN;
    public static final RegistrySupplier<Block> REDWOOD_DOOR;
    public static final RegistrySupplier<Block> REDWOOD_WALL_SIGN;
    public static final RegistrySupplier<Block> REDWOOD_PRESSURE_PLATE;
    public static final RegistrySupplier<Block> REDWOOD_FENCE;
    public static final RegistrySupplier<Block> REDWOOD_TRAPDOOR;
    public static final RegistrySupplier<Block> REDWOOD_FENCE_GATE;
    public static final RegistrySupplier<Block> POTTED_REDWOOD_SAPLING;
    public static final RegistrySupplier<Block> REDWOOD_BUTTON;
    public static final RegistrySupplier<Block> REDWOOD_SLAB;
    public static final RegistrySupplier<Block> STRIPPED_REDWOOD_WOOD;

    public static final RegistrySupplier<Block> BREAKER;
    public static final RegistrySupplier<Block> FILTER;
    public static final RegistrySupplier<Block> SOUL_GLASS;
    public static final RegistrySupplier<Block> CURSED_TABLE;
    public static final RegistrySupplier<Block> SOUL_FARMLAND;
    public static final RegistrySupplier<Block> MAGNETIC_REPULSER;
    public static final RegistrySupplier<LiquidBlock> SOUL_FLUID_BLOCK;
    public static final RegistrySupplier<LiquidBlock> HONEY_FLUID_BLOCK;
    public static final RegistrySupplier<LiquidBlock> SCULK_SLUDGE_BLOCK;
    //public static final RegistrySupplier<Block> REDSTONE_GLASS;

    public static final RegistrySupplier<Block> FILTERED_HOPPER;
    public static final RegistrySupplier<Block> WET_SAND;
    public static final RegistrySupplier<Block> STEM;
    public static final RegistrySupplier<Block> WARPED_SOUL_SOIL;
    public static final RegistrySupplier<Block> CRIMSON_SOUL_SOIL;
    public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE;


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
        WHITE_DYE_GLOB_BLOCK = BLOCKS.register("white_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        ORANGE_DYE_GLOB_BLOCK = BLOCKS.register("orange_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        MAGENTA_DYE_GLOB_BLOCK = BLOCKS.register("magenta_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        LIGHT_BLUE_DYE_GLOB_BLOCK = BLOCKS.register("light_blue_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        YELLOW_DYE_GLOB_BLOCK = BLOCKS.register("yellow_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        LIME_DYE_GLOB_BLOCK = BLOCKS.register("lime_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.LIME, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        PINK_DYE_GLOB_BLOCK = BLOCKS.register("pink_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.PINK, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        GRAY_DYE_GLOB_BLOCK = BLOCKS.register("gray_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        GREEN_DYE_GLOB_BLOCK = BLOCKS.register("green_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.GREEN, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        LIGHT_GRAY_DYE_GLOB_BLOCK = BLOCKS.register("light_gray_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        CYAN_DYE_GLOB_BLOCK = BLOCKS.register("cyan_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.CYAN, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        PURPLE_DYE_GLOB_BLOCK = BLOCKS.register("purple_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        BLUE_DYE_GLOB_BLOCK = BLOCKS.register("blue_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.BLUE, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        BROWN_DYE_GLOB_BLOCK = BLOCKS.register("brown_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.BROWN, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        RED_DYE_GLOB_BLOCK = BLOCKS.register("red_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.RED, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));
        BLACK_DYE_GLOB_BLOCK = BLOCKS.register("black_dye_glob_block", () ->
                new DyeGlobBlock(DyeColor.BLACK, BlockBehaviour.Properties.of().friction(0.8F).sound(SoundType.SLIME_BLOCK)));

        BLUESTONE_WIRE = BLOCKS.register("bluestone_wire", () ->
                new BluestoneWireBlock(BlockBehaviour.Properties.of().noCollission().instabreak()));
        BLUESTONE_TORCH = BLOCKS.register("bluestone_torch", () ->
                new BluestoneTorchBlock(BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(litBlockEmission(7)).sound(SoundType.WOOD)));
        BLUESTONE_WALL_TORCH = BLOCKS.register("bluestone_wall_torch", () ->
                new BluestoneWallTorchBlock(BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(litBlockEmission(7)).sound(SoundType.WOOD).dropsLike(BLUESTONE_TORCH.get())));
        PRISMARINE_LEVER = BLOCKS.register("prismarine_lever", () ->
                new BluestoneLeverBlock(BlockBehaviour.Properties.of().noCollission().strength(1.5F, 6.0F).sound(SoundType.WOOD)));
        PRISMARINE_PRESSURE_PLATE = BLOCKS.register("prismarine_pressure_plate", () ->
                new BluestonePressurePlateBlock(BlockBehaviour.Properties.of().noCollission().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
        PRISMARINE_BUTTON = BLOCKS.register("prismarine_button", () ->
                new BluestoneButtonBlock(BlockBehaviour.Properties.of().noCollission().strength(1.5F, 6.0F)));
        BLUESTONE_REPEATER = BLOCKS.register("bluestone_repeater", () ->
                new BluestoneRepeaterBlock(BlockBehaviour.Properties.of().instabreak().sound(SoundType.WOOD)));
        BLUESTONE_COMPARATOR = BLOCKS.register("bluestone_comparator", () ->
                new BluestoneComparatorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COMPARATOR)));

        PRISMARINE_LAMP = BLOCKS.register("prismarine_lamp", () ->
                new RedstoneLampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn((state, getter, pos, entity) -> true)));

        BLUESTONE_ORE = BLOCKS.register("bluestone_ore", () ->
                new BluestoneOreBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 3.0F)));
        DEEPSLATE_BLUESTONE_ORE = BLOCKS.register("deepslate_bluestone_ore", () ->
                new BluestoneOreBlock(BlockBehaviour.Properties.ofLegacyCopy(BLUESTONE_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

        AMETHYST_ORE = BLOCKS.register("amethyst_ore", () ->
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
        DEEPSLATE_AMETHYST_ORE = BLOCKS.register("deepslate_amethyst_ore", () ->
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofLegacyCopy(AMETHYST_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

        PRISMARINE_ORE = BLOCKS.register("prismarine_ore", () ->
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
        DEEPSLATE_PRISMARINE_ORE = BLOCKS.register("deepslate_prismarine_ore", () ->
                new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofLegacyCopy(PRISMARINE_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

        BLUESTONE_BLOCK = BLOCKS.register("bluestone_block", () ->
                new PoweredBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).isRedstoneConductor(InspireBlocks::never)));

        WITHERED_BONE_BLOCK = BLOCKS.register("withered_bone_block", () ->
                new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(2.5F).sound(SoundType.BONE_BLOCK)));

        STEM = BLOCKS.register("stem", () -> netherLog(MapColor.COLOR_GREEN));
        WITHERED_LOG = BLOCKS.register("withered_log", () -> netherLog(MapColor.COLOR_LIGHT_GRAY));
        STRIPPED_WITHERED_LOG = BLOCKS.register("stripped_withered_log", () -> netherLog(MapColor.COLOR_BLACK));
        WITHERED_WOOD = BLOCKS.register("withered_wood", () -> netherLog(MapColor.COLOR_LIGHT_GRAY));
        STRIPPED_WITHERED_WOOD = BLOCKS.register("stripped_withered_wood", () -> netherLog(MapColor.COLOR_BLACK));
        WITHERED_PLANKS = BLOCKS.register("withered_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        WITHERED_SAPLING = BLOCKS.register("withered_sapling", () -> new SaplingBlock(TreeGrower.OAK, BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
        WITHERED_STAIRS = BLOCKS.register("withered_stairs", () -> new StairBlock(WITHERED_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(WITHERED_PLANKS.get())));
        WITHERED_SIGN = BLOCKS.register("withered_sign", () -> new StandingSignBlock(InspireWoodTypes.WITHERED, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD)));
        WITHERED_DOOR = BLOCKS.register("withered_door", () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(WITHERED_PLANKS.get().defaultMapColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        WITHERED_WALL_SIGN = BLOCKS.register("withered_wall_sign", () -> new WallSignBlock(InspireWoodTypes.WITHERED, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(WITHERED_SIGN.get())));
        WITHERED_PRESSURE_PLATE = BLOCKS.register("withered_pressure_plate", () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(WITHERED_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
        WITHERED_FENCE = BLOCKS.register("withered_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(WITHERED_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        WITHERED_TRAPDOOR = BLOCKS.register("withered_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(InspireBlocks::never)));
        WITHERED_FENCE_GATE = BLOCKS.register("withered_fence_gate", () -> new FenceGateBlock(InspireWoodTypes.WITHERED, BlockBehaviour.Properties.of().mapColor(WITHERED_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        POTTED_WITHERED_SAPLING = BLOCKS.register("potted_withered_sapling", () -> new FlowerPotBlock(WITHERED_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
        WITHERED_BUTTON = BLOCKS.register("withered_button", () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD)));
        WITHERED_SLAB = BLOCKS.register("withered_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        PINE_LOG = BLOCKS.register("pine_log", () -> netherLog(MapColor.COLOR_RED));
        STRIPPED_PINE_LOG = BLOCKS.register("stripped_pine_log", () -> netherLog(MapColor.COLOR_RED));
        PINE_WOOD = BLOCKS.register("pine_wood", () -> netherLog(MapColor.COLOR_RED));
        STRIPPED_PINE_WOOD = BLOCKS.register("stripped_pine_wood", () -> netherLog(MapColor.COLOR_RED));
        PINE_PLANKS = BLOCKS.register("pine_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PINE_SAPLING = BLOCKS.register("pine_sapling", () -> new SaplingBlock(TreeGrower.OAK, BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
        PINE_STAIRS = BLOCKS.register("pine_stairs", () -> new StairBlock(PINE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(PINE_PLANKS.get())));
        PINE_SIGN = BLOCKS.register("pine_sign", () -> new StandingSignBlock(InspireWoodTypes.PINE, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD)));
        PINE_DOOR = BLOCKS.register("pine_door", () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(PINE_PLANKS.get().defaultMapColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign", () -> new WallSignBlock(InspireWoodTypes.PINE, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(PINE_SIGN.get())));
        PINE_PRESSURE_PLATE = BLOCKS.register("pine_pressure_plate", () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(PINE_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
        PINE_FENCE = BLOCKS.register("pine_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(PINE_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        PINE_TRAPDOOR = BLOCKS.register("pine_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(InspireBlocks::never)));
        PINE_FENCE_GATE = BLOCKS.register("pine_fence_gate", () -> new FenceGateBlock(InspireWoodTypes.PINE, BlockBehaviour.Properties.of().mapColor(PINE_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        POTTED_PINE_SAPLING = BLOCKS.register("potted_pine_sapling", () -> new FlowerPotBlock(PINE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
        PINE_BUTTON = BLOCKS.register("pine_button", () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD)));
        PINE_SLAB = BLOCKS.register("pine_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        REDWOOD_LOG = BLOCKS.register("redwood_log", () -> netherLog(MapColor.COLOR_RED));
        STRIPPED_REDWOOD_LOG = BLOCKS.register("stripped_redwood_log", () -> netherLog(MapColor.COLOR_RED));
        REDWOOD_WOOD = BLOCKS.register("redwood_wood", () -> netherLog(MapColor.COLOR_RED));
        STRIPPED_REDWOOD_WOOD = BLOCKS.register("stripped_redwood_wood", () -> netherLog(MapColor.COLOR_RED));
        REDWOOD_PLANKS = BLOCKS.register("redwood_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        REDWOOD_SAPLING = BLOCKS.register("redwood_sapling", () -> new SaplingBlock(TreeGrower.OAK, BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
        REDWOOD_STAIRS = BLOCKS.register("redwood_stairs", () -> new StairBlock(REDWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(REDWOOD_PLANKS.get())));
        REDWOOD_SIGN = BLOCKS.register("redwood_sign", () -> new StandingSignBlock(InspireWoodTypes.REDWOOD, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD)));
        REDWOOD_DOOR = BLOCKS.register("redwood_door", () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(REDWOOD_PLANKS.get().defaultMapColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign", () -> new WallSignBlock(InspireWoodTypes.REDWOOD, BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(REDWOOD_SIGN.get())));
        REDWOOD_PRESSURE_PLATE = BLOCKS.register("redwood_pressure_plate", () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(REDWOOD_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
        REDWOOD_FENCE = BLOCKS.register("redwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(REDWOOD_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        REDWOOD_TRAPDOOR = BLOCKS.register("redwood_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(InspireBlocks::never)));
        REDWOOD_FENCE_GATE = BLOCKS.register("redwood_fence_gate", () -> new FenceGateBlock(InspireWoodTypes.REDWOOD, BlockBehaviour.Properties.of().mapColor(REDWOOD_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
        POTTED_REDWOOD_SAPLING = BLOCKS.register("potted_redwood_sapling", () -> new FlowerPotBlock(REDWOOD_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
        REDWOOD_BUTTON = BLOCKS.register("redwood_button", () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD)));
        REDWOOD_SLAB = BLOCKS.register("redwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        BREAKER = BLOCKS.register("breaker", () -> new BreakerBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.5F)));
        FILTER = BLOCKS.register("filter", () -> new FilterBlock(BlockBehaviour.Properties.of().noOcclusion().requiresCorrectToolForDrops().strength(3.5F)));
        SOUL_GLASS = BLOCKS.register("soul_glass", () -> new SoulGlassBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).noOcclusion().randomTicks().isValidSpawn(InspireBlocks::never).isRedstoneConductor(InspireBlocks::never).isSuffocating(InspireBlocks::never).isViewBlocking(InspireBlocks::never).lightLevel(brightnessBlockEmission())));
        CURSED_TABLE = BLOCKS.register("cursed_table", () -> new CursedTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops().lightLevel((blockStatex) -> 7).strength(5.0F, 1200.0F)));
        //Blocks
        SOUL_FLUID_BLOCK = BLOCKS.register("soul_fluid_block", () ->
                new ArchitecturyLiquidBlock(InspireFluids.SOUL_FLUID, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WATER)));//removed .get()
        HONEY_FLUID_BLOCK = BLOCKS.register("honey_fluid_block", () ->
                new ArchitecturyLiquidBlock(InspireFluids.HONEY_FLUID, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WATER)));//removed .get()
        SOUL_FARMLAND = BLOCKS.register("soul_farmland", () ->
                new SoulFarmlandBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.FARMLAND)));//removed .get()
        MAGNETIC_REPULSER = BLOCKS.register("magnetic_repulser", () ->
                new MagneticRepulser(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STONE)));//removed .get()

        SCULK_SLUDGE_BLOCK = BLOCKS.register("sculk_sludge_block", () ->
                new ArchitecturyLiquidBlock(InspireFluids.SCULK_SLUDGE, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WATER)));//removed .get()
        FILTERED_HOPPER = BLOCKS.register("filtered_hopper", () ->
                new FilteredHopperBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.HOPPER)));//removed .get()

        /*
        REDSTONE_GLASS = BLOCKS.register("redstone_glass", () ->
                new RedstoneGlassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));//removed .get()
         */
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

        CRACKED_POLISHED_BLACKSTONE = BLOCKS.register("cracked_polished_blackstone", ()-> new Block(copyProperties("cracked_polished_blackstone", Blocks.POLISHED_BLACKSTONE)));
        POLISHED_BLACKSTONE_FENCE = BLOCKS.register("polished_blackstone_fence", ()-> new FenceBlock(copyProperties("polished_blackstone_fence", Blocks.POLISHED_BLACKSTONE)));
        POLISHED_BLACKSTONE_FENCE_GATE = BLOCKS.register("polished_blackstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_blackstone_fence_gate", Blocks.POLISHED_BLACKSTONE)));
        POLISHED_BLACKSTONE_PILLAR = BLOCKS.register("polished_blackstone_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_blackstone_pillar", Blocks.POLISHED_BLACKSTONE)));
        POLISHED_BLACKSTONE_DOOR = BLOCKS.register("polished_blackstone_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_blackstone_door", Blocks.POLISHED_BLACKSTONE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_BLACKSTONE_TRAPDOOR = BLOCKS.register("polished_blackstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_blackstone_trapdoor", Blocks.POLISHED_BLACKSTONE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_BLACKSTONE_LAMP = BLOCKS.register("polished_blackstone_lamp", ()-> new Block(basicProperties("polished_blackstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_BLACKSTONE_BRICK_FENCE = BLOCKS.register("polished_blackstone_brick_fence", ()-> new FenceBlock(copyProperties("polished_blackstone_brick_fence", Blocks.POLISHED_BLACKSTONE_BRICKS)));
        POLISHED_BLACKSTONE_BRICK_FENCE_GATE = BLOCKS.register("polished_blackstone_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_blackstone_brick_fence_gate", Blocks.POLISHED_BLACKSTONE_BRICKS)));
        POLISHED_BLACKSTONE_BRICK_PILLAR = BLOCKS.register("polished_blackstone_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_blackstone_brick_pillar", Blocks.POLISHED_BLACKSTONE_BRICKS)));
        POLISHED_BLACKSTONE_BRICK_DOOR = BLOCKS.register("polished_blackstone_brick_door", ()-> new DoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_blackstone_brick_door", Blocks.POLISHED_BLACKSTONE_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_BLACKSTONE_BRICK_TRAPDOOR = BLOCKS.register("polished_blackstone_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.POLISHED_BLACKSTONE, copyProperties("polished_blackstone_brick_trapdoor", Blocks.POLISHED_BLACKSTONE_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_BLACKSTONE_BRICK_LAMP = BLOCKS.register("polished_blackstone_brick_lamp", ()-> new Block(basicProperties("polished_blackstone_brick_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_GILDED_BLACKSTONE = BLOCKS.register("cracked_gilded_blackstone", ()-> new Block(copyProperties("cracked_gilded_blackstone", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_STAIRS = BLOCKS.register("gilded_blackstone_stairs", ()-> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(), copyProperties("gilded_blackstone_stairs", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_SLAB = BLOCKS.register("gilded_blackstone_slab", ()-> new SlabBlock(copyProperties("gilded_blackstone_slab", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_WALL = BLOCKS.register("gilded_blackstone_wall", ()-> new WallBlock(copyProperties("gilded_blackstone_wall", Blocks.GILDED_BLACKSTONE).forceSolidOn()));
        GILDED_BLACKSTONE_FENCE = BLOCKS.register("gilded_blackstone_fence", ()-> new FenceBlock(copyProperties("gilded_blackstone_fence", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_FENCE_GATE = BLOCKS.register("gilded_blackstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("gilded_blackstone_fence_gate", Blocks.GILDED_BLACKSTONE)));
        CHISELED_GILDED_BLACKSTONE = BLOCKS.register("chiseled_gilded_blackstone", ()-> new Block(copyProperties("chiseled_gilded_blackstone", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_PILLAR = BLOCKS.register("gilded_blackstone_pillar", ()-> new RotatedPillarBlock(copyProperties("gilded_blackstone_pillar", Blocks.GILDED_BLACKSTONE)));
        GILDED_BLACKSTONE_DOOR = BLOCKS.register("gilded_blackstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("gilded_blackstone_door", Blocks.GILDED_BLACKSTONE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        GILDED_BLACKSTONE_TRAPDOOR = BLOCKS.register("gilded_blackstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("gilded_blackstone_trapdoor", Blocks.GILDED_BLACKSTONE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        GILDED_BLACKSTONE_BUTTON = BLOCKS.register("gilded_blackstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("gilded_blackstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GILDED_BLACKSTONE_PRESSURE_PLATE = BLOCKS.register("gilded_blackstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("gilded_blackstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GILDED_BLACKSTONE_LAMP = BLOCKS.register("gilded_blackstone_lamp", ()-> new Block(basicProperties("gilded_blackstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_SMOOTH_STONE = BLOCKS.register("cracked_smooth_stone", ()-> new Block(copyProperties("cracked_smooth_stone", Blocks.SMOOTH_STONE)));
        SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs", ()-> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), copyProperties("smooth_stone_stairs", Blocks.SMOOTH_STONE)));
        SMOOTH_STONE_WALL = BLOCKS.register("smooth_stone_wall", ()-> new WallBlock(copyProperties("smooth_stone_wall", Blocks.SMOOTH_STONE).forceSolidOn()));
        SMOOTH_STONE_FENCE = BLOCKS.register("smooth_stone_fence", ()-> new FenceBlock(copyProperties("smooth_stone_fence", Blocks.SMOOTH_STONE)));
        SMOOTH_STONE_FENCE_GATE = BLOCKS.register("smooth_stone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("smooth_stone_fence_gate", Blocks.SMOOTH_STONE)));
        CHISELED_SMOOTH_STONE = BLOCKS.register("chiseled_smooth_stone", ()-> new Block(copyProperties("chiseled_smooth_stone", Blocks.SMOOTH_STONE)));
        SMOOTH_STONE_PILLAR = BLOCKS.register("smooth_stone_pillar", ()-> new RotatedPillarBlock(copyProperties("smooth_stone_pillar", Blocks.SMOOTH_STONE)));
        SMOOTH_STONE_DOOR = BLOCKS.register("smooth_stone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("smooth_stone_door", Blocks.SMOOTH_STONE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SMOOTH_STONE_TRAPDOOR = BLOCKS.register("smooth_stone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("smooth_stone_trapdoor", Blocks.SMOOTH_STONE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SMOOTH_STONE_BUTTON = BLOCKS.register("smooth_stone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("smooth_stone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_STONE_PRESSURE_PLATE = BLOCKS.register("smooth_stone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("smooth_stone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_STONE_LAMP = BLOCKS.register("smooth_stone_lamp", ()-> new Block(basicProperties("smooth_stone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_REDSTONE_BLOCK = BLOCKS.register("cracked_redstone_block", ()-> new Block(copyProperties("cracked_redstone_block", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_STAIRS = BLOCKS.register("redstone_block_stairs", ()-> new StairBlock(Blocks.REDSTONE_BLOCK.defaultBlockState(), copyProperties("redstone_block_stairs", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_SLAB = BLOCKS.register("redstone_block_slab", ()-> new SlabBlock(copyProperties("redstone_block_slab", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_WALL = BLOCKS.register("redstone_block_wall", ()-> new WallBlock(copyProperties("redstone_block_wall", Blocks.REDSTONE_BLOCK).forceSolidOn()));
        REDSTONE_BLOCK_FENCE = BLOCKS.register("redstone_block_fence", ()-> new FenceBlock(copyProperties("redstone_block_fence", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_FENCE_GATE = BLOCKS.register("redstone_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("redstone_block_fence_gate", Blocks.REDSTONE_BLOCK)));
        CHISELED_REDSTONE_BLOCK = BLOCKS.register("chiseled_redstone_block", ()-> new Block(copyProperties("chiseled_redstone_block", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_PILLAR = BLOCKS.register("redstone_block_pillar", ()-> new RotatedPillarBlock(copyProperties("redstone_block_pillar", Blocks.REDSTONE_BLOCK)));
        REDSTONE_BLOCK_DOOR = BLOCKS.register("redstone_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("redstone_block_door", Blocks.REDSTONE_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        REDSTONE_BLOCK_TRAPDOOR = BLOCKS.register("redstone_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("redstone_block_trapdoor", Blocks.REDSTONE_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        REDSTONE_BLOCK_BUTTON = BLOCKS.register("redstone_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("redstone_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        REDSTONE_BLOCK_PRESSURE_PLATE = BLOCKS.register("redstone_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("redstone_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        REDSTONE_BLOCK_LAMP = BLOCKS.register("redstone_block_lamp", ()-> new Block(basicProperties("redstone_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_AMETHYST_BLOCK = BLOCKS.register("cracked_amethyst_block", ()-> new Block(copyProperties("cracked_amethyst_block", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_STAIRS = BLOCKS.register("amethyst_block_stairs", ()-> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), copyProperties("amethyst_block_stairs", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_SLAB = BLOCKS.register("amethyst_block_slab", ()-> new SlabBlock(copyProperties("amethyst_block_slab", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_WALL = BLOCKS.register("amethyst_block_wall", ()-> new WallBlock(copyProperties("amethyst_block_wall", Blocks.AMETHYST_BLOCK).forceSolidOn()));
        AMETHYST_BLOCK_FENCE = BLOCKS.register("amethyst_block_fence", ()-> new FenceBlock(copyProperties("amethyst_block_fence", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_FENCE_GATE = BLOCKS.register("amethyst_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("amethyst_block_fence_gate", Blocks.AMETHYST_BLOCK)));
        CHISELED_AMETHYST_BLOCK = BLOCKS.register("chiseled_amethyst_block", ()-> new Block(copyProperties("chiseled_amethyst_block", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_PILLAR = BLOCKS.register("amethyst_block_pillar", ()-> new RotatedPillarBlock(copyProperties("amethyst_block_pillar", Blocks.AMETHYST_BLOCK)));
        AMETHYST_BLOCK_DOOR = BLOCKS.register("amethyst_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("amethyst_block_door", Blocks.AMETHYST_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        AMETHYST_BLOCK_TRAPDOOR = BLOCKS.register("amethyst_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("amethyst_block_trapdoor", Blocks.AMETHYST_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        AMETHYST_BLOCK_BUTTON = BLOCKS.register("amethyst_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("amethyst_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        AMETHYST_BLOCK_PRESSURE_PLATE = BLOCKS.register("amethyst_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("amethyst_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        AMETHYST_BLOCK_LAMP = BLOCKS.register("amethyst_block_lamp", ()-> new Block(basicProperties("amethyst_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_GLOWSTONE = BLOCKS.register("cracked_glowstone", ()-> new Block(copyProperties("cracked_glowstone", Blocks.GLOWSTONE)));
        GLOWSTONE_STAIRS = BLOCKS.register("glowstone_stairs", ()-> new StairBlock(Blocks.GLOWSTONE.defaultBlockState(), copyProperties("glowstone_stairs", Blocks.GLOWSTONE)));
        GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", ()-> new SlabBlock(copyProperties("glowstone_slab", Blocks.GLOWSTONE)));
        GLOWSTONE_WALL = BLOCKS.register("glowstone_wall", ()-> new WallBlock(copyProperties("glowstone_wall", Blocks.GLOWSTONE).forceSolidOn()));
        GLOWSTONE_FENCE = BLOCKS.register("glowstone_fence", ()-> new FenceBlock(copyProperties("glowstone_fence", Blocks.GLOWSTONE)));
        GLOWSTONE_FENCE_GATE = BLOCKS.register("glowstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("glowstone_fence_gate", Blocks.GLOWSTONE)));
        CHISELED_GLOWSTONE = BLOCKS.register("chiseled_glowstone", ()-> new Block(copyProperties("chiseled_glowstone", Blocks.GLOWSTONE)));
        GLOWSTONE_PILLAR = BLOCKS.register("glowstone_pillar", ()-> new RotatedPillarBlock(copyProperties("glowstone_pillar", Blocks.GLOWSTONE)));
        GLOWSTONE_DOOR = BLOCKS.register("glowstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("glowstone_door", Blocks.GLOWSTONE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        GLOWSTONE_TRAPDOOR = BLOCKS.register("glowstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("glowstone_trapdoor", Blocks.GLOWSTONE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        GLOWSTONE_BUTTON = BLOCKS.register("glowstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("glowstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GLOWSTONE_PRESSURE_PLATE = BLOCKS.register("glowstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("glowstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GLOWSTONE_LAMP = BLOCKS.register("glowstone_lamp", ()-> new Block(basicProperties("glowstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_SMOOTH_BASALT = BLOCKS.register("cracked_smooth_basalt", ()-> new Block(copyProperties("cracked_smooth_basalt", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs", ()-> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), copyProperties("smooth_basalt_stairs", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab", ()-> new SlabBlock(copyProperties("smooth_basalt_slab", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_WALL = BLOCKS.register("smooth_basalt_wall", ()-> new WallBlock(copyProperties("smooth_basalt_wall", Blocks.SMOOTH_BASALT).forceSolidOn()));
        SMOOTH_BASALT_FENCE = BLOCKS.register("smooth_basalt_fence", ()-> new FenceBlock(copyProperties("smooth_basalt_fence", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_FENCE_GATE = BLOCKS.register("smooth_basalt_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("smooth_basalt_fence_gate", Blocks.SMOOTH_BASALT)));
        CHISELED_SMOOTH_BASALT = BLOCKS.register("chiseled_smooth_basalt", ()-> new Block(copyProperties("chiseled_smooth_basalt", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_PILLAR = BLOCKS.register("smooth_basalt_pillar", ()-> new RotatedPillarBlock(copyProperties("smooth_basalt_pillar", Blocks.SMOOTH_BASALT)));
        SMOOTH_BASALT_DOOR = BLOCKS.register("smooth_basalt_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("smooth_basalt_door", Blocks.SMOOTH_BASALT).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SMOOTH_BASALT_TRAPDOOR = BLOCKS.register("smooth_basalt_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("smooth_basalt_trapdoor", Blocks.SMOOTH_BASALT).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SMOOTH_BASALT_BUTTON = BLOCKS.register("smooth_basalt_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("smooth_basalt_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_BASALT_PRESSURE_PLATE = BLOCKS.register("smooth_basalt_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("smooth_basalt_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_BASALT_LAMP = BLOCKS.register("smooth_basalt_lamp", ()-> new Block(basicProperties("smooth_basalt_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_BASALT = BLOCKS.register("cracked_polished_basalt", ()-> new Block(copyProperties("cracked_polished_basalt", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs", ()-> new StairBlock(Blocks.POLISHED_BASALT.defaultBlockState(), copyProperties("polished_basalt_stairs", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab", ()-> new SlabBlock(copyProperties("polished_basalt_slab", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall", ()-> new WallBlock(copyProperties("polished_basalt_wall", Blocks.POLISHED_BASALT).forceSolidOn()));
        POLISHED_BASALT_FENCE = BLOCKS.register("polished_basalt_fence", ()-> new FenceBlock(copyProperties("polished_basalt_fence", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_FENCE_GATE = BLOCKS.register("polished_basalt_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_basalt_fence_gate", Blocks.POLISHED_BASALT)));
        CHISELED_POLISHED_BASALT = BLOCKS.register("chiseled_polished_basalt", ()-> new Block(copyProperties("chiseled_polished_basalt", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_PILLAR = BLOCKS.register("polished_basalt_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_basalt_pillar", Blocks.POLISHED_BASALT)));
        POLISHED_BASALT_DOOR = BLOCKS.register("polished_basalt_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_basalt_door", Blocks.POLISHED_BASALT).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_BASALT_TRAPDOOR = BLOCKS.register("polished_basalt_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_basalt_trapdoor", Blocks.POLISHED_BASALT).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_BASALT_BUTTON = BLOCKS.register("polished_basalt_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_basalt_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_BASALT_PRESSURE_PLATE = BLOCKS.register("polished_basalt_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_basalt_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_BASALT_LAMP = BLOCKS.register("polished_basalt_lamp", ()-> new Block(basicProperties("polished_basalt_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_BASALT = BLOCKS.register("cracked_basalt", ()-> new Block(copyProperties("cracked_basalt", Blocks.BASALT)));
        BASALT_STAIRS = BLOCKS.register("basalt_stairs", ()-> new StairBlock(Blocks.BASALT.defaultBlockState(), copyProperties("basalt_stairs", Blocks.BASALT)));
        BASALT_SLAB = BLOCKS.register("basalt_slab", ()-> new SlabBlock(copyProperties("basalt_slab", Blocks.BASALT)));
        BASALT_WALL = BLOCKS.register("basalt_wall", ()-> new WallBlock(copyProperties("basalt_wall", Blocks.BASALT).forceSolidOn()));
        BASALT_FENCE = BLOCKS.register("basalt_fence", ()-> new FenceBlock(copyProperties("basalt_fence", Blocks.BASALT)));
        BASALT_FENCE_GATE = BLOCKS.register("basalt_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("basalt_fence_gate", Blocks.BASALT)));
        CHISELED_BASALT = BLOCKS.register("chiseled_basalt", ()-> new Block(copyProperties("chiseled_basalt", Blocks.BASALT)));
        BASALT_PILLAR = BLOCKS.register("basalt_pillar", ()-> new RotatedPillarBlock(copyProperties("basalt_pillar", Blocks.BASALT)));
        BASALT_DOOR = BLOCKS.register("basalt_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("basalt_door", Blocks.BASALT).noOcclusion().pushReaction(PushReaction.DESTROY)));
        BASALT_TRAPDOOR = BLOCKS.register("basalt_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("basalt_trapdoor", Blocks.BASALT).noOcclusion().isValidSpawn(InspireBlocks::never)));
        BASALT_BUTTON = BLOCKS.register("basalt_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("basalt_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BASALT_PRESSURE_PLATE = BLOCKS.register("basalt_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("basalt_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BASALT_LAMP = BLOCKS.register("basalt_lamp", ()-> new Block(basicProperties("basalt_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_GLOWSTONE = BLOCKS.register("polished_glowstone", ()-> new Block(copyProperties("polished_glowstone", Blocks.GLOWSTONE)));
        CRACKED_POLISHED_GLOWSTONE = BLOCKS.register("cracked_polished_glowstone", ()-> new Block(copyProperties("cracked_polished_glowstone", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_STAIRS = BLOCKS.register("polished_glowstone_stairs", ()-> new StairBlock(POLISHED_GLOWSTONE.get().defaultBlockState(), copyProperties("polished_glowstone_stairs", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_SLAB = BLOCKS.register("polished_glowstone_slab", ()-> new SlabBlock(copyProperties("polished_glowstone_slab", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_WALL = BLOCKS.register("polished_glowstone_wall", ()-> new WallBlock(copyProperties("polished_glowstone_wall", POLISHED_GLOWSTONE.get()).forceSolidOn()));
        POLISHED_GLOWSTONE_FENCE = BLOCKS.register("polished_glowstone_fence", ()-> new FenceBlock(copyProperties("polished_glowstone_fence", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_FENCE_GATE = BLOCKS.register("polished_glowstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_glowstone_fence_gate", POLISHED_GLOWSTONE.get())));
        CHISELED_POLISHED_GLOWSTONE = BLOCKS.register("chiseled_polished_glowstone", ()-> new Block(copyProperties("chiseled_polished_glowstone", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_PILLAR = BLOCKS.register("polished_glowstone_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_glowstone_pillar", POLISHED_GLOWSTONE.get())));
        POLISHED_GLOWSTONE_DOOR = BLOCKS.register("polished_glowstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_door", POLISHED_GLOWSTONE.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_TRAPDOOR = BLOCKS.register("polished_glowstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_trapdoor", POLISHED_GLOWSTONE.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_GLOWSTONE_BUTTON = BLOCKS.register("polished_glowstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_glowstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_PRESSURE_PLATE = BLOCKS.register("polished_glowstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_glowstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_LAMP = BLOCKS.register("polished_glowstone_lamp", ()-> new Block(basicProperties("polished_glowstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_GLOWSTONE_BRICKS = BLOCKS.register("polished_glowstone_bricks", ()-> new Block(copyProperties("polished_glowstone_bricks", POLISHED_GLOWSTONE.get())));
        CRACKED_POLISHED_GLOWSTONE_BRICKS = BLOCKS.register("cracked_polished_glowstone_bricks", ()-> new Block(copyProperties("cracked_polished_glowstone_bricks", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_STAIRS = BLOCKS.register("polished_glowstone_brick_stairs", ()-> new StairBlock(POLISHED_GLOWSTONE_BRICKS.get().defaultBlockState(), copyProperties("polished_glowstone_brick_stairs", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_SLAB = BLOCKS.register("polished_glowstone_brick_slab", ()-> new SlabBlock(copyProperties("polished_glowstone_brick_slab", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_WALL = BLOCKS.register("polished_glowstone_brick_wall", ()-> new WallBlock(copyProperties("polished_glowstone_brick_wall", POLISHED_GLOWSTONE_BRICKS.get()).forceSolidOn()));
        POLISHED_GLOWSTONE_BRICK_FENCE = BLOCKS.register("polished_glowstone_brick_fence", ()-> new FenceBlock(copyProperties("polished_glowstone_brick_fence", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_FENCE_GATE = BLOCKS.register("polished_glowstone_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_glowstone_brick_fence_gate", POLISHED_GLOWSTONE_BRICKS.get())));
        CHISELED_POLISHED_GLOWSTONE_BRICKS = BLOCKS.register("chiseled_polished_glowstone_bricks", ()-> new Block(copyProperties("chiseled_polished_glowstone_bricks", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_PILLAR = BLOCKS.register("polished_glowstone_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_glowstone_brick_pillar", POLISHED_GLOWSTONE_BRICKS.get())));
        POLISHED_GLOWSTONE_BRICK_DOOR = BLOCKS.register("polished_glowstone_brick_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_brick_door", POLISHED_GLOWSTONE_BRICKS.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_BRICK_TRAPDOOR = BLOCKS.register("polished_glowstone_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_brick_trapdoor", POLISHED_GLOWSTONE_BRICKS.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_GLOWSTONE_BRICK_BUTTON = BLOCKS.register("polished_glowstone_brick_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_glowstone_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE = BLOCKS.register("polished_glowstone_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_glowstone_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_BRICK_LAMP = BLOCKS.register("polished_glowstone_brick_lamp", ()-> new Block(basicProperties("polished_glowstone_brick_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_GLOWSTONE_TILES = BLOCKS.register("polished_glowstone_tiles", ()-> new Block(copyProperties("polished_glowstone_tiles", POLISHED_GLOWSTONE_BRICKS.get())));
        CRACKED_POLISHED_GLOWSTONE_TILES = BLOCKS.register("cracked_polished_glowstone_tiles", ()-> new Block(copyProperties("cracked_polished_glowstone_tiles", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_STAIRS = BLOCKS.register("polished_glowstone_tile_stairs", ()-> new StairBlock(POLISHED_GLOWSTONE_TILES.get().defaultBlockState(), copyProperties("polished_glowstone_tile_stairs", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_SLAB = BLOCKS.register("polished_glowstone_tile_slab", ()-> new SlabBlock(copyProperties("polished_glowstone_tile_slab", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_WALL = BLOCKS.register("polished_glowstone_tile_wall", ()-> new WallBlock(copyProperties("polished_glowstone_tile_wall", POLISHED_GLOWSTONE_TILES.get()).forceSolidOn()));
        POLISHED_GLOWSTONE_TILE_FENCE = BLOCKS.register("polished_glowstone_tile_fence", ()-> new FenceBlock(copyProperties("polished_glowstone_tile_fence", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_FENCE_GATE = BLOCKS.register("polished_glowstone_tile_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_glowstone_tile_fence_gate", POLISHED_GLOWSTONE_TILES.get())));
        CHISELED_POLISHED_GLOWSTONE_TILES = BLOCKS.register("chiseled_polished_glowstone_tiles", ()-> new Block(copyProperties("chiseled_polished_glowstone_tiles", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_PILLAR = BLOCKS.register("polished_glowstone_tile_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_glowstone_tile_pillar", POLISHED_GLOWSTONE_TILES.get())));
        POLISHED_GLOWSTONE_TILE_DOOR = BLOCKS.register("polished_glowstone_tile_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_tile_door", POLISHED_GLOWSTONE_TILES.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_TILE_TRAPDOOR = BLOCKS.register("polished_glowstone_tile_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_glowstone_tile_trapdoor", POLISHED_GLOWSTONE_TILES.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_GLOWSTONE_TILE_BUTTON = BLOCKS.register("polished_glowstone_tile_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_glowstone_tile_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE = BLOCKS.register("polished_glowstone_tile_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_glowstone_tile_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GLOWSTONE_TILE_LAMP = BLOCKS.register("polished_glowstone_tile_lamp", ()-> new Block(basicProperties("polished_glowstone_tile_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_TUFF = BLOCKS.register("cracked_polished_tuff", ()-> new Block(copyProperties("cracked_polished_tuff", Blocks.POLISHED_TUFF)));
        POLISHED_TUFF_FENCE = BLOCKS.register("polished_tuff_fence", ()-> new FenceBlock(copyProperties("polished_tuff_fence", Blocks.POLISHED_TUFF)));
        POLISHED_TUFF_FENCE_GATE = BLOCKS.register("polished_tuff_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_tuff_fence_gate", Blocks.POLISHED_TUFF)));
        CHISELED_POLISHED_TUFF = BLOCKS.register("chiseled_polished_tuff", ()-> new Block(copyProperties("chiseled_polished_tuff", Blocks.POLISHED_TUFF)));
        POLISHED_TUFF_PILLAR = BLOCKS.register("polished_tuff_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_tuff_pillar", Blocks.POLISHED_TUFF)));
        POLISHED_TUFF_DOOR = BLOCKS.register("polished_tuff_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_tuff_door", Blocks.POLISHED_TUFF).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_TUFF_TRAPDOOR = BLOCKS.register("polished_tuff_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_tuff_trapdoor", Blocks.POLISHED_TUFF).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_TUFF_BUTTON = BLOCKS.register("polished_tuff_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_tuff_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_TUFF_PRESSURE_PLATE = BLOCKS.register("polished_tuff_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_tuff_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_TUFF_LAMP = BLOCKS.register("polished_tuff_lamp", ()-> new Block(basicProperties("polished_tuff_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_TUFF_BRICKS = BLOCKS.register("cracked_tuff_bricks", ()-> new Block(copyProperties("cracked_tuff_bricks", Blocks.TUFF_BRICKS)));
        TUFF_BRICK_FENCE = BLOCKS.register("tuff_brick_fence", ()-> new FenceBlock(copyProperties("tuff_brick_fence", Blocks.TUFF_BRICKS)));
        TUFF_BRICK_FENCE_GATE = BLOCKS.register("tuff_brick_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("tuff_brick_fence_gate", Blocks.TUFF_BRICKS)));
        TUFF_BRICK_PILLAR = BLOCKS.register("tuff_brick_pillar", ()-> new RotatedPillarBlock(copyProperties("tuff_brick_pillar", Blocks.TUFF_BRICKS)));
        TUFF_BRICK_DOOR = BLOCKS.register("tuff_brick_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("tuff_brick_door", Blocks.TUFF_BRICKS).noOcclusion().pushReaction(PushReaction.DESTROY)));
        TUFF_BRICK_TRAPDOOR = BLOCKS.register("tuff_brick_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("tuff_brick_trapdoor", Blocks.TUFF_BRICKS).noOcclusion().isValidSpawn(InspireBlocks::never)));
        TUFF_BRICK_BUTTON = BLOCKS.register("tuff_brick_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("tuff_brick_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        TUFF_BRICK_PRESSURE_PLATE = BLOCKS.register("tuff_brick_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("tuff_brick_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        TUFF_BRICK_LAMP = BLOCKS.register("tuff_brick_lamp", ()-> new Block(basicProperties("tuff_brick_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_QUARTZ = BLOCKS.register("cracked_quartz", ()-> new Block(copyProperties("cracked_quartz", Blocks.QUARTZ_BLOCK)));
        QUARTZ_WALL = BLOCKS.register("quartz_wall", ()-> new WallBlock(copyProperties("quartz_wall", Blocks.QUARTZ_BLOCK).forceSolidOn()));
        QUARTZ_FENCE = BLOCKS.register("quartz_fence", ()-> new FenceBlock(copyProperties("quartz_fence", Blocks.QUARTZ_BLOCK)));
        QUARTZ_FENCE_GATE = BLOCKS.register("quartz_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("quartz_fence_gate", Blocks.QUARTZ_BLOCK)));
        QUARTZ_DOOR = BLOCKS.register("quartz_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("quartz_door", Blocks.QUARTZ_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        QUARTZ_TRAPDOOR = BLOCKS.register("quartz_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("quartz_trapdoor", Blocks.QUARTZ_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        QUARTZ_BUTTON = BLOCKS.register("quartz_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("quartz_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_PRESSURE_PLATE = BLOCKS.register("quartz_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("quartz_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        QUARTZ_LAMP = BLOCKS.register("quartz_lamp", ()-> new Block(basicProperties("quartz_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_SMOOTH_QUARTZ = BLOCKS.register("cracked_smooth_quartz", ()-> new Block(copyProperties("cracked_smooth_quartz", Blocks.SMOOTH_QUARTZ)));
        SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall", ()-> new WallBlock(copyProperties("smooth_quartz_wall", Blocks.SMOOTH_QUARTZ).forceSolidOn()));
        SMOOTH_QUARTZ_FENCE = BLOCKS.register("smooth_quartz_fence", ()-> new FenceBlock(copyProperties("smooth_quartz_fence", Blocks.SMOOTH_QUARTZ)));
        SMOOTH_QUARTZ_FENCE_GATE = BLOCKS.register("smooth_quartz_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("smooth_quartz_fence_gate", Blocks.SMOOTH_QUARTZ)));
        CHISELED_SMOOTH_QUARTZ = BLOCKS.register("chiseled_smooth_quartz", ()-> new Block(copyProperties("chiseled_smooth_quartz", Blocks.SMOOTH_QUARTZ)));
        SMOOTH_QUARTZ_PILLAR = BLOCKS.register("smooth_quartz_pillar", ()-> new RotatedPillarBlock(copyProperties("smooth_quartz_pillar", Blocks.SMOOTH_QUARTZ)));
        SMOOTH_QUARTZ_DOOR = BLOCKS.register("smooth_quartz_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("smooth_quartz_door", Blocks.SMOOTH_QUARTZ).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SMOOTH_QUARTZ_TRAPDOOR = BLOCKS.register("smooth_quartz_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("smooth_quartz_trapdoor", Blocks.SMOOTH_QUARTZ).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SMOOTH_QUARTZ_BUTTON = BLOCKS.register("smooth_quartz_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("smooth_quartz_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_QUARTZ_PRESSURE_PLATE = BLOCKS.register("smooth_quartz_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("smooth_quartz_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SMOOTH_QUARTZ_LAMP = BLOCKS.register("smooth_quartz_lamp", ()-> new Block(basicProperties("smooth_quartz_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        RESIN = BLOCKS.register("resin", ()-> new Block(copyProperties("resin", Blocks.HONEYCOMB_BLOCK)));
        CRACKED_RESIN = BLOCKS.register("cracked_resin", ()-> new Block(copyProperties("cracked_resin", RESIN.get())));
        RESIN_STAIRS = BLOCKS.register("resin_stairs", ()-> new StairBlock(RESIN.get().defaultBlockState(), copyProperties("resin_stairs", RESIN.get())));
        RESIN_SLAB = BLOCKS.register("resin_slab", ()-> new SlabBlock(copyProperties("resin_slab", RESIN.get())));
        RESIN_WALL = BLOCKS.register("resin_wall", ()-> new WallBlock(copyProperties("resin_wall", RESIN.get()).forceSolidOn()));
        RESIN_FENCE = BLOCKS.register("resin_fence", ()-> new FenceBlock(copyProperties("resin_fence", RESIN.get())));
        RESIN_FENCE_GATE = BLOCKS.register("resin_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("resin_fence_gate", RESIN.get())));
        CHISELED_RESIN = BLOCKS.register("chiseled_resin", ()-> new Block(copyProperties("chiseled_resin", RESIN.get())));
        RESIN_PILLAR = BLOCKS.register("resin_pillar", ()-> new RotatedPillarBlock(copyProperties("resin_pillar", RESIN.get())));
        RESIN_DOOR = BLOCKS.register("resin_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("resin_door", RESIN.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        RESIN_TRAPDOOR = BLOCKS.register("resin_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("resin_trapdoor", RESIN.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        RESIN_BUTTON = BLOCKS.register("resin_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("resin_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RESIN_PRESSURE_PLATE = BLOCKS.register("resin_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("resin_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        RESIN_LAMP = BLOCKS.register("resin_lamp", ()-> new Block(basicProperties("resin_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_GRANITE = BLOCKS.register("cracked_polished_granite", ()-> new Block(copyProperties("cracked_polished_granite", Blocks.POLISHED_GRANITE)));
        POLISHED_GRANITE_WALL = BLOCKS.register("polished_granite_wall", ()-> new WallBlock(copyProperties("polished_granite_wall", Blocks.POLISHED_GRANITE).forceSolidOn()));
        POLISHED_GRANITE_FENCE = BLOCKS.register("polished_granite_fence", ()-> new FenceBlock(copyProperties("polished_granite_fence", Blocks.POLISHED_GRANITE)));
        POLISHED_GRANITE_FENCE_GATE = BLOCKS.register("polished_granite_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_granite_fence_gate", Blocks.POLISHED_GRANITE)));
        CHISELED_POLISHED_GRANITE = BLOCKS.register("chiseled_polished_granite", ()-> new Block(copyProperties("chiseled_polished_granite", Blocks.POLISHED_GRANITE)));
        POLISHED_GRANITE_PILLAR = BLOCKS.register("polished_granite_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_granite_pillar", Blocks.POLISHED_GRANITE)));
        POLISHED_GRANITE_DOOR = BLOCKS.register("polished_granite_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_granite_door", Blocks.POLISHED_GRANITE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_GRANITE_TRAPDOOR = BLOCKS.register("polished_granite_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_granite_trapdoor", Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_GRANITE_BUTTON = BLOCKS.register("polished_granite_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_granite_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GRANITE_PRESSURE_PLATE = BLOCKS.register("polished_granite_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_granite_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_GRANITE_LAMP = BLOCKS.register("polished_granite_lamp", ()-> new Block(basicProperties("polished_granite_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_DIORITE = BLOCKS.register("cracked_polished_diorite", ()-> new Block(copyProperties("cracked_polished_diorite", Blocks.POLISHED_DIORITE)));
        POLISHED_DIORITE_WALL = BLOCKS.register("polished_diorite_wall", ()-> new WallBlock(copyProperties("polished_diorite_wall", Blocks.POLISHED_DIORITE).forceSolidOn()));
        POLISHED_DIORITE_FENCE = BLOCKS.register("polished_diorite_fence", ()-> new FenceBlock(copyProperties("polished_diorite_fence", Blocks.POLISHED_DIORITE)));
        POLISHED_DIORITE_FENCE_GATE = BLOCKS.register("polished_diorite_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_diorite_fence_gate", Blocks.POLISHED_DIORITE)));
        CHISELED_POLISHED_DIORITE = BLOCKS.register("chiseled_polished_diorite", ()-> new Block(copyProperties("chiseled_polished_diorite", Blocks.POLISHED_DIORITE)));
        POLISHED_DIORITE_PILLAR = BLOCKS.register("polished_diorite_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_diorite_pillar", Blocks.POLISHED_DIORITE)));
        POLISHED_DIORITE_DOOR = BLOCKS.register("polished_diorite_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_diorite_door", Blocks.POLISHED_DIORITE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_DIORITE_TRAPDOOR = BLOCKS.register("polished_diorite_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_diorite_trapdoor", Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_DIORITE_BUTTON = BLOCKS.register("polished_diorite_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_diorite_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_DIORITE_PRESSURE_PLATE = BLOCKS.register("polished_diorite_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_diorite_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_DIORITE_LAMP = BLOCKS.register("polished_diorite_lamp", ()-> new Block(basicProperties("polished_diorite_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_POLISHED_ANDESITE = BLOCKS.register("cracked_polished_andesite", ()-> new Block(copyProperties("cracked_polished_andesite", Blocks.POLISHED_ANDESITE)));
        POLISHED_ANDESITE_WALL = BLOCKS.register("polished_andesite_wall", ()-> new WallBlock(copyProperties("polished_andesite_wall", Blocks.POLISHED_ANDESITE).forceSolidOn()));
        POLISHED_ANDESITE_FENCE = BLOCKS.register("polished_andesite_fence", ()-> new FenceBlock(copyProperties("polished_andesite_fence", Blocks.POLISHED_ANDESITE)));
        POLISHED_ANDESITE_FENCE_GATE = BLOCKS.register("polished_andesite_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_andesite_fence_gate", Blocks.POLISHED_ANDESITE)));
        CHISELED_POLISHED_ANDESITE = BLOCKS.register("chiseled_polished_andesite", ()-> new Block(copyProperties("chiseled_polished_andesite", Blocks.POLISHED_ANDESITE)));
        POLISHED_ANDESITE_PILLAR = BLOCKS.register("polished_andesite_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_andesite_pillar", Blocks.POLISHED_ANDESITE)));
        POLISHED_ANDESITE_DOOR = BLOCKS.register("polished_andesite_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_andesite_door", Blocks.POLISHED_ANDESITE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_ANDESITE_TRAPDOOR = BLOCKS.register("polished_andesite_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_andesite_trapdoor", Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_ANDESITE_BUTTON = BLOCKS.register("polished_andesite_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_andesite_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_ANDESITE_PRESSURE_PLATE = BLOCKS.register("polished_andesite_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_andesite_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_ANDESITE_LAMP = BLOCKS.register("polished_andesite_lamp", ()-> new Block(basicProperties("polished_andesite_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_SANDSTONE = BLOCKS.register("cracked_sandstone", ()-> new Block(copyProperties("cracked_sandstone", Blocks.SANDSTONE)));
        SANDSTONE_FENCE = BLOCKS.register("sandstone_fence", ()-> new FenceBlock(copyProperties("sandstone_fence", Blocks.SANDSTONE)));
        SANDSTONE_FENCE_GATE = BLOCKS.register("sandstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("sandstone_fence_gate", Blocks.SANDSTONE)));
        SANDSTONE_PILLAR = BLOCKS.register("sandstone_pillar", ()-> new RotatedPillarBlock(copyProperties("sandstone_pillar", Blocks.SANDSTONE)));
        SANDSTONE_DOOR = BLOCKS.register("sandstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("sandstone_door", Blocks.SANDSTONE).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SANDSTONE_TRAPDOOR = BLOCKS.register("sandstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("sandstone_trapdoor", Blocks.SANDSTONE).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SANDSTONE_BUTTON = BLOCKS.register("sandstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("sandstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SANDSTONE_PRESSURE_PLATE = BLOCKS.register("sandstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("sandstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SANDSTONE_LAMP = BLOCKS.register("sandstone_lamp", ()-> new Block(basicProperties("sandstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_IRON_BLOCK = BLOCKS.register("cracked_iron_block", ()-> new Block(copyProperties("cracked_iron_block", Blocks.IRON_BLOCK)));
        IRON_BLOCK_STAIRS = BLOCKS.register("iron_block_stairs", ()-> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), copyProperties("iron_block_stairs", Blocks.IRON_BLOCK)));
        IRON_BLOCK_SLAB = BLOCKS.register("iron_block_slab", ()-> new SlabBlock(copyProperties("iron_block_slab", Blocks.IRON_BLOCK)));
        IRON_BLOCK_WALL = BLOCKS.register("iron_block_wall", ()-> new WallBlock(copyProperties("iron_block_wall", Blocks.IRON_BLOCK).forceSolidOn()));
        IRON_BLOCK_FENCE = BLOCKS.register("iron_block_fence", ()-> new FenceBlock(copyProperties("iron_block_fence", Blocks.IRON_BLOCK)));
        IRON_BLOCK_FENCE_GATE = BLOCKS.register("iron_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("iron_block_fence_gate", Blocks.IRON_BLOCK)));
        CHISELED_IRON_BLOCK = BLOCKS.register("chiseled_iron_block", ()-> new Block(copyProperties("chiseled_iron_block", Blocks.IRON_BLOCK)));
        IRON_BLOCK_PILLAR = BLOCKS.register("iron_block_pillar", ()-> new RotatedPillarBlock(copyProperties("iron_block_pillar", Blocks.IRON_BLOCK)));
        IRON_BLOCK_DOOR = BLOCKS.register("iron_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("iron_block_door", Blocks.IRON_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        IRON_BLOCK_TRAPDOOR = BLOCKS.register("iron_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("iron_block_trapdoor", Blocks.IRON_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        IRON_BLOCK_BUTTON = BLOCKS.register("iron_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("iron_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        IRON_BLOCK_PRESSURE_PLATE = BLOCKS.register("iron_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("iron_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        IRON_BLOCK_LAMP = BLOCKS.register("iron_block_lamp", ()-> new Block(basicProperties("iron_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_GOLD_BLOCK = BLOCKS.register("cracked_gold_block", ()-> new Block(copyProperties("cracked_gold_block", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_STAIRS = BLOCKS.register("gold_block_stairs", ()-> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), copyProperties("gold_block_stairs", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_SLAB = BLOCKS.register("gold_block_slab", ()-> new SlabBlock(copyProperties("gold_block_slab", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_WALL = BLOCKS.register("gold_block_wall", ()-> new WallBlock(copyProperties("gold_block_wall", Blocks.GOLD_BLOCK).forceSolidOn()));
        GOLD_BLOCK_FENCE = BLOCKS.register("gold_block_fence", ()-> new FenceBlock(copyProperties("gold_block_fence", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_FENCE_GATE = BLOCKS.register("gold_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("gold_block_fence_gate", Blocks.GOLD_BLOCK)));
        CHISELED_GOLD_BLOCK = BLOCKS.register("chiseled_gold_block", ()-> new Block(copyProperties("chiseled_gold_block", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_PILLAR = BLOCKS.register("gold_block_pillar", ()-> new RotatedPillarBlock(copyProperties("gold_block_pillar", Blocks.GOLD_BLOCK)));
        GOLD_BLOCK_DOOR = BLOCKS.register("gold_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("gold_block_door", Blocks.GOLD_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        GOLD_BLOCK_TRAPDOOR = BLOCKS.register("gold_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("gold_block_trapdoor", Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        GOLD_BLOCK_BUTTON = BLOCKS.register("gold_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("gold_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GOLD_BLOCK_PRESSURE_PLATE = BLOCKS.register("gold_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("gold_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        GOLD_BLOCK_LAMP = BLOCKS.register("gold_block_lamp", ()-> new Block(basicProperties("gold_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_EMERALD_BLOCK = BLOCKS.register("cracked_emerald_block", ()-> new Block(copyProperties("cracked_emerald_block", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_STAIRS = BLOCKS.register("emerald_block_stairs", ()-> new StairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), copyProperties("emerald_block_stairs", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_SLAB = BLOCKS.register("emerald_block_slab", ()-> new SlabBlock(copyProperties("emerald_block_slab", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_WALL = BLOCKS.register("emerald_block_wall", ()-> new WallBlock(copyProperties("emerald_block_wall", Blocks.EMERALD_BLOCK).forceSolidOn()));
        EMERALD_BLOCK_FENCE = BLOCKS.register("emerald_block_fence", ()-> new FenceBlock(copyProperties("emerald_block_fence", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_FENCE_GATE = BLOCKS.register("emerald_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("emerald_block_fence_gate", Blocks.EMERALD_BLOCK)));
        CHISELED_EMERALD_BLOCK = BLOCKS.register("chiseled_emerald_block", ()-> new Block(copyProperties("chiseled_emerald_block", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_PILLAR = BLOCKS.register("emerald_block_pillar", ()-> new RotatedPillarBlock(copyProperties("emerald_block_pillar", Blocks.EMERALD_BLOCK)));
        EMERALD_BLOCK_DOOR = BLOCKS.register("emerald_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("emerald_block_door", Blocks.EMERALD_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        EMERALD_BLOCK_TRAPDOOR = BLOCKS.register("emerald_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("emerald_block_trapdoor", Blocks.EMERALD_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        EMERALD_BLOCK_BUTTON = BLOCKS.register("emerald_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("emerald_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        EMERALD_BLOCK_PRESSURE_PLATE = BLOCKS.register("emerald_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("emerald_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        EMERALD_BLOCK_LAMP = BLOCKS.register("emerald_block_lamp", ()-> new Block(basicProperties("emerald_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_DIAMOND_BLOCK = BLOCKS.register("cracked_diamond_block", ()-> new Block(copyProperties("cracked_diamond_block", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_STAIRS = BLOCKS.register("diamond_block_stairs", ()-> new StairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), copyProperties("diamond_block_stairs", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_SLAB = BLOCKS.register("diamond_block_slab", ()-> new SlabBlock(copyProperties("diamond_block_slab", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_WALL = BLOCKS.register("diamond_block_wall", ()-> new WallBlock(copyProperties("diamond_block_wall", Blocks.DIAMOND_BLOCK).forceSolidOn()));
        DIAMOND_BLOCK_FENCE = BLOCKS.register("diamond_block_fence", ()-> new FenceBlock(copyProperties("diamond_block_fence", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_FENCE_GATE = BLOCKS.register("diamond_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("diamond_block_fence_gate", Blocks.DIAMOND_BLOCK)));
        CHISELED_DIAMOND_BLOCK = BLOCKS.register("chiseled_diamond_block", ()-> new Block(copyProperties("chiseled_diamond_block", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_PILLAR = BLOCKS.register("diamond_block_pillar", ()-> new RotatedPillarBlock(copyProperties("diamond_block_pillar", Blocks.DIAMOND_BLOCK)));
        DIAMOND_BLOCK_DOOR = BLOCKS.register("diamond_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("diamond_block_door", Blocks.DIAMOND_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        DIAMOND_BLOCK_TRAPDOOR = BLOCKS.register("diamond_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("diamond_block_trapdoor", Blocks.DIAMOND_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        DIAMOND_BLOCK_BUTTON = BLOCKS.register("diamond_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("diamond_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DIAMOND_BLOCK_PRESSURE_PLATE = BLOCKS.register("diamond_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("diamond_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DIAMOND_BLOCK_LAMP = BLOCKS.register("diamond_block_lamp", ()-> new Block(basicProperties("diamond_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_NETHERITE_BLOCK = BLOCKS.register("cracked_netherite_block", ()-> new Block(copyProperties("cracked_netherite_block", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_STAIRS = BLOCKS.register("netherite_block_stairs", ()-> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), copyProperties("netherite_block_stairs", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_SLAB = BLOCKS.register("netherite_block_slab", ()-> new SlabBlock(copyProperties("netherite_block_slab", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_WALL = BLOCKS.register("netherite_block_wall", ()-> new WallBlock(copyProperties("netherite_block_wall", Blocks.NETHERITE_BLOCK).forceSolidOn()));
        NETHERITE_BLOCK_FENCE = BLOCKS.register("netherite_block_fence", ()-> new FenceBlock(copyProperties("netherite_block_fence", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_FENCE_GATE = BLOCKS.register("netherite_block_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("netherite_block_fence_gate", Blocks.NETHERITE_BLOCK)));
        CHISELED_NETHERITE_BLOCK = BLOCKS.register("chiseled_netherite_block", ()-> new Block(copyProperties("chiseled_netherite_block", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_PILLAR = BLOCKS.register("netherite_block_pillar", ()-> new RotatedPillarBlock(copyProperties("netherite_block_pillar", Blocks.NETHERITE_BLOCK)));
        NETHERITE_BLOCK_DOOR = BLOCKS.register("netherite_block_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("netherite_block_door", Blocks.NETHERITE_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        NETHERITE_BLOCK_TRAPDOOR = BLOCKS.register("netherite_block_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("netherite_block_trapdoor", Blocks.NETHERITE_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        NETHERITE_BLOCK_BUTTON = BLOCKS.register("netherite_block_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("netherite_block_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHERITE_BLOCK_PRESSURE_PLATE = BLOCKS.register("netherite_block_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("netherite_block_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        NETHERITE_BLOCK_LAMP = BLOCKS.register("netherite_block_lamp", ()-> new Block(basicProperties("netherite_block_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_OBSIDIAN = BLOCKS.register("cracked_obsidian", ()-> new Block(copyProperties("cracked_obsidian", Blocks.OBSIDIAN)));
        OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs", ()-> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(), copyProperties("obsidian_stairs", Blocks.OBSIDIAN)));
        OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab", ()-> new SlabBlock(copyProperties("obsidian_slab", Blocks.OBSIDIAN)));
        OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", ()-> new WallBlock(copyProperties("obsidian_wall", Blocks.OBSIDIAN).forceSolidOn()));
        OBSIDIAN_FENCE = BLOCKS.register("obsidian_fence", ()-> new FenceBlock(copyProperties("obsidian_fence", Blocks.OBSIDIAN)));
        OBSIDIAN_FENCE_GATE = BLOCKS.register("obsidian_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("obsidian_fence_gate", Blocks.OBSIDIAN)));
        CHISELED_OBSIDIAN = BLOCKS.register("chiseled_obsidian", ()-> new Block(copyProperties("chiseled_obsidian", Blocks.OBSIDIAN)));
        OBSIDIAN_PILLAR = BLOCKS.register("obsidian_pillar", ()-> new RotatedPillarBlock(copyProperties("obsidian_pillar", Blocks.OBSIDIAN)));
        OBSIDIAN_DOOR = BLOCKS.register("obsidian_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("obsidian_door", Blocks.OBSIDIAN).noOcclusion().pushReaction(PushReaction.DESTROY)));
        OBSIDIAN_TRAPDOOR = BLOCKS.register("obsidian_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("obsidian_trapdoor", Blocks.OBSIDIAN).noOcclusion().isValidSpawn(InspireBlocks::never)));
        OBSIDIAN_BUTTON = BLOCKS.register("obsidian_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("obsidian_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("obsidian_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("obsidian_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        OBSIDIAN_LAMP = BLOCKS.register("obsidian_lamp", ()-> new Block(basicProperties("obsidian_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_CRYING_OBSIDIAN = BLOCKS.register("cracked_crying_obsidian", ()-> new Block(copyProperties("cracked_crying_obsidian", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs", ()-> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(), copyProperties("crying_obsidian_stairs", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_SLAB = BLOCKS.register("crying_obsidian_slab", ()-> new SlabBlock(copyProperties("crying_obsidian_slab", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", ()-> new WallBlock(copyProperties("crying_obsidian_wall", Blocks.CRYING_OBSIDIAN).forceSolidOn()));
        CRYING_OBSIDIAN_FENCE = BLOCKS.register("crying_obsidian_fence", ()-> new FenceBlock(copyProperties("crying_obsidian_fence", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_FENCE_GATE = BLOCKS.register("crying_obsidian_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("crying_obsidian_fence_gate", Blocks.CRYING_OBSIDIAN)));
        CHISELED_CRYING_OBSIDIAN = BLOCKS.register("chiseled_crying_obsidian", ()-> new Block(copyProperties("chiseled_crying_obsidian", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_PILLAR = BLOCKS.register("crying_obsidian_pillar", ()-> new RotatedPillarBlock(copyProperties("crying_obsidian_pillar", Blocks.CRYING_OBSIDIAN)));
        CRYING_OBSIDIAN_DOOR = BLOCKS.register("crying_obsidian_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("crying_obsidian_door", Blocks.CRYING_OBSIDIAN).noOcclusion().pushReaction(PushReaction.DESTROY)));
        CRYING_OBSIDIAN_TRAPDOOR = BLOCKS.register("crying_obsidian_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("crying_obsidian_trapdoor", Blocks.CRYING_OBSIDIAN).noOcclusion().isValidSpawn(InspireBlocks::never)));
        CRYING_OBSIDIAN_BUTTON = BLOCKS.register("crying_obsidian_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("crying_obsidian_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CRYING_OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("crying_obsidian_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("crying_obsidian_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        CRYING_OBSIDIAN_LAMP = BLOCKS.register("crying_obsidian_lamp", ()-> new Block(basicProperties("crying_obsidian_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_BEDROCK = BLOCKS.register("cracked_bedrock", ()-> new Block(copyProperties("cracked_bedrock", Blocks.BEDROCK)));
        BEDROCK_STAIRS = BLOCKS.register("bedrock_stairs", ()-> new StairBlock(Blocks.BEDROCK.defaultBlockState(), copyProperties("bedrock_stairs", Blocks.BEDROCK)));
        BEDROCK_SLAB = BLOCKS.register("bedrock_slab", ()-> new SlabBlock(copyProperties("bedrock_slab", Blocks.BEDROCK)));
        BEDROCK_WALL = BLOCKS.register("bedrock_wall", ()-> new WallBlock(copyProperties("bedrock_wall", Blocks.BEDROCK).forceSolidOn()));
        BEDROCK_FENCE = BLOCKS.register("bedrock_fence", ()-> new FenceBlock(copyProperties("bedrock_fence", Blocks.BEDROCK)));
        BEDROCK_FENCE_GATE = BLOCKS.register("bedrock_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("bedrock_fence_gate", Blocks.BEDROCK)));
        CHISELED_BEDROCK = BLOCKS.register("chiseled_bedrock", ()-> new Block(copyProperties("chiseled_bedrock", Blocks.BEDROCK)));
        BEDROCK_PILLAR = BLOCKS.register("bedrock_pillar", ()-> new RotatedPillarBlock(copyProperties("bedrock_pillar", Blocks.BEDROCK)));
        BEDROCK_DOOR = BLOCKS.register("bedrock_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("bedrock_door", Blocks.BEDROCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        BEDROCK_TRAPDOOR = BLOCKS.register("bedrock_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("bedrock_trapdoor", Blocks.BEDROCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        BEDROCK_BUTTON = BLOCKS.register("bedrock_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("bedrock_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BEDROCK_PRESSURE_PLATE = BLOCKS.register("bedrock_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("bedrock_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        BEDROCK_LAMP = BLOCKS.register("bedrock_lamp", ()-> new Block(basicProperties("bedrock_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        SOUL_SANDSTONE = BLOCKS.register("soul_sandstone", ()-> new Block(copyProperties("soul_sandstone", Blocks.SANDSTONE)));
        CRACKED_SOUL_SANDSTONE = BLOCKS.register("cracked_soul_sandstone", ()-> new Block(copyProperties("cracked_soul_sandstone", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_STAIRS = BLOCKS.register("soul_sandstone_stairs", ()-> new StairBlock(SOUL_SANDSTONE.get().defaultBlockState(), copyProperties("soul_sandstone_stairs", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_SLAB = BLOCKS.register("soul_sandstone_slab", ()-> new SlabBlock(copyProperties("soul_sandstone_slab", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_WALL = BLOCKS.register("soul_sandstone_wall", ()-> new WallBlock(copyProperties("soul_sandstone_wall", SOUL_SANDSTONE.get()).forceSolidOn()));
        SOUL_SANDSTONE_FENCE = BLOCKS.register("soul_sandstone_fence", ()-> new FenceBlock(copyProperties("soul_sandstone_fence", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_FENCE_GATE = BLOCKS.register("soul_sandstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("soul_sandstone_fence_gate", SOUL_SANDSTONE.get())));
        CHISELED_SOUL_SANDSTONE = BLOCKS.register("chiseled_soul_sandstone", ()-> new Block(copyProperties("chiseled_soul_sandstone", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_PILLAR = BLOCKS.register("soul_sandstone_pillar", ()-> new RotatedPillarBlock(copyProperties("soul_sandstone_pillar", SOUL_SANDSTONE.get())));
        SOUL_SANDSTONE_DOOR = BLOCKS.register("soul_sandstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("soul_sandstone_door", SOUL_SANDSTONE.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SOUL_SANDSTONE_TRAPDOOR = BLOCKS.register("soul_sandstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("soul_sandstone_trapdoor", SOUL_SANDSTONE.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SOUL_SANDSTONE_BUTTON = BLOCKS.register("soul_sandstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("soul_sandstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SOUL_SANDSTONE_PRESSURE_PLATE = BLOCKS.register("soul_sandstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("soul_sandstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SOUL_SANDSTONE_LAMP = BLOCKS.register("soul_sandstone_lamp", ()-> new Block(basicProperties("soul_sandstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        SOUL_SLATE = BLOCKS.register("soul_slate", ()-> new Block(copyProperties("soul_slate", Blocks.DEEPSLATE)));
        CRACKED_SOUL_SLATE = BLOCKS.register("cracked_soul_slate", ()-> new Block(copyProperties("cracked_soul_slate", SOUL_SLATE.get())));
        SOUL_SLATE_STAIRS = BLOCKS.register("soul_slate_stairs", ()-> new StairBlock(SOUL_SLATE.get().defaultBlockState(), copyProperties("soul_slate_stairs", SOUL_SLATE.get())));
        SOUL_SLATE_SLAB = BLOCKS.register("soul_slate_slab", ()-> new SlabBlock(copyProperties("soul_slate_slab", SOUL_SLATE.get())));
        SOUL_SLATE_WALL = BLOCKS.register("soul_slate_wall", ()-> new WallBlock(copyProperties("soul_slate_wall", SOUL_SLATE.get()).forceSolidOn()));
        SOUL_SLATE_FENCE = BLOCKS.register("soul_slate_fence", ()-> new FenceBlock(copyProperties("soul_slate_fence", SOUL_SLATE.get())));
        SOUL_SLATE_FENCE_GATE = BLOCKS.register("soul_slate_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("soul_slate_fence_gate", SOUL_SLATE.get())));
        CHISELED_SOUL_SLATE = BLOCKS.register("chiseled_soul_slate", ()-> new Block(copyProperties("chiseled_soul_slate", SOUL_SLATE.get())));
        SOUL_SLATE_PILLAR = BLOCKS.register("soul_slate_pillar", ()-> new RotatedPillarBlock(copyProperties("soul_slate_pillar", SOUL_SLATE.get())));
        SOUL_SLATE_DOOR = BLOCKS.register("soul_slate_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("soul_slate_door", SOUL_SLATE.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        SOUL_SLATE_TRAPDOOR = BLOCKS.register("soul_slate_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("soul_slate_trapdoor", SOUL_SLATE.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        SOUL_SLATE_BUTTON = BLOCKS.register("soul_slate_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("soul_slate_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SOUL_SLATE_PRESSURE_PLATE = BLOCKS.register("soul_slate_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("soul_slate_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        SOUL_SLATE_LAMP = BLOCKS.register("soul_slate_lamp", ()-> new Block(basicProperties("soul_slate_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        CRACKED_DRIPSTONE = BLOCKS.register("cracked_dripstone", ()-> new Block(copyProperties("cracked_dripstone", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_STAIRS = BLOCKS.register("dripstone_stairs", ()-> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), copyProperties("dripstone_stairs", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_SLAB = BLOCKS.register("dripstone_slab", ()-> new SlabBlock(copyProperties("dripstone_slab", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_WALL = BLOCKS.register("dripstone_wall", ()-> new WallBlock(copyProperties("dripstone_wall", Blocks.DRIPSTONE_BLOCK).forceSolidOn()));
        DRIPSTONE_FENCE = BLOCKS.register("dripstone_fence", ()-> new FenceBlock(copyProperties("dripstone_fence", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_FENCE_GATE = BLOCKS.register("dripstone_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("dripstone_fence_gate", Blocks.DRIPSTONE_BLOCK)));
        CHISELED_DRIPSTONE = BLOCKS.register("chiseled_dripstone", ()-> new Block(copyProperties("chiseled_dripstone", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_PILLAR = BLOCKS.register("dripstone_pillar", ()-> new RotatedPillarBlock(copyProperties("dripstone_pillar", Blocks.DRIPSTONE_BLOCK)));
        DRIPSTONE_DOOR = BLOCKS.register("dripstone_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("dripstone_door", Blocks.DRIPSTONE_BLOCK).noOcclusion().pushReaction(PushReaction.DESTROY)));
        DRIPSTONE_TRAPDOOR = BLOCKS.register("dripstone_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("dripstone_trapdoor", Blocks.DRIPSTONE_BLOCK).noOcclusion().isValidSpawn(InspireBlocks::never)));
        DRIPSTONE_BUTTON = BLOCKS.register("dripstone_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("dripstone_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DRIPSTONE_PRESSURE_PLATE = BLOCKS.register("dripstone_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("dripstone_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        DRIPSTONE_LAMP = BLOCKS.register("dripstone_lamp", ()-> new Block(basicProperties("dripstone_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

        POLISHED_CALCITE = BLOCKS.register("polished_calcite", ()-> new Block(copyProperties("polished_calcite", Blocks.CALCITE)));
        CRACKED_POLISHED_CALCITE = BLOCKS.register("cracked_polished_calcite", ()-> new Block(copyProperties("cracked_polished_calcite", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_STAIRS = BLOCKS.register("polished_calcite_stairs", ()-> new StairBlock(POLISHED_CALCITE.get().defaultBlockState(), copyProperties("polished_calcite_stairs", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_SLAB = BLOCKS.register("polished_calcite_slab", ()-> new SlabBlock(copyProperties("polished_calcite_slab", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_WALL = BLOCKS.register("polished_calcite_wall", ()-> new WallBlock(copyProperties("polished_calcite_wall", POLISHED_CALCITE.get()).forceSolidOn()));
        POLISHED_CALCITE_FENCE = BLOCKS.register("polished_calcite_fence", ()-> new FenceBlock(copyProperties("polished_calcite_fence", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_FENCE_GATE = BLOCKS.register("polished_calcite_fence_gate", ()-> new FenceGateBlock(WoodType.ACACIA, copyProperties("polished_calcite_fence_gate", POLISHED_CALCITE.get())));
        CHISELED_POLISHED_CALCITE = BLOCKS.register("chiseled_polished_calcite", ()-> new Block(copyProperties("chiseled_polished_calcite", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_PILLAR = BLOCKS.register("polished_calcite_pillar", ()-> new RotatedPillarBlock(copyProperties("polished_calcite_pillar", POLISHED_CALCITE.get())));
        POLISHED_CALCITE_DOOR = BLOCKS.register("polished_calcite_door", ()-> new DoorBlock(BlockSetType.STONE, copyProperties("polished_calcite_door", POLISHED_CALCITE.get()).noOcclusion().pushReaction(PushReaction.DESTROY)));
        POLISHED_CALCITE_TRAPDOOR = BLOCKS.register("polished_calcite_trapdoor", ()-> new TrapDoorBlock(BlockSetType.STONE, copyProperties("polished_calcite_trapdoor", POLISHED_CALCITE.get()).noOcclusion().isValidSpawn(InspireBlocks::never)));
        POLISHED_CALCITE_BUTTON = BLOCKS.register("polished_calcite_button", ()-> new ButtonBlock(BlockSetType.STONE, 20, basicProperties("polished_calcite_button").strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_CALCITE_PRESSURE_PLATE = BLOCKS.register("polished_calcite_pressure_plate", ()-> new PressurePlateBlock(BlockSetType.STONE, basicProperties("polished_calcite_pressure_plate").forceSolidOn().strength(0.5F).pushReaction(PushReaction.DESTROY)));
        POLISHED_CALCITE_LAMP = BLOCKS.register("polished_calcite_lamp", ()-> new Block(basicProperties("polished_calcite_lamp").strength(0.3F).sound(SoundType.GLASS).lightLevel(s -> 15)));

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

        HYDRO_FIRE = BLOCKS.register("hydro_fire", () ->
                new HydroFireBlock(BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(litBlockEmission(10)).sound(SoundType.WOOL)));
        SOULSTONE_WIRE = BLOCKS.register("soulstone_wire", () ->
                new SoulstoneWireBlock(BlockBehaviour.Properties.of().noCollission().instabreak()));
        THIN_ICE = BLOCKS.register("thin_ice", () ->
                new ThinIceBlock(BlockBehaviour.Properties.of().friction(0.98F).randomTicks().noOcclusion().isValidSpawn(InspireBlocks::never)));
        UNSTABLE_COBBLESTONE = BLOCKS.register("unstable_cobblestone", () ->
                new UnstableBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

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
        WET_SAND = BLOCKS.register("wet_sand", () -> new WetSandBlock(basicProperties("wet_sand").mapColor(MapColor.DIRT).randomTicks()));
        WARPED_SOUL_SOIL = BLOCKS.register("warped_soul_soil", () -> new NyliumBlock(basicProperties("warped_soul_soil").mapColor(MapColor.DIRT)));
        CRIMSON_SOUL_SOIL = BLOCKS.register("crimson_soul_soil", () -> new NyliumBlock(basicProperties("crimson_soul_soil").mapColor(MapColor.DIRT)));
        CUT_SOUL_SANDSTONE = BLOCKS.register("cut_soul_sandstone", () -> new Block(basicProperties("cut_soul_sandstone").mapColor(MapColor.DIRT)));
    }

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    private static BlockBehaviour.Properties basicProperties(String name) {
        // setId() is not available in Minecraft 1.21.1
        return BlockBehaviour.Properties.of();
    }
    public static ToIntFunction<BlockState> brightnessBlockEmission() {
        return (blockState) -> (Integer) blockState.getValue(InspireBlockStateProperties.BRIGHTNESS);
    }
    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return state -> state.hasProperty(net.minecraft.world.level.block.state.properties.BlockStateProperties.LIT)
                ? (state.getValue(net.minecraft.world.level.block.state.properties.BlockStateProperties.LIT) ? lightLevel : 0)
                : lightLevel;
    }
    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }
    private static RotatedPillarBlock netherLog(MapColor mapColor) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(mapColor).strength(2.0F).sound(SoundType.WOOD));
    }

    @SuppressWarnings("deprecation")
    private static BlockBehaviour.Properties copyProperties(String name, Block block) {
        // setId() is not available in Minecraft 1.21.1
        return BlockBehaviour.Properties.ofLegacyCopy(block);
    }
}
