package one.devos.nautical.SofterPastels.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import one.devos.nautical.SofterPastels.utils.CandyTooltipItem;

import static one.devos.nautical.SofterPastels.utils.Register.*;

public class SofterPastelsItems {
    public static final CandyTooltipItem WHITE_TAFFY = registerTaffy("white_taffy", MobEffects.INVISIBILITY, 30);
    public static final CandyTooltipItem WHITE_COTTON_CANDY = registerCottonCandy("white_cotton_candy", MobEffects.INVISIBILITY, 15);
    public static final CandyTooltipItem WHITE_HARD_CANDY = registerHardCandy("white_hard_candy", MobEffects.INVISIBILITY, 240);

    public static final CandyTooltipItem LIGHT_RED_TAFFY = registerTaffy("light_red_taffy", MobEffects.REGENERATION, 15);
    public static final CandyTooltipItem LIGHT_RED_COTTON_CANDY = registerCottonCandy("light_red_cotton_candy", MobEffects.REGENERATION, 7);
    public static final CandyTooltipItem LIGHT_RED_HARD_CANDY = registerHardCandy("light_red_hard_candy", MobEffects.REGENERATION, 120);

    public static final CandyTooltipItem RED_TAFFY = registerTaffy("red_taffy", MobEffects.HEALTH_BOOST, 1);
    public static final CandyTooltipItem RED_COTTON_CANDY = registerCottonCandy("red_cotton_candy", MobEffects.HEALTH_BOOST, 1);
    public static final CandyTooltipItem RED_HARD_CANDY = registerHardCandy("red_hard_candy", MobEffects.HEALTH_BOOST, 1);

    public static final CandyTooltipItem ORANGE_TAFFY = registerTaffy("orange_taffy", MobEffects.FIRE_RESISTANCE, 15);
    public static final CandyTooltipItem ORANGE_COTTON_CANDY = registerCottonCandy("orange_cotton_candy", MobEffects.FIRE_RESISTANCE, 7);
    public static final CandyTooltipItem ORANGE_HARD_CANDY = registerHardCandy("orange_hard_candy", MobEffects.FIRE_RESISTANCE, 120);

    public static final CandyTooltipItem YELLOW_TAFFY = registerTaffy("yellow_taffy", MobEffects.DIG_SPEED, 45);
    public static final CandyTooltipItem YELLOW_COTTON_CANDY = registerCottonCandy("yellow_cotton_candy", MobEffects.DIG_SPEED, 22);
    public static final CandyTooltipItem YELLOW_HARD_CANDY = registerHardCandy("yellow_hard_candy", MobEffects.DIG_SPEED, 360);

    public static final CandyTooltipItem LIGHT_GREEN_TAFFY = registerTaffy("light_green_taffy", MobEffects.JUMP, 60);
    public static final CandyTooltipItem LIGHT_GREEN_COTTON_CANDY = registerCottonCandy("light_green_cotton_candy", MobEffects.JUMP, 30);
    public static final CandyTooltipItem LIGHT_GREEN_HARD_CANDY = registerHardCandy("light_green_hard_candy", MobEffects.JUMP, 480);

    public static final CandyTooltipItem GREEN_TAFFY = registerTaffy("green_taffy", MobEffects.LUCK, 180);
    public static final CandyTooltipItem GREEN_COTTON_CANDY = registerCottonCandy("green_cotton_candy", MobEffects.LUCK, 90);
    public static final CandyTooltipItem GREEN_HARD_CANDY = registerHardCandy("green_hard_candy", MobEffects.LUCK, 1440);

    public static final CandyTooltipItem LIGHT_BLUE_TAFFY = registerTaffy("light_blue_taffy", MobEffects.MOVEMENT_SPEED, 60);
    public static final CandyTooltipItem LIGHT_BLUE_COTTON_CANDY = registerCottonCandy("light_blue_cotton_candy", MobEffects.MOVEMENT_SPEED, 30);
    public static final CandyTooltipItem LIGHT_BLUE_HARD_CANDY = registerHardCandy("light_blue_hard_candy", MobEffects.MOVEMENT_SPEED, 480);

    public static final CandyTooltipItem BLUE_TAFFY = registerTaffy("blue_taffy", MobEffects.WATER_BREATHING, 15);
    public static final CandyTooltipItem BLUE_COTTON_CANDY = registerCottonCandy("blue_cotton_candy", MobEffects.WATER_BREATHING, 7);
    public static final CandyTooltipItem BLUE_HARD_CANDY = registerHardCandy("blue_hard_candy", MobEffects.WATER_BREATHING, 120);

