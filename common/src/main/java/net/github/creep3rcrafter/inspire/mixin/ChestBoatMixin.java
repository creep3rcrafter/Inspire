package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChestBoat.class)
public abstract class ChestBoatMixin extends Boat {

    public ChestBoatMixin(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "getDropItem", at = @At(value = "HEAD"), cancellable = true)
    public void injectGetDropItem(CallbackInfoReturnable<Item> cir) {
        if (this.getVariant() == Type.byName("crimson")) {
            cir.setReturnValue(InspireItems.CRIMSON_CHEST_BOAT.get());
        } else if (this.getVariant() == Type.byName("warped")) {
            cir.setReturnValue(InspireItems.WARPED_CHEST_BOAT.get());
        } else if (this.getVariant() == Type.byName("withered")) {
            cir.setReturnValue(InspireItems.WITHERED_CHEST_BOAT.get());
        } else if (this.getVariant() == Type.byName("pine")) {
            cir.setReturnValue(InspireItems.PINE_CHEST_BOAT.get());
        } else if (this.getVariant() == Type.byName("redwood")) {
            cir.setReturnValue(InspireItems.REDWOOD_CHEST_BOAT.get());
        }
    }
}
