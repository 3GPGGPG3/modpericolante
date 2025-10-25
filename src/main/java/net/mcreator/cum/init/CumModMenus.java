
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cum.world.inventory.SpadaBalatranteGUIMenu;
import net.mcreator.cum.world.inventory.ScommessaMenu;
import net.mcreator.cum.world.inventory.PCraftMenu;
import net.mcreator.cum.world.inventory.MiraGuiMenu;
import net.mcreator.cum.world.inventory.MicropipettaGUIMenu;
import net.mcreator.cum.world.inventory.MacchinaDelTempoGUIMenu;
import net.mcreator.cum.world.inventory.MAPSMenu;
import net.mcreator.cum.world.inventory.IntegrazioneGUIMenu;
import net.mcreator.cum.world.inventory.ImpalatoreGUIMenu;
import net.mcreator.cum.world.inventory.GeneratoreGuiMenu;
import net.mcreator.cum.world.inventory.FrigoGUIMenu;
import net.mcreator.cum.world.inventory.DerivazioneGUIMenu;
import net.mcreator.cum.world.inventory.ConsegnaRelazioneMenu;
import net.mcreator.cum.world.inventory.ChatGPTMenu;
import net.mcreator.cum.world.inventory.BalatroGUIMenu;
import net.mcreator.cum.world.inventory.AzioniDelTelefonoMenu;
import net.mcreator.cum.CumMod;

public class CumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CumMod.MODID);
	public static final RegistryObject<MenuType<ConsegnaRelazioneMenu>> CONSEGNA_RELAZIONE = REGISTRY.register("consegna_relazione", () -> IForgeMenuType.create(ConsegnaRelazioneMenu::new));
	public static final RegistryObject<MenuType<MiraGuiMenu>> MIRA_GUI = REGISTRY.register("mira_gui", () -> IForgeMenuType.create(MiraGuiMenu::new));
	public static final RegistryObject<MenuType<AzioniDelTelefonoMenu>> AZIONI_DEL_TELEFONO = REGISTRY.register("azioni_del_telefono", () -> IForgeMenuType.create(AzioniDelTelefonoMenu::new));
	public static final RegistryObject<MenuType<ChatGPTMenu>> CHAT_GPT = REGISTRY.register("chat_gpt", () -> IForgeMenuType.create(ChatGPTMenu::new));
	public static final RegistryObject<MenuType<ScommessaMenu>> SCOMMESSA = REGISTRY.register("scommessa", () -> IForgeMenuType.create(ScommessaMenu::new));
	public static final RegistryObject<MenuType<MAPSMenu>> MAPS = REGISTRY.register("maps", () -> IForgeMenuType.create(MAPSMenu::new));
	public static final RegistryObject<MenuType<PCraftMenu>> P_CRAFT = REGISTRY.register("p_craft", () -> IForgeMenuType.create(PCraftMenu::new));
	public static final RegistryObject<MenuType<GeneratoreGuiMenu>> GENERATORE_GUI = REGISTRY.register("generatore_gui", () -> IForgeMenuType.create(GeneratoreGuiMenu::new));
	public static final RegistryObject<MenuType<BalatroGUIMenu>> BALATRO_GUI = REGISTRY.register("balatro_gui", () -> IForgeMenuType.create(BalatroGUIMenu::new));
	public static final RegistryObject<MenuType<SpadaBalatranteGUIMenu>> SPADA_BALATRANTE_GUI = REGISTRY.register("spada_balatrante_gui", () -> IForgeMenuType.create(SpadaBalatranteGUIMenu::new));
	public static final RegistryObject<MenuType<ImpalatoreGUIMenu>> IMPALATORE_GUI = REGISTRY.register("impalatore_gui", () -> IForgeMenuType.create(ImpalatoreGUIMenu::new));
	public static final RegistryObject<MenuType<IntegrazioneGUIMenu>> INTEGRAZIONE_GUI = REGISTRY.register("integrazione_gui", () -> IForgeMenuType.create(IntegrazioneGUIMenu::new));
	public static final RegistryObject<MenuType<DerivazioneGUIMenu>> DERIVAZIONE_GUI = REGISTRY.register("derivazione_gui", () -> IForgeMenuType.create(DerivazioneGUIMenu::new));
	public static final RegistryObject<MenuType<MacchinaDelTempoGUIMenu>> MACCHINA_DEL_TEMPO_GUI = REGISTRY.register("macchina_del_tempo_gui", () -> IForgeMenuType.create(MacchinaDelTempoGUIMenu::new));
	public static final RegistryObject<MenuType<FrigoGUIMenu>> FRIGO_GUI = REGISTRY.register("frigo_gui", () -> IForgeMenuType.create(FrigoGUIMenu::new));
	public static final RegistryObject<MenuType<MicropipettaGUIMenu>> MICROPIPETTA_GUI = REGISTRY.register("micropipetta_gui", () -> IForgeMenuType.create(MicropipettaGUIMenu::new));
}
