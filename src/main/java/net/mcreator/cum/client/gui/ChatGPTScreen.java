package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.ChatGPTMenu;
import net.mcreator.cum.procedures.DisplayQuaSiProcedure;
import net.mcreator.cum.network.ChatGPTButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChatGPTScreen extends AbstractContainerScreen<ChatGPTMenu> {
	private final static HashMap<String, Object> guistate = ChatGPTMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_pietra;
	Button button_terra;
	Button button_erba;
	Button button_pericolante;
	Button button_diamante;
	Button button_fammi_una_relazione;
	Button button_indietro;

	public ChatGPTScreen(ChatGPTMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 415;
		this.imageHeight = 211;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/chat_gpt.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (DisplayQuaSiProcedure.execute(entity))
			if (mouseX > leftPos + 321 && mouseX < leftPos + 345 && mouseY > topPos + 108 && mouseY < topPos + 132)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.chat_gpt.tooltip_qua_verranno_generate_le_cose"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/chatgpt1.png"), this.leftPos + 261, this.topPos + 48, 0, 0, 144, 144, 144, 144);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.chat_gpt.label_vuoi_che_ti_crei_un_blocco_per_m"), 71, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.chat_gpt.label_oppure_cosa_posso_fare_per_te"), 6, 58, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_pietra = Button.builder(Component.translatable("gui.cum.chat_gpt.button_pietra"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(0, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 111, this.topPos + 13, 56, 20).build();
		guistate.put("button:button_pietra", button_pietra);
		this.addRenderableWidget(button_pietra);
		button_terra = Button.builder(Component.translatable("gui.cum.chat_gpt.button_terra"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(1, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 13, 51, 20).build();
		guistate.put("button:button_terra", button_terra);
		this.addRenderableWidget(button_terra);
		button_erba = Button.builder(Component.translatable("gui.cum.chat_gpt.button_erba"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(2, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 13, 46, 20).build();
		guistate.put("button:button_erba", button_erba);
		this.addRenderableWidget(button_erba);
		button_pericolante = Button.builder(Component.translatable("gui.cum.chat_gpt.button_pericolante"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(3, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 241, this.topPos + 13, 82, 20).build();
		guistate.put("button:button_pericolante", button_pericolante);
		this.addRenderableWidget(button_pericolante);
		button_diamante = Button.builder(Component.translatable("gui.cum.chat_gpt.button_diamante"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(4, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 171, this.topPos + 13, 67, 20).build();
		guistate.put("button:button_diamante", button_diamante);
		this.addRenderableWidget(button_diamante);
		button_fammi_una_relazione = Button.builder(Component.translatable("gui.cum.chat_gpt.button_fammi_una_relazione"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(5, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 68, 124, 20).build();
		guistate.put("button:button_fammi_una_relazione", button_fammi_una_relazione);
		this.addRenderableWidget(button_fammi_una_relazione);
		button_indietro = Button.builder(Component.translatable("gui.cum.chat_gpt.button_indietro"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ChatGPTButtonMessage(6, x, y, z));
				ChatGPTButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 341, this.topPos + 13, 67, 20).build();
		guistate.put("button:button_indietro", button_indietro);
		this.addRenderableWidget(button_indietro);
	}
}
