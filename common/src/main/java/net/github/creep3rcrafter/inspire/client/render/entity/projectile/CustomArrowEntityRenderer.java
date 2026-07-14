package net.github.creep3rcrafter.inspire.client.render.entity.projectile;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class CustomArrowEntityRenderer<T extends CustomArrowEntity> extends EntityRenderer<T> {

    public CustomArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public void render(T entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch())));
        float s = (float) entity.shake - tickDelta;
        if (s > 0.0F) {
            float t = -MathHelper.sin(s * 3.0F) * s;
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(t));
        }

        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(45.0F));
        matrices.scale(0.05625F, 0.05625F, 0.05625F);
        matrices.translate(-4.0, 0.0, 0.0);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(this.getRodTextureLocation(entity)));
        MatrixStack.Entry entry = matrices.peek();
        Matrix4f matrix4f = entry.getPositionMatrix();
        Matrix3f matrix3f = entry.getNormalMatrix();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, light);

        for (int u = 0; u < 4; ++u) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, light);
        }
        vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(this.getTipTextureLocation(entity)));
        entry = matrices.peek();
        matrix4f = entry.getPositionMatrix();
        matrix3f = entry.getNormalMatrix();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, light);

        for (int u = 0; u < 4; ++u) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, light);
        }
        vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(this.getTailTextureLocation(entity)));
        entry = matrices.peek();
        matrix4f = entry.getPositionMatrix();
        matrix3f = entry.getNormalMatrix();
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, light);
        this.vertex(matrix4f, matrix3f, vertexConsumer, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, light);

        for (int u = 0; u < 4; ++u) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, light);
            this.vertex(matrix4f, matrix3f, vertexConsumer, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, light);
        }
        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(T entity) {
        return new Identifier("textures/entity/projectiles/arrow.png");
    }

    public void vertex(Matrix4f matrix4f, Matrix3f matrix3f, VertexConsumer vertexConsumer, int i, int j, int k, float f, float g, int l, int m, int n, int o) {
        vertexConsumer.vertex(matrix4f, (float) i, (float) j, (float) k).color(255, 255, 255, 255).texture(f, g).overlay(OverlayTexture.DEFAULT_UV).light(o).normal(matrix3f, (float) l, (float) n, (float) m).next();
    }

    public @NotNull Identifier getTipTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getTip() == 0.0f) {
            if (arrow.getRod() == 0.0f) {
                return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/wood_tip.png");
            } else if (arrow.getRod() == 0.05f) {
                return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/bamboo_tip.png");
            } else {
                return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/blaze_tip.png");
            }
        } else if (arrow.getTip() == 0.05f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/flint_tip.png");
        } else if (arrow.getTip() == 0.1f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/bone_tip.png");
        } else if (arrow.getTip() == 0.15f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/copper_tip.png");
        } else if (arrow.getTip() == 0.2f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/iron_tip.png");
        } else if (arrow.getTip() == 0.25f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/gold_tip.png");
        } else if (arrow.getTip() == 0.3f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/diamond_tip.png");
        } else if (arrow.getTip() == 0.35f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/netherite_tip.png");
        } else if (arrow.getTip() == 0.4f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/obsidian_tip.png");
        } else if (arrow.getTip() == 0.45f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/nether_quartz_tip.png");
        } else if (arrow.getTip() == 0.5f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/amethyst_tip.png");
        } else if (arrow.getTip() == 0.55f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/prismarine_tip.png");
        } else if (arrow.getTip() == 0.6f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/slime_tip.png");
        } else if (arrow.getTip() == 0.65f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/cobweb_tip.png");
        } else if (arrow.getTip() == 0.7f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/chorus_tip.png");
        } else if (arrow.getTip() == 0.75f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/tnt_tip.png");
        } else if (arrow.getTip() == 0.8f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/ender_tip.png");
        } else if (arrow.getTip() == 0.85f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/echo_tip.png");
        } else {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/soul_tip.png");
        }
    }

    public @NotNull Identifier getRodTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getRod() == 0.0f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/wood_rod.png");
        } else if (arrow.getRod() == 0.05f) {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/bamboo_rod.png");
        } else {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/blaze_rod.png");
        }
    }

    public @NotNull Identifier getTailTextureLocation(CustomArrowEntity arrow) {
        if (arrow.getTail() == 0.0f) {
            if (arrow.getRod() == 0.1f) {
                return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/burnt_feather_tail.png");
            } else {
                return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/feather_tail.png");
            }
        } else {
            return new Identifier(InspireCommon.MOD_ID, "textures/entity/projectiles/strider_scale_tail.png");
        }
    }
}
