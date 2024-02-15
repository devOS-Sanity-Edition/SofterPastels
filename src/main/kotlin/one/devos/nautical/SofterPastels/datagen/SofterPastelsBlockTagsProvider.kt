package one.devos.nautical.SofterPastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.tags.BlockTags
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks
import java.util.concurrent.CompletableFuture

class SofterPastelsBlockTagsProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    companion object;

    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)

            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK)

            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK)

            .add(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK)

            .add(SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK)

            .add(SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK)

        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK)


        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK)

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK)

        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
            .add(SofterPastelsBlocks.WHITE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_RED_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.RED_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.ORANGE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.YELLOW_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.GREEN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BLUE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.PURPLE_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.MAGENTA_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BROWN_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.GRAY_PASTEL_CARPET_BLOCK)
            .add(SofterPastelsBlocks.BLACK_PASTEL_CARPET_BLOCK)
    }
}