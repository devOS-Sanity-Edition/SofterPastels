package one.devos.nautical.SofterPastels.utils.helpers

import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import one.devos.nautical.SofterPastels.utils.CandyTooltipItem
import one.devos.nautical.SofterPastels.utils.secondsToTicks

object Foods {
    fun registerCandy(
        name: String?,
        nutrition: Int,
        saturation: Int,
        effect: MobEffect?,
        amplifier: Int,
        seconds: Int
    ): CandyTooltipItem {
        return Items.registerItem(
            name, CandyTooltipItem(
                Item.Properties().food(
                    FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationMod(saturation.toFloat())
                        .fast()
                        .alwaysEat()
                        .effect(MobEffectInstance(effect, seconds.secondsToTicks(), amplifier), 1.0f).build()
                )
            )
        ) as CandyTooltipItem
    }

    fun registerCandy(name: String?, nutrition: Int, saturation: Int, amplifier: Int): CandyTooltipItem {
        return Items.registerItem(
            name, CandyTooltipItem(
                Item.Properties().food(
                    FoodProperties.Builder()
                        .nutrition(nutrition)
                        .saturationMod(saturation.toFloat())
                        .fast()
                        .alwaysEat()
                        .build()
                )
            )
        ) as CandyTooltipItem
    }

    fun registerTaffy(name: String?, effect: MobEffect?, seconds: Int): CandyTooltipItem {
        return registerCandy(name, 2, 2, effect, 0, seconds)
    }

    fun registerTaffy(name: String?): CandyTooltipItem {
        return registerCandy(name, 2, 2, 0)
    }

    fun registerCottonCandy(name: String?, effect: MobEffect?, seconds: Int): CandyTooltipItem {
        return registerCandy(name, 3, 2, effect, 1, seconds)
    }

    fun registerCottonCandy(name: String?): CandyTooltipItem {
        return registerCandy(name, 3, 2, 1)
    }

    fun registerHardCandy(name: String?, effect: MobEffect?, seconds: Int): CandyTooltipItem {
        return registerCandy(name, 3, 2, effect, 2, seconds)
    }

    fun registerHardCandy(name: String?): CandyTooltipItem {
        return registerCandy(name, 3, 2, 2)
    }

    fun registerIceCream(name: String?): Item {
        return Items.registerItem(
            name,
            Item(Item.Properties().food(FoodProperties.Builder().nutrition(3).saturationMod(5f).build()))
        )
    }


}
