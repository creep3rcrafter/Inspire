package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireEffects;
import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.PathType;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Mob.class)
public abstract class MobMixin extends LivingEntity {

    protected MobMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Shadow
    public abstract void setPathfindingMalus(PathType pathType, float f);

    @Shadow
    public abstract @NotNull ItemStack getItemBySlot(EquipmentSlot equipmentSlot);

    @Inject(method = "tick", at = @At("RETURN"))
    public void injectTick(CallbackInfo ci) {
        if (getItemBySlot(EquipmentSlot.FEET).is(InspireItems.STRIDER_SCALE_BOOTS.get())) {
            setPathfindingMalus(PathType.LAVA, 0.0F);
            setPathfindingMalus(PathType.DANGER_FIRE, 0.0F);
        }
    }

    @Inject(method = "doHurtTarget", at = @At("RETURN"))
    public void injectDoHurtTarget(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (this.hasEffect(InspireEffects.INFECTION)) {
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(InspireEffects.INFECTION, 1200));
            }
        }
    }
}
