package net.github.creep3rcrafter.inspire.register;

import dev.architectury.core.fluid.ArchitecturyFlowingFluid;
import dev.architectury.core.fluid.ArchitecturyFluidAttributes;
import dev.architectury.core.fluid.SimpleArchitecturyFluidAttributes;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

public class InspireFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(InspireCommon.MOD_ID,Registries.FLUID);
    public static final ArchitecturyFluidAttributes LIQUID_SOUL_FLUID_ATTRIBUTES;
    public static final ArchitecturyFluidAttributes LIQUID_HONEY_FLUID_ATTRIBUTES;
    public static final ArchitecturyFluidAttributes SCULK_SLUDGE_ATTRIBUTES;
    //public static final RegistrySupplier<FlowingFluid> POTION_FLUID;
    public static final RegistrySupplier<FlowingFluid> SOUL_FLUID;
    public static final RegistrySupplier<FlowingFluid> HONEY_FLUID;
    //public static final RegistrySupplier<FlowingFluid> FLOWING_POTION_FLUID;
    public static final RegistrySupplier<FlowingFluid> FLOWING_SOUL_FLUID;
    public static final RegistrySupplier<FlowingFluid> FLOWING_HONEY_FLUID;
    public static final RegistrySupplier<FlowingFluid> SCULK_SLUDGE;
    public static final RegistrySupplier<FlowingFluid> FLOWING_SCULK_SLUDGE;
    //honey

    static {
        /*
        EXAMPLE_FLUID_ATTRIBUTES = SimpleArchitecturyFluidAttributes.of(() -> InspireFluids.FLOWING_POTION_FLUID.get(), () -> InspireFluids.POTION_FLUID.get())
                .blockSupplier(() -> InspireBlocks.POTION_FLUID)
                .bucketItemSupplier(() -> InspireItems.POTION_BUCKET)
                .sourceTexture(ResourceLocation.parse("block/water_still"))
                .flowingTexture(ResourceLocation.parse("block/water_flow"))
                .overlayTexture(ResourceLocation.parse("block/water_overlay"))
                .luminosity(10)
                .dropOff(2);
        POTION_FLUID = FLUIDS.register("potion_fluid", () -> new ArchitecturyFlowingFluid.Source(InspireFluids.EXAMPLE_FLUID_ATTRIBUTES) {
        });
        FLOWING_POTION_FLUID = FLUIDS.register("flowing_potion_fluid", () -> new ArchitecturyFlowingFluid.Flowing(InspireFluids.EXAMPLE_FLUID_ATTRIBUTES) {
        });

         */
        SOUL_FLUID = FLUIDS.register("soul_fluid", () -> new ArchitecturyFlowingFluid.Source(InspireFluids.LIQUID_SOUL_FLUID_ATTRIBUTES) {
        });
        FLOWING_SOUL_FLUID = FLUIDS.register("flowing_soul_fluid", () -> new ArchitecturyFlowingFluid.Flowing(InspireFluids.LIQUID_SOUL_FLUID_ATTRIBUTES) {
        });
        HONEY_FLUID = FLUIDS.register("honey_fluid", () -> new ArchitecturyFlowingFluid.Source(InspireFluids.LIQUID_HONEY_FLUID_ATTRIBUTES) {
        });
        FLOWING_HONEY_FLUID = FLUIDS.register("flowing_honey_fluid", () -> new ArchitecturyFlowingFluid.Flowing(InspireFluids.LIQUID_HONEY_FLUID_ATTRIBUTES) {
        });
        SCULK_SLUDGE = FLUIDS.register("sculk_sludge", () -> new ArchitecturyFlowingFluid.Source(InspireFluids.SCULK_SLUDGE_ATTRIBUTES) {
        });
        FLOWING_SCULK_SLUDGE = FLUIDS.register("flowing_sculk_sludge", () -> new ArchitecturyFlowingFluid.Flowing(InspireFluids.SCULK_SLUDGE_ATTRIBUTES) {
        });
        LIQUID_SOUL_FLUID_ATTRIBUTES = SimpleArchitecturyFluidAttributes.of(InspireFluids.FLOWING_SOUL_FLUID, InspireFluids.SOUL_FLUID)
                .blockSupplier(() -> InspireBlocks.SOUL_FLUID_BLOCK)
                .bucketItemSupplier(() -> InspireItems.SOUL_BUCKET)
                .sourceTexture(ResourceLocation.parse("block/water_still"))
                .flowingTexture(ResourceLocation.parse("block/water_flow"))
                .overlayTexture(ResourceLocation.parse("block/water_overlay"))
                .luminosity(15)
                .dropOff(1)
                .emptySound(SoundEvents.SOUL_ESCAPE.value())
                .fillSound(SoundEvents.SOUL_ESCAPE.value())
                .color(4915199)
                .viscosity(1000);
        LIQUID_HONEY_FLUID_ATTRIBUTES = SimpleArchitecturyFluidAttributes.of(InspireFluids.FLOWING_HONEY_FLUID, InspireFluids.HONEY_FLUID)
                .blockSupplier(() -> InspireBlocks.HONEY_FLUID_BLOCK)
                .bucketItemSupplier(() -> InspireItems.HONEY_BUCKET)
                .sourceTexture(ResourceLocation.parse("block/water_still"))
                .flowingTexture(ResourceLocation.parse("block/water_flow"))
                .overlayTexture(ResourceLocation.parse("block/water_overlay"))
                .luminosity(0)
                .dropOff(2)
                .density(-1000)
                .emptySound(SoundEvents.HONEY_BLOCK_SLIDE)
                .fillSound(SoundEvents.HONEY_BLOCK_SLIDE)
                .color(16760064)
                .viscosity(100).lighterThanAir(true);
        SCULK_SLUDGE_ATTRIBUTES = SimpleArchitecturyFluidAttributes.of(InspireFluids.FLOWING_SCULK_SLUDGE, InspireFluids.SCULK_SLUDGE)
                .blockSupplier(() -> InspireBlocks.SCULK_SLUDGE_BLOCK)
                .bucketItemSupplier(() -> InspireItems.SCULK_SLUDGE_BUCKET)
                .sourceTexture(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID,"textures/block/amethyst_ore"))
                .flowingTexture(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID,"textures/block/amethyst_ore"))
                .overlayTexture(ResourceLocation.parse("block/water_overlay"))
                .luminosity(0)
                .dropOff(2)
                .density(1000)
                .temperature(300)
                .emptySound(SoundEvents.SCULK_BLOCK_SPREAD)
                .fillSound(SoundEvents.SCULK_BLOCK_SPREAD)
                .color(8421504)
                .viscosity(20000);
    }
}



