package net.github.creep3rcrafter.inspire.utils;

import net.github.creep3rcrafter.inspire.register.InspireBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

public class BetterBlockFamilies {
    public static final BetterBlockFamily MUD_BRICKS;
    static {
        MUD_BRICKS = new BetterBlockFamily(
                null,
                Blocks.MUD_BRICKS,
                Blocks.MUD_BRICKS,
                InspireBlocks.CRACKED_MUD_BRICKS.get(),
                Blocks.MUD_BRICK_STAIRS,
                Blocks.MUD_BRICK_SLAB,
                Blocks.MUD_BRICK_WALL,
                InspireBlocks.MUD_BRICK_FENCE.get(),
                InspireBlocks.MUD_BRICK_FENCE_GATE.get(),
                InspireBlocks.CHISELED_MUD_BRICKS.get(),
                InspireBlocks.MUD_BRICK_PILLAR.get(),
                InspireBlocks.BRICK_DOOR.get(),
                InspireBlocks.BRICK_TRAPDOOR.get(),
                InspireBlocks.MUD_BRICK_BUTTON.get(),
                InspireBlocks.BRICK_PRESSURE_PLATE.get(),
                InspireBlocks.MUD_BRICK_LAMP.get(),
                null,
                null,
                null,
                null);
    }
}
