package net.github.creep3rcrafter.inspire.client.mixin;

import net.minecraft.client.sounds.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SoundEngine.class)
public abstract class SoundEventMixin {

    /*
    @Redirect(method = "play", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/sounds/SoundInstance;isRelative()Z"))
    private boolean redirectPlayIsRelative(SoundInstance instance){
        if (instance.getSource() == SoundSource.RECORDS)
        return false;
    }
    @Redirect(method = "play", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/sounds/SoundInstance;getAttenuation()Lnet/minecraft/client/resources/sounds/SoundInstance$Attenuation;"))
    private SoundInstance.Attenuation redirectPlayGetAttenuation(SoundInstance instance){
        //L11.alSourcei(this.source, AL11.AL_SOURCE_RELATIVE, AL11.AL_FALSE); // Not relative to listener
        //AL11.alSourcei(this.source, AL11.AL_ROLLOFF_FACTOR, 1); // Standard attenuation
        return SoundInstance.Attenuation.LINEAR;
    }
    @Redirect(method = "play", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/resources/sounds/Sound;getAttenuationDistance()I"))
    private int redirectPlayGetAttenuationDistance(Sound instance){
        return 16;
    }
     */
}
