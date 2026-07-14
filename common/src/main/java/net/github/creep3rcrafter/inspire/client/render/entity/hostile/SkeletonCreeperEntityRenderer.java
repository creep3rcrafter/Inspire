package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.SkeletonCreeperEntityModel;
import com.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import com.github.creep3rcrafter.inspire.client.render.entity.feature.SkeletonCreeperChargeFeatureRenderer;
import com.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

import java.util.Map;

public class SkeletonCreeperEntityRenderer extends MobEntityRenderer<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> {
    private static final Map<EntityType<?>, Identifier> MAP;

    static {
        MAP = Maps.newHashMap(ImmutableMap.of(InspireEntityTypes.SKELETON_CREEPER.get(), new Identifier(InspireCommon.MOD_ID, "textures/entity/hostile/skeleton_creeper/skeleton_creeper.png")));
    }

    public SkeletonCreeperEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SkeletonCreeperEntityModel<>(ctx.getPart(InspireEntityRenderers.SKELETON_CREEPER_MODEL_LAYER)), 0.5F);
        this.addFeature(new SkeletonCreeperChargeFeatureRenderer(this, ctx.getModelLoader()));
    }

    @Override
    protected void scale(SkeletonCreeperEntity creeperEntity, MatrixStack matrixStack, float f) {
        float g = creeperEntity.getClientFuseTime(f);
        float h = 1.0F + MathHelper.sin(g * 100.0F) * g * 0.01F;
        g = MathHelper.clamp(g, 0.0F, 1.0F);
        g *= g;
        g *= g;
        float i = (1.0F + g * 0.4F) * h;
        float j = (1.0F + g * 0.1F) / h;
        matrixStack.scale(i, j, i);
    }
    @Override
    protected float getAnimationCounter(SkeletonCreeperEntity creeperEntity, float f) {
        float g = creeperEntity.getClientFuseTime(f);
        return (int)(g * 10.0F) % 2 == 0 ? 0.0F : MathHelper.clamp(g, 0.5F, 1.0F);
    }
    @Override
    public Identifier getTexture(SkeletonCreeperEntity entity) {
        return (Identifier) MAP.get(entity.getType());
    }

}
