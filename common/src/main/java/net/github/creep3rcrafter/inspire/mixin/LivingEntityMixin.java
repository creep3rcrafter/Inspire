package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.item.CustomElytraItem;
import net.github.creep3rcrafter.inspire.register.InspireEffects;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends LivingEntity {

    protected LivingEntityMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

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
    @Inject(method = "getEquipmentSlotForItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EquipmentSlot;", at = @At("HEAD"), cancellable = true)
    private static void inject(ItemStack itemStack, CallbackInfoReturnable<EquipmentSlot> cir) {
        if (itemStack.getItem() instanceof CustomElytraItem) {
            cir.setReturnValue(EquipmentSlot.CHEST);
        }
    }
    @Inject(method = "checkTotemDeathProtection", at = @At("HEAD"), cancellable = true)//return
    public void inject1(DamageSource damageSource, CallbackInfoReturnable<Boolean> callback) {
        if (this.hasEffect(InspireEffects.UNDYING)) {
            this.setHealth(1.0F);
            this.removeEffect(InspireEffects.UNDYING);
            this.removeAllEffects();
            this.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            this.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
            this.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0));
            this.level().broadcastEntityEvent(this, (byte) 35);
            callback.setReturnValue(true);
        }
    }

    @Inject(method = "isAffectedByPotions", at = @At("RETURN"), cancellable = true)//return
    public void inject2(CallbackInfoReturnable<Boolean> cir) {
        if (this.hasEffect(InspireEffects.NULLIFIER)) {
            cir.setReturnValue(false);
        }
    }

    @ModifyArg(method = "travel(Lnet/minecraft/world/phys/Vec3;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V", ordinal = 6))
    private Vec3 modifyVelocity(Vec3 vec3) {
        ItemStack itemStack = getItemBySlot(EquipmentSlot.CHEST);
        if (itemStack.is(InspireItems.CRAFTED_ELYTRA.get())) {
            return vec3.multiply(new Vec3(0.9900000095367432, 0.9900000095367432, 0.9900000095367432));
        } else {
            return vec3;
        }
    }

    @ModifyVariable(method = "travel", at = @At("LOAD"), name = "f2", ordinal = 0, index = 8)//return
    public float inject5(float value) {
        if (this.hasEffect(InspireEffects.SLIPPERY) && this.onGround()) {
            int amplifier = this.getEffect(InspireEffects.SLIPPERY).getAmplifier();
            return (((amplifier / (-300f)) + 1) * 0.98f);
        }
        return value;
    }

    @ModifyVariable(method = "travel", at = @At("LOAD"), name = "d0", ordinal = 0, index = 2)//return
    public double inject6(double value) {
        if (this.hasEffect(InspireEffects.GRAVITATION)) {
            if (this.isCrouching()) {
                return 0.08D;
            } else {
                return -0.04;
            }
        }
        return value;
    }
    @Inject(method = "tick", at = @At("HEAD"))
    public void inject3(CallbackInfo ci) {
        if (((Object) this) instanceof LivingEntity) {
            ItemStack itemStack = getItemBySlot(EquipmentSlot.FEET);
            if (itemStack.is(InspireItems.STRIDER_SCALE_BOOTS.get())) {
                architectury_theupdatemod$floatStrider();
                checkInsideBlocks();
            }
        }
    }


    @Inject(method = "canStandOnFluid", at = @At("HEAD"), cancellable = true)
    public void inject4(FluidState fluidState, CallbackInfoReturnable<Boolean> cir) {
        if (((Object) this) instanceof LivingEntity) {
            if (fluidState.is(FluidTags.LAVA)) {
                if (getItemBySlot(EquipmentSlot.FEET).is(InspireItems.STRIDER_SCALE_BOOTS.get())) {
                    cir.setReturnValue(true);
                }
            }
        }
    }

    @Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
    public void inject5(DamageSource damageSource, float f, CallbackInfoReturnable<Boolean> cir) {
        if (((Object) this) instanceof LivingEntity) {
            ItemStack itemStack = getItemBySlot(EquipmentSlot.FEET);
            if (itemStack.is(InspireItems.STRIDER_SCALE_BOOTS.get())) {
                if (damageSource.is(DamageTypeTags.IS_FIRE) && !isEyeInFluid(FluidTags.LAVA)) {
                    clearFire();
                    cir.setReturnValue(false);
                }
            }
        }
    }

    @Unique
    private void architectury_theupdatemod$floatStrider() {
        if (this.isInLava()) {
            CollisionContext collisionContext = CollisionContext.of(this);
            if (collisionContext.isAbove(LiquidBlock.STABLE_SHAPE, this.blockPosition(), true) && !this.level().getFluidState(this.blockPosition().above()).is(FluidTags.LAVA)) {
                this.setOnGround(true);
            } else {
                this.setDeltaMovement(this.getDeltaMovement().scale(0.5).add(0.0, 0.05, 0.0));
            }
        }

    }
}