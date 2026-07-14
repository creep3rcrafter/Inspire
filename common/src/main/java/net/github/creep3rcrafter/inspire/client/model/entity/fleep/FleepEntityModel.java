package net.github.creep3rcrafter.inspire.client.model.entity.fleep;

import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class FleepEntityModel <T extends FleepEntity> extends QuadrupedModel<T> {
    private float headPitchModifier;

    public FleepEntityModel(ModelPart root) {
        super(root, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = QuadrupedModel.createBodyMesh(12, CubeDeformation.NONE);
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), PartPose.offset(0.0F, 6.0F, -8.0F));
        modelPartData.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 8).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        return LayerDefinition.create(modelData, 64, 32);
    }

    public void prepareMobModel(T sheepEntity, float f, float g, float h) {
        super.prepareMobModel(sheepEntity, f, g, h);
        this.head.y = 6.0F + sheepEntity.getNeckAngle(h) * 9.0F;
        this.headPitchModifier = sheepEntity.getHeadAngle(h);
    }

    public void setupAnim(T sheepEntity, float f, float g, float h, float i, float j) {
        super.setupAnim(sheepEntity, f, g, h, i, j);
        this.head.xRot = this.headPitchModifier;
    }
    public ModelPart getHead() {
        return this.head;
    }
}
