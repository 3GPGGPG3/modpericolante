
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.VitellosenzapiuipiediEntity;
import net.mcreator.cum.client.model.Modelvitello_senza_più_i_piedi;

public class VitellosenzapiuipiediRenderer extends MobRenderer<VitellosenzapiuipiediEntity, Modelvitello_senza_più_i_piedi<VitellosenzapiuipiediEntity>> {
	public VitellosenzapiuipiediRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvitello_senza_più_i_piedi<VitellosenzapiuipiediEntity>(context.bakeLayer(Modelvitello_senza_più_i_piedi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VitellosenzapiuipiediEntity entity) {
		return new ResourceLocation("cum:textures/entities/vitello_dai_piedi_di_balsa.png");
	}
}
