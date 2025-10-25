package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.MiraGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MiraGuiScreen extends AbstractContainerScreen<MiraGuiMenu> {
	private final static HashMap<String, Object> guistate = MiraGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_consegna_il_compito;

	public MiraGuiScreen(MiraGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/mira_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 63 && mouseX < leftPos + 87 && mouseY > topPos + 22 && mouseY < topPos + 46)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.mira_gui.tooltip_questa_azione_comporta_dei_peric"), mouseX, mouseY);
		if (mouseX > leftPos + 14 && mouseX < leftPos + 38 && mouseY > topPos + 23 && mouseY < topPos + 47)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.mira_gui.tooltip_consegna_qui_il_compito"), mouseX, mouseY);
		if (mouseX > leftPos + 144 && mouseX < leftPos + 168 && mouseY > topPos + 23 && mouseY < topPos + 47)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.mira_gui.tooltip_esito_del_voto"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/pericolante.png"), this.leftPos + 67, this.topPos + 27, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.mira_gui.label_consegna_compito"), 46, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.mira_gui.label_paletto"), 102, 31, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_consegna_il_compito = Button.builder(Component.translatable("gui.cum.mira_gui.button_consegna_il_compito"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 55, 124, 20).build();
		guistate.put("button:button_consegna_il_compito", button_consegna_il_compito);
		this.addRenderableWidget(button_consegna_il_compito);
	}
}
