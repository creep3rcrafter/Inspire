package net.github.creep3rcrafter.inspire.client.model.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.util.math.MathHelper;

public class WitherSkeletonHorseEntityModel<T extends AbstractHorseEntity> extends AnimalModel<T> {
    protected final ModelPart body;
    protected final ModelPart headParts1;
    protected final ModelPart headParts2;
    private final ModelPart rightHindLeg;
    private final ModelPart leftHindLeg;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart rightHindBabyLeg;
    private final ModelPart leftHindBabyLeg;
    private final ModelPart rightFrontBabyLeg;
    private final ModelPart leftFrontBabyLeg;
    private final ModelPart tail;
    private final ModelPart[] saddleParts;
    private final ModelPart[] ridingParts;

    public WitherSkeletonHorseEntityModel(ModelPart modelPart) {
        super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
        this.body = modelPart.getChild("body");
        this.headParts1 = modelPart.getChild("head_parts1");
        this.headParts2 = modelPart.getChild("head_parts2");
        this.rightHindLeg = modelPart.getChild("right_hind_leg");
        this.leftHindLeg = modelPart.getChild("left_hind_leg");
        this.rightFrontLeg = modelPart.getChild("right_front_leg");
        this.leftFrontLeg = modelPart.getChild("left_front_leg");
        this.rightHindBabyLeg = modelPart.getChild("right_hind_baby_leg");
        this.leftHindBabyLeg = modelPart.getChild("left_hind_baby_leg");
        this.rightFrontBabyLeg = modelPart.getChild("right_front_baby_leg");
        this.leftFrontBabyLeg = modelPart.getChild("left_front_baby_leg");
        this.tail = this.body.getChild("tail");
        ModelPart modelPart2 = this.body.getChild("saddle");
        ModelPart modelPart3 = this.headParts1.getChild("left_saddle_mouth1");
        ModelPart modelPart4 = this.headParts1.getChild("right_saddle_mouth1");
        ModelPart modelPart5 = this.headParts1.getChild("left_saddle_line1");
        //ModelPart modelPart6 = this.headParts1.getChild("right_saddle_line1");
        ModelPart modelPart7 = this.headParts1.getChild("head_saddle1");
        ModelPart modelPart8 = this.headParts1.getChild("mouth_saddle_wrap1");

        ModelPart modelPart9 = this.headParts2.getChild("left_saddle_mouth2");
        ModelPart modelPart10 = this.headParts2.getChild("right_saddle_mouth2");
        //ModelPart modelPart11 = this.headParts2.getChild("left_saddle_line2");
        ModelPart modelPart12 = this.headParts2.getChild("right_saddle_line2");
        ModelPart modelPart13 = this.headParts2.getChild("head_saddle2");
        ModelPart modelPart14 = this.headParts2.getChild("mouth_saddle_wrap2");
        this.saddleParts = new ModelPart[]{modelPart2, modelPart3, modelPart4, modelPart7, modelPart8, modelPart9, modelPart10, modelPart13, modelPart14};
        this.ridingParts = new ModelPart[]{modelPart5, modelPart12};
    }

