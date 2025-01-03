package com.imir.sixtysecmod.client.gui.screen;

import com.imir.sixtysecmod.SixtySecMod;
import com.imir.sixtysecmod.menu.SuitcaseMenu;
import com.imir.sixtysecmod.sound.ModSounds;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class SuitcaseScreen extends AbstractContainerScreen<SuitcaseMenu> {
    public SuitcaseScreen(SuitcaseMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    private static final ResourceLocation BG_LOCATION = ResourceLocation.fromNamespaceAndPath(SixtySecMod.MOD_ID, "textures/gui/suitcase_gui.png");

    @Override
    protected void init(){
        super.init();
        this.inventoryLabelY = 10000;
        this.titleLabelY = 10000;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, BG_LOCATION);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(RenderType::entityTranslucent, BG_LOCATION, x, y, 0.0f, 0.0f, imageWidth, imageHeight, imageWidth, imageHeight);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        this.renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    public void onClose(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player pPlayer = pContext.getPlayer();
        level.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.SUITCASE_CLOSE.get(), SoundSource.PLAYERS);
    }
}
