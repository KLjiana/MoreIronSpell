package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.item.OriginFlow;
import com.kaleblangley.more_iron_spell.common.item.magic_tool.DoubleDoor;
import com.kaleblangley.more_iron_spell.common.item.magic_tool.ManaPack;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MoreIronSpell.MODID);

    public static final RegistryObject<Item> ORIGIN_FLOW = ITEM.register("origin_flow", OriginFlow::new);
    //TODO key
    public static final RegistryObject<Item> DOUBLE_DOOR = ITEM.register("double_door", DoubleDoor::new);
    public static final RegistryObject<Item> MANA_PACK = ITEM.register("mana_pack", ManaPack::new);

    public static void register(IEventBus iEventBus) {
        ITEM.register(iEventBus);
    }
}

