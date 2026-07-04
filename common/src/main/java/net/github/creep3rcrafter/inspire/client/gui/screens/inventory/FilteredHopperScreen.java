package net.github.creep3rcrafter.inspire.client.gui.screens.inventory;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.github.creep3rcrafter.inspire.Inspire;
import net.github.creep3rcrafter.inspire.inventory.FilteredHopperMenu;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

@Environment(EnvType.CLIENT)
public class FilteredHopperScreen extends AbstractContainerScreen<FilteredHopperMenu> {
    private static final ResourceLocation HOPPER_LOCATION = new ResourceLocation(InspireCommon.MOD_ID, "textures/gui/container/filtered_hopper.png");

    public FilteredHopperScreen(FilteredHopperMenu hopperMenu, Inventory inventory, Component component) {
        super(hopperMenu, inventory, component);
        this.passEvents = false;
        this.imageHeight = 150;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    public void render(PoseStack poseStack, int i, int j, float f) {
        this.renderBackground(poseStack);
        super.render(poseStack, i, j, f);
        this.renderTooltip(poseStack, i, j);
    }

    protected void renderBg(PoseStack poseStack, float f, int i, int j) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, HOPPER_LOCATION);
        int k = (this.width - this.imageWidth) / 2;
        int l = (this.height - this.imageHeight) / 2;
        this.blit(poseStack, k, l, 0, 0, this.imageWidth, this.imageHeight);
    }
}