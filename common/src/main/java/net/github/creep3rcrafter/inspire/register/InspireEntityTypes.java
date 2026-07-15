package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.entity.*;
import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.github.creep3rcrafter.inspire.entity.animal.WitherSkeletonHorseEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import net.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.github.creep3rcrafter.inspire.entity.projectile.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class InspireEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(InspireCommon.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<ThrownDynamiteEntity>> DYNAMITE;
    public static final RegistrySupplier<EntityType<ThrownSlimeballEntity>> SLIMEBALL;
    public static final RegistrySupplier<EntityType<ThrownBrickEntity>> BRICK;
    public static final RegistrySupplier<EntityType<ThrownNetherBrickEntity>> NETHER_BRICK;
    public static final RegistrySupplier<EntityType<ThrownSoulBottleEntity>> SOUL_BOTTLE;
    public static final RegistrySupplier<EntityType<CustomArrowEntity>> CUSTOM_ARROW;
    public static final RegistrySupplier<EntityType<ThrownDyeGlobEntity>> DYE_GLOB;
    public static final RegistrySupplier<EntityType<EnderChestBoatEntity>> ENDER_CHEST_BOAT;
    public static final RegistrySupplier<EntityType<TrappedChestBoatEntity>> TRAPPED_CHEST_BOAT;
    public static final RegistrySupplier<EntityType<JukeboxBoatEntity>> JUKEBOX_BOAT;
    public static final RegistrySupplier<EntityType<WitherSkeletonHorseEntity>> WITHER_SKELETON_HORSE;
    public static final RegistrySupplier<EntityType<TrappedChestMinecartEntity>> TRAPPED_CHEST_MINECART;
    public static final RegistrySupplier<EntityType<EnderChestMinecartEntity>> ENDER_CHEST_MINECART;
    public static final RegistrySupplier<EntityType<SkeletonPiglinEntity>> SKELETON_PIGLIN;
    public static final RegistrySupplier<EntityType<SkeletonCreeperEntity>> SKELETON_CREEPER;
    public static final RegistrySupplier<EntityType<SunkenEntity>> SUNKEN;
    public static final RegistrySupplier<EntityType<FleepEntity>> FLEEP;

    static {
        DYNAMITE = ENTITY_TYPES.register("dynamite", () ->
                EntityType.Builder.<ThrownDynamiteEntity>of(ThrownDynamiteEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "dynamite").toString()));
        SLIMEBALL = ENTITY_TYPES.register("slimeball", () ->
                EntityType.Builder.<ThrownSlimeballEntity>of(ThrownSlimeballEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "slimeball").toString()));
        BRICK = ENTITY_TYPES.register("brick", () ->
                EntityType.Builder.<ThrownBrickEntity>of(ThrownBrickEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "brick").toString()));
        NETHER_BRICK = ENTITY_TYPES.register("nether_brick", () ->
                EntityType.Builder.<ThrownNetherBrickEntity>of(ThrownNetherBrickEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "nether_brick").toString()));
        SOUL_BOTTLE = ENTITY_TYPES.register("soul_bottle", () ->
                EntityType.Builder.<ThrownSoulBottleEntity>of(ThrownSoulBottleEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "soul_bottle").toString()));
        CUSTOM_ARROW = ENTITY_TYPES.register("custom_arrow", () ->
                EntityType.Builder.<CustomArrowEntity>of(CustomArrowEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "custom_arrow").toString()));
        DYE_GLOB = ENTITY_TYPES.register("dye_glob", () ->
                EntityType.Builder.<ThrownDyeGlobEntity>of(ThrownDyeGlobEntity::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "dye_glob").toString()));
        ENDER_CHEST_BOAT = ENTITY_TYPES.register("ender_chest_boat", () ->
                EntityType.Builder.<EnderChestBoatEntity>of(EnderChestBoatEntity::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "ender_chest_boat").toString()));
        TRAPPED_CHEST_BOAT = ENTITY_TYPES.register("trapped_chest_boat", () ->
                EntityType.Builder.<TrappedChestBoatEntity>of(TrappedChestBoatEntity::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "trapped_chest_boat").toString()));
        JUKEBOX_BOAT = ENTITY_TYPES.register("jukebox_boat", () ->
                EntityType.Builder.<JukeboxBoatEntity>of(JukeboxBoatEntity::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "jukebox_boat").toString()));

        WITHER_SKELETON_HORSE = ENTITY_TYPES.register("wither_skeleton_horse", () ->
                EntityType.Builder.<WitherSkeletonHorseEntity>of(WitherSkeletonHorseEntity::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "wither_skeleton_horse").toString()));

        TRAPPED_CHEST_MINECART = ENTITY_TYPES.register("trapped_chest_minecart", () ->
                EntityType.Builder.<TrappedChestMinecartEntity>of(TrappedChestMinecartEntity::new, MobCategory.MISC).sized(0.98F, 0.7F).clientTrackingRange(8).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "trapped_chest_minecart").toString()));

        ENDER_CHEST_MINECART = ENTITY_TYPES.register("ender_chest_minecart", () ->
                EntityType.Builder.<EnderChestMinecartEntity>of(EnderChestMinecartEntity::new, MobCategory.MISC).sized(0.98F, 0.7F).clientTrackingRange(8).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "ender_chest_minecart").toString()));

        SKELETON_PIGLIN = ENTITY_TYPES.register("skeleton_piglin", () ->
                EntityType.Builder.<SkeletonPiglinEntity>of(SkeletonPiglinEntity::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "skeleton_piglin").toString()));
        SKELETON_CREEPER = ENTITY_TYPES.register("skeleton_creeper", () ->
                EntityType.Builder.<SkeletonCreeperEntity>of(SkeletonCreeperEntity::new, MobCategory.MONSTER).sized(0.6F, 1.7F).clientTrackingRange(8).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "skeleton_creeper").toString()));
        SUNKEN = ENTITY_TYPES.register("sunken", () ->
                EntityType.Builder.<SunkenEntity>of(SunkenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "sunken").toString()));
        FLEEP = ENTITY_TYPES.register("fleep", () ->
                EntityType.Builder.<FleepEntity>of(FleepEntity::new, MobCategory.CREATURE).sized(0.9F, 1.3F).clientTrackingRange(10).build(
                        ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "fleep").toString()));
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
