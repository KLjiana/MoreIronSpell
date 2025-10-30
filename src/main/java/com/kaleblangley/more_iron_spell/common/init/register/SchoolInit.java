package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.DamageTypeInit;
import com.kaleblangley.more_iron_spell.common.init.ItemTagInit;
import com.kaleblangley.more_iron_spell.common.init.SoundInit;
import com.kaleblangley.more_iron_spell.common.init.TranslateInit;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SchoolInit {
    public static final DeferredRegister<SchoolType> SCHOOL = DeferredRegister.create(SchoolRegistry.SCHOOL_REGISTRY_KEY, MoreIronSpell.MODID);

    public static final ResourceLocation ORIGIN_RESOURCE = MoreIronSpell.modLoc("origin");

    public static final RegistryObject<SchoolType> ORIGIN_SCHOOL = registerSchool(
            new SchoolType(
                    ORIGIN_RESOURCE,
                    ItemTagInit.ORIGIN_FOCUS,
                    Component.translatable(TranslateInit.ORIGIN_SCHOOL).withStyle(ChatFormatting.WHITE),
                    LazyOptional.of(AttributeInit.ORIGIN_POWER::get),
                    LazyOptional.of(AttributeInit.ORIGIN_RESIST::get),
                    LazyOptional.of(SoundInit.ORIGIN_CAST::get),
                    DamageTypeInit.ORIGIN
            )
    );


    private static RegistryObject<SchoolType> registerSchool(SchoolType schoolType) {
        return SCHOOL.register(schoolType.getId().getPath(), () -> schoolType);
    }

    public static void register(IEventBus iEventBus) {
        SCHOOL.register(iEventBus);
    }
}
