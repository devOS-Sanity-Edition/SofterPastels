package one.devos.nautical.SofterPastels.common;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import one.devos.nautical.SofterPastels.common.blocks.FenceGateBlock;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;
import one.devos.nautical.SofterPastels.common.blocks.StairBlocks;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copyOf;
import static net.minecraft.world.level.block.Blocks.*;
import static one.devos.nautical.SofterPastels.utils.BlockProperties.PastelBlock;
import static one.devos.nautical.SofterPastels.utils.BlockProperties.PastelPowder;
import static one.devos.nautical.SofterPastels.utils.helpers.Blocks.*;

public class SofterPastelsBlocks {
    public static final Block WHITE_PASTEL_BLOCK = registerPastelBlock("white_pastel_block", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("white_pastel_powder_block", WHITE_PASTEL_BLOCK, DyeColor.WHITE);
    public static final Block WHITE_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("white_fence", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("white_fence_gate", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_WALL_BLOCK = registerPastelWallBlock("white_wall", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("white_slab", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("white_stairs", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_WOOL_BLOCK = registerWoolBlock("white_wool", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_LIGHT_BLOCK = registerLightBlock("white_light", DyeColor.WHITE);
    public static final Block WHITE_PASTEL_CARPET_BLOCK = registerCarpetBlock("white_carpet", DyeColor.WHITE);

    public static final Block LIGHT_RED_PASTEL_BLOCK = registerPastelBlock("light_red_pastel_block", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("light_red_pastel_powder_block", LIGHT_RED_PASTEL_BLOCK, MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("light_red_fence", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("light_red_fence_gate", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_WALL_BLOCK = registerPastelWallBlock("light_red_wall", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("light_red_slab", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("light_red_stairs", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_WOOL_BLOCK = registerWoolBlock("light_red_wool", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_LIGHT_BLOCK = registerLightBlock("light_red_light", MapColor.COLOR_PINK);
    public static final Block LIGHT_RED_PASTEL_CARPET_BLOCK = registerCarpetBlock("light_red_carpet", MapColor.COLOR_PINK);

    public static final Block RED_PASTEL_BLOCK = registerPastelBlock("red_pastel_block", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("red_pastel_powder_block", RED_PASTEL_BLOCK, MapColor.COLOR_RED);
    public static final Block RED_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("red_fence", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("red_fence_gate", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_WALL_BLOCK = registerPastelWallBlock("red_wall", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("red_slab", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("red_stairs", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_WOOL_BLOCK = registerWoolBlock("red_wool", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_LIGHT_BLOCK = registerLightBlock("red_light", MapColor.COLOR_RED);
    public static final Block RED_PASTEL_CARPET_BLOCK = registerCarpetBlock("red_carpet", MapColor.COLOR_RED);

    public static final Block ORANGE_PASTEL_BLOCK = registerPastelBlock("orange_pastel_block", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("orange_pastel_powder_block", ORANGE_PASTEL_BLOCK, MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("orange_fence", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("orange_fence_gate", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_WALL_BLOCK = registerPastelWallBlock("orange_wall", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("orange_slab", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("orange_stairs", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_WOOL_BLOCK = registerWoolBlock("orange_wool", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_LIGHT_BLOCK = registerLightBlock("orange_light", MapColor.COLOR_ORANGE);
    public static final Block ORANGE_PASTEL_CARPET_BLOCK = registerCarpetBlock("orange_carpet", MapColor.COLOR_ORANGE);

    public static final Block YELLOW_PASTEL_BLOCK = registerPastelBlock("yellow_pastel_block", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("yellow_pastel_powder_block", YELLOW_PASTEL_BLOCK, MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("yellow_fence", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("yellow_fence_gate", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_WALL_BLOCK = registerPastelWallBlock("yellow_wall", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("yellow_slab", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("yellow_stairs", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_WOOL_BLOCK = registerWoolBlock("yellow_wool", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_LIGHT_BLOCK = registerLightBlock("yellow_light", MapColor.COLOR_YELLOW);
    public static final Block YELLOW_PASTEL_CARPET_BLOCK = registerCarpetBlock("yellow_carpet", MapColor.COLOR_YELLOW);

    public static final Block LIGHT_GREEN_PASTEL_BLOCK = registerPastelBlock("light_green_pastel_block", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("light_green_pastel_powder_block", LIGHT_GREEN_PASTEL_BLOCK, MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("light_green_fence", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("light_green_fence_gate", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_WALL_BLOCK = registerPastelWallBlock("light_green_wall", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("light_green_slab", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("light_green_stairs", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_WOOL_BLOCK = registerWoolBlock("light_green_wool", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_LIGHT_BLOCK = registerLightBlock("light_green_light", MapColor.COLOR_LIGHT_GREEN);
    public static final Block LIGHT_GREEN_PASTEL_CARPET_BLOCK = registerCarpetBlock("light_green_carpet", MapColor.COLOR_LIGHT_GREEN);

    public static final Block GREEN_PASTEL_BLOCK = registerPastelBlock("green_pastel_block", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("green_pastel_powder_block", GREEN_PASTEL_BLOCK, MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("green_fence", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("green_fence_gate", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_WALL_BLOCK = registerPastelWallBlock("green_wall", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("green_slab", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("green_stairs", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_WOOL_BLOCK = registerWoolBlock("green_wool", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_LIGHT_BLOCK = registerLightBlock("green_light", MapColor.COLOR_GREEN);
    public static final Block GREEN_PASTEL_CARPET_BLOCK = registerCarpetBlock("green_carpet", MapColor.COLOR_GREEN);

    public static final Block LIGHT_BLUE_PASTEL_BLOCK = registerPastelBlock("light_blue_pastel_block", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("light_blue_pastel_powder_block", LIGHT_BLUE_PASTEL_BLOCK, MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("light_blue_fence", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("light_blue_fence_gate", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_WALL_BLOCK = registerPastelWallBlock("light_blue_wall", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("light_blue_slab", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("light_blue_stairs", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_WOOL_BLOCK = registerWoolBlock("light_blue_wool", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_LIGHT_BLOCK = registerLightBlock("light_blue_light", MapColor.COLOR_LIGHT_BLUE);
    public static final Block LIGHT_BLUE_PASTEL_CARPET_BLOCK = registerCarpetBlock("light_blue_carpet", MapColor.COLOR_LIGHT_BLUE);

    public static final Block BLUE_PASTEL_BLOCK = registerPastelBlock("blue_pastel_block", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("blue_pastel_powder_block", BLUE_PASTEL_BLOCK, MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("blue_fence", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("blue_fence_gate", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_WALL_BLOCK = registerPastelWallBlock("blue_wall", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("blue_slab", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("blue_stairs", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_WOOL_BLOCK = registerWoolBlock("blue_wool", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_LIGHT_BLOCK = registerLightBlock("blue_light", MapColor.COLOR_BLUE);
    public static final Block BLUE_PASTEL_CARPET_BLOCK = registerCarpetBlock("blue_carpet", MapColor.COLOR_BLUE);

    public static final Block PURPLE_PASTEL_BLOCK = registerPastelBlock("purple_pastel_block", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("purple_pastel_powder_block", PURPLE_PASTEL_BLOCK, MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("purple_fence", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("purple_fence_gate", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_WALL_BLOCK = registerPastelWallBlock("purple_wall", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("purple_slab", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("purple_stairs", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_WOOL_BLOCK = registerWoolBlock("purple_wool", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_LIGHT_BLOCK = registerLightBlock("purple_light", MapColor.COLOR_PURPLE);
    public static final Block PURPLE_PASTEL_CARPET_BLOCK = registerCarpetBlock("purple_carpet", MapColor.COLOR_PURPLE);

    public static final Block MAGENTA_PASTEL_BLOCK = registerPastelBlock("magenta_pastel_block", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("magenta_pastel_powder_block", MAGENTA_PASTEL_BLOCK, MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("magenta_fence", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("magenta_fence_gate", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_WALL_BLOCK = registerPastelWallBlock("magenta_wall", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("magenta_slab", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("magenta_stairs", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_WOOL_BLOCK = registerWoolBlock("magenta_wool", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_LIGHT_BLOCK = registerLightBlock("magenta_light", MapColor.COLOR_MAGENTA);
    public static final Block MAGENTA_PASTEL_CARPET_BLOCK = registerCarpetBlock("magenta_carpet", MapColor.COLOR_MAGENTA);

    public static final Block BROWN_PASTEL_BLOCK = registerPastelBlock("brown_pastel_block", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("brown_pastel_powder_block", BROWN_PASTEL_BLOCK, MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("brown_fence", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("brown_fence_gate", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_WALL_BLOCK = registerPastelWallBlock("black_wall", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("brown_slab", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("brown_stairs", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_WOOL_BLOCK = registerWoolBlock("brown_wool", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_LIGHT_BLOCK = registerLightBlock("brown_light", MapColor.COLOR_BROWN);
    public static final Block BROWN_PASTEL_CARPET_BLOCK = registerCarpetBlock("brown_carpet", MapColor.COLOR_BROWN);

    public static final Block LIGHT_GRAY_PASTEL_BLOCK = registerPastelBlock("light_gray_pastel_block", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("light_gray_pastel_powder_block", LIGHT_GRAY_PASTEL_BLOCK, MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("light_gray_fence", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("light_gray_fence_gate", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_WALL_BLOCK = registerPastelWallBlock("light_gray_wall", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("light_gray_slab", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("light_gray_stairs", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_WOOL_BLOCK = registerWoolBlock("light_gray_wool", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_LIGHT_BLOCK = registerLightBlock("light_gray_light", MapColor.COLOR_LIGHT_GRAY);
    public static final Block LIGHT_GRAY_PASTEL_CARPET_BLOCK = registerCarpetBlock("light_gray_carpet", MapColor.COLOR_LIGHT_GRAY);

    public static final Block GRAY_PASTEL_BLOCK = registerPastelBlock("gray_pastel_block", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("gray_pastel_powder_block", GRAY_PASTEL_BLOCK, MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("gray_fence", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("gray_fence_gate", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_WALL_BLOCK = registerPastelWallBlock("gray_wall", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("gray_slab", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("gray_stairs", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_WOOL_BLOCK = registerWoolBlock("gray_wool", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_LIGHT_BLOCK = registerLightBlock("gray_light", MapColor.COLOR_GRAY);
    public static final Block GRAY_PASTEL_CARPET_BLOCK = registerCarpetBlock("gray_carpet", MapColor.COLOR_GRAY);

    public static final Block BLACK_PASTEL_BLOCK = registerPastelBlock("black_pastel_block", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_POWDER_BLOCK = registerPastelPowderBlock("black_pastel_powder_block", BLACK_PASTEL_BLOCK, MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_FENCE_BLOCK = registerPastelFenceBlock("black_fence", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_FENCE_GATE_BLOCK = registerPastelFenceGateBlock("black_fence_gate", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_WALL_BLOCK = registerPastelWallBlock("brown_wall", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_SLAB_BLOCK = registerPastelSlabBlock("black_slab", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_STAIR_BLOCK = registerPastelStairsBlock("black_stairs", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_WOOL_BLOCK = registerWoolBlock("black_wool", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_LIGHT_BLOCK = registerLightBlock("black_light", MapColor.COLOR_BLACK);
    public static final Block BLACK_PASTEL_CARPET_BLOCK = registerCarpetBlock("black_carpet", MapColor.COLOR_BLACK);

    public static void init() {
        GlassBlocks.init();
    }
}
