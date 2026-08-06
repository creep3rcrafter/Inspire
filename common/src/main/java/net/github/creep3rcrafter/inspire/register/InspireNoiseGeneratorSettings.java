package net.github.creep3rcrafter.inspire.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseRouter;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.NoiseSettings;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class InspireNoiseGeneratorSettings {
    public static final ResourceKey<NoiseGeneratorSettings> WITHERED_WASTES_NETHER = ResourceKey.create(
            Registries.NOISE_SETTINGS,
            ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "withered_wastes_nether")
    );

    private InspireNoiseGeneratorSettings() {
    }

    public static void bootstrap(BootstrapContext<NoiseGeneratorSettings> context) {
        context.register(
                WITHERED_WASTES_NETHER,
                new NoiseGeneratorSettings(
                        NoiseSettings.create(0, 128, 1, 2),
                        Blocks.NETHERRACK.defaultBlockState(),
                        Blocks.LAVA.defaultBlockState(),
                        netherNoiseRouter(context),
                        InspireSurfaceRuleData.nether(),
                        java.util.List.of(),
                        32,
                        false,
                        false,
                        false,
                        true
                )
        );
    }

    private static NoiseRouter netherNoiseRouter(BootstrapContext<NoiseGeneratorSettings> context) {
        try {
            Method netherMethod = NoiseRouterData.class.getDeclaredMethod("nether", HolderGetter.class, HolderGetter.class);
            netherMethod.setAccessible(true);
            HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);
            HolderGetter<NormalNoise.NoiseParameters> noises = context.lookup(Registries.NOISE);
            return (NoiseRouter) netherMethod.invoke(null, densityFunctions, noises);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException exception) {
            throw new IllegalStateException("Failed to build Nether noise router for Withered Wastes", exception);
        }
    }
}
