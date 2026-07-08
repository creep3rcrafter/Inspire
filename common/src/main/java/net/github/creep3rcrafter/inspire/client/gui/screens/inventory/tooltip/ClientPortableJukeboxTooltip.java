package net.github.creep3rcrafter.inspire.client.gui.screens.inventory.tooltip;

import net.minecraft.world.item.ItemStack;

public class ClientPortableJukeboxTooltip {
    private final ItemStack itemStack;

    public ClientPortableJukeboxTooltip(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return this.itemStack;
    }
}
