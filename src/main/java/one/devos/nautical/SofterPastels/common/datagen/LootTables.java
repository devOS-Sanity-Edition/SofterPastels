package one.devos.nautical.SofterPastels.common.datagen;

import net.devtech.arrp.api.RRPCallback;
import net.minecraft.resources.ResourceLocation;
import one.devos.nautical.SofterPastels.SofterPastels;

import static net.devtech.arrp.api.RuntimeResourcePack.id;
import static net.devtech.arrp.json.loot.JLootTable.*;
import static one.devos.nautical.SofterPastels.SofterPastels.MOD_ID;

public class LootTables {
    public static void init() {
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_pastel_block"))));
    }
}
