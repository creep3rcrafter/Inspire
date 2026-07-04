package net.github.creep3rcrafter.inspire.register;

import dev.architectury.hooks.item.tool.AxeItemHooks;

public class InspireStrippableBlocks {
    static {
        AxeItemHooks.addStrippable(InspireBlocks.WITHERED_WOOD.get(), InspireBlocks.STRIPPED_WITHERED_WOOD.get());
        AxeItemHooks.addStrippable(InspireBlocks.WITHERED_LOG.get(), InspireBlocks.STRIPPED_WITHERED_LOG.get());
        AxeItemHooks.addStrippable(InspireBlocks.PINE_WOOD.get(), InspireBlocks.STRIPPED_PINE_WOOD.get());
        AxeItemHooks.addStrippable(InspireBlocks.PINE_LOG.get(), InspireBlocks.STRIPPED_PINE_LOG.get());
        AxeItemHooks.addStrippable(InspireBlocks.REDWOOD_WOOD.get(), InspireBlocks.STRIPPED_REDWOOD_WOOD.get());
        AxeItemHooks.addStrippable(InspireBlocks.REDWOOD_LOG.get(), InspireBlocks.STRIPPED_REDWOOD_LOG.get());
    }
}
