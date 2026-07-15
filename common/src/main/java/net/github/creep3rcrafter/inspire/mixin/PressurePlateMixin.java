package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.register.InspireEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BasePressurePlateBlock.class)
public class PressurePlateMixin {
    @Inject(method = "checkPressed", at = @At("HEAD"), cancellable = true)
    public void injectCheckPressed(Entity entity, Level level, BlockPos blockPos, BlockState blockState, int i, CallbackInfo ci) {
        if (entity instanceof LivingEntity && ((LivingEntity) entity).hasEffect(InspireEffects.NIMBLE)) {
            ci.cancel();
        }
    }
}
