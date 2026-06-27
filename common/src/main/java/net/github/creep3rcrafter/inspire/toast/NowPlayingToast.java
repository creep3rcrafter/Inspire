package net.github.creep3rcrafter.inspire.toast;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.toasts.ToastManager;
import net.minecraft.world.item.JukeboxSong;

public class NowPlayingToast {
    public static void show(JukeboxSong jukeboxSong) {
        Minecraft mc = Minecraft.getInstance();
        mc.execute(() -> {
            ToastManager toastGui = mc.getToastManager();
            mc.gui.setNowPlaying(jukeboxSong.description()); 
            mc.getToastManager().showNowPlayingToast();
        });
    }
}
