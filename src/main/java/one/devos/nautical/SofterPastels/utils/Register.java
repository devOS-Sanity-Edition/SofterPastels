package one.devos.nautical.SofterPastels.utils;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import one.devos.nautical.SofterPastels.SofterPastels;

import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class Register {
    public static Block registerBlock(String name, Block block, int tab) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(SofterPastels.SP_ITEM_GROUP).tab(tab)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerCrop(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerGlassBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static BlockItem registerGlassBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(SofterPastels.SP_ITEM_GROUP).tab(1)));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }
    public static BlockItem registerBlockItem(String name, Block block, int tab, Item.Properties properties) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, properties));
    }
}
