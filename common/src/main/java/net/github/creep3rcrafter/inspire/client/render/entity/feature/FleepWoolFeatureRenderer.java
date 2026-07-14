package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import com.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import com.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.SheepWoolEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class FleepWoolFeatureRenderer extends FeatureRenderer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private static final Identifier SKIN = new Identifier(InspireCommon.MOD_ID, "textures/entity/animal/fleep/fleep_fur.png");
    private final SheepWoolEntityModel<FleepEntity> model;

    public FleepWoolFeatureRenderer(FeatureRendererContext<FleepEntity, FleepEntityModel<FleepEntity>> context, EntityModelLoader loader) {
        super(context);
        this.model = new SheepWoolEntityModel<>(loader.getModelPart(InspireEntityRenderers.FLEEP_FUR_MODEL_LAYER));
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, FleepEntity fleepEntity, float f, float g, float h, float j, float k, float l) {
        if (!fleepEntity.isSheared()) {
            if (fleepEntity.isInvisible()) {
                MinecraftClient minecraftClient = MinecraftClient.getInstance();
                boolean bl = minecraftClient.hasOutline(fleepEntity);
                if (bl) {
                    this.getContextModel().copyStateTo(this.model);
                    this.model.animateModel(fleepEntity, f, g, h);
                    this.model.setAngles(fleepEntity, f, g, j, k, l);
                    VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getOutline(SKIN));
                    this.model.render(matrixStack, vertexConsumer, i, LivingEntityRenderer.getOverlay(fleepEntity, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
                }

            } else {
                float s;
                float t;
                float u;
                if (fleepEntity.hasCustomName() && "jeb_".equals(fleepEntity.getName().getString())) {
                    int m = 25;
                    int n = fleepEntity.age / 25 + fleepEntity.getId();
                    int o = DyeColor.values().length;
                    int p = n % o;
                    int q = (n + 1) % o;
                    float r = ((float)(fleepEntity.age % 25) + h) / 25.0F;
                    float[] fs = FleepEntity.getRgbColor(DyeColor.byId(p));
                    float[] gs = FleepEntity.getRgbColor(DyeColor.byId(q));
                    s = fs[0] * (1.0F - r) + gs[0] * r;
                    t = fs[1] * (1.0F - r) + gs[1] * r;
                    u = fs[2] * (1.0F - r) + gs[2] * r;
                } else {
                    float[] hs = FleepEntity.getRgbColor(fleepEntity.getColor());
                    s = hs[0];
                    t = hs[1];
                    u = hs[2];
                }

                render(this.getContextModel(), this.model, SKIN, matrixStack, vertexConsumerProvider, i, fleepEntity, f, g, j, k, l, h, s, t, u);
            }
        }
    }
}
