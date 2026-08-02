package net.github.creep3rcrafter.inspire.utils;

import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public final class AxeItemStrippingHooks {
    private static final Map<Block, Block> STRIPPABLES = new HashMap<>();

    private AxeItemStrippingHooks() {}

    public static void addStrippable(Block input, Block output) {
        STRIPPABLES.put(input, output);
    }

    @Nullable
    public static Block get(Block block) {
        return STRIPPABLES.get(block);
    }
}