package com.kaleblangley.more_iron_spell.common.item.magic_tool;

import net.minecraft.world.item.Item;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class AbstractMagicTool extends Item implements ICurioItem {
    public AbstractMagicTool() {
        super(new Properties().stacksTo(1).defaultDurability(0));
    }


}
