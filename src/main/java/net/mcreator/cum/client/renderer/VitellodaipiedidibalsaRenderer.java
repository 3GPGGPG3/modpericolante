
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.VitellodaipiedidibalsaEntity;
import net.mcreator.cum.client.model.Modelvitello_dai_piedi_di_balsa;

public class VitellodaipiedidibalsaRenderer extends MobRenderer<VitellodaipiedidibalsaEntity, Modelvitello_dai_piedi_di_balsa<VitellodaipiedidibalsaEntity>> {
	public VitellodaipiedidibalsaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvitello_dai_piedi_di_balsa<VitellodaipiedidibalsaEntity>(context.bakeLayer(Modelvitello_dai_piedi_di_balsa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VitellodaipiedidibalsaEntity entity) {
		return new ResourceLocation("cum:textures/entities/vitello_dai_piedi_di_balsa.png");
	}
}
