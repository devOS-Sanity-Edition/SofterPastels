package one.devos.nautical.softerpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider


private class SofterPastelsEnglishLanguageProvider(dataGenerator: FabricDataOutput) :
    FabricLanguageProvider(dataGenerator, "en_us") {
    override fun generateTranslations(translationBuilder: TranslationBuilder) {
    }
}