package net.github.creep3rcrafter.inspire.client.model.entity.fleep;

import com.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.QuadrupedEntityModel;

public class FleepFlowerEntityModel<T extends FleepEntity> extends QuadrupedEntityModel<T> {
    private float headAngle;

    public FleepFlowerEntityModel(ModelPart root) {
        super(root, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
    }


    public static void addFlowerBody(ModelData baseModelData) {
        ModelPartData modelPartData = baseModelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("flower_1", ModelPartBuilder.create(), ModelTransform.of(-3.0F, -5.0F, 4.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData3.addChild("flower_1_rotation1", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.NONE);
        modelPartData3.addChild("flower_1_rotation2", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
        ModelPartData modelPartData4 = modelPartData2.addChild("flower_2", ModelPartBuilder.create(), ModelTransform.of(3.0F, -5.0F, -3.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData4.addChild("flower_2_rotation1", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.NONE);
        modelPartData4.addChild("flower_2_rotation2", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
    }
    public static void addFlowerHead(ModelData baseModelData) {
        //MooshroomMushroomFeatureRenderer
        ModelPartData modelPartData = baseModelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, -8.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("flower_3", ModelPartBuilder.create(), ModelTransform.of(0.0F, -6.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData3.addChild("flower_3_rotation1", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -6.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.NONE);
        modelPartData3.addChild("flower_3_rotation2", ModelPartBuilder.create().uv(16,16).cuboid(-8.0F, -6.0F, 0.0F, 16.0F, 16.0F, 0.0F, new Dilation(0f)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        //modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, -8.0F));
        //modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 5.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        addFlowerHead(modelData);
        addFlowerBody(modelData);
        ModelPartBuilder modelPartBuilder = ModelPartBuilder.create();
        modelPartData.addChild("right_hind_leg", modelPartBuilder, ModelTransform.pivot(-3.0F, 12.0F, 7.0F));
        modelPartData.addChild("left_hind_leg", modelPartBuilder, ModelTransform.pivot(3.0F, 12.0F, 7.0F));
        modelPartData.addChild("right_front_leg", modelPartBuilder, ModelTransform.pivot(-3.0F, 12.0F, -5.0F));
        modelPartData.addChild("left_front_leg", modelPartBuilder, ModelTransform.pivot(3.0F, 12.0F, -5.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    public void animateModel(T sheepEntity, float f, float g, float h) {
        super.animateModel(sheepEntity, f, g, h);
        this.head.pivotY = 6.0F + sheepEntity.getNeckAngle(h) * 9.0F;
        this.headAngle = sheepEntity.getHeadAngle(h);
    }

    public void setAngles(T sheepEntity, float f, float g, float h, float i, float j) {
        super.setAngles(sheepEntity, f, g, h, i, j);
        this.head.pitch = this.headAngle;
    }
}
