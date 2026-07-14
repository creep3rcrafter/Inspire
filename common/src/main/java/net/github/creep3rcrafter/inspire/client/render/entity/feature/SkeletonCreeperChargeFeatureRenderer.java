package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.github.creep3rcrafter.inspire.client.model.entity.SkeletonCreeperEntityModel;
import com.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import net.minecraft.client.render.entity.feature.EnergySwirlOverlayFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.util.Identifier;

public class SkeletonCreeperChargeFeatureRenderer extends EnergySwirlOverlayFeatureRenderer<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> {
    private static final Identifier SKIN = new Identifier("textures/entity/creeper/creeper_armor.png");
    private final SkeletonCreeperEntityModel<SkeletonCreeperEntity> model;

    public SkeletonCreeperChargeFeatureRenderer(FeatureRendererContext<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> context, EntityModelLoader loader) {
        super(context);
        this.model = new SkeletonCreeperEntityModel<>(loader.getModelPart(EntityModelLayers.CREEPER_ARMOR));
    }

    protected float getEnergySwirlX(float partialAge) {
        return partialAge * 0.01F;
    }

    protected Identifier getEnergySwirlTexture() {
        return SKIN;
    }

    protected EntityModel<SkeletonCreeperEntity> getEnergySwirlModel() {
        return this.model;
    }
}
