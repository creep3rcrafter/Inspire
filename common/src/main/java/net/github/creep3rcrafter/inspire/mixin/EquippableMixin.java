package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.InspireCommon;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.Equippable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.world.item.equipment.EquipmentAssets.ROOT_ID;

@Mixin(Equippable.class)
public class EquippableMixin {
    @Inject(method = "harness", at = @At(value = "HEAD"), cancellable = true)
    private static void injectHarness(DyeColor dyeColor, CallbackInfoReturnable<Equippable> cir) {
        if(dyeColor == null){
            HolderGetter<EntityType<?>> holderGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.ENTITY_TYPE);
            cir.setReturnValue(Equippable.builder(EquipmentSlot.BODY).setEquipSound(SoundEvents.HARNESS_EQUIP).setAsset(inspire$CreateId()).setAllowedEntities(holderGetter.getOrThrow(EntityTypeTags.CAN_EQUIP_HARNESS)).setEquipOnInteract(true).setCanBeSheared(true).setShearingSound(BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.HARNESS_UNEQUIP)).build());
        }
    }
    @Unique
    private static ResourceKey<EquipmentAsset> inspire$CreateId() {
        return ResourceKey.create(ROOT_ID, ResourceLocation.fromNamespaceAndPath(InspireCommon.MOD_ID, "regular_harness"));
    }
}

