package com.kaleblangley.more_iron_spell.common.init.register;

import com.kaleblangley.more_iron_spell.MoreIronSpell;
import com.kaleblangley.more_iron_spell.common.entity.LightningBombEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> TYPE = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MoreIronSpell.MODID);

    public static final RegistryObject<EntityType<LightningBombEntity>> LIGHTNING_BOMB = TYPE
            .register("lightning_bomb",
                    () -> EntityType.Builder
                            .of(LightningBombEntity::new, MobCategory.MISC)
                            .fireImmune()
                            .sized(0.4f, 0.1f)
                            .build(MoreIronSpell.modLoc("lightning_bomb").toString())
            );

    public static void register(IEventBus iEventBus) {
        TYPE.register(iEventBus);
    }
}
