
package net.mcreator.cum.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.cum.procedures.IconaFollia3Procedure;
import net.mcreator.cum.procedures.IconaFollia2Procedure;
import net.mcreator.cum.procedures.IconaFollia1Procedure;
import net.mcreator.cum.procedures.FolliaMeterDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class FolliaMeterOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (FolliaMeterDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/follia_icona.png"), w / 2 + -62, h / 2 + 57, 0, 0, 25, 25, 25, 25);

			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita.png"), w / 2 + -37, h / 2 + 57, 0, 0, 25, 25, 25, 25);

			if (IconaFollia2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita.png"), w / 2 + 13, h / 2 + 57, 0, 0, 25, 25, 25, 25);
			}
			if (IconaFollia1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita.png"), w / 2 + -12, h / 2 + 57, 0, 0, 25, 25, 25, 25);
			}
			if (IconaFollia3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_fine.png"), w / 2 + 38, h / 2 + 57, 0, 0, 25, 25, 25, 25);
			}
			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_vuota.png"), w / 2 + -12, h / 2 + 57, 0, 0, 25, 25, 25, 25);

			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_vuota.png"), w / 2 + 13, h / 2 + 57, 0, 0, 25, 25, 25, 25);

			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_vuota_fine.png"), w / 2 + 38, h / 2 + 57, 0, 0, 25, 25, 25, 25);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
