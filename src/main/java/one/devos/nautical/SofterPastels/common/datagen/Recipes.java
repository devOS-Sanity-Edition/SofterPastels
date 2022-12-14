package one.devos.nautical.SofterPastels.common.datagen;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import one.devos.nautical.SofterPastels.SofterPastels;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;

import static net.devtech.arrp.api.RuntimeResourcePack.id;
import static net.devtech.arrp.json.loot.JLootTable.*;
import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class Recipes {
    public static void init() {
        // Powder base recipe
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "powder1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_DYE))
                        .add(JIngredient.ingredient()
                                .item(Items.GLOW_INK_SAC)),
                JResult.itemStack(SofterPastelsItems.POWDER, 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "powder2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_DYE))
                        .add(JIngredient.ingredient()
                                .item(Items.GLOWSTONE_DUST)),
                JResult.itemStack(SofterPastelsItems.POWDER, 4)
        ));

        // Actual colored powders
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_DYE)),
                JResult.itemStack(SofterPastelsItems.WHITE_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.PINK_DYE)),
                JResult.itemStack(SofterPastelsItems.LIGHT_RED_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.RED_DYE)),
                JResult.itemStack(SofterPastelsItems.RED_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.ORANGE_DYE)),
                JResult.itemStack(SofterPastelsItems.ORANGE_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.YELLOW_DYE)),
                JResult.itemStack(SofterPastelsItems.YELLOW_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.LIME_DYE)),
                JResult.itemStack(SofterPastelsItems.LIGHT_GREEN_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.GREEN_DYE)),
                JResult.itemStack(SofterPastelsItems.GREEN_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.LIGHT_BLUE_DYE)),
                JResult.itemStack(SofterPastelsItems.LIGHT_BLUE_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.BLUE_DYE)),
                JResult.itemStack(SofterPastelsItems.BLUE_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.PURPLE_DYE)),
                JResult.itemStack(SofterPastelsItems.PURPLE_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.MAGENTA_DYE)),
                JResult.itemStack(SofterPastelsItems.MAGENTA_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.BROWN_DYE)),
                JResult.itemStack(SofterPastelsItems.BROWN_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.LIGHT_GRAY_DYE)),
                JResult.itemStack(SofterPastelsItems.LIGHT_GRAY_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.GRAY_DYE)),
                JResult.itemStack(SofterPastelsItems.GRAY_POWDER, 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_powder"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.POWDER))
                        .add(JIngredient.ingredient()
                                .item(Items.BLACK_DYE)),
                JResult.itemStack(SofterPastelsItems.BLACK_POWDER, 1)
        ));

        // Pastel Powder Blocks
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.WHITE_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_RED_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.RED_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.ORANGE_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.YELLOW_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GREEN_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GREEN_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_BLUE_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLUE_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.PURPLE_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.MAGENTA_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BROWN_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GRAY_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GRAY_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK), 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_powder_block"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLACK_POWDER))
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
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK), 8)
        ));

        // Slabs
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_SLAB_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_slab"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "   ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_SLAB_BLOCK), 6)
        ));

        // Stairs
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_STAIR_BLOCK), 4)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_stairs"), JRecipe.shaped(
                JPattern.pattern(
                        "A  ",
                        "AA ",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_STAIR_BLOCK), 4)
        ));

        // Wool
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.WHITE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_RED_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.RED_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.ORANGE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.YELLOW_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GREEN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GREEN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_BLUE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLUE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.PURPLE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.MAGENTA_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BROWN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GRAY_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GRAY_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_wool1"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Items.WHITE_WOOL))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLACK_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK), 1)
        ));

        // Wool alt [using Softer Pastels' own White Wool]
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_RED_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.RED_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.ORANGE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.YELLOW_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GREEN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GREEN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_BLUE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLUE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.PURPLE_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.MAGENTA_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BROWN_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.LIGHT_GRAY_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.GRAY_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_WOOL_BLOCK), 1)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_wool2"), JRecipe.shapeless(
                JIngredients.ingredients()
                        .add(JIngredient.ingredient()
                                .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK)))
                        .add(JIngredient.ingredient()
                                .item(SofterPastelsItems.BLACK_POWDER)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_WOOL_BLOCK), 1)
        ));

        // Fences
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_FENCE_BLOCK), 3)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_fences"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "ABA",
                        "ABA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_FENCE_BLOCK), 3)
        ));

        // Fence Gates
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_FENCE_GATE_BLOCK))
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_fence_gate"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "BAB",
                        "BAB"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)))
                        .key("B", JIngredient.ingredient().item(Items.STICK)),
                JResult.item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_FENCE_GATE_BLOCK))
        ));

        // Walls
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_WALL_BLOCK), 6)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_walls"), JRecipe.shaped(
                JPattern.pattern(
                        "   ",
                        "AAA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK))),
                JResult.itemStack(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_WALL_BLOCK), 6)
        ));


        // Glass Smelting
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.WHITE_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.LIGHT_RED_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.RED_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.RED_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.ORANGE_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.ORANGE_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.YELLOW_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.YELLOW_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.LIGHT_GREEN_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.GREEN_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.GREEN_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.LIGHT_BLUE_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.BLUE_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.BLUE_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.PURPLE_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.PURPLE_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.MAGENTA_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.MAGENTA_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.BROWN_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.BROWN_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.LIGHT_GRAY_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.GRAY_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.GRAY_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_glass1"), JRecipe.smelting(
                JIngredient.ingredient()
                        .item(Item.byBlock(SofterPastelsBlocks.BLACK_PASTEL_POWDER_BLOCK)),
                JResult.item(GlassBlocks.BLACK_GLASS_ITEM)
        ).cookingTime(200).experience(0.1F));

        // Glass Crafting
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.WHITE_POWDER)),
                JResult.itemStack(GlassBlocks.WHITE_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_RED_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_RED_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.RED_POWDER)),
                JResult.itemStack(GlassBlocks.RED_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.ORANGE_POWDER)),
                JResult.itemStack(GlassBlocks.ORANGE_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.YELLOW_POWDER)),
                JResult.itemStack(GlassBlocks.YELLOW_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_GREEN_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_GREEN_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.GREEN_POWDER)),
                JResult.itemStack(GlassBlocks.GREEN_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_BLUE_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_BLUE_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BLUE_POWDER)),
                JResult.itemStack(GlassBlocks.BLUE_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.PURPLE_POWDER)),
                JResult.itemStack(GlassBlocks.PURPLE_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.MAGENTA_POWDER)),
                JResult.itemStack(GlassBlocks.MAGENTA_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BROWN_POWDER)),
                JResult.itemStack(GlassBlocks.BROWN_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_GRAY_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_GRAY_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.GRAY_POWDER)),
                JResult.itemStack(GlassBlocks.GRAY_GLASS_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_glass2"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BLACK_POWDER)),
                JResult.itemStack(GlassBlocks.BLACK_GLASS_ITEM, 8)
        ));

        // Glass Pane
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "white_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.WHITE_POWDER)),
                JResult.itemStack(GlassBlocks.WHITE_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_red_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_RED_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "red_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.RED_POWDER)),
                JResult.itemStack(GlassBlocks.RED_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "orange_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.ORANGE_POWDER)),
                JResult.itemStack(GlassBlocks.ORANGE_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "yellow_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.YELLOW_POWDER)),
                JResult.itemStack(GlassBlocks.YELLOW_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_green_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_GREEN_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "green_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.GREEN_POWDER)),
                JResult.itemStack(GlassBlocks.GREEN_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_blue_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_BLUE_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "blue_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BLUE_POWDER)),
                JResult.itemStack(GlassBlocks.BLUE_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "purple_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.PURPLE_POWDER)),
                JResult.itemStack(GlassBlocks.PURPLE_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "magenta_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.MAGENTA_POWDER)),
                JResult.itemStack(GlassBlocks.MAGENTA_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "brown_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BROWN_POWDER)),
                JResult.itemStack(GlassBlocks.BROWN_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "light_gray_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.LIGHT_GRAY_POWDER)),
                JResult.itemStack(GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "gray_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.GRAY_POWDER)),
                JResult.itemStack(GlassBlocks.GRAY_GLASS_PANE_ITEM, 8)
        ));
        SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(new ResourceLocation("softerpastels", "black_glass_pane"), JRecipe.shaped(
                JPattern.pattern(
                        "AAA",
                        "ABA",
                        "AAA"),
                JKeys.keys()
                        .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
                        .key("B", JIngredient.ingredient().item(SofterPastelsItems.BLACK_POWDER)),
                JResult.itemStack(GlassBlocks.BLACK_GLASS_PANE_ITEM, 8)
        ));
    }
}