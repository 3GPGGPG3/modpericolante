
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.PlasmacellulaEntity;
import net.mcreator.cum.client.model.Modellinfocita_b_o_plasmacellula;

public class PlasmacellulaRenderer extends MobRenderer<PlasmacellulaEntity, Modellinfocita_b_o_plasmacellula<PlasmacellulaEntity>> {
	public PlasmacellulaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellinfocita_b_o_plasmacellula<PlasmacellulaEntity>(context.bakeLayer(Modellinfocita_b_o_plasmacellula.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlasmacellulaEntity entity) {
		return new ResourceLocation("cum:textures/entities/plasmac.png");
	}
}
