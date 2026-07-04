package net.github.creep3rcrafter.inspire.client.model.entity;

import com.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SunkenCoralEntityModel<T extends SunkenEntity> extends BipedEntityModel<T> {

    private final ModelPart coral1;
    private final ModelPart coral2;
    private final ModelPart coral3;
    private final ModelPart coral4;
    private final ModelPart coral5;

    public SunkenCoralEntityModel(ModelPart root) {
        super(root);
        this.coral1 = root.getChild("head").getChild("coral_1");
        this.coral2 = root.getChild("head").getChild("coral_2");
        this.coral3 = root.getChild("body").getChild("coral_3");
        this.coral4 = root.getChild("body").getChild("coral_4");
        this.coral5 = root.getChild("right_leg").getChild("coral_5");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0.0F);
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.getChild("head").addChild("coral_1", ModelPartBuilder.create().uv(0, 8).cuboid(-1.0F, -10.0F, 2.0F, 6.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.NONE);
        modelPartData.getChild("head").addChild("coral_2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -15.0F, -3.999F, 9.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);
        modelPartData.getChild("body").addChild("coral_3", ModelPartBuilder.create().uv(0, 13).cuboid(2.0F, 12.0F, -2.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);
        modelPartData.getChild("body").addChild("coral_4", ModelPartBuilder.create().uv(1, 13).cuboid(-5.0F, 4.0F, -2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);
        modelPartData.getChild("right_leg").addChild("coral_5", ModelPartBuilder.create().uv(0, 15).cuboid(-2.0F, 4.0F, -2.0F, 2.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        coral1.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        coral2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        coral3.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        coral4.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        coral5.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

    @Override
    public void setAngles(T sheepEntity, float f, float g, float h, float i, float j) {
        super.setAngles(sheepEntity, f, g, h, i, j);
        this.coral1.pitch = this.head.pitch;
        this.coral1.pivotY = this.head.pivotY;
        this.coral1.yaw = this.head.yaw;
        this.coral2.pitch = this.head.pitch;
        this.coral2.pivotY = this.head.pivotY;
        this.coral2.yaw = this.head.yaw;
        this.coral3.pitch = this.body.pitch;
        this.coral3.pivotY = this.body.pivotY;
        this.coral3.yaw = this.body.yaw;
        this.coral4.pitch = this.body.pitch;
        this.coral4.pivotY = this.body.pivotY;
        this.coral4.yaw = this.body.yaw;
        this.coral5.pitch = this.rightLeg.pitch;
        this.coral5.pivotY = this.rightLeg.pivotY;
        this.coral5.yaw = this.rightLeg.yaw;
    }
}
