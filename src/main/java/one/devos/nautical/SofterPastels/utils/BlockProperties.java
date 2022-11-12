package one.devos.nautical.SofterPastels.utils;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy;

public class BlockProperties {
    public static final BlockBehaviour.StatePredicate never = (state, view, pos) -> false;
    public static final int PastelSandColor = 16246726;
    public static BlockBehaviour.Properties PastelBlock() { return copy(WHITE_CONCRETE); }
    public static BlockBehaviour.Properties PastelPowder() { return copy(WHITE_CONCRETE_POWDER); }
    public static BlockBehaviour.Properties DirtLike() { return copy(DIRT); }
    public static BlockBehaviour.Properties PastelLeaves() {return copy(OAK_LEAVES).noOcclusion().isViewBlocking(never).isSuffocating(never); }
    public static BlockBehaviour.Properties SandLike() { return BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND) ; }
    public static BlockBehaviour.Properties crops() { return(copy(WHEAT)); }
}
