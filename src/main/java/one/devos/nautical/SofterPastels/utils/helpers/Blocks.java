package one.devos.nautical.SofterPastels.utils.helpers;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class Blocks {
    public static Block registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerGlassBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static BlockItem registerGlassBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties()));
    }
}
