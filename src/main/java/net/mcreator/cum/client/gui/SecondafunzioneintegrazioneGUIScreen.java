package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.SecondafunzioneintegrazioneGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SecondafunzioneintegrazioneGUIScreen extends AbstractContainerScreen<SecondafunzioneintegrazioneGUIMenu> {
	private final static HashMap<String, Object> guistate = SecondafunzioneintegrazioneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_integra;

	public SecondafunzioneintegrazioneGUIScreen(SecondafunzioneintegrazioneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/secondafunzioneintegrazione_gui.png");

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

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/plasmidejpg-removebg-preview.png"), this.leftPos + 82, this.topPos + 2, 0, 0, 270, 230, 270, 230);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.secondafunzioneintegrazione_gui.label_ecori"), 6, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.secondafunzioneintegrazione_gui.label_gene"), 44, 43, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_integra = Button.builder(Component.translatable("gui.cum.secondafunzioneintegrazione_gui.button_integra"), e -> {
		}).bounds(this.leftPos + 7, this.topPos + 59, 61, 20).build();
		guistate.put("button:button_integra", button_integra);
		this.addRenderableWidget(button_integra);
	}
}
