package net.github.creep3rcrafter.inspire.client.register;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.SkeletonCreeperEntityModel;
import net.github.creep3rcrafter.inspire.client.model.entity.SkeletonPiglinEntityModel;
import net.github.creep3rcrafter.inspire.client.model.entity.SunkenCoralEntityModel;
import net.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseModel;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepFlowerEntityModel;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepWoolEntityModel;
import net.github.creep3rcrafter.inspire.client.render.entity.EnderChestBoatRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.JukeboxBoatRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.TrappedChestBoatRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.WitherSkeletonHorseRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.animal.FleepEntityRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.hostile.SkeletonCreeperEntityRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.hostile.SkeletonPiglinEntityRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.hostile.SunkenEntityRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.projectile.CustomArrowRenderer;
import net.github.creep3rcrafter.inspire.entity.EnderChestMinecartEntity;
import net.github.creep3rcrafter.inspire.entity.TrappedChestMinecartEntity;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.client.model.MinecartModel;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.resources.ResourceLocation;

public final class InspireEntityRenderers {
    public static final ModelLayerLocation WITHER_SKELETON_HORSE_MODEL_LAYER;
    public static final ModelLayerLocation SKELETON_PIGLIN_MODEL_LAYER;
    public static final ModelLayerLocation SKELETON_CREEPER_MODEL_LAYER;
    public static final ModelLayerLocation TRAPPED_CHEST_MINECART_MODEL_LAYER;
    public static final ModelLayerLocation ENDER_CHEST_MINECART_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_FUR_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_FLOWER_MODEL_LAYER;
    public static final ModelLayerLocation SUNKEN_MODEL_LAYER;
    public static final ModelLayerLocation SUNKEN_CORAL_MODEL_LAYER;

    static {
        WITHER_SKELETON_HORSE_MODEL_LAYER = layer("wither_skeleton_horse", "main");
        TRAPPED_CHEST_MINECART_MODEL_LAYER = layer("trapped_chest_minecart", "main");
        ENDER_CHEST_MINECART_MODEL_LAYER = layer("ender_chest_minecart", "main");
        SKELETON_PIGLIN_MODEL_LAYER = layer("skeleton_piglin", "main");
        SKELETON_CREEPER_MODEL_LAYER = layer("skeleton_creeper", "main");
        FLEEP_MODEL_LAYER = layer("fleep", "main");
        FLEEP_FUR_MODEL_LAYER = layer("fleep", "fur");
        FLEEP_FLOWER_MODEL_LAYER = layer("fleep", "flowers");
        SUNKEN_MODEL_LAYER = layer("sunken", "main");
        SUNKEN_CORAL_MODEL_LAYER = layer("sunken", "coral");
        EntityRendererRegistry.register(InspireEntityTypes.CUSTOM_ARROW, CustomArrowRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYNAMITE, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.BRICK, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.NETHER_BRICK, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SOUL_BOTTLE, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SLIMEBALL, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYE_GLOB, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.ENDER_CHEST_BOAT, EnderChestBoatRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.TRAPPED_CHEST_BOAT, TrappedChestBoatRenderer::new);
        EntityModelLayerRegistry.register(SKELETON_PIGLIN_MODEL_LAYER, () -> LayerDefinition.create(SkeletonPiglinEntityModel.getModelData(CubeDeformation.NONE), 64, 64));
        EntityModelLayerRegistry.register(SKELETON_CREEPER_MODEL_LAYER, () -> SkeletonCreeperEntityModel.getTexturedModelData(CubeDeformation.NONE));
        EntityModelLayerRegistry.register(FLEEP_MODEL_LAYER, FleepEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(FLEEP_FUR_MODEL_LAYER, FleepWoolEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(FLEEP_FLOWER_MODEL_LAYER, FleepFlowerEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(SUNKEN_MODEL_LAYER, SkeletonModel::createBodyLayer);
        EntityModelLayerRegistry.register(SUNKEN_CORAL_MODEL_LAYER, SunkenCoralEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(InspireEntityTypes.JUKEBOX_BOAT, JukeboxBoatRenderer::new);
        EntityModelLayerRegistry.register(WITHER_SKELETON_HORSE_MODEL_LAYER, () -> LayerDefinition.create(WitherSkeletonHorseModel.createBodyMesh(CubeDeformation.NONE), 64, 64));
        EntityModelLayerRegistry.register(TRAPPED_CHEST_MINECART_MODEL_LAYER, MinecartModel::createBodyLayer);
        EntityModelLayerRegistry.register(ENDER_CHEST_MINECART_MODEL_LAYER, MinecartModel::createBodyLayer);
        EntityRendererRegistry.register(InspireEntityTypes.WITHER_SKELETON_HORSE, context -> {
            return new WitherSkeletonHorseRenderer(context, WITHER_SKELETON_HORSE_MODEL_LAYER);
        });
        EntityRendererRegistry.register(InspireEntityTypes.TRAPPED_CHEST_MINECART, context -> {
            return new MinecartRenderer<TrappedChestMinecartEntity>(context, TRAPPED_CHEST_MINECART_MODEL_LAYER);
        });
        EntityRendererRegistry.register(InspireEntityTypes.ENDER_CHEST_MINECART, context -> {
            return new MinecartRenderer<EnderChestMinecartEntity>(context, ENDER_CHEST_MINECART_MODEL_LAYER);
        });
        EntityRendererRegistry.register(InspireEntityTypes.SKELETON_PIGLIN, context -> {
            return new SkeletonPiglinEntityRenderer(context, SKELETON_PIGLIN_MODEL_LAYER, ModelLayers.PIGLIN_INNER_ARMOR, ModelLayers.PIGLIN_OUTER_ARMOR);});
        EntityRendererRegistry.register(InspireEntityTypes.SKELETON_CREEPER, SkeletonCreeperEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.FLEEP, FleepEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SUNKEN, SunkenEntityRenderer::new);
    }

    private static ModelLayerLocation layer(String path, String layer) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, path), layer);
    }
}
