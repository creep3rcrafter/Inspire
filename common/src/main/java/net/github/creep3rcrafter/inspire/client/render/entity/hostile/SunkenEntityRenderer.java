package net.github.creep3rcrafter.inspire.client.render.entity.hostile;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import com.github.creep3rcrafter.inspire.client.render.entity.feature.SunkenCoralEntityFeature;
import com.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.util.Identifier;

public class SunkenEntityRenderer extends BipedEntityRenderer<SunkenEntity, SkeletonEntityModel<SunkenEntity>> {
    private static final Identifier TEXTURE = new Identifier(InspireCommon.MOD_ID, "textures/entity/hostile/sunken/sunken_1.png");

    public SunkenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SkeletonEntityModel<>(context.getPart(InspireEntityRenderers.SUNKEN_MODEL_LAYER)), 0.5F);
        this.addFeature(new SunkenCoralEntityFeature(this, context.getModelLoader()));
    }

    @Override
    public Identifier getTexture(SunkenEntity entity) {
        return TEXTURE;
    }
}
