package com.imir.sixtysecmod.entity;

import com.imir.sixtysecmod.SixtySecMod;
import com.imir.sixtysecmod.entity.custom.FamilyMemberEntity;
import com.imir.sixtysecmod.entity.custom.TedEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SixtySecMod.MOD_ID);

    public static final RegistryObject<EntityType<TedEntity>> TED =
            ENTITY_TYPES.register("ted", () -> EntityType.Builder.of(TedEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.5f).build("ted"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
