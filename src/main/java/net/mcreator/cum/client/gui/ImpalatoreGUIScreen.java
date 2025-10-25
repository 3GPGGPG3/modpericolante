package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.ImpalatoreGUIMenu;
import net.mcreator.cum.procedures.StackIf1Procedure;
import net.mcreator.cum.procedures.StackIf0Procedure;
import net.mcreator.cum.network.ImpalatoreGUIButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ImpalatoreGUIScreen extends AbstractContainerScreen<ImpalatoreGUIMenu> {
	private final static HashMap<String, Object> guistate = ImpalatoreGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_stack;

	public ImpalatoreGUIScreen(ImpalatoreGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 207;
		this.imageHeight = 133;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/impalatore_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (StackIf1Procedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + 15 && mouseY < topPos + 39)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.impalatore_gui.tooltip_mettere_il_clonatore"), mouseX, mouseY);
		if (StackIf0Procedure.execute(entity))
			if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 15 && mouseY < topPos + 39)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.impalatore_gui.tooltip_mettere_loggetto_che_vuoi_clona"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.impalatore_gui.label_metti_gli_oggetti_dello_stesso_t"), 11, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.impalatore_gui.label_empty"), 64, 21, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_stack = Button.builder(Component.translatable("gui.cum.impalatore_gui.button_stack"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new ImpalatoreGUIButtonMessage(0, x, y, z));
				ImpalatoreGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 118, this.topPos + 17, 51, 20).build();
		guistate.put("button:button_stack", button_stack);
		this.addRenderableWidget(button_stack);
	}
}
