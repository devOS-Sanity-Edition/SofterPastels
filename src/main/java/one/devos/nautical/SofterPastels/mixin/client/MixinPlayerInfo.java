// --------------------------------------------------------------------------------
// This code was taken from Create Steam n' Rails  under the MIT license
// and with permission from one of the developers, thank you for that!
//
// Check em out here https://github.com/Layers-of-Railways/Railway
// --------------------------------------------------------------------------------

package one.devos.nautical.SofterPastels.mixin.client;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.resources.ResourceLocation;
import one.devos.nautical.SofterPastels.SofterPastels;
import one.devos.nautical.SofterPastels.utils.CapeUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Objects;

@Mixin(value = PlayerInfo.class, priority = 1100)
public class MixinPlayerInfo {
    @Shadow
    @Final
    private GameProfile profile;

    @Shadow @Final
    private Map<MinecraftProfileTexture.Type, ResourceLocation> textureLocations;

    @Unique
    private boolean softerpastels$texturesLoaded;

    private static ResourceLocation DEV_CAPE = new ResourceLocation(SofterPastels.MOD_ID, "textures/misc/cape.png");

    @Inject(at = @At("HEAD"), method = "getCapeLocation")
    protected void registerTextures(CallbackInfoReturnable<ResourceLocation> cir) {
        if (!softerpastels$texturesLoaded && CapeUtils.INSTANCE.useDevCape(profile.getId())) {
            softerpastels$texturesLoaded = true;
            this.textureLocations.put(MinecraftProfileTexture.Type.CAPE, DEV_CAPE);
        }
    }

    @Inject(method = "getCapeLocation", at = @At("RETURN"), cancellable = true)
    private void skinCapeIfNeeded(CallbackInfoReturnable<ResourceLocation> cir) {
        if (Objects.equals(DEV_CAPE, cir.getReturnValue()) && !CapeUtils.INSTANCE.useDevCape(profile.getId())) {
            cir.setReturnValue(null);
        }
    }
}
