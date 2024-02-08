package one.devos.nautical.SofterPastels;

import gay.asoji.fmw.FMW;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;
import one.devos.nautical.SofterPastels.common.SofterPastelsTab;
import one.devos.nautical.SofterPastels.common.datagen.Blockstate;
import one.devos.nautical.SofterPastels.common.datagen.LootTables;
import one.devos.nautical.SofterPastels.common.datagen.Recipes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SofterPastels implements ModInitializer {
    public static final String MOD_ID = "softerpastels";
    public static final String VERSION = FMW.getVersionString(MOD_ID);
    public static final String MOD_NAME = FMW.getName(MOD_ID);
    public static final RuntimeResourcePack RUNTIME_RESOURCE_PACK = RuntimeResourcePack.create(new ResourceLocation(MOD_ID, "arrp"));

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static ResourceLocation locate(String location) {
        if (location.contains(":")) {
            return new ResourceLocation(location); //probably useful if its from another mod
        } else {
            return new ResourceLocation(MOD_ID, location); //so we can be lazy, or if its not from another mod
        }
    }

    public static final CreativeModeTab SP_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SofterPastelsBlocks.RED_PASTEL_BLOCK))
            .title(Component.translatable("itemGroup.softerpastels"))
            .displayItems(SofterPastelsTab::build)
            .build();

    @Override
    public void onInitialize() {
        SofterPastelsBlocks.init();
        SofterPastelsItems.init();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, locate("main"), SP_ITEM_GROUP);

        Blockstate.init();
        LootTables.init();
        Recipes.init();

        RRPCallback.EVENT.register(a -> a.add(SofterPastels.RUNTIME_RESOURCE_PACK));

        LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded.");
        LOGGER.info("[" + MOD_NAME + "] " + "Getting ready to load some soft sweet eye candy.");
    }
}
