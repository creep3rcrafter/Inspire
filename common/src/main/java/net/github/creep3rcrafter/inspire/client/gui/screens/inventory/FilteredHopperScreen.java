package net.github.creep3rcrafter.inspire.client.gui.screens.inventory;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class FilteredHopperScreen extends AbstractContainerScreen<AbstractContainerMenu> {
    private static final ResourceLocation HOPPER_LOCATION = ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "textures/gui/container/filtered_hopper.png");

    public FilteredHopperScreen(AbstractContainerMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
        this.passEvents = false;
        this.imageHeight = 150;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(guiGraphics, mouseX, mouseY, partialTick);
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        int left = (this.width - this.imageWidth) / 2;
        int top = (this.height - this.imageHeight) / 2;
        guiGraphics.blit(RenderType::guiTextured, HOPPER_LOCATION, left, top, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
    }
}
