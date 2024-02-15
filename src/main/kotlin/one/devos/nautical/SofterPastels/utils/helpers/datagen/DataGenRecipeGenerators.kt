package one.devos.nautical.SofterPastels.utils.helpers.datagen

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.recipes.*
import net.minecraft.data.recipes.RecipeProvider.getHasName
import net.minecraft.data.recipes.RecipeProvider.has
import net.minecraft.world.item.Items
import net.minecraft.world.level.ItemLike
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks
import one.devos.nautical.SofterPastels.common.SofterPastelsItems

object DataGenRecipeGenerators {
    // There's some naming inconsistencies in this file, I think, I'm a bit too tired to deal with it, I'll fix it
    // either before launching 0.6.0, or after... we'll see

    // Generally, the order is register[TypeOfCrafting][PastelOrNone][NameOfItem][Item,Block,OrFoodName][VorNone]
    // is it lengthy? yes! is it verbose? yeah! does it tell you right away what it is? YES! and that helps imo

    // Documentation later
    fun registerSmeltingPastelGlass(exporter: RecipeOutput, smeltableList: List<ItemLike>, outputPastelGlassItem: ItemLike, group: String) {
        return FabricRecipeProvider.oreSmelting(exporter, smeltableList, RecipeCategory.DECORATIONS, outputPastelGlassItem, 0.7f, 200, group)
    }

    fun registerSmeltingPastelHardCandy(exporter: RecipeOutput, smeltableList: List<ItemLike>, outputPastelHardCandyItem: ItemLike, group: String) {
        return FabricRecipeProvider.oreSmelting(exporter, smeltableList, RecipeCategory.FOOD, outputPastelHardCandyItem, 1f, 200, group)
    }

