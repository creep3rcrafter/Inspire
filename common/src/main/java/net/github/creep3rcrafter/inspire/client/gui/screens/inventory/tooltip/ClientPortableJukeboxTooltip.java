package net.github.creep3rcrafter.inspire.client.gui.screens.inventory.tooltip;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Matrix4f;
import net.github.creep3rcrafter.inspire.inventory.tooltip.PortableJukeboxTooltip;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@Environment(EnvType.CLIENT)
public class ClientPortableJukeboxTooltip implements ClientTooltipComponent {
    public static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("textures/gui/container/bundle.png");
    private final ItemStack itemStack;

    public ClientPortableJukeboxTooltip(PortableJukeboxTooltip portableJukeboxTooltip) {
        this.itemStack = portableJukeboxTooltip.getItem();
    }

    public int getHeight() {
        return 20 + 2 + 4;
    }

    public int getWidth(Font font) {
        return 18 + 2;
    }

    @Override
    public void renderText(Font font, int i, int j, Matrix4f matrix4f, MultiBufferSource.BufferSource bufferSource) {
        ClientTooltipComponent.super.renderText(font, i, j, matrix4f, bufferSource);
    }

    public void renderImage(Font font, int i, int j, PoseStack poseStack, ItemRenderer itemRenderer, int k) {
        this.renderSlot(i + 1, j + 1, font, poseStack, itemRenderer, k);
        this.drawBorder(i, j, poseStack, k);
    }

    private void renderSlot(int i, int j, Font font, PoseStack poseStack, ItemRenderer itemRenderer, int l) {
        this.blit(poseStack, i, j, l, Texture.SLOT);
        itemRenderer.renderAndDecorateItem(itemStack, i + 1, j + 1, 0);
        itemRenderer.renderGuiItemDecorations(font, itemStack, i + 1, j + 1);
    }

    private void drawBorder(int i, int j, PoseStack poseStack, int m) {
        this.blit(poseStack, i, j, m, Texture.BORDER_CORNER_TOP);
        this.blit(poseStack, i + 18 + 1, j, m, Texture.BORDER_CORNER_TOP);

        int n;
        for (n = 0; n < 1; ++n) {
            this.blit(poseStack, i + 1 + n * 18, j, m, Texture.BORDER_HORIZONTAL_TOP);
            this.blit(poseStack, i + 1 + n * 18, j + 20, m, Texture.BORDER_HORIZONTAL_BOTTOM);
        }

        for (n = 0; n < 1; ++n) {
            this.blit(poseStack, i, j + n * 20 + 1, m, Texture.BORDER_VERTICAL);
            this.blit(poseStack, i + 18 + 1, j + n * 20 + 1, m, Texture.BORDER_VERTICAL);
        }

        this.blit(poseStack, i, j + 20, m, Texture.BORDER_CORNER_BOTTOM);
        this.blit(poseStack, i + 18 + 1, j + 20, m, Texture.BORDER_CORNER_BOTTOM);
    }

    private void blit(PoseStack poseStack, int i, int j, int k, Texture texture) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE_LOCATION);
        GuiComponent.blit(poseStack, i, j, k, (float) texture.x, (float) texture.y, texture.w, texture.h, 128, 128);
    }

    @Environment(EnvType.CLIENT)
    private static enum Texture {
        SLOT(0, 0, 18, 20),
        BLOCKED_SLOT(0, 40, 18, 20),
        BORDER_VERTICAL(0, 18, 1, 20),
        BORDER_HORIZONTAL_TOP(0, 20, 18, 1),
        BORDER_HORIZONTAL_BOTTOM(0, 60, 18, 1),
        BORDER_CORNER_TOP(0, 20, 1, 1),
        BORDER_CORNER_BOTTOM(0, 60, 1, 1);

        public final int x;
        public final int y;
        public final int w;
        public final int h;

        private Texture(int j, int k, int l, int m) {
            this.x = j;
            this.y = k;
            this.w = l;
            this.h = m;
        }
    }
}
