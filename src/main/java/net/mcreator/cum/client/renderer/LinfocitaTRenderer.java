
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.LinfocitaTEntity;
import net.mcreator.cum.client.model.Modellinfocita_b_o_plasmacellula;

public class LinfocitaTRenderer extends MobRenderer<LinfocitaTEntity, Modellinfocita_b_o_plasmacellula<LinfocitaTEntity>> {
	public LinfocitaTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellinfocita_b_o_plasmacellula<LinfocitaTEntity>(context.bakeLayer(Modellinfocita_b_o_plasmacellula.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LinfocitaTEntity entity) {
		return new ResourceLocation("cum:textures/entities/linft.png");
	}
}
