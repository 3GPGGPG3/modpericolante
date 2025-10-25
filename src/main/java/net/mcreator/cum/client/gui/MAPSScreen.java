package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.MAPSMenu;
import net.mcreator.cum.network.MAPSButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MAPSScreen extends AbstractContainerScreen<MAPSMenu> {
	private final static HashMap<String, Object> guistate = MAPSMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_casa;
	Button button_indietro;

	public MAPSScreen(MAPSMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 174;
		this.imageHeight = 119;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/maps.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.maps.label_scegli_la_destinazione"), 32, 3, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_casa = Button.builder(Component.translatable("gui.cum.maps.button_casa"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MAPSButtonMessage(0, x, y, z));
				MAPSButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 14, 46, 20).build();
		guistate.put("button:button_casa", button_casa);
		this.addRenderableWidget(button_casa);
		button_indietro = Button.builder(Component.translatable("gui.cum.maps.button_indietro"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MAPSButtonMessage(1, x, y, z));
				MAPSButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 173, this.topPos + 2, 67, 20).build();
		guistate.put("button:button_indietro", button_indietro);
		this.addRenderableWidget(button_indietro);
	}
}
