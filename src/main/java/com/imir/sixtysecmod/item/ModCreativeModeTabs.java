package com.imir.sixtysecmod.item;

import com.imir.sixtysecmod.SixtySecMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SixtySecMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIXTY_SECONDS_ITEMS_TAB = CREATIVE_MODE_TABS.register("sixty_seconds_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOUP.get()))
                    .title(Component.translatable("60 Seconds! Items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SOUP.get());
                        output.accept(ModItems.WATER.get());
                        output.accept(ModItems.AMMUNITION.get());
                        output.accept(ModItems.AXE.get());
                        output.accept(ModItems.CHECKERS.get());
                        output.accept(ModItems.CITY_MAP.get());
                        output.accept(ModItems.DECK_OF_CARDS.get());
                        output.accept(ModItems.GAS_MASK.get());
                        output.accept(ModItems.JOURNAL.get());
                        output.accept(ModItems.MEDKIT.get());
                        output.accept(ModItems.PADLOCK.get());
                        output.accept(ModItems.RADIO.get());
                        output.accept(ModItems.RIFLE.get());
                        output.accept(ModItems.SUITCASE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
