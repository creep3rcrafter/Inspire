package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.item.PortableJukeboxItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

public class InspireItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(InspireCommon.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<Item> MUSIC_DISC_A_FAMILIAR_ROOM;
    public static final RegistrySupplier<Item> MUSIC_DISC_AERIE;
    public static final RegistrySupplier<Item> MUSIC_DISC_ANCESTRY;
    public static final RegistrySupplier<Item> MUSIC_DISC_ARIA_MATH;
    public static final RegistrySupplier<Item> MUSIC_DISC_BIOME_FEST;
    public static final RegistrySupplier<Item> MUSIC_DISC_BLIND_SPOTS;
    public static final RegistrySupplier<Item> MUSIC_DISC_CLARK;
    public static final RegistrySupplier<Item> MUSIC_DISC_COMFORTING_MEMORIES;
    public static final RegistrySupplier<Item> MUSIC_DISC_DANNY;
    public static final RegistrySupplier<Item> MUSIC_DISC_DREITON;
    public static final RegistrySupplier<Item> MUSIC_DISC_DRY_HANDS;
    public static final RegistrySupplier<Item> MUSIC_DISC_FEATHERFALL;
    public static final RegistrySupplier<Item> MUSIC_DISC_FLOATING_DREAM;
    public static final RegistrySupplier<Item> MUSIC_DISC_HAGGSTROM;
    public static final RegistrySupplier<Item> MUSIC_DISC_HAUNT_MUSKIE;
    public static final RegistrySupplier<Item> MUSIC_DISC_KEY;
    public static final RegistrySupplier<Item> MUSIC_DISC_KOMOREBI;
    public static final RegistrySupplier<Item> MUSIC_DISC_LEFT_TO_BLOOM;
    public static final RegistrySupplier<Item> MUSIC_DISC_LIVING_MICE;
    public static final RegistrySupplier<Item> MUSIC_DISC_MICE_ON_VENUS;
    public static final RegistrySupplier<Item> MUSIC_DISC_MINECRAFT;
    public static final RegistrySupplier<Item> MUSIC_DISC_ONE_MORE_DAY;
    public static final RegistrySupplier<Item> MUSIC_DISC_OXYGENE;
    public static final RegistrySupplier<Item> MUSIC_DISC_PUZZLEBOX;
    public static final RegistrySupplier<Item> MUSIC_DISC_SUBWOOFER_LULLABY;
    public static final RegistrySupplier<Item> MUSIC_DISC_SWEDEN;
    public static final RegistrySupplier<Item> MUSIC_DISC_TASWELL;
    public static final RegistrySupplier<Item> MUSIC_DISC_WATCHER;
    public static final RegistrySupplier<Item> MUSIC_DISC_WET_HANDS;
    public static final RegistrySupplier<Item> MUSIC_DISC_YAKUSOKU;
    public static final RegistrySupplier<Item> MUSIC_DISC_BALLAD_OF_THE_CATS;
    public static final RegistrySupplier<Item> MUSIC_DISC_CHRYSAPOEIA;
    public static final RegistrySupplier<Item> MUSIC_DISC_CONCRETE_HALLS;
    public static final RegistrySupplier<Item> MUSIC_DISC_DEAD_VOXEL;
    public static final RegistrySupplier<Item> MUSIC_DISC_RUBEDO;
    public static final RegistrySupplier<Item> MUSIC_DISC_SO_BELOW;
    public static final RegistrySupplier<Item> MUSIC_DISC_WARMTH;
    public static final RegistrySupplier<Item> MUSIC_DISC_BOSS;
    public static final RegistrySupplier<Item> MUSIC_DISC_ALPHA;
    public static final RegistrySupplier<Item> MUSIC_DISC_THE_END;
    public static final RegistrySupplier<Item> MUSIC_DISC_BEGINNING_2;
    public static final RegistrySupplier<Item> MUSIC_DISC_BROMELIAD;
    public static final RegistrySupplier<Item> MUSIC_DISC_ECHO_IN_THE_WIND;
    public static final RegistrySupplier<Item> MUSIC_DISC_ELD_UNKNOWN;
    public static final RegistrySupplier<Item> MUSIC_DISC_AN_ORDIANRY_DAY;
    public static final RegistrySupplier<Item> MUSIC_DISC_BELOW_AND_ABOVE;
    public static final RegistrySupplier<Item> MUSIC_DISC_BROKEN_CLOCKS;
    public static final RegistrySupplier<Item> MUSIC_DISC_CRESCENT_DUNES;
    public static final RegistrySupplier<Item> MUSIC_DISC_FIREBUGS;
    public static final RegistrySupplier<Item> MUSIC_DISC_FIREFLIES;
    public static final RegistrySupplier<Item> MUSIC_DISC_INFINITE_AMETHYST;
    public static final RegistrySupplier<Item> MUSIC_DISC_LABYRINTHINE;
    public static final RegistrySupplier<Item> MUSIC_DISC_LILYPAD;
    public static final RegistrySupplier<Item> MUSIC_DISC_OS_PIANO;
    public static final RegistrySupplier<Item> MUSIC_DISC_STAND_TALL;
    public static final RegistrySupplier<Item> MUSIC_DISC_WENDING;
    public static final RegistrySupplier<Item> MUSIC_DISC_AXOLOTL;
    public static final RegistrySupplier<Item> MUSIC_DISC_DRAGON_FISH;
    public static final RegistrySupplier<Item> MUSIC_DISC_SHUNIJI;
    public static final RegistrySupplier<Item> MUSIC_DISC_DEEPER;

    public static final RegistrySupplier<Item> PORTABLE_JUKEBOX;

    public static final RegistrySupplier<Item> BONE_BOW;
    public static final RegistrySupplier<Item> TWISTING_VINE_BOW;
    public static final RegistrySupplier<Item> WEEPING_VINE_BOW;
    public static final RegistrySupplier<Item> SOUL_BOW;

    public static final RegistrySupplier<Item> SOUL_CROSSBOW;
    public static final RegistrySupplier<Item> SOUL_MULTI_CROSSBOW;
    public static final RegistrySupplier<Item> MULTI_CROSSBOW;
    public static final RegistrySupplier<Item> WARPED_NYLIUM_SHELF;
    public static final RegistrySupplier<Item> CRIMSON_NYLIUM_SHELF;

    public static final RegistrySupplier<Item> CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Item> CRACKED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_CYAN_NETHER_BRICK;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> CYAN_NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Item> CYAN_NETHER_TILES;
    public static final RegistrySupplier<Item> CRACKED_CYAN_NETHER_TILES;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_SLAB;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_WALL;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_FENCE;
    public static final RegistrySupplier<Item> CHISELED_CYAN_NETHER_TILE;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_DOOR;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> CYAN_NETHER_TILE_LAMP;

    //red
    public static final RegistrySupplier<Item> CRACKED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_RED_NETHER_BRICK;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> RED_NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Item> RED_NETHER_TILES;
    public static final RegistrySupplier<Item> CRACKED_RED_NETHER_TILES;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_SLAB;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_WALL;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_FENCE;
    public static final RegistrySupplier<Item> CHISELED_RED_NETHER_TILE;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_DOOR;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> RED_NETHER_TILE_LAMP;

    public static final RegistrySupplier<Item> NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Item> NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Item> NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Item> NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> NETHER_BRICK_LAMP;

    public static final RegistrySupplier<Item> NETHER_TILES;
    public static final RegistrySupplier<Item> CRACKED_NETHER_TILES;
    public static final RegistrySupplier<Item> NETHER_TILE_STAIRS;
    public static final RegistrySupplier<Item> NETHER_TILE_SLAB;
    public static final RegistrySupplier<Item> NETHER_TILE_WALL;
    public static final RegistrySupplier<Item> NETHER_TILE_FENCE;
    public static final RegistrySupplier<Item> CHISELED_NETHER_TILE;
    public static final RegistrySupplier<Item> NETHER_TILE_PILLAR;
    public static final RegistrySupplier<Item> NETHER_TILE_DOOR;
    public static final RegistrySupplier<Item> NETHER_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> NETHER_TILE_BUTTON;
    public static final RegistrySupplier<Item> NETHER_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> NETHER_TILE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_BRICKS;
    public static final RegistrySupplier<Item> BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_BRICK;
    public static final RegistrySupplier<Item> BRICK_PILLAR;
    public static final RegistrySupplier<Item> BRICK_DOOR;
    public static final RegistrySupplier<Item> BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> BRICK_BUTTON;
    public static final RegistrySupplier<Item> BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> BRICK_LAMP;

    public static final RegistrySupplier<Item> BRICK_TILES;
    public static final RegistrySupplier<Item> CRACKED_BRICK_TILES;
    public static final RegistrySupplier<Item> BRICK_TILE_STAIRS;
    public static final RegistrySupplier<Item> BRICK_TILE_SLAB;
    public static final RegistrySupplier<Item> BRICK_TILE_WALL;
    public static final RegistrySupplier<Item> BRICK_TILE_FENCE;
    public static final RegistrySupplier<Item> CHISELED_BRICK_TILE;
    public static final RegistrySupplier<Item> BRICK_TILE_PILLAR;
    public static final RegistrySupplier<Item> BRICK_TILE_DOOR;
    public static final RegistrySupplier<Item> BRICK_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> BRICK_TILE_BUTTON;
    public static final RegistrySupplier<Item> BRICK_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> BRICK_TILE_LAMP;


    public static final RegistrySupplier<Item> CRACKED_QUARTZ_BRICKS;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_STAIRS;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_SLAB;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_WALL;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_QUARTZ_BRICK;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_PILLAR;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_DOOR;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_BUTTON;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> QUARTZ_BRICK_LAMP;

    public static final RegistrySupplier<Item> QUARTZ_TILES;
    public static final RegistrySupplier<Item> CRACKED_QUARTZ_TILES;
    public static final RegistrySupplier<Item> QUARTZ_TILE_STAIRS;
    public static final RegistrySupplier<Item> QUARTZ_TILE_SLAB;
    public static final RegistrySupplier<Item> QUARTZ_TILE_WALL;
    public static final RegistrySupplier<Item> QUARTZ_TILE_FENCE;
    public static final RegistrySupplier<Item> CHISELED_QUARTZ_TILE;
    public static final RegistrySupplier<Item> QUARTZ_TILE_PILLAR;
    public static final RegistrySupplier<Item> QUARTZ_TILE_DOOR;
    public static final RegistrySupplier<Item> QUARTZ_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> QUARTZ_TILE_BUTTON;
    public static final RegistrySupplier<Item> QUARTZ_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> QUARTZ_TILE_LAMP;

    public static final RegistrySupplier<Item> PRISMARINE_BRICK_WALL;
    public static final RegistrySupplier<Item> CRACKED_PRISMARINE_BRICKS;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_FENCE;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_PRISMARINE_BRICKS;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_DOOR;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_BUTTON;
    public static final RegistrySupplier<Item> PRISMARINE_BRICK_PRESSURE_PLATE;

    public static final RegistrySupplier<Item> PRISMARINE_TILES;
    public static final RegistrySupplier<Item> CRACKED_PRISMARINE_TILES;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_STAIRS;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_SLAB;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_WALL;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_FENCE;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_PRISMARINE_TILES;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_PILLAR;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_DOOR;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_BUTTON;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> PRISMARINE_TILE_SEA_LANTERN;

    public static final RegistrySupplier<Item> DARK_PRISMARINE_WALL;
    public static final RegistrySupplier<Item> CRACKED_DARK_PRISMARINE;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_FENCE;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_DARK_PRISMARINE;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_PILLAR;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_DOOR;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_TRAPDOOR;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_BUTTON;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> DARK_PRISMARINE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_END_STONE_BRICKS;
    public static final RegistrySupplier<Item> END_STONE_BRICK_FENCE;
    public static final RegistrySupplier<Item> END_STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_END_STONE_BRICKS;
    public static final RegistrySupplier<Item> END_STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> END_STONE_BRICK_DOOR;
    public static final RegistrySupplier<Item> END_STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> END_STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Item> END_STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> END_STONE_BRICK_LAMP;

    public static final RegistrySupplier<Item> END_STONE_TILES;
    public static final RegistrySupplier<Item> CRACKED_END_STONE_TILES;
    public static final RegistrySupplier<Item> END_STONE_TILE_STAIRS;
    public static final RegistrySupplier<Item> END_STONE_TILE_SLAB;
    public static final RegistrySupplier<Item> END_STONE_TILE_WALL;
    public static final RegistrySupplier<Item> END_STONE_TILE_FENCE;
    public static final RegistrySupplier<Item> END_STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_END_STONE_TILES;
    public static final RegistrySupplier<Item> END_STONE_TILE_PILLAR;
    public static final RegistrySupplier<Item> END_STONE_TILE_DOOR;
    public static final RegistrySupplier<Item> END_STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> END_STONE_TILE_BUTTON;
    public static final RegistrySupplier<Item> END_STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> END_STONE_TILE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_PURPUR;
    public static final RegistrySupplier<Item> PURPUR_WALL;
    public static final RegistrySupplier<Item> PURPUR_FENCE;
    public static final RegistrySupplier<Item> PURPUR_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_PURPUR;
    public static final RegistrySupplier<Item> PURPUR_DOOR;
    public static final RegistrySupplier<Item> PURPUR_TRAPDOOR;
    public static final RegistrySupplier<Item> PURPUR_BUTTON;
    public static final RegistrySupplier<Item> PURPUR_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> PURPUR_LAMP;

    public static final RegistrySupplier<Item> PURPUR_TILES;
    public static final RegistrySupplier<Item> CRACKED_PURPUR_TILES;
    public static final RegistrySupplier<Item> PURPUR_TILE_STAIRS;
    public static final RegistrySupplier<Item> PURPUR_TILE_SLAB;
    public static final RegistrySupplier<Item> PURPUR_TILE_WALL;
    public static final RegistrySupplier<Item> PURPUR_TILE_FENCE;
    public static final RegistrySupplier<Item> PURPUR_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_PURPUR_TILES;
    public static final RegistrySupplier<Item> PURPUR_TILE_PILLAR;
    public static final RegistrySupplier<Item> PURPUR_TILE_DOOR;
    public static final RegistrySupplier<Item> PURPUR_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> PURPUR_TILE_BUTTON;
    public static final RegistrySupplier<Item> PURPUR_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> PURPUR_TILE_LAMP;

    public static final RegistrySupplier<Item> STONE_BRICK_FENCE;
    public static final RegistrySupplier<Item> STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> STONE_BRICK_DOOR;
    public static final RegistrySupplier<Item> STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Item> STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> STONE_BRICK_LAMP;

    public static final RegistrySupplier<Item> STONE_TILES;
    public static final RegistrySupplier<Item> CRACKED_STONE_TILES;
    public static final RegistrySupplier<Item> STONE_TILE_STAIRS;
    public static final RegistrySupplier<Item> STONE_TILE_SLAB;
    public static final RegistrySupplier<Item> STONE_TILE_WALL;
    public static final RegistrySupplier<Item> STONE_TILE_FENCE;
    public static final RegistrySupplier<Item> STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_STONE_TILES;
    public static final RegistrySupplier<Item> STONE_TILE_PILLAR;
    public static final RegistrySupplier<Item> STONE_TILE_DOOR;
    public static final RegistrySupplier<Item> STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> STONE_TILE_BUTTON;
    public static final RegistrySupplier<Item> STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> STONE_TILE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_MOSSY_STONE_BRICK;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_FENCE;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> CHISELED_MOSSY_STONE_BRICKS;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_DOOR;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_BUTTON;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_LAMP;

    public static final RegistrySupplier<Item> MOSSY_STONE_TILES;
    public static final RegistrySupplier<Item> CRACKED_MOSSY_STONE_TILES;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_STAIRS;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_SLAB;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_WALL;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_FENCE;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_MOSSY_STONE_TILES;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_PILLAR;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_DOOR;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_BUTTON;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> MOSSY_STONE_TILE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_POLISHED_DEEPSLATE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_FENCE_GATE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_PILLAR;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_DEEPSLATE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_LAMP;

    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_SLAB;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_WALL;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_DEEPSLATE_TILES;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_TILE_LAMP;

    public static final RegistrySupplier<Item> AMARANTH_FROGLIGHT;
    public static final RegistrySupplier<Item> BLUSH_FROGLIGHT;
    public static final RegistrySupplier<Item> CELADON_FROGLIGHT;
    public static final RegistrySupplier<Item> CLOUDY_FROGLIGHT;
    public static final RegistrySupplier<Item> COBALT_FROGLIGHT;
    public static final RegistrySupplier<Item> CRIMSON_FROGLIGHT;
    public static final RegistrySupplier<Item> FROSTED_FROGLIGHT;
    public static final RegistrySupplier<Item> MIDNIGHT_FROGLIGHT;
    public static final RegistrySupplier<Item> MISTY_FROGLIGHT;
    public static final RegistrySupplier<Item> SEAFOAM_FROGLIGHT;
    public static final RegistrySupplier<Item> UMBER_FROGLIGHT;
    public static final RegistrySupplier<Item> WARM_FROGLIGHT;
    public static final RegistrySupplier<Item> SKY_FROGLIGHT;

    public static final RegistrySupplier<Item> BED;
    public static final RegistrySupplier<Item> CARPET;
    public static final RegistrySupplier<Item> WOOL;
    public static final RegistrySupplier<Item> CONCRETE;
    public static final RegistrySupplier<Item> CONCRETE_POWDER;
    public static final RegistrySupplier<Item> GLAZED_TERRACOTTA;
    public static final RegistrySupplier<Item> TINTED_GLASS_PANE;
    public static final RegistrySupplier<Item> FROGLIGHT;
    // HARNESS removed - Equippable/Equipment API doesn't exist in 1.21.1
    // public static final RegistrySupplier<Item> HARNESS;
    public static final RegistrySupplier<Item> SOAP;
    public static final RegistrySupplier<Item> ICICLE;

    public static final RegistrySupplier<Item> OAK_WALL;
    public static final RegistrySupplier<Item> SPRUCE_WALL;
    public static final RegistrySupplier<Item> BIRCH_WALL;
    public static final RegistrySupplier<Item> JUNGLE_WALL;
    public static final RegistrySupplier<Item> ACACIA_WALL;
    public static final RegistrySupplier<Item> DARK_OAK_WALL;
    public static final RegistrySupplier<Item> MANGROVE_WALL;
    public static final RegistrySupplier<Item> CHERRY_WALL;
    public static final RegistrySupplier<Item> PALE_OAK_WALL;
    public static final RegistrySupplier<Item> BAMBOO_WALL;
    public static final RegistrySupplier<Item> CRIMSON_WALL;
    public static final RegistrySupplier<Item> WARPED_WALL;
    /*
    public static final RegistrySupplier<Item> POLISHED_NETHER_BRICKS;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_RED_NETHER_BRICKS;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_RED_NETHER_BRICK;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_RED_NETHER_BRICK_LAMP;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_CYAN_NETHER_BRICKS;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_SLAB;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_WALL;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_FENCE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_CYAN_NETHER_BRICK;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_DOOR;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_CYAN_NETHER_BRICK_LAMP;
     */


    static {
        WARPED_NYLIUM_SHELF = ITEMS.register("warped_nylium_shelf", () -> new BlockItem(InspireBlocks.WARPED_NYLIUM_SHELF.get(), basicProperties("warped_nylium_shelf").arch$tab(CreativeModeTabs.NATURAL_BLOCKS)));
        CRIMSON_NYLIUM_SHELF = ITEMS.register("crimson_nylium_shelf", () -> new BlockItem(InspireBlocks.CRIMSON_NYLIUM_SHELF.get(), basicProperties("crimson_nylium_shelf").arch$tab(CreativeModeTabs.NATURAL_BLOCKS)));

        CYAN_NETHER_BRICKS = ITEMS.register("cyan_nether_bricks", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICKS.get(), basicProperties("cyan_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_CYAN_NETHER_BRICKS = ITEMS.register("cracked_cyan_nether_bricks", () -> new BlockItem(InspireBlocks.CRACKED_CYAN_NETHER_BRICKS.get(), basicProperties("cracked_cyan_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_STAIRS = ITEMS.register("cyan_nether_brick_stairs", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_STAIRS.get(), basicProperties("cyan_nether_brick_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_SLAB = ITEMS.register("cyan_nether_brick_slab", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_SLAB.get(), basicProperties("cyan_nether_brick_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_WALL = ITEMS.register("cyan_nether_brick_wall", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_WALL.get(), basicProperties("cyan_nether_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_FENCE = ITEMS.register("cyan_nether_brick_fence", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_FENCE.get(), basicProperties("cyan_nether_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_CYAN_NETHER_BRICK = ITEMS.register("chiseled_cyan_nether_brick", () -> new BlockItem(InspireBlocks.CHISELED_CYAN_NETHER_BRICKS.get(), basicProperties("chiseled_cyan_nether_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_PILLAR = ITEMS.register("cyan_nether_brick_pillar", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_PILLAR.get(), basicProperties("cyan_nether_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_DOOR = ITEMS.register("cyan_nether_brick_door", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_DOOR.get(), basicProperties("cyan_nether_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_TRAPDOOR = ITEMS.register("cyan_nether_brick_trapdoor", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_TRAPDOOR.get(), basicProperties("cyan_nether_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_BUTTON = ITEMS.register("cyan_nether_brick_button", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_BUTTON.get(), basicProperties("cyan_nether_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_PRESSURE_PLATE = ITEMS.register("cyan_nether_brick_pressure_plate", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_PRESSURE_PLATE.get(), basicProperties("cyan_nether_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_BRICK_LAMP = ITEMS.register("cyan_nether_brick_lamp", () -> new BlockItem(InspireBlocks.CYAN_NETHER_BRICK_LAMP.get(), basicProperties("cyan_nether_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CYAN_NETHER_TILES = ITEMS.register("cyan_nether_tiles", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILES.get(), basicProperties("cyan_nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_CYAN_NETHER_TILES = ITEMS.register("cracked_cyan_nether_tiles", () -> new BlockItem(InspireBlocks.CRACKED_CYAN_NETHER_TILES.get(), basicProperties("cracked_cyan_nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_STAIRS = ITEMS.register("cyan_nether_tile_stairs", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_STAIRS.get(), basicProperties("cyan_nether_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_SLAB = ITEMS.register("cyan_nether_tile_slab", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_SLAB.get(), basicProperties("cyan_nether_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_WALL = ITEMS.register("cyan_nether_tile_wall", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_WALL.get(), basicProperties("cyan_nether_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_FENCE = ITEMS.register("cyan_nether_tile_fence", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_FENCE.get(), basicProperties("cyan_nether_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_CYAN_NETHER_TILE = ITEMS.register("chiseled_cyan_nether_tile", () -> new BlockItem(InspireBlocks.CHISELED_CYAN_NETHER_TILES.get(), basicProperties("chiseled_cyan_nether_tile").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_PILLAR = ITEMS.register("cyan_nether_tile_pillar", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_PILLAR.get(), basicProperties("cyan_nether_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_DOOR = ITEMS.register("cyan_nether_tile_door", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_DOOR.get(), basicProperties("cyan_nether_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_TRAPDOOR = ITEMS.register("cyan_nether_tile_trapdoor", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_TRAPDOOR.get(), basicProperties("cyan_nether_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_BUTTON = ITEMS.register("cyan_nether_tile_button", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_BUTTON.get(), basicProperties("cyan_nether_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_PRESSURE_PLATE = ITEMS.register("cyan_nether_tile_pressure_plate", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_PRESSURE_PLATE.get(), basicProperties("cyan_nether_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CYAN_NETHER_TILE_LAMP = ITEMS.register("cyan_nether_tile_lamp", () -> new BlockItem(InspireBlocks.CYAN_NETHER_TILE_LAMP.get(), basicProperties("cyan_nether_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_RED_NETHER_BRICKS = ITEMS.register("cracked_red_nether_bricks", () -> new BlockItem(InspireBlocks.CRACKED_RED_NETHER_BRICKS.get(), basicProperties("cracked_red_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_FENCE = ITEMS.register("red_nether_brick_fence", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_FENCE.get(), basicProperties("red_nether_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_RED_NETHER_BRICK = ITEMS.register("chiseled_red_nether_brick", () -> new BlockItem(InspireBlocks.CHISELED_RED_NETHER_BRICKS.get(), basicProperties("chiseled_red_nether_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_PILLAR = ITEMS.register("red_nether_brick_pillar", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_PILLAR.get(), basicProperties("red_nether_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_DOOR = ITEMS.register("red_nether_brick_door", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_DOOR.get(), basicProperties("red_nether_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_TRAPDOOR = ITEMS.register("red_nether_brick_trapdoor", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_TRAPDOOR.get(), basicProperties("red_nether_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_BUTTON = ITEMS.register("red_nether_brick_button", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_BUTTON.get(), basicProperties("red_nether_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_PRESSURE_PLATE = ITEMS.register("red_nether_brick_pressure_plate", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_PRESSURE_PLATE.get(), basicProperties("red_nether_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_BRICK_LAMP = ITEMS.register("red_nether_brick_lamp", () -> new BlockItem(InspireBlocks.RED_NETHER_BRICK_LAMP.get(), basicProperties("red_nether_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        RED_NETHER_TILES = ITEMS.register("red_nether_tiles", () -> new BlockItem(InspireBlocks.RED_NETHER_TILES.get(), basicProperties("red_nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_RED_NETHER_TILES = ITEMS.register("cracked_red_nether_tiles", () -> new BlockItem(InspireBlocks.CRACKED_RED_NETHER_TILES.get(), basicProperties("cracked_red_nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_STAIRS = ITEMS.register("red_nether_tile_stairs", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_STAIRS.get(), basicProperties("red_nether_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_SLAB = ITEMS.register("red_nether_tile_slab", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_SLAB.get(), basicProperties("red_nether_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_WALL = ITEMS.register("red_nether_tile_wall", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_WALL.get(), basicProperties("red_nether_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_FENCE = ITEMS.register("red_nether_tile_fence", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_FENCE.get(), basicProperties("red_nether_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_RED_NETHER_TILE = ITEMS.register("chiseled_red_nether_tile", () -> new BlockItem(InspireBlocks.CHISELED_RED_NETHER_TILES.get(), basicProperties("chiseled_red_nether_tile").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_PILLAR = ITEMS.register("red_nether_tile_pillar", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_PILLAR.get(), basicProperties("red_nether_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_DOOR = ITEMS.register("red_nether_tile_door", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_DOOR.get(), basicProperties("red_nether_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_TRAPDOOR = ITEMS.register("red_nether_tile_trapdoor", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_TRAPDOOR.get(), basicProperties("red_nether_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_BUTTON = ITEMS.register("red_nether_tile_button", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_BUTTON.get(), basicProperties("red_nether_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_PRESSURE_PLATE = ITEMS.register("red_nether_tile_pressure_plate", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_PRESSURE_PLATE.get(), basicProperties("red_nether_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RED_NETHER_TILE_LAMP = ITEMS.register("red_nether_tile_lamp", () -> new BlockItem(InspireBlocks.RED_NETHER_TILE_LAMP.get(), basicProperties("red_nether_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        NETHER_BRICK_PILLAR = ITEMS.register("nether_brick_pillar", () -> new BlockItem(InspireBlocks.NETHER_BRICK_PILLAR.get(), basicProperties("nether_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_BRICK_DOOR = ITEMS.register("nether_brick_door", () -> new BlockItem(InspireBlocks.NETHER_BRICK_DOOR.get(), basicProperties("nether_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_BRICK_TRAPDOOR = ITEMS.register("nether_brick_trapdoor", () -> new BlockItem(InspireBlocks.NETHER_BRICK_TRAPDOOR.get(), basicProperties("nether_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_BRICK_BUTTON = ITEMS.register("nether_brick_button", () -> new BlockItem(InspireBlocks.NETHER_BRICK_BUTTON.get(), basicProperties("nether_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_BRICK_PRESSURE_PLATE = ITEMS.register("nether_brick_pressure_plate", () -> new BlockItem(InspireBlocks.NETHER_BRICK_PRESSURE_PLATE.get(), basicProperties("nether_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_BRICK_LAMP = ITEMS.register("nether_brick_lamp", () -> new BlockItem(InspireBlocks.NETHER_BRICK_LAMP.get(), basicProperties("nether_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        NETHER_TILES = ITEMS.register("nether_tiles", () -> new BlockItem(InspireBlocks.NETHER_TILES.get(), basicProperties("nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_NETHER_TILES = ITEMS.register("cracked_nether_tiles", () -> new BlockItem(InspireBlocks.CRACKED_NETHER_TILES.get(), basicProperties("cracked_nether_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_STAIRS = ITEMS.register("nether_tile_stairs", () -> new BlockItem(InspireBlocks.NETHER_TILE_STAIRS.get(), basicProperties("nether_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_SLAB = ITEMS.register("nether_tile_slab", () -> new BlockItem(InspireBlocks.NETHER_TILE_SLAB.get(), basicProperties("nether_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_WALL = ITEMS.register("nether_tile_wall", () -> new BlockItem(InspireBlocks.NETHER_TILE_WALL.get(), basicProperties("nether_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_FENCE = ITEMS.register("nether_tile_fence", () -> new BlockItem(InspireBlocks.NETHER_TILE_FENCE.get(), basicProperties("nether_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_NETHER_TILE = ITEMS.register("chiseled_nether_tile", () -> new BlockItem(InspireBlocks.CHISELED_NETHER_TILES.get(), basicProperties("chiseled_nether_tile").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_PILLAR = ITEMS.register("nether_tile_pillar", () -> new BlockItem(InspireBlocks.NETHER_TILE_PILLAR.get(), basicProperties("nether_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_DOOR = ITEMS.register("nether_tile_door", () -> new BlockItem(InspireBlocks.NETHER_TILE_DOOR.get(), basicProperties("nether_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_TRAPDOOR = ITEMS.register("nether_tile_trapdoor", () -> new BlockItem(InspireBlocks.NETHER_TILE_TRAPDOOR.get(), basicProperties("nether_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_BUTTON = ITEMS.register("nether_tile_button", () -> new BlockItem(InspireBlocks.NETHER_TILE_BUTTON.get(), basicProperties("nether_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_PRESSURE_PLATE = ITEMS.register("nether_tile_pressure_plate", () -> new BlockItem(InspireBlocks.NETHER_TILE_PRESSURE_PLATE.get(), basicProperties("nether_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHER_TILE_LAMP = ITEMS.register("nether_tile_lamp", () -> new BlockItem(InspireBlocks.NETHER_TILE_LAMP.get(), basicProperties("nether_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_BRICKS = ITEMS.register("cracked_bricks", () -> new BlockItem(InspireBlocks.CRACKED_BRICKS.get(), basicProperties("cracked_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_FENCE = ITEMS.register("brick_fence", () -> new BlockItem(InspireBlocks.BRICK_FENCE.get(), basicProperties("brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_BRICK = ITEMS.register("chiseled_brick", () -> new BlockItem(InspireBlocks.CHISELED_BRICKS.get(), basicProperties("chiseled_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_PILLAR = ITEMS.register("brick_pillar", () -> new BlockItem(InspireBlocks.BRICK_PILLAR.get(), basicProperties("brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_DOOR = ITEMS.register("brick_door", () -> new BlockItem(InspireBlocks.BRICK_DOOR.get(), basicProperties("brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TRAPDOOR = ITEMS.register("brick_trapdoor", () -> new BlockItem(InspireBlocks.BRICK_TRAPDOOR.get(), basicProperties("brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_BUTTON = ITEMS.register("brick_button", () -> new BlockItem(InspireBlocks.BRICK_BUTTON.get(), basicProperties("brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_PRESSURE_PLATE = ITEMS.register("brick_pressure_plate", () -> new BlockItem(InspireBlocks.BRICK_PRESSURE_PLATE.get(), basicProperties("brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_LAMP = ITEMS.register("brick_lamp", () -> new BlockItem(InspireBlocks.BRICK_LAMP.get(), basicProperties("brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        BRICK_TILES = ITEMS.register("brick_tiles", () -> new BlockItem(InspireBlocks.BRICK_TILES.get(), basicProperties("brick_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_BRICK_TILES = ITEMS.register("cracked_brick_tiles", () -> new BlockItem(InspireBlocks.CRACKED_BRICK_TILES.get(), basicProperties("cracked_brick_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_STAIRS = ITEMS.register("brick_tile_stairs", () -> new BlockItem(InspireBlocks.BRICK_TILE_STAIRS.get(), basicProperties("brick_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_SLAB = ITEMS.register("brick_tile_slab", () -> new BlockItem(InspireBlocks.BRICK_TILE_SLAB.get(), basicProperties("brick_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_WALL = ITEMS.register("brick_tile_wall", () -> new BlockItem(InspireBlocks.BRICK_TILE_WALL.get(), basicProperties("brick_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_FENCE = ITEMS.register("brick_tile_fence", () -> new BlockItem(InspireBlocks.BRICK_TILE_FENCE.get(), basicProperties("brick_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_BRICK_TILE = ITEMS.register("chiseled_brick_tile", () -> new BlockItem(InspireBlocks.CHISELED_BRICK_TILES.get(), basicProperties("chiseled_brick_tile").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_PILLAR = ITEMS.register("brick_tile_pillar", () -> new BlockItem(InspireBlocks.BRICK_TILE_PILLAR.get(), basicProperties("brick_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_DOOR = ITEMS.register("brick_tile_door", () -> new BlockItem(InspireBlocks.BRICK_TILE_DOOR.get(), basicProperties("brick_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_TRAPDOOR = ITEMS.register("brick_tile_trapdoor", () -> new BlockItem(InspireBlocks.BRICK_TILE_TRAPDOOR.get(), basicProperties("brick_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_BUTTON = ITEMS.register("brick_tile_button", () -> new BlockItem(InspireBlocks.BRICK_TILE_BUTTON.get(), basicProperties("brick_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_PRESSURE_PLATE = ITEMS.register("brick_tile_pressure_plate", () -> new BlockItem(InspireBlocks.BRICK_TILE_PRESSURE_PLATE.get(), basicProperties("brick_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BRICK_TILE_LAMP = ITEMS.register("brick_tile_lamp", () -> new BlockItem(InspireBlocks.BRICK_TILE_LAMP.get(), basicProperties("brick_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_QUARTZ_BRICKS = ITEMS.register("cracked_quartz_bricks", () -> new BlockItem(InspireBlocks.CRACKED_QUARTZ_BRICKS.get(), basicProperties("cracked_quartz_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_STAIRS = ITEMS.register("quartz_brick_stairs", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_STAIRS.get(), basicProperties("quartz_brick_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_SLAB = ITEMS.register("quartz_brick_slab", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_SLAB.get(), basicProperties("quartz_brick_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_WALL = ITEMS.register("quartz_brick_wall", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_WALL.get(), basicProperties("quartz_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_FENCE = ITEMS.register("quartz_brick_fence", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_FENCE.get(), basicProperties("quartz_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_QUARTZ_BRICK = ITEMS.register("chiseled_quartz_brick", () -> new BlockItem(InspireBlocks.CHISELED_QUARTZ_BRICKS.get(), basicProperties("chiseled_quartz_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_PILLAR = ITEMS.register("quartz_brick_pillar", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_PILLAR.get(), basicProperties("quartz_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_DOOR = ITEMS.register("quartz_brick_door", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_DOOR.get(), basicProperties("quartz_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_TRAPDOOR = ITEMS.register("quartz_brick_trapdoor", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_TRAPDOOR.get(), basicProperties("quartz_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_BUTTON = ITEMS.register("quartz_brick_button", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_BUTTON.get(), basicProperties("quartz_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_PRESSURE_PLATE = ITEMS.register("quartz_brick_pressure_plate", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_PRESSURE_PLATE.get(), basicProperties("quartz_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BRICK_LAMP = ITEMS.register("quartz_brick_lamp", () -> new BlockItem(InspireBlocks.QUARTZ_BRICK_LAMP.get(), basicProperties("quartz_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        QUARTZ_TILES = ITEMS.register("quartz_tiles", () -> new BlockItem(InspireBlocks.QUARTZ_TILES.get(), basicProperties("quartz_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_QUARTZ_TILES = ITEMS.register("cracked_quartz_tiles", () -> new BlockItem(InspireBlocks.CRACKED_QUARTZ_TILES.get(), basicProperties("cracked_quartz_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_STAIRS = ITEMS.register("quartz_tile_stairs", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_STAIRS.get(), basicProperties("quartz_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_SLAB = ITEMS.register("quartz_tile_slab", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_SLAB.get(), basicProperties("quartz_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_WALL = ITEMS.register("quartz_tile_wall", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_WALL.get(), basicProperties("quartz_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_FENCE = ITEMS.register("quartz_tile_fence", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_FENCE.get(), basicProperties("quartz_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_QUARTZ_TILE = ITEMS.register("chiseled_quartz_tile", () -> new BlockItem(InspireBlocks.CHISELED_QUARTZ_TILES.get(), basicProperties("chiseled_quartz_tile").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_PILLAR = ITEMS.register("quartz_tile_pillar", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_PILLAR.get(), basicProperties("quartz_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_DOOR = ITEMS.register("quartz_tile_door", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_DOOR.get(), basicProperties("quartz_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_TRAPDOOR = ITEMS.register("quartz_tile_trapdoor", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_TRAPDOOR.get(), basicProperties("quartz_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_BUTTON = ITEMS.register("quartz_tile_button", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_BUTTON.get(), basicProperties("quartz_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_PRESSURE_PLATE = ITEMS.register("quartz_tile_pressure_plate", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_PRESSURE_PLATE.get(), basicProperties("quartz_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TILE_LAMP = ITEMS.register("quartz_tile_lamp", () -> new BlockItem(InspireBlocks.QUARTZ_TILE_LAMP.get(), basicProperties("quartz_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILES = ITEMS.register("polished_deepslate_tiles",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILES.get(),
                        basicProperties("polished_deepslate_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_DEEPSLATE_TILES = ITEMS.register("cracked_polished_deepslate_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_DEEPSLATE_TILES.get(),
                        basicProperties("cracked_polished_deepslate_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_STAIRS = ITEMS.register("polished_deepslate_tile_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_STAIRS.get(),
                        basicProperties("polished_deepslate_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_SLAB = ITEMS.register("polished_deepslate_tile_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_SLAB.get(),
                        basicProperties("polished_deepslate_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_WALL = ITEMS.register("polished_deepslate_tile_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_WALL.get(),
                        basicProperties("polished_deepslate_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_FENCE = ITEMS.register("polished_deepslate_tile_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE.get(),
                        basicProperties("polished_deepslate_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_FENCE_GATE = ITEMS.register("polished_deepslate_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_FENCE_GATE.get(),
                        basicProperties("polished_deepslate_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_POLISHED_DEEPSLATE_TILES = ITEMS.register("chiseled_polished_deepslate_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_DEEPSLATE_TILES.get(),
                        basicProperties("chiseled_polished_deepslate_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_PILLAR = ITEMS.register("polished_deepslate_tile_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_PILLAR.get(),
                        basicProperties("polished_deepslate_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_DOOR = ITEMS.register("polished_deepslate_tile_door",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_DOOR.get(),
                        basicProperties("polished_deepslate_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_TRAPDOOR = ITEMS.register("polished_deepslate_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_TRAPDOOR.get(),
                        basicProperties("polished_deepslate_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_BUTTON = ITEMS.register("polished_deepslate_tile_button",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_BUTTON.get(),
                        basicProperties("polished_deepslate_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE = ITEMS.register("polished_deepslate_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_PRESSURE_PLATE.get(),
                        basicProperties("polished_deepslate_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TILE_LAMP = ITEMS.register("polished_deepslate_tile_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TILE_LAMP.get(),
                        basicProperties("polished_deepslate_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        PURPUR_TILES = ITEMS.register("purpur_tiles",
                () -> new BlockItem(InspireBlocks.PURPUR_TILES.get(),
                        basicProperties("purpur_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_PURPUR_TILES = ITEMS.register("cracked_purpur_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_PURPUR_TILES.get(),
                        basicProperties("cracked_purpur_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_STAIRS = ITEMS.register("purpur_tile_stairs",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_STAIRS.get(),
                        basicProperties("purpur_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_SLAB = ITEMS.register("purpur_tile_slab",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_SLAB.get(),
                        basicProperties("purpur_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_WALL = ITEMS.register("purpur_tile_wall",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_WALL.get(),
                        basicProperties("purpur_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_FENCE = ITEMS.register("purpur_tile_fence",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_FENCE.get(),
                        basicProperties("purpur_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_FENCE_GATE = ITEMS.register("purpur_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_FENCE_GATE.get(),
                        basicProperties("purpur_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_PURPUR_TILES = ITEMS.register("chiseled_purpur_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_PURPUR_TILES.get(),
                        basicProperties("chiseled_purpur_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_PILLAR = ITEMS.register("purpur_tile_pillar",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_PILLAR.get(),
                        basicProperties("purpur_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_DOOR = ITEMS.register("purpur_tile_door",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_DOOR.get(),
                        basicProperties("purpur_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_TRAPDOOR = ITEMS.register("purpur_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_TRAPDOOR.get(),
                        basicProperties("purpur_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_BUTTON = ITEMS.register("purpur_tile_button",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_BUTTON.get(),
                        basicProperties("purpur_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_PRESSURE_PLATE = ITEMS.register("purpur_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_PRESSURE_PLATE.get(),
                        basicProperties("purpur_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TILE_LAMP = ITEMS.register("purpur_tile_lamp",
                () -> new BlockItem(InspireBlocks.PURPUR_TILE_LAMP.get(),
                        basicProperties("purpur_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        PRISMARINE_BRICK_WALL = ITEMS.register("prismarine_brick_wall",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_WALL.get(), basicProperties("prismarine_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_PRISMARINE_BRICKS = ITEMS.register("cracked_prismarine_bricks",
                () -> new BlockItem(InspireBlocks.CRACKED_PRISMARINE_BRICKS.get(), basicProperties("cracked_prismarine_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_FENCE = ITEMS.register("prismarine_brick_fence",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_FENCE.get(), basicProperties("prismarine_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_FENCE_GATE = ITEMS.register("prismarine_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_FENCE_GATE.get(), basicProperties("prismarine_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_PRISMARINE_BRICKS = ITEMS.register("chiseled_prismarine_bricks",
                () -> new BlockItem(InspireBlocks.CHISELED_PRISMARINE_BRICKS.get(), basicProperties("chiseled_prismarine_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_PILLAR = ITEMS.register("prismarine_brick_pillar",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_PILLAR.get(), basicProperties("prismarine_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_DOOR = ITEMS.register("prismarine_brick_door",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_DOOR.get(), basicProperties("prismarine_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_TRAPDOOR = ITEMS.register("prismarine_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_TRAPDOOR.get(), basicProperties("prismarine_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_BUTTON = ITEMS.register("prismarine_brick_button",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_BUTTON.get(), basicProperties("prismarine_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_BRICK_PRESSURE_PLATE = ITEMS.register("prismarine_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.PRISMARINE_BRICK_PRESSURE_PLATE.get(), basicProperties("prismarine_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        PRISMARINE_TILES = ITEMS.register("prismarine_tiles",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILES.get(), basicProperties("prismarine_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_PRISMARINE_TILES = ITEMS.register("cracked_prismarine_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_PRISMARINE_TILES.get(), basicProperties("cracked_prismarine_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_STAIRS = ITEMS.register("prismarine_tile_stairs",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_STAIRS.get(), basicProperties("prismarine_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_SLAB = ITEMS.register("prismarine_tile_slab",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_SLAB.get(), basicProperties("prismarine_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_WALL = ITEMS.register("prismarine_tile_wall",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_WALL.get(), basicProperties("prismarine_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_FENCE = ITEMS.register("prismarine_tile_fence",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_FENCE.get(), basicProperties("prismarine_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_FENCE_GATE = ITEMS.register("prismarine_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_FENCE_GATE.get(), basicProperties("prismarine_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_PRISMARINE_TILES = ITEMS.register("chiseled_prismarine_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_PRISMARINE_TILES.get(), basicProperties("chiseled_prismarine_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_PILLAR = ITEMS.register("prismarine_tile_pillar",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_PILLAR.get(), basicProperties("prismarine_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_DOOR = ITEMS.register("prismarine_tile_door",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_DOOR.get(), basicProperties("prismarine_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_TRAPDOOR = ITEMS.register("prismarine_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_TRAPDOOR.get(), basicProperties("prismarine_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_BUTTON = ITEMS.register("prismarine_tile_button",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_BUTTON.get(), basicProperties("prismarine_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_PRESSURE_PLATE = ITEMS.register("prismarine_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_PRESSURE_PLATE.get(), basicProperties("prismarine_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PRISMARINE_TILE_SEA_LANTERN = ITEMS.register("prismarine_tile_sea_lantern",
                () -> new BlockItem(InspireBlocks.PRISMARINE_TILE_SEA_LANTERN.get(), basicProperties("prismarine_tile_sea_lantern").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DARK_PRISMARINE_WALL = ITEMS.register("dark_prismarine_wall",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_WALL.get(), basicProperties("dark_prismarine_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_DARK_PRISMARINE = ITEMS.register("cracked_dark_prismarine",
                () -> new BlockItem(InspireBlocks.CRACKED_DARK_PRISMARINE.get(), basicProperties("cracked_dark_prismarine").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_FENCE = ITEMS.register("dark_prismarine_fence",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_FENCE.get(), basicProperties("dark_prismarine_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_FENCE_GATE = ITEMS.register("dark_prismarine_fence_gate",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_FENCE_GATE.get(), basicProperties("dark_prismarine_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_DARK_PRISMARINE = ITEMS.register("chiseled_dark_prismarine",
                () -> new BlockItem(InspireBlocks.CHISELED_DARK_PRISMARINE.get(), basicProperties("chiseled_dark_prismarine").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_PILLAR = ITEMS.register("dark_prismarine_pillar",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_PILLAR.get(), basicProperties("dark_prismarine_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_DOOR = ITEMS.register("dark_prismarine_door",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_DOOR.get(), basicProperties("dark_prismarine_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_TRAPDOOR = ITEMS.register("dark_prismarine_trapdoor",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_TRAPDOOR.get(), basicProperties("dark_prismarine_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_BUTTON = ITEMS.register("dark_prismarine_button",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_BUTTON.get(), basicProperties("dark_prismarine_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_PRESSURE_PLATE = ITEMS.register("dark_prismarine_pressure_plate",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get(), basicProperties("dark_prismarine_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        DARK_PRISMARINE_LAMP = ITEMS.register("dark_prismarine_lamp",
                () -> new BlockItem(InspireBlocks.DARK_PRISMARINE_LAMP.get(), basicProperties("dark_prismarine_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_END_STONE_BRICKS = ITEMS.register("cracked_end_stone_bricks",
                () -> new BlockItem(InspireBlocks.CRACKED_END_STONE_BRICKS.get(),
                        basicProperties("cracked_end_stone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_FENCE = ITEMS.register("end_stone_brick_fence",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_FENCE.get(),
                        basicProperties("end_stone_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_FENCE_GATE = ITEMS.register("end_stone_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_FENCE_GATE.get(),
                        basicProperties("end_stone_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_END_STONE_BRICKS = ITEMS.register("chiseled_end_stone_bricks",
                () -> new BlockItem(InspireBlocks.CHISELED_END_STONE_BRICKS.get(),
                        basicProperties("chiseled_end_stone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_PILLAR = ITEMS.register("end_stone_brick_pillar",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_PILLAR.get(),
                        basicProperties("end_stone_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_DOOR = ITEMS.register("end_stone_brick_door",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_DOOR.get(),
                        basicProperties("end_stone_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_TRAPDOOR = ITEMS.register("end_stone_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_TRAPDOOR.get(),
                        basicProperties("end_stone_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_BUTTON = ITEMS.register("end_stone_brick_button",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_BUTTON.get(),
                        basicProperties("end_stone_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_PRESSURE_PLATE = ITEMS.register("end_stone_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_PRESSURE_PLATE.get(),
                        basicProperties("end_stone_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_BRICK_LAMP = ITEMS.register("end_stone_brick_lamp",
                () -> new BlockItem(InspireBlocks.END_STONE_BRICK_LAMP.get(),
                        basicProperties("end_stone_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        END_STONE_TILES = ITEMS.register("end_stone_tiles",
                () -> new BlockItem(InspireBlocks.END_STONE_TILES.get(),
                        basicProperties("end_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_END_STONE_TILES = ITEMS.register("cracked_end_stone_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_END_STONE_TILES.get(),
                        basicProperties("cracked_end_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_STAIRS = ITEMS.register("end_stone_tile_stairs",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_STAIRS.get(),
                        basicProperties("end_stone_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_SLAB = ITEMS.register("end_stone_tile_slab",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_SLAB.get(),
                        basicProperties("end_stone_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_WALL = ITEMS.register("end_stone_tile_wall",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_WALL.get(),
                        basicProperties("end_stone_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_FENCE = ITEMS.register("end_stone_tile_fence",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_FENCE.get(),
                        basicProperties("end_stone_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_FENCE_GATE = ITEMS.register("end_stone_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_FENCE_GATE.get(),
                        basicProperties("end_stone_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_END_STONE_TILES = ITEMS.register("chiseled_end_stone_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_END_STONE_TILES.get(),
                        basicProperties("chiseled_end_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_PILLAR = ITEMS.register("end_stone_tile_pillar",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_PILLAR.get(),
                        basicProperties("end_stone_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_DOOR = ITEMS.register("end_stone_tile_door",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_DOOR.get(),
                        basicProperties("end_stone_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_TRAPDOOR = ITEMS.register("end_stone_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_TRAPDOOR.get(),
                        basicProperties("end_stone_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_BUTTON = ITEMS.register("end_stone_tile_button",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_BUTTON.get(),
                        basicProperties("end_stone_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_PRESSURE_PLATE = ITEMS.register("end_stone_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_PRESSURE_PLATE.get(),
                        basicProperties("end_stone_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        END_STONE_TILE_LAMP = ITEMS.register("end_stone_tile_lamp",
                () -> new BlockItem(InspireBlocks.END_STONE_TILE_LAMP.get(),
                        basicProperties("end_stone_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        STONE_BRICK_FENCE = ITEMS.register("stone_brick_fence",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_FENCE.get(),
                        basicProperties("stone_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_FENCE_GATE = ITEMS.register("stone_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_FENCE_GATE.get(),
                        basicProperties("stone_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_PILLAR = ITEMS.register("stone_brick_pillar",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_PILLAR.get(),
                        basicProperties("stone_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_DOOR = ITEMS.register("stone_brick_door",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_DOOR.get(),
                        basicProperties("stone_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_TRAPDOOR = ITEMS.register("stone_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_TRAPDOOR.get(),
                        basicProperties("stone_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_BUTTON = ITEMS.register("stone_brick_button",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_BUTTON.get(),
                        basicProperties("stone_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_PRESSURE_PLATE = ITEMS.register("stone_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_PRESSURE_PLATE.get(),
                        basicProperties("stone_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_BRICK_LAMP = ITEMS.register("stone_brick_lamp",
                () -> new BlockItem(InspireBlocks.STONE_BRICK_LAMP.get(),
                        basicProperties("stone_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        STONE_TILES = ITEMS.register("stone_tiles",
                () -> new BlockItem(InspireBlocks.STONE_TILES.get(),
                        basicProperties("stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_STONE_TILES = ITEMS.register("cracked_stone_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_STONE_TILES.get(),
                        basicProperties("cracked_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_STAIRS = ITEMS.register("stone_tile_stairs",
                () -> new BlockItem(InspireBlocks.STONE_TILE_STAIRS.get(),
                        basicProperties("stone_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_SLAB = ITEMS.register("stone_tile_slab",
                () -> new BlockItem(InspireBlocks.STONE_TILE_SLAB.get(),
                        basicProperties("stone_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_WALL = ITEMS.register("stone_tile_wall",
                () -> new BlockItem(InspireBlocks.STONE_TILE_WALL.get(),
                        basicProperties("stone_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_FENCE = ITEMS.register("stone_tile_fence",
                () -> new BlockItem(InspireBlocks.STONE_TILE_FENCE.get(),
                        basicProperties("stone_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_FENCE_GATE = ITEMS.register("stone_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.STONE_TILE_FENCE_GATE.get(),
                        basicProperties("stone_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_STONE_TILES = ITEMS.register("chiseled_stone_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_STONE_TILES.get(),
                        basicProperties("chiseled_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_PILLAR = ITEMS.register("stone_tile_pillar",
                () -> new BlockItem(InspireBlocks.STONE_TILE_PILLAR.get(),
                        basicProperties("stone_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_DOOR = ITEMS.register("stone_tile_door",
                () -> new BlockItem(InspireBlocks.STONE_TILE_DOOR.get(),
                        basicProperties("stone_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_TRAPDOOR = ITEMS.register("stone_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.STONE_TILE_TRAPDOOR.get(),
                        basicProperties("stone_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_BUTTON = ITEMS.register("stone_tile_button",
                () -> new BlockItem(InspireBlocks.STONE_TILE_BUTTON.get(),
                        basicProperties("stone_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_PRESSURE_PLATE = ITEMS.register("stone_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.STONE_TILE_PRESSURE_PLATE.get(),
                        basicProperties("stone_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        STONE_TILE_LAMP = ITEMS.register("stone_tile_lamp",
                () -> new BlockItem(InspireBlocks.STONE_TILE_LAMP.get(),
                        basicProperties("stone_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_MOSSY_STONE_BRICK = ITEMS.register("cracked_mossy_stone_brick",
                () -> new BlockItem(InspireBlocks.CRACKED_MOSSY_STONE_BRICK.get(),
                        basicProperties("cracked_mossy_stone_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_FENCE = ITEMS.register("mossy_stone_brick_fence",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_FENCE.get(),
                        basicProperties("mossy_stone_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_FENCE_GATE = ITEMS.register("mossy_stone_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_FENCE_GATE.get(),
                        basicProperties("mossy_stone_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_PILLAR = ITEMS.register("mossy_stone_brick_pillar",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_PILLAR.get(),
                        basicProperties("mossy_stone_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_MOSSY_STONE_BRICKS = ITEMS.register("chiseled_mossy_stone_bricks",
                () -> new BlockItem(InspireBlocks.CHISELED_MOSSY_STONE_BRICKS.get(),
                        basicProperties("chiseled_mossy_stone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_DOOR = ITEMS.register("mossy_stone_brick_door",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_DOOR.get(),
                        basicProperties("mossy_stone_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_TRAPDOOR = ITEMS.register("mossy_stone_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_TRAPDOOR.get(),
                        basicProperties("mossy_stone_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_BUTTON = ITEMS.register("mossy_stone_brick_button",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_BUTTON.get(),
                        basicProperties("mossy_stone_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_PRESSURE_PLATE = ITEMS.register("mossy_stone_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE.get(),
                        basicProperties("mossy_stone_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_BRICK_LAMP = ITEMS.register("mossy_stone_brick_lamp",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_BRICK_LAMP.get(),
                        basicProperties("mossy_stone_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        MOSSY_STONE_TILES = ITEMS.register("mossy_stone_tiles",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILES.get(),
                        basicProperties("mossy_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_MOSSY_STONE_TILES = ITEMS.register("cracked_mossy_stone_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_MOSSY_STONE_TILES.get(),
                        basicProperties("cracked_mossy_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_STAIRS = ITEMS.register("mossy_stone_tile_stairs",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_STAIRS.get(),
                        basicProperties("mossy_stone_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_SLAB = ITEMS.register("mossy_stone_tile_slab",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_SLAB.get(),
                        basicProperties("mossy_stone_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_WALL = ITEMS.register("mossy_stone_tile_wall",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_WALL.get(),
                        basicProperties("mossy_stone_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_FENCE = ITEMS.register("mossy_stone_tile_fence",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_FENCE.get(),
                        basicProperties("mossy_stone_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_FENCE_GATE = ITEMS.register("mossy_stone_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_FENCE_GATE.get(),
                        basicProperties("mossy_stone_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_MOSSY_STONE_TILES = ITEMS.register("chiseled_mossy_stone_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_MOSSY_STONE_TILES.get(),
                        basicProperties("chiseled_mossy_stone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_PILLAR = ITEMS.register("mossy_stone_tile_pillar",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_PILLAR.get(),
                        basicProperties("mossy_stone_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_DOOR = ITEMS.register("mossy_stone_tile_door",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_DOOR.get(),
                        basicProperties("mossy_stone_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_TRAPDOOR = ITEMS.register("mossy_stone_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_TRAPDOOR.get(),
                        basicProperties("mossy_stone_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_BUTTON = ITEMS.register("mossy_stone_tile_button",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_BUTTON.get(),
                        basicProperties("mossy_stone_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_PRESSURE_PLATE = ITEMS.register("mossy_stone_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_PRESSURE_PLATE.get(),
                        basicProperties("mossy_stone_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        MOSSY_STONE_TILE_LAMP = ITEMS.register("mossy_stone_tile_lamp",
                () -> new BlockItem(InspireBlocks.MOSSY_STONE_TILE_LAMP.get(),
                        basicProperties("mossy_stone_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_DEEPSLATE = ITEMS.register("cracked_polished_deepslate",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_DEEPSLATE.get(),
                        basicProperties("cracked_polished_deepslate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_FENCE = ITEMS.register("polished_deepslate_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_FENCE.get(),
                        basicProperties("polished_deepslate_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_FENCE_GATE = ITEMS.register("polished_deepslate_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get(),
                        basicProperties("polished_deepslate_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_PILLAR = ITEMS.register("polished_deepslate_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_PILLAR.get(),
                        basicProperties("polished_deepslate_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_POLISHED_DEEPSLATE = ITEMS.register("chiseled_polished_deepslate",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_DEEPSLATE.get(),
                        basicProperties("chiseled_polished_deepslate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_DOOR = ITEMS.register("polished_deepslate_door",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_DOOR.get(),
                        basicProperties("polished_deepslate_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_TRAPDOOR = ITEMS.register("polished_deepslate_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_TRAPDOOR.get(),
                        basicProperties("polished_deepslate_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_BUTTON = ITEMS.register("polished_deepslate_button",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_BUTTON.get(),
                        basicProperties("polished_deepslate_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_PRESSURE_PLATE = ITEMS.register("polished_deepslate_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get(),
                        basicProperties("polished_deepslate_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_DEEPSLATE_LAMP = ITEMS.register("polished_deepslate_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_DEEPSLATE_LAMP.get(),
                        basicProperties("polished_deepslate_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_PURPUR = ITEMS.register("cracked_purpur",
                () -> new BlockItem(InspireBlocks.CRACKED_PURPUR.get(),
                        basicProperties("cracked_purpur").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_WALL = ITEMS.register("purpur_wall",
                () -> new BlockItem(InspireBlocks.PURPUR_WALL.get(),
                        basicProperties("purpur_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_FENCE = ITEMS.register("purpur_fence",
                () -> new BlockItem(InspireBlocks.PURPUR_FENCE.get(),
                        basicProperties("purpur_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_FENCE_GATE = ITEMS.register("purpur_fence_gate",
                () -> new BlockItem(InspireBlocks.PURPUR_FENCE_GATE.get(),
                        basicProperties("purpur_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CHISELED_PURPUR = ITEMS.register("chiseled_purpur",
                () -> new BlockItem(InspireBlocks.CHISELED_PURPUR.get(),
                        basicProperties("chiseled_purpur").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_DOOR = ITEMS.register("purpur_door",
                () -> new BlockItem(InspireBlocks.PURPUR_DOOR.get(),
                        basicProperties("purpur_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_TRAPDOOR = ITEMS.register("purpur_trapdoor",
                () -> new BlockItem(InspireBlocks.PURPUR_TRAPDOOR.get(),
                        basicProperties("purpur_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_BUTTON = ITEMS.register("purpur_button",
                () -> new BlockItem(InspireBlocks.PURPUR_BUTTON.get(),
                        basicProperties("purpur_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_PRESSURE_PLATE = ITEMS.register("purpur_pressure_plate",
                () -> new BlockItem(InspireBlocks.PURPUR_PRESSURE_PLATE.get(),
                        basicProperties("purpur_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        PURPUR_LAMP = ITEMS.register("purpur_lamp",
                () -> new BlockItem(InspireBlocks.PURPUR_LAMP.get(),
                        basicProperties("purpur_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));








        AMARANTH_FROGLIGHT = ITEMS.register("amaranth_froglight", ()-> new BlockItem(InspireBlocks.AMARANTH_FROGLIGHT.get(), basicProperties("amaranth_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        BLUSH_FROGLIGHT = ITEMS.register("blush_froglight", ()-> new BlockItem(InspireBlocks.BLUSH_FROGLIGHT.get(), basicProperties("blush_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CELADON_FROGLIGHT = ITEMS.register("celadon_froglight", ()-> new BlockItem(InspireBlocks.CELADON_FROGLIGHT.get(), basicProperties("celadon_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CLOUDY_FROGLIGHT = ITEMS.register("cloudy_froglight", ()-> new BlockItem(InspireBlocks.CLOUDY_FROGLIGHT.get(), basicProperties("cloudy_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        COBALT_FROGLIGHT = ITEMS.register("cobalt_froglight", ()-> new BlockItem(InspireBlocks.COBALT_FROGLIGHT.get(), basicProperties("cobalt_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CRIMSON_FROGLIGHT = ITEMS.register("crimson_froglight", ()-> new BlockItem(InspireBlocks.CRIMSON_FROGLIGHT.get(), basicProperties("crimson_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        FROSTED_FROGLIGHT = ITEMS.register("frosted_froglight", ()-> new BlockItem(InspireBlocks.FROSTED_FROGLIGHT.get(), basicProperties("frosted_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        MIDNIGHT_FROGLIGHT = ITEMS.register("midnight_froglight", ()-> new BlockItem(InspireBlocks.MIDNIGHT_FROGLIGHT.get(), basicProperties("midnight_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        MISTY_FROGLIGHT = ITEMS.register("misty_froglight", ()-> new BlockItem(InspireBlocks.MISTY_FROGLIGHT.get(), basicProperties("misty_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SEAFOAM_FROGLIGHT = ITEMS.register("seafoam_froglight", ()-> new BlockItem(InspireBlocks.SEAFOAM_FROGLIGHT.get(), basicProperties("seafoam_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        UMBER_FROGLIGHT = ITEMS.register("umber_froglight", ()-> new BlockItem(InspireBlocks.UMBER_FROGLIGHT.get(), basicProperties("umber_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        WARM_FROGLIGHT = ITEMS.register("warm_froglight", ()-> new BlockItem(InspireBlocks.WARM_FROGLIGHT.get(), basicProperties("warm_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SKY_FROGLIGHT = ITEMS.register("sky_froglight", ()-> new BlockItem(InspireBlocks.SKY_FROGLIGHT.get(), basicProperties("sky_froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));

        BED = ITEMS.register("bed", ()-> new BedItem(InspireBlocks.BED.get(), basicProperties("bed").stacksTo(1).arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CARPET = ITEMS.register("carpet", ()-> new BlockItem(InspireBlocks.CARPET.get(), basicProperties("carpet").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        WOOL = ITEMS.register("wool", ()-> new BlockItem(InspireBlocks.WOOL.get(), basicProperties("wool").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CONCRETE = ITEMS.register("concrete", ()-> new BlockItem(InspireBlocks.CONCRETE.get(), basicProperties("concrete").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CONCRETE_POWDER = ITEMS.register("concrete_powder", ()-> new BlockItem(InspireBlocks.CONCRETE_POWDER.get(), basicProperties("concrete_powder").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        GLAZED_TERRACOTTA = ITEMS.register("glazed_terracotta", ()-> new BlockItem(InspireBlocks.GLAZED_TERRACOTTA.get(), basicProperties("glazed_terracotta").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        TINTED_GLASS_PANE = ITEMS.register("tinted_glass_pane", ()-> new BlockItem(InspireBlocks.TINTED_GLASS_PANE.get(), basicProperties("tinted_glass_pane").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        FROGLIGHT = ITEMS.register("froglight", ()-> new BlockItem(InspireBlocks.FROGLIGHT.get(), basicProperties("froglight").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        // HARNESS registration removed - Equippable/Equipment API doesn't exist in 1.21.1
        // HARNESS = ITEMS.register("harness", ()-> new Item(basicProperties("harness").component(DataComponents.EQUIPPABLE, Equippable.harness(null)).arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SOAP = ITEMS.register("soap", ()-> new Item(basicProperties("soap").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        ICICLE = ITEMS.register("icicle", ()-> new BlockItem(InspireBlocks.ICICLE.get(),basicProperties("icicle").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));

        OAK_WALL = ITEMS.register("oak_wall", ()-> new BlockItem(InspireBlocks.OAK_WALL.get(), basicProperties("oak_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SPRUCE_WALL = ITEMS.register("spruce_wall", ()-> new BlockItem(InspireBlocks.SPRUCE_WALL.get(), basicProperties("spruce_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        BIRCH_WALL = ITEMS.register("birch_wall", ()-> new BlockItem(InspireBlocks.BIRCH_WALL.get(), basicProperties("birch_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        JUNGLE_WALL = ITEMS.register("jungle_wall", ()-> new BlockItem(InspireBlocks.JUNGLE_WALL.get(), basicProperties("jungle_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        ACACIA_WALL = ITEMS.register("acacia_wall", ()-> new BlockItem(InspireBlocks.ACACIA_WALL.get(), basicProperties("acacia_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        DARK_OAK_WALL = ITEMS.register("dark_oak_wall", ()-> new BlockItem(InspireBlocks.DARK_OAK_WALL.get(), basicProperties("dark_oak_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        MANGROVE_WALL = ITEMS.register("mangrove_wall", ()-> new BlockItem(InspireBlocks.MANGROVE_WALL.get(), basicProperties("mangrove_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CHERRY_WALL = ITEMS.register("cherry_wall", ()-> new BlockItem(InspireBlocks.CHERRY_WALL.get(), basicProperties("cherry_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        PALE_OAK_WALL = ITEMS.register("pale_wall", ()-> new BlockItem(InspireBlocks.PALE_OAK_WALL.get(), basicProperties("pale_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        BAMBOO_WALL = ITEMS.register("bamboo_wall", ()-> new BlockItem(InspireBlocks.BAMBOO_WALL.get(), basicProperties("bamboo_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CRIMSON_WALL = ITEMS.register("crimson_wall", ()-> new BlockItem(InspireBlocks.CRIMSON_WALL.get(), basicProperties("crimson_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        WARPED_WALL = ITEMS.register("warped_wall", ()-> new BlockItem(InspireBlocks.WARPED_WALL.get(), basicProperties("warped_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        /*
        POLISHED_RED_NETHER_BRICKS = ITEMS.register("polished_red_nether_bricks", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICKS.get(), basicProperties("polished_red_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_RED_NETHER_BRICKS = ITEMS.register("cracked_polished_red_nether_bricks", () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_RED_NETHER_BRICKS.get(), basicProperties("cracked_polished_red_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_STAIRS = ITEMS.register("polished_red_nether_brick_stairs", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_STAIRS.get(), basicProperties("polished_red_nether_brick_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_SLAB = ITEMS.register("polished_red_nether_brick_slab", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_SLAB.get(), basicProperties("polished_red_nether_brick_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_WALL = ITEMS.register("polished_red_nether_brick_wall", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_WALL.get(), basicProperties("polished_red_nether_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_FENCE = ITEMS.register("polished_red_nether_brick_fence", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_FENCE.get(), basicProperties("polished_red_nether_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_RED_NETHER_BRICK = ITEMS.register("chiseled_polished_red_nether_brick", () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_RED_NETHER_BRICK.get(), basicProperties("chiseled_polished_red_nether_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_PILLAR = ITEMS.register("polished_red_nether_brick_pillar", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_PILLAR.get(), basicProperties("polished_red_nether_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_DOOR = ITEMS.register("polished_red_nether_brick_door", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_DOOR.get(), basicProperties("polished_red_nether_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_TRAPDOOR = ITEMS.register("polished_red_nether_brick_trapdoor", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_TRAPDOOR.get(), basicProperties("polished_red_nether_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_BUTTON = ITEMS.register("polished_red_nether_brick_button", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_BUTTON.get(), basicProperties("polished_red_nether_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE = ITEMS.register("polished_red_nether_brick_pressure_plate", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_PRESSURE_PLATE.get(), basicProperties("polished_red_nether_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_RED_NETHER_BRICK_LAMP = ITEMS.register("polished_red_nether_brick_lamp", () -> new BlockItem(InspireBlocks.POLISHED_RED_NETHER_BRICK_LAMP.get(), basicProperties("polished_red_nether_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICKS = ITEMS.register("polished_cyan_nether_bricks", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICKS.get(), basicProperties("polished_cyan_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_CYAN_NETHER_BRICKS = ITEMS.register("cracked_polished_cyan_nether_bricks", () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_CYAN_NETHER_BRICKS.get(), basicProperties("cracked_polished_cyan_nether_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_STAIRS = ITEMS.register("polished_cyan_nether_brick_stairs", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_STAIRS.get(), basicProperties("polished_cyan_nether_brick_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_SLAB = ITEMS.register("polished_cyan_nether_brick_slab", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_SLAB.get(), basicProperties("polished_cyan_nether_brick_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_WALL = ITEMS.register("polished_cyan_nether_brick_wall", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_WALL.get(), basicProperties("polished_cyan_nether_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_FENCE = ITEMS.register("polished_cyan_nether_brick_fence", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_FENCE.get(), basicProperties("polished_cyan_nether_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_CYAN_NETHER_BRICK = ITEMS.register("chiseled_polished_cyan_nether_brick", () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_CYAN_NETHER_BRICK.get(), basicProperties("chiseled_polished_cyan_nether_brick").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_PILLAR = ITEMS.register("polished_cyan_nether_brick_pillar", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_PILLAR.get(), basicProperties("polished_cyan_nether_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_DOOR = ITEMS.register("polished_cyan_nether_brick_door", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_DOOR.get(), basicProperties("polished_cyan_nether_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_TRAPDOOR = ITEMS.register("polished_cyan_nether_brick_trapdoor", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_TRAPDOOR.get(), basicProperties("polished_cyan_nether_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_BUTTON = ITEMS.register("polished_cyan_nether_brick_button", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_BUTTON.get(), basicProperties("polished_cyan_nether_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE = ITEMS.register("polished_cyan_nether_brick_pressure_plate", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_PRESSURE_PLATE.get(), basicProperties("polished_cyan_nether_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CYAN_NETHER_BRICK_LAMP = ITEMS.register("polished_cyan_nether_brick_lamp", () -> new BlockItem(InspireBlocks.POLISHED_CYAN_NETHER_BRICK_LAMP.get(), basicProperties("polished_cyan_nether_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
         */

        PORTABLE_JUKEBOX = ITEMS.register("portable_jukebox", () -> new PortableJukeboxItem(basicProperties("portable_jukebox").stacksTo(1).component(InspireDataComponents.PORTABLE_JUKEBOX_CONTENTS.get(), ItemStack.EMPTY).arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES)));

        BONE_BOW = ITEMS.register("bone_bow", () -> new BowItem(basicProperties("bone_bow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));
        TWISTING_VINE_BOW = ITEMS.register("twisting_vine_bow", () -> new BowItem(basicProperties("twisting_vine_bow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));
        WEEPING_VINE_BOW = ITEMS.register("weeping_vine_bow", () -> new BowItem(basicProperties("weeping_vine_bow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));

        SOUL_BOW = ITEMS.register("soul_bow", () -> new BowItem(basicProperties("soul_bow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));
        SOUL_CROSSBOW = ITEMS.register("soul_crossbow", () -> new CrossbowItem(basicProperties("soul_crossbow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));

        SOUL_MULTI_CROSSBOW = ITEMS.register("soul_multi_crossbow", () -> new CrossbowItem(basicProperties("soul_multi_crossbow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));
        MULTI_CROSSBOW = ITEMS.register("multi_crossbow", () -> new CrossbowItem(basicProperties("multi_crossbow").stacksTo(1).arch$tab(CreativeModeTabs.COMBAT)));

        MUSIC_DISC_A_FAMILIAR_ROOM = registerBasicMusicDisc("music_disc_a_familiar_room", InspireJukeBoxSongs.MUSIC_DISC_A_FAMILIAR_ROOM);
        MUSIC_DISC_AERIE = registerBasicMusicDisc("music_disc_aerie", InspireJukeBoxSongs.MUSIC_DISC_AERIE);
        MUSIC_DISC_ARIA_MATH = registerBasicMusicDisc("music_disc_aria_math", InspireJukeBoxSongs.MUSIC_DISC_ARIA_MATH);
        MUSIC_DISC_BIOME_FEST = registerBasicMusicDisc("music_disc_biome_fest", InspireJukeBoxSongs.MUSIC_DISC_BIOME_FEST);
        MUSIC_DISC_BLIND_SPOTS = registerBasicMusicDisc("music_disc_blind_spots", InspireJukeBoxSongs.MUSIC_DISC_BLIND_SPOTS);
        MUSIC_DISC_CLARK = registerBasicMusicDisc("music_disc_clark", InspireJukeBoxSongs.MUSIC_DISC_CLARK);
        MUSIC_DISC_COMFORTING_MEMORIES = registerBasicMusicDisc("music_disc_comforting_memories", InspireJukeBoxSongs.MUSIC_DISC_COMFORTING_MEMORIES);
        MUSIC_DISC_DANNY = registerBasicMusicDisc("music_disc_danny", InspireJukeBoxSongs.MUSIC_DISC_DANNY);
        MUSIC_DISC_DREITON = registerBasicMusicDisc("music_disc_dreiton", InspireJukeBoxSongs.MUSIC_DISC_DREITON);
        MUSIC_DISC_DRY_HANDS = registerBasicMusicDisc("music_disc_dry_hands", InspireJukeBoxSongs.MUSIC_DISC_DRY_HANDS);
        MUSIC_DISC_FEATHERFALL = registerBasicMusicDisc("music_disc_featherfall", InspireJukeBoxSongs.MUSIC_DISC_FEATHERFALL);
        MUSIC_DISC_FLOATING_DREAM = registerBasicMusicDisc("music_disc_floating_dream", InspireJukeBoxSongs.MUSIC_DISC_FLOATING_DREAM);
        MUSIC_DISC_HAGGSTROM = registerBasicMusicDisc("music_disc_haggstrom", InspireJukeBoxSongs.MUSIC_DISC_HAGGSTROM);
        MUSIC_DISC_HAUNT_MUSKIE = registerBasicMusicDisc("music_disc_haunt_muskie", InspireJukeBoxSongs.MUSIC_DISC_HAUNT_MUSKIE);
        MUSIC_DISC_KEY = registerBasicMusicDisc("music_disc_key", InspireJukeBoxSongs.MUSIC_DISC_KEY);
        MUSIC_DISC_KOMOREBI = registerBasicMusicDisc("music_disc_komorebi", InspireJukeBoxSongs.MUSIC_DISC_KOMOREBI);
        MUSIC_DISC_LEFT_TO_BLOOM = registerBasicMusicDisc("music_disc_left_to_bloom", InspireJukeBoxSongs.MUSIC_DISC_LEFT_TO_BLOOM);
        MUSIC_DISC_LIVING_MICE = registerBasicMusicDisc("music_disc_living_mice", InspireJukeBoxSongs.MUSIC_DISC_LIVING_MICE);
        MUSIC_DISC_MICE_ON_VENUS = registerBasicMusicDisc("music_disc_mice_on_venus", InspireJukeBoxSongs.MUSIC_DISC_MICE_ON_VENUS);
        MUSIC_DISC_ONE_MORE_DAY = registerBasicMusicDisc("music_disc_one_more_day", InspireJukeBoxSongs.MUSIC_DISC_ONE_MORE_DAY);
        MUSIC_DISC_OXYGENE = registerBasicMusicDisc("music_disc_oxygene", InspireJukeBoxSongs.MUSIC_DISC_OXYGENE);
        MUSIC_DISC_PUZZLEBOX = registerBasicMusicDisc("music_disc_puzzlebox", InspireJukeBoxSongs.MUSIC_DISC_PUZZLEBOX);
        MUSIC_DISC_SUBWOOFER_LULLABY = registerBasicMusicDisc("music_disc_subwoofer_lullaby", InspireJukeBoxSongs.MUSIC_DISC_SUBWOOFER_LULLABY);
        MUSIC_DISC_SWEDEN = registerBasicMusicDisc("music_disc_sweden", InspireJukeBoxSongs.MUSIC_DISC_SWEDEN);
        MUSIC_DISC_TASWELL = registerBasicMusicDisc("music_disc_taswell", InspireJukeBoxSongs.MUSIC_DISC_TASWELL);
        MUSIC_DISC_WATCHER = registerBasicMusicDisc("music_disc_watcher", InspireJukeBoxSongs.MUSIC_DISC_WATCHER);
        MUSIC_DISC_WET_HANDS = registerBasicMusicDisc("music_disc_wet_hands", InspireJukeBoxSongs.MUSIC_DISC_WET_HANDS);
        MUSIC_DISC_YAKUSOKU = registerBasicMusicDisc("music_disc_yakusoku", InspireJukeBoxSongs.MUSIC_DISC_YAKUSOKU);
        MUSIC_DISC_BEGINNING_2 = registerBasicMusicDisc("music_disc_beginning_2", InspireJukeBoxSongs.MUSIC_DISC_BEGINNING_2);
        MUSIC_DISC_BROMELIAD = registerBasicMusicDisc("music_disc_bromeliad", InspireJukeBoxSongs.MUSIC_DISC_BROMELIAD);
        MUSIC_DISC_ECHO_IN_THE_WIND = registerBasicMusicDisc("music_disc_echo_in_the_wind", InspireJukeBoxSongs.MUSIC_DISC_ECHO_IN_THE_WIND);
        MUSIC_DISC_ELD_UNKNOWN = registerBasicMusicDisc("music_disc_eld_unknown", InspireJukeBoxSongs.MUSIC_DISC_ELD_UNKNOWN);
        MUSIC_DISC_AN_ORDIANRY_DAY = registerBasicMusicDisc("music_disc_an_ordinary_day", InspireJukeBoxSongs.MUSIC_DISC_AN_ORDIANRY_DAY);
        MUSIC_DISC_BELOW_AND_ABOVE = registerBasicMusicDisc("music_disc_below_and_above", InspireJukeBoxSongs.MUSIC_DISC_BELOW_AND_ABOVE);
        MUSIC_DISC_BROKEN_CLOCKS = registerBasicMusicDisc("music_disc_broken_clocks", InspireJukeBoxSongs.MUSIC_DISC_BROKEN_CLOCKS);
        MUSIC_DISC_CRESCENT_DUNES = registerBasicMusicDisc("music_disc_crescent_dunes", InspireJukeBoxSongs.MUSIC_DISC_CRESCENT_DUNES);
        MUSIC_DISC_FIREBUGS = registerBasicMusicDisc("music_disc_firebugs", InspireJukeBoxSongs.MUSIC_DISC_FIREBUGS);
        MUSIC_DISC_FIREFLIES = registerBasicMusicDisc("music_disc_fireflies", InspireJukeBoxSongs.MUSIC_DISC_FIREFLIES);
        MUSIC_DISC_INFINITE_AMETHYST = registerBasicMusicDisc("music_disc_infinite_amethyst", InspireJukeBoxSongs.MUSIC_DISC_INFINITE_AMETHYST);
        MUSIC_DISC_LABYRINTHINE = registerBasicMusicDisc("music_disc_labyrinthine", InspireJukeBoxSongs.MUSIC_DISC_LABYRINTHINE);
        MUSIC_DISC_LILYPAD = registerBasicMusicDisc("music_disc_lilypad", InspireJukeBoxSongs.MUSIC_DISC_LILYPAD);
        MUSIC_DISC_OS_PIANO = registerBasicMusicDisc("music_disc_os_piano", InspireJukeBoxSongs.MUSIC_DISC_OS_PIANO);
        MUSIC_DISC_STAND_TALL = registerBasicMusicDisc("music_disc_stand_tall", InspireJukeBoxSongs.MUSIC_DISC_STAND_TALL);
        MUSIC_DISC_WENDING = registerBasicMusicDisc("music_disc_wending", InspireJukeBoxSongs.MUSIC_DISC_WENDING);
        MUSIC_DISC_MINECRAFT = registerNonBasicMusicDisc("music_disc_minecraft", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_MINECRAFT);
        MUSIC_DISC_AXOLOTL = registerNonBasicMusicDisc("music_disc_axolotl", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_AXOLOTL);
        MUSIC_DISC_DRAGON_FISH = registerNonBasicMusicDisc("music_disc_dragon_fish", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_DRAGON_FISH);
        MUSIC_DISC_SHUNIJI = registerNonBasicMusicDisc("music_disc_shuniji", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_SHUNIJI);
        MUSIC_DISC_DEEPER = registerNonBasicMusicDisc("music_disc_deeper", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_DEEPER);
        MUSIC_DISC_ANCESTRY = registerNonBasicMusicDisc("music_disc_ancestry", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_ANCESTRY);
        MUSIC_DISC_BALLAD_OF_THE_CATS = registerNonBasicMusicDisc("music_disc_ballad_of_the_cats", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_BALLAD_OF_THE_CATS);
        MUSIC_DISC_CHRYSAPOEIA = registerNonBasicMusicDisc("music_disc_chrysopoeia", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_CHRYSAPOEIA);
        MUSIC_DISC_CONCRETE_HALLS = registerNonBasicMusicDisc("music_disc_concrete_halls", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_CONCRETE_HALLS);
        MUSIC_DISC_DEAD_VOXEL = registerNonBasicMusicDisc("music_disc_dead_voxel", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_DEAD_VOXEL);
        MUSIC_DISC_RUBEDO = registerNonBasicMusicDisc("music_disc_rubedo", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_RUBEDO);
        MUSIC_DISC_SO_BELOW = registerNonBasicMusicDisc("music_disc_so_below", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_SO_BELOW);
        MUSIC_DISC_WARMTH = registerNonBasicMusicDisc("music_disc_warmth", new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_WARMTH);
        MUSIC_DISC_THE_END = registerNonBasicMusicDisc("music_disc_the_end",new Item.Properties().rarity(Rarity.RARE), InspireJukeBoxSongs.MUSIC_DISC_THE_END);
        MUSIC_DISC_BOSS = registerNonBasicMusicDisc("music_disc_boss", new Item.Properties().rarity(Rarity.EPIC).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), InspireJukeBoxSongs.MUSIC_DISC_BOSS);
        MUSIC_DISC_ALPHA = registerNonBasicMusicDisc("music_disc_alpha", new Item.Properties().rarity(Rarity.EPIC).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), InspireJukeBoxSongs.MUSIC_DISC_ALPHA);
    }
    private static RegistrySupplier<Item> registerBasicMusicDisc(String name, ResourceKey<JukeboxSong> jukeboxSongResourceKey) {
        return ITEMS.register(name, () -> new Item(basicProperties(name)
                // setId() is not available in Minecraft 1.21.1
                .stacksTo(1)
                .rarity(Rarity.UNCOMMON)
                .jukeboxPlayable(jukeboxSongResourceKey)
                .arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
        ));
    }
    private static RegistrySupplier<Item> registerNonBasicMusicDisc(String name, Item.Properties properties, ResourceKey<JukeboxSong> jukeboxSongResourceKey) {
        return ITEMS.register(name, () -> new Item(basicProperties(name)
                .stacksTo(1)
                .jukeboxPlayable(jukeboxSongResourceKey)
                .arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
        ));
    }

    private static Item.Properties basicProperties(String name) {
        // setId() is not available in Minecraft 1.21.1
        return new Item.Properties();
    }
}
