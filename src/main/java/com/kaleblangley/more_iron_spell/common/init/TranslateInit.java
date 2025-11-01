package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;

//TODO HOLDER?
public class TranslateInit {
    public static void init() {}
    public static final String ORIGIN_SCHOOL = schoolKey("original");

    //TOOLTIPS
    public static final String MAGIC_INFO = tooltipsKey("magic_info");
    public static final String MAGIC_ID = tooltipsKey("magic_id");
    public static final String MAGIC_LEVEL = tooltipsKey("magic_level");

    private static String schoolKey(String value) {
        return key("school", value);
    }

    private static String tooltipsKey(String value) {
        return key("tooltips", value);
    }

    private static String key(String type, String value) {
        return "%s.%s.%s".formatted(type, MoreIronSpell.MODID, value);
    }
}
