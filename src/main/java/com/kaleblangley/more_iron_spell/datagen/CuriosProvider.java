package com.kaleblangley.more_iron_spell.datagen;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import top.theillusivec4.curios.Curios;
import top.theillusivec4.curios.api.CuriosDataProvider;

import java.util.concurrent.CompletableFuture;

public class CuriosProvider extends CuriosDataProvider {
    public CuriosProvider(PackOutput output, ExistingFileHelper fileHelper, CompletableFuture<HolderLookup.Provider> registries) {
        super(MoreIronSpell.MODID, output, fileHelper, registries);
    }

    @Override
    public void generate(HolderLookup.Provider provider, ExistingFileHelper existingFileHelper) {
        createSlot("magic_tool")
                .icon(ResourceLocation.fromNamespaceAndPath(Curios.MODID, "slot/empty_hands_slot"))
                .order(120)
                .addValidator(ResourceLocation.parse("curios:tag"))
                .size(2);

        createEntities("magic_tool")
                .addPlayer()
                .addSlots("magic_tool");
    }
}
