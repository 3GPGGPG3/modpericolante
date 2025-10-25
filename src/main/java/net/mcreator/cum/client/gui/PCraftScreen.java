package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.PCraftMenu;
import net.mcreator.cum.network.PCraftButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PCraftScreen extends AbstractContainerScreen<PCraftMenu> {
	private final static HashMap<String, Object> guistate = PCraftMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_jenny;
	Button button_ellie;
	Button button_villager_girl;
	Button button_indietro;

	public PCraftScreen(PCraftMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 210;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/p_craft.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 176 && mouseX < leftPos + 200 && mouseY > topPos + 172 && mouseY < topPos + 196)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.p_craft.tooltip_ricevi_qua_il_tuo_scontrino"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/1.png"), this.leftPos + 8, this.topPos + 20, 0, 0, 80, 80, 80, 80);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/2.png"), this.leftPos + 208, this.topPos + 11, 0, 0, 80, 120, 80, 120);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/3.png"), this.leftPos + 108, this.topPos + 20, 0, 0, 80, 80, 80, 80);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.p_craft.label_choose_your_villager"), 97, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.p_craft.label_pagamento"), 172, 148, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.p_craft.label_5_diamanti"), 237, 159, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.p_craft.label_5_smeraldi"), 237, 169, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_jenny = Button.builder(Component.translatable("gui.cum.p_craft.button_jenny"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PCraftButtonMessage(0, x, y, z));
				PCraftButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 22, this.topPos + 101, 51, 20).build();
		guistate.put("button:button_jenny", button_jenny);
		this.addRenderableWidget(button_jenny);
		button_ellie = Button.builder(Component.translatable("gui.cum.p_craft.button_ellie"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PCraftButtonMessage(1, x, y, z));
				PCraftButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 223, this.topPos + 121, 51, 20).build();
		guistate.put("button:button_ellie", button_ellie);
		this.addRenderableWidget(button_ellie);
		button_villager_girl = Button.builder(Component.translatable("gui.cum.p_craft.button_villager_girl"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PCraftButtonMessage(2, x, y, z));
				PCraftButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 102, this.topPos + 101, 93, 20).build();
		guistate.put("button:button_villager_girl", button_villager_girl);
		this.addRenderableWidget(button_villager_girl);
		button_indietro = Button.builder(Component.translatable("gui.cum.p_craft.button_indietro"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PCraftButtonMessage(3, x, y, z));
				PCraftButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 226, this.topPos + -5, 67, 20).build();
		guistate.put("button:button_indietro", button_indietro);
		this.addRenderableWidget(button_indietro);
	}
}
