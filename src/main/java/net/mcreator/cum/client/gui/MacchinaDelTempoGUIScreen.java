package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.MacchinaDelTempoGUIMenu;
import net.mcreator.cum.network.MacchinaDelTempoGUIButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MacchinaDelTempoGUIScreen extends AbstractContainerScreen<MacchinaDelTempoGUIMenu> {
	private final static HashMap<String, Object> guistate = MacchinaDelTempoGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fx;
	Button button_fx1;
	Button button_fx2;

	public MacchinaDelTempoGUIScreen(MacchinaDelTempoGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 212;
		this.imageHeight = 125;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/macchina_del_tempo_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.macchina_del_tempo_gui.label_selezionare_la_funzione_a_cui_ac"), 4, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_fx = Button.builder(Component.translatable("gui.cum.macchina_del_tempo_gui.button_fx"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MacchinaDelTempoGUIButtonMessage(0, x, y, z));
				MacchinaDelTempoGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 17, 46, 20).build();
		guistate.put("button:button_fx", button_fx);
		this.addRenderableWidget(button_fx);
		button_fx1 = Button.builder(Component.translatable("gui.cum.macchina_del_tempo_gui.button_fx1"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MacchinaDelTempoGUIButtonMessage(1, x, y, z));
				MacchinaDelTempoGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 83, this.topPos + 17, 46, 20).build();
		guistate.put("button:button_fx1", button_fx1);
		this.addRenderableWidget(button_fx1);
		button_fx2 = Button.builder(Component.translatable("gui.cum.macchina_del_tempo_gui.button_fx2"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MacchinaDelTempoGUIButtonMessage(2, x, y, z));
				MacchinaDelTempoGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 17, 51, 20).build();
		guistate.put("button:button_fx2", button_fx2);
		this.addRenderableWidget(button_fx2);
	}
}
