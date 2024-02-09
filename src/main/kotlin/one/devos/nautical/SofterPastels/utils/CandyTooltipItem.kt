package one.devos.nautical.SofterPastels.utils

import net.minecraft.network.chat.Component
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag
import net.minecraft.world.item.alchemy.PotionUtils
import net.minecraft.world.level.Level
import java.util.*

class CandyTooltipItem(properties: Properties) : Item(properties) {

    override fun appendHoverText(itemStack: ItemStack, level: Level?, list: MutableList<Component>, tooltipFlag: TooltipFlag) {
        list.add(Component.translatable("item.softerpastels.candies.hunger.description"))

        val effects = LinkedList<MobEffectInstance>()

        if (itemStack.foodComponent != null) {
            for (effect in itemStack.foodComponent!!.effects) {
                effects.add(effect.first)
            }
        }

        PotionUtils.addPotionTooltip(effects, list, 1.0f, level?.tickRateManager()?.tickrate() ?: 20.0f)
        list.add(Component.translatable("item.softerpastels.candies.hunger.alwayseat"))
    }
}
