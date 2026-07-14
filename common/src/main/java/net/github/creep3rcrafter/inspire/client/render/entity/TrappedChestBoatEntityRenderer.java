package net.github.creep3rcrafter.inspire.client.render.entity;


import com.github.creep3rcrafter.inspire.InspireCommon;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.joml.Quaternionf;

import java.util.Map;
import java.util.stream.Stream;

public class TrappedChestBoatEntityRenderer extends EntityRenderer<BoatEntity> {
    private final Map<BoatEntity.Type, Pair<Identifier, CompositeEntityModel<BoatEntity>>> texturesAndModels;

    public TrappedChestBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.shadowRadius = 0.8F;
        this.texturesAndModels = Stream.of(BoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap((type) -> {
            return type;
        }, (type) -> {
            return Pair.of(new Identifier(InspireCommon.MOD_ID, "textures/entity/trapped_chest_boat/" + type.getName() + ".png"), this.createModel(ctx, type));
        }));
    }

    @Override
    public Identifier getTexture(BoatEntity entity) {
        return (this.texturesAndModels.get(entity.getVariant())).getFirst();
    }

    private CompositeEntityModel<BoatEntity> createModel(EntityRendererFactory.Context ctx, BoatEntity.Type type) {
        EntityModelLayer entityModelLayer = EntityModelLayers.createChestBoat(type);
        ModelPart modelPart = ctx.getPart(entityModelLayer);
        if (type == BoatEntity.Type.BAMBOO) {
            return (CompositeEntityModel<BoatEntity>) (new ChestRaftEntityModel(modelPart));
        } else {
            return (CompositeEntityModel<BoatEntity>) (new ChestBoatEntityModel(modelPart));
        }
    }

    @Override
    public void render(BoatEntity boatEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0F, 0.375F, 0.0F);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - f));
        float h = (float) boatEntity.getDamageWobbleTicks() - g;
        float j = boatEntity.getDamageWobbleStrength() - g;
        if (j < 0.0F) {
            j = 0.0F;
        }

        if (h > 0.0F) {
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.sin(h) * h * j / 10.0F * (float) boatEntity.getDamageWobbleSide()));
        }

        float k = boatEntity.interpolateBubbleWobble(g);
        if (!MathHelper.approximatelyEquals(k, 0.0F)) {
            matrixStack.multiply((new Quaternionf()).setAngleAxis(boatEntity.interpolateBubbleWobble(g) * ((float) Math.PI / 180F), 1.0F, 0.0F, 1.0F));
        }

        Pair<Identifier, CompositeEntityModel<BoatEntity>> pair = this.texturesAndModels.get(boatEntity.getVariant());
        Identifier identifier = (Identifier) pair.getFirst();
        BoatEntityModel boatEntityModel = (BoatEntityModel) pair.getSecond();
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0F));
        boatEntityModel.setAngles(boatEntity, g, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(boatEntityModel.getLayer(identifier));
        boatEntityModel.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        if (!boatEntity.isSubmergedInWater()) {
            VertexConsumer vertexConsumer2 = vertexConsumerProvider.getBuffer(RenderLayer.getWaterMask());
            ((ModelWithWaterPatch) boatEntityModel).getWaterPatch().render(matrixStack, vertexConsumer2, i, OverlayTexture.DEFAULT_UV);
        }

        matrixStack.pop();
        super.render(boatEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
