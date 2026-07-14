package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModWoodTypes;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Set;

@Mixin(WoodType.class)
public abstract class WoodTypeMixin {
    @Shadow
    @Final
    private static Set<WoodType> VALUES;
    @Unique
    private static final WoodType WITHERED = architectury_theupdatemod$registerWoodType(ModWoodTypes.WITHERED);
    private static final WoodType PINE = architectury_theupdatemod$registerWoodType(ModWoodTypes.PINE);
    private static final WoodType REDWOOD = architectury_theupdatemod$registerWoodType(ModWoodTypes.REDWOOD);

    @Unique
    private static WoodType architectury_theupdatemod$registerWoodType(WoodType woodType) {
        VALUES.add(woodType);
        return woodType;
    }
}
