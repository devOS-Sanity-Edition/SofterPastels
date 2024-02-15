package one.devos.nautical.SofterPastels.common

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters
import net.minecraft.world.level.ItemLike
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks

object SofterPastelsTab {
    fun build(params: ItemDisplayParameters, output: CreativeModeTab.Output) {
        addBlocks(output)
        addDecorations(output)
        addCandy(output)
        addIceCream(output)
        addPowder(output)
    }

    private fun addBlocks(output: CreativeModeTab.Output) {
        addAll(
            output,
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_LIGHT_BLOCK,
            GlassBlocks.WHITE_GLASS_ITEM,
            GlassBlocks.WHITE_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_LIGHT_BLOCK,
            GlassBlocks.LIGHT_RED_GLASS_ITEM,
            GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_LIGHT_BLOCK,
            GlassBlocks.RED_GLASS_ITEM,
            GlassBlocks.RED_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_LIGHT_BLOCK,
            GlassBlocks.ORANGE_GLASS_ITEM,
            GlassBlocks.ORANGE_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_LIGHT_BLOCK,
            GlassBlocks.YELLOW_GLASS_ITEM,
            GlassBlocks.YELLOW_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_LIGHT_BLOCK,
            GlassBlocks.LIGHT_GREEN_GLASS_ITEM,
            GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_LIGHT_BLOCK,
            GlassBlocks.GREEN_GLASS_ITEM,
            GlassBlocks.GREEN_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_LIGHT_BLOCK,
            GlassBlocks.LIGHT_BLUE_GLASS_ITEM,
            GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_LIGHT_BLOCK,
            GlassBlocks.BLUE_GLASS_ITEM,
            GlassBlocks.BLUE_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK,
            GlassBlocks.PURPLE_GLASS_ITEM,
            GlassBlocks.PURPLE_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_LIGHT_BLOCK,
            GlassBlocks.MAGENTA_GLASS_ITEM,
            GlassBlocks.MAGENTA_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_LIGHT_BLOCK,
            GlassBlocks.BROWN_GLASS_ITEM,
            GlassBlocks.BROWN_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_LIGHT_BLOCK,
            GlassBlocks.LIGHT_GRAY_GLASS_ITEM,
            GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_LIGHT_BLOCK,
            GlassBlocks.GRAY_GLASS_ITEM,
            GlassBlocks.GRAY_GLASS_PANE_ITEM
        )
        addAll(
            output,
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_LIGHT_BLOCK,
            GlassBlocks.BLACK_GLASS_ITEM,
            GlassBlocks.BLACK_GLASS_PANE_ITEM
        )
    }

    private fun addDecorations(output: CreativeModeTab.Output) {
        addAll(
            output,
            SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_CARPET_BLOCK
        )
        addAll(
            output,
            SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_CARPET_BLOCK
        )
    }

    private fun addCandy(output: CreativeModeTab.Output) {
        addAll(
            output,
            SofterPastelsItems.WHITE_TAFFY,
            SofterPastelsItems.WHITE_COTTON_CANDY,
            SofterPastelsItems.WHITE_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.LIGHT_RED_TAFFY,
            SofterPastelsItems.LIGHT_RED_COTTON_CANDY,
            SofterPastelsItems.LIGHT_RED_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.RED_TAFFY,
            SofterPastelsItems.RED_COTTON_CANDY,
            SofterPastelsItems.RED_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.ORANGE_TAFFY,
            SofterPastelsItems.ORANGE_COTTON_CANDY,
            SofterPastelsItems.ORANGE_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.YELLOW_TAFFY,
            SofterPastelsItems.YELLOW_COTTON_CANDY,
            SofterPastelsItems.YELLOW_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.LIGHT_GREEN_TAFFY,
            SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY,
            SofterPastelsItems.LIGHT_GREEN_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.GREEN_TAFFY,
            SofterPastelsItems.GREEN_COTTON_CANDY,
            SofterPastelsItems.GREEN_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.LIGHT_BLUE_TAFFY,
            SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY,
            SofterPastelsItems.LIGHT_BLUE_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.BLUE_TAFFY,
            SofterPastelsItems.BLUE_COTTON_CANDY,
            SofterPastelsItems.BLUE_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.PURPLE_TAFFY,
            SofterPastelsItems.PURPLE_COTTON_CANDY,
            SofterPastelsItems.PURPLE_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.MAGENTA_TAFFY,
            SofterPastelsItems.MAGENTA_COTTON_CANDY,
            SofterPastelsItems.MAGENTA_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.BROWN_TAFFY,
            SofterPastelsItems.BROWN_COTTON_CANDY,
            SofterPastelsItems.BROWN_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.LIGHT_GRAY_TAFFY,
            SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY,
            SofterPastelsItems.LIGHT_GRAY_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.GRAY_TAFFY,
            SofterPastelsItems.GRAY_COTTON_CANDY,
            SofterPastelsItems.GRAY_HARD_CANDY
        )
        addAll(
            output,
            SofterPastelsItems.BLACK_TAFFY,
            SofterPastelsItems.BLACK_COTTON_CANDY,
            SofterPastelsItems.BLACK_HARD_CANDY
        )
    }

    private fun addIceCream(output: CreativeModeTab.Output) {
        addAll(
            output,
            SofterPastelsItems.COTTON_CANDY_ICE_CREAM,
            SofterPastelsItems.CHOCOLATE_ICE_CREAM,
            SofterPastelsItems.STRAWBERRY_ICE_CREAM,
            SofterPastelsItems.VANILLA_ICE_CREAM
        )
    }

    private fun addPowder(output: CreativeModeTab.Output) {
        output.accept(SofterPastelsItems.WHITE_POWDER)
        output.accept(SofterPastelsItems.LIGHT_RED_POWDER)
        output.accept(SofterPastelsItems.RED_POWDER)
        output.accept(SofterPastelsItems.ORANGE_POWDER)
        output.accept(SofterPastelsItems.YELLOW_POWDER)
        output.accept(SofterPastelsItems.LIGHT_GREEN_POWDER)
        output.accept(SofterPastelsItems.GREEN_POWDER)
        output.accept(SofterPastelsItems.LIGHT_BLUE_POWDER)
        output.accept(SofterPastelsItems.BLUE_POWDER)
        output.accept(SofterPastelsItems.PURPLE_POWDER)
        output.accept(SofterPastelsItems.MAGENTA_POWDER)
        output.accept(SofterPastelsItems.BROWN_POWDER)
        output.accept(SofterPastelsItems.LIGHT_GRAY_POWDER)
        output.accept(SofterPastelsItems.GRAY_POWDER)
        output.accept(SofterPastelsItems.BLACK_POWDER)

        output.accept(SofterPastelsItems.POWDER)
    }

    private fun addAll(output: CreativeModeTab.Output, vararg items: ItemLike) {
        for (item in items) {
            output.accept(item)
        }
    }
}