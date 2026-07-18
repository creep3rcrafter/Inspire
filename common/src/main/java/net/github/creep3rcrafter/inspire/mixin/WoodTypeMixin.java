package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireWoodTypes;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Map;

@Mixin(WoodType.class)
public abstract class WoodTypeMixin {
    @Shadow
    @Final
    private static Map<String, WoodType> TYPES;
    @Unique
    private static final WoodType WITHERED = architectury_theupdatemod$registerWoodType("withered" ,InspireWoodTypes.WITHERED);
    private static final WoodType PINE = architectury_theupdatemod$registerWoodType("pine", InspireWoodTypes.PINE);
    private static final WoodType REDWOOD = architectury_theupdatemod$registerWoodType("redwood", InspireWoodTypes.REDWOOD);

    @Unique
    private static WoodType architectury_theupdatemod$registerWoodType(String string, WoodType woodType) {
        TYPES.put(string, woodType);
        return woodType;
    }
}
