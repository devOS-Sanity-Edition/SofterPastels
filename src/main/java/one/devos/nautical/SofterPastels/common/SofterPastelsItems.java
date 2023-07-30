package one.devos.nautical.SofterPastels.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import static one.devos.nautical.SofterPastels.SofterPastels.SP_ITEM_GROUP;
import static one.devos.nautical.SofterPastels.utils.Register.registerItem;

public class SofterPastelsItems {
    public static int SecondsToTicks(int seconds) {
        return seconds * 20;
    }

    public static final Item WHITE_TAFFY = registerItem("white_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.INVISIBILITY, SecondsToTicks(30), 0), 1.0F).build())));
    public static final Item WHITE_COTTON_CANDY = registerItem("white_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.INVISIBILITY, SecondsToTicks(15), 0), 1.0F).build())));
    public static final Item WHITE_HARD_CANDY = registerItem("white_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.INVISIBILITY, SecondsToTicks(240), 0), 1.0F).build())));

    public static final Item LIGHT_RED_TAFFY = registerItem("light_red_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, SecondsToTicks(15), 0), 1.0F).build())));
    public static final Item LIGHT_RED_COTTON_CANDY = registerItem("light_red_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, SecondsToTicks(7), 1), 1.0F).build())));
    public static final Item LIGHT_RED_HARD_CANDY = registerItem("light_red_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, SecondsToTicks(120), 2), 1.0F).build())));

    public static final Item RED_TAFFY = registerItem("red_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1, 0), 1.0F).build())));
    public static final Item RED_COTTON_CANDY = registerItem("red_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1, 1), 1.0F).build())));
    public static final Item RED_HARD_CANDY = registerItem("red_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1, 2), 1.0F).build())));

    public static final Item ORANGE_TAFFY = registerItem("orange_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, SecondsToTicks(15), 0), 1.0F).build())));
    public static final Item ORANGE_COTTON_CANDY = registerItem("orange_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, SecondsToTicks(7), 1), 1.0F).build())));
    public static final Item ORANGE_HARD_CANDY = registerItem("orange_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, SecondsToTicks(120), 2), 1.0F).build())));

    public static final Item YELLOW_TAFFY = registerItem("yellow_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DIG_SPEED, SecondsToTicks(45), 0), 1.0F).build())));
    public static final Item YELLOW_COTTON_CANDY = registerItem("yellow_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DIG_SPEED, SecondsToTicks(22), 1), 1.0F).build())));
    public static final Item YELLOW_HARD_CANDY = registerItem("yellow_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.DIG_SPEED, SecondsToTicks(360), 2), 1.0F).build())));

    public static final Item LIGHT_GREEN_TAFFY = registerItem("light_green_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.JUMP, SecondsToTicks(60), 0), 1.0F).build())));
    public static final Item LIGHT_GREEN_COTTON_CANDY = registerItem("light_green_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.JUMP, SecondsToTicks(30), 1), 1.0F).build())));
    public static final Item LIGHT_GREEN_HARD_CANDY = registerItem("light_green_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.JUMP, SecondsToTicks(480), 2), 1.0F).build())));

    public static final Item GREEN_TAFFY = registerItem("green_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LUCK, SecondsToTicks(180), 0), 1.0F).build())));
    public static final Item GREEN_COTTON_CANDY = registerItem("green_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LUCK, SecondsToTicks(90), 1), 1.0F).build())));
    public static final Item GREEN_HARD_CANDY = registerItem("green_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.LUCK, SecondsToTicks(1440), 2), 1.0F).build())));

    public static final Item LIGHT_BLUE_TAFFY = registerItem("light_blue_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SecondsToTicks(60), 0), 1.0F).build())));
    public static final Item LIGHT_BLUE_COTTON_CANDY = registerItem("light_blue_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SecondsToTicks(30), 1), 1.0F).build())));
    public static final Item LIGHT_BLUE_HARD_CANDY = registerItem("light_blue_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SecondsToTicks(480), 2), 1.0F).build())));

    public static final Item BLUE_TAFFY = registerItem("blue_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.WATER_BREATHING, SecondsToTicks(15), 0), 1.0F).build())));
    public static final Item BLUE_COTTON_CANDY = registerItem("blue_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.WATER_BREATHING, SecondsToTicks(7), 1), 1.0F).build())));
    public static final Item BLUE_HARD_CANDY = registerItem("blue_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.WATER_BREATHING, SecondsToTicks(120), 2), 1.0F).build())));

    public static final Item PURPLE_TAFFY = registerItem("purple_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SecondsToTicks(30), 0), 1.0F).build())));
    public static final Item PURPLE_COTTON_CANDY = registerItem("purple_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SecondsToTicks(15), 1), 1.0F).build())));
    public static final Item PURPLE_HARD_CANDY = registerItem("purple_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SecondsToTicks(240), 2), 1.0F).build())));

    public static final Item MAGENTA_TAFFY = registerItem("magenta_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.GLOWING, SecondsToTicks(60), 0), 1.0F).build())));
    public static final Item MAGENTA_COTTON_CANDY = registerItem("magenta_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.GLOWING, SecondsToTicks(30), 1), 1.0F).build())));
    public static final Item MAGENTA_HARD_CANDY = registerItem("magenta_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.GLOWING, SecondsToTicks(480), 2), 1.0F).build())));

    public static final Item BROWN_TAFFY = registerItem("brown_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LEVITATION, SecondsToTicks(5), 0), 1.0F).build())));
    public static final Item BROWN_COTTON_CANDY = registerItem("brown_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LEVITATION, SecondsToTicks(3), 1), 1.0F).build())));
    public static final Item BROWN_HARD_CANDY = registerItem("brown_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.LEVITATION, SecondsToTicks(40), 2), 1.0F).build())));


    public static final Item LIGHT_GRAY_TAFFY = registerItem("light_gray_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SecondsToTicks(30), 0), 1.0F).build())));
    public static final Item LIGHT_GRAY_COTTON_CANDY = registerItem("light_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SecondsToTicks(15), 1), 1.0F).build())));
    public static final Item LIGHT_GRAY_HARD_CANDY = registerItem("light_gray_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SecondsToTicks(240), 2), 1.0F).build())));

    public static final Item GRAY_TAFFY = registerItem("gray_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, SecondsToTicks(60), 0), 1.0F).build())));
    public static final Item GRAY_COTTON_CANDY = registerItem("gray_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, SecondsToTicks(30), 1), 1.0F).build())));
    public static final Item GRAY_HARD_CANDY = registerItem("gray_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, SecondsToTicks(480), 2), 1.0F).build())));

    public static final Item BLACK_TAFFY = registerItem("black_taffy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().build())));
    public static final Item BLACK_COTTON_CANDY = registerItem("black_cotton_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().alwaysEat().build())));
    public static final Item BLACK_HARD_CANDY = registerItem("black_hard_candy", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).alwaysEat().build())));

    public static final Item COTTON_CANDY_ICE_CREAM = registerItem("cotton_candy_ice_cream", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item STRAWBERRY_ICE_CREAM = registerItem("strawberry_ice_cream", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));

    public static final Item WHITE_POWDER = registerItem("white_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item LIGHT_RED_POWDER = registerItem("light_red_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item RED_POWDER = registerItem("red_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item ORANGE_POWDER = registerItem("orange_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item YELLOW_POWDER = registerItem("yellow_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item LIGHT_GREEN_POWDER = registerItem("light_green_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item GREEN_POWDER = registerItem("green_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item LIGHT_BLUE_POWDER = registerItem("light_blue_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item BLUE_POWDER = registerItem("blue_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item PURPLE_POWDER = registerItem("purple_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item MAGENTA_POWDER = registerItem("magenta_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item BROWN_POWDER = registerItem("brown_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item BLACK_POWDER = registerItem("black_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item LIGHT_GRAY_POWDER = registerItem("light_gray_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));
    public static final Item GRAY_POWDER = registerItem("gray_powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));

    public static final Item POWDER = registerItem("powder", new Item(new OwoItemSettings().group(SP_ITEM_GROUP).tab(2)));

    public static void init() { }
}
