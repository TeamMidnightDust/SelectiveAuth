package eu.midnightdust.selectiveauth;

import eu.midnightdust.selectiveauth.config.SelectiveAuthConfig;

public class SelectiveAuth {
    public static final String MOD_ID = "selectiveauth";

    public static void init() {
        SelectiveAuthConfig.init(MOD_ID, SelectiveAuthConfig.class);
    }
}
