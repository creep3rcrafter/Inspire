package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModItems;
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
        if (this.getBoatType() == Type.byName("crimson")) {
            cir.setReturnValue(ModItems.CRIMSON_CHEST_BOAT.get());
        } else if (this.getBoatType() == Type.byName("warped")) {
            cir.setReturnValue(ModItems.WARPED_CHEST_BOAT.get());
        } else if (this.getBoatType() == Type.byName("withered")) {
            cir.setReturnValue(ModItems.WITHERED_CHEST_BOAT.get());
        } else if (this.getBoatType() == Type.byName("pine")) {
            cir.setReturnValue(ModItems.PINE_CHEST_BOAT.get());
        } else if (this.getBoatType() == Type.byName("redwood")) {
            cir.setReturnValue(ModItems.REDWOOD_CHEST_BOAT.get());
        }
    }
}
