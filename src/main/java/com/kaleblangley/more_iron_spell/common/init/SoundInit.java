package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreIronSpell.MODID);

    public static final RegistryObject<SoundEvent> ORIGIN_CAST = sound("origin_cast");

    private static RegistryObject<SoundEvent> sound(String path) {
        return SOUND_EVENT.register(path, () -> SoundEvent.createVariableRangeEvent(MoreIronSpell.modLoc(path)));
    }
}
