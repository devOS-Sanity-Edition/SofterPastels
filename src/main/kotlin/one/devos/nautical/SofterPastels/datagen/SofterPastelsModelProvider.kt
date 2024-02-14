package one.devos.nautical.SofterPastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.*
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.SofterPastels.SofterPastels
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks


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
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {

    }
}