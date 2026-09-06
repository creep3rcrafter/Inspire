package net.github.creep3rcrafter.inspire.register;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class InspireWoodBark {
    public static final Map<Block, ItemStack> BLOCK_ITEM_STACK_MAP = new HashMap<>();

    //Add Honey as a fluid <-----------------------------------<---------------------------<----------------------<-------
    static {
        register(Blocks.STRIPPED_OAK_LOG,
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_OAK_WOOD,
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_SPRUCE_LOG,
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_SPRUCE_WOOD,
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_BIRCH_LOG,
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_BIRCH_WOOD,
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_JUNGLE_LOG,
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_JUNGLE_WOOD,
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_ACACIA_LOG,
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_ACACIA_WOOD,
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_DARK_OAK_LOG,
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_DARK_OAK_WOOD,
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 6));
        register(Blocks.STRIPPED_MANGROVE_LOG,
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 4));
        register(Blocks.STRIPPED_MANGROVE_WOOD,
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.STRIPPED_WITHERED_LOG.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.STRIPPED_WITHERED_WOOD.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.STRIPPED_SOUL_LOG.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.STRIPPED_SOUL_WOOD.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 6));

        register(InspireBlocks.STRIPPED_OAK_LOG_FENCE.get(),
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_OAK_WOOD_FENCE.get(),
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_SPRUCE_LOG_FENCE.get(),
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(),
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_BIRCH_LOG_FENCE.get(),
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(),
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_JUNGLE_LOG_FENCE.get(),
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(),
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_ACACIA_LOG_FENCE.get(),
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(),
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get(),
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(),
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_MANGROVE_LOG_FENCE.get(),
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(),
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_WITHERED_LOG_FENCE.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_WITHERED_WOOD_FENCE.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_SOUL_LOG_FENCE.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 1));
        register(InspireBlocks.STRIPPED_SOUL_WOOD_FENCE.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 2));

        register(InspireBlocks.STRIPPED_OAK_LOG_WALL.get(),
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_OAK_WOOD_WALL.get(),
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_SPRUCE_LOG_WALL.get(),
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(),
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_BIRCH_LOG_WALL.get(),
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_BIRCH_WOOD_WALL.get(),
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_JUNGLE_LOG_WALL.get(),
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(),
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_ACACIA_LOG_WALL.get(),
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_ACACIA_WOOD_WALL.get(),
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_DARK_OAK_LOG_WALL.get(),
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(),
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_MANGROVE_LOG_WALL.get(),
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(),
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_WITHERED_LOG_WALL.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_WITHERED_WOOD_WALL.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 3));
        register(InspireBlocks.STRIPPED_SOUL_LOG_WALL.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 2));
        register(InspireBlocks.STRIPPED_SOUL_WOOD_WALL.get(),
                new ItemStack(InspireItems.SOUL_BARK.get().arch$holder().value(), 3));

        register(InspireBlocks.STRIPPED_PINE_LOG.get(),
                new ItemStack(InspireItems.PINE_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.STRIPPED_PINE_WOOD.get(),
                new ItemStack(InspireItems.PINE_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.STRIPPED_REDWOOD_LOG.get(),
                new ItemStack(InspireItems.REDWOOD_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.STRIPPED_REDWOOD_WOOD.get(),
                new ItemStack(InspireItems.REDWOOD_BARK.get().arch$holder().value(), 6));
        register(Blocks.WAXED_COPPER_BLOCK,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_CUT_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_CUT_COPPER_SLAB,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_CUT_COPPER_STAIRS,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_EXPOSED_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_EXPOSED_CUT_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_OXIDIZED_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_OXIDIZED_CUT_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_WEATHERED_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_WEATHERED_CUT_COPPER,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB,
                new ItemStack(Items.HONEYCOMB, 1));
        register(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS,
                new ItemStack(Items.HONEYCOMB, 1));
    }

    public static void register(Block target, ItemStack itemStack) {
        BLOCK_ITEM_STACK_MAP.put(target, itemStack);
    }

}
