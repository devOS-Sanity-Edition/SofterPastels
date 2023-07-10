package one.devos.nautical.SofterPastels.utils;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.models.JModel;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import one.devos.nautical.SofterPastels.SofterPastels;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;

import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class Register {
    public static Block registerBlock(String name, Block block, int tab) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(SofterPastels.SP_ITEM_GROUP).tab(tab)));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerCrop(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerGlassBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static BlockItem registerGlassBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(SofterPastels.SP_ITEM_GROUP).tab(1)));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), item);
    }

    public static BlockItem registerBlockItem(String name, Block block, int tab, Item.Properties properties) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, properties));
    }

    // Recipe Datagen
    public static byte[] registerPowderBaseRecipe(String recipeName, Item ingredientItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_DYE))
                        .add(JIngredient.ingredient()
                                .item(ingredientItem)),
                JResult.itemStack(SofterPastelsItems.POWDER, 4)
        ));
    }

    public static byte[] registerColoredPowderRecipe(String recipeName, Item ingredientItem, Item powderItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(ingredientItem)),
                JResult.item(powderItem)
        ));
    }

    public static byte[] registerPowderBlockRecipe(String recipeName, Item ingredientItem, Block pastelPowderBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(ingredientItem))
                        .add(JIngredient.ingredient()
                                .item(Items.SAND))
                        .add(JIngredient.ingredient()
                                .item(Items.SAND))
                        .add(JIngredient.ingredient()
                                .item(Items.SAND))
                        .add(JIngredient.ingredient()
                                .item(Items.SAND))
                        .add(JIngredient.ingredient()
                                .item(Items.GRAVEL))
                        .add(JIngredient.ingredient()
                                .item(Items.GRAVEL))
                        .add(JIngredient.ingredient()
                                .item(Items.GRAVEL))
                        .add(JIngredient.ingredient()
                                .item(Items.GRAVEL)),
                JResult.itemStack(Item.byBlock(pastelPowderBlockItem), 8)
        ));
    }

    public static byte[] registerSlabRecipe(String recipeName, Block ingredientBlockItem, Block pastelSlabBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
                JResult.itemStack(Item.byBlock(pastelSlabBlockItem), 6)
        ));
    }

    public static byte[] registerStairsRecipe(String recipeName, Block ingredientBlockItem, Block pastelStairsBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
                JResult.itemStack(Item.byBlock(pastelStairsBlockItem), 4)
        ));
    }

    public static byte[] registerVanillaWoolRecipe(String recipeName, Item ingredientBlockItem, Block pastelWoolBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName + "_v"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(ingredientBlockItem)),
                JResult.item(Item.byBlock(pastelWoolBlockItem))
        ));
    }

    public static byte[] registerPastelWoolRecipe(String recipeName, Item ingredientBlockItem, Block pastelWoolBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName + "_sp"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(ingredientBlockItem)),
                JResult.item(Item.byBlock(pastelWoolBlockItem))
        ));
    }

    public static byte[] registerFencesRecipe(String recipeName, Block ingredientBlockItem, Block pastelFencesBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(pastelFencesBlockItem), 3)
        ));
    }

    public static byte[] registerFenceGateRecipe(String recipeName, Block ingredientBlockItem, Block pastelFenceGateBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(pastelFenceGateBlockItem))
        ));
    }

    public static byte[] registerWallRecipe(String recipeName, Block ingredientBlockItem, Block pastelWallBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
                JResult.itemStack(Item.byBlock(pastelWallBlockItem), 6)
        ));
    }

    public static byte[] registerGlassSmelting(String recipeName, Block ingredientBlockItem, BlockItem pastelGlassItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(ingredientBlockItem)),
                JResult.item(pastelGlassItem)
        ).cookingTime(200).experience(0.1F));
    }

    public static byte[] registerGlassRecipe(String recipeName, Item ingredientItem, BlockItem pastelGlassItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(ingredientItem)),
                JResult.itemStack(pastelGlassItem, 8)
        ));
    }

    public static byte[] registerGlassPaneRecipe(String recipeName, Item ingredientItem, BlockItem pastelGlassPaneItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(ingredientItem)),
                JResult.itemStack(pastelGlassPaneItem, 8)
        ));
    }

    public static byte[] registerGlassPaneRectangleRecipe(String recipeName, Item ingredientItem, BlockItem pastelGlassPaneItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(ingredientItem)),
                JResult.itemStack(pastelGlassPaneItem, 16)
        ));
    }

    public static byte[] registerTaffyRecipe(String recipeName, Item associatedPowder, Item pastelCandyItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.PAPER))
                        .add(JIngredient.ingredient()
                                .item(Items.HONEYCOMB))
                        .add(JIngredient.ingredient()
                                .item(associatedPowder))
                        .add(JIngredient.ingredient()
                                .item(Items.SUGAR)),
                JResult.itemStack(pastelCandyItem, 4)
        ));
    }

    public static byte[] registerLightRecipe(String recipeName, Item ingredientBlockItem, Block pastelWoolBlockItem) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", recipeName + "_v"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.GLOWSTONE))
                        .add(JIngredient.ingredient()
                                .item(ingredientBlockItem)),
                JResult.item(Item.byBlock(pastelWoolBlockItem))
        ));
    }

    // Blockstate Datagen
    public static byte[] registerBlockState(String blockstateModelName, String blockstateName) {
        return SofterPastels.RUNTIME_RESOURCE_PACK.addBlockState(JState.state(JState.variant(JState.model("softerpastels:block/" + blockstateModelName))), new ResourceLocation("softerpastels", blockstateName));
    }

    // Basic Model Datagen
//    public static byte[] registerModel(String modelName) {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(JModel.model().parent("block/cube_all").textures(JModel.textures().layer0("softerpastels:block/" + modelName)) ,new ResourceLocation("softerpastels", modelName));
//    }
//
//    // Basic Item Datagen
//    public static byte[] registerItemModel(String itemModelName) {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(JModel.model().parent("softerpastels:block/" + itemModelName), new ResourceLocation("softerpastels", itemModelName));
//    }
}
