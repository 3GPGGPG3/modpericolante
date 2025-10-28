
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.cum.client.renderer.VirusRenderer;
import net.mcreator.cum.client.renderer.V2Renderer;
import net.mcreator.cum.client.renderer.V1Renderer;
import net.mcreator.cum.client.renderer.UomoPrimitivoRenderer;
import net.mcreator.cum.client.renderer.StrayRenderer;
import net.mcreator.cum.client.renderer.SisyphusPrimeRenderer;
import net.mcreator.cum.client.renderer.PlasmacellulaRenderer;
import net.mcreator.cum.client.renderer.Pericolante7Renderer;
import net.mcreator.cum.client.renderer.Pericolante6Renderer;
import net.mcreator.cum.client.renderer.Pericolante5Renderer;
import net.mcreator.cum.client.renderer.Pericolante4Renderer;
import net.mcreator.cum.client.renderer.Pericolante3Renderer;
import net.mcreator.cum.client.renderer.Pericolante2Renderer;
import net.mcreator.cum.client.renderer.Pericolante1Renderer;
import net.mcreator.cum.client.renderer.PerInv3Renderer;
import net.mcreator.cum.client.renderer.PerInv2Renderer;
import net.mcreator.cum.client.renderer.PerInv1Renderer;
import net.mcreator.cum.client.renderer.PeashooterRenderer;
import net.mcreator.cum.client.renderer.PaperonDePaperoniRenderer;
import net.mcreator.cum.client.renderer.OliviaRenderer;
import net.mcreator.cum.client.renderer.NocciolinaRenderer;
import net.mcreator.cum.client.renderer.MirabellaRenderer;
import net.mcreator.cum.client.renderer.MinosPrimeRenderer;
import net.mcreator.cum.client.renderer.MattiaPascalRenderer;
import net.mcreator.cum.client.renderer.MaliciousFaceRenderer;
import net.mcreator.cum.client.renderer.LinfocitaTRenderer;
import net.mcreator.cum.client.renderer.LinfocitaBRenderer;
import net.mcreator.cum.client.renderer.KillerRenderer;
import net.mcreator.cum.client.renderer.IlFuMattiaPascal2Renderer;
import net.mcreator.cum.client.renderer.GirasoleRenderer;
import net.mcreator.cum.client.renderer.GdCubeRenderer;
import net.mcreator.cum.client.renderer.GabrielRenderer;
import net.mcreator.cum.client.renderer.FlashPanopticomRenderer;
import net.mcreator.cum.client.renderer.FilfhRenderer;
import net.mcreator.cum.client.renderer.FilfhErrRenderer;
import net.mcreator.cum.client.renderer.EsserePerfettamenteInutileRenderer;
import net.mcreator.cum.client.renderer.DiFazioRenderer;
import net.mcreator.cum.client.renderer.DaveRenderer;
import net.mcreator.cum.client.renderer.AssassinaDeiNeriColtelliRenderer;
import net.mcreator.cum.client.renderer.AnticorpoRenderer;
import net.mcreator.cum.client.renderer.AlessandroManzoniRenderer;
import net.mcreator.cum.client.renderer.AdrianoMeisRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CumModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CumModEntities.CUM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.DI_FAZIO.get(), DiFazioRenderer::new);
		event.registerEntityRenderer(CumModEntities.MIRABELLA.get(), MirabellaRenderer::new);
		event.registerEntityRenderer(CumModEntities.V_1.get(), V1Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_1.get(), Pericolante1Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_2.get(), Pericolante2Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_3.get(), Pericolante3Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_4.get(), Pericolante4Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_5.get(), Pericolante5Renderer::new);
		event.registerEntityRenderer(CumModEntities.STELLINA_DEL_GODO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.STELLINA_DEL_GODO_NEGATIVA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.RED_CUMM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.KILLER.get(), KillerRenderer::new);
		event.registerEntityRenderer(CumModEntities.V_2.get(), V2Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_6.get(), Pericolante6Renderer::new);
		event.registerEntityRenderer(CumModEntities.PERICOLANTE_7.get(), Pericolante7Renderer::new);
		event.registerEntityRenderer(CumModEntities.ALESSANDRO_MANZONI.get(), AlessandroManzoniRenderer::new);
		event.registerEntityRenderer(CumModEntities.SISYPHUS_PRIME.get(), SisyphusPrimeRenderer::new);
		event.registerEntityRenderer(CumModEntities.MINOS_PRIME.get(), MinosPrimeRenderer::new);
		event.registerEntityRenderer(CumModEntities.VIRUS.get(), VirusRenderer::new);
		event.registerEntityRenderer(CumModEntities.FLASH_PANOPTICOM.get(), FlashPanopticomRenderer::new);
		event.registerEntityRenderer(CumModEntities.LINFOCITA_B.get(), LinfocitaBRenderer::new);
		event.registerEntityRenderer(CumModEntities.PLASMACELLULA.get(), PlasmacellulaRenderer::new);
		event.registerEntityRenderer(CumModEntities.ANTICORPO.get(), AnticorpoRenderer::new);
		event.registerEntityRenderer(CumModEntities.ESSERE_PERFETTAMENTE_INUTILE.get(), EsserePerfettamenteInutileRenderer::new);
		event.registerEntityRenderer(CumModEntities.LINFOCITA_T.get(), LinfocitaTRenderer::new);
		event.registerEntityRenderer(CumModEntities.FILFH.get(), FilfhRenderer::new);
		event.registerEntityRenderer(CumModEntities.FIREBALL_STRAY_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.ALT_PIERCER_BEAM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.SCHEGGIA_DI_PIETRA_BALATRANTE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.OLIVIA.get(), OliviaRenderer::new);
		event.registerEntityRenderer(CumModEntities.PAPERON_DE_PAPERONI.get(), PaperonDePaperoniRenderer::new);
		event.registerEntityRenderer(CumModEntities.MATTIA_PASCAL.get(), MattiaPascalRenderer::new);
		event.registerEntityRenderer(CumModEntities.ADRIANO_MEIS.get(), AdrianoMeisRenderer::new);
		event.registerEntityRenderer(CumModEntities.IL_FU_MATTIA_PASCAL_2.get(), IlFuMattiaPascal2Renderer::new);
		event.registerEntityRenderer(CumModEntities.FILFH_ERR.get(), FilfhErrRenderer::new);
		event.registerEntityRenderer(CumModEntities.GABRIEL.get(), GabrielRenderer::new);
		event.registerEntityRenderer(CumModEntities.SPADA_GABRIELLANTE_LANCIATA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.MALICIOUS_FACE.get(), MaliciousFaceRenderer::new);
		event.registerEntityRenderer(CumModEntities.GD_CUBE.get(), GdCubeRenderer::new);
		event.registerEntityRenderer(CumModEntities.STRAY.get(), StrayRenderer::new);
		event.registerEntityRenderer(CumModEntities.STELLA_PERICOLOSA_PROIETTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.UOMO_PRIMITIVO.get(), UomoPrimitivoRenderer::new);
		event.registerEntityRenderer(CumModEntities.PER_INV_1.get(), PerInv1Renderer::new);
		event.registerEntityRenderer(CumModEntities.ASSASSINA_DEI_NERI_COLTELLI.get(), AssassinaDeiNeriColtelliRenderer::new);
		event.registerEntityRenderer(CumModEntities.PER_INV_2.get(), PerInv2Renderer::new);
		event.registerEntityRenderer(CumModEntities.PER_INV_3.get(), PerInv3Renderer::new);
		event.registerEntityRenderer(CumModEntities.PUNTALE_SPARATO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.PUNTALE_NEGATIVO_SPARATO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.PEASHOOTER.get(), PeashooterRenderer::new);
		event.registerEntityRenderer(CumModEntities.SEMI_SPARATI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CumModEntities.DAVE.get(), DaveRenderer::new);
		event.registerEntityRenderer(CumModEntities.NOCCIOLINA.get(), NocciolinaRenderer::new);
		event.registerEntityRenderer(CumModEntities.GIRASOLE.get(), GirasoleRenderer::new);
	}
}
