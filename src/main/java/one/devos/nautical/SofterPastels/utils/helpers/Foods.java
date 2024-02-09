package one.devos.nautical.SofterPastels.utils.helpers;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import one.devos.nautical.SofterPastels.utils.CandyTooltipItem;

import static one.devos.nautical.SofterPastels.utils.SecondsToTicks.SecondsToTicks;
import static one.devos.nautical.SofterPastels.utils.helpers.Items.registerItem;

public class Foods {
    public static CandyTooltipItem registerCandy(String name, int nutrition, int saturation, MobEffect effect, int amplifier, int seconds) {
        return (CandyTooltipItem) registerItem(name, new CandyTooltipItem(new Item.Properties().food(new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .fast()
                .alwaysEat()
                .effect(new MobEffectInstance(effect, SecondsToTicks(seconds), amplifier), 1.0F).build()), 1.0F));
    }

    public static CandyTooltipItem registerCandy(String name, int nutrition, int saturation, int amplifier) {
        return (CandyTooltipItem) registerItem(name, new CandyTooltipItem(new Item.Properties().food(new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .fast()
                .alwaysEat()
                .build()), 1.0F));
    }

    public static CandyTooltipItem registerTaffy(String name, MobEffect effect, int seconds) {
        return registerCandy(name, 2, 2, effect, 0, seconds);
    }

    public static CandyTooltipItem registerTaffy(String name) {
        return registerCandy(name, 2, 2, 0);
    }

    public static CandyTooltipItem registerCottonCandy(String name, MobEffect effect, int seconds) {
        return registerCandy(name, 3, 2, effect, 1, seconds);
    }

    public static CandyTooltipItem registerCottonCandy(String name) {
        return registerCandy(name, 3, 2, 1);
    }

    public static CandyTooltipItem registerHardCandy(String name, MobEffect effect, int seconds) {
        return registerCandy(name, 3, 2, effect, 2, seconds);
    }

    public static CandyTooltipItem registerHardCandy(String name) {
        return registerCandy(name, 3, 2, 2);
    }

    public static Item registerIceCream(String name) {
        return registerItem(name, new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(5).build())));
    }

    public static Item registerRegularItem(String name) {
        return registerItem(name, new Item(new Item.Properties()));
    }
}
