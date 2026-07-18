package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.item.*;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnstableApiUsage")
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
    public static final RegistrySupplier<Item> CARAMEL;
    //public static final RegistrySupplier<Item> CARAMEL_APPLE;
    //public static final RegistrySupplier<Item> CARAMEL_GOLDEN_APPLE;
    //public static final RegistrySupplier<Item> CARAMEL_ENCHANTED_GOLDEN_APPLE;
    public static final RegistrySupplier<Item> NETHER_POTATO;
    public static final RegistrySupplier<Item> BAKED_NETHER_POTATO;
    public static final RegistrySupplier<Item> POISONOUS_NETHER_POTATO;
    public static final RegistrySupplier<Item> NETHER_CARROT;
    public static final RegistrySupplier<Item> BAKED_NETHER_CARROT;
    public static final RegistrySupplier<Item> NETHER_BEETROOT;
    public static final RegistrySupplier<Item> BAKED_NETHER_BEETROOT;
    //public static final RegistrySupplier<Item> CREEPER_COOKIE;
    //public static final RegistrySupplier<Item> CHOCOLATE_COOKIE;
    //public static final RegistrySupplier<Item> SUGAR_COOKIE;
    //public static final RegistrySupplier<Item> HOT_PEPPER;
    //public static final RegistrySupplier<Item> TOMATO;
    //public static final RegistrySupplier<Item> GARLIC;
    //public static final RegistrySupplier<Item> ONION;
    //public static final RegistrySupplier<Item> NETHER_BEETROOT_SOUP;
    //public static final RegistrySupplier<Item> NETHER_CARROT_SOUP;
    //public static final RegistrySupplier<Item> NETHER_POTATO_SOUP;
    //public static final RegistrySupplier<Item> SWEET_BERRY_JAR;
    //public static final RegistrySupplier<Item> GLOW_BERRY_JAR;
    //public static final RegistrySupplier<Item> SWEET_BERRY_JELLY_JAR;
    //public static final RegistrySupplier<Item> GLOW_BERRY_JELLY_JAR;
    //public static final RegistrySupplier<Item> NETHER_BEETROOT_SOUP_JAR;
    //public static final RegistrySupplier<Item> NETHER_CARROT_SOUP_JAR;
    //public static final RegistrySupplier<Item> NETHER_POTATO_SOUP_JAR;
    //public static final RegistrySupplier<Item> CHOCOLATE_MILK_JAR;
    public static final RegistrySupplier<Item> SOUL_BOTTLE;

    //public static final RegistrySupplier<Item> OAK_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> SPRUCE_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> BIRCH_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> JUNGLE_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> ACACIA_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> DARK_OAK_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> MANGROVE_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> CRIMSON_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> WARPED_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> WITHERED_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> PINE_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> REDWOOD_FURNACE_BOAT;
    //public static final RegistrySupplier<Item> CHROMATIC_LAMP;
    //public static final RegistrySupplier<Item> DRY_CACTUS_BLOCK;
    //public static final RegistrySupplier<Item> POTION_BUCKET;
    public static final RegistrySupplier<Item> SOUL_BUCKET;
    public static final RegistrySupplier<Item> HONEY_BUCKET;
    public static final RegistrySupplier<Item> DYNAMITE;
    public static final RegistrySupplier<Item> CUSTOM_ARROW;
    public static final RegistrySupplier<Item> STRIDER_SCALE;
    public static final RegistrySupplier<Item> BAKED_BEETROOT;
    public static final RegistrySupplier<Item> BAKED_CARROT;
    public static final RegistrySupplier<Item> COOKED_TROPICAL_FISH;
    public static final RegistrySupplier<Item> DOUGH;
    public static final RegistrySupplier<Item> CARROT_SOUP;
    public static final RegistrySupplier<Item> POTATO_SOUP;
    public static final RegistrySupplier<Item> BEEF_STEW;
    public static final RegistrySupplier<Item> CHICKEN_STEW;
    public static final RegistrySupplier<Item> MUTTON_STEW;
    public static final RegistrySupplier<Item> EMPTY_JAR;
    public static final RegistrySupplier<Item> POTION_JAR;
    public static final RegistrySupplier<Item> MILK_JAR;
    public static final RegistrySupplier<Item> HONEY_JAR;
    public static final RegistrySupplier<Item> BEETROOT_SOUP_JAR;
    public static final RegistrySupplier<Item> CARROT_SOUP_JAR;
    public static final RegistrySupplier<Item> POTATO_SOUP_JAR;
    public static final RegistrySupplier<Item> BEEF_STEW_JAR;
    public static final RegistrySupplier<Item> CHICKEN_STEW_JAR;
    public static final RegistrySupplier<Item> MUTTON_STEW_JAR;
    public static final RegistrySupplier<Item> SUSPICIOUS_STEW_JAR;
    public static final RegistrySupplier<Item> MUSHROOM_STEW_JAR;
    public static final RegistrySupplier<Item> RABBIT_STEW_JAR;
    public static final RegistrySupplier<Item> WOODEN_CLUB;
    public static final RegistrySupplier<Item> STONE_CLUB;
    public static final RegistrySupplier<Item> IRON_CLUB;
    public static final RegistrySupplier<Item> GOLD_CLUB;
    public static final RegistrySupplier<Item> DIAMOND_CLUB;
    public static final RegistrySupplier<Item> NETHERITE_CLUB;
    public static final RegistrySupplier<Item> STONE_SPEAR;
    public static final RegistrySupplier<Item> IRON_SPEAR;
    public static final RegistrySupplier<Item> GOLD_SPEAR;
    public static final RegistrySupplier<Item> DIAMOND_SPEAR;
    public static final RegistrySupplier<Item> NETHERITE_SPEAR;
    public static final RegistrySupplier<Item> WHITE_DYE_GLOB;
    public static final RegistrySupplier<Item> ORANGE_DYE_GLOB;
    public static final RegistrySupplier<Item> MAGENTA_DYE_GLOB;
    public static final RegistrySupplier<Item> LIGHT_BLUE_DYE_GLOB;
    public static final RegistrySupplier<Item> YELLOW_DYE_GLOB;
    public static final RegistrySupplier<Item> LIME_DYE_GLOB;
    public static final RegistrySupplier<Item> PINK_DYE_GLOB;
    public static final RegistrySupplier<Item> GRAY_DYE_GLOB;
    public static final RegistrySupplier<Item> GREEN_DYE_GLOB;
    public static final RegistrySupplier<Item> LIGHT_GRAY_DYE_GLOB;
    public static final RegistrySupplier<Item> CYAN_DYE_GLOB;
    public static final RegistrySupplier<Item> PURPLE_DYE_GLOB;
    public static final RegistrySupplier<Item> BLUE_DYE_GLOB;
    public static final RegistrySupplier<Item> BROWN_DYE_GLOB;
    public static final RegistrySupplier<Item> RED_DYE_GLOB;
    public static final RegistrySupplier<Item> BLACK_DYE_GLOB;
    public static final RegistrySupplier<Item> WHITE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> ORANGE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> MAGENTA_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> LIGHT_BLUE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> YELLOW_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> LIME_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> PINK_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> GRAY_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> GREEN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> LIGHT_GRAY_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> CYAN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> PURPLE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> BLUE_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> BROWN_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> RED_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> BLACK_DYE_GLOB_BLOCK;
    public static final RegistrySupplier<Item> CRAFTED_ELYTRA;
    public static final RegistrySupplier<Item> CRIMSON_BOAT;
    public static final RegistrySupplier<Item> WARPED_BOAT;
    public static final RegistrySupplier<Item> WITHERED_BOAT;
    public static final RegistrySupplier<Item> PINE_BOAT;
    public static final RegistrySupplier<Item> REDWOOD_BOAT;
    public static final RegistrySupplier<Item> CRIMSON_CHEST_BOAT;
    public static final RegistrySupplier<Item> WARPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> WITHERED_CHEST_BOAT;
    public static final RegistrySupplier<Item> PINE_CHEST_BOAT;
    public static final RegistrySupplier<Item> REDWOOD_CHEST_BOAT;
    public static final RegistrySupplier<Item> OAK_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> SPRUCE_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> BIRCH_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> JUNGLE_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> ACACIA_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> DARK_OAK_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> MANGROVE_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> CRIMSON_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> WARPED_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> WITHERED_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> PINE_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> REDWOOD_ENDER_CHEST_BOAT;
    public static final RegistrySupplier<Item> OAK_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> SPRUCE_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> BIRCH_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> JUNGLE_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> ACACIA_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> DARK_OAK_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> MANGROVE_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> CRIMSON_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> WARPED_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> WITHERED_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> PINE_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> REDWOOD_TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<Item> STRIDER_SCALE_BOOTS;
    public static final RegistrySupplier<Item> BLUESTONE;
    public static final RegistrySupplier<Item> BLUESTONE_TORCH;
    public static final RegistrySupplier<Item> PRISMARINE_LEVER;
    public static final RegistrySupplier<Item> PRISMARINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> PRISMARINE_BUTTON;
    public static final RegistrySupplier<Item> BLUESTONE_REPEATER;
    public static final RegistrySupplier<Item> BLUESTONE_COMPARATOR;
    public static final RegistrySupplier<Item> PRISMARINE_LAMP_BLOCK;
    public static final RegistrySupplier<Item> BLUESTONE_ORE_BLOCK;
    public static final RegistrySupplier<Item> DEEPSLATE_BLUESTONE_ORE_BLOCK;
    public static final RegistrySupplier<Item> AMETHYST_ORE_BLOCK;
    public static final RegistrySupplier<Item> DEEPSLATE_AMETHYST_ORE_BLOCK;
    public static final RegistrySupplier<Item> PRISMARINE_ORE_BLOCK;
    public static final RegistrySupplier<Item> DEEPSLATE_PRISMARINE_ORE_BLOCK;
    public static final RegistrySupplier<Item> BLUESTONE_BLOCK_BLOCK;

    public static final RegistrySupplier<Item> WITHERED_BONE_BLOCK_BLOCK;
    public static final RegistrySupplier<Item> WITHERED_BONE_MEAL;
    public static final RegistrySupplier<Item> WITHERED_BONE;

    public static final RegistrySupplier<Item> WITHERED_PLANKS;
    public static final RegistrySupplier<Item> WITHERED_SAPLING;
    public static final RegistrySupplier<Item> WITHERED_LOG;
    public static final RegistrySupplier<Item> STRIPPED_WITHERED_LOG;
    public static final RegistrySupplier<Item> WITHERED_WOOD;
    public static final RegistrySupplier<Item> STRIPPED_WITHERED_WOOD;
    public static final RegistrySupplier<Item> WITHERED_STAIRS;
    public static final RegistrySupplier<Item> WITHERED_SIGN;
    public static final RegistrySupplier<Item> WITHERED_DOOR;
    public static final RegistrySupplier<Item> WITHERED_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> WITHERED_FENCE;
    public static final RegistrySupplier<Item> WITHERED_TRAPDOOR;
    public static final RegistrySupplier<Item> WITHERED_FENCE_GATE;
    public static final RegistrySupplier<Item> WITHERED_BUTTON;
    public static final RegistrySupplier<Item> WITHERED_SLAB;

    public static final RegistrySupplier<Item> PINE_PLANKS;
    public static final RegistrySupplier<Item> PINE_SAPLING;
    public static final RegistrySupplier<Item> PINE_LOG;
    public static final RegistrySupplier<Item> STRIPPED_PINE_LOG;
    public static final RegistrySupplier<Item> PINE_WOOD;
    public static final RegistrySupplier<Item> STRIPPED_PINE_WOOD;
    public static final RegistrySupplier<Item> PINE_STAIRS;
    public static final RegistrySupplier<Item> PINE_SIGN;
    public static final RegistrySupplier<Item> PINE_DOOR;
    public static final RegistrySupplier<Item> PINE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> PINE_FENCE;
    public static final RegistrySupplier<Item> PINE_TRAPDOOR;
    public static final RegistrySupplier<Item> PINE_FENCE_GATE;
    public static final RegistrySupplier<Item> PINE_BUTTON;
    public static final RegistrySupplier<Item> PINE_SLAB;

    public static final RegistrySupplier<Item> REDWOOD_PLANKS;
    public static final RegistrySupplier<Item> REDWOOD_SAPLING;
    public static final RegistrySupplier<Item> REDWOOD_LOG;
    public static final RegistrySupplier<Item> STRIPPED_REDWOOD_LOG;
    public static final RegistrySupplier<Item> REDWOOD_WOOD;
    public static final RegistrySupplier<Item> STRIPPED_REDWOOD_WOOD;
    public static final RegistrySupplier<Item> REDWOOD_STAIRS;
    public static final RegistrySupplier<Item> REDWOOD_SIGN;
    public static final RegistrySupplier<Item> REDWOOD_DOOR;
    public static final RegistrySupplier<Item> REDWOOD_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> REDWOOD_FENCE;
    public static final RegistrySupplier<Item> REDWOOD_TRAPDOOR;
    public static final RegistrySupplier<Item> REDWOOD_FENCE_GATE;
    public static final RegistrySupplier<Item> REDWOOD_BUTTON;
    public static final RegistrySupplier<Item> REDWOOD_SLAB;

    public static final RegistrySupplier<Item> OAK_BARK;
    public static final RegistrySupplier<Item> SPRUCE_BARK;
    public static final RegistrySupplier<Item> BIRCH_BARK;
    public static final RegistrySupplier<Item> JUNGLE_BARK;
    public static final RegistrySupplier<Item> ACACIA_BARK;
    public static final RegistrySupplier<Item> DARK_OAK_BARK;
    public static final RegistrySupplier<Item> MANGROVE_BARK;
    //public static final RegistrySupplier<Item> CHERRY_BARK;
    //public static final RegistrySupplier<Item> PALE_BARK;
    public static final RegistrySupplier<Item> WITHERED_BARK;
    public static final RegistrySupplier<Item> PINE_BARK;
    public static final RegistrySupplier<Item> REDWOOD_BARK;
    public static final RegistrySupplier<Item> SOUL_GLASS;
    public static final RegistrySupplier<Item> CHEESE;

    public static final RegistrySupplier<Item> CORN;
    public static final RegistrySupplier<Item> DRIED_CORN;
    public static final RegistrySupplier<Item> BAKED_CORN;
    public static final RegistrySupplier<Item> POPPED_CORN;
    public static final RegistrySupplier<Item> CARMEL_CORN;

    public static final RegistrySupplier<Item> IRON_PICKAXE_HEAD;
    public static final RegistrySupplier<Item> IRON_AXE_HEAD;
    public static final RegistrySupplier<Item> IRON_SHOVEL_HEAD;
    public static final RegistrySupplier<Item> IRON_HOE_HEAD;
    public static final RegistrySupplier<Item> IRON_SWORD_BLADE;

    public static final RegistrySupplier<Item> GOLD_PICKAXE_HEAD;
    public static final RegistrySupplier<Item> GOLD_AXE_HEAD;
    public static final RegistrySupplier<Item> GOLD_SHOVEL_HEAD;
    public static final RegistrySupplier<Item> GOLD_HOE_HEAD;
    public static final RegistrySupplier<Item> GOLD_SWORD_BLADE;

    public static final RegistrySupplier<Item> DIAMOND_PICKAXE_HEAD;
    public static final RegistrySupplier<Item> DIAMOND_AXE_HEAD;
    public static final RegistrySupplier<Item> DIAMOND_SHOVEL_HEAD;
    public static final RegistrySupplier<Item> DIAMOND_HOE_HEAD;
    public static final RegistrySupplier<Item> DIAMOND_SWORD_BLADE;

    public static final RegistrySupplier<Item> NETHERITE_PICKAXE_HEAD;
    public static final RegistrySupplier<Item> NETHERITE_AXE_HEAD;
    public static final RegistrySupplier<Item> NETHERITE_SHOVEL_HEAD;
    public static final RegistrySupplier<Item> NETHERITE_HOE_HEAD;
    public static final RegistrySupplier<Item> NETHERITE_SWORD_BLADE;
    public static final RegistrySupplier<Item> WAND_OF_LIGHT;
    public static final RegistrySupplier<Item> CRAFTING_TABLET;//Locates Ore

    //public static final RegistrySupplier<Item> FOUNDRY;
    //public static final RegistrySupplier<Item> DIS_ENCHANTING_TABLE; EnchantmentTableBlock
    //public static final RegistrySupplier<Item> CURSED_TABLE;//wither skull as book and wither bones to curse
    //public static final RegistrySupplier<Item> CONJERING_TABLE;//wither skull as book and wither bones to curse
    //public static final RegistrySupplier<Item> WHITE_PUMPKIN;
    //public static final RegistrySupplier<Item> GREEN_PUMPKIN;
    //public static final RegistrySupplier<Item> GOLDEN_CROWN;
    //public static final RegistrySupplier<Item> GOLDEN_CROWN;//Trade with Piglin Like villigers
    //public static final RegistrySupplier<Item> NETHERITE_CROWN;//Trade with Piglin Like villigers and they will defend you
    //public static final RegistrySupplier<Item> PRISMARINE_CROWN;//Trade with Gilligers Like villigers and they will defend you
    //public static final RegistrySupplier<Item> PUR_PUR_CROWN;//ENDERMEN will defend you
    //public static final RegistrySupplier<Item> TRAVEL_STONE;//teleports user
    //public static final RegistrySupplier<Item> MINERS_COMPASS;//Locates Ore
    //public static final RegistrySupplier<Item> SMELTING_TABLET;//Locates Ore
    //public static final RegistrySupplier<Item> ENDER_BOX;//Locates Ore
    //public static final RegistrySupplier<Item> REDSTONE_HEART;//Locates Ore
    //public static final RegistrySupplier<Item> BUCKET_OF_VOID;//Locates Ore
    //public static final RegistrySupplier<Item> BUCKET_OF_OCEANS;//Locates Ore
    //public static final RegistrySupplier<Item> BEDROCK_SHARD;//Locates Ore
    //public static final RegistrySupplier<Item> SPELL_BOOK;//Locates Ore

    public static final RegistrySupplier<Item> SCULK_SLUDGE_BUCKET;

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

    public static final RegistrySupplier<Item> CRACKED_POLISHED_BLACKSTONE;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_LAMP;

    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_FENCE;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_DOOR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_BRICK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_GILDED_BLACKSTONE;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_STAIRS;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_SLAB;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_WALL;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_FENCE;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_GILDED_BLACKSTONE;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_PILLAR;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_DOOR;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_BUTTON;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> GILDED_BLACKSTONE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_SMOOTH_STONE;
    public static final RegistrySupplier<Item> SMOOTH_STONE_STAIRS;
    public static final RegistrySupplier<Item> SMOOTH_STONE_WALL;
    public static final RegistrySupplier<Item> SMOOTH_STONE_FENCE;
    public static final RegistrySupplier<Item> SMOOTH_STONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_SMOOTH_STONE;
    public static final RegistrySupplier<Item> SMOOTH_STONE_PILLAR;
    public static final RegistrySupplier<Item> SMOOTH_STONE_DOOR;
    public static final RegistrySupplier<Item> SMOOTH_STONE_TRAPDOOR;
    public static final RegistrySupplier<Item> SMOOTH_STONE_BUTTON;
    public static final RegistrySupplier<Item> SMOOTH_STONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SMOOTH_STONE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_REDSTONE_BLOCK;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_SLAB;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_WALL;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_FENCE;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_REDSTONE_BLOCK;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_DOOR;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> REDSTONE_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_AMETHYST_BLOCK;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_SLAB;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_WALL;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_FENCE;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_AMETHYST_BLOCK;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_DOOR;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> AMETHYST_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_GLOWSTONE;
    public static final RegistrySupplier<Item> GLOWSTONE_STAIRS;
    public static final RegistrySupplier<Item> GLOWSTONE_SLAB;
    public static final RegistrySupplier<Item> GLOWSTONE_WALL;
    public static final RegistrySupplier<Item> GLOWSTONE_FENCE;
    public static final RegistrySupplier<Item> GLOWSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_GLOWSTONE;
    public static final RegistrySupplier<Item> GLOWSTONE_PILLAR;
    public static final RegistrySupplier<Item> GLOWSTONE_DOOR;
    public static final RegistrySupplier<Item> GLOWSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> GLOWSTONE_BUTTON;
    public static final RegistrySupplier<Item> GLOWSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> GLOWSTONE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_SMOOTH_BASALT;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_STAIRS;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_SLAB;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_WALL;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_FENCE;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_SMOOTH_BASALT;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_PILLAR;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_DOOR;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_TRAPDOOR;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_BUTTON;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SMOOTH_BASALT_LAMP;

    public static final RegistrySupplier<Item> CRACKED_POLISHED_BASALT;
    public static final RegistrySupplier<Item> POLISHED_BASALT_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_BASALT_SLAB;
    public static final RegistrySupplier<Item> POLISHED_BASALT_WALL;
    public static final RegistrySupplier<Item> POLISHED_BASALT_FENCE;
    public static final RegistrySupplier<Item> POLISHED_BASALT_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_BASALT;
    public static final RegistrySupplier<Item> POLISHED_BASALT_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_BASALT_DOOR;
    public static final RegistrySupplier<Item> POLISHED_BASALT_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_BASALT_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_BASALT_LAMP;

    public static final RegistrySupplier<Item> CRACKED_BASALT;
    public static final RegistrySupplier<Item> BASALT_STAIRS;
    public static final RegistrySupplier<Item> BASALT_SLAB;
    public static final RegistrySupplier<Item> BASALT_WALL;
    public static final RegistrySupplier<Item> BASALT_FENCE;
    public static final RegistrySupplier<Item> BASALT_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_BASALT;
    public static final RegistrySupplier<Item> BASALT_PILLAR;
    public static final RegistrySupplier<Item> BASALT_DOOR;
    public static final RegistrySupplier<Item> BASALT_TRAPDOOR;
    public static final RegistrySupplier<Item> BASALT_BUTTON;
    public static final RegistrySupplier<Item> BASALT_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> BASALT_LAMP;

    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_SLAB;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_WALL;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_GLOWSTONE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_LAMP;

    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_SLAB;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_WALL;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_FENCE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_GLOWSTONE_BRICKS;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_DOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_BRICK_LAMP;

    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_SLAB;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_WALL;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_GLOWSTONE_TILES;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_GLOWSTONE_TILE_LAMP;

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

    public static final RegistrySupplier<Item> CRACKED_POLISHED_TUFF;
    public static final RegistrySupplier<Item> POLISHED_TUFF_FENCE;
    public static final RegistrySupplier<Item> POLISHED_TUFF_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_TUFF;
    public static final RegistrySupplier<Item> POLISHED_TUFF_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_TUFF_DOOR;
    public static final RegistrySupplier<Item> POLISHED_TUFF_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_TUFF_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_TUFF_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_TUFF_LAMP;

    public static final RegistrySupplier<Item> CRACKED_TUFF_BRICKS;
    public static final RegistrySupplier<Item> TUFF_BRICK_FENCE;
    public static final RegistrySupplier<Item> TUFF_BRICK_FENCE_GATE;
    public static final RegistrySupplier<Item> TUFF_BRICK_PILLAR;
    public static final RegistrySupplier<Item> TUFF_BRICK_DOOR;
    public static final RegistrySupplier<Item> TUFF_BRICK_TRAPDOOR;
    public static final RegistrySupplier<Item> TUFF_BRICK_BUTTON;
    public static final RegistrySupplier<Item> TUFF_BRICK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> TUFF_BRICK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_QUARTZ;
    public static final RegistrySupplier<Item> QUARTZ_WALL;
    public static final RegistrySupplier<Item> QUARTZ_FENCE;
    public static final RegistrySupplier<Item> QUARTZ_FENCE_GATE;
    public static final RegistrySupplier<Item> QUARTZ_DOOR;
    public static final RegistrySupplier<Item> QUARTZ_TRAPDOOR;
    public static final RegistrySupplier<Item> QUARTZ_BUTTON;
    public static final RegistrySupplier<Item> QUARTZ_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> QUARTZ_LAMP;

    public static final RegistrySupplier<Item> CRACKED_SMOOTH_QUARTZ;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_WALL;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_FENCE;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_SMOOTH_QUARTZ;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_PILLAR;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_DOOR;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_TRAPDOOR;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_BUTTON;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SMOOTH_QUARTZ_LAMP;

    public static final RegistrySupplier<Item> RESIN;
    public static final RegistrySupplier<Item> CRACKED_RESIN;
    public static final RegistrySupplier<Item> RESIN_STAIRS;
    public static final RegistrySupplier<Item> RESIN_SLAB;
    public static final RegistrySupplier<Item> RESIN_WALL;
    public static final RegistrySupplier<Item> RESIN_FENCE;
    public static final RegistrySupplier<Item> RESIN_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_RESIN;
    public static final RegistrySupplier<Item> RESIN_PILLAR;
    public static final RegistrySupplier<Item> RESIN_DOOR;
    public static final RegistrySupplier<Item> RESIN_TRAPDOOR;
    public static final RegistrySupplier<Item> RESIN_BUTTON;
    public static final RegistrySupplier<Item> RESIN_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> RESIN_LAMP;

    public static final RegistrySupplier<Item> CRACKED_POLISHED_GRANITE;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_WALL;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_GRANITE;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_GRANITE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_POLISHED_DIORITE;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_WALL;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_DIORITE;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_DIORITE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_WALL;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_ANDESITE;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_ANDESITE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_SANDSTONE;
    public static final RegistrySupplier<Item> SANDSTONE_FENCE;
    public static final RegistrySupplier<Item> SANDSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> SANDSTONE_PILLAR;
    public static final RegistrySupplier<Item> SANDSTONE_DOOR;
    public static final RegistrySupplier<Item> SANDSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> SANDSTONE_BUTTON;
    public static final RegistrySupplier<Item> SANDSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SANDSTONE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_IRON_BLOCK;
    public static final RegistrySupplier<Item> IRON_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> IRON_BLOCK_SLAB;
    public static final RegistrySupplier<Item> IRON_BLOCK_WALL;
    public static final RegistrySupplier<Item> IRON_BLOCK_FENCE;
    public static final RegistrySupplier<Item> IRON_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_IRON_BLOCK;
    public static final RegistrySupplier<Item> IRON_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> IRON_BLOCK_DOOR;
    public static final RegistrySupplier<Item> IRON_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> IRON_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> IRON_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> IRON_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_GOLD_BLOCK;
    public static final RegistrySupplier<Item> GOLD_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> GOLD_BLOCK_SLAB;
    public static final RegistrySupplier<Item> GOLD_BLOCK_WALL;
    public static final RegistrySupplier<Item> GOLD_BLOCK_FENCE;
    public static final RegistrySupplier<Item> GOLD_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_GOLD_BLOCK;
    public static final RegistrySupplier<Item> GOLD_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> GOLD_BLOCK_DOOR;
    public static final RegistrySupplier<Item> GOLD_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> GOLD_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> GOLD_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> GOLD_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_EMERALD_BLOCK;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_SLAB;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_WALL;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_FENCE;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_EMERALD_BLOCK;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_DOOR;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> EMERALD_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_DIAMOND_BLOCK;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_SLAB;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_WALL;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_FENCE;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_DIAMOND_BLOCK;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_DOOR;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> DIAMOND_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_NETHERITE_BLOCK;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_STAIRS;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_SLAB;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_WALL;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_FENCE;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_NETHERITE_BLOCK;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_PILLAR;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_DOOR;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_TRAPDOOR;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_BUTTON;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> NETHERITE_BLOCK_LAMP;

    public static final RegistrySupplier<Item> CRACKED_OBSIDIAN;
    public static final RegistrySupplier<Item> OBSIDIAN_STAIRS;
    public static final RegistrySupplier<Item> OBSIDIAN_SLAB;
    public static final RegistrySupplier<Item> OBSIDIAN_WALL;
    public static final RegistrySupplier<Item> OBSIDIAN_FENCE;
    public static final RegistrySupplier<Item> OBSIDIAN_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_OBSIDIAN;
    public static final RegistrySupplier<Item> OBSIDIAN_PILLAR;
    public static final RegistrySupplier<Item> OBSIDIAN_DOOR;
    public static final RegistrySupplier<Item> OBSIDIAN_TRAPDOOR;
    public static final RegistrySupplier<Item> OBSIDIAN_BUTTON;
    public static final RegistrySupplier<Item> OBSIDIAN_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> OBSIDIAN_LAMP;

    public static final RegistrySupplier<Item> CRACKED_CRYING_OBSIDIAN;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_STAIRS;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_SLAB;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_WALL;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_FENCE;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_CRYING_OBSIDIAN;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_PILLAR;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_DOOR;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TRAPDOOR;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BUTTON;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> CRYING_OBSIDIAN_LAMP;

    public static final RegistrySupplier<Item> CRACKED_BEDROCK;
    public static final RegistrySupplier<Item> BEDROCK_STAIRS;
    public static final RegistrySupplier<Item> BEDROCK_SLAB;
    public static final RegistrySupplier<Item> BEDROCK_WALL;
    public static final RegistrySupplier<Item> BEDROCK_FENCE;
    public static final RegistrySupplier<Item> BEDROCK_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_BEDROCK;
    public static final RegistrySupplier<Item> BEDROCK_PILLAR;
    public static final RegistrySupplier<Item> BEDROCK_DOOR;
    public static final RegistrySupplier<Item> BEDROCK_TRAPDOOR;
    public static final RegistrySupplier<Item> BEDROCK_BUTTON;
    public static final RegistrySupplier<Item> BEDROCK_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> BEDROCK_LAMP;

    public static final RegistrySupplier<Item> SOUL_SANDSTONE;
    public static final RegistrySupplier<Item> CRACKED_SOUL_SANDSTONE;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_STAIRS;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_SLAB;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_WALL;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_FENCE;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_SOUL_SANDSTONE;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_PILLAR;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_DOOR;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_BUTTON;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SOUL_SANDSTONE_LAMP;

    public static final RegistrySupplier<Item> SOUL_SLATE;
    public static final RegistrySupplier<Item> CRACKED_SOUL_SLATE;
    public static final RegistrySupplier<Item> SOUL_SLATE_STAIRS;
    public static final RegistrySupplier<Item> SOUL_SLATE_SLAB;
    public static final RegistrySupplier<Item> SOUL_SLATE_WALL;
    public static final RegistrySupplier<Item> SOUL_SLATE_FENCE;
    public static final RegistrySupplier<Item> SOUL_SLATE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_SOUL_SLATE;
    public static final RegistrySupplier<Item> SOUL_SLATE_PILLAR;
    public static final RegistrySupplier<Item> SOUL_SLATE_DOOR;
    public static final RegistrySupplier<Item> SOUL_SLATE_TRAPDOOR;
    public static final RegistrySupplier<Item> SOUL_SLATE_BUTTON;
    public static final RegistrySupplier<Item> SOUL_SLATE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> SOUL_SLATE_LAMP;

    public static final RegistrySupplier<Item> CRACKED_DRIPSTONE;
    public static final RegistrySupplier<Item> DRIPSTONE_STAIRS;
    public static final RegistrySupplier<Item> DRIPSTONE_SLAB;
    public static final RegistrySupplier<Item> DRIPSTONE_WALL;
    public static final RegistrySupplier<Item> DRIPSTONE_FENCE;
    public static final RegistrySupplier<Item> DRIPSTONE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_DRIPSTONE;
    public static final RegistrySupplier<Item> DRIPSTONE_PILLAR;
    public static final RegistrySupplier<Item> DRIPSTONE_DOOR;
    public static final RegistrySupplier<Item> DRIPSTONE_TRAPDOOR;
    public static final RegistrySupplier<Item> DRIPSTONE_BUTTON;
    public static final RegistrySupplier<Item> DRIPSTONE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> DRIPSTONE_LAMP;

    public static final RegistrySupplier<Item> POLISHED_CALCITE;
    public static final RegistrySupplier<Item> CRACKED_POLISHED_CALCITE;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_STAIRS;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_SLAB;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_WALL;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_FENCE;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_FENCE_GATE;
    public static final RegistrySupplier<Item> CHISELED_POLISHED_CALCITE;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_PILLAR;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_DOOR;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_TRAPDOOR;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_BUTTON;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_PRESSURE_PLATE;
    public static final RegistrySupplier<Item> POLISHED_CALCITE_LAMP;

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
    public static final RegistrySupplier<Item> HARNESS;
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
    public static final RegistrySupplier<Item> WET_SAND;
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
        // Legacy throwable behavior temporarily disabled for 1.21.1 compile stability.
        DYNAMITE = ITEMS.register("dynamite", () -> new Item(new Item.Properties().stacksTo(16).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CUSTOM_ARROW = ITEMS.register("custom_arrow", () -> new Item(new Item.Properties().stacksTo(64).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        STRIDER_SCALE = ITEMS.register("strider_scale", () -> new Item(new Item.Properties().stacksTo(64).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_BEETROOT = ITEMS.register("baked_beetroot", () -> new Item(new Item.Properties().food(InspireFoods.BAKED_BEETROOT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_CARROT = ITEMS.register("baked_carrot", () -> new Item(new Item.Properties().food(InspireFoods.BAKED_CARROT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish", () -> new Item(new Item.Properties().food(InspireFoods.COOKED_TROPICAL_FISH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().food(InspireFoods.DOUGH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_POTATO = ITEMS.register("nether_potato", () -> new Item(new Item.Properties().food(InspireFoods.NETHER_POTATO).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_NETHER_POTATO = ITEMS.register("baked_nether_potato", () -> new Item(new Item.Properties().food(InspireFoods.BAKED_NETHER_POTATO).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        POISONOUS_NETHER_POTATO = ITEMS.register("poisonous_nether_potato", () -> new Item(new Item.Properties().food(InspireFoods.POISONOUS_NETHER_POTATO).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_CARROT = ITEMS.register("nether_carrot", () -> new Item(new Item.Properties().food(InspireFoods.NETHER_CARROT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_NETHER_CARROT = ITEMS.register("baked_nether_carrot", () -> new Item(new Item.Properties().food(InspireFoods.BAKED_NETHER_CARROT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_BEETROOT = ITEMS.register("nether_beetroot", () -> new Item(new Item.Properties().food(InspireFoods.NETHER_BEETROOT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_NETHER_BEETROOT = ITEMS.register("baked_nether_beetroot", () -> new Item(new Item.Properties().food(InspireFoods.BAKED_NETHER_BEETROOT).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CARROT_SOUP = ITEMS.register("carrot_soup", () -> new Item(new Item.Properties().food(InspireFoods.CARROT_SOUP).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        POTATO_SOUP = ITEMS.register("potato_soup", () -> new Item(new Item.Properties().food(InspireFoods.POTATO_SOUP).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BEEF_STEW = ITEMS.register("beef_stew", () -> new Item(new Item.Properties().food(InspireFoods.BEEF_STEW).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CHICKEN_STEW = ITEMS.register("chicken_stew", () -> new Item(new Item.Properties().food(InspireFoods.CHICKEN_STEW).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MUTTON_STEW = ITEMS.register("mutton_stew", () -> new Item(new Item.Properties().food(InspireFoods.MUTTON_STEW).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        EMPTY_JAR = ITEMS.register("empty_jar", () -> new Item(new Item.Properties().stacksTo(64).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        POTION_JAR = ITEMS.register("potion_jar", () -> new Item(new Item.Properties().stacksTo(1).durability(3).arch$tab(InspireCreativeTabs.TAB_INSPIRE).craftRemainder(InspireItems.EMPTY_JAR.get())));
        MILK_JAR = ITEMS.register("milk_jar", () -> new MilkJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).craftRemainder(InspireItems.EMPTY_JAR.get())));
        HONEY_JAR = ITEMS.register("honey_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.HONEY_BOTTLE).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public boolean isHoney() {
                return true;
            }

            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.HONEY_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 40;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        BEETROOT_SOUP_JAR = ITEMS.register("beetroot_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.BEETROOT_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        CARROT_SOUP_JAR = ITEMS.register("carrot_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.CARROT_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        POTATO_SOUP_JAR = ITEMS.register("potato_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.POTATO_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        BEEF_STEW_JAR = ITEMS.register("beef_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.BEEF_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        CHICKEN_STEW_JAR = ITEMS.register("chicken_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.CHICKEN_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        MUTTON_STEW_JAR = ITEMS.register("mutton_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.MUTTON_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        SUSPICIOUS_STEW_JAR = ITEMS.register("suspicious_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.SUSPICIOUS_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        MUSHROOM_STEW_JAR = ITEMS.register("mushroom_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.MUSHROOM_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        RABBIT_STEW_JAR = ITEMS.register("rabbit_stew_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.RABBIT_STEW).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        WOODEN_CLUB = ITEMS.register("wooden_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STONE_CLUB = ITEMS.register("stone_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_CLUB = ITEMS.register("iron_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_CLUB = ITEMS.register("gold_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_CLUB = ITEMS.register("diamond_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_CLUB = ITEMS.register("netherite_club", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STONE_SPEAR = ITEMS.register("stone_spear", () -> new SpearItem(Tiers.STONE, 3, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_SPEAR = ITEMS.register("iron_spear", () -> new SpearItem(Tiers.IRON, 4, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_SPEAR = ITEMS.register("gold_spear", () -> new SpearItem(Tiers.GOLD, 3, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new SpearItem(Tiers.DIAMOND, 5, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new SpearItem(Tiers.NETHERITE, 5, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WHITE_DYE_GLOB = ITEMS.register("white_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ORANGE_DYE_GLOB = ITEMS.register("orange_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MAGENTA_DYE_GLOB = ITEMS.register("magenta_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIGHT_BLUE_DYE_GLOB = ITEMS.register("light_blue_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        YELLOW_DYE_GLOB = ITEMS.register("yellow_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIME_DYE_GLOB = ITEMS.register("lime_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINK_DYE_GLOB = ITEMS.register("pink_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GRAY_DYE_GLOB = ITEMS.register("gray_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GREEN_DYE_GLOB = ITEMS.register("green_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIGHT_GRAY_DYE_GLOB = ITEMS.register("light_gray_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CYAN_DYE_GLOB = ITEMS.register("cyan_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PURPLE_DYE_GLOB = ITEMS.register("purple_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUE_DYE_GLOB = ITEMS.register("blue_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BROWN_DYE_GLOB = ITEMS.register("brown_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        RED_DYE_GLOB = ITEMS.register("red_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLACK_DYE_GLOB = ITEMS.register("black_dye_glob", () -> new Item((new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WHITE_DYE_GLOB_BLOCK = ITEMS.register("white_dye_glob_block", () -> new BlockItem(InspireBlocks.WHITE_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ORANGE_DYE_GLOB_BLOCK = ITEMS.register("orange_dye_glob_block", () -> new BlockItem(InspireBlocks.ORANGE_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MAGENTA_DYE_GLOB_BLOCK = ITEMS.register("magenta_dye_glob_block", () -> new BlockItem(InspireBlocks.MAGENTA_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIGHT_BLUE_DYE_GLOB_BLOCK = ITEMS.register("light_blue_dye_glob_block", () -> new BlockItem(InspireBlocks.LIGHT_BLUE_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        YELLOW_DYE_GLOB_BLOCK = ITEMS.register("yellow_dye_glob_block", () -> new BlockItem(InspireBlocks.YELLOW_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIME_DYE_GLOB_BLOCK = ITEMS.register("lime_dye_glob_block", () -> new BlockItem(InspireBlocks.LIME_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINK_DYE_GLOB_BLOCK = ITEMS.register("pink_dye_glob_block", () -> new BlockItem(InspireBlocks.PINK_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GRAY_DYE_GLOB_BLOCK = ITEMS.register("gray_dye_glob_block", () -> new BlockItem(InspireBlocks.GRAY_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GREEN_DYE_GLOB_BLOCK = ITEMS.register("green_dye_glob_block", () -> new BlockItem(InspireBlocks.GREEN_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        LIGHT_GRAY_DYE_GLOB_BLOCK = ITEMS.register("light_gray_dye_glob_block", () -> new BlockItem(InspireBlocks.LIGHT_GRAY_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CYAN_DYE_GLOB_BLOCK = ITEMS.register("cyan_dye_glob_block", () -> new BlockItem(InspireBlocks.CYAN_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PURPLE_DYE_GLOB_BLOCK = ITEMS.register("purple_dye_glob_block", () -> new BlockItem(InspireBlocks.PURPLE_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUE_DYE_GLOB_BLOCK = ITEMS.register("blue_dye_glob_block", () -> new BlockItem(InspireBlocks.BLUE_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BROWN_DYE_GLOB_BLOCK = ITEMS.register("brown_dye_glob_block", () -> new BlockItem(InspireBlocks.BROWN_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        RED_DYE_GLOB_BLOCK = ITEMS.register("red_dye_glob_block", () -> new BlockItem(InspireBlocks.RED_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLACK_DYE_GLOB_BLOCK = ITEMS.register("black_dye_glob_block", () -> new BlockItem(InspireBlocks.BLACK_DYE_GLOB_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        //DRY_CACTUS_BLOCK = ITEMS.register("dry_cactus_block", () -> new BlockItem(InspireBlocks.DRY_CACTUS_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CRAFTED_ELYTRA = ITEMS.register("crafted_elytra", () -> new CustomElytraItem((new Item.Properties()).stacksTo(1).durability(64).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CRIMSON_BOAT = ITEMS.register("crimson_boat", () -> new BoatItem(false, Boat.Type.byName("crimson"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WARPED_BOAT = ITEMS.register("warped_boat", () -> new BoatItem(false, Boat.Type.byName("warped"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WITHERED_BOAT = ITEMS.register("withered_boat", () -> new BoatItem(false, Boat.Type.byName("withered"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        PINE_BOAT = ITEMS.register("pine_boat", () -> new BoatItem(false, Boat.Type.byName("pine"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_BOAT = ITEMS.register("redwood_boat", () -> new BoatItem(false, Boat.Type.byName("redwood"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CRIMSON_CHEST_BOAT = ITEMS.register("crimson_chest_boat", () -> new BoatItem(true, Boat.Type.byName("crimson"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WARPED_CHEST_BOAT = ITEMS.register("warped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("warped"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WITHERED_CHEST_BOAT = ITEMS.register("withered_chest_boat", () -> new BoatItem(true, Boat.Type.byName("withered"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        PINE_CHEST_BOAT = ITEMS.register("pine_chest_boat", () -> new BoatItem(true, Boat.Type.byName("pine"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_CHEST_BOAT = ITEMS.register("redwood_chest_boat", () -> new BoatItem(true, Boat.Type.byName("redwood"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        OAK_ENDER_CHEST_BOAT = ITEMS.register("oak_ender_chest_boat", () -> new BoatItem(true, Boat.Type.OAK, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SPRUCE_ENDER_CHEST_BOAT = ITEMS.register("spruce_ender_chest_boat", () -> new BoatItem(true, Boat.Type.SPRUCE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BIRCH_ENDER_CHEST_BOAT = ITEMS.register("birch_ender_chest_boat", () -> new BoatItem(true, Boat.Type.BIRCH, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        JUNGLE_ENDER_CHEST_BOAT = ITEMS.register("jungle_ender_chest_boat", () -> new BoatItem(true, Boat.Type.JUNGLE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ACACIA_ENDER_CHEST_BOAT = ITEMS.register("acacia_ender_chest_boat", () -> new BoatItem(true, Boat.Type.ACACIA, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DARK_OAK_ENDER_CHEST_BOAT = ITEMS.register("dark_oak_ender_chest_boat", () -> new BoatItem(true, Boat.Type.DARK_OAK, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MANGROVE_ENDER_CHEST_BOAT = ITEMS.register("mangrove_ender_chest_boat", () -> new BoatItem(true, Boat.Type.MANGROVE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CRIMSON_ENDER_CHEST_BOAT = ITEMS.register("crimson_ender_chest_boat", () -> new BoatItem(true, Boat.Type.byName("crimson"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WARPED_ENDER_CHEST_BOAT = ITEMS.register("warped_ender_chest_boat", () -> new BoatItem(true, Boat.Type.byName("warped"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WITHERED_ENDER_CHEST_BOAT = ITEMS.register("withered_ender_chest_boat", () -> new BoatItem(true, Boat.Type.byName("withered"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        PINE_ENDER_CHEST_BOAT = ITEMS.register("pine_ender_chest_boat", () -> new BoatItem(true, Boat.Type.byName("pine"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_ENDER_CHEST_BOAT = ITEMS.register("redwood_ender_chest_boat", () -> new BoatItem(true, Boat.Type.byName("redwood"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        OAK_TRAPPED_CHEST_BOAT = ITEMS.register("oak_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.OAK, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SPRUCE_TRAPPED_CHEST_BOAT = ITEMS.register("spruce_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.SPRUCE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BIRCH_TRAPPED_CHEST_BOAT = ITEMS.register("birch_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.BIRCH, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        JUNGLE_TRAPPED_CHEST_BOAT = ITEMS.register("jungle_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.JUNGLE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ACACIA_TRAPPED_CHEST_BOAT = ITEMS.register("acacia_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.ACACIA, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DARK_OAK_TRAPPED_CHEST_BOAT = ITEMS.register("dark_oak_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.DARK_OAK, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MANGROVE_TRAPPED_CHEST_BOAT = ITEMS.register("mangrove_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.MANGROVE, (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CRIMSON_TRAPPED_CHEST_BOAT = ITEMS.register("crimson_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("crimson"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WARPED_TRAPPED_CHEST_BOAT = ITEMS.register("warped_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("warped"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        WITHERED_TRAPPED_CHEST_BOAT = ITEMS.register("withered_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("withered"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        PINE_TRAPPED_CHEST_BOAT = ITEMS.register("pine_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("pine"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_TRAPPED_CHEST_BOAT = ITEMS.register("redwood_trapped_chest_boat", () -> new BoatItem(true, Boat.Type.byName("redwood"), (new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIDER_SCALE_BOOTS = ITEMS.register("strider_scale_boots", () -> new ArmorItem(InspireArmorMaterials.STRIDER_SCALE, ArmorItem.Type.BOOTS, (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE).fireResistant()));
        CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().food(InspireFoods.CARAMEL).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WET_SAND = ITEMS.register("wet_sand", () -> new BlockItem(InspireBlocks.WET_SAND.get() ,new Item.Properties().arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        //CHROMATIC_LAMP = ITEMS.register("chromatic_lamp", () -> new ItemNameBlockItem(InspireBlocks.CHROMATIC_LAMP.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        /*
            CREEPER_COOKIE = ITEMS.register("creeper_cookie", () -> new Item(new Item.Properties().food(InspireFoods.CREEPER_COOKIE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CHOCOLATE_COOKIE = ITEMS.register("chocolate_cookie", () -> new Item(new Item.Properties().food(InspireFoods.CHOCOLATE_COOKIE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SUGAR_COOKIE = ITEMS.register("sugar_cookie", () -> new Item(new Item.Properties().food(InspireFoods.SUGAR_COOKIE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

    HOT_PEPPER = ITEMS.register("hot_pepper", () -> new Item(new Item.Properties().food(InspireFoods.DOUGH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(InspireFoods.DOUGH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GARLIC = ITEMS.register("garlic", () -> new Item(new Item.Properties().food(InspireFoods.DOUGH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ONION = ITEMS.register("onion", () -> new Item(new Item.Properties().food(InspireFoods.DOUGH).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_BEETROOT_SOUP = ITEMS.register("nether_beetroot_soup", () -> new BowlFoodItem(new Item.Properties().food(InspireFoods.NETHER_BEETROOT_SOUP).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_CARROT_SOUP = ITEMS.register("nether_carrot_soup", () -> new BowlFoodItem(new Item.Properties().food(InspireFoods.NETHER_CARROT_SOUP).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHER_POTATO_SOUP = ITEMS.register("nether_potato_soup", () -> new BowlFoodItem(new Item.Properties().food(InspireFoods.NETHER_POTATO_SOUP).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));


        CHOCOLATE_MILK_JAR = ITEMS.register("chocolate_milk_jar", () -> new MilkJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.CHOCOLATE_MILK).craftRemainder(InspireItems.EMPTY_JAR.get())));
        SWEET_BERRY_JAR = ITEMS.register("sweet_berry_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.SWEET_BERRIES).craftRemainder(InspireItems.EMPTY_JAR.get())));
        GLOW_BERRY_JAR = ITEMS.register("glow_berry_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(Foods.GLOW_BERRIES).craftRemainder(InspireItems.EMPTY_JAR.get())));
        SWEET_BERRY_JELLY_JAR = ITEMS.register("sweet_berry_jelly_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.SWEET_BERRY_JELLY).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.HONEY_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack) {
                return 40;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        GLOW_BERRY_JELLY_JAR = ITEMS.register("glow_berry_jelly_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.GLOW_BERRY_JELLY).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.HONEY_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack) {
                return 40;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        NETHER_BEETROOT_SOUP_JAR = ITEMS.register("nether_beetroot_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.NETHER_BEETROOT_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        NETHER_CARROT_SOUP_JAR = ITEMS.register("nether_carrot_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.NETHER_CARROT_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        NETHER_POTATO_SOUP_JAR = ITEMS.register("nether_potato_soup_jar", () -> new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE).food(InspireFoods.NETHER_POTATO_SOUP).craftRemainder(InspireItems.EMPTY_JAR.get())) {
            @Override
            public @NotNull SoundEvent getEatingSound() {
                return SoundEvents.GENERIC_DRINK;
            }

            @Override
            public int getUseDuration(ItemStack itemStack, LivingEntity livingEntity) {
                return 16;
            }

            @Override
            public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                return UseAnim.DRINK;
            }
        });
        SOULSTONE = ITEMS.register("soulstone", () -> new ItemNameBlockItem(InspireBlocks.SOULSTONE_WIRE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> new Item(new Item.Properties().food(InspireFoods.CARAMEL_APPLE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CARAMEL_GOLDEN_APPLE = ITEMS.register("caramel_golden_apple", () -> new Item(new Item.Properties().food(InspireFoods.CARAMEL_GOLDEN_APPLE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)) {
            @Override
            public @NotNull Rarity getRarity(ItemStack itemStack) {
                return Rarity.RARE;
            }
        });
        CARAMEL_ENCHANTED_GOLDEN_APPLE = ITEMS.register("caramel_enchanted_golden_apple", () -> new Item(new Item.Properties().food(InspireFoods.CARAMEL_ENCHANTED_GOLDEN_APPLE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)) {

            @Override
            public boolean isFoil(ItemStack itemStack) {
                return true;
            }

            @Override
            public @NotNull Rarity getRarity(ItemStack itemStack) {
                return Rarity.EPIC;
            }
        });
    public static final RegistrySupplier<Item> COOKIE_JAR = ITEMS.register("cookie_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(Foods.COOKIE).craftRemainder(InspireItems.EMPTY_JAR.get())));
    public static final RegistrySupplier<Item> APPLE_JAR = ITEMS.register("apple_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(Foods.APPLE).craftRemainder(InspireItems.EMPTY_JAR.get())));
    public static final RegistrySupplier<Item> GOLDEN_APPLE_JAR = ITEMS.register("golden_apple_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(Foods.GOLDEN_APPLE).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.RARE;
                }
            });
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_JAR = ITEMS.register("enchanted_golden_apple_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(Foods.ENCHANTED_GOLDEN_APPLE).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public boolean isFoil(ItemStack itemStack) {
                    return true;
                }
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.EPIC;
                }
            });
    public static final RegistrySupplier<Item> APPLE_SAUCE_JAR = ITEMS.register("apple_sauce_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.APPLE_SAUCE).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public @NotNull SoundEvent getEatingSound() {
                    return SoundEvents.HONEY_DRINK;
                }
                @Override
                public int getUseDuration(ItemStack itemStack) {
                    return 40;
                }
                @Override
                public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                    return UseAnim.DRINK;
                }
            });
    public static final RegistrySupplier<Item> GOLDEN_APPLE_SAUCE_JAR = ITEMS.register("golden_apple_sauce_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.GOLDEN_APPLE_SAUCE).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.RARE;
                }
                @Override
                public @NotNull SoundEvent getEatingSound() {
                    return SoundEvents.HONEY_DRINK;
                }
                @Override
                public int getUseDuration(ItemStack itemStack) {
                    return 40;
                }
                @Override
                public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                    return UseAnim.DRINK;
                }
            });
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_SAUCE_JAR = ITEMS.register("enchanted_golden_apple_sauce_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(8).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.ENCHANTED_GOLDEN_APPLE_SAUCE).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public boolean isFoil(ItemStack itemStack) {
                    return true;
                }
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.EPIC;
                }
                @Override
                public @NotNull SoundEvent getEatingSound() {
                    return SoundEvents.HONEY_DRINK;
                }
                @Override
                public int getUseDuration(ItemStack itemStack) {
                    return 40;
                }
                @Override
                public @NotNull UseAnim getUseAnimation(ItemStack itemStack) {
                    return UseAnim.DRINK;
                }
            });
    public static final RegistrySupplier<Item> APPLE_SLICES_JAR = ITEMS.register("apple_slices_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(6).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.APPLE_SLICES).craftRemainder(InspireItems.EMPTY_JAR.get())));
    public static final RegistrySupplier<Item> GOLDEN_APPLE_SLICES_JAR = ITEMS.register("golden_apple_slices_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(6).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.GOLDEN_APPLE_SLICES).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.RARE;
                }
            });
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_SLICES_JAR = ITEMS.register("enchanted_golden_apple_slices_jar", () ->new FoodJarItem(new Item.Properties().stacksTo(1).durability(6).arch$tab(InspireCreativeTabs.TAB_INSPIRE)
                    .food(InspireFoods.ENCHANTED_GOLDEN_APPLE_SLICES).craftRemainder(InspireItems.EMPTY_JAR.get())){
                @Override
                public boolean isFoil(ItemStack itemStack) {
                    return true;
                }
                @Override
                public Rarity getRarity(ItemStack itemStack) {
                    return Rarity.EPIC;
                }
            });

    //public static final RegistrySupplier<Item> GREEN_APPLE = ITEMS.register("green_apple", () -> new Item(new Item.Properties().food(Foods.APPLE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
     *///unused items
        BLUESTONE = ITEMS.register("bluestone", () -> new ItemNameBlockItem(InspireBlocks.BLUESTONE_WIRE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUESTONE_TORCH = ITEMS.register("bluestone_torch", () -> new StandingAndWallBlockItem(InspireBlocks.BLUESTONE_TORCH.get(), InspireBlocks.BLUESTONE_WALL_TORCH.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE), Direction.DOWN));
        PRISMARINE_LEVER = ITEMS.register("prismarine_lever", () -> new BlockItem(InspireBlocks.PRISMARINE_LEVER.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PRISMARINE_PRESSURE_PLATE = ITEMS.register("prismarine_pressure_plate", () -> new BlockItem(InspireBlocks.PRISMARINE_PRESSURE_PLATE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PRISMARINE_BUTTON = ITEMS.register("prismarine_button", () -> new BlockItem(InspireBlocks.PRISMARINE_BUTTON.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUESTONE_REPEATER = ITEMS.register("bluestone_repeater", () -> new BlockItem(InspireBlocks.BLUESTONE_REPEATER.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUESTONE_COMPARATOR = ITEMS.register("bluestone_comparator", () -> new BlockItem(InspireBlocks.BLUESTONE_COMPARATOR.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PRISMARINE_LAMP_BLOCK = ITEMS.register("prismarine_lamp", () -> new BlockItem(InspireBlocks.PRISMARINE_LAMP.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUESTONE_ORE_BLOCK = ITEMS.register("bluestone_ore", () -> new BlockItem(InspireBlocks.BLUESTONE_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DEEPSLATE_BLUESTONE_ORE_BLOCK = ITEMS.register("deepslate_bluestone_ore", () -> new BlockItem(InspireBlocks.DEEPSLATE_BLUESTONE_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        AMETHYST_ORE_BLOCK = ITEMS.register("amethyst_ore", () -> new BlockItem(InspireBlocks.AMETHYST_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DEEPSLATE_AMETHYST_ORE_BLOCK = ITEMS.register("deepslate_amethyst_ore", () -> new BlockItem(InspireBlocks.DEEPSLATE_AMETHYST_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PRISMARINE_ORE_BLOCK = ITEMS.register("prismarine_ore", () -> new BlockItem(InspireBlocks.PRISMARINE_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DEEPSLATE_PRISMARINE_ORE_BLOCK = ITEMS.register("deepslate_prismarine_ore", () -> new BlockItem(InspireBlocks.DEEPSLATE_PRISMARINE_ORE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BLUESTONE_BLOCK_BLOCK = ITEMS.register("bluestone_block", () -> new BlockItem(InspireBlocks.BLUESTONE_BLOCK.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        WITHERED_BONE_BLOCK_BLOCK = ITEMS.register("withered_bone_block", () -> new BlockItem(InspireBlocks.WITHERED_BONE_BLOCK.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_BONE_MEAL = ITEMS.register("withered_bone_meal", () -> new WitheredBoneMealItem((new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_BONE = ITEMS.register("withered_bone", () -> new Item((new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        WITHERED_PLANKS = ITEMS.register("withered_planks", () -> new BlockItem(InspireBlocks.WITHERED_PLANKS.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_SAPLING = ITEMS.register("withered_sapling", () -> new BlockItem(InspireBlocks.WITHERED_SAPLING.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_LOG = ITEMS.register("withered_log", () -> new BlockItem(InspireBlocks.WITHERED_LOG.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_WITHERED_LOG = ITEMS.register("stripped_withered_log", () -> new BlockItem(InspireBlocks.STRIPPED_WITHERED_LOG.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_WOOD = ITEMS.register("withered_wood", () -> new BlockItem(InspireBlocks.WITHERED_WOOD.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_WITHERED_WOOD = ITEMS.register("stripped_withered_wood", () -> new BlockItem(InspireBlocks.STRIPPED_WITHERED_WOOD.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_STAIRS = ITEMS.register("withered_stairs", () -> new BlockItem(InspireBlocks.WITHERED_STAIRS.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_SIGN = ITEMS.register("withered_sign", () -> new SignItem((new Item.Properties().fireResistant()).stacksTo(16).arch$tab(InspireCreativeTabs.TAB_INSPIRE), InspireBlocks.WITHERED_SIGN.get(), InspireBlocks.WITHERED_WALL_SIGN.get()));
        WITHERED_DOOR = ITEMS.register("withered_door", () -> new DoubleHighBlockItem(InspireBlocks.WITHERED_DOOR.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_PRESSURE_PLATE = ITEMS.register("withered_pressure_plate", () -> new BlockItem(InspireBlocks.WITHERED_PRESSURE_PLATE.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_FENCE = ITEMS.register("withered_fence", () -> new BlockItem(InspireBlocks.WITHERED_FENCE.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_TRAPDOOR = ITEMS.register("withered_trapdoor", () -> new BlockItem(InspireBlocks.WITHERED_TRAPDOOR.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_FENCE_GATE = ITEMS.register("withered_fence_gate", () -> new BlockItem(InspireBlocks.WITHERED_FENCE_GATE.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_BUTTON = ITEMS.register("withered_button", () -> new BlockItem(InspireBlocks.WITHERED_BUTTON.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_SLAB = ITEMS.register("withered_slab", () -> new BlockItem(InspireBlocks.WITHERED_SLAB.get(), (new Item.Properties().fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        PINE_PLANKS = ITEMS.register("pine_planks", () -> new BlockItem(InspireBlocks.PINE_PLANKS.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_SAPLING = ITEMS.register("pine_sapling", () -> new BlockItem(InspireBlocks.PINE_SAPLING.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_LOG = ITEMS.register("pine_log", () -> new BlockItem(InspireBlocks.PINE_LOG.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_PINE_LOG = ITEMS.register("stripped_pine_log", () -> new BlockItem(InspireBlocks.STRIPPED_PINE_LOG.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_WOOD = ITEMS.register("pine_wood", () -> new BlockItem(InspireBlocks.PINE_WOOD.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_PINE_WOOD = ITEMS.register("stripped_pine_wood", () -> new BlockItem(InspireBlocks.STRIPPED_PINE_WOOD.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_STAIRS = ITEMS.register("pine_stairs", () -> new BlockItem(InspireBlocks.PINE_STAIRS.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_SIGN = ITEMS.register("pine_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).arch$tab(InspireCreativeTabs.TAB_INSPIRE), InspireBlocks.PINE_SIGN.get(), InspireBlocks.PINE_WALL_SIGN.get()));
        PINE_DOOR = ITEMS.register("pine_door", () -> new DoubleHighBlockItem(InspireBlocks.PINE_DOOR.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_PRESSURE_PLATE = ITEMS.register("pine_pressure_plate", () -> new BlockItem(InspireBlocks.PINE_PRESSURE_PLATE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_FENCE = ITEMS.register("pine_fence", () -> new BlockItem(InspireBlocks.PINE_FENCE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_TRAPDOOR = ITEMS.register("pine_trapdoor", () -> new BlockItem(InspireBlocks.PINE_TRAPDOOR.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_FENCE_GATE = ITEMS.register("pine_fence_gate", () -> new BlockItem(InspireBlocks.PINE_FENCE_GATE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_BUTTON = ITEMS.register("pine_button", () -> new BlockItem(InspireBlocks.PINE_BUTTON.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_SLAB = ITEMS.register("pine_slab", () -> new BlockItem(InspireBlocks.PINE_SLAB.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        REDWOOD_PLANKS = ITEMS.register("redwood_planks", () -> new BlockItem(InspireBlocks.REDWOOD_PLANKS.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_SAPLING = ITEMS.register("redwood_sapling", () -> new BlockItem(InspireBlocks.REDWOOD_SAPLING.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_LOG = ITEMS.register("redwood_log", () -> new BlockItem(InspireBlocks.REDWOOD_LOG.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_REDWOOD_LOG = ITEMS.register("stripped_redwood_log", () -> new BlockItem(InspireBlocks.STRIPPED_REDWOOD_LOG.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_WOOD = ITEMS.register("redwood_wood", () -> new BlockItem(InspireBlocks.REDWOOD_WOOD.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        STRIPPED_REDWOOD_WOOD = ITEMS.register("stripped_redwood_wood", () -> new BlockItem(InspireBlocks.STRIPPED_REDWOOD_WOOD.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_STAIRS = ITEMS.register("redwood_stairs", () -> new BlockItem(InspireBlocks.REDWOOD_STAIRS.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_SIGN = ITEMS.register("redwood_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).arch$tab(InspireCreativeTabs.TAB_INSPIRE), InspireBlocks.REDWOOD_SIGN.get(), InspireBlocks.REDWOOD_WALL_SIGN.get()));
        REDWOOD_DOOR = ITEMS.register("redwood_door", () -> new DoubleHighBlockItem(InspireBlocks.REDWOOD_DOOR.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_PRESSURE_PLATE = ITEMS.register("redwood_pressure_plate", () -> new BlockItem(InspireBlocks.REDWOOD_PRESSURE_PLATE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_FENCE = ITEMS.register("redwood_fence", () -> new BlockItem(InspireBlocks.REDWOOD_FENCE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_TRAPDOOR = ITEMS.register("redwood_trapdoor", () -> new BlockItem(InspireBlocks.REDWOOD_TRAPDOOR.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_FENCE_GATE = ITEMS.register("redwood_fence_gate", () -> new BlockItem(InspireBlocks.REDWOOD_FENCE_GATE.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_BUTTON = ITEMS.register("redwood_button", () -> new BlockItem(InspireBlocks.REDWOOD_BUTTON.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_SLAB = ITEMS.register("redwood_slab", () -> new BlockItem(InspireBlocks.REDWOOD_SLAB.get(), (new Item.Properties()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        OAK_BARK = ITEMS.register("oak_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SPRUCE_BARK = ITEMS.register("spruce_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BIRCH_BARK = ITEMS.register("birch_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        JUNGLE_BARK = ITEMS.register("jungle_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        ACACIA_BARK = ITEMS.register("acacia_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DARK_OAK_BARK = ITEMS.register("dark_oak_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        MANGROVE_BARK = ITEMS.register("mangrove_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        //CHERRY_BARK = ITEMS.register("cherry_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        //PALE_BARK = ITEMS.register("pale_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WITHERED_BARK = ITEMS.register("withered_bark", () -> new Item((new Item.Properties().stacksTo(64).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        PINE_BARK = ITEMS.register("pine_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        REDWOOD_BARK = ITEMS.register("redwood_bark", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SOUL_GLASS = ITEMS.register("soul_glass", () -> new BlockItem(InspireBlocks.SOUL_GLASS.get(), (new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        SOUL_BOTTLE = ITEMS.register("soul_bottle", () -> new Item(new Item.Properties().rarity(Rarity.RARE).arch$tab(InspireCreativeTabs.TAB_INSPIRE)) {
            @Override
            public boolean isFoil(ItemStack itemStack) {
                return true;
            }
        });

        //PORTABLE_JUKEBOX = ITEMS.register("portable_jukebox", () -> new PortableJukeboxItem((new Item.Properties()).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CHEESE = ITEMS.register("cheese", () -> new Item((new Item.Properties().stacksTo(64).food(InspireFoods.CHEESE)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CORN = ITEMS.register("corn", () -> new Item((new Item.Properties().stacksTo(64).food(InspireFoods.CORN)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        BAKED_CORN = ITEMS.register("baked_corn", () -> new Item((new Item.Properties().stacksTo(64).food(InspireFoods.BAKED_CORN)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        POPPED_CORN = ITEMS.register("popped_corn", () -> new Item((new Item.Properties().stacksTo(64).food(InspireFoods.POPPED_CORN)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        CARMEL_CORN = ITEMS.register("carmel_corn", () -> new Item((new Item.Properties().stacksTo(64).food(InspireFoods.CARAMEL_CORN)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DRIED_CORN = ITEMS.register("dried_corn", () -> new Item((new Item.Properties().stacksTo(64)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        IRON_PICKAXE_HEAD = ITEMS.register("iron_pickaxe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_AXE_HEAD = ITEMS.register("iron_axe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_SHOVEL_HEAD = ITEMS.register("iron_shovel_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_HOE_HEAD = ITEMS.register("iron_hoe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        IRON_SWORD_BLADE = ITEMS.register("iron_sword_blade", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        GOLD_PICKAXE_HEAD = ITEMS.register("gold_pickaxe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_AXE_HEAD = ITEMS.register("gold_axe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_SHOVEL_HEAD = ITEMS.register("gold_shovel_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_HOE_HEAD = ITEMS.register("gold_hoe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        GOLD_SWORD_BLADE = ITEMS.register("gold_sword_blade", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        DIAMOND_PICKAXE_HEAD = ITEMS.register("diamond_pickaxe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_AXE_HEAD = ITEMS.register("diamond_axe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_SHOVEL_HEAD = ITEMS.register("diamond_shovel_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_HOE_HEAD = ITEMS.register("diamond_hoe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        DIAMOND_SWORD_BLADE = ITEMS.register("diamond_sword_blade", () -> new ToolPartItem((new Item.Properties().stacksTo(1)).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        NETHERITE_PICKAXE_HEAD = ITEMS.register("netherite_pickaxe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_AXE_HEAD = ITEMS.register("netherite_axe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_SHOVEL_HEAD = ITEMS.register("netherite_shovel_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_HOE_HEAD = ITEMS.register("netherite_hoe_head", () -> new ToolPartItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        NETHERITE_SWORD_BLADE = ITEMS.register("netherite_sword_blade", () -> new ToolPartItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        CRAFTING_TABLET = ITEMS.register("crafting_tablet", () -> new CraftingTabletItem((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));
        WAND_OF_LIGHT = ITEMS.register("wand_of_light", () -> new Item((new Item.Properties().stacksTo(1).fireResistant()).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));

        SOUL_BUCKET = ITEMS.register("soul_bucket", () -> new BucketItem(InspireFluids.SOUL_FLUID.get(), (new Item.Properties()).craftRemainder(Items.BUCKET).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));//removed .get()
        HONEY_BUCKET = ITEMS.register("honey_bucket", () -> new BucketItem(InspireFluids.HONEY_FLUID.get(), (new Item.Properties()).craftRemainder(Items.BUCKET).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));//removed .get()
        SCULK_SLUDGE_BUCKET = ITEMS.register("sculk_sludge_bucket", () -> new BucketItem(InspireFluids.SCULK_SLUDGE.get(), (new Item.Properties()).craftRemainder(Items.BUCKET).stacksTo(1).arch$tab(InspireCreativeTabs.TAB_INSPIRE)));//removed .get()

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

        CRACKED_POLISHED_BLACKSTONE = ITEMS.register("cracked_polished_blackstone",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_BLACKSTONE.get(),
                        basicProperties("cracked_polished_blackstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_FENCE = ITEMS.register("polished_blackstone_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_FENCE.get(),
                        basicProperties("polished_blackstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_FENCE_GATE = ITEMS.register("polished_blackstone_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get(),
                        basicProperties("polished_blackstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_PILLAR = ITEMS.register("polished_blackstone_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_PILLAR.get(),
                        basicProperties("polished_blackstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_DOOR = ITEMS.register("polished_blackstone_door",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_DOOR.get(),
                        basicProperties("polished_blackstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_TRAPDOOR = ITEMS.register("polished_blackstone_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_TRAPDOOR.get(),
                        basicProperties("polished_blackstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_LAMP = ITEMS.register("polished_blackstone_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_LAMP.get(),
                        basicProperties("polished_blackstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_FENCE = ITEMS.register("polished_blackstone_brick_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE.get(),
                        basicProperties("polished_blackstone_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_FENCE_GATE = ITEMS.register("polished_blackstone_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_FENCE_GATE.get(),
                        basicProperties("polished_blackstone_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_PILLAR = ITEMS.register("polished_blackstone_brick_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_PILLAR.get(),
                        basicProperties("polished_blackstone_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_DOOR = ITEMS.register("polished_blackstone_brick_door",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_DOOR.get(),
                        basicProperties("polished_blackstone_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_TRAPDOOR = ITEMS.register("polished_blackstone_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_TRAPDOOR.get(),
                        basicProperties("polished_blackstone_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_BLACKSTONE_BRICK_LAMP = ITEMS.register("polished_blackstone_brick_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_BLACKSTONE_BRICK_LAMP.get(),
                        basicProperties("polished_blackstone_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_GILDED_BLACKSTONE = ITEMS.register("cracked_gilded_blackstone",
                () -> new BlockItem(InspireBlocks.CRACKED_GILDED_BLACKSTONE.get(),
                        basicProperties("cracked_gilded_blackstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_STAIRS = ITEMS.register("gilded_blackstone_stairs",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_STAIRS.get(),
                        basicProperties("gilded_blackstone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_SLAB = ITEMS.register("gilded_blackstone_slab",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_SLAB.get(),
                        basicProperties("gilded_blackstone_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_WALL = ITEMS.register("gilded_blackstone_wall",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_WALL.get(),
                        basicProperties("gilded_blackstone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_FENCE = ITEMS.register("gilded_blackstone_fence",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_FENCE.get(),
                        basicProperties("gilded_blackstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_FENCE_GATE = ITEMS.register("gilded_blackstone_fence_gate",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_FENCE_GATE.get(),
                        basicProperties("gilded_blackstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_GILDED_BLACKSTONE = ITEMS.register("chiseled_gilded_blackstone",
                () -> new BlockItem(InspireBlocks.CHISELED_GILDED_BLACKSTONE.get(),
                        basicProperties("chiseled_gilded_blackstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_PILLAR = ITEMS.register("gilded_blackstone_pillar",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_PILLAR.get(),
                        basicProperties("gilded_blackstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_DOOR = ITEMS.register("gilded_blackstone_door",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_DOOR.get(),
                        basicProperties("gilded_blackstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_TRAPDOOR = ITEMS.register("gilded_blackstone_trapdoor",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_TRAPDOOR.get(),
                        basicProperties("gilded_blackstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_BUTTON = ITEMS.register("gilded_blackstone_button",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_BUTTON.get(),
                        basicProperties("gilded_blackstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_PRESSURE_PLATE = ITEMS.register("gilded_blackstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get(),
                        basicProperties("gilded_blackstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GILDED_BLACKSTONE_LAMP = ITEMS.register("gilded_blackstone_lamp",
                () -> new BlockItem(InspireBlocks.GILDED_BLACKSTONE_LAMP.get(),
                        basicProperties("gilded_blackstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_SMOOTH_STONE = ITEMS.register("cracked_smooth_stone",
                () -> new BlockItem(InspireBlocks.CRACKED_SMOOTH_STONE.get(),
                        basicProperties("cracked_smooth_stone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_STAIRS = ITEMS.register("smooth_stone_stairs",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_STAIRS.get(),
                        basicProperties("smooth_stone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_WALL = ITEMS.register("smooth_stone_wall",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_WALL.get(),
                        basicProperties("smooth_stone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_FENCE = ITEMS.register("smooth_stone_fence",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_FENCE.get(),
                        basicProperties("smooth_stone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_FENCE_GATE = ITEMS.register("smooth_stone_fence_gate",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_FENCE_GATE.get(),
                        basicProperties("smooth_stone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_SMOOTH_STONE = ITEMS.register("chiseled_smooth_stone",
                () -> new BlockItem(InspireBlocks.CHISELED_SMOOTH_STONE.get(),
                        basicProperties("chiseled_smooth_stone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_PILLAR = ITEMS.register("smooth_stone_pillar",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_PILLAR.get(),
                        basicProperties("smooth_stone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_DOOR = ITEMS.register("smooth_stone_door",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_DOOR.get(),
                        basicProperties("smooth_stone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_TRAPDOOR = ITEMS.register("smooth_stone_trapdoor",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_TRAPDOOR.get(),
                        basicProperties("smooth_stone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_BUTTON = ITEMS.register("smooth_stone_button",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_BUTTON.get(),
                        basicProperties("smooth_stone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_PRESSURE_PLATE = ITEMS.register("smooth_stone_pressure_plate",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_PRESSURE_PLATE.get(),
                        basicProperties("smooth_stone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_STONE_LAMP = ITEMS.register("smooth_stone_lamp",
                () -> new BlockItem(InspireBlocks.SMOOTH_STONE_LAMP.get(),
                        basicProperties("smooth_stone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_REDSTONE_BLOCK = ITEMS.register("cracked_redstone_block",
                () -> new BlockItem(InspireBlocks.CRACKED_REDSTONE_BLOCK.get(),
                        basicProperties("cracked_redstone_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_STAIRS = ITEMS.register("redstone_block_stairs",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_STAIRS.get(),
                        basicProperties("redstone_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_SLAB = ITEMS.register("redstone_block_slab",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_SLAB.get(),
                        basicProperties("redstone_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_WALL = ITEMS.register("redstone_block_wall",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_WALL.get(),
                        basicProperties("redstone_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_FENCE = ITEMS.register("redstone_block_fence",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_FENCE.get(),
                        basicProperties("redstone_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_FENCE_GATE = ITEMS.register("redstone_block_fence_gate",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_FENCE_GATE.get(),
                        basicProperties("redstone_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_REDSTONE_BLOCK = ITEMS.register("chiseled_redstone_block",
                () -> new BlockItem(InspireBlocks.CHISELED_REDSTONE_BLOCK.get(),
                        basicProperties("chiseled_redstone_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_PILLAR = ITEMS.register("redstone_block_pillar",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_PILLAR.get(),
                        basicProperties("redstone_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_DOOR = ITEMS.register("redstone_block_door",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_DOOR.get(),
                        basicProperties("redstone_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_TRAPDOOR = ITEMS.register("redstone_block_trapdoor",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_TRAPDOOR.get(),
                        basicProperties("redstone_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_BUTTON = ITEMS.register("redstone_block_button",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_BUTTON.get(),
                        basicProperties("redstone_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_PRESSURE_PLATE = ITEMS.register("redstone_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("redstone_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        REDSTONE_BLOCK_LAMP = ITEMS.register("redstone_block_lamp",
                () -> new BlockItem(InspireBlocks.REDSTONE_BLOCK_LAMP.get(),
                        basicProperties("redstone_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_AMETHYST_BLOCK = ITEMS.register("cracked_amethyst_block",
                () -> new BlockItem(InspireBlocks.CRACKED_AMETHYST_BLOCK.get(),
                        basicProperties("cracked_amethyst_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_STAIRS = ITEMS.register("amethyst_block_stairs",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_STAIRS.get(),
                        basicProperties("amethyst_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_SLAB = ITEMS.register("amethyst_block_slab",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_SLAB.get(),
                        basicProperties("amethyst_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_WALL = ITEMS.register("amethyst_block_wall",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_WALL.get(),
                        basicProperties("amethyst_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_FENCE = ITEMS.register("amethyst_block_fence",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_FENCE.get(),
                        basicProperties("amethyst_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_FENCE_GATE = ITEMS.register("amethyst_block_fence_gate",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_FENCE_GATE.get(),
                        basicProperties("amethyst_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_AMETHYST_BLOCK = ITEMS.register("chiseled_amethyst_block",
                () -> new BlockItem(InspireBlocks.CHISELED_AMETHYST_BLOCK.get(),
                        basicProperties("chiseled_amethyst_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_PILLAR = ITEMS.register("amethyst_block_pillar",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_PILLAR.get(),
                        basicProperties("amethyst_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_DOOR = ITEMS.register("amethyst_block_door",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_DOOR.get(),
                        basicProperties("amethyst_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_TRAPDOOR = ITEMS.register("amethyst_block_trapdoor",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_TRAPDOOR.get(),
                        basicProperties("amethyst_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_BUTTON = ITEMS.register("amethyst_block_button",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_BUTTON.get(),
                        basicProperties("amethyst_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_PRESSURE_PLATE = ITEMS.register("amethyst_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("amethyst_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        AMETHYST_BLOCK_LAMP = ITEMS.register("amethyst_block_lamp",
                () -> new BlockItem(InspireBlocks.AMETHYST_BLOCK_LAMP.get(),
                        basicProperties("amethyst_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_GLOWSTONE = ITEMS.register("cracked_glowstone",
                () -> new BlockItem(InspireBlocks.CRACKED_GLOWSTONE.get(),
                        basicProperties("cracked_glowstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_STAIRS = ITEMS.register("glowstone_stairs",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_STAIRS.get(),
                        basicProperties("glowstone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_SLAB = ITEMS.register("glowstone_slab",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_SLAB.get(),
                        basicProperties("glowstone_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_WALL = ITEMS.register("glowstone_wall",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_WALL.get(),
                        basicProperties("glowstone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_FENCE = ITEMS.register("glowstone_fence",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_FENCE.get(),
                        basicProperties("glowstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_FENCE_GATE = ITEMS.register("glowstone_fence_gate",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_FENCE_GATE.get(),
                        basicProperties("glowstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_GLOWSTONE = ITEMS.register("chiseled_glowstone",
                () -> new BlockItem(InspireBlocks.CHISELED_GLOWSTONE.get(),
                        basicProperties("chiseled_glowstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_PILLAR = ITEMS.register("glowstone_pillar",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_PILLAR.get(),
                        basicProperties("glowstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_DOOR = ITEMS.register("glowstone_door",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_DOOR.get(),
                        basicProperties("glowstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_TRAPDOOR = ITEMS.register("glowstone_trapdoor",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_TRAPDOOR.get(),
                        basicProperties("glowstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_BUTTON = ITEMS.register("glowstone_button",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_BUTTON.get(),
                        basicProperties("glowstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_PRESSURE_PLATE = ITEMS.register("glowstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_PRESSURE_PLATE.get(),
                        basicProperties("glowstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GLOWSTONE_LAMP = ITEMS.register("glowstone_lamp",
                () -> new BlockItem(InspireBlocks.GLOWSTONE_LAMP.get(),
                        basicProperties("glowstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_SMOOTH_BASALT = ITEMS.register("cracked_smooth_basalt",
                () -> new BlockItem(InspireBlocks.CRACKED_SMOOTH_BASALT.get(),
                        basicProperties("cracked_smooth_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_STAIRS = ITEMS.register("smooth_basalt_stairs",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_STAIRS.get(),
                        basicProperties("smooth_basalt_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_SLAB = ITEMS.register("smooth_basalt_slab",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_SLAB.get(),
                        basicProperties("smooth_basalt_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_WALL = ITEMS.register("smooth_basalt_wall",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_WALL.get(),
                        basicProperties("smooth_basalt_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_FENCE = ITEMS.register("smooth_basalt_fence",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_FENCE.get(),
                        basicProperties("smooth_basalt_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_FENCE_GATE = ITEMS.register("smooth_basalt_fence_gate",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_FENCE_GATE.get(),
                        basicProperties("smooth_basalt_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_SMOOTH_BASALT = ITEMS.register("chiseled_smooth_basalt",
                () -> new BlockItem(InspireBlocks.CHISELED_SMOOTH_BASALT.get(),
                        basicProperties("chiseled_smooth_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_PILLAR = ITEMS.register("smooth_basalt_pillar",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_PILLAR.get(),
                        basicProperties("smooth_basalt_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_DOOR = ITEMS.register("smooth_basalt_door",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_DOOR.get(),
                        basicProperties("smooth_basalt_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_TRAPDOOR = ITEMS.register("smooth_basalt_trapdoor",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_TRAPDOOR.get(),
                        basicProperties("smooth_basalt_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_BUTTON = ITEMS.register("smooth_basalt_button",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_BUTTON.get(),
                        basicProperties("smooth_basalt_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_PRESSURE_PLATE = ITEMS.register("smooth_basalt_pressure_plate",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get(),
                        basicProperties("smooth_basalt_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_BASALT_LAMP = ITEMS.register("smooth_basalt_lamp",
                () -> new BlockItem(InspireBlocks.SMOOTH_BASALT_LAMP.get(),
                        basicProperties("smooth_basalt_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_BASALT = ITEMS.register("cracked_polished_basalt",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_BASALT.get(),
                        basicProperties("cracked_polished_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_STAIRS = ITEMS.register("polished_basalt_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_STAIRS.get(),
                        basicProperties("polished_basalt_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_SLAB = ITEMS.register("polished_basalt_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_SLAB.get(),
                        basicProperties("polished_basalt_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_WALL = ITEMS.register("polished_basalt_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_WALL.get(),
                        basicProperties("polished_basalt_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_FENCE = ITEMS.register("polished_basalt_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_FENCE.get(),
                        basicProperties("polished_basalt_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_FENCE_GATE = ITEMS.register("polished_basalt_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_FENCE_GATE.get(),
                        basicProperties("polished_basalt_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_BASALT = ITEMS.register("chiseled_polished_basalt",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_BASALT.get(),
                        basicProperties("chiseled_polished_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_PILLAR = ITEMS.register("polished_basalt_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_PILLAR.get(),
                        basicProperties("polished_basalt_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_DOOR = ITEMS.register("polished_basalt_door",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_DOOR.get(),
                        basicProperties("polished_basalt_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_TRAPDOOR = ITEMS.register("polished_basalt_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_TRAPDOOR.get(),
                        basicProperties("polished_basalt_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_BUTTON = ITEMS.register("polished_basalt_button",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_BUTTON.get(),
                        basicProperties("polished_basalt_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_PRESSURE_PLATE = ITEMS.register("polished_basalt_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_PRESSURE_PLATE.get(),
                        basicProperties("polished_basalt_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_BASALT_LAMP = ITEMS.register("polished_basalt_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_BASALT_LAMP.get(),
                        basicProperties("polished_basalt_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_BASALT = ITEMS.register("cracked_basalt",
                () -> new BlockItem(InspireBlocks.CRACKED_BASALT.get(),
                        basicProperties("cracked_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_STAIRS = ITEMS.register("basalt_stairs",
                () -> new BlockItem(InspireBlocks.BASALT_STAIRS.get(),
                        basicProperties("basalt_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_SLAB = ITEMS.register("basalt_slab",
                () -> new BlockItem(InspireBlocks.BASALT_SLAB.get(),
                        basicProperties("basalt_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_WALL = ITEMS.register("basalt_wall",
                () -> new BlockItem(InspireBlocks.BASALT_WALL.get(),
                        basicProperties("basalt_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_FENCE = ITEMS.register("basalt_fence",
                () -> new BlockItem(InspireBlocks.BASALT_FENCE.get(),
                        basicProperties("basalt_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_FENCE_GATE = ITEMS.register("basalt_fence_gate",
                () -> new BlockItem(InspireBlocks.BASALT_FENCE_GATE.get(),
                        basicProperties("basalt_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_BASALT = ITEMS.register("chiseled_basalt",
                () -> new BlockItem(InspireBlocks.CHISELED_BASALT.get(),
                        basicProperties("chiseled_basalt").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_PILLAR = ITEMS.register("basalt_pillar",
                () -> new BlockItem(InspireBlocks.BASALT_PILLAR.get(),
                        basicProperties("basalt_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_DOOR = ITEMS.register("basalt_door",
                () -> new BlockItem(InspireBlocks.BASALT_DOOR.get(),
                        basicProperties("basalt_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_TRAPDOOR = ITEMS.register("basalt_trapdoor",
                () -> new BlockItem(InspireBlocks.BASALT_TRAPDOOR.get(),
                        basicProperties("basalt_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_BUTTON = ITEMS.register("basalt_button",
                () -> new BlockItem(InspireBlocks.BASALT_BUTTON.get(),
                        basicProperties("basalt_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_PRESSURE_PLATE = ITEMS.register("basalt_pressure_plate",
                () -> new BlockItem(InspireBlocks.BASALT_PRESSURE_PLATE.get(),
                        basicProperties("basalt_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BASALT_LAMP = ITEMS.register("basalt_lamp",
                () -> new BlockItem(InspireBlocks.BASALT_LAMP.get(),
                        basicProperties("basalt_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_GLOWSTONE = ITEMS.register("polished_glowstone",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE.get(),
                        basicProperties("polished_glowstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_GLOWSTONE = ITEMS.register("cracked_polished_glowstone",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_GLOWSTONE.get(),
                        basicProperties("cracked_polished_glowstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_STAIRS = ITEMS.register("polished_glowstone_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_STAIRS.get(),
                        basicProperties("polished_glowstone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_SLAB = ITEMS.register("polished_glowstone_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_SLAB.get(),
                        basicProperties("polished_glowstone_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_WALL = ITEMS.register("polished_glowstone_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_WALL.get(),
                        basicProperties("polished_glowstone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_FENCE = ITEMS.register("polished_glowstone_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_FENCE.get(),
                        basicProperties("polished_glowstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_FENCE_GATE = ITEMS.register("polished_glowstone_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_FENCE_GATE.get(),
                        basicProperties("polished_glowstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_GLOWSTONE = ITEMS.register("chiseled_polished_glowstone",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_GLOWSTONE.get(),
                        basicProperties("chiseled_polished_glowstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_PILLAR = ITEMS.register("polished_glowstone_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_PILLAR.get(),
                        basicProperties("polished_glowstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_DOOR = ITEMS.register("polished_glowstone_door",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_DOOR.get(),
                        basicProperties("polished_glowstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TRAPDOOR = ITEMS.register("polished_glowstone_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TRAPDOOR.get(),
                        basicProperties("polished_glowstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BUTTON = ITEMS.register("polished_glowstone_button",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BUTTON.get(),
                        basicProperties("polished_glowstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_PRESSURE_PLATE = ITEMS.register("polished_glowstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_PRESSURE_PLATE.get(),
                        basicProperties("polished_glowstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_LAMP = ITEMS.register("polished_glowstone_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_LAMP.get(),
                        basicProperties("polished_glowstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_GLOWSTONE_BRICKS = ITEMS.register("polished_glowstone_bricks",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICKS.get(),
                        basicProperties("polished_glowstone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_GLOWSTONE_BRICKS = ITEMS.register("cracked_polished_glowstone_bricks",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_GLOWSTONE_BRICKS.get(),
                        basicProperties("cracked_polished_glowstone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_STAIRS = ITEMS.register("polished_glowstone_brick_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_STAIRS.get(),
                        basicProperties("polished_glowstone_brick_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_SLAB = ITEMS.register("polished_glowstone_brick_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_SLAB.get(),
                        basicProperties("polished_glowstone_brick_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_WALL = ITEMS.register("polished_glowstone_brick_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_WALL.get(),
                        basicProperties("polished_glowstone_brick_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_FENCE = ITEMS.register("polished_glowstone_brick_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE.get(),
                        basicProperties("polished_glowstone_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_FENCE_GATE = ITEMS.register("polished_glowstone_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_FENCE_GATE.get(),
                        basicProperties("polished_glowstone_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_GLOWSTONE_BRICKS = ITEMS.register("chiseled_polished_glowstone_bricks",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_GLOWSTONE_BRICKS.get(),
                        basicProperties("chiseled_polished_glowstone_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_PILLAR = ITEMS.register("polished_glowstone_brick_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_PILLAR.get(),
                        basicProperties("polished_glowstone_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_DOOR = ITEMS.register("polished_glowstone_brick_door",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_DOOR.get(),
                        basicProperties("polished_glowstone_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_TRAPDOOR = ITEMS.register("polished_glowstone_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_TRAPDOOR.get(),
                        basicProperties("polished_glowstone_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_BUTTON = ITEMS.register("polished_glowstone_brick_button",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_BUTTON.get(),
                        basicProperties("polished_glowstone_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE = ITEMS.register("polished_glowstone_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_PRESSURE_PLATE.get(),
                        basicProperties("polished_glowstone_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_BRICK_LAMP = ITEMS.register("polished_glowstone_brick_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_BRICK_LAMP.get(),
                        basicProperties("polished_glowstone_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_GLOWSTONE_TILES = ITEMS.register("polished_glowstone_tiles",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILES.get(),
                        basicProperties("polished_glowstone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_GLOWSTONE_TILES = ITEMS.register("cracked_polished_glowstone_tiles",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_GLOWSTONE_TILES.get(),
                        basicProperties("cracked_polished_glowstone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_STAIRS = ITEMS.register("polished_glowstone_tile_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_STAIRS.get(),
                        basicProperties("polished_glowstone_tile_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_SLAB = ITEMS.register("polished_glowstone_tile_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_SLAB.get(),
                        basicProperties("polished_glowstone_tile_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_WALL = ITEMS.register("polished_glowstone_tile_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_WALL.get(),
                        basicProperties("polished_glowstone_tile_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_FENCE = ITEMS.register("polished_glowstone_tile_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE.get(),
                        basicProperties("polished_glowstone_tile_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_FENCE_GATE = ITEMS.register("polished_glowstone_tile_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_FENCE_GATE.get(),
                        basicProperties("polished_glowstone_tile_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_GLOWSTONE_TILES = ITEMS.register("chiseled_polished_glowstone_tiles",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_GLOWSTONE_TILES.get(),
                        basicProperties("chiseled_polished_glowstone_tiles").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_PILLAR = ITEMS.register("polished_glowstone_tile_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_PILLAR.get(),
                        basicProperties("polished_glowstone_tile_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_DOOR = ITEMS.register("polished_glowstone_tile_door",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_DOOR.get(),
                        basicProperties("polished_glowstone_tile_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_TRAPDOOR = ITEMS.register("polished_glowstone_tile_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_TRAPDOOR.get(),
                        basicProperties("polished_glowstone_tile_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_BUTTON = ITEMS.register("polished_glowstone_tile_button",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_BUTTON.get(),
                        basicProperties("polished_glowstone_tile_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE = ITEMS.register("polished_glowstone_tile_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_PRESSURE_PLATE.get(),
                        basicProperties("polished_glowstone_tile_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GLOWSTONE_TILE_LAMP = ITEMS.register("polished_glowstone_tile_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_GLOWSTONE_TILE_LAMP.get(),
                        basicProperties("polished_glowstone_tile_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_TUFF = ITEMS.register("cracked_polished_tuff",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_TUFF.get(),
                        basicProperties("cracked_polished_tuff").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_FENCE = ITEMS.register("polished_tuff_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_FENCE.get(),
                        basicProperties("polished_tuff_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_FENCE_GATE = ITEMS.register("polished_tuff_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_FENCE_GATE.get(),
                        basicProperties("polished_tuff_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_TUFF = ITEMS.register("chiseled_polished_tuff",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_TUFF.get(),
                        basicProperties("chiseled_polished_tuff").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_PILLAR = ITEMS.register("polished_tuff_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_PILLAR.get(),
                        basicProperties("polished_tuff_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_DOOR = ITEMS.register("polished_tuff_door",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_DOOR.get(),
                        basicProperties("polished_tuff_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_TRAPDOOR = ITEMS.register("polished_tuff_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_TRAPDOOR.get(),
                        basicProperties("polished_tuff_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_BUTTON = ITEMS.register("polished_tuff_button",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_BUTTON.get(),
                        basicProperties("polished_tuff_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_PRESSURE_PLATE = ITEMS.register("polished_tuff_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_PRESSURE_PLATE.get(),
                        basicProperties("polished_tuff_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_TUFF_LAMP = ITEMS.register("polished_tuff_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_TUFF_LAMP.get(),
                        basicProperties("polished_tuff_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_TUFF_BRICKS = ITEMS.register("cracked_tuff_bricks",
                () -> new BlockItem(InspireBlocks.CRACKED_TUFF_BRICKS.get(),
                        basicProperties("cracked_tuff_bricks").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_FENCE = ITEMS.register("tuff_brick_fence",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_FENCE.get(),
                        basicProperties("tuff_brick_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_FENCE_GATE = ITEMS.register("tuff_brick_fence_gate",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_FENCE_GATE.get(),
                        basicProperties("tuff_brick_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_PILLAR = ITEMS.register("tuff_brick_pillar",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_PILLAR.get(),
                        basicProperties("tuff_brick_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_DOOR = ITEMS.register("tuff_brick_door",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_DOOR.get(),
                        basicProperties("tuff_brick_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_TRAPDOOR = ITEMS.register("tuff_brick_trapdoor",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_TRAPDOOR.get(),
                        basicProperties("tuff_brick_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_BUTTON = ITEMS.register("tuff_brick_button",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_BUTTON.get(),
                        basicProperties("tuff_brick_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_PRESSURE_PLATE = ITEMS.register("tuff_brick_pressure_plate",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_PRESSURE_PLATE.get(),
                        basicProperties("tuff_brick_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        TUFF_BRICK_LAMP = ITEMS.register("tuff_brick_lamp",
                () -> new BlockItem(InspireBlocks.TUFF_BRICK_LAMP.get(),
                        basicProperties("tuff_brick_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_QUARTZ = ITEMS.register("cracked_quartz",
                () -> new BlockItem(InspireBlocks.CRACKED_QUARTZ.get(),
                        basicProperties("cracked_quartz").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_WALL = ITEMS.register("quartz_wall",
                () -> new BlockItem(InspireBlocks.QUARTZ_WALL.get(),
                        basicProperties("quartz_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_FENCE = ITEMS.register("quartz_fence",
                () -> new BlockItem(InspireBlocks.QUARTZ_FENCE.get(),
                        basicProperties("quartz_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_FENCE_GATE = ITEMS.register("quartz_fence_gate",
                () -> new BlockItem(InspireBlocks.QUARTZ_FENCE_GATE.get(),
                        basicProperties("quartz_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_DOOR = ITEMS.register("quartz_door",
                () -> new BlockItem(InspireBlocks.QUARTZ_DOOR.get(),
                        basicProperties("quartz_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_TRAPDOOR = ITEMS.register("quartz_trapdoor",
                () -> new BlockItem(InspireBlocks.QUARTZ_TRAPDOOR.get(),
                        basicProperties("quartz_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_BUTTON = ITEMS.register("quartz_button",
                () -> new BlockItem(InspireBlocks.QUARTZ_BUTTON.get(),
                        basicProperties("quartz_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_PRESSURE_PLATE = ITEMS.register("quartz_pressure_plate",
                () -> new BlockItem(InspireBlocks.QUARTZ_PRESSURE_PLATE.get(),
                        basicProperties("quartz_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        QUARTZ_LAMP = ITEMS.register("quartz_lamp",
                () -> new BlockItem(InspireBlocks.QUARTZ_LAMP.get(),
                        basicProperties("quartz_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_SMOOTH_QUARTZ = ITEMS.register("cracked_smooth_quartz",
                () -> new BlockItem(InspireBlocks.CRACKED_SMOOTH_QUARTZ.get(),
                        basicProperties("cracked_smooth_quartz").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_WALL = ITEMS.register("smooth_quartz_wall",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_WALL.get(),
                        basicProperties("smooth_quartz_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_FENCE = ITEMS.register("smooth_quartz_fence",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_FENCE.get(),
                        basicProperties("smooth_quartz_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_FENCE_GATE = ITEMS.register("smooth_quartz_fence_gate",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_FENCE_GATE.get(),
                        basicProperties("smooth_quartz_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_SMOOTH_QUARTZ = ITEMS.register("chiseled_smooth_quartz",
                () -> new BlockItem(InspireBlocks.CHISELED_SMOOTH_QUARTZ.get(),
                        basicProperties("chiseled_smooth_quartz").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_PILLAR = ITEMS.register("smooth_quartz_pillar",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_PILLAR.get(),
                        basicProperties("smooth_quartz_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_DOOR = ITEMS.register("smooth_quartz_door",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_DOOR.get(),
                        basicProperties("smooth_quartz_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_TRAPDOOR = ITEMS.register("smooth_quartz_trapdoor",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_TRAPDOOR.get(),
                        basicProperties("smooth_quartz_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_BUTTON = ITEMS.register("smooth_quartz_button",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_BUTTON.get(),
                        basicProperties("smooth_quartz_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_PRESSURE_PLATE = ITEMS.register("smooth_quartz_pressure_plate",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.get(),
                        basicProperties("smooth_quartz_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SMOOTH_QUARTZ_LAMP = ITEMS.register("smooth_quartz_lamp",
                () -> new BlockItem(InspireBlocks.SMOOTH_QUARTZ_LAMP.get(),
                        basicProperties("smooth_quartz_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        RESIN = ITEMS.register("resin",
                () -> new BlockItem(InspireBlocks.RESIN.get(),
                        basicProperties("resin").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_RESIN = ITEMS.register("cracked_resin",
                () -> new BlockItem(InspireBlocks.CRACKED_RESIN.get(),
                        basicProperties("cracked_resin").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_STAIRS = ITEMS.register("resin_stairs",
                () -> new BlockItem(InspireBlocks.RESIN_STAIRS.get(),
                        basicProperties("resin_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_SLAB = ITEMS.register("resin_slab",
                () -> new BlockItem(InspireBlocks.RESIN_SLAB.get(),
                        basicProperties("resin_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_WALL = ITEMS.register("resin_wall",
                () -> new BlockItem(InspireBlocks.RESIN_WALL.get(),
                        basicProperties("resin_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_FENCE = ITEMS.register("resin_fence",
                () -> new BlockItem(InspireBlocks.RESIN_FENCE.get(),
                        basicProperties("resin_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_FENCE_GATE = ITEMS.register("resin_fence_gate",
                () -> new BlockItem(InspireBlocks.RESIN_FENCE_GATE.get(),
                        basicProperties("resin_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_RESIN = ITEMS.register("chiseled_resin",
                () -> new BlockItem(InspireBlocks.CHISELED_RESIN.get(),
                        basicProperties("chiseled_resin").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_PILLAR = ITEMS.register("resin_pillar",
                () -> new BlockItem(InspireBlocks.RESIN_PILLAR.get(),
                        basicProperties("resin_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_DOOR = ITEMS.register("resin_door",
                () -> new BlockItem(InspireBlocks.RESIN_DOOR.get(),
                        basicProperties("resin_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_TRAPDOOR = ITEMS.register("resin_trapdoor",
                () -> new BlockItem(InspireBlocks.RESIN_TRAPDOOR.get(),
                        basicProperties("resin_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_BUTTON = ITEMS.register("resin_button",
                () -> new BlockItem(InspireBlocks.RESIN_BUTTON.get(),
                        basicProperties("resin_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_PRESSURE_PLATE = ITEMS.register("resin_pressure_plate",
                () -> new BlockItem(InspireBlocks.RESIN_PRESSURE_PLATE.get(),
                        basicProperties("resin_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        RESIN_LAMP = ITEMS.register("resin_lamp",
                () -> new BlockItem(InspireBlocks.RESIN_LAMP.get(),
                        basicProperties("resin_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_GRANITE = ITEMS.register("cracked_polished_granite",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_GRANITE.get(),
                        basicProperties("cracked_polished_granite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_WALL = ITEMS.register("polished_granite_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_WALL.get(),
                        basicProperties("polished_granite_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_FENCE = ITEMS.register("polished_granite_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_FENCE.get(),
                        basicProperties("polished_granite_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_FENCE_GATE = ITEMS.register("polished_granite_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_FENCE_GATE.get(),
                        basicProperties("polished_granite_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_GRANITE = ITEMS.register("chiseled_polished_granite",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_GRANITE.get(),
                        basicProperties("chiseled_polished_granite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_PILLAR = ITEMS.register("polished_granite_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_PILLAR.get(),
                        basicProperties("polished_granite_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_DOOR = ITEMS.register("polished_granite_door",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_DOOR.get(),
                        basicProperties("polished_granite_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_TRAPDOOR = ITEMS.register("polished_granite_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_TRAPDOOR.get(),
                        basicProperties("polished_granite_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_BUTTON = ITEMS.register("polished_granite_button",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_BUTTON.get(),
                        basicProperties("polished_granite_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_PRESSURE_PLATE = ITEMS.register("polished_granite_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get(),
                        basicProperties("polished_granite_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_GRANITE_LAMP = ITEMS.register("polished_granite_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_GRANITE_LAMP.get(),
                        basicProperties("polished_granite_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_DIORITE = ITEMS.register("cracked_polished_diorite",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_DIORITE.get(),
                        basicProperties("cracked_polished_diorite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_WALL = ITEMS.register("polished_diorite_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_WALL.get(),
                        basicProperties("polished_diorite_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_FENCE = ITEMS.register("polished_diorite_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_FENCE.get(),
                        basicProperties("polished_diorite_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_FENCE_GATE = ITEMS.register("polished_diorite_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_FENCE_GATE.get(),
                        basicProperties("polished_diorite_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_DIORITE = ITEMS.register("chiseled_polished_diorite",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_DIORITE.get(),
                        basicProperties("chiseled_polished_diorite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_PILLAR = ITEMS.register("polished_diorite_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_PILLAR.get(),
                        basicProperties("polished_diorite_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_DOOR = ITEMS.register("polished_diorite_door",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_DOOR.get(),
                        basicProperties("polished_diorite_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_TRAPDOOR = ITEMS.register("polished_diorite_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_TRAPDOOR.get(),
                        basicProperties("polished_diorite_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_BUTTON = ITEMS.register("polished_diorite_button",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_BUTTON.get(),
                        basicProperties("polished_diorite_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_PRESSURE_PLATE = ITEMS.register("polished_diorite_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get(),
                        basicProperties("polished_diorite_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_DIORITE_LAMP = ITEMS.register("polished_diorite_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_DIORITE_LAMP.get(),
                        basicProperties("polished_diorite_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_POLISHED_ANDESITE = ITEMS.register("cracked_polished_andesite",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_ANDESITE.get(),
                        basicProperties("cracked_polished_andesite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_WALL = ITEMS.register("polished_andesite_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_WALL.get(),
                        basicProperties("polished_andesite_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_FENCE = ITEMS.register("polished_andesite_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_FENCE.get(),
                        basicProperties("polished_andesite_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_FENCE_GATE = ITEMS.register("polished_andesite_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_FENCE_GATE.get(),
                        basicProperties("polished_andesite_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_ANDESITE = ITEMS.register("chiseled_polished_andesite",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_ANDESITE.get(),
                        basicProperties("chiseled_polished_andesite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_PILLAR = ITEMS.register("polished_andesite_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_PILLAR.get(),
                        basicProperties("polished_andesite_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_DOOR = ITEMS.register("polished_andesite_door",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_DOOR.get(),
                        basicProperties("polished_andesite_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_TRAPDOOR = ITEMS.register("polished_andesite_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_TRAPDOOR.get(),
                        basicProperties("polished_andesite_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_BUTTON = ITEMS.register("polished_andesite_button",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_BUTTON.get(),
                        basicProperties("polished_andesite_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_PRESSURE_PLATE = ITEMS.register("polished_andesite_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get(),
                        basicProperties("polished_andesite_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_ANDESITE_LAMP = ITEMS.register("polished_andesite_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_ANDESITE_LAMP.get(),
                        basicProperties("polished_andesite_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_SANDSTONE = ITEMS.register("cracked_sandstone",
                () -> new BlockItem(InspireBlocks.CRACKED_SANDSTONE.get(),
                        basicProperties("cracked_sandstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_FENCE = ITEMS.register("sandstone_fence",
                () -> new BlockItem(InspireBlocks.SANDSTONE_FENCE.get(),
                        basicProperties("sandstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_FENCE_GATE = ITEMS.register("sandstone_fence_gate",
                () -> new BlockItem(InspireBlocks.SANDSTONE_FENCE_GATE.get(),
                        basicProperties("sandstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_PILLAR = ITEMS.register("sandstone_pillar",
                () -> new BlockItem(InspireBlocks.SANDSTONE_PILLAR.get(),
                        basicProperties("sandstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_DOOR = ITEMS.register("sandstone_door",
                () -> new BlockItem(InspireBlocks.SANDSTONE_DOOR.get(),
                        basicProperties("sandstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_TRAPDOOR = ITEMS.register("sandstone_trapdoor",
                () -> new BlockItem(InspireBlocks.SANDSTONE_TRAPDOOR.get(),
                        basicProperties("sandstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_BUTTON = ITEMS.register("sandstone_button",
                () -> new BlockItem(InspireBlocks.SANDSTONE_BUTTON.get(),
                        basicProperties("sandstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_PRESSURE_PLATE = ITEMS.register("sandstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.SANDSTONE_PRESSURE_PLATE.get(),
                        basicProperties("sandstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SANDSTONE_LAMP = ITEMS.register("sandstone_lamp",
                () -> new BlockItem(InspireBlocks.SANDSTONE_LAMP.get(),
                        basicProperties("sandstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_IRON_BLOCK = ITEMS.register("cracked_iron_block",
                () -> new BlockItem(InspireBlocks.CRACKED_IRON_BLOCK.get(),
                        basicProperties("cracked_iron_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_STAIRS = ITEMS.register("iron_block_stairs",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_STAIRS.get(),
                        basicProperties("iron_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_SLAB = ITEMS.register("iron_block_slab",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_SLAB.get(),
                        basicProperties("iron_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_WALL = ITEMS.register("iron_block_wall",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_WALL.get(),
                        basicProperties("iron_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_FENCE = ITEMS.register("iron_block_fence",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_FENCE.get(),
                        basicProperties("iron_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_FENCE_GATE = ITEMS.register("iron_block_fence_gate",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_FENCE_GATE.get(),
                        basicProperties("iron_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_IRON_BLOCK = ITEMS.register("chiseled_iron_block",
                () -> new BlockItem(InspireBlocks.CHISELED_IRON_BLOCK.get(),
                        basicProperties("chiseled_iron_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_PILLAR = ITEMS.register("iron_block_pillar",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_PILLAR.get(),
                        basicProperties("iron_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_DOOR = ITEMS.register("iron_block_door",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_DOOR.get(),
                        basicProperties("iron_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_TRAPDOOR = ITEMS.register("iron_block_trapdoor",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_TRAPDOOR.get(),
                        basicProperties("iron_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_BUTTON = ITEMS.register("iron_block_button",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_BUTTON.get(),
                        basicProperties("iron_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_PRESSURE_PLATE = ITEMS.register("iron_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("iron_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        IRON_BLOCK_LAMP = ITEMS.register("iron_block_lamp",
                () -> new BlockItem(InspireBlocks.IRON_BLOCK_LAMP.get(),
                        basicProperties("iron_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_GOLD_BLOCK = ITEMS.register("cracked_gold_block",
                () -> new BlockItem(InspireBlocks.CRACKED_GOLD_BLOCK.get(),
                        basicProperties("cracked_gold_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_STAIRS = ITEMS.register("gold_block_stairs",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_STAIRS.get(),
                        basicProperties("gold_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_SLAB = ITEMS.register("gold_block_slab",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_SLAB.get(),
                        basicProperties("gold_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_WALL = ITEMS.register("gold_block_wall",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_WALL.get(),
                        basicProperties("gold_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_FENCE = ITEMS.register("gold_block_fence",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_FENCE.get(),
                        basicProperties("gold_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_FENCE_GATE = ITEMS.register("gold_block_fence_gate",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_FENCE_GATE.get(),
                        basicProperties("gold_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_GOLD_BLOCK = ITEMS.register("chiseled_gold_block",
                () -> new BlockItem(InspireBlocks.CHISELED_GOLD_BLOCK.get(),
                        basicProperties("chiseled_gold_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_PILLAR = ITEMS.register("gold_block_pillar",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_PILLAR.get(),
                        basicProperties("gold_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_DOOR = ITEMS.register("gold_block_door",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_DOOR.get(),
                        basicProperties("gold_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_TRAPDOOR = ITEMS.register("gold_block_trapdoor",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_TRAPDOOR.get(),
                        basicProperties("gold_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_BUTTON = ITEMS.register("gold_block_button",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_BUTTON.get(),
                        basicProperties("gold_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_PRESSURE_PLATE = ITEMS.register("gold_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("gold_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        GOLD_BLOCK_LAMP = ITEMS.register("gold_block_lamp",
                () -> new BlockItem(InspireBlocks.GOLD_BLOCK_LAMP.get(),
                        basicProperties("gold_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_EMERALD_BLOCK = ITEMS.register("cracked_emerald_block",
                () -> new BlockItem(InspireBlocks.CRACKED_EMERALD_BLOCK.get(),
                        basicProperties("cracked_emerald_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_STAIRS = ITEMS.register("emerald_block_stairs",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_STAIRS.get(),
                        basicProperties("emerald_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_SLAB = ITEMS.register("emerald_block_slab",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_SLAB.get(),
                        basicProperties("emerald_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_WALL = ITEMS.register("emerald_block_wall",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_WALL.get(),
                        basicProperties("emerald_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_FENCE = ITEMS.register("emerald_block_fence",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_FENCE.get(),
                        basicProperties("emerald_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_FENCE_GATE = ITEMS.register("emerald_block_fence_gate",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_FENCE_GATE.get(),
                        basicProperties("emerald_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_EMERALD_BLOCK = ITEMS.register("chiseled_emerald_block",
                () -> new BlockItem(InspireBlocks.CHISELED_EMERALD_BLOCK.get(),
                        basicProperties("chiseled_emerald_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_PILLAR = ITEMS.register("emerald_block_pillar",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_PILLAR.get(),
                        basicProperties("emerald_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_DOOR = ITEMS.register("emerald_block_door",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_DOOR.get(),
                        basicProperties("emerald_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_TRAPDOOR = ITEMS.register("emerald_block_trapdoor",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_TRAPDOOR.get(),
                        basicProperties("emerald_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_BUTTON = ITEMS.register("emerald_block_button",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_BUTTON.get(),
                        basicProperties("emerald_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_PRESSURE_PLATE = ITEMS.register("emerald_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("emerald_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        EMERALD_BLOCK_LAMP = ITEMS.register("emerald_block_lamp",
                () -> new BlockItem(InspireBlocks.EMERALD_BLOCK_LAMP.get(),
                        basicProperties("emerald_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_DIAMOND_BLOCK = ITEMS.register("cracked_diamond_block",
                () -> new BlockItem(InspireBlocks.CRACKED_DIAMOND_BLOCK.get(),
                        basicProperties("cracked_diamond_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_STAIRS = ITEMS.register("diamond_block_stairs",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_STAIRS.get(),
                        basicProperties("diamond_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_SLAB = ITEMS.register("diamond_block_slab",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_SLAB.get(),
                        basicProperties("diamond_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_WALL = ITEMS.register("diamond_block_wall",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_WALL.get(),
                        basicProperties("diamond_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_FENCE = ITEMS.register("diamond_block_fence",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_FENCE.get(),
                        basicProperties("diamond_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_FENCE_GATE = ITEMS.register("diamond_block_fence_gate",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_FENCE_GATE.get(),
                        basicProperties("diamond_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_DIAMOND_BLOCK = ITEMS.register("chiseled_diamond_block",
                () -> new BlockItem(InspireBlocks.CHISELED_DIAMOND_BLOCK.get(),
                        basicProperties("chiseled_diamond_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_PILLAR = ITEMS.register("diamond_block_pillar",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_PILLAR.get(),
                        basicProperties("diamond_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_DOOR = ITEMS.register("diamond_block_door",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_DOOR.get(),
                        basicProperties("diamond_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_TRAPDOOR = ITEMS.register("diamond_block_trapdoor",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_TRAPDOOR.get(),
                        basicProperties("diamond_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_BUTTON = ITEMS.register("diamond_block_button",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_BUTTON.get(),
                        basicProperties("diamond_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_PRESSURE_PLATE = ITEMS.register("diamond_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("diamond_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DIAMOND_BLOCK_LAMP = ITEMS.register("diamond_block_lamp",
                () -> new BlockItem(InspireBlocks.DIAMOND_BLOCK_LAMP.get(),
                        basicProperties("diamond_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_NETHERITE_BLOCK = ITEMS.register("cracked_netherite_block",
                () -> new BlockItem(InspireBlocks.CRACKED_NETHERITE_BLOCK.get(),
                        basicProperties("cracked_netherite_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_STAIRS = ITEMS.register("netherite_block_stairs",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_STAIRS.get(),
                        basicProperties("netherite_block_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_SLAB = ITEMS.register("netherite_block_slab",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_SLAB.get(),
                        basicProperties("netherite_block_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_WALL = ITEMS.register("netherite_block_wall",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_WALL.get(),
                        basicProperties("netherite_block_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_FENCE = ITEMS.register("netherite_block_fence",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_FENCE.get(),
                        basicProperties("netherite_block_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_FENCE_GATE = ITEMS.register("netherite_block_fence_gate",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_FENCE_GATE.get(),
                        basicProperties("netherite_block_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_NETHERITE_BLOCK = ITEMS.register("chiseled_netherite_block",
                () -> new BlockItem(InspireBlocks.CHISELED_NETHERITE_BLOCK.get(),
                        basicProperties("chiseled_netherite_block").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_PILLAR = ITEMS.register("netherite_block_pillar",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_PILLAR.get(),
                        basicProperties("netherite_block_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_DOOR = ITEMS.register("netherite_block_door",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_DOOR.get(),
                        basicProperties("netherite_block_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_TRAPDOOR = ITEMS.register("netherite_block_trapdoor",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_TRAPDOOR.get(),
                        basicProperties("netherite_block_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_BUTTON = ITEMS.register("netherite_block_button",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_BUTTON.get(),
                        basicProperties("netherite_block_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_PRESSURE_PLATE = ITEMS.register("netherite_block_pressure_plate",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get(),
                        basicProperties("netherite_block_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        NETHERITE_BLOCK_LAMP = ITEMS.register("netherite_block_lamp",
                () -> new BlockItem(InspireBlocks.NETHERITE_BLOCK_LAMP.get(),
                        basicProperties("netherite_block_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_OBSIDIAN = ITEMS.register("cracked_obsidian",
                () -> new BlockItem(InspireBlocks.CRACKED_OBSIDIAN.get(),
                        basicProperties("cracked_obsidian").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_STAIRS = ITEMS.register("obsidian_stairs",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_STAIRS.get(),
                        basicProperties("obsidian_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_SLAB = ITEMS.register("obsidian_slab",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_SLAB.get(),
                        basicProperties("obsidian_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_WALL = ITEMS.register("obsidian_wall",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_WALL.get(),
                        basicProperties("obsidian_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_FENCE = ITEMS.register("obsidian_fence",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_FENCE.get(),
                        basicProperties("obsidian_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_FENCE_GATE = ITEMS.register("obsidian_fence_gate",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_FENCE_GATE.get(),
                        basicProperties("obsidian_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_OBSIDIAN = ITEMS.register("chiseled_obsidian",
                () -> new BlockItem(InspireBlocks.CHISELED_OBSIDIAN.get(),
                        basicProperties("chiseled_obsidian").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_PILLAR = ITEMS.register("obsidian_pillar",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_PILLAR.get(),
                        basicProperties("obsidian_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_DOOR = ITEMS.register("obsidian_door",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_DOOR.get(),
                        basicProperties("obsidian_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_TRAPDOOR = ITEMS.register("obsidian_trapdoor",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_TRAPDOOR.get(),
                        basicProperties("obsidian_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_BUTTON = ITEMS.register("obsidian_button",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_BUTTON.get(),
                        basicProperties("obsidian_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_PRESSURE_PLATE = ITEMS.register("obsidian_pressure_plate",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_PRESSURE_PLATE.get(),
                        basicProperties("obsidian_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        OBSIDIAN_LAMP = ITEMS.register("obsidian_lamp",
                () -> new BlockItem(InspireBlocks.OBSIDIAN_LAMP.get(),
                        basicProperties("obsidian_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_CRYING_OBSIDIAN = ITEMS.register("cracked_crying_obsidian",
                () -> new BlockItem(InspireBlocks.CRACKED_CRYING_OBSIDIAN.get(),
                        basicProperties("cracked_crying_obsidian").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_STAIRS = ITEMS.register("crying_obsidian_stairs",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                        basicProperties("crying_obsidian_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_SLAB = ITEMS.register("crying_obsidian_slab",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_SLAB.get(),
                        basicProperties("crying_obsidian_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_WALL = ITEMS.register("crying_obsidian_wall",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_WALL.get(),
                        basicProperties("crying_obsidian_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_FENCE = ITEMS.register("crying_obsidian_fence",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_FENCE.get(),
                        basicProperties("crying_obsidian_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_FENCE_GATE = ITEMS.register("crying_obsidian_fence_gate",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_FENCE_GATE.get(),
                        basicProperties("crying_obsidian_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_CRYING_OBSIDIAN = ITEMS.register("chiseled_crying_obsidian",
                () -> new BlockItem(InspireBlocks.CHISELED_CRYING_OBSIDIAN.get(),
                        basicProperties("chiseled_crying_obsidian").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_PILLAR = ITEMS.register("crying_obsidian_pillar",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_PILLAR.get(),
                        basicProperties("crying_obsidian_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_DOOR = ITEMS.register("crying_obsidian_door",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_DOOR.get(),
                        basicProperties("crying_obsidian_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_TRAPDOOR = ITEMS.register("crying_obsidian_trapdoor",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_TRAPDOOR.get(),
                        basicProperties("crying_obsidian_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_BUTTON = ITEMS.register("crying_obsidian_button",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_BUTTON.get(),
                        basicProperties("crying_obsidian_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_PRESSURE_PLATE = ITEMS.register("crying_obsidian_pressure_plate",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get(),
                        basicProperties("crying_obsidian_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRYING_OBSIDIAN_LAMP = ITEMS.register("crying_obsidian_lamp",
                () -> new BlockItem(InspireBlocks.CRYING_OBSIDIAN_LAMP.get(),
                        basicProperties("crying_obsidian_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_BEDROCK = ITEMS.register("cracked_bedrock",
                () -> new BlockItem(InspireBlocks.CRACKED_BEDROCK.get(),
                        basicProperties("cracked_bedrock").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_STAIRS = ITEMS.register("bedrock_stairs",
                () -> new BlockItem(InspireBlocks.BEDROCK_STAIRS.get(),
                        basicProperties("bedrock_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_SLAB = ITEMS.register("bedrock_slab",
                () -> new BlockItem(InspireBlocks.BEDROCK_SLAB.get(),
                        basicProperties("bedrock_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_WALL = ITEMS.register("bedrock_wall",
                () -> new BlockItem(InspireBlocks.BEDROCK_WALL.get(),
                        basicProperties("bedrock_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_FENCE = ITEMS.register("bedrock_fence",
                () -> new BlockItem(InspireBlocks.BEDROCK_FENCE.get(),
                        basicProperties("bedrock_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_FENCE_GATE = ITEMS.register("bedrock_fence_gate",
                () -> new BlockItem(InspireBlocks.BEDROCK_FENCE_GATE.get(),
                        basicProperties("bedrock_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_BEDROCK = ITEMS.register("chiseled_bedrock",
                () -> new BlockItem(InspireBlocks.CHISELED_BEDROCK.get(),
                        basicProperties("chiseled_bedrock").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_PILLAR = ITEMS.register("bedrock_pillar",
                () -> new BlockItem(InspireBlocks.BEDROCK_PILLAR.get(),
                        basicProperties("bedrock_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_DOOR = ITEMS.register("bedrock_door",
                () -> new BlockItem(InspireBlocks.BEDROCK_DOOR.get(),
                        basicProperties("bedrock_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_TRAPDOOR = ITEMS.register("bedrock_trapdoor",
                () -> new BlockItem(InspireBlocks.BEDROCK_TRAPDOOR.get(),
                        basicProperties("bedrock_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_BUTTON = ITEMS.register("bedrock_button",
                () -> new BlockItem(InspireBlocks.BEDROCK_BUTTON.get(),
                        basicProperties("bedrock_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_PRESSURE_PLATE = ITEMS.register("bedrock_pressure_plate",
                () -> new BlockItem(InspireBlocks.BEDROCK_PRESSURE_PLATE.get(),
                        basicProperties("bedrock_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        BEDROCK_LAMP = ITEMS.register("bedrock_lamp",
                () -> new BlockItem(InspireBlocks.BEDROCK_LAMP.get(),
                        basicProperties("bedrock_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        SOUL_SANDSTONE = ITEMS.register("soul_sandstone",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE.get(),
                        basicProperties("soul_sandstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_SOUL_SANDSTONE = ITEMS.register("cracked_soul_sandstone",
                () -> new BlockItem(InspireBlocks.CRACKED_SOUL_SANDSTONE.get(),
                        basicProperties("cracked_soul_sandstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_STAIRS = ITEMS.register("soul_sandstone_stairs",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_STAIRS.get(),
                        basicProperties("soul_sandstone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_SLAB = ITEMS.register("soul_sandstone_slab",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_SLAB.get(),
                        basicProperties("soul_sandstone_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_WALL = ITEMS.register("soul_sandstone_wall",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_WALL.get(),
                        basicProperties("soul_sandstone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_FENCE = ITEMS.register("soul_sandstone_fence",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_FENCE.get(),
                        basicProperties("soul_sandstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_FENCE_GATE = ITEMS.register("soul_sandstone_fence_gate",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_FENCE_GATE.get(),
                        basicProperties("soul_sandstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_SOUL_SANDSTONE = ITEMS.register("chiseled_soul_sandstone",
                () -> new BlockItem(InspireBlocks.CHISELED_SOUL_SANDSTONE.get(),
                        basicProperties("chiseled_soul_sandstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_PILLAR = ITEMS.register("soul_sandstone_pillar",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_PILLAR.get(),
                        basicProperties("soul_sandstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_DOOR = ITEMS.register("soul_sandstone_door",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_DOOR.get(),
                        basicProperties("soul_sandstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_TRAPDOOR = ITEMS.register("soul_sandstone_trapdoor",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_TRAPDOOR.get(),
                        basicProperties("soul_sandstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_BUTTON = ITEMS.register("soul_sandstone_button",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_BUTTON.get(),
                        basicProperties("soul_sandstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_PRESSURE_PLATE = ITEMS.register("soul_sandstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_PRESSURE_PLATE.get(),
                        basicProperties("soul_sandstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SANDSTONE_LAMP = ITEMS.register("soul_sandstone_lamp",
                () -> new BlockItem(InspireBlocks.SOUL_SANDSTONE_LAMP.get(),
                        basicProperties("soul_sandstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        SOUL_SLATE = ITEMS.register("soul_slate",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE.get(),
                        basicProperties("soul_slate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_SOUL_SLATE = ITEMS.register("cracked_soul_slate",
                () -> new BlockItem(InspireBlocks.CRACKED_SOUL_SLATE.get(),
                        basicProperties("cracked_soul_slate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_STAIRS = ITEMS.register("soul_slate_stairs",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_STAIRS.get(),
                        basicProperties("soul_slate_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_SLAB = ITEMS.register("soul_slate_slab",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_SLAB.get(),
                        basicProperties("soul_slate_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_WALL = ITEMS.register("soul_slate_wall",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_WALL.get(),
                        basicProperties("soul_slate_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_FENCE = ITEMS.register("soul_slate_fence",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_FENCE.get(),
                        basicProperties("soul_slate_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_FENCE_GATE = ITEMS.register("soul_slate_fence_gate",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_FENCE_GATE.get(),
                        basicProperties("soul_slate_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_SOUL_SLATE = ITEMS.register("chiseled_soul_slate",
                () -> new BlockItem(InspireBlocks.CHISELED_SOUL_SLATE.get(),
                        basicProperties("chiseled_soul_slate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_PILLAR = ITEMS.register("soul_slate_pillar",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_PILLAR.get(),
                        basicProperties("soul_slate_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_DOOR = ITEMS.register("soul_slate_door",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_DOOR.get(),
                        basicProperties("soul_slate_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_TRAPDOOR = ITEMS.register("soul_slate_trapdoor",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_TRAPDOOR.get(),
                        basicProperties("soul_slate_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_BUTTON = ITEMS.register("soul_slate_button",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_BUTTON.get(),
                        basicProperties("soul_slate_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_PRESSURE_PLATE = ITEMS.register("soul_slate_pressure_plate",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_PRESSURE_PLATE.get(),
                        basicProperties("soul_slate_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        SOUL_SLATE_LAMP = ITEMS.register("soul_slate_lamp",
                () -> new BlockItem(InspireBlocks.SOUL_SLATE_LAMP.get(),
                        basicProperties("soul_slate_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        CRACKED_DRIPSTONE = ITEMS.register("cracked_dripstone",
                () -> new BlockItem(InspireBlocks.CRACKED_DRIPSTONE.get(),
                        basicProperties("cracked_dripstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_STAIRS = ITEMS.register("dripstone_stairs",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_STAIRS.get(),
                        basicProperties("dripstone_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_SLAB = ITEMS.register("dripstone_slab",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_SLAB.get(),
                        basicProperties("dripstone_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_WALL = ITEMS.register("dripstone_wall",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_WALL.get(),
                        basicProperties("dripstone_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_FENCE = ITEMS.register("dripstone_fence",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_FENCE.get(),
                        basicProperties("dripstone_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_FENCE_GATE = ITEMS.register("dripstone_fence_gate",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_FENCE_GATE.get(),
                        basicProperties("dripstone_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_DRIPSTONE = ITEMS.register("chiseled_dripstone",
                () -> new BlockItem(InspireBlocks.CHISELED_DRIPSTONE.get(),
                        basicProperties("chiseled_dripstone").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_PILLAR = ITEMS.register("dripstone_pillar",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_PILLAR.get(),
                        basicProperties("dripstone_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_DOOR = ITEMS.register("dripstone_door",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_DOOR.get(),
                        basicProperties("dripstone_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_TRAPDOOR = ITEMS.register("dripstone_trapdoor",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_TRAPDOOR.get(),
                        basicProperties("dripstone_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_BUTTON = ITEMS.register("dripstone_button",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_BUTTON.get(),
                        basicProperties("dripstone_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_PRESSURE_PLATE = ITEMS.register("dripstone_pressure_plate",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_PRESSURE_PLATE.get(),
                        basicProperties("dripstone_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        DRIPSTONE_LAMP = ITEMS.register("dripstone_lamp",
                () -> new BlockItem(InspireBlocks.DRIPSTONE_LAMP.get(),
                        basicProperties("dripstone_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

        POLISHED_CALCITE = ITEMS.register("polished_calcite",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE.get(),
                        basicProperties("polished_calcite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CRACKED_POLISHED_CALCITE = ITEMS.register("cracked_polished_calcite",
                () -> new BlockItem(InspireBlocks.CRACKED_POLISHED_CALCITE.get(),
                        basicProperties("cracked_polished_calcite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_STAIRS = ITEMS.register("polished_calcite_stairs",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_STAIRS.get(),
                        basicProperties("polished_calcite_stairs").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_SLAB = ITEMS.register("polished_calcite_slab",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_SLAB.get(),
                        basicProperties("polished_calcite_slab").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_WALL = ITEMS.register("polished_calcite_wall",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_WALL.get(),
                        basicProperties("polished_calcite_wall").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_FENCE = ITEMS.register("polished_calcite_fence",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_FENCE.get(),
                        basicProperties("polished_calcite_fence").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_FENCE_GATE = ITEMS.register("polished_calcite_fence_gate",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_FENCE_GATE.get(),
                        basicProperties("polished_calcite_fence_gate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        CHISELED_POLISHED_CALCITE = ITEMS.register("chiseled_polished_calcite",
                () -> new BlockItem(InspireBlocks.CHISELED_POLISHED_CALCITE.get(),
                        basicProperties("chiseled_polished_calcite").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_PILLAR = ITEMS.register("polished_calcite_pillar",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_PILLAR.get(),
                        basicProperties("polished_calcite_pillar").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_DOOR = ITEMS.register("polished_calcite_door",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_DOOR.get(),
                        basicProperties("polished_calcite_door").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_TRAPDOOR = ITEMS.register("polished_calcite_trapdoor",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_TRAPDOOR.get(),
                        basicProperties("polished_calcite_trapdoor").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_BUTTON = ITEMS.register("polished_calcite_button",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_BUTTON.get(),
                        basicProperties("polished_calcite_button").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_PRESSURE_PLATE = ITEMS.register("polished_calcite_pressure_plate",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_PRESSURE_PLATE.get(),
                        basicProperties("polished_calcite_pressure_plate").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));
        POLISHED_CALCITE_LAMP = ITEMS.register("polished_calcite_lamp",
                () -> new BlockItem(InspireBlocks.POLISHED_CALCITE_LAMP.get(),
                        basicProperties("polished_calcite_lamp").arch$tab(CreativeModeTabs.BUILDING_BLOCKS)));

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
        HARNESS = ITEMS.register("harness", ()-> new Item(basicProperties("harness").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SOAP = ITEMS.register("soap", ()-> new Item(basicProperties("soap").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        ICICLE = ITEMS.register("icicle", ()-> new BlockItem(InspireBlocks.ICICLE.get(),basicProperties("icicle").arch$tab(CreativeModeTabs.NATURAL_BLOCKS)));

        OAK_WALL = ITEMS.register("oak_wall", ()-> new BlockItem(InspireBlocks.OAK_WALL.get(), basicProperties("oak_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        SPRUCE_WALL = ITEMS.register("spruce_wall", ()-> new BlockItem(InspireBlocks.SPRUCE_WALL.get(), basicProperties("spruce_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        BIRCH_WALL = ITEMS.register("birch_wall", ()-> new BlockItem(InspireBlocks.BIRCH_WALL.get(), basicProperties("birch_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        JUNGLE_WALL = ITEMS.register("jungle_wall", ()-> new BlockItem(InspireBlocks.JUNGLE_WALL.get(), basicProperties("jungle_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        ACACIA_WALL = ITEMS.register("acacia_wall", ()-> new BlockItem(InspireBlocks.ACACIA_WALL.get(), basicProperties("acacia_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        DARK_OAK_WALL = ITEMS.register("dark_oak_wall", ()-> new BlockItem(InspireBlocks.DARK_OAK_WALL.get(), basicProperties("dark_oak_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        MANGROVE_WALL = ITEMS.register("mangrove_wall", ()-> new BlockItem(InspireBlocks.MANGROVE_WALL.get(), basicProperties("mangrove_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CHERRY_WALL = ITEMS.register("cherry_wall", ()-> new BlockItem(InspireBlocks.CHERRY_WALL.get(), basicProperties("cherry_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        PALE_OAK_WALL = ITEMS.register("pale_oak_wall", ()-> new BlockItem(InspireBlocks.PALE_OAK_WALL.get(), basicProperties("pale_oak_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        BAMBOO_WALL = ITEMS.register("bamboo_wall", ()-> new BlockItem(InspireBlocks.BAMBOO_WALL.get(), basicProperties("bamboo_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        CRIMSON_WALL = ITEMS.register("crimson_wall", ()-> new BlockItem(InspireBlocks.CRIMSON_WALL.get(), basicProperties("crimson_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));
        WARPED_WALL = ITEMS.register("warped_wall", ()-> new BlockItem(InspireBlocks.WARPED_WALL.get(), basicProperties("warped_wall").arch$tab(CreativeModeTabs.COLORED_BLOCKS)));

        registerBlockItem("brick_fence_gate", InspireBlocks.BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("brick_tile_fence_gate", InspireBlocks.BRICK_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("chiseled_deepslate_bricks", InspireBlocks.CHISELED_DEEPSLATE_BRICKS, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("chiseled_deepslate_tiles", InspireBlocks.CHISELED_DEEPSLATE_TILES, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("chiseled_mud_bricks", InspireBlocks.CHISELED_MUD_BRICKS, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("chiseled_mud_brick_tiles", InspireBlocks.CHISELED_MUD_TILES, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("cracked_mud_bricks", InspireBlocks.CRACKED_MUD_BRICKS, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("cracked_mud_brick_tiles", InspireBlocks.CRACKED_MUD_TILES, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("cyan_nether_brick_fence_gate", InspireBlocks.CYAN_NETHER_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("cyan_nether_tile_fence_gate", InspireBlocks.CYAN_NETHER_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_button", InspireBlocks.DEEPSLATE_BRICK_BUTTON, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_door", InspireBlocks.DEEPSLATE_BRICK_DOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_fence", InspireBlocks.DEEPSLATE_BRICK_FENCE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_fence_gate", InspireBlocks.DEEPSLATE_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_lamp", InspireBlocks.DEEPSLATE_BRICK_LAMP, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_pillar", InspireBlocks.DEEPSLATE_BRICK_PILLAR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_pressure_plate", InspireBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_brick_trapdoor", InspireBlocks.DEEPSLATE_BRICK_TRAPDOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_button", InspireBlocks.DEEPSLATE_TILE_BUTTON, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_door", InspireBlocks.DEEPSLATE_TILE_DOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_fence", InspireBlocks.DEEPSLATE_TILE_FENCE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_fence_gate", InspireBlocks.DEEPSLATE_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_lamp", InspireBlocks.DEEPSLATE_TILE_LAMP, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_pillar", InspireBlocks.DEEPSLATE_TILE_PILLAR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_pressure_plate", InspireBlocks.DEEPSLATE_TILE_PRESSURE_PLATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("deepslate_tile_trapdoor", InspireBlocks.DEEPSLATE_TILE_TRAPDOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_button", InspireBlocks.MUD_BRICK_BUTTON, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_door", InspireBlocks.MUD_BRICK_DOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_fence", InspireBlocks.MUD_BRICK_FENCE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_fence_gate", InspireBlocks.MUD_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_lamp", InspireBlocks.MUD_BRICK_LAMP, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_pillar", InspireBlocks.MUD_BRICK_PILLAR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_pressure_plate", InspireBlocks.MUD_BRICK_PRESSURE_PLATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_trapdoor", InspireBlocks.MUD_BRICK_TRAPDOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_button", InspireBlocks.MUD_TILE_BUTTON, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_door", InspireBlocks.MUD_TILE_DOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_fence", InspireBlocks.MUD_TILE_FENCE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_fence_gate", InspireBlocks.MUD_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_lamp", InspireBlocks.MUD_TILE_LAMP, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_pillar", InspireBlocks.MUD_TILE_PILLAR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_pressure_plate", InspireBlocks.MUD_TILE_PRESSURE_PLATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_slab", InspireBlocks.MUD_TILE_SLAB, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_stairs", InspireBlocks.MUD_TILE_STAIRS, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_trapdoor", InspireBlocks.MUD_TILE_TRAPDOOR, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tile_wall", InspireBlocks.MUD_TILE_WALL, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("mud_brick_tiles", InspireBlocks.MUD_TILES, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("nether_brick_fence_gate", InspireBlocks.NETHER_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("nether_tile_fence_gate", InspireBlocks.NETHER_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("quartz_brick_fence_gate", InspireBlocks.QUARTZ_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("quartz_tile_fence_gate", InspireBlocks.QUARTZ_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("red_nether_brick_fence_gate", InspireBlocks.RED_NETHER_BRICK_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
        registerBlockItem("red_nether_tile_fence_gate", InspireBlocks.RED_NETHER_TILE_FENCE_GATE, CreativeModeTabs.BUILDING_BLOCKS);
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

    private static void registerBlockItem(String name, RegistrySupplier<Block> block, ResourceKey<CreativeModeTab> tab) {
        ITEMS.register(name, () -> new BlockItem(block.get(), basicProperties(name).arch$tab(tab)));
    }

    private static Item.Properties basicProperties(String name) {
        // setId() is not available in Minecraft 1.21.1
        return new Item.Properties();
    }
}
