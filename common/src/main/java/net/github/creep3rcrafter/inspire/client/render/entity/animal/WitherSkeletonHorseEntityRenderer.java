package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseEntityModel;
import com.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.util.Identifier;

import java.util.Map;

public class WitherSkeletonHorseEntityRenderer extends AbstractWitherSkeletonHorseEntityRenderer<AbstractHorseEntity, WitherSkeletonHorseEntityModel<AbstractHorseEntity>> {
    private static final Map<EntityType<?>, Identifier> MAP;

    static {
        MAP = Maps.newHashMap(ImmutableMap.of(InspireEntityTypes.WITHER_SKELETON_HORSE.get(), new Identifier(InspireCommon.MOD_ID, "textures/entity/animal/wither_skeleton_horse/horse_wither_skeleton.png")));
    }

    public WitherSkeletonHorseEntityRenderer(EntityRendererFactory.Context context, EntityModelLayer modelLayerLocation) {
        super(context, new WitherSkeletonHorseEntityModel<>(context.getPart(modelLayerLocation)), 1.15F);
    }

    @Override
    public Identifier getTexture(AbstractHorseEntity abstractHorseEntity) {
        return (Identifier) MAP.get(abstractHorseEntity.getType());
    }
}