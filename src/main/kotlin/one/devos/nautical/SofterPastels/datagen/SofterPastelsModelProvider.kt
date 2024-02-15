package one.devos.nautical.SofterPastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks
import one.devos.nautical.SofterPastels.common.SofterPastelsItems
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks
import one.devos.nautical.SofterPastels.utils.helpers.datagen.DataGenModelGenerators


class SofterPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.RED_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)

        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK)

        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFence(
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK,
            blockStateModelGenerator
        )

        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createFenceGate(
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK,
            blockStateModelGenerator
        )

        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createWall(
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK,
            blockStateModelGenerator
        )

        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createSlabs(
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK,
            blockStateModelGenerator
        )

        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.WHITE_PASTEL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.RED_PASTEL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.ORANGE_PASTEL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.YELLOW_PASTEL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.GREEN_PASTEL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.BLUE_PASTEL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.PURPLE_PASTEL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.BROWN_PASTEL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.GRAY_PASTEL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )
        DataGenModelGenerators.createStairs(
            SofterPastelsBlocks.BLACK_PASTEL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK,
            blockStateModelGenerator
        )

        blockStateModelGenerator.createGlassBlocks(GlassBlocks.WHITE_GLASS, GlassBlocks.WHITE_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.LIGHT_RED_GLASS, GlassBlocks.LIGHT_RED_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.RED_GLASS, GlassBlocks.RED_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.ORANGE_GLASS, GlassBlocks.ORANGE_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.YELLOW_GLASS, GlassBlocks.YELLOW_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.LIGHT_GREEN_GLASS, GlassBlocks.LIGHT_GREEN_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.GREEN_GLASS, GlassBlocks.GREEN_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.LIGHT_BLUE_GLASS, GlassBlocks.LIGHT_BLUE_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.BLUE_GLASS, GlassBlocks.BLUE_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.PURPLE_GLASS, GlassBlocks.PURPLE_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.MAGENTA_GLASS, GlassBlocks.MAGENTA_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.BROWN_GLASS, GlassBlocks.BROWN_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.LIGHT_GRAY_GLASS, GlassBlocks.LIGHT_GRAY_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.GRAY_GLASS, GlassBlocks.GRAY_GLASS_PANE)
        blockStateModelGenerator.createGlassBlocks(GlassBlocks.BLACK_GLASS, GlassBlocks.BLACK_GLASS_PANE)

        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.WHITE_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_RED_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.RED_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.ORANGE_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.YELLOW_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_GREEN_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.GREEN_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_BLUE_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BLUE_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.PURPLE_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.MAGENTA_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BROWN_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.LIGHT_GRAY_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.GRAY_PASTEL_CARPET_BLOCK
        )
        blockStateModelGenerator.createFullAndCarpetBlocks(
            SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK,
            SofterPastelsBlocks.BLACK_PASTEL_CARPET_BLOCK
        )

        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.WHITE_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_RED_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.RED_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.ORANGE_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.YELLOW_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GREEN_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLUE_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.PURPLE_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.MAGENTA_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BROWN_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.GRAY_PASTEL_LIGHT_BLOCK)
        blockStateModelGenerator.createTrivialCube(SofterPastelsBlocks.BLACK_PASTEL_LIGHT_BLOCK)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(SofterPastelsItems.POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.WHITE_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_RED_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.RED_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.ORANGE_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.YELLOW_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GREEN_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GREEN_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_BLUE_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLUE_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.PURPLE_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.MAGENTA_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BROWN_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GRAY_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GRAY_POWDER, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLACK_POWDER, ModelTemplates.FLAT_ITEM)

        itemModelGenerator.generateFlatItem(SofterPastelsItems.WHITE_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_RED_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.RED_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.ORANGE_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.YELLOW_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GREEN_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GREEN_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_BLUE_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLUE_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.PURPLE_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.MAGENTA_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BROWN_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GRAY_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GRAY_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLACK_TAFFY, ModelTemplates.FLAT_HANDHELD_ITEM)

        itemModelGenerator.generateFlatItem(SofterPastelsItems.WHITE_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_RED_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.RED_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.ORANGE_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.YELLOW_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GREEN_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GREEN_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_BLUE_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLUE_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.PURPLE_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.MAGENTA_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BROWN_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GRAY_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GRAY_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLACK_COTTON_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)

        itemModelGenerator.generateFlatItem(SofterPastelsItems.WHITE_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_RED_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.RED_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.ORANGE_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.YELLOW_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GREEN_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GREEN_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_BLUE_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLUE_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.PURPLE_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.MAGENTA_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BROWN_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.LIGHT_GRAY_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.GRAY_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.BLACK_HARD_CANDY, ModelTemplates.FLAT_HANDHELD_ITEM)

        itemModelGenerator.generateFlatItem(SofterPastelsItems.COTTON_CANDY_ICE_CREAM, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.VANILLA_ICE_CREAM, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.STRAWBERRY_ICE_CREAM, ModelTemplates.FLAT_HANDHELD_ITEM)
        itemModelGenerator.generateFlatItem(SofterPastelsItems.CHOCOLATE_ICE_CREAM, ModelTemplates.FLAT_HANDHELD_ITEM)
    }
}