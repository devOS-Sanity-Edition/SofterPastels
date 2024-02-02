package one.devos.nautical.SofterPastels.utils;

import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copyOf;
import static net.minecraft.world.level.block.Blocks.*;

public class BlockProperties {
    public static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;
    public static BlockBehaviour.Properties PastelBlock() { return copyOf(WHITE_CONCRETE); }
    public static BlockBehaviour.Properties PastelPowder() { return copyOf(WHITE_CONCRETE_POWDER); }
    public static BlockBehaviour.Properties Crops() { return(copyOf(WHEAT)); }
}
