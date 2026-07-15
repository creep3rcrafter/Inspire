package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {
    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    /*
    @Shadow
    public abstract Inventory getInventory();

    @Inject(method = "hasCorrectToolForDrops", at = @At("RETURN"), cancellable = true)
    public void inject(BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
        ItemStack selected = this.getInventory().getSelected();
        if ((this.hasEffect(ModEffects.IRON_FIST.get()) && (selected.isEmpty() || selected.getItem() instanceof BlockItem)) || cir.getReturnValue()) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "getDestroySpeed", at = @At("RETURN"), cancellable = true)
    public void inject2(BlockState blockState, CallbackInfoReturnable<Float> cir) {
        ItemStack selected = this.getInventory().getSelected();
        if (this.hasEffect(ModEffects.IRON_FIST.get()) && (selected.isEmpty() || selected.getItem() instanceof BlockItem)) {
            int i = this.getEffect(ModEffects.IRON_FIST.get()).amplifier;
            cir.setReturnValue(cir.getReturnValue() + 5f + i);
        }
    }
     */

    @Inject(method = "attack", at = @At("RETURN"))
    public void injectAttack(Entity entity, CallbackInfo ci) {
        if (this.hasEffect(InspireEffects.INFECTION)) {
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(InspireEffects.INFECTION, 1200));
            }
        }
    }

    /*
    @Redirect(method = "tryToStartFallFlying", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"))
    public boolean isElytra(ItemStack instance, Item item) {
        return (item == ModItems.CRAFTED_ELYTRA.get() || item == Items.ELYTRA);
    }

     */
        /*
    @Inject(method = "tick", at = @At("HEAD"))
    public void injectTick(CallbackInfo ci) {
        if (!this.getLevel().isClientSide()) {
            BlockState blockState = level.getBlockState(blockPosition());
            if (blockState.hasProperty(POWER)) {
                if (!(blockState.getValue(POWER) >= 1)) {
                    level.setBlock(blockPosition(), blockState.setValue(POWER, 1), 3);
                    level.setBlock(blockPosition(), blockState.setValue(POWER, 0), 3);
                }
            }
        }
    }

         */
}
