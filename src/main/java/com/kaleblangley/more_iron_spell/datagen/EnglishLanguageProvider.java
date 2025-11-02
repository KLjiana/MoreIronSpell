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

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, MoreIronSpell.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        ItemInit.ITEM.getEntries().forEach(batchCase());
        AttributeInit.ATTRIBUTE.getEntries().forEach(batchCase());
        SchoolInit.SCHOOL.getEntries().forEach(batchCase());
        SpellInit.SPELL.getEntries().forEach(batchCase());

        curiosLang(ItemTagInit.MAGIC_TOOL_CURIOS);

        add(TranslateInit.MAGIC_INFO, "\u00A78Magic Info");
        add(TranslateInit.MAGIC_MODID, "\u00A78Magic Mod:%s");
        add(TranslateInit.MAGIC_ID, "\u00A78Magic ID:%s");
    }

    private void curiosLang(TagKey<?> tagKey) {
        String path = tagKey.location().getPath();
        add("curios.identifier.%s".formatted(path), toTitleCase(path));
    }

    private Consumer<RegistryObject<?>> batchCase() {
        return object -> add(object.getId().toLanguageKey(object.getKey().registry().getPath()), toTitleCase(object.getId().getPath()));
    }

    private static String toTitleCase(String raw) {
        return Arrays.stream(raw.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
