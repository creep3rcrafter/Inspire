package net.github.creep3rcrafter.inspire.mixin;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Entity.class)
public abstract class LivingEntityMixin {

    /*

    @Shadow public abstract boolean updateFluidHeightAndDoFluidPushing(TagKey<Fluid> tagKey, double d);

    @Inject(method = "isInWaterOrRain", at = @At("RETURN"), cancellable = true)
    public void injectIsInWaterOrRain(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(updateFluidHeightAndDoFluidPushing(FluidTags.WATER, 0.014D) || cir.getReturnValue());
    }
    @Inject(method = "updateSwimming", at = @At("HEAD"), cancellable = true)
    public void injectIsInWaterOrRain(CallbackInfo ci) {
        Entity selfEntity = (Entity)(Object)this;
        if (selfEntity instanceof LivingEntity){
            selfEntity.setSwimming(true);
            System.out.println("eep");
            ci.cancel();
        }
        /*
        if (selfEntity.hasEffect(InspireEffects.AIR_SWIM) && !selfEntity.hasEffect(MobEffects.DOLPHINS_GRACE)) {
            //selfLivingEntity.setSwimming(selfLivingEntity.isSprinting());//&& !selfLivingEntity.isPassenger()
            selfEntity.setSwimming(true);//&& !selfLivingEntity.isPassenger()
            System.out.println("eep");
            ci.cancel();
        }
    }
         */
}