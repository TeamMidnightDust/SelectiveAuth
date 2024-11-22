package eu.midnightdust.selectiveauth.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import eu.midnightdust.selectiveauth.config.SelectiveAuthConfig;
import net.minecraft.server.network.ServerLoginNetworkHandler;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerLoginNetworkHandler.class)
public class MixinServerLoginNetworkHandler {
    @Shadow @Nullable String profileName;

    @ModifyExpressionValue(
            method = "onHello",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/server/MinecraftServer;isOnlineMode()Z")
    )
    private boolean selectiveauth$skipAuthForSelectedPlayers(boolean isOnlineMode) {
        return isOnlineMode && !SelectiveAuthConfig.authlessPlayers.contains(this.profileName);
    }
}
