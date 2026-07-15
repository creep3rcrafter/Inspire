package net.github.creep3rcrafter.inspire.mixin;

import net.github.creep3rcrafter.inspire.entity.projectile.CustomArrowEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.projectile.Projectile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Projectile.class)
public abstract class ProjectileMixin {
    @Redirect(method = {"shoot"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/util/RandomSource;triangle(DD)D"), require = 3)
    private double redirectShoot(RandomSource instance, double d, double e) {
        if ((Projectile) (Object) this instanceof CustomArrowEntity customArrow) {
            if (customArrow.getTail() == 0.0f) {
                if (customArrow.getRod() == 0.1f) {
                    return instance.triangle(d, e * 10f);
                }
            } else if (customArrow.getTail() == 0.05) {
                return instance.triangle(d, e * 0.25f);
            }
        }
        return instance.triangle(d, e);
    }
}
