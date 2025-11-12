package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.VascaElettroforeticaGUIMenu;
import net.mcreator.cum.procedures.ShowCaricaVascaProcedure;
import net.mcreator.cum.procedures.ShowAvviaCorsaProcedure;
import net.mcreator.cum.network.VascaElettroforeticaGUIButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class VascaElettroforeticaGUIScreen extends AbstractContainerScreen<VascaElettroforeticaGUIMenu> {
	private final static HashMap<String, Object> guistate = VascaElettroforeticaGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_carica_vasca;
	Button button_avvia_corsa;

	public VascaElettroforeticaGUIScreen(VascaElettroforeticaGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 187;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/vasca_elettroforetica_gui.png");

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
		if (ShowCaricaVascaProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.cum.vasca_elettroforetica_gui.label_matrice"), 11, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.vasca_elettroforetica_gui.label_energia"), 7, 35, -12829636, false);
		if (ShowCaricaVascaProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.cum.vasca_elettroforetica_gui.label_tampone"), 4, 61, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_carica_vasca = Button.builder(Component.translatable("gui.cum.vasca_elettroforetica_gui.button_carica_vasca"), e -> {
			if (ShowCaricaVascaProcedure.execute(world, x, y, z)) {
				CumMod.PACKET_HANDLER.sendToServer(new VascaElettroforeticaGUIButtonMessage(0, x, y, z));
				VascaElettroforeticaGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 83, this.topPos + 46, 87, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ShowCaricaVascaProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_carica_vasca", button_carica_vasca);
		this.addRenderableWidget(button_carica_vasca);
		button_avvia_corsa = Button.builder(Component.translatable("gui.cum.vasca_elettroforetica_gui.button_avvia_corsa"), e -> {
			if (ShowAvviaCorsaProcedure.execute(world, x, y, z)) {
				CumMod.PACKET_HANDLER.sendToServer(new VascaElettroforeticaGUIButtonMessage(1, x, y, z));
				VascaElettroforeticaGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 86, this.topPos + 46, 82, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = ShowAvviaCorsaProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_avvia_corsa", button_avvia_corsa);
		this.addRenderableWidget(button_avvia_corsa);
	}
}
