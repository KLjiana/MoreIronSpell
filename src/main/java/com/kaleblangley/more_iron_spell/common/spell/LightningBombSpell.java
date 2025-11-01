package com.kaleblangley.more_iron_spell.common.spell;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.AutoSpellConfig;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import net.minecraft.resources.ResourceLocation;

@AutoSpellConfig
public class LightningBombSpell extends AbstractSpell {
    private static final ResourceLocation SPELL_ID = MoreIronSpell.modLoc("lightning_bomb");
    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.RARE)
            .setMaxLevel(5)
            .setSchoolResource(SchoolRegistry.LIGHTNING_RESOURCE)
            .setCooldownSeconds(40)
            .build();

    public LightningBombSpell() {
        this.baseManaCost = 50;
        this.manaCostPerLevel = -5;
        this.baseSpellPower = 8;
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
        return CastType.INSTANT;
    }
}
