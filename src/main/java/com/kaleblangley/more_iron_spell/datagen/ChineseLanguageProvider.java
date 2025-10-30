package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, MoreIronSpell.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {

    }
}
