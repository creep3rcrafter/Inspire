package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.SkeletonPiglinEntityModel;
import com.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.ArmorEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.util.Identifier;

import java.util.Map;

public class SkeletonPiglinEntityRenderer extends BipedEntityRenderer<SkeletonPiglinEntity, SkeletonPiglinEntityModel<SkeletonPiglinEntity>> {

    private static final Map<EntityType<?>, Identifier> MAP;

    static {
        MAP = Maps.newHashMap(ImmutableMap.of(InspireEntityTypes.SKELETON_PIGLIN.get(), new Identifier(InspireCommon.MOD_ID, "textures/entity/hostile/skeleton_piglin/skeleton_piglin.png")));
    }

    public SkeletonPiglinEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer mainLayer, EntityModelLayer innerArmorLayer, EntityModelLayer outerArmorLayer) {
        super(ctx, getSkeletonPiglinEntitynModel(ctx.getModelLoader(), mainLayer), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
        this.addFeature(new ArmorFeatureRenderer<>(this, new ArmorEntityModel<>(ctx.getPart(innerArmorLayer)), new ArmorEntityModel<>(ctx.getPart(outerArmorLayer)), ctx.getModelManager()));
    }

    private static SkeletonPiglinEntityModel<SkeletonPiglinEntity> getSkeletonPiglinEntitynModel(EntityModelLoader modelLoader, EntityModelLayer layer) {
        return new SkeletonPiglinEntityModel<>(modelLoader.getModelPart(layer));
    }


    protected boolean isShaking(AbstractSkeletonEntity abstractSkeletonEntity) {
        return abstractSkeletonEntity.isShaking();
    }

    @Override
    public Identifier getTexture(SkeletonPiglinEntity entity) {
        return (Identifier) MAP.get(entity.getType());
    }
}