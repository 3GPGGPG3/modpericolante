package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.AzioniDiHuaweiMenu;
import net.mcreator.cum.network.AzioniDiHuaweiButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AzioniDiHuaweiScreen extends AbstractContainerScreen<AzioniDiHuaweiMenu> {
	private final static HashMap<String, Object> guistate = AzioniDiHuaweiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_chatgpt;
	Button button_carica_la_batteria;
	Button button_casa;
	Button button_ali_pay;

	public AzioniDiHuaweiScreen(AzioniDiHuaweiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 195;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/azioni_di_huawei.png");

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

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/cina.png"), this.leftPos + 15, this.topPos + 7, 0, 0, 165, 110, 165, 110);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.azioni_di_huawei.label_scegli_cosa_fare_col_tuo_telefon"), 12, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_chatgpt = Button.builder(Component.translatable("gui.cum.azioni_di_huawei.button_chatgpt"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDiHuaweiButtonMessage(0, x, y, z));
				AzioniDiHuaweiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 100, this.topPos + 21, 61, 20).build();
		guistate.put("button:button_chatgpt", button_chatgpt);
		this.addRenderableWidget(button_chatgpt);
		button_carica_la_batteria = Button.builder(Component.translatable("gui.cum.azioni_di_huawei.button_carica_la_batteria"), e -> {
		}).bounds(this.leftPos + 38, this.topPos + 95, 119, 20).build();
		guistate.put("button:button_carica_la_batteria", button_carica_la_batteria);
		this.addRenderableWidget(button_carica_la_batteria);
		button_casa = Button.builder(Component.translatable("gui.cum.azioni_di_huawei.button_casa"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new AzioniDiHuaweiButtonMessage(2, x, y, z));
				AzioniDiHuaweiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 122, this.topPos + 72, 46, 20).build();
		guistate.put("button:button_casa", button_casa);
		this.addRenderableWidget(button_casa);
		button_ali_pay = Button.builder(Component.translatable("gui.cum.azioni_di_huawei.button_ali_pay"), e -> {
		}).bounds(this.leftPos + 100, this.topPos + 43, 61, 20).build();
		guistate.put("button:button_ali_pay", button_ali_pay);
		this.addRenderableWidget(button_ali_pay);
	}
}
