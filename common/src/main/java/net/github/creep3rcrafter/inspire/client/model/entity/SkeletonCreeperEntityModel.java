package net.github.creep3rcrafter.inspire.client.model.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class SkeletonCreeperEntityModel<T extends Entity> extends SinglePartEntityModel<T> {
    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart leftHindLeg;
    private final ModelPart rightHindLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart rightFrontLeg;

    public SkeletonCreeperEntityModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild("head");
        this.rightHindLeg = root.getChild("right_hind_leg");
        this.leftHindLeg = root.getChild("left_hind_leg");
        this.rightFrontLeg = root.getChild("right_front_leg");
        this.leftFrontLeg = root.getChild("left_front_leg");
    }
    public static void addBody(Dilation dilation, ModelData baseModelData) {
        ModelPartData modelPartData = baseModelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
        modelPartData2.addChild("tnt", ModelPartBuilder.create().uv(0, 26).cuboid(-1.5F, 6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.NONE);
        modelPartData2.addChild("fuse", ModelPartBuilder.create().uv(60, 22).cuboid(-0.5F, -4.0F, 0.0F, 2.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);
    }
    public static TexturedModelData getTexturedModelData(Dilation dilation) {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, dilation), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
        addBody(dilation, modelData);

        /*
        modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation)
                .uv(0, 26).cuboid(-1.5F, 6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(60, 22).cuboid(-0.5F, -4.0F, 0.0F, 2.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);

        //CreeperEntityRenderer
         */
        //ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation);
        //ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation);
        modelPartData.addChild("right_hind_leg", ModelPartBuilder.create().uv(32, 6).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), ModelTransform.pivot(-2.0F, 18.0F, 4.0F));
        modelPartData.addChild("left_hind_leg", ModelPartBuilder.create().uv(48, 6).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), ModelTransform.pivot(2.0F, 18.0F, 4.0F));
        modelPartData.addChild("right_front_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), ModelTransform.pivot(-2.0F, 18.0F, -4.0F));
        modelPartData.addChild("left_front_leg", ModelPartBuilder.create().uv(40, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), ModelTransform.pivot(2.0F, 18.0F, -4.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    public ModelPart getPart() {
        return this.root;
    }

    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.yaw = headYaw * ((float)Math.PI / 180F);
        this.head.pitch = headPitch * ((float)Math.PI / 180F);
        this.leftHindLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightHindLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.leftFrontLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.rightFrontLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
    }
}