    public static ModelData getModelData(Dilation dilation) {
        ModelData modelData = new ModelData();
        ModelPartData partDataRoot = modelData.getRoot();
        ModelPartData partDataBody = partDataRoot.addChild("body", ModelPartBuilder.create().uv(0, 32).cuboid(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new Dilation(0.05F)), ModelTransform.pivot(0.0F, 11.0F, 5.0F));
        ModelPartData partDataHeadParts1 = partDataRoot.addChild("head_parts1", ModelPartBuilder.create().uv(0, 35).cuboid(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), ModelTransform.of(0.0F, 4.0F, -12.0F, 0.5235988F, 0.0F, 0.0F));
        ModelPartData partDataHeadParts2 = partDataRoot.addChild("head_parts2", ModelPartBuilder.create().uv(0, 35).cuboid(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), ModelTransform.of(0.0F, 4.0F, -12.0F, 0.5235988F, 0.0F, 0.0F));
        ModelPartData partDataHead1 = partDataHeadParts1.addChild("head1", ModelPartBuilder.create().uv(0, 13).cuboid(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, dilation), ModelTransform.NONE);
        ModelPartData partDataHead2 = partDataHeadParts2.addChild("head2", ModelPartBuilder.create().uv(0, 13).cuboid(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, dilation), ModelTransform.NONE);
        partDataHeadParts1.addChild("mane1", ModelPartBuilder.create().uv(56, 36).cuboid(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, dilation), ModelTransform.NONE);
        partDataHeadParts1.addChild("upper_mouth2", ModelPartBuilder.create().uv(0, 25).cuboid(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, dilation), ModelTransform.NONE);
        partDataRoot.addChild("left_hind_leg", ModelPartBuilder.create().uv(48, 21).mirrored().cuboid(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, dilation), ModelTransform.pivot(4.0F, 14.0F, 7.0F));
        partDataRoot.addChild("right_hind_leg", ModelPartBuilder.create().uv(48, 21).cuboid(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, dilation), ModelTransform.pivot(-4.0F, 14.0F, 7.0F));
        partDataRoot.addChild("left_front_leg", ModelPartBuilder.create().uv(48, 21).mirrored().cuboid(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, dilation), ModelTransform.pivot(4.0F, 14.0F, -12.0F));
        partDataRoot.addChild("right_front_leg", ModelPartBuilder.create().uv(48, 21).cuboid(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, dilation), ModelTransform.pivot(-4.0F, 14.0F, -12.0F));
        Dilation dilation2 = dilation.add(0.0F, 5.5F, 0.0F);
        partDataRoot.addChild("left_hind_baby_leg", ModelPartBuilder.create().uv(48, 21).mirrored().cuboid(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, dilation2), ModelTransform.pivot(4.0F, 14.0F, 7.0F));
        partDataRoot.addChild("right_hind_baby_leg", ModelPartBuilder.create().uv(48, 21).cuboid(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, dilation2), ModelTransform.pivot(-4.0F, 14.0F, 7.0F));
        partDataRoot.addChild("left_front_baby_leg", ModelPartBuilder.create().uv(48, 21).mirrored().cuboid(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, dilation2), ModelTransform.pivot(4.0F, 14.0F, -12.0F));
        partDataRoot.addChild("right_front_baby_leg", ModelPartBuilder.create().uv(48, 21).cuboid(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, dilation2), ModelTransform.pivot(-4.0F, 14.0F, -12.0F));
        partDataBody.addChild("tail", ModelPartBuilder.create().uv(42, 36).cuboid(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, dilation), ModelTransform.of(0.0F, -5.0F, 2.0F, 0.5235988F, 0.0F, 0.0F));
        partDataBody.addChild("saddle", ModelPartBuilder.create().uv(26, 0).cuboid(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new Dilation(0.5F)), ModelTransform.NONE);
        partDataHeadParts1.addChild("left_saddle_mouth1", ModelPartBuilder.create().uv(29, 5).cuboid(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, dilation), ModelTransform.NONE);
        partDataHeadParts1.addChild("right_saddle_mouth1", ModelPartBuilder.create().uv(29, 5).cuboid(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, dilation), ModelTransform.NONE);
        partDataHeadParts1.addChild("left_saddle_line1", ModelPartBuilder.create().uv(32, 2).cuboid(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, dilation), ModelTransform.rotation(-0.5235988F, 0.0F, 0.0F));
        //partDataHeadParts1.addChild("right_saddle_line1", ModelPartBuilder.create().uv(32, 2).cuboid(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, dilation), ModelTransform.rotation(-0.5235988F, 0.0F, 0.0F));
        partDataHeadParts1.addChild("head_saddle1", ModelPartBuilder.create().uv(1, 1).cuboid(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new Dilation(0.2F)), ModelTransform.NONE);
        partDataHeadParts1.addChild("mouth_saddle_wrap1", ModelPartBuilder.create().uv(19, 0).cuboid(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new Dilation(0.2F)), ModelTransform.NONE);
        partDataHead1.addChild("left_ear1", ModelPartBuilder.create().uv(19, 16).cuboid(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.NONE);
        partDataHead1.addChild("right_ear1", ModelPartBuilder.create().uv(19, 16).cuboid(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.NONE);

        partDataHeadParts2.addChild("mane2", ModelPartBuilder.create().uv(56, 36).cuboid(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, dilation), ModelTransform.NONE);
        partDataHeadParts2.addChild("upper_mouth2", ModelPartBuilder.create().uv(0, 25).cuboid(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, dilation), ModelTransform.NONE);
        partDataHeadParts2.addChild("left_saddle_mouth2", ModelPartBuilder.create().uv(29, 5).cuboid(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, dilation), ModelTransform.NONE);
        partDataHeadParts2.addChild("right_saddle_mouth2", ModelPartBuilder.create().uv(29, 5).cuboid(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, dilation), ModelTransform.NONE);
        //partDataHeadParts2.addChild("left_saddle_line2", ModelPartBuilder.create().uv(32, 2).cuboid(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, dilation), ModelTransform.rotation(-0.5235988F, 0.0F, 0.0F));
        partDataHeadParts2.addChild("right_saddle_line2", ModelPartBuilder.create().uv(32, 2).cuboid(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, dilation), ModelTransform.rotation(-0.5235988F, 0.0F, 0.0F));
        partDataHeadParts2.addChild("head_saddle2", ModelPartBuilder.create().uv(1, 1).cuboid(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new Dilation(0.2F)), ModelTransform.NONE);
        partDataHeadParts2.addChild("mouth_saddle_wrap2", ModelPartBuilder.create().uv(19, 0).cuboid(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new Dilation(0.2F)), ModelTransform.NONE);
        partDataHead2.addChild("left_ear2", ModelPartBuilder.create().uv(19, 16).cuboid(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.NONE);
        partDataHead2.addChild("right_ear2", ModelPartBuilder.create().uv(19, 16).cuboid(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new Dilation(-0.001F)), ModelTransform.NONE);
        return modelData;
    }

    public void setAngles(T abstractHorseEntity, float f, float g, float h, float i, float j) {
        boolean bl = abstractHorseEntity.isSaddled();
        boolean bl2 = abstractHorseEntity.hasPassengers();
        ModelPart[] var9 = this.saddleParts;
        int var10 = var9.length;

        int var11;
        ModelPart modelPart;
        for (var11 = 0; var11 < var10; ++var11) {
            modelPart = var9[var11];
            modelPart.visible = bl;
        }

        var9 = this.ridingParts;
        var10 = var9.length;

        for (var11 = 0; var11 < var10; ++var11) {
            modelPart = var9[var11];
            modelPart.visible = bl2 && bl;
        }

        this.body.pivotY = 11.0F;
    }

    public Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.headParts1, this.headParts2);
    }

    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(this.body, this.rightHindLeg, this.leftHindLeg, this.rightFrontLeg, this.leftFrontLeg, this.rightHindBabyLeg, this.leftHindBabyLeg, this.rightFrontBabyLeg, this.leftFrontBabyLeg);
    }

