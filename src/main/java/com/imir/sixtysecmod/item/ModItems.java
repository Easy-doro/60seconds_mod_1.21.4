package com.imir.sixtysecmod.item;

import com.imir.sixtysecmod.SixtySecMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SixtySecMod.MOD_ID);

    public static final RegistryObject<Item> SOUP = ITEMS.register("soup",
            () -> new Item(new Item.Properties()
                    .stacksTo(2)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "soup")
                    ))
            )
    );

    public static final RegistryObject<Item> WATER = ITEMS.register("water",
            () -> new Item(new Item.Properties()
                    .stacksTo(2)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "water")
                    ))
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
