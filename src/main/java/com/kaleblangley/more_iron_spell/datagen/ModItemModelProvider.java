package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.init.register.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreIronSpell.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemInit.MANA_PACK.get());
        basicItem(ItemInit.ORIGIN_FLOW.get());
    }
}