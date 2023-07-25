package one.devos.nautical.SofterPastels.common.datagen;

import one.devos.nautical.SofterPastels.SofterPastels;

import static net.devtech.arrp.api.RuntimeResourcePack.id;
import static net.devtech.arrp.json.loot.JLootTable.*;

public class LootTables {
    public static void init() {
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_pastel_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_pastel_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_pastel_block"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_pastel_powder_block"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_pastel_powder_block"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_pastel_powder_block"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_fence"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_fence"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_fence"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_fence_gate"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_fence_gate"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_fence_gate"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_wall"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_wall"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_wall"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_slab"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_slab"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_slab"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_stairs"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_stairs"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_stairs"))));


        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_wool"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_wool"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_wool"))));

        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/white_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:white_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_red_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_red_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/red_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:red_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/orange_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:orange_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/yellow_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:yellow_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_green_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_green_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/green_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:green_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_blue_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_blue_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/blue_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:blue_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/purple_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:purple_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/magenta_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:magenta_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/brown_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:brown_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/black_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:black_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/light_gray_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:light_gray_light"))));
        SofterPastels.RUNTIME_RESOURCE_PACK.addLootTable(id("softerpastels:blocks/gray_light"), loot("minecraft:block").pool(pool().rolls(1).entry(entry().type("minecraft:item").name("softerpastels:gray_light"))));
    }
}
