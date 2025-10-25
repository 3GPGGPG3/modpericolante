package net.mcreator.cum.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cum.world.inventory.ConsegnaRelazioneMenu;
import net.mcreator.cum.procedures.TooltpitMostraInConsegnaRelazioneesitoProcedure;
import net.mcreator.cum.procedures.TooltpitMostraInConsegnaRelazioneProcedure;
import net.mcreator.cum.procedures.AppareBottoneRelazioneProcedure;
import net.mcreator.cum.network.ConsegnaRelazioneButtonMessage;
import net.mcreator.cum.CumMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ConsegnaRelazioneScreen extends AbstractContainerScreen<ConsegnaRelazioneMenu> {
	private final static HashMap<String, Object> guistate = ConsegnaRelazioneMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_consegna_la_relazione;

	public ConsegnaRelazioneScreen(ConsegnaRelazioneMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("cum:textures/screens/consegna_relazione.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (TooltpitMostraInConsegnaRelazioneProcedure.execute(entity))
			if (mouseX > leftPos + 14 && mouseX < leftPos + 38 && mouseY > topPos + 23 && mouseY < topPos + 47)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.consegna_relazione.tooltip_consegna_qui_la_relazione"), mouseX, mouseY);
		if (TooltpitMostraInConsegnaRelazioneesitoProcedure.execute(entity))
			if (mouseX > leftPos + 145 && mouseX < leftPos + 169 && mouseY > topPos + 23 && mouseY < topPos + 47)
				guiGraphics.renderTooltip(font, Component.translatable("gui.cum.consegna_relazione.tooltip_esito_del_voto"), mouseX, mouseY);
		if (mouseX > leftPos + 60 && mouseX < leftPos + 84 && mouseY > topPos + 22 && mouseY < topPos + 46)
			guiGraphics.renderTooltip(font, Component.translatable("gui.cum.consegna_relazione.tooltip_questa_azione_comporta_pericoli"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cum:textures/screens/pericolante.png"), this.leftPos + 64, this.topPos + 27, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.consegna_relazione.label_consegna_la_relazione_di_igiene"), 4, 4, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.cum.consegna_relazione.label_sufficienza"), 84, 30, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_consegna_la_relazione = Button.builder(Component.translatable("gui.cum.consegna_relazione.button_consegna_la_relazione"), e -> {
			if (AppareBottoneRelazioneProcedure.execute(entity)) {
				CumMod.PACKET_HANDLER.sendToServer(new ConsegnaRelazioneButtonMessage(0, x, y, z));
				ConsegnaRelazioneButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 54, 134, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = AppareBottoneRelazioneProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_consegna_la_relazione", button_consegna_la_relazione);
		this.addRenderableWidget(button_consegna_la_relazione);
	}
}
