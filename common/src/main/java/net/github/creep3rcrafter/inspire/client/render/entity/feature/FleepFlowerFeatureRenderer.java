package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import net.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class FleepFlowerFeatureRenderer extends RenderLayer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private final BlockRenderDispatcher blockRenderDispatcher;

    public FleepFlowerFeatureRenderer(RenderLayerParent<FleepEntity, FleepEntityModel<FleepEntity>> context, BlockRenderDispatcher blockRenderDispatcher) {
        super(context);
        this.blockRenderDispatcher = blockRenderDispatcher;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int light, FleepEntity fleepEntity, float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
        if (fleepEntity.isSheared() || fleepEntity.isBaby()) {
            return;
        }

        Minecraft minecraft = Minecraft.getInstance();
        boolean outlineOnly = minecraft.shouldEntityAppearGlowing(fleepEntity) && fleepEntity.isInvisible();
        if (fleepEntity.isInvisible() && !outlineOnly) {
            return;
        }

        BlockState blockState = fleepEntity.getVariant().getFlowerState();
        int overlay = LivingEntityRenderer.getOverlayCoords(fleepEntity, 0.0F);
        if (blockState.getBlock() instanceof DoublePlantBlock) {
            renderDoublePlant(poseStack, buffer, light, outlineOnly, blockState, overlay);
        } else if (blockState.getBlock() instanceof BambooStalkBlock) {
            renderBamboo(poseStack, buffer, light, outlineOnly, blockState, overlay);
        } else if (blockState.is(Blocks.PINK_PETALS)) {
            renderPinkPetals(poseStack, buffer, light, outlineOnly, blockState, overlay);
        } else {
            renderStandardFlower(poseStack, buffer, light, outlineOnly, blockState, overlay);
        }
    }

    private void renderDoublePlant(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay) {
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), overlay, 0.2F, -0.235F, 0.5F, -48.0F, 0.0F, 0.0F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), overlay, 0.2F, -1.235F, 0.5F, -48.0F, 0.0F, 0.0F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), overlay, 0.2F, -0.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), overlay, 0.2F, -1.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnHead(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), overlay, 0.0F, -0.785F, -0.15F);
        renderOnHead(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), overlay, 0.0F, -1.785F, -0.15F);
    }

    private void renderBamboo(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay) {
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState, overlay, 0.2F, -0.235F, 0.5F, -48.0F, 0.0F, 0.0F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.BAMBOO_LEAVES, BambooLeaves.LARGE), overlay, 0.2F, -1.235F, 0.5F, -48.0F, 0.0F, 0.0F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState, overlay, 0.2F, -0.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.BAMBOO_LEAVES, BambooLeaves.SMALL), overlay, 0.2F, -1.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState.setValue(BlockStateProperties.BAMBOO_LEAVES, BambooLeaves.LARGE), overlay, 0.2F, -2.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnHead(poseStack, buffer, light, outlineOnly, Blocks.BAMBOO_SAPLING.defaultBlockState(), overlay, 0.0F, -0.785F, -0.09F);
    }

    private void renderPinkPetals(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay) {
        poseStack.pushPose();
        poseStack.translate(-0.1F, 0.3F, -0.6F);
        poseStack.mulPose(Axis.YP.rotationDegrees(45.0F));
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        this.renderFlower(poseStack, buffer, light, outlineOnly, blockState.setValue(PinkPetalsBlock.AMOUNT, 3), overlay);
        poseStack.popPose();

        poseStack.pushPose();
        this.getParentModel().getHead().translateAndRotate(poseStack);
        poseStack.translate(0.0F, -0.785F, -0.15F);
        poseStack.mulPose(Axis.YP.rotationDegrees(-78.0F));
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(-0.35F, -0.5F, -0.25F);
        this.renderFlower(poseStack, buffer, light, outlineOnly, blockState.setValue(PinkPetalsBlock.AMOUNT, 1), overlay);
        poseStack.popPose();
    }

    private void renderStandardFlower(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay) {
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState, overlay, 0.2F, -0.235F, 0.5F, -48.0F, 0.0F, 0.0F);
        renderOnBody(poseStack, buffer, light, outlineOnly, blockState, overlay, 0.2F, -0.235F, 0.5F, 42.0F, 0.1F, -0.6F);
        renderOnHead(poseStack, buffer, light, outlineOnly, blockState, overlay, 0.0F, -0.785F, -0.15F);
    }

    private void renderOnBody(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay, float x, float y, float z, float firstYaw, float secondX, float secondZ) {
        poseStack.pushPose();
        poseStack.translate(x, y, z);
        poseStack.mulPose(Axis.YP.rotationDegrees(firstYaw));
        if (secondX != 0.0F || secondZ != 0.0F) {
            poseStack.translate(secondX, 0.0F, secondZ);
            poseStack.mulPose(Axis.YP.rotationDegrees(-48.0F));
        }
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(-0.5F, -0.5F, -0.5F);
        this.renderFlower(poseStack, buffer, light, outlineOnly, blockState, overlay);
        poseStack.popPose();
    }

    private void renderOnHead(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay, float x, float y, float z) {
        poseStack.pushPose();
        this.getParentModel().getHead().translateAndRotate(poseStack);
        poseStack.translate(x, y, z);
        poseStack.mulPose(Axis.YP.rotationDegrees(-78.0F));
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(-0.5F, -0.5F, -0.5F);
        this.renderFlower(poseStack, buffer, light, outlineOnly, blockState, overlay);
        poseStack.popPose();
    }

    private void renderFlower(PoseStack poseStack, MultiBufferSource buffer, int light, boolean outlineOnly, BlockState blockState, int overlay) {
        this.blockRenderDispatcher.renderSingleBlock(blockState, poseStack, buffer, light, overlay);
    }
}
