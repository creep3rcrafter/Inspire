package net.github.creep3rcrafter.inspire.client.render.entity.feature;

import com.github.creep3rcrafter.inspire.client.model.entity.fleep.FleepEntityModel;
import com.github.creep3rcrafter.inspire.entity.animal.FleepEntity;
import net.minecraft.block.*;
import net.minecraft.block.enums.BambooLeaves;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.RotationAxis;

public class FleepFlowerFeatureRenderer extends FeatureRenderer<FleepEntity, FleepEntityModel<FleepEntity>> {
    private final BlockRenderManager blockRenderManager;

    public FleepFlowerFeatureRenderer(FeatureRendererContext<FleepEntity, FleepEntityModel<FleepEntity>> context, BlockRenderManager blockRenderManager) {
        super(context);
        this.blockRenderManager = blockRenderManager;
    }
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, FleepEntity fleepEntity, float f, float g, float h, float j, float k, float l) {
        if (!fleepEntity.isSheared()) {
            if (!fleepEntity.isBaby()) {
                MinecraftClient minecraftClient = MinecraftClient.getInstance();
                boolean bl = minecraftClient.hasOutline(fleepEntity) && fleepEntity.isInvisible();
                if (!fleepEntity.isInvisible() || bl) {
                    BlockState blockState = fleepEntity.getVariant().getFlowerState();
                    int m = LivingEntityRenderer.getOverlay(fleepEntity, 0.0F);
                    BakedModel bakedModel = this.blockRenderManager.getModel(blockState);
                    if (blockState.getBlock() instanceof TallPlantBlock || blockState.getBlock() instanceof TallFlowerBlock){
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -1.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -1.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        this.getContextModel().getHead().rotate(matrixStack);
                        matrixStack.translate(0.0F, -0.785F, -0.15F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-78.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        this.getContextModel().getHead().rotate(matrixStack);
                        matrixStack.translate(0.0F, -1.785F, -0.15F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-78.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), m, bakedModel);
                        matrixStack.pop();
                    } else if (blockState.getBlock() instanceof BambooBlock){
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState, m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -1.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.BAMBOO_LEAVES, BambooLeaves.LARGE), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState, m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -1.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.BAMBOO_LEAVES, BambooLeaves.SMALL), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -2.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.BAMBOO_LEAVES, BambooLeaves.LARGE), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        this.getContextModel().getHead().rotate(matrixStack);
                        matrixStack.translate(0.0F, -0.785F, -0.09F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-78.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, Blocks.BAMBOO_SAPLING.getDefaultState(), m, bakedModel);
                        matrixStack.pop();
                    } else if (blockState.isOf(Blocks.PINK_PETALS)) {
                        matrixStack.push();
                        matrixStack.translate(-0.1F, 0.3F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.FLOWER_AMOUNT, 3), m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        this.getContextModel().getHead().rotate(matrixStack);
                        matrixStack.translate(0.0F, -0.785F, -0.15F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-78.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.35F, -0.5F, -0.25F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState.with(Properties.FLOWER_AMOUNT, 1), m, bakedModel);
                        matrixStack.pop();
                    }else{
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState, m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        matrixStack.translate(0.2F, -0.235F, 0.5F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(42.0F));
                        matrixStack.translate(0.1F, 0.0F, -0.6F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-48.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState, m, bakedModel);
                        matrixStack.pop();
                        matrixStack.push();
                        this.getContextModel().getHead().rotate(matrixStack);
                        matrixStack.translate(0.0F, -0.785F, -0.15F);
                        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-78.0F));
                        matrixStack.scale(-1.0F, -1.0F, 1.0F);
                        matrixStack.translate(-0.5F, -0.5F, -0.5F);
                        this.renderFlower(matrixStack, vertexConsumerProvider, i, bl, blockState, m, bakedModel);
                        matrixStack.pop();
                    }
                }
            }
        }
    }
    private void renderFlower(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, boolean renderAsModel, BlockState mushroomState, int overlay, BakedModel mushroomModel) {
        if (renderAsModel) {
            this.blockRenderManager.getModelRenderer().render(matrices.peek(), vertexConsumers.getBuffer(RenderLayer.getOutline(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE)), mushroomState, mushroomModel, 0.0F, 0.0F, 0.0F, light, overlay);
        } else {
            this.blockRenderManager.renderBlockAsEntity(mushroomState, matrices, vertexConsumers, light, overlay);
        }

    }
}
