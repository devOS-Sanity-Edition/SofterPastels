package one.devos.nautical.softerpastels.mixin.client;

import gay.asoji.fmw.FMW;
import gay.asoji.innerpastels.InnerPastels;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import one.devos.nautical.softerpastels.SofterPastels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(DebugScreenOverlay.class)
public class DevEnvDebugScreenOverlayMixin {


    @Inject(method = "getSystemInformation", at = @At("RETURN"))
    private void appendInfo(CallbackInfoReturnable<List<String>> cir) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            if (!FabricLoader.getInstance().isModLoaded("desolatedpastels")) {
                List<String> messages = cir.getReturnValue();

                messages.add("");
                messages.add("[" + FMW.getName(SofterPastels.MOD_ID) + " - Development Environment]");
                messages.add("Internal Library Version:" + FMW.getVersion("innerpastels"));
                messages.add("Version: " + FMW.getVersion(SofterPastels.MOD_ID));
            }
        }
    }
}
