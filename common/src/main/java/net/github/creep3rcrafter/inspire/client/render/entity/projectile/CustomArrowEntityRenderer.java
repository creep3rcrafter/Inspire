package net.github.creep3rcrafter.inspire.client.render.entity.projectile;

import net.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CustomArrowEntityRenderer<T extends CustomArrowEntity> extends CustomArrowRenderer<T> {
    public CustomArrowEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }
}
