package net.github.creep3rcrafter.inspire.client.render.entity.animal;

import com.github.creep3rcrafter.inspire.InspireCommon;
import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import com.github.creep3rcrafter.inspire.client.register.InspireEntityRenderers;
import com.github.creep3rcrafter.inspire.client.render.entity.feature.FleepFlowerFeatureRenderer;
import com.github.creep3rcrafter.inspire.client.render.entity.feature.FleepWoolFeatureRenderer;
import com.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FleepEntityRenderer extends MobEntityRenderer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private static final Identifier TEXTURE = new Identifier(InspireCommon.MOD_ID, "textures/entity/animal/fleep/fleep.png");

    public FleepEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new FleepEntityModel<>(context.getPart(InspireEntityRenderers.FLEEP_MODEL_LAYER)), 0.7F);
        this.addFeature(new FleepWoolFeatureRenderer(this, context.getModelLoader()));
        this.addFeature(new FleepFlowerFeatureRenderer(this, context.getBlockRenderManager()));
    }

    @Override
    public Identifier getTexture(FleepEntity entity) {
        return TEXTURE;
    }
}
