package net.github.creep3rcrafter.inspire.client.model.entity;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public class SkeletonCreeperEntityModel<T extends Entity> extends HierarchicalModel<T> {
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
    public static void addBody(CubeDeformation dilation, MeshDefinition baseModelData) {
        PartDefinition modelPartData = baseModelData.getRoot();
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation), PartPose.offset(0.0F, 6.0F, 0.0F));
        modelPartData2.addOrReplaceChild("tnt", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
        modelPartData2.addOrReplaceChild("fuse", CubeListBuilder.create().texOffs(60, 22).addBox(-0.5F, -4.0F, 0.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.ZERO);
    }
    public static LayerDefinition getTexturedModelData(CubeDeformation dilation) {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, dilation), PartPose.offset(0.0F, 6.0F, 0.0F));
        addBody(dilation, modelData);

        /*
        modelPartData.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, dilation)
                .uv(0, 26).cuboid(-1.5F, 6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(60, 22).cuboid(-0.5F, -4.0F, 0.0F, 2.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.NONE);

        //CreeperEntityRenderer
         */
        //ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation);
        //ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation);
        modelPartData.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(32, 6).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), PartPose.offset(-2.0F, 18.0F, 4.0F));
        modelPartData.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(48, 6).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), PartPose.offset(2.0F, 18.0F, 4.0F));
        modelPartData.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), PartPose.offset(-2.0F, 18.0F, -4.0F));
        modelPartData.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, dilation), PartPose.offset(2.0F, 18.0F, -4.0F));
        return LayerDefinition.create(modelData, 64, 32);
    }

    @Override
    public ModelPart root() {
        return this.root;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color) {
        this.root.render(poseStack, buffer, packedLight, packedOverlay, color);
    }

    @Override
    public void setupAnim(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.yRot = headYaw * ((float)Math.PI / 180F);
        this.head.xRot = headPitch * ((float)Math.PI / 180F);
        this.leftHindLeg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightHindLeg.xRot = Mth.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.leftFrontLeg.xRot = Mth.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.rightFrontLeg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
    }
}
