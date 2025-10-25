package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.SpadaBalatranteGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpadaBalatranteGUIScreen extends AbstractContainerScreen<SpadaBalatranteGUIMenu> {
	private final static HashMap<String, Object> guistate = SpadaBalatranteGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_gioca_mano;

	public SpadaBalatranteGUIScreen(SpadaBalatranteGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/spada_balatrante_gui.png");

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

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/joker.png"), this.leftPos + -112, this.topPos + 19, 0, 0, 97, 130, 97, 130);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/joker.png"), this.leftPos + 190, this.topPos + 19, 0, 0, 97, 130, 97, 130);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/balatro.png"), this.leftPos + 128, this.topPos + -40, 0, 0, 152, 83, 152, 83);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.spada_balatrante_gui.label_jolly"), 106, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.spada_balatrante_gui.label_mano_di_poker"), 37, 41, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_gioca_mano = Button.builder(Component.translatable("gui.cum.spada_balatrante_gui.button_gioca_mano"), e -> {
		}).bounds(this.leftPos + 48, this.topPos + 59, 77, 20).build();
		guistate.put("button:button_gioca_mano", button_gioca_mano);
		this.addRenderableWidget(button_gioca_mano);
	}
}
