package com.imir.sixtysecmod.menu;

import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class SuitcaseMenu extends AbstractContainerMenu {
    private final Container pContainer;

    public SuitcaseMenu(int pContainerId, Inventory playerInventory) {
        super(ModMenuTypes.SUITCASE_MENU.get(), pContainerId);
        this.pContainer =  new SimpleContainer(3);

        for (int i = 0; i < 3; i++) {
            this.addSlot(new Slot(pContainer, i, 44 + i * 18,20));
        }

        addPlayerInventory(playerInventory);
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 51 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 109));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        return null;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return true;
    }
}
