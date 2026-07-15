package net.github.creep3rcrafter.inspire.client.render.entity;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Axis;
import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ChestRaftModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.WaterPatchModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.Boat;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.stream.Stream;

public class TrappedChestBoatRenderer extends EntityRenderer<Boat> {
    private final Map<Boat.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public TrappedChestBoatRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.8F;
        this.boatResources = Stream.of(Boat.Type.values()).collect(ImmutableMap.toImmutableMap((type) -> {
            return type;
        }, (type) -> {
            return Pair.of(ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, getTextureLocation(type)), this.createBoatModel(context, type));
        }));
    }

    private static String getTextureLocation(Boat.Type type) {
        return "textures/entity/trapped_chest_boat/" + type.getName() + ".png";
    }

    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context context, Boat.Type type) {
        ModelLayerLocation layer = ModelLayers.createChestBoatModelName(type);
        var modelPart = context.bakeLayer(layer);

        if (type == Boat.Type.BAMBOO) {
            return new ChestRaftModel(modelPart);
        }

        return new ChestBoatModel(modelPart);
    }

    public void render(Boat boat, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        poseStack.translate(0.0, 0.375, 0.0);
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - f));
        float h = (float) boat.getHurtTime() - g;
        float j = boat.getDamage() - g;
        if (j < 0.0F) {
            j = 0.0F;
        }

        if (h > 0.0F) {
            poseStack.mulPose(Axis.XP.rotationDegrees(Mth.sin(h) * h * j / 10.0F * (float) boat.getHurtDir()));
        }

        float k = boat.getBubbleAngle(g);
        if (!Mth.equal(k, 0.0F)) {
            poseStack.mulPose(Axis.of(new org.joml.Vector3f(1.0F, 0.0F, 1.0F)).rotationDegrees(boat.getBubbleAngle(g)));
        }

        Pair<ResourceLocation, ListModel<Boat>> pair = (Pair)this.boatResources.get(boat.getVariant());
        ResourceLocation resourceLocation = (ResourceLocation)pair.getFirst();
        ListModel<Boat> boatModel = pair.getSecond();
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.mulPose(Axis.YP.rotationDegrees(90.0F));
        boatModel.setupAnim(boat, g, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(boatModel.renderType(resourceLocation));
        boatModel.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY);
        if (!boat.isUnderWater()) {
            VertexConsumer vertexConsumer2 = multiBufferSource.getBuffer(RenderType.waterMask());
            if (boatModel instanceof WaterPatchModel waterPatchModel) {
                waterPatchModel.waterPatch().render(
                        poseStack,
                        vertexConsumer2,
                        i,
                        OverlayTexture.NO_OVERLAY
                );
            }
        }
        poseStack.popPose();
        super.render(boat, f, g, poseStack, multiBufferSource, i);
    }

    public @NotNull ResourceLocation getTextureLocation(Boat boat) {
        return (this.boatResources.get(boat.getVariant())).getFirst();
    }
}
