package com.kaleblangley.more_iron_spell;

import com.kaleblangley.more_iron_spell.common.init.register.AttributeInit;
import com.kaleblangley.more_iron_spell.common.init.register.SchoolInit;
import com.kaleblangley.more_iron_spell.common.init.register.SpellInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Mod(MoreIronSpell.MODID)
public class MoreIronSpell {
    public static final String MODID = "more_iron_spell";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public MoreIronSpell(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        AttributeInit.register(modEventBus);
        SchoolInit.register(modEventBus);
        SpellInit.register(modEventBus);
    }

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
