package net.github.creep3rcrafter.inspire.mixin;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ZombieHorse.class)
public abstract class ZombieHorseMixin extends AbstractHorse {
    @Unique
    private static final ResourceLocation ARMOR_MODIFIER_ID = ResourceLocation.withDefaultNamespace("zombie_horse_armor");

    protected ZombieHorseMixin(EntityType<? extends AbstractHorse> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        if (!this.getBodyArmorItem().isEmpty()) {
            compoundTag.put("ArmorItem", this.getBodyArmorItem().save(this.registryAccess()));
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if (compoundTag.contains("ArmorItem", 10)) {
            ItemStack itemStack = ItemStack.parseOptional(this.registryAccess(), compoundTag.getCompound("ArmorItem"));
            if (!itemStack.isEmpty() && this.isBodyArmorItem(itemStack)) {
                this.setBodyArmorItem(itemStack);
            }
        }
    }

    @Inject(method = "containerChanged", at = @At("RETURN"))
    public void injectContainerChanged(Container container, CallbackInfo ci) {
        if (!this.level().isClientSide) {
            ItemStack armorItem = this.getBodyArmorItem();
            this.getAttribute(Attributes.ARMOR).removeModifier(ARMOR_MODIFIER_ID);
            if (this.isBodyArmorItem(armorItem)) {
                int protection = architectury_theupdatemod$getHorseArmorProtection(armorItem);
                if (protection != 0) {
                    this.getAttribute(Attributes.ARMOR).addTransientModifier(new AttributeModifier(ARMOR_MODIFIER_ID, (double) protection, AttributeModifier.Operation.ADD_VALUE));
                }
            }
        }
    }

    @Override
    public boolean canUseSlot(EquipmentSlot slot) {
        return slot == EquipmentSlot.BODY || super.canUseSlot(slot);
    }

    @Override
    public boolean isBodyArmorItem(ItemStack itemStack) {
        return itemStack.is(Items.IRON_HORSE_ARMOR) || itemStack.is(Items.GOLDEN_HORSE_ARMOR) ||
               itemStack.is(Items.DIAMOND_HORSE_ARMOR) || itemStack.is(Items.LEATHER_HORSE_ARMOR);
    }

    @Unique
    private int architectury_theupdatemod$getHorseArmorProtection(ItemStack itemStack) {
        if (itemStack.is(Items.IRON_HORSE_ARMOR)) {
            return 5;
        } else if (itemStack.is(Items.GOLDEN_HORSE_ARMOR)) {
            return 3;
        } else if (itemStack.is(Items.DIAMOND_HORSE_ARMOR)) {
            return 11;
        } else if (itemStack.is(Items.LEATHER_HORSE_ARMOR)) {
            return 1;
        } else {
            return 0;
        }
    }
}
