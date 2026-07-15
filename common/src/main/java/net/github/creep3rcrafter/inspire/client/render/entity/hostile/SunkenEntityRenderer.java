package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.client.render.entity.feature.SunkenCoralEntityFeature;
import net.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SunkenEntityRenderer extends MobRenderer<SunkenEntity, SkeletonModel<SunkenEntity>> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/hostile/sunken/sunken_1.png");

    public SunkenEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new SkeletonModel<>(context.bakeLayer(InspireEntityRenderers.SUNKEN_MODEL_LAYER)), 0.5F);
        this.addLayer(new SunkenCoralEntityFeature(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(SunkenEntity entity) {
        return TEXTURE;
    }
}
