package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.SunkenCoralEntityModel;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;

public class SunkenCoralEntityFeature extends RenderLayer<SunkenEntity, SkeletonModel<SunkenEntity>> {
    private static final ResourceLocation SKIN = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/hostile/sunken/sunken_1_coral.png");
    private final SunkenCoralEntityModel<SunkenEntity> model;

    public SunkenCoralEntityFeature(RenderLayerParent<SunkenEntity, SkeletonModel<SunkenEntity>> context, EntityModelSet modelSet) {
        super(context);
        this.model = new SunkenCoralEntityModel<>(modelSet.bakeLayer(InspireEntityRenderers.SUNKEN_CORAL_MODEL_LAYER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int light, SunkenEntity mobEntity, float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getParentModel().copyPropertiesTo(this.model);
        this.model.prepareMobModel(mobEntity, limbSwing, limbSwingAmount, partialTick);
        this.model.setupAnim(mobEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.entityCutoutNoCull(SKIN));
        this.model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(mobEntity, 0.0F), -1);
    }
}
