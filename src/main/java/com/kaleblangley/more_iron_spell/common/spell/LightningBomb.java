package com.kaleblangley.more_iron_spell.common.spell;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.AutoSpellConfig;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.Optional;

@AutoSpellConfig
public class LightningBomb extends AbstractSpell {
    private static final ResourceLocation SPELL_ID = MoreIronSpell.modLoc("lightning_bomb");
    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.RARE)
            .setMaxLevel(5)
            .setSchoolResource(SchoolRegistry.LIGHTNING_RESOURCE)
            .setCooldownSeconds(400)
            .build();

    public LightningBomb() {
        this.castTime = 40;
    }

    @Override
    public ResourceLocation getSpellResource() {
        return SPELL_ID;
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.LONG;
    }
}