    public static final CandyTooltipItem PURPLE_TAFFY = registerTaffy("purple_taffy", MobEffects.SLOW_FALLING, 30);
    public static final CandyTooltipItem PURPLE_COTTON_CANDY = registerCottonCandy("purple_cotton_candy", MobEffects.SLOW_FALLING, 15);
    public static final CandyTooltipItem PURPLE_HARD_CANDY = registerHardCandy("purple_hard_candy", MobEffects.SLOW_FALLING, 240);

    public static final CandyTooltipItem MAGENTA_TAFFY = registerTaffy("magenta_taffy", MobEffects.GLOWING, 60);
    public static final CandyTooltipItem MAGENTA_COTTON_CANDY = registerCottonCandy("magenta_cotton_candy", MobEffects.GLOWING, 30);
    public static final CandyTooltipItem MAGENTA_HARD_CANDY = registerHardCandy("magenta_hard_candy", MobEffects.GLOWING, 480);

    public static final CandyTooltipItem BROWN_TAFFY = registerTaffy("brown_taffy", MobEffects.LEVITATION, 5);
    public static final CandyTooltipItem BROWN_COTTON_CANDY = registerCottonCandy("brown_cotton_candy", MobEffects.LEVITATION, 3);
    public static final CandyTooltipItem BROWN_HARD_CANDY = registerHardCandy("brown_hard_candy", MobEffects.LEVITATION, 40);

    public static final CandyTooltipItem LIGHT_GRAY_TAFFY = registerTaffy("light_gray_taffy", MobEffects.DAMAGE_RESISTANCE, 30);
    public static final CandyTooltipItem LIGHT_GRAY_COTTON_CANDY = registerCottonCandy("light_gray_cotton_candy", MobEffects.DAMAGE_RESISTANCE, 15);
    public static final CandyTooltipItem LIGHT_GRAY_HARD_CANDY = registerHardCandy("light_gray_hard_candy", MobEffects.DAMAGE_RESISTANCE, 240);

    public static final CandyTooltipItem GRAY_TAFFY = registerTaffy("gray_taffy", MobEffects.ABSORPTION, 60);
    public static final CandyTooltipItem GRAY_COTTON_CANDY = registerCottonCandy("gray_cotton_candy", MobEffects.ABSORPTION, 30);
    public static final CandyTooltipItem GRAY_HARD_CANDY = registerHardCandy("gray_hard_candy", MobEffects.ABSORPTION, 480);

    public static final CandyTooltipItem BLACK_TAFFY = registerTaffy("black_taffy");
    public static final CandyTooltipItem BLACK_COTTON_CANDY = registerCottonCandy("black_cotton_candy");
    public static final CandyTooltipItem BLACK_HARD_CANDY = registerHardCandy("black_hard_candy");

    public static final Item COTTON_CANDY_ICE_CREAM = registerItem("cotton_candy_ice_cream", new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream", new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item STRAWBERRY_ICE_CREAM = registerItem("strawberry_ice_cream", new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));

    public static final Item WHITE_POWDER = registerItem("white_powder", new Item(new Item.Properties()));
    public static final Item LIGHT_RED_POWDER = registerItem("light_red_powder", new Item(new Item.Properties()));
    public static final Item RED_POWDER = registerItem("red_powder", new Item(new Item.Properties()));
    public static final Item ORANGE_POWDER = registerItem("orange_powder", new Item(new Item.Properties()));
    public static final Item YELLOW_POWDER = registerItem("yellow_powder", new Item(new Item.Properties()));
    public static final Item LIGHT_GREEN_POWDER = registerItem("light_green_powder", new Item(new Item.Properties()));
    public static final Item GREEN_POWDER = registerItem("green_powder", new Item(new Item.Properties()));
    public static final Item LIGHT_BLUE_POWDER = registerItem("light_blue_powder", new Item(new Item.Properties()));
    public static final Item BLUE_POWDER = registerItem("blue_powder", new Item(new Item.Properties()));
    public static final Item PURPLE_POWDER = registerItem("purple_powder", new Item(new Item.Properties()));
    public static final Item MAGENTA_POWDER = registerItem("magenta_powder", new Item(new Item.Properties()));
    public static final Item BROWN_POWDER = registerItem("brown_powder", new Item(new Item.Properties()));
    public static final Item BLACK_POWDER = registerItem("black_powder", new Item(new Item.Properties()));
    public static final Item LIGHT_GRAY_POWDER = registerItem("light_gray_powder", new Item(new Item.Properties()));
    public static final Item GRAY_POWDER = registerItem("gray_powder", new Item(new Item.Properties()));

    public static final Item POWDER = registerItem("powder", new Item(new Item.Properties()));

    public static void init() { }
}
