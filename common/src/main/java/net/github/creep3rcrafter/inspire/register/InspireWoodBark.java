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
        register(Blocks.OAK_LOG,
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 4));
        register(Blocks.OAK_WOOD,
                new ItemStack(InspireItems.OAK_BARK.get().arch$holder().value(), 6));
        register(Blocks.SPRUCE_LOG,
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 4));
        register(Blocks.SPRUCE_WOOD,
                new ItemStack(InspireItems.SPRUCE_BARK.get().arch$holder().value(), 6));
        register(Blocks.BIRCH_LOG,
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 4));
        register(Blocks.BIRCH_WOOD,
                new ItemStack(InspireItems.BIRCH_BARK.get().arch$holder().value(), 6));
        register(Blocks.JUNGLE_LOG,
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 4));
        register(Blocks.JUNGLE_WOOD,
                new ItemStack(InspireItems.JUNGLE_BARK.get().arch$holder().value(), 6));
        register(Blocks.ACACIA_LOG,
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 4));
        register(Blocks.ACACIA_WOOD,
                new ItemStack(InspireItems.ACACIA_BARK.get().arch$holder().value(), 6));
        register(Blocks.DARK_OAK_LOG,
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 4));
        register(Blocks.DARK_OAK_WOOD,
                new ItemStack(InspireItems.DARK_OAK_BARK.get().arch$holder().value(), 6));
        register(Blocks.MANGROVE_LOG,
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 4));
        register(Blocks.MANGROVE_WOOD,
                new ItemStack(InspireItems.MANGROVE_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.WITHERED_LOG.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.WITHERED_WOOD.get(),
                new ItemStack(InspireItems.WITHERED_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.PINE_LOG.get(),
                new ItemStack(InspireItems.PINE_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.PINE_WOOD.get(),
                new ItemStack(InspireItems.PINE_BARK.get().arch$holder().value(), 6));
        register(InspireBlocks.REDWOOD_LOG.get(),
                new ItemStack(InspireItems.REDWOOD_BARK.get().arch$holder().value(), 4));
        register(InspireBlocks.REDWOOD_WOOD.get(),
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
