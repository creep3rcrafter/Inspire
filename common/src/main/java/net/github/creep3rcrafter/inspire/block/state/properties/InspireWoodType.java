package net.github.creep3rcrafter.inspire.block.state.properties;

import net.minecraft.world.level.block.state.properties.WoodType;

public final class InspireWoodType {
    private InspireWoodType() {
    }

    // Temporary fallback while custom WoodType bootstrap is ported to 1.21.1.
    public static WoodType create(String string) {
        return WoodType.OAK;
    }
}