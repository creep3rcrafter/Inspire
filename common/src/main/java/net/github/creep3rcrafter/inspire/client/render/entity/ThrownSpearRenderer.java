package net.github.creep3rcrafter.inspire.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.github.creep3rcrafter.inspire.Inspire;
import net.github.creep3rcrafter.inspire.client.model.SpearModel;
import net.github.creep3rcrafter.inspire.entity.projectile.ThrownSpear;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

public class ThrownSpearRenderer extends EntityRenderer<ThrownSpear> {
    public static final ResourceLocation WOODEN_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/wooden_spear.png");
    public static final ResourceLocation STONE_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/stone_spear.png");
    public static final ResourceLocation IRON_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/iron_spear.png");
    public static final ResourceLocation GOLD_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/gold_spear.png");
    public static final ResourceLocation DIAMOND_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/diamond_spear.png");
    public static final ResourceLocation NETHERITE_SPEAR_TEXTURE_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/projectiles/netherite_spear.png");
    private final SpearModel model;

    public ThrownSpearRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new SpearModel(context.bakeLayer(SpearModel.LAYER_LOCATION));
    }

    public void render(ThrownSpear thrownSpear, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(g, thrownSpear.yRotO, thrownSpear.getYRot()) - 90.0F));
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(g, thrownSpear.xRotO, thrownSpear.getXRot()) + 90.0F));
        VertexConsumer vertexConsumer = ItemRenderer.getFoilBufferDirect(multiBufferSource, this.model.renderType(this.getTextureLocation(thrownSpear)), false, thrownSpear.isFoil());
        this.model.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
        super.render(thrownSpear, f, g, poseStack, multiBufferSource, i);
    }

    public @NotNull ResourceLocation getTextureLocation(ThrownSpear thrownSpear) {
        if (thrownSpear.getTip() == 0.1f) {
            return STONE_SPEAR_TEXTURE_LOCATION;
        } else if (thrownSpear.getTip() == 0.2f) {
            return IRON_SPEAR_TEXTURE_LOCATION;
        } else if (thrownSpear.getTip() == 0.3f) {
            return GOLD_SPEAR_TEXTURE_LOCATION;
        } else if (thrownSpear.getTip() == 0.4f) {
            return DIAMOND_SPEAR_TEXTURE_LOCATION;
        } else if (thrownSpear.getTip() == 0.5f) {
            return NETHERITE_SPEAR_TEXTURE_LOCATION;
        } else {
            return WOODEN_SPEAR_TEXTURE_LOCATION;
        }
    }
}
