package com.kaleblangley.more_iron_spell.common.init;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraftforge.registries.ForgeRegistries;

public class DamageTypeInit {
    public static final ResourceKey<DamageType> ORIGIN = type("origin");

    private static ResourceKey<DamageType> type(String path) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, MoreIronSpell.modLoc(path));
    }
}
