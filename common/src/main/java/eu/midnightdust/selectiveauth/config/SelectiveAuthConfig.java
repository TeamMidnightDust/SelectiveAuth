package eu.midnightdust.selectiveauth.config;

import com.google.common.collect.Lists;
import eu.midnightdust.lib.config.MidnightConfig;

import java.util.List;

public class SelectiveAuthConfig extends MidnightConfig {
    @Entry public static List<String> authlessPlayers = Lists.newArrayList();
}