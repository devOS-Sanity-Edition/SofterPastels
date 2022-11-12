package one.devos.nautical.SofterPastels.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.renderer.RenderType;
import one.devos.nautical.SofterPastels.common.blocks.GlassBlocks;

@Environment(EnvType.CLIENT)
public class SofterPastelsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.WHITE_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.WHITE_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_RED_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_RED_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_RED_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_RED_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.RED_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.RED_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.ORANGE_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.ORANGE_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.YELLOW_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.YELLOW_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GREEN_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GREEN_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_GREEN_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_GREEN_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.GREEN_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.GREEN_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_BLUE_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_BLUE_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BLUE_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BLUE_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.PURPLE_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.PURPLE_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.MAGENTA_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.MAGENTA_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BROWN_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BROWN_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BLACK_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.BLACK_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_GRAY_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.LIGHT_GRAY_GLASS_PANE_ITEM, RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_PANE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.GRAY_GLASS_ITEM, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putItem(GlassBlocks.GRAY_GLASS_PANE_ITEM, RenderType.translucent());
    }
}
