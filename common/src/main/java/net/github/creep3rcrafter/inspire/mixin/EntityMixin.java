package net.github.creep3rcrafter.inspire.mixin;

import net.creep3rcrafter.theupdatemod.register.ModEffects;
import net.minecraft.commands.CommandSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.entity.EntityAccess;
import net.minecraft.world.level.material.Fluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin implements Nameable, EntityAccess, CommandSource {

    @Shadow
    protected abstract boolean isInRain();


    @Shadow
    public abstract boolean updateFluidHeightAndDoFluidPushing(TagKey<Fluid> tagKey, double d);

    @Inject(method = "isInWaterOrRain", at = @At("RETURN"), cancellable = true)
    public void injectIsInWaterOrRain(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(updateFluidHeightAndDoFluidPushing(FluidTags.WATER, 0.014D) || cir.getReturnValue());
    }

    @Inject(method = "dampensVibrations", at = @At("HEAD"), cancellable = true)
    public void injectDampensVibrations(CallbackInfoReturnable<Boolean> cir) {
        if (((Entity) (Object) this) instanceof LivingEntity) {
            if (((LivingEntity) (Object) this).hasEffect(ModEffects.SILENCE.get())) {
                cir.setReturnValue(true);
            }
        }
    }

    @Inject(method = "lavaHurt", at = @At("HEAD"), cancellable = true)
    public void injectLavaHurt(CallbackInfo ci) {
        Entity entity = ((Entity) (Object) this);
        if (entity.isPassenger()) {
            if (entity.getVehicle() instanceof Boat boat) {
                if (boat.getBoatType().equals(Boat.Type.byName("crimson")) || boat.getBoatType().equals(Boat.Type.byName("warped"))) {
                    ci.cancel();
                }
            }
        }
    }


    @Inject(method = "isOnFire()Z", at = @At("HEAD"), cancellable = true)
    public void injectOnFire(CallbackInfoReturnable<Boolean> cir) {
        Entity entity = ((Entity) (Object) this);
        if (entity.isPassenger()) {
            if (entity.getVehicle() instanceof Boat boat) {
                if (boat.getBoatType().equals(Boat.Type.byName("crimson")) || boat.getBoatType().equals(Boat.Type.byName("warped"))) {
                    cir.setReturnValue(false);
                }
            }
        }
    }

    /*
    @Inject(method = "isInvulnerableTo", at = @At("RETURN"), cancellable = true)
    public void inject2(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (((Entity) (Object) this) instanceof Player) {
            if (damageSource == DamageSource.LAVA){
                cir.setReturnValue(true);
            }
        }
    }

     */


}
