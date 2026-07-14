package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import com.github.creep3rcrafter.inspire.client.model.entity.WitherSkeletonHorseEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.AbstractHorseEntity;

@Environment(EnvType.CLIENT)
public abstract class AbstractWitherSkeletonHorseEntityRenderer<T extends AbstractHorseEntity, M extends WitherSkeletonHorseEntityModel<T>> extends MobEntityRenderer<T, M> {
    private final float scale;

    public AbstractWitherSkeletonHorseEntityRenderer(EntityRendererFactory.Context context, M horseModel, float f) {
        super(context, horseModel, 0.75F);
        this.scale = f;
    }

    @Override
    protected void scale(T abstractHorse, MatrixStack matrixStack, float f) {
        matrixStack.scale(this.scale, this.scale, this.scale);
        super.scale(abstractHorse, matrixStack, f);
    }
}
