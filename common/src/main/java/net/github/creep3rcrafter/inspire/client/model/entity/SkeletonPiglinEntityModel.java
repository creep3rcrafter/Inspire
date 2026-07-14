package net.github.creep3rcrafter.inspire.client.model.entity;

import net.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import net.minecraft.client.model.AnimationUtils;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Mob;

public class SkeletonPiglinEntityModel<T extends Mob> extends PlayerModel<T> {
    private final PartPose bodyRotation;
    private final PartPose headRotation;
    private final PartPose leftArmRotation;
    private final PartPose rightArmRotation;

    public SkeletonPiglinEntityModel(ModelPart root) {
        super(root, false);
        this.bodyRotation = this.body.storePose();
        this.headRotation = this.head.storePose();
        this.leftArmRotation = this.leftArm.storePose();
        this.rightArmRotation = this.rightArm.storePose();
    }

    public static MeshDefinition getModelData(CubeDeformation dilation) {
        MeshDefinition modelData = SkeletonPiglinEntityModel.getTexturedModelData(dilation);
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation), PartPose.ZERO);
        SkeletonPiglinEntityModel.addHead(dilation, modelData);
        modelPartData.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        return modelData;
    }

    public static void addHead(CubeDeformation dilation, MeshDefinition baseModelData) {
        PartDefinition modelPartData = baseModelData.getRoot();
        modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, dilation).texOffs(31, 1).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, dilation).texOffs(2, 4).addBox(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, dilation).texOffs(2, 0).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, dilation), PartPose.ZERO);
    }

    public static MeshDefinition getTexturedModelData(CubeDeformation dilation) {
        MeshDefinition modelData = HumanoidModel.createMesh(dilation, 0.0F);
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("ear", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, dilation), PartPose.ZERO);
        modelPartData.addOrReplaceChild("cloak", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, dilation.extend(1.0F, 0.5F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        float f = 0.25F;
        modelPartData.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("left_sleeve", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.extend(0.25F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("right_sleeve", CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.extend(0.25F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
        modelPartData.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.1F));
        modelPartData.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.1F));
        modelPartData.addOrReplaceChild("left_pants", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.extend(0.25F)), PartPose.offset(1.9F, 12.0F, 0.0F));
        modelPartData.addOrReplaceChild("right_pants", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.extend(0.25F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
        modelPartData.addOrReplaceChild("jacket", CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation.extend(0.25F)), PartPose.ZERO);
        return modelData;
    }

    public void setupAnim(T mobEntity, float f, float g, float h, float i, float j) {
        this.body.loadPose(this.bodyRotation);
        this.head.loadPose(this.headRotation);
        this.leftArm.loadPose(this.leftArmRotation);
        this.rightArm.loadPose(this.rightArmRotation);
        super.setupAnim(mobEntity, f, g, h, i, j);
        float k = ((float) Math.PI / 6F);
        float l = h * 0.1F + f * 0.5F;
        float m = 0.08F + g * 0.4F;
        if (mobEntity instanceof SkeletonPiglinEntity skeletonPiglinEntity) {
            if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.ATTACKING && this.attackTime == 0.0F) {
                this.rotateMainArm(mobEntity);
            } else if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.CROSSBOW_HOLD) {
                AnimationUtils.animateCrossbowHold(this.rightArm, this.leftArm, this.head, mobEntity.getMainArm() == HumanoidArm.LEFT);
            } else if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.CROSSBOW_CHARGE) {
                AnimationUtils.animateCrossbowCharge(this.rightArm, this.leftArm, mobEntity, mobEntity.getMainArm() == HumanoidArm.LEFT);
            }
        }

        this.leftPants.copyFrom(this.leftLeg);
        this.rightPants.copyFrom(this.rightLeg);
        this.leftSleeve.copyFrom(this.leftArm);
        this.rightSleeve.copyFrom(this.rightArm);
        this.jacket.copyFrom(this.body);
        this.hat.copyFrom(this.head);
    }

    protected void setupAttackAnimation(T mobEntity, float f) {
        if (this.attackTime > 0.0F && mobEntity instanceof SkeletonPiglinEntity && ((SkeletonPiglinEntity) mobEntity).getState() == SkeletonPiglinEntity.State.ATTACKING) {
            AnimationUtils.swingWeaponDown(this.rightArm, this.leftArm, mobEntity, this.attackTime, f);
        } else {
            super.setupAttackAnimation(mobEntity, f);
        }
    }

    private void rotateMainArm(T entity) {
        if (entity.getMainArm() == HumanoidArm.LEFT) {
            this.leftArm.xRot = -1.8F;
        } else {
            this.rightArm.xRot = -1.8F;
        }

    }
}