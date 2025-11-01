package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.spell.LightningBombSpell;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SpellInit {
    public static DeferredRegister<AbstractSpell> SPELL = DeferredRegister.createOptional(SpellRegistry.SPELL_REGISTRY_KEY, MoreIronSpell.MODID);

    public static RegistryObject<AbstractSpell> LIGHTNING_BOMB = SPELL.register("lightning_bomb", LightningBombSpell::new);

    public static void register(IEventBus iEventBus) {
        SPELL.register(iEventBus);
    }
}
