package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Collectors;

public class TabInit {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreIronSpell.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = TAB.register(MoreIronSpell.MODID, () -> CreativeModeTab
            .builder()
//            .icon()
            .displayItems((parameters, output) -> {
                output.acceptAll(ItemInit.ITEM.getEntries().stream().map(object->object.get().getDefaultInstance()).collect(Collectors.toSet()));
            })
            .build());

    public static void register(IEventBus iEventBus) {
        TAB.register(iEventBus);
    }
}