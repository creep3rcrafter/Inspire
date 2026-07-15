package net.github.creep3rcrafter.inspire.client.render.entity.projectile;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class CustomArrowRenderer<T extends CustomArrowEntity> extends EntityRenderer<T> {

    public CustomArrowRenderer(EntityRendererProvider.Context context) {
        super(context);

    }

    @Override
    public void render(T abstractArrow, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(g, abstractArrow.yRotO, abstractArrow.getYRot()) - 90.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(g, abstractArrow.xRotO, abstractArrow.getXRot())));
        float s = (float) abstractArrow.shakeTime - g;
        if (s > 0.0F) {
            float t = -Mth.sin(s * 3.0F) * s;
            poseStack.mulPose(Axis.ZP.rotationDegrees(t));
        }

        poseStack.mulPose(Axis.XP.rotationDegrees(45.0F));
        poseStack.scale(0.05625F, 0.05625F, 0.05625F);
        poseStack.translate(-4.0, 0.0, 0.0);
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutout(this.getRodTextureLocation(abstractArrow)));
        PoseStack.Pose pose = poseStack.last();
        org.joml.Matrix4f matrix4f = pose.pose();
        org.joml.Matrix3f matrix3f = pose.normal();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, i);

        for (int u = 0; u < 4; ++u) {
            poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, i);
        }
        vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutout(this.getTipTextureLocation(abstractArrow)));
        pose = poseStack.last();
        matrix4f = pose.pose();
        matrix3f = pose.normal();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, i);

        for (int u = 0; u < 4; ++u) {
            poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, i);
        }
        vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutout(this.getTailTextureLocation(abstractArrow)));
        pose = poseStack.last();
        matrix4f = pose.pose();
        matrix3f = pose.normal();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, i);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, i);

        for (int u = 0; u < 4; ++u) {
            poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, i);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, i);
        }
        poseStack.popPose();
        super.render(abstractArrow, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(T entity) {
        return ResourceLocation.withDefaultNamespace("textures/entity/projectiles/arrow.png");
    }


    public void vertex(org.joml.Matrix4f matrix4f, org.joml.Matrix3f matrix3f, VertexConsumer vertexConsumer, int i, int j, int k, float f, float g, int l, int m, int n, int o) {
        vertexConsumer.addVertex(matrix4f, (float) i, (float) j, (float) k).setColor(255, 255, 255, 255).setUv(f, g).setOverlay(OverlayTexture.NO_OVERLAY).setLight(o).setNormal((float) l, (float) n, (float) m);
    }

    public @NotNull ResourceLocation getTipTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getTip() == 0.0f) {
            if (arrow.getRod() == 0.0f) {
                return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/wood_tip.png");
            } else if (arrow.getRod() == 0.05f) {
                return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/bamboo_tip.png");
            } else {
                return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/blaze_tip.png");
            }
        } else if (arrow.getTip() == 0.05f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/flint_tip.png");
        } else if (arrow.getTip() == 0.1f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/bone_tip.png");
        } else if (arrow.getTip() == 0.15f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/copper_tip.png");
        } else if (arrow.getTip() == 0.2f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/iron_tip.png");
        } else if (arrow.getTip() == 0.25f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/gold_tip.png");
        } else if (arrow.getTip() == 0.3f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/diamond_tip.png");
        } else if (arrow.getTip() == 0.35f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/netherite_tip.png");
        } else if (arrow.getTip() == 0.4f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/obsidian_tip.png");
        } else if (arrow.getTip() == 0.45f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/nether_quartz_tip.png");
        } else if (arrow.getTip() == 0.5f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/amethyst_tip.png");
        } else if (arrow.getTip() == 0.55f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/prismarine_tip.png");
        } else if (arrow.getTip() == 0.6f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/slime_tip.png");
        } else if (arrow.getTip() == 0.65f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/cobweb_tip.png");
        } else if (arrow.getTip() == 0.7f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/chorus_tip.png");
        } else if (arrow.getTip() == 0.75f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/tnt_tip.png");
        } else if (arrow.getTip() == 0.8f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/ender_tip.png");
        } else if (arrow.getTip() == 0.85f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/echo_tip.png");
        } else {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/soul_tip.png");
        }
    }

    public @NotNull ResourceLocation getRodTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getRod() == 0.0f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/wood_rod.png");
        } else if (arrow.getRod() == 0.05f) {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/bamboo_rod.png");
        } else {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/blaze_rod.png");
        }
    }

    public @NotNull ResourceLocation getTailTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getTail() == 0.0f) {
            if (arrow.getRod() == 0.1f) {
                return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/burnt_feather_tail.png");
            } else {
                return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/feather_tail.png");
            }
        } else {
            return ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/projectiles/strider_scale_tail.png");
        }
    }
}
