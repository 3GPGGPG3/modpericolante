
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.LinfocitaBEntity;
import net.mcreator.cum.client.model.Modellinfocita_b_o_plasmacellula;

public class LinfocitaBRenderer extends MobRenderer<LinfocitaBEntity, Modellinfocita_b_o_plasmacellula<LinfocitaBEntity>> {
	public LinfocitaBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellinfocita_b_o_plasmacellula<LinfocitaBEntity>(context.bakeLayer(Modellinfocita_b_o_plasmacellula.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LinfocitaBEntity entity) {
		return new ResourceLocation("cum:textures/entities/linfb.png");
	}
}
