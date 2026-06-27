package net.github.creep3rcrafter.inspire.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.github.creep3rcrafter.inspire.block.RegularBedBlock;
import net.github.creep3rcrafter.inspire.block.entity.RegularBedBlockEntity;
import net.github.creep3rcrafter.inspire.register.InspireBlockEntityTypes;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.renderer.blockentity.state.BedRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.MaterialSet;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Unit;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3fc;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class RegularBedRenderer implements BlockEntityRenderer<@NotNull RegularBedBlockEntity, @NotNull BedRenderState> {
    private final MaterialSet materials;
    private final Model.Simple headModel;
    private final Model.Simple footModel;

    public RegularBedRenderer(BlockEntityRendererProvider.Context context) {
        this(context.materials(), context.entityModelSet());
    }

    public RegularBedRenderer(SpecialModelRenderer.BakingContext bakingContext) {
        this(bakingContext.materials(), bakingContext.entityModelSet());
    }

    public RegularBedRenderer(MaterialSet materialSet, EntityModelSet entityModelSet) {
        this.materials = materialSet;
        this.headModel = new Model.Simple(entityModelSet.bakeLayer(ModelLayers.BED_HEAD), RenderTypes::entitySolid);
        this.footModel = new Model.Simple(entityModelSet.bakeLayer(ModelLayers.BED_FOOT), RenderTypes::entitySolid);
    }

    public static LayerDefinition createHeadLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), PartPose.ZERO);
        partDefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 6).addBox(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, ((float)Math.PI / 2F)));
        partDefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(50, 18).addBox(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, (float)Math.PI));
        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    public static LayerDefinition createFootLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), PartPose.ZERO);
        partDefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 0).addBox(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(50, 12).addBox(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), PartPose.rotation(((float)Math.PI / 2F), 0.0F, ((float)Math.PI * 1.5F)));
        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public BedRenderState createRenderState() {
        return new BedRenderState();
    }

    @Override
    public void extractRenderState(RegularBedBlockEntity blockEntity, BedRenderState blockEntityRenderState, float f, @NotNull Vec3 vec3, ModelFeatureRenderer.@Nullable CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, blockEntityRenderState, f, vec3, crumblingOverlay);
        blockEntityRenderState.facing = (Direction)blockEntity.getBlockState().getValue(RegularBedBlock.FACING);
        blockEntityRenderState.isHead = blockEntity.getBlockState().getValue(RegularBedBlock.PART) == BedPart.HEAD;
        if (blockEntity.getLevel() != null) {
            DoubleBlockCombiner.NeighborCombineResult<? extends RegularBedBlockEntity> neighborCombineResult = DoubleBlockCombiner.combineWithNeigbour(InspireBlockEntityTypes.BED.get(), RegularBedBlock::getBlockType, RegularBedBlock::getConnectedDirection, ChestBlock.FACING, blockEntity.getBlockState(), blockEntity.getLevel(), blockEntity.getBlockPos(), (levelAccessor, blockPos) -> false);
            blockEntityRenderState.lightCoords = ((Int2IntFunction)neighborCombineResult.apply(new BrightnessCombiner<>())).get(blockEntityRenderState.lightCoords);
        }
    }
    @Override
    public void submit(BedRenderState bedRenderState, @NotNull PoseStack poseStack, @NotNull SubmitNodeCollector submitNodeCollector, @NotNull CameraRenderState cameraRenderState) {
        //Material material = Sheets.getBedMaterial(bedRenderState.color);
        Material material = new Material(
                Sheets.BED_SHEET,
                ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "entity/bed/regular")
        );;
        this.submitPiece(poseStack, submitNodeCollector, bedRenderState.isHead ? this.headModel : this.footModel, bedRenderState.facing, material, bedRenderState.lightCoords, OverlayTexture.NO_OVERLAY, false, bedRenderState.breakProgress, 0);
    }

    public void submitSpecial(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int i, int j, Material material, int k) {
        this.submitPiece(poseStack, submitNodeCollector, this.headModel, Direction.SOUTH, material, i, j, false, (ModelFeatureRenderer.CrumblingOverlay)null, k);
        this.submitPiece(poseStack, submitNodeCollector, this.footModel, Direction.SOUTH, material, i, j, true, (ModelFeatureRenderer.CrumblingOverlay)null, k);
    }

    private void submitPiece(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, Model.Simple simple, Direction direction, Material material, int i, int j, boolean bl, ModelFeatureRenderer.@Nullable CrumblingOverlay crumblingOverlay, int k) {
        poseStack.pushPose();
        preparePose(poseStack, bl, direction);
        submitNodeCollector.submitModel(simple, Unit.INSTANCE, poseStack, material.renderType(RenderTypes::entitySolid), i, j, -1, this.materials.get(material), k, crumblingOverlay);
        poseStack.popPose();
    }

    private static void preparePose(PoseStack poseStack, boolean bl, Direction direction) {
        poseStack.translate(0.0F, 0.5625F, bl ? -1.0F : 0.0F);
        poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
        poseStack.translate(0.5F, 0.5F, 0.5F);
        poseStack.mulPose(Axis.ZP.rotationDegrees(180.0F + direction.toYRot()));
        poseStack.translate(-0.5F, -0.5F, -0.5F);
    }

    public void getExtents(Consumer<Vector3fc> consumer) {
        PoseStack poseStack = new PoseStack();
        preparePose(poseStack, false, Direction.SOUTH);
        this.headModel.root().getExtentsForGui(poseStack, consumer);
        poseStack.setIdentity();
        preparePose(poseStack, true, Direction.SOUTH);
        this.footModel.root().getExtentsForGui(poseStack, consumer);
    }
}
