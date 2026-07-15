package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.client.render.entity.feature.FleepFlowerFeatureRenderer;
import net.github.creep3rcrafter.inspire.client.render.entity.feature.FleepWoolFeatureRenderer;
import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FleepEntityRenderer extends MobRenderer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/animal/fleep/fleep.png");

    public FleepEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new FleepEntityModel<>(context.bakeLayer(InspireEntityRenderers.FLEEP_MODEL_LAYER)), 0.7F);
        this.addLayer(new FleepWoolFeatureRenderer(this, context.getModelSet()));
        this.addLayer(new FleepFlowerFeatureRenderer(this, context.getBlockRenderDispatcher()));
    }

    @Override
    public ResourceLocation getTextureLocation(FleepEntity entity) {
        return TEXTURE;
    }
}
