package one.devos.nautical.SofterPastels.utils;

import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;

public class BlockProperties {
    public static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;
    public static BlockBehaviour.Properties PastelBlock() { return copy(WHITE_CONCRETE); }
    public static BlockBehaviour.Properties PastelPowder() { return copy(WHITE_CONCRETE_POWDER); }
    public static BlockBehaviour.Properties Crops() { return(copy(WHEAT)); }
}
