package net.github.creep3rcrafter.inspire.client.model.entity;

import com.github.creep3rcrafter.inspire.entity.hostile.SkeletonPiglinEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.CrossbowPosing;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.mob.MobEntity;

public class SkeletonPiglinEntityModel<T extends MobEntity> extends PlayerEntityModel<T> {
    private final ModelTransform bodyRotation;
    private final ModelTransform headRotation;
    private final ModelTransform leftArmRotation;
    private final ModelTransform rightArmRotation;

    public SkeletonPiglinEntityModel(ModelPart root) {
        super(root, false);
        this.bodyRotation = this.body.getTransform();
        this.headRotation = this.head.getTransform();
        this.leftArmRotation = this.leftArm.getTransform();
        this.rightArmRotation = this.rightArm.getTransform();
    }

    public static ModelData getModelData(Dilation dilation) {
        ModelData modelData = SkeletonPiglinEntityModel.getTexturedModelData(dilation);
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation), ModelTransform.NONE);
        SkeletonPiglinEntityModel.addHead(dilation, modelData);
        modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.NONE);
        modelPartData.getChild("");
        return modelData;
    }

    public static void addHead(Dilation dilation, ModelData baseModelData) {
        ModelPartData modelPartData = baseModelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, dilation).uv(31, 1).cuboid(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, dilation).uv(2, 4).cuboid(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, dilation).uv(2, 0).cuboid(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, dilation), ModelTransform.NONE);
    }

    public static ModelData getTexturedModelData(Dilation dilation) {
        ModelData modelData = BipedEntityModel.getModelData(dilation, 0.0F);
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("ear", ModelPartBuilder.create().uv(24, 0).cuboid(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, dilation), ModelTransform.NONE);
        modelPartData.addChild("cloak", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, dilation, 1.0F, 0.5F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        float f = 0.25F;
        modelPartData.addChild("left_arm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, 2.0F, 0.0F));
        modelPartData.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));
        modelPartData.addChild("left_sleeve", ModelPartBuilder.create().uv(48, 48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.add(0.25F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));
        modelPartData.addChild("right_sleeve", ModelPartBuilder.create().uv(40, 32).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.add(0.25F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));
        modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.1F));
        modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, 12.0F, 0.1F));
        modelPartData.addChild("left_pants", ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.add(0.25F)), ModelTransform.pivot(1.9F, 12.0F, 0.0F));
        modelPartData.addChild("right_pants", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, dilation.add(0.25F)), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));
        modelPartData.addChild("jacket", ModelPartBuilder.create().uv(16, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation.add(0.25F)), ModelTransform.NONE);
        return modelData;
    }

    public void setAngles(T mobEntity, float f, float g, float h, float i, float j) {
        this.body.setTransform(this.bodyRotation);
        this.head.setTransform(this.headRotation);
        this.leftArm.setTransform(this.leftArmRotation);
        this.rightArm.setTransform(this.rightArmRotation);
        super.setAngles(mobEntity, f, g, h, i, j);
        float k = ((float) Math.PI / 6F);
        float l = h * 0.1F + f * 0.5F;
        float m = 0.08F + g * 0.4F;
        if (mobEntity instanceof SkeletonPiglinEntity skeletonPiglinEntity) {
            if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.ATTACKING && this.handSwingProgress == 0.0F) {
                this.rotateMainArm(mobEntity);
            } else if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.CROSSBOW_HOLD) {
                CrossbowPosing.hold(this.rightArm, this.leftArm, this.head, !mobEntity.isLeftHanded());
            } else if (skeletonPiglinEntity.getState() == SkeletonPiglinEntity.State.CROSSBOW_CHARGE) {
                CrossbowPosing.charge(this.rightArm, this.leftArm, mobEntity, !mobEntity.isLeftHanded());
            }
        }

        this.leftPants.copyTransform(this.leftLeg);
        this.rightPants.copyTransform(this.rightLeg);
        this.leftSleeve.copyTransform(this.leftArm);
        this.rightSleeve.copyTransform(this.rightArm);
        this.jacket.copyTransform(this.body);
        this.hat.copyTransform(this.head);
    }

    protected void animateArms(T mobEntity, float f) {
        if (this.handSwingProgress > 0.0F && mobEntity instanceof SkeletonPiglinEntity && ((SkeletonPiglinEntity) mobEntity).getState() == SkeletonPiglinEntity.State.ATTACKING) {
            CrossbowPosing.meleeAttack(this.rightArm, this.leftArm, mobEntity, this.handSwingProgress, f);
        } else {
            super.animateArms(mobEntity, f);
        }
    }

    private void rotateMainArm(T entity) {
        if (entity.isLeftHanded()) {
            this.leftArm.pitch = -1.8F;
        } else {
            this.rightArm.pitch = -1.8F;
        }

    }
}