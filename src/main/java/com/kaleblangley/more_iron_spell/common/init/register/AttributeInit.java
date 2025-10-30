package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import io.redspace.ironsspellbooks.api.attribute.MagicRangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AttributeInit {
    public static final DeferredRegister<Attribute> ATTRIBUTE = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MoreIronSpell.MODID);

    public static final RegistryObject<Attribute> ORIGIN_POWER = power("origin");
    public static final RegistryObject<Attribute> ORIGIN_RESIST = resistance("origin");

    private static RegistryObject<Attribute> resistance(String id) {
        return ATTRIBUTE.register(id + "_magic_resist", () -> (new MagicRangedAttribute("attribute.irons_spellbooks." + id + "_magic_resist", 1.0D, -100, 100).setSyncable(true)));
    }

    private static RegistryObject<Attribute> power(String id) {
        return ATTRIBUTE.register(id + "_spell_power", () -> (new MagicRangedAttribute("attribute.irons_spellbooks." + id + "_spell_power", 1.0D, -100, 100).setSyncable(true)));
    }

    public static void register(IEventBus iEventBus) {
        ATTRIBUTE.register(iEventBus);
    }
}
