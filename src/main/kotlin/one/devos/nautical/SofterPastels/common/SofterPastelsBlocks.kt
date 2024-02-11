package one.devos.nautical.SofterPastels.common

import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.material.MapColor
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks
import one.devos.nautical.SofterPastels.utils.helpers.*

object SofterPastelsBlocks {
    val WHITE_PASTEL_BLOCK: Block = DyeColor.WHITE.registerPastelBlock("white_pastel_block")
    val WHITE_PASTEL_POWDER_BLOCK: Block =
        DyeColor.WHITE.registerPastelPowderBlock("white_pastel_powder_block", WHITE_PASTEL_BLOCK)
    val WHITE_PASTEL_FENCE_BLOCK: Block = DyeColor.WHITE.registerPastelFenceBlock("white_fence")
    val WHITE_PASTEL_FENCE_GATE_BLOCK: Block = DyeColor.WHITE.registerPastelFenceGateBlock("white_fence_gate")
    val WHITE_PASTEL_WALL_BLOCK: Block = DyeColor.WHITE.registerPastelWallBlock("white_wall")
    val WHITE_PASTEL_SLAB_BLOCK: Block = DyeColor.WHITE.registerPastelSlabBlock("white_slab")
    val WHITE_PASTEL_STAIR_BLOCK: Block = DyeColor.WHITE.registerPastelStairsBlock("white_stairs")
    val WHITE_PASTEL_WOOL_BLOCK: Block = DyeColor.WHITE.registerWoolBlock("white_wool")
    val WHITE_PASTEL_LIGHT_BLOCK: Block = DyeColor.WHITE.registerLightBlock("white_light")
    val WHITE_PASTEL_CARPET_BLOCK: Block = DyeColor.WHITE.registerCarpetBlock("white_carpet")

    val LIGHT_RED_PASTEL_BLOCK: Block = MapColor.COLOR_PINK.registerPastelBlock("light_red_pastel_block")
    val LIGHT_RED_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_PINK.registerPastelPowderBlock("light_red_pastel_powder_block", LIGHT_RED_PASTEL_BLOCK)
    val LIGHT_RED_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_PINK.registerPastelFenceBlock("light_red_fence")
    val LIGHT_RED_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_PINK.registerPastelFenceGateBlock("light_red_fence_gate")
    val LIGHT_RED_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_PINK.registerPastelWallBlock("light_red_wall")
    val LIGHT_RED_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_PINK.registerPastelSlabBlock("light_red_slab")
    val LIGHT_RED_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_PINK.registerPastelStairsBlock("light_red_stairs")
    val LIGHT_RED_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_PINK.registerWoolBlock("light_red_wool")
    val LIGHT_RED_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_PINK.registerLightBlock("light_red_light")
    val LIGHT_RED_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_PINK.registerCarpetBlock("light_red_carpet")

    val RED_PASTEL_BLOCK: Block = MapColor.COLOR_RED.registerPastelBlock("red_pastel_block")
    val RED_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_RED.registerPastelPowderBlock("red_pastel_powder_block", RED_PASTEL_BLOCK)
    val RED_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_RED.registerPastelFenceBlock("red_fence")
    val RED_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_RED.registerPastelFenceGateBlock("red_fence_gate")
    val RED_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_RED.registerPastelWallBlock("red_wall")
    val RED_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_RED.registerPastelSlabBlock("red_slab")
    val RED_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_RED.registerPastelStairsBlock("red_stairs")
    val RED_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_RED.registerWoolBlock("red_wool")
    val RED_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_RED.registerLightBlock("red_light")
    val RED_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_RED.registerCarpetBlock("red_carpet")

    val ORANGE_PASTEL_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelBlock("orange_pastel_block")
    val ORANGE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_ORANGE.registerPastelPowderBlock("orange_pastel_powder_block", ORANGE_PASTEL_BLOCK)
    val ORANGE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelFenceBlock("orange_fence")
    val ORANGE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelFenceGateBlock("orange_fence_gate")
    val ORANGE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelWallBlock("orange_wall")
    val ORANGE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelSlabBlock("orange_slab")
    val ORANGE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_ORANGE.registerPastelStairsBlock("orange_stairs")
    val ORANGE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_ORANGE.registerWoolBlock("orange_wool")
    val ORANGE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_ORANGE.registerLightBlock("orange_light")
    val ORANGE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_ORANGE.registerCarpetBlock("orange_carpet")

