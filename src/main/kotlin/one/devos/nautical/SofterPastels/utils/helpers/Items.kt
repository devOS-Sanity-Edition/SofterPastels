package one.devos.nautical.SofterPastels.utils.helpers

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import one.devos.nautical.SofterPastels.SofterPastels

object Items {
    fun registerItem(name: String?, item: Item): Item {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(SofterPastels.MOD_ID, name), item)
    }

    fun registerRegularItem(name: String?): Item {
        return registerItem(name, Item(Item.Properties()))
    }

    fun registerBlockItem(name: String?, block: Block?, tab: Int, properties: Item.Properties?): BlockItem {
        return Registry.register(
            BuiltInRegistries.ITEM,
            ResourceLocation(SofterPastels.MOD_ID, name),
            BlockItem(block, properties)
        )
    }
}
