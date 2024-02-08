package one.devos.nautical.SofterPastels.utils.helpers;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class Items {
    public static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
    }

    public static BlockItem registerBlockItem(String name, Block block, int tab, Item.Properties properties) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, properties));
    }
}
