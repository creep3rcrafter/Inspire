package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import net.github.creep3rcrafter.inspire.client.model.entity.SkeletonCreeperEntityModel;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EnergySwirlLayer;
import net.minecraft.resources.ResourceLocation;

public class SkeletonCreeperChargeFeatureRenderer extends EnergySwirlLayer<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> {
    private static final ResourceLocation SKIN = ResourceLocation.withDefaultNamespace("textures/entity/creeper/creeper_armor.png");
    private final SkeletonCreeperEntityModel<SkeletonCreeperEntity> model;

    public SkeletonCreeperChargeFeatureRenderer(RenderLayerParent<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> context, EntityModelSet modelSet) {
        super(context);
        this.model = new SkeletonCreeperEntityModel<>(modelSet.bakeLayer(ModelLayers.CREEPER_ARMOR));
    }

    @Override
    protected float xOffset(float partialAge) {
        return partialAge * 0.01F;
    }

    @Override
    protected ResourceLocation getTextureLocation() {
        return SKIN;
    }

    @Override
    protected EntityModel<SkeletonCreeperEntity> model() {
        return this.model;
    }
}
