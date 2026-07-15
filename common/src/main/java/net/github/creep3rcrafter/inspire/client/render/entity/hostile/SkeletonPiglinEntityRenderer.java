package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.SkeletonPiglinEntityModel;
import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractSkeleton;

import java.util.Map;

public class SkeletonPiglinEntityRenderer extends MobRenderer<SkeletonPiglinEntity, SkeletonPiglinEntityModel<SkeletonPiglinEntity>> {
    private static final Map<EntityType<?>, ResourceLocation> MAP = Maps.newHashMap(
            ImmutableMap.of(
                    InspireEntityTypes.SKELETON_PIGLIN.get(),
                    ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/entity/hostile/skeleton_piglin/skeleton_piglin.png")
            )
    );

    public SkeletonPiglinEntityRenderer(EntityRendererProvider.Context context, net.minecraft.client.model.geom.ModelLayerLocation mainLayer, net.minecraft.client.model.geom.ModelLayerLocation innerArmorLayer, net.minecraft.client.model.geom.ModelLayerLocation outerArmorLayer) {
        super(context, new SkeletonPiglinEntityModel<>(context.bakeLayer(mainLayer)), 0.5F);
        this.addLayer(new HumanoidArmorLayer<>(this,
                new HumanoidModel<>(context.bakeLayer(innerArmorLayer)),
                new HumanoidModel<>(context.bakeLayer(outerArmorLayer)),
                context.getModelManager()));
    }

    @Override
    public ResourceLocation getTextureLocation(SkeletonPiglinEntity entity) {
        return MAP.get(entity.getType());
    }
}
