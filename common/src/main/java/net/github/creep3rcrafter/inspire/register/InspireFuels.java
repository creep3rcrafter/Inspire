package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.fuel.FuelRegistry;

public class InspireFuels {
    static {
        FuelRegistry.register(75, InspireItems.OAK_BARK.get());
        FuelRegistry.register(75, InspireItems.SPRUCE_BARK.get());
        FuelRegistry.register(75, InspireItems.BIRCH_BARK.get());
        FuelRegistry.register(75, InspireItems.JUNGLE_BARK.get());
        FuelRegistry.register(75, InspireItems.ACACIA_BARK.get());
        FuelRegistry.register(75, InspireItems.DARK_OAK_BARK.get());
        FuelRegistry.register(75, InspireItems.MANGROVE_BARK.get());
        FuelRegistry.register(75, InspireItems.PINE_BARK.get());
        FuelRegistry.register(75, InspireItems.REDWOOD_BARK.get());
    }
}
