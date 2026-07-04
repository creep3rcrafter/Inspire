package net.github.creep3rcrafter.inspire.client.render;

import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class EtherEffects extends DimensionSpecialEffects {

    public EtherEffects() {
        super(Float.NaN, true, SkyType.NONE, false, true);
    }

    @Override
    public @NotNull Vec3 getBrightnessDependentFogColor(Vec3 vec3, float f) {
        return vec3.multiply(0.01, 0.1, 0.1);
    }

    @Override
    public boolean isFoggyAt(int i, int j) {
        return true;
    }

    @Override
    public @NotNull SkyType skyType() {
        return super.skyType();
    }
}
