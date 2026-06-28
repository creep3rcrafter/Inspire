package net.github.creep3rcrafter.inspire.fabric.client.mixin;

import net.github.creep3rcrafter.inspire.register.InspireItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(targets = "com.blackgear.vanillabackport.client.level.entities.layer.GhastHarnessHandler")
public abstract class GhastHarnessHandlerMixin {
    @Shadow
    @Final
    private static Map<ItemStack, ResourceLocation> HARNESS_EQUIPMENT;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void inspire$registerCustomHarness(CallbackInfo ci) {
        HARNESS_EQUIPMENT.put(
                new ItemStack(InspireItems.HARNESS.get()),
                ResourceLocation.fromNamespaceAndPath("inspire", "textures/entity/equipment/happy_ghast_body/regular_harness.png")
        );
    }
}
