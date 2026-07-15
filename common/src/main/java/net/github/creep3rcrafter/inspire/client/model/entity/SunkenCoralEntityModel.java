package net.github.creep3rcrafter.inspire.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.github.creep3rcrafter.inspire.entity.hostile.SunkenEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class SunkenCoralEntityModel<T extends SunkenEntity> extends HumanoidModel<T> {

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

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.getChild("head").addOrReplaceChild("coral_1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -10.0F, 2.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        modelPartData.getChild("head").addOrReplaceChild("coral_2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -15.0F, -3.999F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        modelPartData.getChild("body").addOrReplaceChild("coral_3", CubeListBuilder.create().texOffs(0, 13).addBox(2.0F, 12.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        modelPartData.getChild("body").addOrReplaceChild("coral_4", CubeListBuilder.create().texOffs(1, 13).addBox(-5.0F, 4.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        modelPartData.getChild("right_leg").addOrReplaceChild("coral_5", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 4.0F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        return LayerDefinition.create(modelData, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        coral1.render(matrices, vertices, light, overlay, color);
        coral2.render(matrices, vertices, light, overlay, color);
        coral3.render(matrices, vertices, light, overlay, color);
        coral4.render(matrices, vertices, light, overlay, color);
        coral5.render(matrices, vertices, light, overlay, color);
    }

    @Override
    public void setupAnim(T sheepEntity, float f, float g, float h, float i, float j) {
        super.setupAnim(sheepEntity, f, g, h, i, j);
        this.coral1.xRot = this.head.xRot;
        this.coral1.y = this.head.y;
        this.coral1.yRot = this.head.yRot;
        this.coral2.xRot = this.head.xRot;
        this.coral2.y = this.head.y;
        this.coral2.yRot = this.head.yRot;
        this.coral3.xRot = this.body.xRot;
        this.coral3.y = this.body.y;
        this.coral3.yRot = this.body.yRot;
        this.coral4.xRot = this.body.xRot;
        this.coral4.y = this.body.y;
        this.coral4.yRot = this.body.yRot;
        this.coral5.xRot = this.rightLeg.xRot;
        this.coral5.y = this.rightLeg.y;
        this.coral5.yRot = this.rightLeg.yRot;
    }
}
