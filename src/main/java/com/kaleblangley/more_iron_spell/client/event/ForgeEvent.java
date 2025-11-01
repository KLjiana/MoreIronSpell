package com.kaleblangley.more_iron_spell.client.event;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.item.Scroll;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreIronSpell.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ForgeEvent {
    @SubscribeEvent
    public static void tooltips(RenderTooltipEvent event) {
        if (event.getItemStack().is(ItemRegistry.SCROLL.get())) {
            //TODO F3+H magic info
        }
    }
}
