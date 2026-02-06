
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cum.client.model.Modeltopo;
import net.mcreator.cum.client.model.Modelshrek;
import net.mcreator.cum.client.model.Modelseisette;
import net.mcreator.cum.client.model.Modelrat_king;
import net.mcreator.cum.client.model.Modelraccogli;
import net.mcreator.cum.client.model.Modelpoliziotto_in_bici;
import net.mcreator.cum.client.model.Modelpietra_libra;
import net.mcreator.cum.client.model.Modelpeashooter;
import net.mcreator.cum.client.model.Modelpaperon_de_paperoni;
import net.mcreator.cum.client.model.Modelorthomyxoviridae;
import net.mcreator.cum.client.model.Modelordinamentogiuridico;
import net.mcreator.cum.client.model.Modelnocciolina;
import net.mcreator.cum.client.model.Modelmalicious_face;
import net.mcreator.cum.client.model.Modellinfocita_b_o_plasmacellula;
import net.mcreator.cum.client.model.Modellibbra;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;
import net.mcreator.cum.client.model.Modelgirasole;
import net.mcreator.cum.client.model.Modelgiolitti_unito;
import net.mcreator.cum.client.model.Modelgabriel;
import net.mcreator.cum.client.model.Modelflesh_panopticom;
import net.mcreator.cum.client.model.Modelfilfh;
import net.mcreator.cum.client.model.Modelcube;
import net.mcreator.cum.client.model.Modelcharlie_chaplin;
import net.mcreator.cum.client.model.Modelcalcoli_di_libra;
import net.mcreator.cum.client.model.Modelbicicletta;
import net.mcreator.cum.client.model.Modelanticorpo;
import net.mcreator.cum.client.model.ModelPreside;
import net.mcreator.cum.client.model.ModelOlivia;
import net.mcreator.cum.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CumModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelseisette.LAYER_LOCATION, Modelseisette::createBodyLayer);
		event.registerLayerDefinition(Modelnocciolina.LAYER_LOCATION, Modelnocciolina::createBodyLayer);
		event.registerLayerDefinition(Modelfilfh.LAYER_LOCATION, Modelfilfh::createBodyLayer);
		event.registerLayerDefinition(Modelpaperon_de_paperoni.LAYER_LOCATION, Modelpaperon_de_paperoni::createBodyLayer);
		event.registerLayerDefinition(Modelpeashooter.LAYER_LOCATION, Modelpeashooter::createBodyLayer);
		event.registerLayerDefinition(Modelcalcoli_di_libra.LAYER_LOCATION, Modelcalcoli_di_libra::createBodyLayer);
		event.registerLayerDefinition(Modellibbra.LAYER_LOCATION, Modellibbra::createBodyLayer);
		event.registerLayerDefinition(Modelraccogli.LAYER_LOCATION, Modelraccogli::createBodyLayer);
		event.registerLayerDefinition(Modelgirasole.LAYER_LOCATION, Modelgirasole::createBodyLayer);
		event.registerLayerDefinition(Modelbicicletta.LAYER_LOCATION, Modelbicicletta::createBodyLayer);
		event.registerLayerDefinition(Modelpoliziotto_in_bici.LAYER_LOCATION, Modelpoliziotto_in_bici::createBodyLayer);
		event.registerLayerDefinition(Modelgabriel.LAYER_LOCATION, Modelgabriel::createBodyLayer);
		event.registerLayerDefinition(Modelgiolitti_unito.LAYER_LOCATION, Modelgiolitti_unito::createBodyLayer);
		event.registerLayerDefinition(Modelordinamentogiuridico.LAYER_LOCATION, Modelordinamentogiuridico::createBodyLayer);
		event.registerLayerDefinition(Modeltopo.LAYER_LOCATION, Modeltopo::createBodyLayer);
		event.registerLayerDefinition(ModelPreside.LAYER_LOCATION, ModelPreside::createBodyLayer);
		event.registerLayerDefinition(Modelcube.LAYER_LOCATION, Modelcube::createBodyLayer);
		event.registerLayerDefinition(Modelanticorpo.LAYER_LOCATION, Modelanticorpo::createBodyLayer);
		event.registerLayerDefinition(Modelflesh_panopticom.LAYER_LOCATION, Modelflesh_panopticom::createBodyLayer);
		event.registerLayerDefinition(Modelcharlie_chaplin.LAYER_LOCATION, Modelcharlie_chaplin::createBodyLayer);
		event.registerLayerDefinition(Modellinfocita_b_o_plasmacellula.LAYER_LOCATION, Modellinfocita_b_o_plasmacellula::createBodyLayer);
		event.registerLayerDefinition(Modelrat_king.LAYER_LOCATION, Modelrat_king::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelmalicious_face.LAYER_LOCATION, Modelmalicious_face::createBodyLayer);
		event.registerLayerDefinition(Modelshrek.LAYER_LOCATION, Modelshrek::createBodyLayer);
		event.registerLayerDefinition(Modelil_fu_mattia_pascal.LAYER_LOCATION, Modelil_fu_mattia_pascal::createBodyLayer);
		event.registerLayerDefinition(Modelpietra_libra.LAYER_LOCATION, Modelpietra_libra::createBodyLayer);
		event.registerLayerDefinition(Modelorthomyxoviridae.LAYER_LOCATION, Modelorthomyxoviridae::createBodyLayer);
		event.registerLayerDefinition(ModelOlivia.LAYER_LOCATION, ModelOlivia::createBodyLayer);
	}
}
