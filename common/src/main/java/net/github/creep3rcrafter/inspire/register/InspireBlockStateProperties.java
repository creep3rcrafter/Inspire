package net.github.creep3rcrafter.inspire.register;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class InspireBlockStateProperties {
    public static final BooleanProperty LAVALOGGED;
    public static final IntegerProperty BLUE_POWER;
    public static final IntegerProperty PURPLE_POWER;
    public static final IntegerProperty BRIGHTNESS;
    public static final IntegerProperty WETNESS;

    static {
        LAVALOGGED = BooleanProperty.create("lavalogged");
        BLUE_POWER = IntegerProperty.create("blue_power", 0, 15);
        PURPLE_POWER = IntegerProperty.create("purple_power", 0, 31);
        BRIGHTNESS = IntegerProperty.create("brightness", 0, 15);
        WETNESS = IntegerProperty.create("brightness", 0, 8);
    }
}
