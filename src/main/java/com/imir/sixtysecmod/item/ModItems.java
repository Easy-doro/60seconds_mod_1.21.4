package com.imir.sixtysecmod.item;

import com.imir.sixtysecmod.SixtySecMod;
import com.imir.sixtysecmod.item.custom.*;
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
            () -> new SoupItem(new Item.Properties()
                    .stacksTo(2)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "soup")
                    ))
            )
    );

    public static final RegistryObject<Item> WATER = ITEMS.register("water",
            () -> new WaterItem(new Item.Properties()
                    .stacksTo(2)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "water")
                    ))
            )
    );

    public static final RegistryObject<Item> AMMUNITION = ITEMS.register("ammunition",
            () -> new Item(new Item.Properties()
                    .stacksTo(5)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "ammunition")
                    ))
            )
    );

    public static final RegistryObject<Item> AXE = ITEMS.register("axe",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "axe")
                    ))
            )
    );

    public static final RegistryObject<Item> CHECKERS = ITEMS.register("checkers",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "checkers")
                    ))
            )
    );

    public static final RegistryObject<Item> CITY_MAP = ITEMS.register("city_map",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "city_map")
                    ))
            )
    );

    public static final RegistryObject<Item> DECK_OF_CARDS = ITEMS.register("deck_of_cards",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "deck_of_cards")
                    ))
            )
    );

    public static final RegistryObject<Item> GAS_MASK = ITEMS.register("gas_mask",
            () -> new GasMaskItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "gas_mask")
                    ))
            )
    );

    public static final RegistryObject<Item> JOURNAL = ITEMS.register("journal",
            () -> new JournalItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "journal")
                    ))
            )
    );

    public static final RegistryObject<Item> MEDKIT = ITEMS.register("medkit",
            () -> new MedkitItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "medkit")
                    ))
            )
    );

    public static final RegistryObject<Item> PADLOCK = ITEMS.register("padlock",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "padlock")
                    ))
            )
    );

    public static final RegistryObject<Item> RADIO = ITEMS.register("radio",
            () -> new RadioItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "radio")
                    ))
            )
    );

    public static final RegistryObject<Item> RIFLE = ITEMS.register("rifle",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "rifle")
                    ))
            )
    );

    public static final RegistryObject<Item> SUITCASE = ITEMS.register("suitcase",
            () -> new SuitcaseItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            ForgeRegistries.ITEMS.getRegistryKey(),
                            ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "suitcase")
                    ))
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
