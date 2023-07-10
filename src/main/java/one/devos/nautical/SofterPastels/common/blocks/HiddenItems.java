package one.devos.nautical.SofterPastels.common.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class HiddenItems {
    public static final Item LOGO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "logo"), new Item(new Item.Properties().stacksTo(-1))); //I really don't know a better way to do this for the haha funny itemGroup icon
}
