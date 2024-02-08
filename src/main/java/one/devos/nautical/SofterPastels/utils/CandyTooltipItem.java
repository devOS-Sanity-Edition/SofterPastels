package one.devos.nautical.SofterPastels.utils;

import com.mojang.datafixers.util.Pair;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;

public class CandyTooltipItem extends Item {
    public final float durationFactor;
    public CandyTooltipItem(Properties properties, float durationFactor) {
        super(properties);
        this.durationFactor = 1.0F;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.softerpastels.candies.hunger.description"));

        var effects = new LinkedList<MobEffectInstance>();

        if (itemStack.getFoodComponent() != null) {
            for (Pair<MobEffectInstance, Float> effect : itemStack.getFoodComponent().getEffects()) {
                effects.add(effect.getFirst());
            }
        }

        PotionUtils.addPotionTooltip(effects, list, 1.0F, level == null ? 20.0F : level.tickRateManager().tickrate());
        list.add(Component.translatable("item.softerpastels.candies.hunger.alwayseat"));
    }
}
