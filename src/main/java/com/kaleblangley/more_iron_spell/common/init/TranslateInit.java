package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;

//TODO HOLDER?
public class TranslateInit {
    public static void init() {}
    public static final String ORIGIN_SCHOOL = schoolKey("original");

    private static String schoolKey(String value) {
        return key("school", value);
    }

    private static String key(String type, String value) {
        return "%s.%s.%s".formatted(type, MoreIronSpell.MODID, value);
    }
}
