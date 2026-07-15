package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.dimension.DimensionType;

import java.util.OptionalLong;

public class InspireDimensions {
    public static final DeferredRegister<DimensionType> DIMENSION_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registries.DIMENSION_TYPE);
    //public static final DeferredRegister<ResourceKey> DIMENSION_TYPES = DeferredRegister.create(InspireCommon.MOD_ID,Registries.);

    //public static final DeferredRegister<DimensionType> DIMENSION_TYPES = DeferredRegister.create(InspireCommon.MOD_ID,Registries.);
    public static final RegistrySupplier<DimensionType> ETHER_DIMENSION;

    static {
        //ETHER_DIMENSION = DIMENSION.register("", ()->
        ETHER_DIMENSION = DIMENSION_TYPES.register("the_ether", () -> new DimensionType(
                OptionalLong.of(0),
                false,
                true,
                false,
                false,
                16,
                false,
                false,
                0,
                192,
                192,
                BlockTags.INFINIBURN_NETHER,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "the_ether"),
                0f,
                new DimensionType.MonsterSettings(false, true, UniformInt.of(0, 7),
                        0)));
    }
}
