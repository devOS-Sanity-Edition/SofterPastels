package one.devos.nautical.SofterPastels.utils;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CandyTooltipItem extends Item {
    public final String effectString;
    public CandyTooltipItem(Properties properties, String effectString) {
        super(properties);
        this.effectString = effectString;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.softerpastels.candies.hunger.description"));
        list.add(Component.translatable(effectString));
        list.add(Component.translatable("item.softerpastels.candies.hunger.alwayseat"));
    }
}
