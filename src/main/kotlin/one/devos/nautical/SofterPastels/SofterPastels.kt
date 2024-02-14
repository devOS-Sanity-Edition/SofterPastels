package one.devos.nautical.SofterPastels

import gay.asoji.fmw.FMW
import net.devtech.arrp.api.RRPCallback
import net.devtech.arrp.api.RuntimeResourcePack
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks
import one.devos.nautical.SofterPastels.common.SofterPastelsItems
import one.devos.nautical.SofterPastels.common.SofterPastelsTab
//import one.devos.nautical.SofterPastels.common.datagen.Blockstate
//import one.devos.nautical.SofterPastels.common.datagen.LootTables
//import one.devos.nautical.SofterPastels.common.datagen.Recipes
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object SofterPastels : ModInitializer {
    const val MOD_ID: String = "softerpastels"
    val VERSION: String = FMW.getVersionString(MOD_ID)
    val MOD_NAME: String = FMW.getName(MOD_ID)
//    var RUNTIME_RESOURCE_PACK: RuntimeResourcePack = RuntimeResourcePack.create(ResourceLocation(MOD_ID, "arrp"))

    val LOGGER: Logger = LogManager.getLogger(MOD_NAME)

    fun locate(location: String): ResourceLocation {
        return if (location.contains(":")) {
            ResourceLocation(location) //probably useful if its from another mod
        } else {
            ResourceLocation(MOD_ID, location) //so we can be lazy, or if its not from another mod
        }
    }

    val SP_ITEM_GROUP: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(SofterPastelsBlocks.RED_PASTEL_BLOCK) }
        .title(Component.translatable("itemGroup.softerpastels"))
        .displayItems(SofterPastelsTab::build)
        .build()

    override fun onInitialize() {
        SofterPastelsBlocks.init()
        SofterPastelsItems.init()

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, locate("main"), SP_ITEM_GROUP)

//        Blockstate.init()
//        LootTables.init()
//        Recipes.init()

//        RRPCallback.EVENT.register(RRPCallback { a -> a.add(RUNTIME_RESOURCE_PACK) })

        LOGGER.info("[${MOD_NAME}] Version ${VERSION} loaded.")
        LOGGER.info("[${MOD_NAME}] Getting ready to load some soft sweet eye candy.")
    }
}