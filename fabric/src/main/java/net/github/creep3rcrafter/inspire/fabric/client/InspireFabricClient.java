package net.github.creep3rcrafter.inspire.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.github.creep3rcrafter.inspire.client.InspireCommonClient;

public final class InspireFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        InspireCommonClient.init();
    }
}
