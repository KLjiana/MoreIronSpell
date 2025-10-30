package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import top.theillusivec4.curios.Curios;

public class ItemTagInit {
    public static TagKey<Item> ORIGIN_FOCUS = create("original_focus");

    public static TagKey<Item> MAGIC_TOOL_CURIOS = curios("magic_tool");

    private static TagKey<Item> create(String path) {
        return ItemTags.create(MoreIronSpell.modLoc(path));
    }

    private static TagKey<Item> curios(String path) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Curios.MODID, path));
    }
}
