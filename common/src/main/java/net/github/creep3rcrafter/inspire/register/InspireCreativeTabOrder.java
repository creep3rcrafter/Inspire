package net.github.creep3rcrafter.inspire.register;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class InspireCreativeTabOrder {
    public static final Map<Item, ItemStack[]> ITEM_MAP = new HashMap<>();

    static {
        /*
        register(Items.NETHERITE_SWORD,
                new ItemStack(InspireItems.WOODEN_CLUB.get().arch$holder().value()),
                new ItemStack(InspireItems.STONE_CLUB.get().arch$holder().value()),
                new ItemStack(InspireItems.IRON_CLUB.get().arch$holder().value()),
                new ItemStack(InspireItems.GOLD_CLUB.get().arch$holder().value()),
                new ItemStack(InspireItems.DIAMOND_CLUB.get().arch$holder().value()),
                new ItemStack(InspireItems.NETHERITE_CLUB.get().arch$holder().value()));
        register(Items.MUSHROOM_STEW,
                new ItemStack(InspireItems.DOUGH.get().arch$holder().value()));
        register(Items.BEETROOT_SOUP,
                new ItemStack(InspireItems.CARROT_SOUP.get().arch$holder().value()),
                new ItemStack(InspireItems.POTATO_SOUP.get().arch$holder().value()));
        register(Items.RABBIT_STEW,
                new ItemStack(InspireItems.BEEF_STEW.get().arch$holder().value()),
                new ItemStack(InspireItems.CHICKEN_STEW.get().arch$holder().value()),
                new ItemStack(InspireItems.MUTTON_STEW.get().arch$holder().value()));
        register(Items.BEETROOT,
                new ItemStack(InspireItems.BAKED_BEETROOT.get().arch$holder().value()));
        register(Items.CARROT,
                new ItemStack(InspireItems.BAKED_CARROT.get().arch$holder().value()));
        register(Items.COOKED_SALMON,
                new ItemStack(InspireItems.COOKED_TROPICAL_FISH.get().arch$holder().value()));
        register(Items.HONEY_BOTTLE,
                new ItemStack(InspireItems.HONEY_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.MILK_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSHROOM_STEW_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.RABBIT_STEW_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.BEEF_STEW_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.CHICKEN_STEW_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.MUTTON_STEW_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.BEETROOT_SOUP_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.CARROT_SOUP_JAR.get().arch$holder().value()),
                new ItemStack(InspireItems.POTATO_SOUP_JAR.get().arch$holder().value()));
        register(Items.GLASS_BOTTLE,
                new ItemStack(InspireItems.EMPTY_JAR.get().arch$holder().value()));
        register(Items.NETHERITE_BOOTS,
                new ItemStack(InspireItems.STRIDER_SCALE_BOOTS.get().arch$holder().value()));
        register(Items.SCUTE,
                new ItemStack(InspireItems.STRIDER_SCALE.get().arch$holder().value()));
        register(Items.REDSTONE,
                new ItemStack(InspireItems.BLUESTONE.get().arch$holder().value()));
        register(Items.REDSTONE_BLOCK,
                new ItemStack(InspireItems.BLUESTONE_BLOCK_BLOCK.get().arch$holder().value()));
        register(Items.REDSTONE_TORCH,
                new ItemStack(InspireItems.BLUESTONE_TORCH.get().arch$holder().value()));
        register(Items.REPEATER,
                new ItemStack(InspireItems.BLUESTONE_REPEATER.get().arch$holder().value()));
        register(Items.COMPARATOR,
                new ItemStack(InspireItems.BLUESTONE_COMPARATOR.get().arch$holder().value()));
        register(Items.LEVER,
                new ItemStack(InspireItems.PRISMARINE_LEVER.get().arch$holder().value()));
        register(Items.REDSTONE_LAMP,
                new ItemStack(InspireItems.PRISMARINE_LAMP_BLOCK.get().arch$holder().value()));
        register(Items.WARPED_BUTTON,
                new ItemStack(InspireItems.WITHERED_BUTTON.get().arch$holder().value()),
                new ItemStack(InspireItems.PRISMARINE_BUTTON.get().arch$holder().value()));
        register(Items.WARPED_PRESSURE_PLATE,
                new ItemStack(InspireItems.WITHERED_PRESSURE_PLATE.get().arch$holder().value()),
                new ItemStack(InspireItems.PRISMARINE_PRESSURE_PLATE.get().arch$holder().value()));
        register(Items.WARPED_PRESSURE_PLATE,
                new ItemStack(InspireItems.WITHERED_PRESSURE_PLATE.get().arch$holder().value()),
                new ItemStack(InspireItems.PRISMARINE_PRESSURE_PLATE.get().arch$holder().value()));
        register(Items.WARPED_DOOR,
                new ItemStack(InspireItems.WITHERED_DOOR.get().arch$holder().value()));
        register(Items.WARPED_TRAPDOOR,
                new ItemStack(InspireItems.WITHERED_TRAPDOOR.get().arch$holder().value()));
        register(Items.WARPED_FENCE_GATE,
                new ItemStack(InspireItems.WITHERED_FENCE_GATE.get().arch$holder().value()));
        register(Items.OAK_CHEST_BOAT,
                new ItemStack(InspireItems.OAK_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.OAK_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.SPRUCE_CHEST_BOAT,
                new ItemStack(InspireItems.SPRUCE_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.SPRUCE_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.BIRCH_CHEST_BOAT,
                new ItemStack(InspireItems.BIRCH_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.BIRCH_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.JUNGLE_CHEST_BOAT,
                new ItemStack(InspireItems.JUNGLE_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.JUNGLE_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.ACACIA_CHEST_BOAT,
                new ItemStack(InspireItems.ACACIA_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.ACACIA_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.DARK_OAK_CHEST_BOAT,
                new ItemStack(InspireItems.DARK_OAK_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.DARK_OAK_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.MANGROVE_CHEST_BOAT,
                new ItemStack(InspireItems.MANGROVE_ENDER_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.MANGROVE_ENDER_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.CRIMSON_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.CRIMSON_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.CRIMSON_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.CRIMSON_ENDER_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WARPED_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WARPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WARPED_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WARPED_ENDER_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WITHERED_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WITHERED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WITHERED_TRAPPED_CHEST_BOAT.get().arch$holder().value()),
                new ItemStack(InspireItems.WITHERED_ENDER_CHEST_BOAT.get().arch$holder().value()));
        register(Items.MANGROVE_PROPAGULE,
                new ItemStack(InspireItems.WITHERED_SAPLING.get().arch$holder().value()));
        register(Items.NAME_TAG,
                new ItemStack(InspireItems.WHITE_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.ORANGE_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.MAGENTA_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.LIGHT_BLUE_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.YELLOW_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.LIME_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.PINK_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.GRAY_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.LIGHT_GRAY_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.CYAN_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.PURPLE_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.BLUE_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.BROWN_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.GREEN_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.RED_DYE_GLOB.get().arch$holder().value()),
                new ItemStack(InspireItems.BLACK_DYE_GLOB.get().arch$holder().value()));
        register(Items.NOTE_BLOCK,
                new ItemStack(InspireItems.WHITE_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.ORANGE_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.MAGENTA_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.LIGHT_BLUE_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.YELLOW_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.LIME_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.PINK_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.GRAY_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.LIGHT_GRAY_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.CYAN_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.PURPLE_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.BLUE_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.BROWN_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.GREEN_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.RED_DYE_GLOB_BLOCK.get().arch$holder().value()),
                new ItemStack(InspireItems.BLACK_DYE_GLOB_BLOCK.get().arch$holder().value()));
        register(Items.WARPED_PLANKS,
                new ItemStack(InspireItems.WITHERED_PLANKS.get().arch$holder().value()));
        register(Items.WARPED_STEM,
                new ItemStack(InspireItems.WITHERED_LOG.get().arch$holder().value()));
        register(Items.STRIPPED_WARPED_STEM,
                new ItemStack(InspireItems.STRIPPED_WITHERED_LOG.get().arch$holder().value()));
        register(Items.STRIPPED_WARPED_HYPHAE,
                new ItemStack(InspireItems.WITHERED_WOOD.get().arch$holder().value()));
        register(Items.WARPED_SLAB,
                new ItemStack(InspireItems.WITHERED_SLAB.get().arch$holder().value()));
        register(Items.WARPED_FENCE,
                new ItemStack(InspireItems.WITHERED_FENCE.get().arch$holder().value()));
        register(Items.WARPED_STAIRS,
                new ItemStack(InspireItems.WITHERED_STAIRS.get().arch$holder().value()));
        register(Items.WARPED_SIGN,
                new ItemStack(InspireItems.WITHERED_SIGN.get().arch$holder().value()));
        register(Items.BONE,
                new ItemStack(InspireItems.WITHERED_BONE.get().arch$holder().value()));
        register(Items.BONE_MEAL,
                new ItemStack(InspireItems.WITHERED_BONE_MEAL.get().arch$holder().value()));
        register(Items.BONE_BLOCK,
                new ItemStack(InspireItems.WITHERED_BONE_BLOCK_BLOCK.get().arch$holder().value()));
        register(Items.MUSIC_DISC_OTHERSIDE,
                new ItemStack(InspireItems.MUSIC_DISC_AXOLOTL.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_DRAGON_FISH.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_SHUNIJI.get().arch$holder().value()));
        register(Items.MUSIC_DISC_5,
                new ItemStack(InspireItems.MUSIC_DISC_ANCESTRY.get().arch$holder().value()));
        register(Items.MUSIC_DISC_PIGSTEP,
                new ItemStack(InspireItems.MUSIC_DISC_CHRYSOPOEIA.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_RUBEDO.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_SO_BELOW.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_NETHER1.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_NETHER2.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_NETHER3.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_NETHER4.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_END.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_BOSS.get().arch$holder().value()),
                new ItemStack(InspireItems.MUSIC_DISC_CREDITS.get().arch$holder().value()));
        register(Items.TINTED_GLASS, new ItemStack(InspireItems.SOUL_GLASS.get().arch$holder().value()));
         */
    }

    public static void register(Item target, ItemStack... itemStacks) {
        ITEM_MAP.put(target, itemStacks);
    }

}
