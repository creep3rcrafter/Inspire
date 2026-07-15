package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.world.entity.animal.horse.AbstractHorse;

@Environment(EnvType.CLIENT)
public abstract class AbstractWitherSkeletonHorseEntityRenderer<T extends AbstractHorse, M extends WitherSkeletonHorseEntityModel<T>> extends MobRenderer<T, M> {
    private final float scale;

    public AbstractWitherSkeletonHorseEntityRenderer(EntityRendererProvider.Context context, M horseModel, float f) {
        super(context, horseModel, 0.75F);
        this.scale = f;
    }

    @Override
    protected void scale(T abstractHorse, PoseStack matrixStack, float f) {
        matrixStack.scale(this.scale, this.scale, this.scale);
        super.scale(abstractHorse, matrixStack, f);
    }
}
