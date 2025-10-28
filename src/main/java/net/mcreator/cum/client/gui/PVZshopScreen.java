package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.PVZshopMenu;
import net.mcreator.cum.network.PVZshopButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PVZshopScreen extends AbstractContainerScreen<PVZshopMenu> {
	private final static HashMap<String, Object> guistate = PVZshopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_buy;
	Button button_girasole;
	Button button_sparasemi;
	Button button_la_pianta;

	public PVZshopScreen(PVZshopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/pv_zshop.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 19 && mouseX < leftPos + 43 && mouseY > topPos + 40 && mouseY < topPos + 64)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.pv_zshop.tooltip_10_seeds"), mouseX, mouseY);
		if (mouseX > leftPos + 80 && mouseX < leftPos + 104 && mouseY > topPos + 35 && mouseY < topPos + 59)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.pv_zshop.tooltip_20_seeds"), mouseX, mouseY);
		if (mouseX > leftPos + 140 && mouseX < leftPos + 164 && mouseY > topPos + 31 && mouseY < topPos + 55)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.pv_zshop.tooltip_50_seeds"), mouseX, mouseY);
		if (mouseX > leftPos + 205 && mouseX < leftPos + 229 && mouseY > topPos + 43 && mouseY < topPos + 67)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.pv_zshop.tooltip_100_seeds"), mouseX, mouseY);
		if (mouseX > leftPos + 168 && mouseX < leftPos + 192 && mouseY > topPos + 84 && mouseY < topPos + 108)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.pv_zshop.tooltip_prendi_le_piante_acquistate"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/dave_foto_vera.png"), this.leftPos + 275, this.topPos + 67, 0, 0, 119, 119, 119, 119);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/girasole_foto.png"), this.leftPos + 64, this.topPos + 26, 0, 0, 59, 59, 59, 59);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/noce_foto.png"), this.leftPos + 2, this.topPos + 25, 0, 0, 59, 59, 59, 59);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/pianta_foto.png"), this.leftPos + 188, this.topPos + 26, 0, 0, 59, 59, 59, 59);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/sparasemi_foto.png"), this.leftPos + 124, this.topPos + 26, 0, 0, 59, 59, 59, 59);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_ciao_vicino_io_sono_dave_il_pazz"), 6, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_puoi_comprare_delle_piante_in_ca"), 6, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_buy"), 213, 89, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_put_here_your_seeds"), 284, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_metti_il_cursore_al_centro_per_v"), 17, 84, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_della_pianta_per_vederne"), 20, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.pv_zshop.label_il_prezzo"), 58, 101, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_buy = Button.builder(Component.translatable("gui.cum.pv_zshop.button_buy"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PVZshopButtonMessage(0, x, y, z));
				PVZshopButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 202, this.topPos + 101, 40, 20).build();
		guistate.put("button:button_buy", button_buy);
		this.addRenderableWidget(button_buy);
		button_girasole = Button.builder(Component.translatable("gui.cum.pv_zshop.button_girasole"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PVZshopButtonMessage(1, x, y, z));
				PVZshopButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 189, this.topPos + 123, 67, 20).build();
		guistate.put("button:button_girasole", button_girasole);
		this.addRenderableWidget(button_girasole);
		button_sparasemi = Button.builder(Component.translatable("gui.cum.pv_zshop.button_sparasemi"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PVZshopButtonMessage(2, x, y, z));
				PVZshopButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 145, 72, 20).build();
		guistate.put("button:button_sparasemi", button_sparasemi);
		this.addRenderableWidget(button_sparasemi);
		button_la_pianta = Button.builder(Component.translatable("gui.cum.pv_zshop.button_la_pianta"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new PVZshopButtonMessage(3, x, y, z));
				PVZshopButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 167, 72, 20).build();
		guistate.put("button:button_la_pianta", button_la_pianta);
		this.addRenderableWidget(button_la_pianta);
	}
}
