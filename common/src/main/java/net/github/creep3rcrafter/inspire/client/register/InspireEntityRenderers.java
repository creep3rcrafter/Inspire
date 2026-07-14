package net.github.creep3rcrafter.inspire.client.register;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public final class InspireEntityRenderers {
    public static final ModelLayerLocation WITHER_SKELETON_HORSE_MODEL_LAYER;
    public static final ModelLayerLocation SKELETON_PIGLIN_MODEL_LAYER;
    public static final ModelLayerLocation SKELETON_CREEPER_MODEL_LAYER;
    public static final ModelLayerLocation TRAPPED_CHEST_MINECART_MODEL_LAYER;
    public static final ModelLayerLocation ENDER_CHEST_MINECART_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_FUR_MODEL_LAYER;
    public static final ModelLayerLocation FLEEP_FLOWER_MODEL_LAYER;
    public static final ModelLayerLocation SUNKEN_MODEL_LAYER;
    public static final ModelLayerLocation SUNKEN_CORAL_MODEL_LAYER;

    static {
        WITHER_SKELETON_HORSE_MODEL_LAYER = layer("wither_skeleton_horse", "main");
        TRAPPED_CHEST_MINECART_MODEL_LAYER = layer("trapped_chest_minecart", "main");
        ENDER_CHEST_MINECART_MODEL_LAYER = layer("ender_chest_minecart", "main");
        SKELETON_PIGLIN_MODEL_LAYER = layer("skeleton_piglin", "main");
        SKELETON_CREEPER_MODEL_LAYER = layer("skeleton_creeper", "main");
        FLEEP_MODEL_LAYER = layer("fleep", "main");
        FLEEP_FUR_MODEL_LAYER = layer("fleep", "fur");
        FLEEP_FLOWER_MODEL_LAYER = layer("fleep", "flowers");
        SUNKEN_MODEL_LAYER = layer("sunken", "main");
        SUNKEN_CORAL_MODEL_LAYER = layer("sunken", "coral");
    }

    private InspireEntityRenderers() {}

    private static ModelLayerLocation layer(String path, String layer) {
        return new ModelLayerLocation(new ResourceLocation(InspireCommon.MOD_ID, path), layer);
    }
}
