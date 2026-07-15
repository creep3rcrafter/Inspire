package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import com.mojang.blaze3d.vertex.PoseStack;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.SkeletonCreeperEntityModel;
import net.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import net.github.creep3rcrafter.inspire.client.render.entity.feature.SkeletonCreeperChargeFeatureRenderer;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonCreeperEntity;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;

import java.util.Map;

public class SkeletonCreeperEntityRenderer extends MobRenderer<SkeletonCreeperEntity, SkeletonCreeperEntityModel<SkeletonCreeperEntity>> {
    private static final Map<EntityType<?>, ResourceLocation> MAP = Map.of(
            InspireEntityTypes.SKELETON_CREEPER.get(),
            ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/hostile/skeleton_creeper/skeleton_creeper.png")
    );

    public SkeletonCreeperEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new SkeletonCreeperEntityModel<>(context.bakeLayer(InspireEntityRenderers.SKELETON_CREEPER_MODEL_LAYER)), 0.5F);
        this.addLayer(new SkeletonCreeperChargeFeatureRenderer(this, context.getModelSet()));
    }

    @Override
    protected void scale(SkeletonCreeperEntity creeperEntity, PoseStack poseStack, float partialTick) {
        float fuse = creeperEntity.getSwelling(partialTick);
        float wave = 1.0F + Mth.sin(fuse * 100.0F) * fuse * 0.01F;
        fuse = Mth.clamp(fuse, 0.0F, 1.0F);
        fuse *= fuse;
        fuse *= fuse;
        float xzScale = (1.0F + fuse * 0.4F) * wave;
        float yScale = (1.0F + fuse * 0.1F) / wave;
        poseStack.scale(xzScale, yScale, xzScale);
    }

    @Override
    protected float getWhiteOverlayProgress(SkeletonCreeperEntity creeperEntity, float partialTick) {
        float fuse = creeperEntity.getSwelling(partialTick);
        return (int) (fuse * 10.0F) % 2 == 0 ? 0.0F : Mth.clamp(fuse, 0.5F, 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(SkeletonCreeperEntity entity) {
        return MAP.get(entity.getType());
    }
}
