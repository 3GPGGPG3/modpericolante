package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.FrigoGUIMenu;
import net.mcreator.cum.procedures.MettereEnergiaPopUpProcedure;
import net.mcreator.cum.network.FrigoGUIButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FrigoGUIScreen extends AbstractContainerScreen<FrigoGUIMenu> {
	private final static HashMap<String, Object> guistate = FrigoGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_raffredda;

	public FrigoGUIScreen(FrigoGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/frigo_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (MettereEnergiaPopUpProcedure.execute(entity))
			if (mouseX > leftPos + 80 && mouseX < leftPos + 104 && mouseY > topPos + 3 && mouseY < topPos + 27)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.frigo_gui.tooltip_empty"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.frigo_gui.label_empty"), 132, 9, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_raffredda = Button.builder(Component.translatable("gui.cum.frigo_gui.button_raffredda"), e -> {
			if (true) {
				CumMod.PACKET_HANDLER.sendToServer(new FrigoGUIButtonMessage(0, x, y, z));
				FrigoGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 5, 72, 20).build();
		guistate.put("button:button_raffredda", button_raffredda);
		this.addRenderableWidget(button_raffredda);
	}
}
