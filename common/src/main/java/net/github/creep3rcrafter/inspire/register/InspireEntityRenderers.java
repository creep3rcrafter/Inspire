package net.github.creep3rcrafter.inspire.register;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.WitherSkeletonHorseModel;
import net.github.creep3rcrafter.inspire.client.render.entity.EnderChestBoatRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.TrappedChestBoatRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.WitherSkeletonHorseRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.projectile.CustomArrowRenderer;
import net.github.creep3rcrafter.inspire.entity.EnderChestMinecartEntity;
import net.github.creep3rcrafter.inspire.entity.TrappedChestMinecartEntity;
import net.minecraft.client.model.MinecartModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.resources.ResourceLocation;

public class InspireEntityRenderers {
    public static final ModelLayerLocation WITHER_SKELETON_HORSE_MODEL_LAYER;
    public static final ModelLayerLocation TRAPPED_CHEST_MINECART_MODEL_LAYER;
    public static final ModelLayerLocation ENDER_CHEST_MINECART_MODEL_LAYER;

    static {
        WITHER_SKELETON_HORSE_MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(InspireCommon.MOD_ID, "wither_skeleton_horse"), "main");
        TRAPPED_CHEST_MINECART_MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(InspireCommon.MOD_ID, "trapped_chest_minecart"), "main");
        ENDER_CHEST_MINECART_MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(InspireCommon.MOD_ID, "ender_chest_minecart"), "main");
        EntityRendererRegistry.register(InspireEntityTypes.CUSTOM_ARROW, CustomArrowRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYNAMITE, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.BRICK, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.NETHER_BRICK, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SOUL_BOTTLE, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SLIMEBALL, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYE_GLOB, ThrownItemRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.ENDER_CHEST_BOAT, EnderChestBoatRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.TRAPPED_CHEST_BOAT, TrappedChestBoatRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.JUKEBOX_BOAT, TrappedChestBoatRenderer::new);
        //LayerDefinitions
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
        //EntityRendererRegistry.register(InspireEntityTypes.SPEAR, ThrownSpearRenderer::new);
    }
}
