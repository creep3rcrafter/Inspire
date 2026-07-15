package net.github.creep3rcrafter.inspire.client.model.entity.fleep;

import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FleepFlowerEntityModel<T extends FleepEntity> extends QuadrupedModel<T> {
    private float headAngle;

    public FleepFlowerEntityModel(ModelPart root) {
        super(root, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
    }


    public static void addFlowerBody(MeshDefinition baseModelData) {
        PartDefinition modelPartData = baseModelData.getRoot();
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F));
        PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("flower_1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -5.0F, 4.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData3.addOrReplaceChild("flower_1_rotation1", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.ZERO);
        modelPartData3.addOrReplaceChild("flower_1_rotation2", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
        PartDefinition modelPartData4 = modelPartData2.addOrReplaceChild("flower_2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData4.addOrReplaceChild("flower_2_rotation1", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.ZERO);
        modelPartData4.addOrReplaceChild("flower_2_rotation2", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -3.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
    }
    public static void addFlowerHead(MeshDefinition baseModelData) {
        //MooshroomMushroomFeatureRenderer
        PartDefinition modelPartData = baseModelData.getRoot();
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, -8.0F));
        PartDefinition modelPartData3 = modelPartData2.addOrReplaceChild("flower_3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
        modelPartData3.addOrReplaceChild("flower_3_rotation1", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -6.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.ZERO);
        modelPartData3.addOrReplaceChild("flower_3_rotation2", CubeListBuilder.create().texOffs(16,16).addBox(-8.0F, -6.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0f)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
    }
    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        //modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, -8.0F));
        //modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 5.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        addFlowerHead(modelData);
        addFlowerBody(modelData);
        CubeListBuilder modelPartBuilder = CubeListBuilder.create();
        modelPartData.addOrReplaceChild("right_hind_leg", modelPartBuilder, PartPose.offset(-3.0F, 12.0F, 7.0F));
        modelPartData.addOrReplaceChild("left_hind_leg", modelPartBuilder, PartPose.offset(3.0F, 12.0F, 7.0F));
        modelPartData.addOrReplaceChild("right_front_leg", modelPartBuilder, PartPose.offset(-3.0F, 12.0F, -5.0F));
        modelPartData.addOrReplaceChild("left_front_leg", modelPartBuilder, PartPose.offset(3.0F, 12.0F, -5.0F));
        return LayerDefinition.create(modelData, 64, 32);
    }

    public void prepareMobModel(T sheepEntity, float f, float g, float h) {
        super.prepareMobModel(sheepEntity, f, g, h);
        this.head.y = 6.0F + sheepEntity.getHeadEatPositionScale(h) * 9.0F;
        this.headAngle = sheepEntity.getHeadEatAngleScale(h);
    }

    public void setupAnim(T sheepEntity, float f, float g, float h, float i, float j) {
        super.setupAnim(sheepEntity, f, g, h, i, j);
        this.head.xRot = this.headAngle;
    }
}
