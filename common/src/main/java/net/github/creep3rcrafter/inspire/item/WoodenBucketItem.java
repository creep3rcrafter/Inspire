package net.github.creep3rcrafter.inspire.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class WoodenBucketItem extends BucketItem {
    public WoodenBucketItem(Fluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab creativeModeTab, NonNullList<ItemStack> nonNullList) {
        super.fillItemCategory(creativeModeTab, nonNullList);

    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl) {
        super.inventoryTick(itemStack, level, entity, i, bl);
        if (arch$getFluid() == Fluids.LAVA) {
            //itemStack.hurtAndBreak();
        }
    }
}
