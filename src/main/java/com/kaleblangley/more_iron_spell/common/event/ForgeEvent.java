package com.kaleblangley.more_iron_spell.common.event;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.TranslateInit;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.spells.ISpellContainer;
import io.redspace.ironsspellbooks.api.spells.LegacySpellData;
import io.redspace.ironsspellbooks.api.spells.SpellData;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTextTooltip;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = MoreIronSpell.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvent {
    @SubscribeEvent
    public static void tooltips(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();
        if (itemStack.is(ItemRegistry.SCROLL.get()) && event.getFlags().isAdvanced()) {
            //TODO F3+H magic info
            ISpellContainer container = ISpellContainer.get(itemStack);
            if (container.isEmpty()) return;

            List<Component> components = event.getToolTip();
            SpellData spellData = container.getSpellAtIndex(0);
            ResourceLocation location = SpellRegistry.REGISTRY.get().getKey(spellData.getSpell());
            if (location == null) return;

            components.add(Component.translatable(TranslateInit.MAGIC_INFO));
            components.add(Component.translatable(TranslateInit.MAGIC_MODID, Component.literal(location.getNamespace()).withStyle(ChatFormatting.GRAY)));
            components.add(Component.translatable(TranslateInit.MAGIC_ID, Component.literal(location.getPath())).withStyle(ChatFormatting.GRAY));
        }
    }
}
