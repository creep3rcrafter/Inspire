package net.github.creep3rcrafter.inspire.client.register;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.*;
import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepFlowerEntityModel;
import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepWoolEntityModel;
import com.github.creep3rcrafter.inspire.client.render.entity.EnderChestBoatEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.TrappedChestBoatEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.animal.FleepEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.animal.WitherSkeletonHorseEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.hostile.SkeletonCreeperEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.hostile.SkeletonPiglinEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.hostile.SunkenEntityRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.projectile.CustomArrowEntityRenderer;
import com.github.creep3rcrafter.inspire.entity.EnderChestMinecartEntity;
import com.github.creep3rcrafter.inspire.entity.TrappedChestMinecartEntity;
import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.MinecartEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.MinecartEntityModel;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.util.Identifier;

public class InspireEntityRenderers {
    public static final EntityModelLayer WITHER_SKELETON_HORSE_MODEL_LAYER;

    public static final EntityModelLayer SKELETON_PIGLIN_MODEL_LAYER;

    public static final EntityModelLayer SKELETON_CREEPER_MODEL_LAYER;

    public static final EntityModelLayer TRAPPED_CHEST_MINECART_MODEL_LAYER;
    public static final EntityModelLayer ENDER_CHEST_MINECART_MODEL_LAYER;
    public static final EntityModelLayer FLEEP_MODEL_LAYER;
    public static final EntityModelLayer FLEEP_FUR_MODEL_LAYER;
    public static final EntityModelLayer FLEEP_FLOWER_MODEL_LAYER;
    public static final EntityModelLayer SUNKEN_MODEL_LAYER;
    public static final EntityModelLayer SUNKEN_CORAL_MODEL_LAYER;

    static {
        WITHER_SKELETON_HORSE_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "wither_skeleton_horse"), "main");
        TRAPPED_CHEST_MINECART_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "trapped_chest_minecart"), "main");
        ENDER_CHEST_MINECART_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "ender_chest_minecart"), "main");
        SKELETON_PIGLIN_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "skeleton_piglin"), "main");
        SKELETON_CREEPER_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "skeleton_creeper"), "main");
        FLEEP_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "fleep"), "main");
        FLEEP_FUR_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "fleep"), "fur");
        FLEEP_FLOWER_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "fleep"), "flowers");

        SUNKEN_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "sunken"), "main");
        SUNKEN_CORAL_MODEL_LAYER = new EntityModelLayer(new Identifier(InspireCommon.MOD_ID, "sunken"), "coral");

        EntityModelLayerRegistry.register(TRAPPED_CHEST_MINECART_MODEL_LAYER, MinecartEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(ENDER_CHEST_MINECART_MODEL_LAYER, MinecartEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(WITHER_SKELETON_HORSE_MODEL_LAYER, () -> TexturedModelData.of(WitherSkeletonHorseEntityModel.getModelData(Dilation.NONE), 64, 64));
        EntityModelLayerRegistry.register(SKELETON_PIGLIN_MODEL_LAYER, () -> TexturedModelData.of(SkeletonPiglinEntityModel.getModelData(Dilation.NONE), 64, 64));

        EntityModelLayerRegistry.register(SKELETON_CREEPER_MODEL_LAYER, () -> SkeletonCreeperEntityModel.getTexturedModelData(Dilation.NONE));
        EntityModelLayerRegistry.register(FLEEP_MODEL_LAYER, FleepEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(FLEEP_FUR_MODEL_LAYER, FleepWoolEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(FLEEP_FLOWER_MODEL_LAYER, FleepFlowerEntityModel::getTexturedModelData);

        EntityModelLayerRegistry.register(SUNKEN_MODEL_LAYER, SkeletonEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.register(SUNKEN_CORAL_MODEL_LAYER, SunkenCoralEntityModel::getTexturedModelData);

        EntityRendererRegistry.register(InspireEntityTypes.CUSTOM_ARROW, CustomArrowEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYNAMITE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.BRICK, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.NETHER_BRICK, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SOUL_BOTTLE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SLIMEBALL, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.DYE_GLOB, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.ENDER_CHEST_BOAT, EnderChestBoatEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.TRAPPED_CHEST_BOAT, TrappedChestBoatEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.TRAPPED_CHEST_MINECART, context -> {
            return new MinecartEntityRenderer<TrappedChestMinecartEntity>(context, TRAPPED_CHEST_MINECART_MODEL_LAYER);});
        EntityRendererRegistry.register(InspireEntityTypes.ENDER_CHEST_MINECART, context -> {
            return new MinecartEntityRenderer<EnderChestMinecartEntity>(context, ENDER_CHEST_MINECART_MODEL_LAYER);});
        EntityRendererRegistry.register(InspireEntityTypes.WITHER_SKELETON_HORSE, context -> {
            return new WitherSkeletonHorseEntityRenderer(context, WITHER_SKELETON_HORSE_MODEL_LAYER);});
        EntityRendererRegistry.register(InspireEntityTypes.SKELETON_PIGLIN, context -> {
            return new SkeletonPiglinEntityRenderer(context, SKELETON_PIGLIN_MODEL_LAYER, EntityModelLayers.PIGLIN_INNER_ARMOR, EntityModelLayers.PIGLIN_OUTER_ARMOR);});
        EntityRendererRegistry.register(InspireEntityTypes.SKELETON_CREEPER, SkeletonCreeperEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.FLEEP, FleepEntityRenderer::new);
        EntityRendererRegistry.register(InspireEntityTypes.SUNKEN, SunkenEntityRenderer::new);
    }
}
