package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.AzioniDelTelefonoMenu;
import net.mcreator.cum.network.AzioniDelTelefonoButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AzioniDelTelefonoScreen extends AbstractContainerScreen<AzioniDelTelefonoMenu> {
	private final static HashMap<String, Object> guistate = AzioniDelTelefonoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_chatgpt;
	Button button_scommessa;
	Button button_carica_la_batteria;
	Button button_casa;
	Button button_pncraft;

	public AzioniDelTelefonoScreen(AzioniDelTelefonoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 192;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/azioni_del_telefono.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.azioni_del_telefono.label_scegli_cosa_fare_col_tuo_telefon"), 9, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_chatgpt = Button.builder(Component.translatable("gui.cum.azioni_del_telefono.button_chatgpt"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDelTelefonoButtonMessage(0, x, y, z));
				AzioniDelTelefonoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 17, 61, 20).build();
		guistate.put("button:button_chatgpt", button_chatgpt);
		this.addRenderableWidget(button_chatgpt);
		button_scommessa = Button.builder(Component.translatable("gui.cum.azioni_del_telefono.button_scommessa"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDelTelefonoButtonMessage(1, x, y, z));
				AzioniDelTelefonoButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 67, this.topPos + 17, 72, 20).build();
		guistate.put("button:button_scommessa", button_scommessa);
		this.addRenderableWidget(button_scommessa);
		button_carica_la_batteria = Button.builder(Component.translatable("gui.cum.azioni_del_telefono.button_carica_la_batteria"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDelTelefonoButtonMessage(2, x, y, z));
				AzioniDelTelefonoButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 36, this.topPos + 59, 119, 20).build();
		guistate.put("button:button_carica_la_batteria", button_carica_la_batteria);
		this.addRenderableWidget(button_carica_la_batteria);
		button_casa = Button.builder(Component.translatable("gui.cum.azioni_del_telefono.button_casa"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDelTelefonoButtonMessage(3, x, y, z));
				AzioniDelTelefonoButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 141, this.topPos + 17, 46, 20).build();
		guistate.put("button:button_casa", button_casa);
		this.addRenderableWidget(button_casa);
		button_pncraft = Button.builder(Component.translatable("gui.cum.azioni_del_telefono.button_pncraft"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDelTelefonoButtonMessage(4, x, y, z));
				AzioniDelTelefonoButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 38, 72, 20).build();
		guistate.put("button:button_pncraft", button_pncraft);
		this.addRenderableWidget(button_pncraft);
	}
}
