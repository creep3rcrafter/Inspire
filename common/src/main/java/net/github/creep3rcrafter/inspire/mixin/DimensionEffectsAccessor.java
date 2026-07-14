package net.github.creep3rcrafter.inspire.mixin;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(DimensionSpecialEffects.class)
public interface DimensionEffectsAccessor {
    /*
    @Inject(method = "method_29092", at = @At(value = "HEAD"))
    private static void InjectMake(Object2ObjectArrayMap<ResourceLocation, DimensionSpecialEffects> object2ObjectArrayMap, CallbackInfo ci) {
        object2ObjectArrayMap.put(EtherEffects.ETHER_EFFECTS, new EtherEffects());
    }

     */

    @Accessor("EFFECTS")
    static Object2ObjectMap<ResourceLocation, DimensionSpecialEffects> getIdentifierMap() {
        throw new AssertionError("This should not occur!");
    }
}
