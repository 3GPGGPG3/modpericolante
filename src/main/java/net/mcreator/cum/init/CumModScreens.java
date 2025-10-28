
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.cum.client.gui.SpadaBalatranteGUIScreen;
import net.mcreator.cum.client.gui.ScommessaScreen;
import net.mcreator.cum.client.gui.PVZshopScreen;
import net.mcreator.cum.client.gui.PCraftScreen;
import net.mcreator.cum.client.gui.MiraGuiScreen;
import net.mcreator.cum.client.gui.MicropipettaGUIScreen;
import net.mcreator.cum.client.gui.MacchinaDelTempoGUIScreen;
import net.mcreator.cum.client.gui.MAPSScreen;
import net.mcreator.cum.client.gui.IntegrazioneGUIScreen;
import net.mcreator.cum.client.gui.ImpalatoreGUIScreen;
import net.mcreator.cum.client.gui.GeneratoreGuiScreen;
import net.mcreator.cum.client.gui.FrigoGUIScreen;
import net.mcreator.cum.client.gui.DerivazioneGUIScreen;
import net.mcreator.cum.client.gui.ConsegnaRelazioneScreen;
import net.mcreator.cum.client.gui.ChatGPTScreen;
import net.mcreator.cum.client.gui.BalatroGUIScreen;
import net.mcreator.cum.client.gui.AzioniDelTelefonoScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CumModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CumModMenus.CONSEGNA_RELAZIONE.get(), ConsegnaRelazioneScreen::new);
			MenuScreens.register(CumModMenus.MIRA_GUI.get(), MiraGuiScreen::new);
			MenuScreens.register(CumModMenus.AZIONI_DEL_TELEFONO.get(), AzioniDelTelefonoScreen::new);
			MenuScreens.register(CumModMenus.CHAT_GPT.get(), ChatGPTScreen::new);
			MenuScreens.register(CumModMenus.SCOMMESSA.get(), ScommessaScreen::new);
			MenuScreens.register(CumModMenus.MAPS.get(), MAPSScreen::new);
			MenuScreens.register(CumModMenus.P_CRAFT.get(), PCraftScreen::new);
			MenuScreens.register(CumModMenus.GENERATORE_GUI.get(), GeneratoreGuiScreen::new);
			MenuScreens.register(CumModMenus.BALATRO_GUI.get(), BalatroGUIScreen::new);
			MenuScreens.register(CumModMenus.SPADA_BALATRANTE_GUI.get(), SpadaBalatranteGUIScreen::new);
			MenuScreens.register(CumModMenus.IMPALATORE_GUI.get(), ImpalatoreGUIScreen::new);
			MenuScreens.register(CumModMenus.INTEGRAZIONE_GUI.get(), IntegrazioneGUIScreen::new);
			MenuScreens.register(CumModMenus.DERIVAZIONE_GUI.get(), DerivazioneGUIScreen::new);
			MenuScreens.register(CumModMenus.MACCHINA_DEL_TEMPO_GUI.get(), MacchinaDelTempoGUIScreen::new);
			MenuScreens.register(CumModMenus.FRIGO_GUI.get(), FrigoGUIScreen::new);
			MenuScreens.register(CumModMenus.MICROPIPETTA_GUI.get(), MicropipettaGUIScreen::new);
			MenuScreens.register(CumModMenus.PV_ZSHOP.get(), PVZshopScreen::new);
		});
	}
}
