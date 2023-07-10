package one.devos.nautical.SofterPastels.common.blocks;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.properties.WoodType;

// i'm going to go do someones father
public class FenceGateBlock extends net.minecraft.world.level.block.FenceGateBlock {
    public FenceGateBlock(Properties properties) {
        super(properties, WoodType.OAK);
    }
}