    fun registerCraftingPastelPowderBaseItem(exporter: RecipeOutput, inputPastelGlowingItem: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SofterPastelsItems.POWDER, 4)
            .requires(Items.WHITE_DYE)
            .requires(inputPastelGlowingItem)
            .unlockedBy(getHasName(Items.WHITE_DYE), has(Items.WHITE_DYE))
            .unlockedBy(getHasName(inputPastelGlowingItem), has(inputPastelGlowingItem))
            .unlockedBy(getHasName(SofterPastelsItems.POWDER), has(SofterPastelsItems.POWDER))
            .save(exporter, SofterPastelsItems.POWDER.toString() + "_" + inputPastelGlowingItem)
    }

    fun registerCraftingPastelColoredPowderItem(exporter: RecipeOutput, inputDyeItem: ItemLike, outputPastelPowderItem: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, outputPastelPowderItem, 1)
            .requires(SofterPastelsItems.POWDER)
            .requires(inputDyeItem)
            .unlockedBy(getHasName(SofterPastelsItems.POWDER), has(SofterPastelsItems.POWDER))
            .unlockedBy(getHasName(inputDyeItem), has(inputDyeItem))
            .unlockedBy(getHasName(outputPastelPowderItem), has(outputPastelPowderItem))
            .save(exporter)
    }

    fun registerCraftingPastelPowderBlock(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelPowderBlock: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, outputPastelPowderBlock, 8)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.SAND)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(Items.GRAVEL)
            .requires(inputPastelPowderItem)
            .unlockedBy(getHasName(Items.SAND), has(Items.SAND))
            .unlockedBy(getHasName(Items.GRAVEL), has(Items.GRAVEL))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelPowderBlock), has(outputPastelPowderBlock))
            .save(exporter)
    }

    fun registerCraftingPastelSlabBlock(exporter: RecipeOutput, inputPastelBlock: ItemLike, outputPastelSlabBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, outputPastelSlabBlock, 6)
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(getHasName(inputPastelBlock), has(inputPastelBlock))
            .unlockedBy(getHasName(outputPastelSlabBlock), has(outputPastelSlabBlock))
            .save(exporter)
    }

    fun registerCraftingPastelStairBlock(exporter: RecipeOutput, inputPastelBlock: ItemLike, outputPastelStairBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, outputPastelStairBlock, 4)
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(getHasName(inputPastelBlock), has(inputPastelBlock))
            .unlockedBy(getHasName(outputPastelStairBlock), has(outputPastelStairBlock))
            .save(exporter)
    }

    fun registerCraftingPastelWoolBlockV(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelWoolBlock: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelWoolBlock, 1)
            .requires(Items.WHITE_WOOL)
            .requires(inputPastelPowderItem)
            .unlockedBy(getHasName(Items.WHITE_WOOL), has(Items.WHITE_WOOL))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelWoolBlock), has(outputPastelWoolBlock))
            .save(exporter, outputPastelWoolBlock.toString().lowercase().removePrefix("block{softerpastels:").replace("}", "") + "_v")
    }

    fun registerCraftingPastelWoolBlock(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelWoolBlock: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelWoolBlock, 1)
            .requires(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)
            .requires(inputPastelPowderItem)
            .unlockedBy(getHasName(SofterPastelsBlocks.WHITE_PASTEL_BLOCK), has(SofterPastelsBlocks.WHITE_PASTEL_BLOCK))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelWoolBlock), has(outputPastelWoolBlock))
            .save(exporter)
    }

    fun registerCraftingPastelCarpetBlock(exporter: RecipeOutput, inputPastelWoolBlock: ItemLike, outputPastelCarpetBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelCarpetBlock, 3)
            .pattern("AA")
            .define('A', inputPastelWoolBlock)
            .unlockedBy(getHasName(inputPastelWoolBlock), has(inputPastelWoolBlock))
            .unlockedBy(getHasName(outputPastelCarpetBlock), has(outputPastelCarpetBlock))
            .save(exporter)
    }

    fun registerCraftingPastelFenceBlock(exporter: RecipeOutput, inputPastelBlock: ItemLike, outputPastelFenceBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelFenceBlock, 3)
            .pattern("ABA")
            .pattern("ABA")
            .define('A', inputPastelBlock)
            .define('B', Items.STICK)
            .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
            .unlockedBy(getHasName(inputPastelBlock), has(inputPastelBlock))
            .unlockedBy(getHasName(outputPastelFenceBlock), has(outputPastelFenceBlock))
            .save(exporter)
    }

    fun registerCraftingPastelFenceGateBlock(exporter: RecipeOutput, inputPastelBlock: ItemLike, outputPastelFenceGateBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelFenceGateBlock, 1)
            .pattern("BAB")
            .pattern("BAB")
            .define('A', inputPastelBlock)
            .define('B', Items.STICK)
            .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
            .unlockedBy(getHasName(inputPastelBlock), has(inputPastelBlock))
            .unlockedBy(getHasName(outputPastelFenceGateBlock), has(outputPastelFenceGateBlock))
            .save(exporter)
    }

    fun registerCraftingPastelWallBlock(exporter: RecipeOutput, inputPastelBlock: ItemLike, outputPastelWallBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelWallBlock, 6)
            .pattern("AAA")
            .pattern("AAA")
            .define('A', inputPastelBlock)
            .unlockedBy(getHasName(inputPastelBlock), has(inputPastelBlock))
            .unlockedBy(getHasName(outputPastelWallBlock), has(outputPastelWallBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassBlock(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelGlassBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassBlock, 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.GLASS)
            .define('B', inputPastelPowderItem)
            .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelGlassBlock), has(outputPastelGlassBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassPaneBlock(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelGlassPaneBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassPaneBlock, 8)
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.GLASS_PANE)
            .define('B', inputPastelPowderItem)
            .unlockedBy(getHasName(Items.GLASS_PANE), has(Items.GLASS_PANE))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelGlassPaneBlock), has(outputPastelGlassPaneBlock))
            .save(exporter)
    }

    fun registerCraftingPastelGlassPaneRectangleBlock(exporter: RecipeOutput, inputPastelGlassBlockItem: ItemLike, outputPastelGlassPaneBlock: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, outputPastelGlassPaneBlock, 16)
            .pattern("AAA")
            .pattern("AAA")
            .define('A', inputPastelGlassBlockItem)
            .unlockedBy(getHasName(inputPastelGlassBlockItem), has(inputPastelGlassBlockItem))
            .unlockedBy(getHasName(outputPastelGlassPaneBlock), has(outputPastelGlassPaneBlock))
            .save(exporter, outputPastelGlassPaneBlock.toString().lowercase().removePrefix("block{softerpastels:").replace("}", "") + "_rect")
    }

    fun registerCraftingPastelLightBlock(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputPastelLightBlock: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, outputPastelLightBlock, 1)
            .requires(Items.GLOWSTONE)
            .requires(inputPastelPowderItem)
            .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputPastelLightBlock), has(outputPastelLightBlock))
            .save(exporter)
    }

    fun registerPastelTaffyItem(exporter: RecipeOutput, inputPastelPowderItem: ItemLike, outputTaffyItem: ItemLike) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, outputTaffyItem, 4)
            .requires(Items.PAPER)
            .requires(Items.HONEYCOMB)
            .requires(Items.SUGAR)
            .requires(inputPastelPowderItem)
            .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
            .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
            .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR))
            .unlockedBy(getHasName(inputPastelPowderItem), has(inputPastelPowderItem))
            .unlockedBy(getHasName(outputTaffyItem), has(outputTaffyItem))
            .save(exporter)
    }

    fun registerCraftingPastelCottonCandyItem(exporter: RecipeOutput, inputTaffyItem: ItemLike, outputCottonCandyItem: ItemLike) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, outputCottonCandyItem, 2)
            .pattern(" A ")
            .pattern("ABA")
            .pattern(" C ")
            .define('A', Items.STRING)
            .define('B', inputTaffyItem)
            .define('C', Items.STICK)
            .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
            .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
            .unlockedBy(getHasName(inputTaffyItem), has(inputTaffyItem))
            .unlockedBy(getHasName(outputCottonCandyItem), has(outputCottonCandyItem))
            .save(exporter)
    }
}