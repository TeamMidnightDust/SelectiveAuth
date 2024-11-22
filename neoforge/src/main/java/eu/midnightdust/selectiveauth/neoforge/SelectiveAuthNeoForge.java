package eu.midnightdust.selectiveauth.neoforge;

import eu.midnightdust.selectiveauth.SelectiveAuth;
import net.neoforged.fml.common.Mod;

import static eu.midnightdust.selectiveauth.SelectiveAuth.MOD_ID;

@Mod(value = MOD_ID)
public class SelectiveAuthNeoForge {
    public SelectiveAuthNeoForge() {
        SelectiveAuth.init();
    }
}