    val YELLOW_PASTEL_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelBlock("yellow_pastel_block")
    val YELLOW_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_YELLOW.registerPastelPowderBlock("yellow_pastel_powder_block", YELLOW_PASTEL_BLOCK)
    val YELLOW_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelFenceBlock("yellow_fence")
    val YELLOW_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelFenceGateBlock("yellow_fence_gate")
    val YELLOW_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelWallBlock("yellow_wall")
    val YELLOW_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelSlabBlock("yellow_slab")
    val YELLOW_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_YELLOW.registerPastelStairsBlock("yellow_stairs")
    val YELLOW_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_YELLOW.registerWoolBlock("yellow_wool")
    val YELLOW_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_YELLOW.registerLightBlock("yellow_light")
    val YELLOW_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_YELLOW.registerCarpetBlock("yellow_carpet")

    val LIGHT_GREEN_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelBlock("light_green_pastel_block")
    val LIGHT_GREEN_PASTEL_POWDER_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelPowderBlock(
        "light_green_pastel_powder_block",
        LIGHT_GREEN_PASTEL_BLOCK
    )
    val LIGHT_GREEN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelFenceBlock("light_green_fence")
    val LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_GREEN.registerPastelFenceGateBlock("light_green_fence_gate")
    val LIGHT_GREEN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelWallBlock("light_green_wall")
    val LIGHT_GREEN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelSlabBlock("light_green_slab")
    val LIGHT_GREEN_PASTEL_STAIR_BLOCK: Block =
        MapColor.COLOR_LIGHT_GREEN.registerPastelStairsBlock("light_green_stairs")
    val LIGHT_GREEN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerWoolBlock("light_green_wool")
    val LIGHT_GREEN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerLightBlock("light_green_light")
    val LIGHT_GREEN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_GREEN.registerCarpetBlock("light_green_carpet")

    val GREEN_PASTEL_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelBlock("green_pastel_block")
    val GREEN_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_GREEN.registerPastelPowderBlock("green_pastel_powder_block", GREEN_PASTEL_BLOCK)
    val GREEN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelFenceBlock("green_fence")
    val GREEN_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelFenceGateBlock("green_fence_gate")
    val GREEN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelWallBlock("green_wall")
    val GREEN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelSlabBlock("green_slab")
    val GREEN_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_GREEN.registerPastelStairsBlock("green_stairs")
    val GREEN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_GREEN.registerWoolBlock("green_wool")
    val GREEN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_GREEN.registerLightBlock("green_light")
    val GREEN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_GREEN.registerCarpetBlock("green_carpet")

    val LIGHT_BLUE_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelBlock("light_blue_pastel_block")
    val LIGHT_BLUE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_LIGHT_BLUE.registerPastelPowderBlock("light_blue_pastel_powder_block", LIGHT_BLUE_PASTEL_BLOCK)
    val LIGHT_BLUE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelFenceBlock("light_blue_fence")
    val LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_BLUE.registerPastelFenceGateBlock("light_blue_fence_gate")
    val LIGHT_BLUE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelWallBlock("light_blue_wall")
    val LIGHT_BLUE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelSlabBlock("light_blue_slab")
    val LIGHT_BLUE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelStairsBlock("light_blue_stairs")
    val LIGHT_BLUE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerWoolBlock("light_blue_wool")
    val LIGHT_BLUE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerLightBlock("light_blue_light")
    val LIGHT_BLUE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_BLUE.registerCarpetBlock("light_blue_carpet")

    val BLUE_PASTEL_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelBlock("blue_pastel_block")
    val BLUE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BLUE.registerPastelPowderBlock("blue_pastel_powder_block", BLUE_PASTEL_BLOCK)
    val BLUE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelFenceBlock("blue_fence")
    val BLUE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelFenceGateBlock("blue_fence_gate")
    val BLUE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelWallBlock("blue_wall")
    val BLUE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelSlabBlock("blue_slab")
    val BLUE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BLUE.registerPastelStairsBlock("blue_stairs")
    val BLUE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BLUE.registerWoolBlock("blue_wool")
    val BLUE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BLUE.registerLightBlock("blue_light")
    val BLUE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BLUE.registerCarpetBlock("blue_carpet")

    val PURPLE_PASTEL_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelBlock("purple_pastel_block")
    val PURPLE_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_PURPLE.registerPastelPowderBlock("purple_pastel_powder_block", PURPLE_PASTEL_BLOCK)
    val PURPLE_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelFenceBlock("purple_fence")
    val PURPLE_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelFenceGateBlock("purple_fence_gate")
    val PURPLE_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelWallBlock("purple_wall")
    val PURPLE_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelSlabBlock("purple_slab")
    val PURPLE_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_PURPLE.registerPastelStairsBlock("purple_stairs")
    val PURPLE_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_PURPLE.registerWoolBlock("purple_wool")
    val PURPLE_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_PURPLE.registerLightBlock("purple_light")
    val PURPLE_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_PURPLE.registerCarpetBlock("purple_carpet")

