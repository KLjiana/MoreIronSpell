package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.ItemTagInit;
import com.kaleblangley.more_iron_spell.common.init.register.ItemInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
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
                .add(Items.NETHER_STAR);

        tag(ItemTagInit.MAGIC_TOOL_CURIOS)
                .replace(false)
                .add(ItemInit.DOUBLE_DOOR.get());
    }
}
