package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.SheepFurModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;
import net.minecraft.world.item.DyeColor;

public class FleepWoolFeatureRenderer extends RenderLayer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private static final ResourceLocation SKIN = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/animal/fleep/fleep_fur.png");
    private final SheepFurModel<FleepEntity> model;

    public FleepWoolFeatureRenderer(RenderLayerParent<FleepEntity, FleepEntityModel<FleepEntity>> context, EntityModelSet modelSet) {
        super(context);
        this.model = new SheepFurModel<>(modelSet.bakeLayer(InspireEntityRenderers.FLEEP_FUR_MODEL_LAYER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int light, FleepEntity fleepEntity, float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
        if (fleepEntity.isSheared()) {
            return;
        }

        if (fleepEntity.isInvisible()) {
            if (!Minecraft.getInstance().shouldEntityAppearGlowing(fleepEntity)) {
                return;
            }

            this.getParentModel().copyPropertiesTo(this.model);
            this.model.prepareMobModel(fleepEntity, limbSwing, limbSwingAmount, partialTick);
            this.model.setupAnim(fleepEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.outline(SKIN));
            this.model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(fleepEntity, 0.0F), 0xFF000000);
            return;
        }

        float red;
        float green;
        float blue;
        if (fleepEntity.hasCustomName() && "jeb_".equals(fleepEntity.getName().getString())) {
            int colorCycleLength = 25;
            int colorIndexBase = fleepEntity.tickCount / colorCycleLength + fleepEntity.getId();
            int colorCount = DyeColor.values().length;
            int firstColorIndex = colorIndexBase % colorCount;
            int secondColorIndex = (colorIndexBase + 1) % colorCount;
            float blend = ((float) (fleepEntity.tickCount % colorCycleLength) + partialTick) / (float) colorCycleLength;
            float[] firstColor = FleepEntity.getRgbColor(DyeColor.byId(firstColorIndex));
            float[] secondColor = FleepEntity.getRgbColor(DyeColor.byId(secondColorIndex));
            red = firstColor[0] * (1.0F - blend) + secondColor[0] * blend;
            green = firstColor[1] * (1.0F - blend) + secondColor[1] * blend;
            blue = firstColor[2] * (1.0F - blend) + secondColor[2] * blend;
        } else {
            float[] color = FleepEntity.getRgbColor(fleepEntity.getColor());
            red = color[0];
            green = color[1];
            blue = color[2];
        }

        this.getParentModel().copyPropertiesTo(this.model);
        this.model.prepareMobModel(fleepEntity, limbSwing, limbSwingAmount, partialTick);
        this.model.setupAnim(fleepEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.entityCutoutNoCull(SKIN));
        this.model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(fleepEntity, 0.0F), FastColor.ARGB32.color(255, (int)(red * 255), (int)(green * 255), (int)(blue * 255)));
    }
}
