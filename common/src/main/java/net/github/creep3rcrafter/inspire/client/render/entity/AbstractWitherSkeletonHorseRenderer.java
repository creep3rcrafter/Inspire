package net.github.creep3rcrafter.inspire.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.github.creep3rcrafter.inspire.client.model.WitherSkeletonHorseModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.world.entity.animal.horse.AbstractHorse;

@Environment(EnvType.CLIENT)
public abstract class AbstractWitherSkeletonHorseRenderer<T extends AbstractHorse, M extends WitherSkeletonHorseModel<T>> extends MobRenderer<T, M> {
    private final float scale;

    public AbstractWitherSkeletonHorseRenderer(EntityRendererProvider.Context context, M horseModel, float f) {
        super(context, horseModel, 0.75F);
        this.scale = f;
    }

    protected void scale(T abstractHorse, PoseStack poseStack, float f) {
        poseStack.scale(this.scale, this.scale, this.scale);
        super.scale(abstractHorse, poseStack, f);
    }
}
