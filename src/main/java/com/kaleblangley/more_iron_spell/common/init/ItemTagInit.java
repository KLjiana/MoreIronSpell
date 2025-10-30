package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ItemTagInit {
    public static TagKey<Item> ORIGIN_FOCUS = create("original_focus");

    private static TagKey<Item> create(String path) {
        return ItemTags.create(MoreIronSpell.modLoc(path));
    }
}
