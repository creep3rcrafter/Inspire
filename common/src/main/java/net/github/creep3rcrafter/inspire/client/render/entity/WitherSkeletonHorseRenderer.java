package net.github.creep3rcrafter.inspire.client.render.entity;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseModel;
import net.github.creep3rcrafter.inspire.register.InspireEntityTypes;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class WitherSkeletonHorseRenderer extends AbstractWitherSkeletonHorseRenderer<AbstractHorse, WitherSkeletonHorseModel<AbstractHorse>> {
    private static final Map<EntityType<?>, ResourceLocation> MAP;

    static {
        MAP = Maps.newHashMap(ImmutableMap.of(InspireEntityTypes.WITHER_SKELETON_HORSE.get(), new ResourceLocation(InspireCommon.MOD_ID, "textures/entity/horse/horse_wither_skeleton.png")));
    }

    public WitherSkeletonHorseRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new WitherSkeletonHorseModel<>(context.bakeLayer(modelLayerLocation)), 1.15F);
    }

    public @NotNull ResourceLocation getTextureLocation(AbstractHorse abstractHorse) {
        return (ResourceLocation) MAP.get(abstractHorse.getType());
    }
}