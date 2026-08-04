package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class InspirePaintings {
    public static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(InspireCommon.MOD_ID,Registries.PAINTING_VARIANT);
    public static final RegistrySupplier<PaintingVariant> CREATIVE1;
    public static final RegistrySupplier<PaintingVariant> CREATIVE2;
    public static final RegistrySupplier<PaintingVariant> NIRVANA;
    public static final RegistrySupplier<PaintingVariant> RED_HOT_CHILI_PEPPERS;
    public static final RegistrySupplier<PaintingVariant> REM;
    public static final RegistrySupplier<PaintingVariant> SCREAMING_TREES;
    public static final RegistrySupplier<PaintingVariant> TAME_IMPALA;
    public static final RegistrySupplier<PaintingVariant> ANOTHER_PORTAL;
    public static final RegistrySupplier<PaintingVariant> DEMO;
    public static final RegistrySupplier<PaintingVariant> MY_EYES_HURT;
    public static final RegistrySupplier<PaintingVariant> THE_ALTER;
    public static final RegistrySupplier<PaintingVariant> THE_ARENA;
    public static final RegistrySupplier<PaintingVariant> THE_LAB;

    static {
        CREATIVE1 = PAINTINGS.register("creative1", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "creative1")));
        CREATIVE2 = PAINTINGS.register("creative2", () -> new PaintingVariant(128, 64, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "creative2")));
        NIRVANA = PAINTINGS.register("nirvana", () -> new PaintingVariant(32, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "nirvana")));
        RED_HOT_CHILI_PEPPERS = PAINTINGS.register("red_hot_chili_peppers", () -> new PaintingVariant(16, 16, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "red_hot_chili_peppers")));
        REM = PAINTINGS.register("rem", () -> new PaintingVariant(48, 48, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "rem")));
        SCREAMING_TREES = PAINTINGS.register("screaming_trees", () -> new PaintingVariant(48, 48, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "screaming_trees")));
        TAME_IMPALA = PAINTINGS.register("tame_impala", () -> new PaintingVariant(48, 48, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "tame_impala")));

        ANOTHER_PORTAL = PAINTINGS.register("another_portal", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "another_portal")));
        DEMO = PAINTINGS.register("demo", () -> new PaintingVariant(128, 64, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "demo")));
        MY_EYES_HURT = PAINTINGS.register("my_eyes_hurt", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "my_eyes_hurt")));
        THE_ALTER = PAINTINGS.register("the_alter", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "the_alter")));
        THE_ARENA = PAINTINGS.register("the_arena", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "the_arena")));
        THE_LAB = PAINTINGS.register("the_lab", () -> new PaintingVariant(64, 32, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "the_lab")));
    }
}
