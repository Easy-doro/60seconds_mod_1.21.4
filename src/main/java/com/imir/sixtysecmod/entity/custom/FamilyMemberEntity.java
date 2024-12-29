package com.imir.sixtysecmod.entity.custom;

import com.imir.sixtysecmod.util.NPCDataHandler;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public abstract class FamilyMemberEntity extends LivingEntity {
    public FamilyMemberEntity(EntityType<? extends LivingEntity> p_20966_, Level p_20967_) {
        super(p_20966_, p_20967_);
    }

    public void tick() {
        super.tick();

        float hunger = NPCDataHandler.getHunger(this);
        float thirst = NPCDataHandler.getThirst(this);

        if (hunger <= 0 || thirst <= 0) {

        }
    }

    //Immobilisation

    public static AttributeSupplier.Builder createAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 100.0)
                .add(Attributes.MOVEMENT_SPEED, 0.0);
    }

    @Override
    public void aiStep() {
        // Neutraliser tout comportement par défaut
    }

    @Override
    public boolean isPushable() {
        return false; // Empêche que l'entité soit poussée
    }

    @Override
    public void push(double dx, double dy, double dz) {
        // Neutralise les poussées
    }

    @Override
    public boolean isAffectedByFluids() {
        return false; // Empêche l'interaction avec les fluides (eau, lave)
    }
}