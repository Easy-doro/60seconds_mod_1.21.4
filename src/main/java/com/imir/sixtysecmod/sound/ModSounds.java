package com.imir.sixtysecmod.sound;

import com.imir.sixtysecmod.SixtySecMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SixtySecMod.MOD_ID);

    public static final RegistryObject<SoundEvent> RADIO_SOUND = registerSoundEvent("radio_sound");

    public static final RegistryObject<SoundEvent> SUITCASE_OPEN = registerSoundEvent("suitcase_open");
    public static final RegistryObject<SoundEvent> SUITCASE_CLOSE = registerSoundEvent("suitcase_close");

    private static  RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent((ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, name))));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}