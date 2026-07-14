package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseEntityModel;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class WitherSkeletonHorseEntityRenderer extends AbstractWitherSkeletonHorseEntityRenderer<AbstractHorse, WitherSkeletonHorseEntityModel<AbstractHorse>> {
    private static final Map<EntityType<?>, ResourceLocation> MAP;

    static {
        MAP = Maps.newHashMap(ImmutableMap.of(InspireEntityTypes.WITHER_SKELETON_HORSE.get(), new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/animal/wither_skeleton_horse/horse_wither_skeleton.png")));
    }

    public WitherSkeletonHorseEntityRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new WitherSkeletonHorseEntityModel<>(context.bakeLayer(modelLayerLocation)), 1.15F);
    }

    @Override
    public ResourceLocation getTextureLocation(AbstractHorse abstractHorseEntity) {
        return MAP.get(abstractHorseEntity.getType());
    }
}