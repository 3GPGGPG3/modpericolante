
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

import net.mcreator.cum.procedures.PAmeterDisplayOverlayIngameProcedure;
import net.mcreator.cum.procedures.IconaPALim1Procedure;
import net.mcreator.cum.procedures.IconaPA7Procedure;
import net.mcreator.cum.procedures.IconaPA6Procedure;
import net.mcreator.cum.procedures.IconaPA5Procedure;
import net.mcreator.cum.procedures.IconaPA4Procedure;
import net.mcreator.cum.procedures.IconaPA3Procedure;
import net.mcreator.cum.procedures.IconaPA2Procedure;
import net.mcreator.cum.procedures.IconaPA1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PAmeterOverlay {
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
		if (PAmeterDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_vuota.png"), w / 2 + -147, h / 2 + -99, 0, 0, 25, 25, 25, 25);

			if (IconaPALim1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_vuota_fine.png"), w / 2 + -124, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -147, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -140, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -133, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -126, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -119, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_a_meta_pa.png"), w / 2 + -112, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			if (IconaPA7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/icona_riempita_fine_pa.png"), w / 2 + -124, h / 2 + -99, 0, 0, 25, 25, 25, 25);
			}
			event.getGuiGraphics().blit(new ResourceLocation("cum:textures/screens/pa_icona.png"), w / 2 + -172, h / 2 + -99, 0, 0, 25, 25, 25, 25);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
