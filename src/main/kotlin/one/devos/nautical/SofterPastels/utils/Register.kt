//package one.devos.nautical.SofterPastels.utils
//
//import net.devtech.arrp.json.blockstate.JState
//import net.devtech.arrp.json.models.JModel
//import net.devtech.arrp.json.models.JTextures
//import net.devtech.arrp.json.recipe.*
//import net.minecraft.resources.ResourceLocation
//import net.minecraft.world.item.BlockItem
//import net.minecraft.world.item.Item
//import net.minecraft.world.item.Items
//import net.minecraft.world.level.block.Block
//import one.devos.nautical.SofterPastels.SofterPastels
//import one.devos.nautical.SofterPastels.common.SofterPastelsBlocks
//import one.devos.nautical.SofterPastels.common.SofterPastelsItems
//
//object Register {
//    // Recipe Datagen
//    fun registerPowderBaseRecipe(recipeName: String?, ingredientItem: Item?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.WHITE_DYE)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientItem)
//                    ),
//                JResult.itemStack(SofterPastelsItems.POWDER, 4)
//            )
//        )
//    }
//
//    fun registerColoredPowderRecipe(recipeName: String?, ingredientItem: Item?, powderItem: Item?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(SofterPastelsItems.POWDER)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientItem)
//                    ),
//                JResult.item(powderItem)
//            )
//        )
//    }
//
//    fun registerPowderBlockRecipe(
//        recipeName: String?,
//        ingredientItem: Item?,
//        pastelPowderBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientItem)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.SAND)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.SAND)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.SAND)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.SAND)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.GRAVEL)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.GRAVEL)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.GRAVEL)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.GRAVEL)
//                    ),
//                JResult.itemStack(Item.byBlock(pastelPowderBlockItem), 8)
//            )
//        )
//    }
//
//    fun registerSlabRecipe(recipeName: String?, ingredientBlockItem: Block?, pastelSlabBlockItem: Block?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "   ",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
//                JResult.itemStack(Item.byBlock(pastelSlabBlockItem), 6)
//            )
//        )
//    }
//
//    fun registerStairsRecipe(
//        recipeName: String?,
//        ingredientBlockItem: Block?,
//        pastelStairsBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "A  ",
//                    "AA ",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
//                JResult.itemStack(Item.byBlock(pastelStairsBlockItem), 4)
//            )
//        )
//    }
//
//    fun registerVanillaWoolRecipe(
//        recipeName: String,
//        ingredientBlockItem: Item?,
//        pastelWoolBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName + "_v"), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.WHITE_WOOL)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientBlockItem)
//                    ),
//                JResult.item(Item.byBlock(pastelWoolBlockItem))
//            )
//        )
//    }
//
//    fun registerPastelWoolRecipe(
//        recipeName: String,
//        ingredientBlockItem: Item?,
//        pastelWoolBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName + "_sp"), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Item.byBlock(SofterPastelsBlocks.WHITE_PASTEL_WOOL_BLOCK))
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientBlockItem)
//                    ),
//                JResult.item(Item.byBlock(pastelWoolBlockItem))
//            )
//        )
//    }
//
//    fun registerPastelCarpetsRecipe(
//        recipeName: String?,
//        ingredientBlockItem: Block?,
//        pastelCarpetBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "   ",
//                    "AA "
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
//                JResult.itemStack(Item.byBlock(pastelCarpetBlockItem), 3)
//            )
//        )
//    }
//
//    fun registerFencesRecipe(
//        recipeName: String?,
//        ingredientBlockItem: Block?,
//        pastelFencesBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "ABA",
//                    "ABA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem)))
//                    .key("B", JIngredient.ingredient().item(Items.STICK)),
//                JResult.itemStack(Item.byBlock(pastelFencesBlockItem), 3)
//            )
//        )
//    }
//
//    fun registerFenceGateRecipe(
//        recipeName: String?,
//        ingredientBlockItem: Block?,
//        pastelFenceGateBlockItem: Block?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "BAB",
//                    "BAB"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem)))
//                    .key("B", JIngredient.ingredient().item(Items.STICK)),
//                JResult.item(Item.byBlock(pastelFenceGateBlockItem))
//            )
//        )
//    }
//
//    fun registerWallRecipe(recipeName: String?, ingredientBlockItem: Block?, pastelWallBlockItem: Block?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "AAA",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Item.byBlock(ingredientBlockItem))),
//                JResult.itemStack(Item.byBlock(pastelWallBlockItem), 6)
//            )
//        )
//    }
//
//    fun registerGlassSmelting(
//        recipeName: String?,
//        ingredientBlockItem: Block?,
//        pastelGlassItem: BlockItem?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.smelting(
//                JIngredient.ingredient()
//                    .item(Item.byBlock(ingredientBlockItem)),
//                JResult.item(pastelGlassItem)
//            ).cookingTime(200).experience(0.1f)
//        )
//    }
//
//    fun registerGlassRecipe(recipeName: String?, ingredientItem: Item?, pastelGlassItem: BlockItem?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "AAA",
//                    "ABA",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Items.GLASS))
//                    .key("B", JIngredient.ingredient().item(ingredientItem)),
//                JResult.itemStack(pastelGlassItem, 8)
//            )
//        )
//    }
//
//    fun registerGlassPaneRecipe(
//        recipeName: String?,
//        ingredientItem: Item?,
//        pastelGlassPaneItem: BlockItem?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "AAA",
//                    "ABA",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Items.GLASS_PANE))
//                    .key("B", JIngredient.ingredient().item(ingredientItem)),
//                JResult.itemStack(pastelGlassPaneItem, 8)
//            )
//        )
//    }
//
//    fun registerGlassPaneRectangleRecipe(
//        recipeName: String?,
//        ingredientItem: Item?,
//        pastelGlassPaneItem: BlockItem?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    "   ",
//                    "AAA",
//                    "AAA"
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(ingredientItem)),
//                JResult.itemStack(pastelGlassPaneItem, 16)
//            )
//        )
//    }
//
//    fun registerTaffyRecipe(recipeName: String?, associatedPowder: Item?, pastelCandyItem: Item?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.PAPER)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.HONEYCOMB)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(associatedPowder)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.SUGAR)
//                    ),
//                JResult.itemStack(pastelCandyItem, 4)
//            )
//        )
//    }
//
//    fun registerHardCandyRecipe(recipeName: String?, associatedTaffy: Item?, pastelHardCandyItem: Item?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.smelting(
//                JIngredient.ingredient()
//                    .item(associatedTaffy),
//                JResult.item(pastelHardCandyItem)
//            ).cookingTime(200).experience(1f)
//        )
//    }
//
//    fun registerCottonCandyRecipe(
//        recipeName: String?,
//        taffyIngredientItem: Item?,
//        cottonCandyResult: Item?
//    ): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName), JRecipe.shaped(
//                JPattern.pattern(
//                    " A ",
//                    "ABA",
//                    " C "
//                ),
//                JKeys.keys()
//                    .key("A", JIngredient.ingredient().item(Items.STRING))
//                    .key("B", JIngredient.ingredient().item(taffyIngredientItem))
//                    .key("C", JIngredient.ingredient().item(Items.STICK)),
//                JResult.itemStack(cottonCandyResult, 2)
//            )
//        )
//    }
//
//    fun registerLightRecipe(recipeName: String, ingredientBlockItem: Item?, pastelWoolBlockItem: Block?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addRecipe(
//            ResourceLocation(SofterPastels.MOD_ID, recipeName + "_v"), JRecipe.shapeless(
//                JIngredients.ingredients()
//                    .add(
//                        JIngredient.ingredient()
//                            .item(Items.GLOWSTONE)
//                    )
//                    .add(
//                        JIngredient.ingredient()
//                            .item(ingredientBlockItem)
//                    ),
//                JResult.item(Item.byBlock(pastelWoolBlockItem))
//            )
//        )
//    }
//
//    // Blockstate Datagen
//    fun registerBlockState(blockstateModelName: String, blockstateName: String?): ByteArray {
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addBlockState(
//            JState.state(JState.variant(JState.model("softerpastels:block/$blockstateModelName"))),
//            ResourceLocation(SofterPastels.MOD_ID, blockstateName)
//        )
//    }
//
//    // Basic Model Datagen
//    fun registerModel(modelName: String): ByteArray {
//        val model =
//            JModel().parent("block/cube_all").textures(JTextures().`var`("all", "softerpastels:block/$modelName"))
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(
//            model,
//            ResourceLocation(SofterPastels.MOD_ID, "block/$modelName")
//        )
//    }
//
//    // Carpet Model Datagen
//    fun registerCarpetModel(woolTexture: String, modelName: String): ByteArray {
//        val model = JModel().parent("minecraft:block/carpet")
//            .textures(JTextures().`var`("wool", "softerpastels:block/" + woolTexture + "_wool"))
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(
//            model,
//            ResourceLocation(SofterPastels.MOD_ID, "block/$modelName")
//        )
//    }
//
//    // Basic Block Item Datagen
//    fun registerBlockItemModel(blockItemModelName: String): ByteArray {
//        val blockItemModel = JModel().parent("softerpastels:block/$blockItemModelName")
//
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(
//            blockItemModel,
//            ResourceLocation(SofterPastels.MOD_ID, "item/$blockItemModelName")
//        )
//    }
//
//    // Basic Item Datagen
//    fun registerItemModel(itemModelName: String): ByteArray {
//        val itemModel = JModel().parent("minecraft:item/generated")
//            .textures(JTextures().`var`("layer0", "softerpastels:item/$itemModelName"))
//
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(
//            itemModel,
//            ResourceLocation(SofterPastels.MOD_ID, "item/$itemModelName")
//        )
//    }
//
//    // Basic Handheld Item Datagen
//    fun registerHandheldItemModel(itemModelName: String): ByteArray {
//        val itemModel = JModel().parent("minecraft:item/handheld")
//            .textures(JTextures().`var`("layer0", "softerpastels:item/$itemModelName"))
//
//        return SofterPastels.RUNTIME_RESOURCE_PACK.addModel(
//            itemModel,
//            ResourceLocation(SofterPastels.MOD_ID, "item/$itemModelName")
//        )
//    }
//}
