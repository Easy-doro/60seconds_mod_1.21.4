package com.imir.sixtysecmod.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;

public class NPCDataHandler {
    // Clés des données
    private static final String HUNGER_KEY = "hunger";
    private static final String THIRST_KEY = "thirst";
    private static final String SANITY_KEY = "sanity";

    // Récupérer la valeur de hunger
    public static float getHunger(Entity entity) {
        CompoundTag data = entity.getPersistentData();
        return data.contains(HUNGER_KEY) ? data.getFloat(HUNGER_KEY) : 100.0f; // 100 par défaut
    }

    // Définir la valeur de hunger
    public static void setHunger(Entity entity, float hunger) {
        CompoundTag data = entity.getPersistentData();
        data.putFloat(HUNGER_KEY, hunger);
    }

    // Récupérer la valeur de thirst
    public static float getThirst(Entity entity) {
        CompoundTag data = entity.getPersistentData();
        return data.contains(THIRST_KEY) ? data.getFloat(THIRST_KEY) : 100.0f; // 100 par défaut
    }

    // Définir la valeur de thirst
    public static void setThirst(Entity entity, float thirst) {
        CompoundTag data = entity.getPersistentData();
        data.putFloat(THIRST_KEY, thirst);
    }

    // Récupérer la valeur de sanity
    public static float getSanity(Entity entity) {
        CompoundTag data = entity.getPersistentData();
        return data.contains(SANITY_KEY) ? data.getFloat(SANITY_KEY) : 100.0f; // 100 par défaut
    }

    // Définir la valeur de sanity
    public static void setSanity(Entity entity, float sanity) {
        CompoundTag data = entity.getPersistentData();
        data.putFloat(SANITY_KEY, sanity);
    }
}
