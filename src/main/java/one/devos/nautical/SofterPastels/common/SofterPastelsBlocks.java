package one.devos.nautical.SofterPastels.common;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;
import one.devos.nautical.SofterPastels.common.blocks.PeanutCropBlock;
import one.devos.nautical.SofterPastels.common.blocks.StairBlocks;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;

import static one.devos.nautical.SofterPastels.utils.Register.registerBlock;
import static one.devos.nautical.SofterPastels.utils.Register.registerCrop;

public class SofterPastelsBlocks {
    protected static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;
    public static final int PastelSandColor = 16246726;
    private static Properties PastelBlock() { return copy(WHITE_CONCRETE); }
    private static Properties PastelPowder() { return copy(WHITE_CONCRETE_POWDER); }

    public static final Block WHITE_BLOCK = registerBlock("white_block", new Block(PastelBlock()), 0);
    public static final Block WHITE_POWDER_BLOCK = registerBlock("white_powder_block", new ConcretePowderBlock(WHITE_BLOCK, PastelPowder()), 0);
    //    public static final _SLAB = registerBlock("_pastel_slab", new SlabBlock(pastel_block()));
    // same for Fence BLock, Fence Gate Block, Wall Block, Stair Block, and Wool Block

    public static final Block LIGHT_RED_PASTEL_BLOCK = registerBlock("light_red_pastel_block", new Block(PastelBlock()), 0);
    public static final Block LIGHT_RED_PASTEL_POWDER_BLOCK = registerBlock("light_red_pastel_powder_block", new ConcretePowderBlock(LIGHT_RED_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block RED_PASTEL_BLOCK = registerBlock("red_pastel_block", new Block(PastelBlock()), 0);
    public static final Block RED_PASTEL_POWDER_BLOCK = registerBlock("red_pastel_powder_block", new ConcretePowderBlock(RED_PASTEL_BLOCK, PastelPowder()), 0);


    public static final Block ORANGE_PASTEL_BLOCK = registerBlock("orange_pastel_block", new Block(PastelBlock()), 0);
    public static final Block ORANGE_PASTEL_POWDER_BLOCK = registerBlock("orange_pastel_powder_block", new ConcretePowderBlock(ORANGE_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block YELLOW_PASTEL_BLOCK = registerBlock("yellow_pastel_block", new Block(PastelBlock()), 0);
    public static final Block YELLOW_PASTEL_POWDER_BLOCK = registerBlock("yellow_pastel_powder_block", new ConcretePowderBlock(YELLOW_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block LIGHT_GREEN_PASTEL_BLOCK = registerBlock("light_green_pastel_block", new Block(PastelBlock()), 0);
    public static final Block LIGHT_GREEN_PASTEL_POWDER_BLOCK = registerBlock("light_green_pastel_powder_block", new ConcretePowderBlock(LIGHT_GREEN_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block GREEN_PASTEL_BLOCK = registerBlock("green_pastel_block", new Block(PastelBlock()), 0);
    public static final Block GREEN_PASTEL_POWDER_BLOCK = registerBlock("green_pastel_powder_block", new ConcretePowderBlock(GREEN_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block LIGHT_BLUE_PASTEL_BLOCK = registerBlock("light_blue_pastel_block", new Block(PastelBlock()), 0);
    public static final Block LIGHT_BLUE_PASTEL_POWDER_BLOCK = registerBlock("light_blue_pastel_powder_block", new ConcretePowderBlock(LIGHT_BLUE_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block BLUE_PASTEL_BLOCK = registerBlock("blue_pastel_block", new Block(PastelBlock()), 0);
    public static final Block BLUE_PASTEL_POWDER_BLOCK = registerBlock("blue_pastel_powder_block", new ConcretePowderBlock(BLUE_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block PURPLE_PASTEL_BLOCK = registerBlock("purple_pastel_block", new Block(PastelBlock()), 0);
    public static final Block PURPLE_PASTEL_POWDER_BLOCK = registerBlock("purple_pastel_powder_block", new ConcretePowderBlock(PURPLE_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block MAGENTA_PASTEL_BLOCK = registerBlock("magenta_pastel_block", new Block(PastelBlock()), 0);
    public static final Block MAGENTA_PASTEL_POWDER_BLOCK = registerBlock("magenta_pastel_powder_block", new ConcretePowderBlock(MAGENTA_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block BROWN_PASTEL_BLOCK = registerBlock("brown_pastel_block", new Block(PastelBlock()), 0);
    public static final Block BROWN_PASTEL_POWDER_BLOCK = registerBlock("brown_pastel_powder_block", new ConcretePowderBlock(BROWN_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block BLACK_PASTEL_BLOCK = registerBlock("black_pastel_block", new Block(PastelBlock()), 0);
    public static final Block BLACK_PASTEL_POWDER_BLOCK = registerBlock("black_pastel_powder_block", new ConcretePowderBlock(BLACK_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block LIGHT_GRAY_PASTEL_BLOCK = registerBlock("light_gray_pastel_block", new Block(PastelBlock()), 0);
    public static final Block LIGHT_GRAY_PASTEL_POWDER_BLOCK = registerBlock("light_gray_pastel_powder_block", new ConcretePowderBlock(LIGHT_GRAY_PASTEL_BLOCK, PastelPowder()), 0);

    public static final Block GRAY_PASTEL_BLOCK = registerBlock("gray_pastel_block", new Block(PastelBlock()), 0);
    public static final Block GRAY_PASTEL_POWDER_BLOCK = registerBlock("gray_pastel_powder_block", new ConcretePowderBlock(GRAY_PASTEL_BLOCK, PastelPowder()), 0);

    //Natural

    private static Properties DirtLike() { return copy(DIRT); }
    private static Properties PastelLeaves() {return copy(OAK_LEAVES).noOcclusion().isViewBlocking(never).isSuffocating(never); }
    private static Properties SandLike() { return Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND) ; }

    public static final Block PASTEL_GRASS = registerBlock("pastel_grass", new GrassBlock(DirtLike()), 3);
    public static final Block PASTEL_DIRT = registerBlock("pastel_dirt", new Block(DirtLike()), 3);
    public static final Block PASTEL_STONE = registerBlock("pastel_stone", new Block(copy(STONE)), 3);
    public static final Block PASTEL_SAND = registerBlock("pastel_sand", new SandBlock(PastelSandColor, SandLike()), 3);
    public static final Block PASTEL_LOG = registerBlock("pastel_log", new RotatedPillarBlock(copy(OAK_LOG)), 3);
    public static final Block PASTEL_ORE = registerBlock("pastel_ore", new Block(copy(IRON_ORE)), 3);
    public static final Block LIGHT_BLUE_LEAVES = registerBlock("light_blue_leaves", new LeavesBlock(PastelLeaves()), 3);
    public static final Block LIGHT_RED_LEAVES = registerBlock("light_red_leaves", new LeavesBlock(PastelLeaves()), 3);
    public static final Block LIGHT_GREEN_LEAVES = registerBlock("light_green_leaves", new LeavesBlock(PastelLeaves()), 3);
    public static final Block YELLOW_LEAVES = registerBlock("yellow_leaves", new LeavesBlock(PastelLeaves()), 3);

    private static Properties crops() { return(copy(WHEAT)); }

    public static final Block PEANUT_CROP = registerCrop("peanut_crop", new PeanutCropBlock(crops()));

    public static void init() {
        GlassBlocks.init();

        // Leftover from Pastel Wonderland code, please clean up later, do not do this.
        String[] colors = {"white", "light_red", "red", "orange", "yellow", "light_green", "green", "light_blue", "blue", "purple", "magenta", "brown", "black", "light_gray", "gray"};
        for (String color : colors) {
            //Block PASTEL_BLOCK = registerBlock(color, new Block(copy(WHITE_CONCRETE)));
            //Block PASTEL_POWDER_BLOCK = registerBlock(color + "_powder", new ConcretePowderBlock(PASTEL_BLOCK, copy(WHITE_CONCRETE_POWDER)));
            Block PASTEL_FENCE_BLOCK = registerBlock(color + "_fence", new FenceBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_FENCE_GATE_BLOCK = registerBlock(color + "_fence_gate", new FenceGateBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_WALL_BLOCK = registerBlock(color + "_wall", new WallBlock(copy(WHITE_CONCRETE)), 1);
            Block PASTEL_SLAB_BLOCK = registerBlock(color + "_slab", new SlabBlock(copy(WHITE_CONCRETE)), 0);
            Block PASTEL_STAIR_BLOCK = registerBlock(color + "_stairs", new StairBlocks(STONE_STAIRS.defaultBlockState(), copy(WHITE_CONCRETE)), 0);
            Block PASTEL_WOOL_BLOCK = registerBlock(color + "_wool", new Block(copy(WHITE_WOOL)), 0);
        }
    }
}
