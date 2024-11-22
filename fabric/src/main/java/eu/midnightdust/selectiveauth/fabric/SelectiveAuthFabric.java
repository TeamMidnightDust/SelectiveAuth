package eu.midnightdust.selectiveauth.fabric;

import eu.midnightdust.selectiveauth.SelectiveAuth;
import net.fabricmc.api.ModInitializer;

public class SelectiveAuthFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SelectiveAuth.init();
    }
}
