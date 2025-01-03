package com.imir.sixtysecmod.entity;

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

    //immobilize behavior

    public static AttributeSupplier.Builder createAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 100.0)
                .add(Attributes.MOVEMENT_SPEED, 0.0);
    }

    @Override
    public boolean isPushable() {
        return false;
    }
}