package com.imir.sixtysecmod.item.custom;

import com.imir.sixtysecmod.menu.SuitcaseMenu;
import com.imir.sixtysecmod.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class SuitcaseItem extends Item implements MenuProvider {
    public SuitcaseItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        Level level = pContext.getLevel();
        Player pPlayer = pContext.getPlayer();

        if (!level.isClientSide) {
            ServerPlayer player = (ServerPlayer) pPlayer;
            if (player != null) {
                player.closeContainer();
                openSuitcaseMenu(pPlayer);
                level.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.SUITCASE_OPEN.get(), SoundSource.PLAYERS);
            }
        }

        return InteractionResult.SUCCESS;
    }

    private void openSuitcaseMenu(Player pPlayer) {
        pPlayer.openMenu(new SimpleMenuProvider(
                (pContainerId, playerInventory, pPlayer1) -> new SuitcaseMenu(pContainerId, playerInventory),
                Component.translatable("menu.title.sixtysecmod.suitcase")
        ));
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        pTooltipComponents.add(Component.translatable("item.sixtysecmod.suitcase.tooltip"));
    }

    @Override
    public Component getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory playerInventory, Player pPlayer) {
        return null;
    }
}