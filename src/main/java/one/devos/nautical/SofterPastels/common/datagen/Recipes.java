package one.devos.nautical.SofterPastels.common.datagen;

import net.minecraft.world.item.Items;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;
import one.devos.nautical.SofterPastels.utils.Register;

public class Recipes {
    public static void init() {
        // Powder base recipe
        Register.registerPowderBaseRecipe("powder_gic", Items.GLOW_INK_SAC);
        Register.registerPowderBaseRecipe("powder_gb", Items.GLOW_BERRIES);
        Register.registerPowderBaseRecipe("powder_gd", Items.GLOWSTONE_DUST);

        // Actual colored powders
        Register.registerColoredPowderRecipe("white_powder", Items.WHITE_DYE, SofterPastelsItems.WHITE_POWDER);
        Register.registerColoredPowderRecipe("light_red_powder", Items.PINK_DYE, SofterPastelsItems.LIGHT_RED_POWDER);
        Register.registerColoredPowderRecipe("red_powder", Items.RED_DYE, SofterPastelsItems.RED_POWDER);
        Register.registerColoredPowderRecipe("orange_powder", Items.ORANGE_DYE, SofterPastelsItems.ORANGE_POWDER);
        Register.registerColoredPowderRecipe("yellow_powder", Items.YELLOW_DYE, SofterPastelsItems.YELLOW_POWDER);
        Register.registerColoredPowderRecipe("light_green_powder", Items.LIME_DYE, SofterPastelsItems.LIGHT_GREEN_POWDER);
        Register.registerColoredPowderRecipe("green_powder", Items.GREEN_DYE, SofterPastelsItems.GREEN_POWDER);
        Register.registerColoredPowderRecipe("light_blue_powder", Items.LIGHT_BLUE_DYE, SofterPastelsItems.LIGHT_BLUE_POWDER);
        Register.registerColoredPowderRecipe("blue_powder", Items.BLUE_DYE, SofterPastelsItems.BLUE_POWDER);
        Register.registerColoredPowderRecipe("purple_powder", Items.PURPLE_DYE, SofterPastelsItems.PURPLE_POWDER);
        Register.registerColoredPowderRecipe("magenta_powder", Items.MAGENTA_DYE, SofterPastelsItems.MAGENTA_POWDER);
        Register.registerColoredPowderRecipe("brown_powder", Items.BROWN_DYE, SofterPastelsItems.BROWN_POWDER);
        Register.registerColoredPowderRecipe("light_gray_powder", Items.LIGHT_GRAY_DYE, SofterPastelsItems.LIGHT_GRAY_POWDER);
        Register.registerColoredPowderRecipe("gray_powder", Items.GRAY_DYE, SofterPastelsItems.GRAY_POWDER);
        Register.registerColoredPowderRecipe("black_powder", Items.BLACK_DYE, SofterPastelsItems.BLACK_POWDER);

        // Pastel Powder Blocks
        Register.registerPowderBlockRecipe("white_powder_block", SofterPastelsItems.WHITE_POWDER, SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("light_red_powder_block", SofterPastelsItems.LIGHT_RED_POWDER, SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("red_powder_block", SofterPastelsItems.RED_POWDER, SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("orange_powder_block", SofterPastelsItems.ORANGE_POWDER, SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("yellow_powder_block", SofterPastelsItems.YELLOW_POWDER, SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("light_green_powder_block", SofterPastelsItems.LIGHT_GREEN_POWDER, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("green_powder_block", SofterPastelsItems.GREEN_POWDER, SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("light_blue_powder_block", SofterPastelsItems.LIGHT_BLUE_POWDER, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("blue_powder_block", SofterPastelsItems.BLUE_POWDER, SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("purple_powder_block", SofterPastelsItems.PURPLE_POWDER, SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("magenta_powder_block", SofterPastelsItems.MAGENTA_POWDER, SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("brown_powder_block", SofterPastelsItems.BROWN_POWDER, SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("light_gray_powder_block", SofterPastelsItems.LIGHT_GRAY_POWDER, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("gray_powder_block", SofterPastelsItems.GRAY_POWDER, SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK);
        Register.registerPowderBlockRecipe("black_powder_block", SofterPastelsItems.BLACK_POWDER, SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK);

        // Slabs
        Register.registerSlabRecipe("white_slab", SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("light_red_slab", SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("red_slab", SofterPastelsBlocks.RED_PASTEL_BLOCK, SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("orange_slab", SofterPastelsBlocks.ORANGE_PASTEL_BLOCK, SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("yellow_slab", SofterPastelsBlocks.YELLOW_PASTEL_BLOCK, SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("light_green_slab", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("green_slab", SofterPastelsBlocks.GREEN_PASTEL_BLOCK, SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("light_blue_slab", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("blue_slab", SofterPastelsBlocks.BLUE_PASTEL_BLOCK, SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("purple_slab", SofterPastelsBlocks.PURPLE_PASTEL_BLOCK, SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("magenta_slab", SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK, SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("brown_slab", SofterPastelsBlocks.BROWN_PASTEL_BLOCK, SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("light_gray_slab", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("gray_slab", SofterPastelsBlocks.GRAY_PASTEL_BLOCK, SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK);
        Register.registerSlabRecipe("black_slab", SofterPastelsBlocks.BLACK_PASTEL_BLOCK, SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK);

        // Stairs
        Register.registerStairsRecipe("white_stairs", SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("light_red_stairs", SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("red_stairs", SofterPastelsBlocks.RED_PASTEL_BLOCK, SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("orange_stairs", SofterPastelsBlocks.ORANGE_PASTEL_BLOCK, SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("yellow_stairs", SofterPastelsBlocks.YELLOW_PASTEL_BLOCK, SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("light_green_stairs", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("green_stairs", SofterPastelsBlocks.GREEN_PASTEL_BLOCK, SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("light_blue_stairs", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("blue_stairs", SofterPastelsBlocks.BLUE_PASTEL_BLOCK, SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("purple_stairs", SofterPastelsBlocks.PURPLE_PASTEL_BLOCK, SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("magenta_stairs", SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK, SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("brown_stairs", SofterPastelsBlocks.BROWN_PASTEL_BLOCK, SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("light_gray_stairs", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("gray_stairs", SofterPastelsBlocks.GRAY_PASTEL_BLOCK, SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK);
        Register.registerStairsRecipe("black_stairs", SofterPastelsBlocks.BLACK_PASTEL_BLOCK, SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK);

        // Wool
        Register.registerVanillaWoolRecipe("white_wool", SofterPastelsItems.WHITE_POWDER, SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("light_red_wool", SofterPastelsItems.LIGHT_RED_POWDER, SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("red_wool", SofterPastelsItems.RED_POWDER, SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("orange_wool", SofterPastelsItems.ORANGE_POWDER, SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("yellow_wool", SofterPastelsItems.YELLOW_POWDER, SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("light_green_wool", SofterPastelsItems.LIGHT_GREEN_POWDER, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("green_wool", SofterPastelsItems.GREEN_POWDER, SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("light_blue_wool", SofterPastelsItems.LIGHT_BLUE_POWDER, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("blue_wool", SofterPastelsItems.BLUE_POWDER, SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("purple_wool", SofterPastelsItems.PURPLE_POWDER, SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("magenta_wool", SofterPastelsItems.MAGENTA_POWDER, SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("brown_wool", SofterPastelsItems.BROWN_POWDER, SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("light_gray_wool", SofterPastelsItems.LIGHT_GRAY_POWDER, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("gray_wool", SofterPastelsItems.GRAY_POWDER, SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK);
        Register.registerVanillaWoolRecipe("black_wool", SofterPastelsItems.BLACK_POWDER, SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK);


        // Wool alt [using Softer Pastels' own White Wool]
        Register.registerPastelWoolRecipe("white_wool", SofterPastelsItems.WHITE_POWDER, SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("light_red_wool", SofterPastelsItems.LIGHT_RED_POWDER, SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("red_wool", SofterPastelsItems.RED_POWDER, SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("orange_wool", SofterPastelsItems.ORANGE_POWDER, SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("yellow_wool", SofterPastelsItems.YELLOW_POWDER, SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("light_green_wool", SofterPastelsItems.LIGHT_GREEN_POWDER, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("green_wool", SofterPastelsItems.GREEN_POWDER, SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("light_blue_wool", SofterPastelsItems.LIGHT_BLUE_POWDER, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("blue_wool", SofterPastelsItems.BLUE_POWDER, SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("purple_wool", SofterPastelsItems.PURPLE_POWDER, SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("magenta_wool", SofterPastelsItems.MAGENTA_POWDER, SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("brown_wool", SofterPastelsItems.BROWN_POWDER, SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("light_gray_wool", SofterPastelsItems.LIGHT_GRAY_POWDER, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("gray_wool", SofterPastelsItems.GRAY_POWDER, SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK);
        Register.registerPastelWoolRecipe("black_wool", SofterPastelsItems.BLACK_POWDER, SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK);

        // Fences
        Register.registerFencesRecipe("white_fences", SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("light_red_fences", SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("red_fences", SofterPastelsBlocks.RED_PASTEL_BLOCK, SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("orange_fences", SofterPastelsBlocks.ORANGE_PASTEL_BLOCK, SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("yellow_fences", SofterPastelsBlocks.YELLOW_PASTEL_BLOCK, SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("light_green_fences", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("green_fences", SofterPastelsBlocks.GREEN_PASTEL_BLOCK, SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("light_blue_fences", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("blue_fences", SofterPastelsBlocks.BLUE_PASTEL_BLOCK, SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("purple_fences", SofterPastelsBlocks.PURPLE_PASTEL_BLOCK, SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("magenta_fences", SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK, SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("brown_fences", SofterPastelsBlocks.BROWN_PASTEL_BLOCK, SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("light_gray_fences", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("gray_fences", SofterPastelsBlocks.GRAY_PASTEL_BLOCK, SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK);
        Register.registerFencesRecipe("black_fences", SofterPastelsBlocks.BLACK_PASTEL_BLOCK, SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK);

        // Fence Gates
        Register.registerFenceGateRecipe("white_fence_gate", SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("light_red_fence_gate", SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("red_fence_gate", SofterPastelsBlocks.RED_PASTEL_BLOCK, SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("orange_fence_gate", SofterPastelsBlocks.ORANGE_PASTEL_BLOCK, SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("yellow_fence_gate", SofterPastelsBlocks.YELLOW_PASTEL_BLOCK, SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("light_green_fence_gate", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("green_fence_gate", SofterPastelsBlocks.GREEN_PASTEL_BLOCK, SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("light_blue_fence_gate", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("blue_fence_gate", SofterPastelsBlocks.BLUE_PASTEL_BLOCK, SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("purple_fence_gate", SofterPastelsBlocks.PURPLE_PASTEL_BLOCK, SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("magenta_fence_gate", SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK, SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("brown_fence_gate", SofterPastelsBlocks.BROWN_PASTEL_BLOCK, SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("light_gray_fence_gate", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("gray_fence_gate", SofterPastelsBlocks.GRAY_PASTEL_BLOCK, SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK);
        Register.registerFenceGateRecipe("black_fence_gate", SofterPastelsBlocks.BLACK_PASTEL_BLOCK, SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK);

        // Walls
        Register.registerWallRecipe("white_wall", SofterPastelsBlocks.WHITE_PASTEL_BLOCK, SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("light_red_wall", SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("red_wall", SofterPastelsBlocks.RED_PASTEL_BLOCK, SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("orange_wall", SofterPastelsBlocks.ORANGE_PASTEL_BLOCK, SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("yellow_wall", SofterPastelsBlocks.YELLOW_PASTEL_BLOCK, SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("light_green_wall", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("green_wall", SofterPastelsBlocks.GREEN_PASTEL_BLOCK, SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("light_blue_wall", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("blue_wall", SofterPastelsBlocks.BLUE_PASTEL_BLOCK, SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("purple_wall", SofterPastelsBlocks.PURPLE_PASTEL_BLOCK, SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("magenta_wall", SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK, SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("brown_wall", SofterPastelsBlocks.BROWN_PASTEL_BLOCK, SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("light_gray_wall", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK, SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("gray_wall", SofterPastelsBlocks.GRAY_PASTEL_BLOCK, SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK);
        Register.registerWallRecipe("black_wall", SofterPastelsBlocks.BLACK_PASTEL_BLOCK, SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK);

        // Glass Smelting
        Register.registerGlassSmelting("white_glass_smelting", SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK, GlassBlocks.WHITE_GLASS_ITEM);
        Register.registerGlassSmelting("light_red_glass_smelting", SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK, GlassBlocks.LIGHT_RED_GLASS_ITEM);
        Register.registerGlassSmelting("red_glass_smelting", SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK, GlassBlocks.RED_GLASS_ITEM);
        Register.registerGlassSmelting("orange_glass_smelting", SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK, GlassBlocks.ORANGE_GLASS_ITEM);
        Register.registerGlassSmelting("yellow_glass_smelting", SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK, GlassBlocks.YELLOW_GLASS_ITEM);
        Register.registerGlassSmelting("light_green_glass_smelting", SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK, GlassBlocks.LIGHT_GREEN_GLASS_ITEM);
        Register.registerGlassSmelting("green_glass_smelting", SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK, GlassBlocks.GREEN_GLASS_ITEM);
        Register.registerGlassSmelting("light_blue_glass_smelting", SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK, GlassBlocks.LIGHT_BLUE_GLASS_ITEM);
        Register.registerGlassSmelting("blue_glass_smelting", SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK, GlassBlocks.BLUE_GLASS_ITEM);
        Register.registerGlassSmelting("purple_glass_smelting", SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK, GlassBlocks.PURPLE_GLASS_ITEM);
        Register.registerGlassSmelting("magenta_glass_smelting", SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK, GlassBlocks.MAGENTA_GLASS_ITEM);
        Register.registerGlassSmelting("brown_glass_smelting", SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK, GlassBlocks.BROWN_GLASS_ITEM);
        Register.registerGlassSmelting("light_gray_glass_smelting", SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK, GlassBlocks.LIGHT_GRAY_GLASS_ITEM);
        Register.registerGlassSmelting("gray_glass_smelting", SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK, GlassBlocks.GRAY_GLASS_ITEM);
        Register.registerGlassSmelting("black_glass_smelting", SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK, GlassBlocks.BLACK_GLASS_ITEM);

        // Glass Crafting
        Register.registerGlassRecipe("white_glass", SofterPastelsItems.WHITE_POWDER, GlassBlocks.WHITE_GLASS_ITEM);
        Register.registerGlassRecipe("light_red_glass", SofterPastelsItems.LIGHT_RED_POWDER, GlassBlocks.LIGHT_RED_GLASS_ITEM);
        Register.registerGlassRecipe("red_glass", SofterPastelsItems.RED_POWDER, GlassBlocks.RED_GLASS_ITEM);
        Register.registerGlassRecipe("orange_glass", SofterPastelsItems.ORANGE_POWDER, GlassBlocks.ORANGE_GLASS_ITEM);
        Register.registerGlassRecipe("yellow_glass", SofterPastelsItems.YELLOW_POWDER, GlassBlocks.YELLOW_GLASS_ITEM);
        Register.registerGlassRecipe("light_green_glass", SofterPastelsItems.LIGHT_GREEN_POWDER, GlassBlocks.LIGHT_GREEN_GLASS_ITEM);
        Register.registerGlassRecipe("green_glass", SofterPastelsItems.GREEN_POWDER, GlassBlocks.GREEN_GLASS_ITEM);
        Register.registerGlassRecipe("light_blue_glass", SofterPastelsItems.LIGHT_BLUE_POWDER, GlassBlocks.LIGHT_BLUE_GLASS_ITEM);
        Register.registerGlassRecipe("blue_glass", SofterPastelsItems.BLUE_POWDER, GlassBlocks.BLUE_GLASS_ITEM);
        Register.registerGlassRecipe("purple_glass", SofterPastelsItems.PURPLE_POWDER, GlassBlocks.PURPLE_GLASS_ITEM);
        Register.registerGlassRecipe("magenta_glass", SofterPastelsItems.MAGENTA_POWDER, GlassBlocks.MAGENTA_GLASS_ITEM);
        Register.registerGlassRecipe("brown_glass", SofterPastelsItems.BROWN_POWDER, GlassBlocks.BROWN_GLASS_ITEM);
        Register.registerGlassRecipe("light_gray_glass", SofterPastelsItems.LIGHT_GRAY_POWDER, GlassBlocks.LIGHT_GRAY_GLASS_ITEM);
        Register.registerGlassRecipe("gray_glass", SofterPastelsItems.GRAY_POWDER, GlassBlocks.GRAY_GLASS_ITEM);
        Register.registerGlassRecipe("black_glass", SofterPastelsItems.BLACK_POWDER, GlassBlocks.BLACK_GLASS_ITEM);

        // Glass Pane
        Register.registerGlassPaneRecipe("white_glass_pane", SofterPastelsItems.WHITE_POWDER, GlassBlocks.WHITE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("light_red_glass_pane", SofterPastelsItems.LIGHT_RED_POWDER, GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("red_glass_pane", SofterPastelsItems.RED_POWDER, GlassBlocks.RED_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("orange_glass_pane", SofterPastelsItems.ORANGE_POWDER, GlassBlocks.ORANGE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("yellow_glass_pane", SofterPastelsItems.YELLOW_POWDER, GlassBlocks.YELLOW_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("light_green_glass_pane", SofterPastelsItems.LIGHT_GREEN_POWDER, GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("green_glass_pane", SofterPastelsItems.GREEN_POWDER, GlassBlocks.GREEN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("light_blue_glass_pane", SofterPastelsItems.LIGHT_BLUE_POWDER, GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("blue_glass_pane", SofterPastelsItems.BLUE_POWDER, GlassBlocks.BLUE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("purple_glass_pane", SofterPastelsItems.PURPLE_POWDER, GlassBlocks.PURPLE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("magenta_glass_pane", SofterPastelsItems.MAGENTA_POWDER, GlassBlocks.MAGENTA_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("brown_glass_pane", SofterPastelsItems.BROWN_POWDER, GlassBlocks.BROWN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("light_gray_glass_pane", SofterPastelsItems.LIGHT_GRAY_POWDER, GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("gray_glass_pane", SofterPastelsItems.GRAY_POWDER, GlassBlocks.GRAY_GLASS_PANE_ITEM);
        Register.registerGlassPaneRecipe("black_glass_pane", SofterPastelsItems.BLACK_POWDER, GlassBlocks.BLACK_GLASS_PANE_ITEM);

        Register.registerGlassPaneRectangleRecipe("white_glass_pane_rectangle", GlassBlocks.WHITE_GLASS_ITEM, GlassBlocks.WHITE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("light_red_glass_pane_rectangle", GlassBlocks.LIGHT_RED_GLASS_ITEM, GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("red_glass_pane_rectangle", GlassBlocks.RED_GLASS_ITEM, GlassBlocks.RED_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("orange_glass_pane_rectangle", GlassBlocks.ORANGE_GLASS_ITEM, GlassBlocks.ORANGE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("yellow_glass_pane_rectangle", GlassBlocks.YELLOW_GLASS_ITEM, GlassBlocks.YELLOW_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("light_green_glass_pane_rectangle", GlassBlocks.LIGHT_GREEN_GLASS_ITEM, GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("green_glass_pane_rectangle", GlassBlocks.GREEN_GLASS_ITEM, GlassBlocks.GREEN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("light_blue_glass_pane_rectangle", GlassBlocks.LIGHT_BLUE_GLASS_ITEM, GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("blue_glass_pane_rectangle", GlassBlocks.BLUE_GLASS_ITEM, GlassBlocks.BLUE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("purple_glass_pane_rectangle", GlassBlocks.PURPLE_GLASS_ITEM, GlassBlocks.PURPLE_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("magenta_glass_pane_rectangle", GlassBlocks.MAGENTA_GLASS_ITEM, GlassBlocks.MAGENTA_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("brown_glass_pane_rectangle", GlassBlocks.BROWN_GLASS_ITEM, GlassBlocks.BROWN_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("light_gray_glass_pane_rectangle", GlassBlocks.LIGHT_GRAY_GLASS_ITEM, GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("gray_glass_pane_rectangle", GlassBlocks.GRAY_GLASS_ITEM, GlassBlocks.GRAY_GLASS_PANE_ITEM);
        Register.registerGlassPaneRectangleRecipe("black_glass_pane_rectangle", GlassBlocks.BLACK_GLASS_ITEM, GlassBlocks.BLACK_GLASS_PANE_ITEM);

        Register.registerTaffyRecipe("white_taffy", SofterPastelsItems.WHITE_POWDER, SofterPastelsItems.WHITE_TAFFY);
        Register.registerTaffyRecipe("light_red_taffy", SofterPastelsItems.LIGHT_RED_POWDER, SofterPastelsItems.LIGHT_RED_TAFFY);
        Register.registerTaffyRecipe("red_taffy", SofterPastelsItems.RED_POWDER, SofterPastelsItems.RED_TAFFY);
        Register.registerTaffyRecipe("orange_taffy", SofterPastelsItems.ORANGE_POWDER, SofterPastelsItems.ORANGE_TAFFY);
        Register.registerTaffyRecipe("yellow_taffy", SofterPastelsItems.YELLOW_POWDER, SofterPastelsItems.YELLOW_TAFFY);
        Register.registerTaffyRecipe("light_green_taffy", SofterPastelsItems.LIGHT_GREEN_POWDER, SofterPastelsItems.LIGHT_GREEN_TAFFY);
        Register.registerTaffyRecipe("green_taffy", SofterPastelsItems.GREEN_POWDER, SofterPastelsItems.GREEN_TAFFY);
        Register.registerTaffyRecipe("light_blue_taffy", SofterPastelsItems.LIGHT_BLUE_POWDER, SofterPastelsItems.LIGHT_BLUE_TAFFY);
        Register.registerTaffyRecipe("blue_taffy", SofterPastelsItems.BLUE_POWDER, SofterPastelsItems.BLUE_TAFFY);
        Register.registerTaffyRecipe("purple_taffy", SofterPastelsItems.PURPLE_POWDER, SofterPastelsItems.PURPLE_TAFFY);
        Register.registerTaffyRecipe("magenta_taffy", SofterPastelsItems.MAGENTA_POWDER, SofterPastelsItems.MAGENTA_TAFFY);
        Register.registerTaffyRecipe("brown_taffy", SofterPastelsItems.BROWN_POWDER, SofterPastelsItems.BROWN_TAFFY);
        Register.registerTaffyRecipe("light_gray_taffy", SofterPastelsItems.LIGHT_GRAY_POWDER, SofterPastelsItems.LIGHT_GRAY_TAFFY);
        Register.registerTaffyRecipe("gray_taffy", SofterPastelsItems.GRAY_POWDER, SofterPastelsItems.GRAY_TAFFY);
        Register.registerTaffyRecipe("black_taffy", SofterPastelsItems.BLACK_POWDER, SofterPastelsItems.BLACK_TAFFY);

    }
}