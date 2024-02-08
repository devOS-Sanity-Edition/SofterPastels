package one.devos.nautical.SofterPastels.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.material.MapColor;

import static net.minecraft.world.level.block.Blocks.WHITE_STAINED_GLASS;
import static one.devos.nautical.SofterPastels.utils.helpers.Blocks.registerGlassBlock;
import static one.devos.nautical.SofterPastels.utils.helpers.Blocks.registerGlassBlockItem;

public class GlassBlocks {
    // Glass is a special child and i have to call each one manually elsewhere soooooooooo - originally stereo
    public static final Block WHITE_GLASS = registerGlassBlock("white_glass", new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final Block WHITE_GLASS_PANE = registerGlassBlock("white_glass_pane", new StainedGlassPaneBlock(DyeColor.WHITE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(DyeColor.WHITE)));
    public static final BlockItem WHITE_GLASS_ITEM = registerGlassBlockItem("white_glass", WHITE_GLASS);
    public static final BlockItem WHITE_GLASS_PANE_ITEM = registerGlassBlockItem("white_glass_pane", WHITE_GLASS_PANE);

    public static final Block LIGHT_RED_GLASS = registerGlassBlock("light_red_glass", new StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_PINK)));
    public static final Block LIGHT_RED_GLASS_PANE = registerGlassBlock("light_red_glass_pane", new StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem LIGHT_RED_GLASS_ITEM = registerGlassBlockItem("light_red_glass", LIGHT_RED_GLASS);
    public static final BlockItem LIGHT_RED_GLASS_PANE_ITEM = registerGlassBlockItem("light_red_glass_pane", LIGHT_RED_GLASS_PANE);

    public static final Block RED_GLASS = registerGlassBlock("red_glass", new StainedGlassBlock(DyeColor.RED, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_RED)));
    public static final Block RED_GLASS_PANE = registerGlassBlock("red_glass_pane", new StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem RED_GLASS_ITEM = registerGlassBlockItem("red_glass", RED_GLASS);
    public static final BlockItem RED_GLASS_PANE_ITEM = registerGlassBlockItem("red_glass_pane", RED_GLASS_PANE);

    public static final Block ORANGE_GLASS = registerGlassBlock("orange_glass", new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_ORANGE)));
    public static final Block ORANGE_GLASS_PANE = registerGlassBlock("orange_glass_pane", new StainedGlassPaneBlock(DyeColor.ORANGE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem ORANGE_GLASS_ITEM = registerGlassBlockItem("orange_glass", ORANGE_GLASS);
    public static final BlockItem ORANGE_GLASS_PANE_ITEM = registerGlassBlockItem("orange_glass_pane", ORANGE_GLASS_PANE);

    public static final Block YELLOW_GLASS = registerGlassBlock("yellow_glass", new StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_YELLOW)));
    public static final Block YELLOW_GLASS_PANE = registerGlassBlock("yellow_glass_pane", new StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem YELLOW_GLASS_ITEM = registerGlassBlockItem("yellow_glass", YELLOW_GLASS);
    public static final BlockItem YELLOW_GLASS_PANE_ITEM = registerGlassBlockItem("yellow_glass_pane", YELLOW_GLASS_PANE);

    public static final Block LIGHT_GREEN_GLASS = registerGlassBlock("light_green_glass", new StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block LIGHT_GREEN_GLASS_PANE = registerGlassBlock("light_green_glass_pane", new StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem LIGHT_GREEN_GLASS_ITEM = registerGlassBlockItem("light_green_glass", LIGHT_GREEN_GLASS);
    public static final BlockItem LIGHT_GREEN_GLASS_PANE_ITEM = registerGlassBlockItem("light_green_glass_pane", LIGHT_GREEN_GLASS_PANE);

    public static final Block GREEN_GLASS = registerGlassBlock("green_glass", new StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_GREEN)));
    public static final Block GREEN_GLASS_PANE = registerGlassBlock("green_glass_pane", new StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem GREEN_GLASS_ITEM = registerGlassBlockItem("green_glass", GREEN_GLASS);
    public static final BlockItem GREEN_GLASS_PANE_ITEM = registerGlassBlockItem("green_glass_pane", GREEN_GLASS_PANE);

    public static final Block LIGHT_BLUE_GLASS = registerGlassBlock("light_blue_glass", new StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_GLASS_PANE = registerGlassBlock("light_blue_glass_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem LIGHT_BLUE_GLASS_ITEM = registerGlassBlockItem("light_blue_glass", LIGHT_BLUE_GLASS);
    public static final BlockItem LIGHT_BLUE_GLASS_PANE_ITEM = registerGlassBlockItem("light_blue_glass_pane", LIGHT_BLUE_GLASS_PANE);

    public static final Block BLUE_GLASS = registerGlassBlock("blue_glass", new StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_BLUE)));
    public static final Block BLUE_GLASS_PANE = registerGlassBlock("blue_glass_pane", new StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem BLUE_GLASS_ITEM = registerGlassBlockItem("blue_glass", BLUE_GLASS);
    public static final BlockItem BLUE_GLASS_PANE_ITEM = registerGlassBlockItem("blue_glass_pane", BLUE_GLASS_PANE);

    public static final Block PURPLE_GLASS = registerGlassBlock("purple_glass", new StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_PURPLE)));
    public static final Block PURPLE_GLASS_PANE = registerGlassBlock("purple_glass_pane", new StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem PURPLE_GLASS_ITEM = registerGlassBlockItem("purple_glass", PURPLE_GLASS);
    public static final BlockItem PURPLE_GLASS_PANE_ITEM = registerGlassBlockItem("purple_glass_pane", PURPLE_GLASS_PANE);

    public static final Block MAGENTA_GLASS = registerGlassBlock("magenta_glass", new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block MAGENTA_GLASS_PANE = registerGlassBlock("magenta_glass_pane", new StainedGlassPaneBlock(DyeColor.MAGENTA, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem MAGENTA_GLASS_ITEM = registerGlassBlockItem("magenta_glass", MAGENTA_GLASS);
    public static final BlockItem MAGENTA_GLASS_PANE_ITEM = registerGlassBlockItem("magenta_glass_pane", MAGENTA_GLASS_PANE);

    public static final Block BROWN_GLASS = registerGlassBlock("brown_glass", new StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_BROWN)));
    public static final Block BROWN_GLASS_PANE = registerGlassBlock("brown_glass_pane", new StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem BROWN_GLASS_ITEM = registerGlassBlockItem("brown_glass", BROWN_GLASS);
    public static final BlockItem BROWN_GLASS_PANE_ITEM = registerGlassBlockItem("brown_glass_pane", BROWN_GLASS_PANE);

    public static final Block BLACK_GLASS = registerGlassBlock("black_glass", new StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_BLACK)));
    public static final Block BLACK_GLASS_PANE = registerGlassBlock("black_glass_pane", new StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem BLACK_GLASS_ITEM = registerGlassBlockItem("black_glass", BLACK_GLASS);
    public static final BlockItem BLACK_GLASS_PANE_ITEM = registerGlassBlockItem("black_glass_pane", BLACK_GLASS_PANE);

    public static final Block LIGHT_GRAY_GLASS = registerGlassBlock("light_gray_glass", new StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_GLASS_PANE = registerGlassBlock("light_gray_glass_pane", new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem LIGHT_GRAY_GLASS_ITEM = registerGlassBlockItem("light_gray_glass", LIGHT_GRAY_GLASS);
    public static final BlockItem LIGHT_GRAY_GLASS_PANE_ITEM = registerGlassBlockItem("light_gray_glass_pane", LIGHT_GRAY_GLASS_PANE);

    public static final Block GRAY_GLASS = registerGlassBlock("gray_glass", new StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS).mapColor(MapColor.COLOR_GRAY)));
    public static final Block GRAY_GLASS_PANE = registerGlassBlock("gray_glass_pane", new StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.copyOf(WHITE_STAINED_GLASS)));
    public static final BlockItem GRAY_GLASS_ITEM = registerGlassBlockItem("gray_glass", GRAY_GLASS);
    public static final BlockItem GRAY_GLASS_PANE_ITEM = registerGlassBlockItem("gray_glass_pane", GRAY_GLASS_PANE);

    public static void init() { }
}
