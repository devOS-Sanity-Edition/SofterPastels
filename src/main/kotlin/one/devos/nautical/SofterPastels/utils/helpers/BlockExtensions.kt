package one.devos.nautical.SofterPastels.utils.helpers

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.material.MapColor
import one.devos.nautical.SofterPastels.SofterPastels
import one.devos.nautical.SofterPastels.common.blocks.FenceGateBlock
import one.devos.nautical.SofterPastels.common.blocks.StairBlocks
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelBlock
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelCarpet
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelFence
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelFenceGate
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelGlass
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelGlassPane
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelLight
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelPowder
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelSlab
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelStair
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelWall
import one.devos.nautical.SofterPastels.utils.BlockProperties.PastelWool


// a lot of this was written by storm so if there's shit that could be reused/abstracted, yell at her, not me - asoji

/**
 * Registers a block to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the block
 * @return [Block]
 */
fun Block.registerBlock(name: String): Block =
    Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(SofterPastels.MOD_ID, name), this)

/**
 * Registers an item to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the item
 * @return [BlockItem]
 */
fun Block.registerBlockItem(name: String): BlockItem = Registry.register(
    BuiltInRegistries.ITEM,
    ResourceLocation(SofterPastels.MOD_ID, name),
    BlockItem(this, Item.Properties())
)

/**
 * Registers a block & item to the Minecraft registry with the resource location set to the mod id
 * @property name the ID of the block
 * @return [Block]
 */
fun Block.registerBlockWithItem(name: String): Block {
    this.registerBlockItem(name)
    return this.registerBlock(name)
}

/**
 * Registers a stained-glass block copying the settings of white stained-glass with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerGlassBlock(name: String): Block =
    StainedGlassBlock(this, PastelGlass().mapColor(this)).registerBlock(name)

/**
 * Registers a stained-glass pane block copying the settings of white stained-glass with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerGlassPaneBlock(name: String): Block =
    StainedGlassPaneBlock(this, PastelGlassPane().mapColor(this)).registerBlock(name)

/**
 * Registers a pastel block with an accompanying item with the color based on a [DyeColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun DyeColor.registerPastelBlock(name: String): Block = Block(PastelBlock().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers a pastel block with an accompanying item with the color based on a [MapColor]
 * @property name the ID of the block
 * @return [Block]
 */
fun MapColor.registerPastelBlock(name: String): Block = Block(PastelBlock().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers a pastel powder block with an accompanying item with the color based on a [DyeColor], paired with an accompanying normal pastel block when touched with water
 * @property name the ID of the block
 * @property resultPastelBlock the accompanying normal pastel block
 * @return [ConcretePowderBlock]
 */
fun DyeColor.registerPastelPowderBlock(name: String, resultPastelBlock: Block): Block =
    ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers a pastel powder block with an accompanying item with the color based on a [MapColor], paired with an accompanying normal pastel block when touched with water
 * @property name the ID of the block
 * @property resultPastelBlock the accompanying normal pastel block
 * @return [ConcretePowderBlock]
 */
fun MapColor.registerPastelPowderBlock(name: String, resultPastelBlock: Block): Block =
    ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers a pastel fence block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceBlock]
 */
fun DyeColor.registerPastelFenceBlock(name: String): Block =
    FenceBlock(PastelFence().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers a pastel fence block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceBlock]
 */
fun MapColor.registerPastelFenceBlock(name: String): Block =
    FenceBlock(PastelFence().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel fence gate block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceGateBlock]
 */
fun DyeColor.registerPastelFenceGateBlock(name: String): Block =
    FenceGateBlock(PastelFenceGate().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel fence gate block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [FenceGateBlock]
 */
fun MapColor.registerPastelFenceGateBlock(name: String): Block =
    FenceGateBlock(PastelFenceGate().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel wall block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the ID of the block
 * @return [WallBlock]
 */
fun DyeColor.registerPastelWallBlock(name: String): Block =
    WallBlock(PastelWall().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel wall block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the ID of the block
 * @return [WallBlock]
 */
fun MapColor.registerPastelWallBlock(name: String): Block =
    WallBlock(PastelWall().mapColor(this)).registerBlockWithItem(name)

// i'm going to cry
// fucking same bestie
// feb 9th 2024, lets say asoji learned about the CTRL D bind from Storm and feels fucking stupid

/**
 * Registers the pastel slab block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [SlabBlock]
 */
fun DyeColor.registerPastelSlabBlock(name: String): Block =
    SlabBlock(PastelSlab().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel slab block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [SlabBlock]
 */
fun MapColor.registerPastelSlabBlock(name: String): Block =
    SlabBlock(PastelSlab().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel stair block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [StairBlocks]
 */
fun DyeColor.registerPastelStairsBlock(name: String): Block = StairBlocks(
    Blocks.STONE_STAIRS.defaultBlockState(),
    PastelStair().mapColor(this)
).registerBlockWithItem(name)

/**
 * Registers the pastel stair block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [StairBlocks]
 */
fun MapColor.registerPastelStairsBlock(name: String): Block = StairBlocks(
    Blocks.STONE_STAIRS.defaultBlockState(),
    PastelStair().mapColor(this)
).registerBlockWithItem(name)

/**
 * Registers the pastel wool block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerWoolBlock(name: String): Block = Block(PastelWool().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel wool block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerWoolBlock(name: String): Block = Block(PastelWool().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel light block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerLightBlock(name: String): Block = Block(PastelLight().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel light block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerLightBlock(name: String): Block = Block(PastelLight().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel carpet block with an accompanying item with a chosen [DyeColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun DyeColor.registerCarpetBlock(name: String): Block =
    CarpetBlock(PastelCarpet().mapColor(this)).registerBlockWithItem(name)

/**
 * Registers the pastel carpet block with an accompanying item with a chosen [MapColor] to be shown on a map
 * @property name the IDE of the block
 * @return [Block]
 */
fun MapColor.registerCarpetBlock(name: String): Block =
    CarpetBlock(PastelCarpet().mapColor(this)).registerBlockWithItem(name)
