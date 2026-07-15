package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.github.creep3rcrafter.inspire.utils.ColorUtils;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public abstract class AbstractArrowMixin extends Projectile {
    public AbstractArrowMixin(EntityType<? extends Projectile> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "onHitBlock", at = @At(value = "TAIL"))
    private void InjectOnHitBlock(BlockHitResult blockHitResult, CallbackInfo ci) {
        if (!level().isClientSide()) {
            ServerLevel serverLevel = (ServerLevel) level();
            if (ColorUtils.isGlass(serverLevel, blockHitResult.getBlockPos()) || ColorUtils.isGlassPane(serverLevel, blockHitResult.getBlockPos())) {
                if ((AbstractArrow) (Object) this instanceof CustomArrowEntity customArrow) {
                    if (!(customArrow.getTip() == 0.6f
                            || customArrow.getTip() == 0.65f
                            || customArrow.getTip() == 0.7f
                            || customArrow.getTip() == 0.75f
                            || customArrow.getTip() == 0.8f)) {
                        serverLevel.destroyBlock(blockHitResult.getBlockPos(), true, (AbstractArrow) (Object) this);
                        discard();
                    }
                } else {
                    serverLevel.destroyBlock(blockHitResult.getBlockPos(), true, (AbstractArrow) (Object) this);
                    discard();
                }
            }
        }
    }
}