    public void animateModel(T abstractHorseEntity, float f, float g, float h) {
        super.animateModel(abstractHorseEntity, f, g, h);
        float i = MathHelper.lerpAngleDegrees(abstractHorseEntity.prevBodyYaw, abstractHorseEntity.bodyYaw, h);
        float j = MathHelper.lerpAngleDegrees(abstractHorseEntity.prevBodyYaw, abstractHorseEntity.headYaw, h);
        float k = MathHelper.lerp(h, abstractHorseEntity.prevPitch, abstractHorseEntity.getPitch());
        float l = j - i;
        float m = k * 0.017453292F;
        if (l > 20.0F) {
            l = 20.0F;
        }

        if (l < -20.0F) {
            l = -20.0F;
        }

        if (g > 0.2F) {
            m += MathHelper.cos(f * 0.4F) * 0.15F * g;
        }

        float n = abstractHorseEntity.getEatingGrassAnimationProgress(h);
        float o = abstractHorseEntity.getAngryAnimationProgress(h);
        float p = 1.0F - o;
        float q = abstractHorseEntity.getEatingAnimationProgress(h);
        boolean bl = abstractHorseEntity.tailWagTicks != 0;
        float r = (float) abstractHorseEntity.age + h;

        this.headParts1.pivotY = 4.0F;
        this.headParts1.pivotX = 3.5f;
        this.headParts1.pivotZ = -12.0F;
        this.headParts1.pitch = 0.5235988F + m;
        this.headParts1.yaw = l * 0.017453292F + -0.15f;

        this.headParts2.pivotY = 4.0F;
        this.headParts2.pivotX = -3.5f;
        this.headParts2.pivotZ = -12.0F;
        this.headParts2.pitch = 0.5235988F + m;
        this.headParts2.yaw = l * 0.017453292F + 0.15f;


        this.body.pitch = 0.0F;
        float s = abstractHorseEntity.isTouchingWater() ? 0.2F : 1.0F;
        float t = MathHelper.cos(s * f * 0.6662F + 3.1415927F);
        float u = t * 0.8F * g;
        float v1 = (1.0F - Math.max(o, n)) * (0.5235988F + m + q * MathHelper.sin(r) * 0.05F);

        this.headParts1.pitch = (o * (0.2617994F + m) + n * (2.1816616F + MathHelper.sin(r) * 0.05F) + v1) + MathHelper.sin(r * 0.05f) * 0.1f;
        this.headParts1.yaw = o * l * 0.017453292F + (1.0F - Math.max(o, n)) * this.headParts1.yaw;
        this.headParts1.pivotY = o * -4.0F + n * 11.0F + (1.0F - Math.max(o, n)) * this.headParts1.pivotY;
        this.headParts1.pivotZ = o * -4.0F + n * -12.0F + (1.0F - Math.max(o, n)) * this.headParts1.pivotZ;

        this.headParts2.pitch = (o * (0.2617994F + m) + n * (2.1816616F + MathHelper.sin(r) * 0.05F) + v1) + MathHelper.sin((r * 0.05f) + MathHelper.PI) * 0.1f;
        this.headParts2.yaw = o * l * 0.017453292F + (1.0F - Math.max(o, n)) * this.headParts2.yaw;
        this.headParts2.pivotY = o * -4.0F + n * 11.0F + (1.0F - Math.max(o, n)) * this.headParts2.pivotY;
        this.headParts2.pivotZ = o * -4.0F + n * -12.0F + (1.0F - Math.max(o, n)) * this.headParts2.pivotZ;

        this.body.pitch = o * -0.7853982F + p * this.body.pitch;
        float w = 0.2617994F * o;
        float x = MathHelper.cos(r * 0.6F + 3.1415927F);
        this.leftFrontLeg.pivotY = 2.0F * o + 14.0F * p;
        this.leftFrontLeg.pivotZ = -6.0F * o - 10.0F * p;
        this.rightFrontLeg.pivotY = this.leftFrontLeg.pivotY;
        this.rightFrontLeg.pivotZ = this.leftFrontLeg.pivotZ;
        float y = (-1.0471976F + x) * o + u * p;
        float z = (-1.0471976F - x) * o - u * p;
        this.leftHindLeg.pitch = w - t * 0.5F * g * p;
        this.rightHindLeg.pitch = w + t * 0.5F * g * p;
        this.leftFrontLeg.pitch = y;
        this.rightFrontLeg.pitch = z;
        this.tail.pitch = 0.5235988F + g * 0.75F;
        this.tail.pivotY = -5.0F + g;
        this.tail.pivotZ = 2.0F + g * 2.0F;
        if (bl) {
            this.tail.yaw = MathHelper.cos(r * 0.7F);
        } else {
            this.tail.yaw = 0.0F;
        }

        this.rightHindBabyLeg.pivotY = this.rightHindLeg.pivotY;
        this.rightHindBabyLeg.pivotZ = this.rightHindLeg.pivotZ;
        this.rightHindBabyLeg.pitch = this.rightHindLeg.pitch;
        this.leftHindBabyLeg.pivotY = this.leftHindLeg.pivotY;
        this.leftHindBabyLeg.pivotZ = this.leftHindLeg.pivotZ;
        this.leftHindBabyLeg.pitch = this.leftHindLeg.pitch;
        this.rightFrontBabyLeg.pivotY = this.rightFrontLeg.pivotY;
        this.rightFrontBabyLeg.pivotZ = this.rightFrontLeg.pivotZ;
        this.rightFrontBabyLeg.pitch = this.rightFrontLeg.pitch;
        this.leftFrontBabyLeg.pivotY = this.leftFrontLeg.pivotY;
        this.leftFrontBabyLeg.pivotZ = this.leftFrontLeg.pivotZ;
        this.leftFrontBabyLeg.pitch = this.leftFrontLeg.pitch;
        boolean bl2 = abstractHorseEntity.isBaby();
        this.rightHindLeg.visible = !bl2;
        this.leftHindLeg.visible = !bl2;
        this.rightFrontLeg.visible = !bl2;
        this.leftFrontLeg.visible = !bl2;
        this.rightHindBabyLeg.visible = bl2;
        this.leftHindBabyLeg.visible = bl2;
        this.rightFrontBabyLeg.visible = bl2;
        this.leftFrontBabyLeg.visible = bl2;
        this.body.pivotY = bl2 ? 10.8F : 0.0F;
    }
}
