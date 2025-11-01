package com.kaleblangley.more_iron_spell.client.event;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.client.render.entity.LightningBombRenderer;
import com.kaleblangley.more_iron_spell.common.init.register.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreIronSpell.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvent {
    @SubscribeEvent
    public static void entityRender(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.LIGHTNING_BOMB.get(), LightningBombRenderer::new);
    }
}
