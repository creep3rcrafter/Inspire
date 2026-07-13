package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class InspirePaintings {
    public static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(InspireCommon.MOD_ID,Registries.PAINTING_VARIANT_REGISTRY);
    public static final RegistrySupplier<PaintingVariant> CREATIVE1;
    public static final RegistrySupplier<PaintingVariant> CREATIVE2;
    public static final RegistrySupplier<PaintingVariant> NIRVANA;
    public static final RegistrySupplier<PaintingVariant> RED_HOT_CHILI_PEPPERS;
    public static final RegistrySupplier<PaintingVariant> REM;
    public static final RegistrySupplier<PaintingVariant> SCREAMING_TREES;
    public static final RegistrySupplier<PaintingVariant> TAME_IMPALA;

    static {
        CREATIVE1 = PAINTINGS.register("creative1", () -> new PaintingVariant(64, 32));
        CREATIVE2 = PAINTINGS.register("creative2", () -> new PaintingVariant(128, 64));
        NIRVANA = PAINTINGS.register("nirvana", () -> new PaintingVariant(32, 32));
        RED_HOT_CHILI_PEPPERS = PAINTINGS.register("red_hot_chili_peppers", () -> new PaintingVariant(16, 16));
        REM = PAINTINGS.register("rem", () -> new PaintingVariant(48, 48));
        SCREAMING_TREES = PAINTINGS.register("screaming_trees", () -> new PaintingVariant(48, 48));
        TAME_IMPALA = PAINTINGS.register("tame_impala", () -> new PaintingVariant(48, 48));
    }
}
