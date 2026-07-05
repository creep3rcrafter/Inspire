package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.entity.*;
import net.github.creep3rcrafter.inspire.entity.animal.horse.WitherSkeletonHorse;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class InspireEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<EntityType<ThrownDynamite>> DYNAMITE;
    public static final RegistrySupplier<EntityType<ThrownSlimeball>> SLIMEBALL;
    public static final RegistrySupplier<EntityType<ThrownBrick>> BRICK;
    public static final RegistrySupplier<EntityType<ThrownNetherBrick>> NETHER_BRICK;
    public static final RegistrySupplier<EntityType<ThrownSoulBottle>> SOUL_BOTTLE;
    public static final RegistrySupplier<EntityType<CustomArrow>> CUSTOM_ARROW;
    public static final RegistrySupplier<EntityType<ThrownDyeGlob>> DYE_GLOB;
    public static final RegistrySupplier<EntityType<EnderChestBoat>> ENDER_CHEST_BOAT;
    public static final RegistrySupplier<EntityType<TrappedChestBoat>> TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<EntityType<JukeboxBoatEntity>> JUKEBOX_BOAT;
    public static final RegistrySupplier<EntityType<WitherSkeletonHorse>> WITHER_SKELETON_HORSE;
    public static final RegistrySupplier<EntityType<TrappedChestMinecart>> TRAPPED_CHEST_MINECART;
    public static final RegistrySupplier<EntityType<EnderChestMinecart>> ENDER_CHEST_MINECART;

    static {
        DYNAMITE = ENTITY_TYPES.register("dynamite", () ->
                EntityType.Builder.<ThrownDynamite>of(ThrownDynamite::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "dynamite").toString()));
        SLIMEBALL = ENTITY_TYPES.register("slimeball", () ->
                EntityType.Builder.<ThrownSlimeball>of(ThrownSlimeball::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "slimeball").toString()));
        BRICK = ENTITY_TYPES.register("brick", () ->
                EntityType.Builder.<ThrownBrick>of(ThrownBrick::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "brick").toString()));
        NETHER_BRICK = ENTITY_TYPES.register("nether_brick", () ->
                EntityType.Builder.<ThrownNetherBrick>of(ThrownNetherBrick::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "nether_brick").toString()));
        SOUL_BOTTLE = ENTITY_TYPES.register("soul_bottle", () ->
                EntityType.Builder.<ThrownSoulBottle>of(ThrownSoulBottle::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "soul_bottle").toString()));
        CUSTOM_ARROW = ENTITY_TYPES.register("custom_arrow", () ->
                EntityType.Builder.<CustomArrow>of(CustomArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "custom_arrow").toString()));
        DYE_GLOB = ENTITY_TYPES.register("dye_glob", () ->
                EntityType.Builder.<ThrownDyeGlob>of(ThrownDyeGlob::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "dye_glob").toString()));
        ENDER_CHEST_BOAT = ENTITY_TYPES.register("ender_chest_boat", () ->
                EntityType.Builder.<EnderChestBoat>of(EnderChestBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "ender_chest_boat").toString()));
        TRAPPED_CHEST_BOAT = ENTITY_TYPES.register("trapped_chest_boat", () ->
                EntityType.Builder.<TrappedChestBoat>of(TrappedChestBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "trapped_chest_boat").toString()));
        JUKEBOX_BOAT = ENTITY_TYPES.register("jukebox_boat", () ->
                EntityType.Builder.<JukeboxBoatEntity>of(JukeboxBoatEntity::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "jukebox_boat").toString()));

        WITHER_SKELETON_HORSE = ENTITY_TYPES.register("wither_skeleton_horse", () ->
                EntityType.Builder.<WitherSkeletonHorse>of(WitherSkeletonHorse::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(10).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "wither_skeleton_horse").toString()));

        TRAPPED_CHEST_MINECART = ENTITY_TYPES.register("trapped_chest_minecart", () ->
                EntityType.Builder.<TrappedChestMinecart>of(TrappedChestMinecart::new, MobCategory.MISC).sized(0.98F, 0.7F).clientTrackingRange(8).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "trapped_chest_minecart").toString()));

        ENDER_CHEST_MINECART = ENTITY_TYPES.register("ender_chest_minecart", () ->
                EntityType.Builder.<EnderChestMinecart>of(EnderChestMinecart::new, MobCategory.MISC).sized(0.98F, 0.7F).clientTrackingRange(8).build(
                        new ResourceLocation(InspireCommon.MOD_ID, "ender_chest_minecart").toString()));
    }
    /*
    public static final RegistrySupplier<EntityType<MobBoat>> MOB_BOAT = ENTITY_TYPES.register("mob_boat", () ->
            EntityType.Builder.<MobBoat>of(MobBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                    new ResourceLocation(InspireCommon.MOD_ID, "mob_boat").toString()));
    public static final RegistrySupplier<EntityType<ThrownSpear>> SPEAR = ENTITY_TYPES.register("thrown_spear", () ->
            EntityType.Builder.<ThrownSpear>of(ThrownSpear::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(InspireCommon.MOD_ID, "thrown_spear").toString()));

     */
}
