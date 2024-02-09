package one.devos.nautical.SofterPastels.utils.helpers;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import one.devos.nautical.SofterPastels.common.blocks.FenceGateBlock;
import one.devos.nautical.SofterPastels.common.blocks.StairBlocks;
import one.devos.nautical.SofterPastels.utils.BlockProperties;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copyOf;
import static net.minecraft.world.level.block.Blocks.*;
import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;
import static one.devos.nautical.SofterPastels.common.SofterPastelsBlocks.WHITE_PASTEL_BLOCK;
import static one.devos.nautical.SofterPastels.utils.BlockProperties.PastelPowder;

public class Blocks {
    public static Block registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerGlassBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static BlockItem registerGlassBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties()));
    }

    public static Block registerPastelBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new Block(BlockProperties.PastelBlock().mapColor(mapColor)));
    }

    public static Block registerPastelBlock(String name, MapColor mapColor) {
        return registerBlock(name, new Block(BlockProperties.PastelBlock().mapColor(mapColor)));
    }

    public static Block registerPastelPowderBlock(String name, Block resultPastelBlock, DyeColor mapColor) {
        return registerBlock(name, new ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(mapColor)));
    }

    public static Block registerPastelPowderBlock(String name, Block resultPastelBlock, MapColor mapColor) {
        return registerBlock(name, new ConcretePowderBlock(resultPastelBlock, PastelPowder().mapColor(mapColor)));
    }

    public static Block registerPastelFenceBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new FenceBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelFenceBlock(String name, MapColor mapColor) {
        return registerBlock(name, new FenceBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelFenceGateBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new FenceGateBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelFenceGateBlock(String name, MapColor mapColor) {
        return registerBlock(name, new FenceGateBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelWallBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new WallBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelWallBlock(String name, MapColor mapColor) {
        return registerBlock(name, new WallBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelSlabBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new SlabBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelSlabBlock(String name, MapColor mapColor) {
        return registerBlock(name, new SlabBlock(copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelStairsBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new StairBlocks(STONE_STAIRS.defaultBlockState(), copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerPastelStairsBlock(String name, MapColor mapColor) {
        return registerBlock(name, new StairBlocks(STONE_STAIRS.defaultBlockState(), copyOf(WHITE_CONCRETE).mapColor(mapColor)));
    }

    public static Block registerWoolBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new Block(copyOf(WHITE_WOOL).mapColor(mapColor)));
    }

    public static Block registerWoolBlock(String name, MapColor mapColor) {
        return registerBlock(name, new Block(copyOf(WHITE_WOOL).mapColor(mapColor)));
    }

    public static Block registerLightBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new Block(copyOf(GLOWSTONE).mapColor(mapColor)));
    }

    public static Block registerLightBlock(String name, MapColor mapColor) {
        return registerBlock(name, new Block(copyOf(GLOWSTONE).mapColor(mapColor)));
    }

    public static Block registerCarpetBlock(String name, DyeColor mapColor) {
        return registerBlock(name, new CarpetBlock(copyOf(WHITE_CARPET).mapColor(mapColor)));
    }

    public static Block registerCarpetBlock(String name, MapColor mapColor) {
        return registerBlock(name, new CarpetBlock(copyOf(WHITE_CARPET).mapColor(mapColor)));
    }
}
