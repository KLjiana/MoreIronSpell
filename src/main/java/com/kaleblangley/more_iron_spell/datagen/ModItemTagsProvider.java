package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.ItemTagInit;
import com.kaleblangley.more_iron_spell.common.init.register.ItemInit;
import com.kaleblangley.more_iron_spell.common.item.magic_tool.AbstractMagicTool;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagProvider, MoreIronSpell.MODID, existingFileHelper);

    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ItemTagInit.ORIGIN_FOCUS)
                .replace(false)
                .add(ItemInit.ORIGIN_FLOW.get());

        tag(ItemTagInit.MAGIC_TOOL_CURIOS)
                .replace(false)
                .add(ItemInit.ITEM.getEntries().stream().map(RegistryObject::get).filter(item -> item instanceof AbstractMagicTool).toArray(Item[]::new));
    }
}
