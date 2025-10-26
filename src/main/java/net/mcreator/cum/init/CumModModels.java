
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cum.client.model.Modelpeashooter;
import net.mcreator.cum.client.model.Modelpaperon_de_paperoni;
import net.mcreator.cum.client.model.Modelorthomyxoviridae;
import net.mcreator.cum.client.model.Modelnocciolina;
import net.mcreator.cum.client.model.Modelmalicious_face;
import net.mcreator.cum.client.model.Modellinfocita_b_o_plasmacellula;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;
import net.mcreator.cum.client.model.Modelgabriel;
import net.mcreator.cum.client.model.Modelflesh_panopticom;
import net.mcreator.cum.client.model.Modelfilfh;
import net.mcreator.cum.client.model.Modelcube;
import net.mcreator.cum.client.model.Modelanticorpo;
import net.mcreator.cum.client.model.ModelOlivia;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CumModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelnocciolina.LAYER_LOCATION, Modelnocciolina::createBodyLayer);
		event.registerLayerDefinition(Modelfilfh.LAYER_LOCATION, Modelfilfh::createBodyLayer);
		event.registerLayerDefinition(Modelpaperon_de_paperoni.LAYER_LOCATION, Modelpaperon_de_paperoni::createBodyLayer);
		event.registerLayerDefinition(Modelpeashooter.LAYER_LOCATION, Modelpeashooter::createBodyLayer);
		event.registerLayerDefinition(Modelgabriel.LAYER_LOCATION, Modelgabriel::createBodyLayer);
		event.registerLayerDefinition(Modelcube.LAYER_LOCATION, Modelcube::createBodyLayer);
		event.registerLayerDefinition(Modelanticorpo.LAYER_LOCATION, Modelanticorpo::createBodyLayer);
		event.registerLayerDefinition(Modelflesh_panopticom.LAYER_LOCATION, Modelflesh_panopticom::createBodyLayer);
		event.registerLayerDefinition(Modellinfocita_b_o_plasmacellula.LAYER_LOCATION, Modellinfocita_b_o_plasmacellula::createBodyLayer);
		event.registerLayerDefinition(Modelmalicious_face.LAYER_LOCATION, Modelmalicious_face::createBodyLayer);
		event.registerLayerDefinition(Modelil_fu_mattia_pascal.LAYER_LOCATION, Modelil_fu_mattia_pascal::createBodyLayer);
		event.registerLayerDefinition(Modelorthomyxoviridae.LAYER_LOCATION, Modelorthomyxoviridae::createBodyLayer);
		event.registerLayerDefinition(ModelOlivia.LAYER_LOCATION, ModelOlivia::createBodyLayer);
	}
}
