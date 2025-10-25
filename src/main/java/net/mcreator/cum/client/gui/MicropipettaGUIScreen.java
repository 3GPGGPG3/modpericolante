package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.MicropipettaGUIMenu;
import net.mcreator.cum.procedures.PipettaModeDisplayShootingProcedure;
import net.mcreator.cum.procedures.PipettaModeDisplayNotShootingProcedure;
import net.mcreator.cum.network.MicropipettaGUIButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MicropipettaGUIScreen extends AbstractContainerScreen<MicropipettaGUIMenu> {
	private final static HashMap<String, Object> guistate = MicropipettaGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_swap_mode;

	public MicropipettaGUIScreen(MicropipettaGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/micropipetta_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (PipettaModeDisplayShootingProcedure.execute(entity))
			if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_shooting"), mouseX, mouseY);
		if (PipettaModeDisplayShootingProcedure.execute(entity))
			if (mouseX > leftPos + 115 && mouseX < leftPos + 139 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_shooting1"), mouseX, mouseY);
		if (PipettaModeDisplayShootingProcedure.execute(entity))
			if (mouseX > leftPos + 139 && mouseX < leftPos + 163 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_shooting2"), mouseX, mouseY);
		if (PipettaModeDisplayNotShootingProcedure.execute(entity))
			if (mouseX > leftPos + 91 && mouseX < leftPos + 115 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_taking"), mouseX, mouseY);
		if (PipettaModeDisplayNotShootingProcedure.execute(entity))
			if (mouseX > leftPos + 115 && mouseX < leftPos + 139 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_taking1"), mouseX, mouseY);
		if (PipettaModeDisplayNotShootingProcedure.execute(entity))
			if (mouseX > leftPos + 139 && mouseX < leftPos + 163 && mouseY > topPos + 20 && mouseY < topPos + 44)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.micropipetta_gui.tooltip_currently_taking2"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.micropipetta_gui.label_puntale"), 9, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.micropipetta_gui.label_campione"), 4, 19, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.micropipetta_gui.label_portata_100_ml"), 88, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_swap_mode = Button.builder(Component.translatable("gui.cum.micropipetta_gui.button_swap_mode"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new MicropipettaGUIButtonMessage(0, x, y, z));
				MicropipettaGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 22, 72, 20).build();
		guistate.put("button:button_swap_mode", button_swap_mode);
		this.addRenderableWidget(button_swap_mode);
	}
}
