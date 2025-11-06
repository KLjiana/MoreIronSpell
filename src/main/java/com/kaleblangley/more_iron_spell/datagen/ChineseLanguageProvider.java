package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.ItemTagInit;
import com.kaleblangley.more_iron_spell.common.init.TranslateInit;
import com.kaleblangley.more_iron_spell.common.init.register.AttributeInit;
import com.kaleblangley.more_iron_spell.common.init.register.ItemInit;
import com.kaleblangley.more_iron_spell.common.init.register.SchoolInit;
import com.kaleblangley.more_iron_spell.common.init.register.SpellInit;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, MoreIronSpell.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.MANA_PACK.get(), "\u53CC\u76F8\u95E8\u6249");

        objectLang(AttributeInit.ORIGIN_POWER, "\u539F\u521D\u6CD5\u672F\u5F3A\u5EA6");
        objectLang(AttributeInit.ORIGIN_RESIST, "\u539F\u521D\u6CD5\u672F\u6297\u6027");

        objectLang(SchoolInit.ORIGIN_SCHOOL, "\u539F\u521D");

        spellLang(SpellInit.LIGHTNING_BOMB, "\u96F7\u9706\u70B8\u5F39");

        curiosLang(ItemTagInit.MAGIC_TOOL_CURIOS, "\u9B54\u5BFC\u5177");

        add(TranslateInit.MAGIC_INFO, "\u00A78\u9B54\u6CD5\u4FE1\u606F");
        add(TranslateInit.MAGIC_MODID, "\u00A78\u9B54\u6CD5\u6A21\u7EC4\uFF1A%s");
        add(TranslateInit.MAGIC_ID, "\u00A78\u9B54\u6CD5ID\uFF1A%s");
    }

    private void curiosLang(TagKey<?> tagKey, String value) {
        String path = tagKey.location().getPath();
        add("curios.identifier.%s".formatted(path), value);
    }

    private void spellLang(RegistryObject<?> object, String value) {
        String path = object.getId().toLanguageKey("spell");
        add(path, value);
    }

    private void objectLang(RegistryObject<?> object, String value) {
        add(key(object), value);
    }

    private String key(RegistryObject<?> object) {
        return object.getId().toLanguageKey(object.getKey().registry().getPath());
    }
}