    val MAGENTA_PASTEL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelBlock("magenta_pastel_block")
    val MAGENTA_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_MAGENTA.registerPastelPowderBlock("magenta_pastel_powder_block", MAGENTA_PASTEL_BLOCK)
    val MAGENTA_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelFenceBlock("magenta_fence")
    val MAGENTA_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_MAGENTA.registerPastelFenceGateBlock("magenta_fence_gate")
    val MAGENTA_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelWallBlock("magenta_wall")
    val MAGENTA_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelSlabBlock("magenta_slab")
    val MAGENTA_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_MAGENTA.registerPastelStairsBlock("magenta_stairs")
    val MAGENTA_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_MAGENTA.registerWoolBlock("magenta_wool")
    val MAGENTA_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_MAGENTA.registerLightBlock("magenta_light")
    val MAGENTA_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_MAGENTA.registerCarpetBlock("magenta_carpet")

    val BROWN_PASTEL_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelBlock("brown_pastel_block")
    val BROWN_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BROWN.registerPastelPowderBlock("brown_pastel_powder_block", BROWN_PASTEL_BLOCK)
    val BROWN_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelFenceBlock("brown_fence")
    val BROWN_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelFenceGateBlock("brown_fence_gate")
    val BROWN_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelWallBlock("brown_wall")
    val BROWN_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelSlabBlock("brown_slab")
    val BROWN_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BROWN.registerPastelStairsBlock("brown_stairs")
    val BROWN_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BROWN.registerWoolBlock("brown_wool")
    val BROWN_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BROWN.registerLightBlock("brown_light")
    val BROWN_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BROWN.registerCarpetBlock("brown_carpet")

    val LIGHT_GRAY_PASTEL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelBlock("light_gray_pastel_block")
    val LIGHT_GRAY_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_LIGHT_GRAY.registerPastelPowderBlock("light_gray_pastel_powder_block", LIGHT_GRAY_PASTEL_BLOCK)
    val LIGHT_GRAY_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelFenceBlock("light_gray_fence")
    val LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK: Block =
        MapColor.COLOR_LIGHT_GRAY.registerPastelFenceGateBlock("light_gray_fence_gate")
    val LIGHT_GRAY_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelWallBlock("light_gray_wall")
    val LIGHT_GRAY_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelSlabBlock("light_gray_slab")
    val LIGHT_GRAY_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelStairsBlock("light_gray_stairs")
    val LIGHT_GRAY_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerWoolBlock("light_gray_wool")
    val LIGHT_GRAY_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerLightBlock("light_gray_light")
    val LIGHT_GRAY_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_LIGHT_GRAY.registerCarpetBlock("light_gray_carpet")

    val GRAY_PASTEL_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelBlock("gray_pastel_block")
    val GRAY_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_GRAY.registerPastelPowderBlock("gray_pastel_powder_block", GRAY_PASTEL_BLOCK)
    val GRAY_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelFenceBlock("gray_fence")
    val GRAY_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelFenceGateBlock("gray_fence_gate")
    val GRAY_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelWallBlock("gray_wall")
    val GRAY_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelSlabBlock("gray_slab")
    val GRAY_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_GRAY.registerPastelStairsBlock("gray_stairs")
    val GRAY_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_GRAY.registerWoolBlock("gray_wool")
    val GRAY_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_GRAY.registerLightBlock("gray_light")
    val GRAY_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_GRAY.registerCarpetBlock("gray_carpet")

    val BLACK_PASTEL_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelBlock("black_pastel_block")
    val BLACK_PASTEL_POWDER_BLOCK: Block =
        MapColor.COLOR_BLACK.registerPastelPowderBlock("black_pastel_powder_block", BLACK_PASTEL_BLOCK)
    val BLACK_PASTEL_FENCE_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelFenceBlock("black_fence")
    val BLACK_PASTEL_FENCE_GATE_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelFenceGateBlock("black_fence_gate")
    val BLACK_PASTEL_WALL_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelWallBlock("black_wall")
    val BLACK_PASTEL_SLAB_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelSlabBlock("black_slab")
    val BLACK_PASTEL_STAIR_BLOCK: Block = MapColor.COLOR_BLACK.registerPastelStairsBlock("black_stairs")
    val BLACK_PASTEL_WOOL_BLOCK: Block = MapColor.COLOR_BLACK.registerWoolBlock("black_wool")
    val BLACK_PASTEL_LIGHT_BLOCK: Block = MapColor.COLOR_BLACK.registerLightBlock("black_light")
    val BLACK_PASTEL_CARPET_BLOCK: Block = MapColor.COLOR_BLACK.registerCarpetBlock("black_carpet")

    fun init() {
        GlassBlocks.init()
    }
}