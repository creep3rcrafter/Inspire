package net.github.creep3rcrafter.inspire.toast;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.JukeboxSong;

public class NowPlayingToast {
    public static void show(JukeboxSong jukeboxSong) {
        Minecraft mc = Minecraft.getInstance();
        mc.execute(() -> {
            // getToastManager() and showNowPlayingToast() are not available in Minecraft 1.21.1
            // ToastManager toastGui = mc.getToastManager();
            mc.gui.setNowPlaying(jukeboxSong.description()); 
            // mc.getToastManager().showNowPlayingToast();
        });
    }
}
