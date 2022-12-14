package one.devos.nautical.SofterPastels.common.datagen;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import one.devos.nautical.SofterPastels.SofterPastels;
import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks;
import one.devos.nautical.SofterPastels.common.SofterPastelsItems;

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

    }
}
