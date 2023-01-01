package one.devos.nautical.SofterPastels;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.gui.ItemGroupButton;
import net.devtech.arrp.api.RRPCallback;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;
import one.devos.nautical.SofterPastels.common.datagen.LootTables;
import one.devos.nautical.SofterPastels.common.datagen.Recipes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.devtech.arrp.api.RuntimeResourcePack;

public class SofterPastels implements ModInitializer {
    public static final String MOD_ID = "softerpastels";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();
    public static final RuntimeResourcePack RUNTIME_RESOURCE_PACK = RuntimeResourcePack.create(new ResourceLocation(MOD_ID, "arrp"));


    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static ResourceLocation locate(String location) {
        if (location.contains(":")) {
            return new ResourceLocation(location); //probably useful if its from another mod
        } else {
            return new ResourceLocation(MOD_ID, location); //so we can be lazy, or if its not from another mod
        }
    }

    public static final OwoItemGroup SP_ITEM_GROUP = new OwoItemGroup(new ResourceLocation(MOD_ID, "softerpastels")) {
        @Override
        protected void setup() {
            keepStaticTitle();
            addTab(Icon.of(SofterPastelsBlocks.RED_PASTEL_BLOCK), "blocks", null);
            addTab(Icon.of(GlassBlocks.RED_GLASS_ITEM), "decorations", null);
            addTab(Icon.of(SofterPastelsItems.WHITE_TAFFY), "items", null);

            addButton(ItemGroupButton.github("https://github.com/devOS-Sanity-Edition/SofterPastels"));
            addButton(ItemGroupButton.link(Icon.of(new ResourceLocation("owo", "textures/gui/icons.png"), 0, 0, 64, 64), "issues", "https://github.com/devOS-Sanity-Edition/SofterPastels/issues"));
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SofterPastelsBlocks.RED_PASTEL_BLOCK);
        }
    };

    @Override
    public void onInitialize() {
        SP_ITEM_GROUP.initialize();
        SofterPastelsBlocks.init();
        SofterPastelsItems.init();

        LootTables.init();
        Recipes.init();

        RRPCallback.EVENT.register(a -> a.add(SofterPastels.RUNTIME_RESOURCE_PACK));

        LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded.");
        LOGGER.info("[" + MOD_NAME + "] " + "Getting ready to load some soft sweet eye candy.");
    }
}
