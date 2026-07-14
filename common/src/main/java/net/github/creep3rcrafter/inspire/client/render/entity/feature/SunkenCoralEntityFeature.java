package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.SunkenCoralEntityModel;
import com.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import com.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SunkenCoralEntityFeature extends FeatureRenderer<SunkenEntity, SkeletonEntityModel<SunkenEntity>> {
    private static final Identifier SKIN = new Identifier(InspireCommon.MOD_ID, "textures/entity/hostile/sunken/sunken_1_coral.png");
    private final SunkenCoralEntityModel<SunkenEntity> model;

    public SunkenCoralEntityFeature(FeatureRendererContext<SunkenEntity, SkeletonEntityModel<SunkenEntity>> context, EntityModelLoader loader) {
        super(context);
        this.model = new SunkenCoralEntityModel<>(loader.getModelPart(InspireEntityRenderers.SUNKEN_CORAL_MODEL_LAYER));
    }


    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, SunkenEntity mobEntity, float f, float g, float h, float j, float k, float l) {
        render(this.getContextModel(), this.model, SKIN, matrixStack, vertexConsumerProvider, i, mobEntity, f, g, j, k, l, h, 1.0F, 1.0F, 1.0F);
    }
}