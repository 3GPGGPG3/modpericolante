
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.PaperonDePaperoniEntity;
import net.mcreator.cum.client.model.Modelpaperon_de_paperoni;

public class PaperonDePaperoniRenderer extends MobRenderer<PaperonDePaperoniEntity, Modelpaperon_de_paperoni<PaperonDePaperoniEntity>> {
	public PaperonDePaperoniRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpaperon_de_paperoni<PaperonDePaperoniEntity>(context.bakeLayer(Modelpaperon_de_paperoni.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PaperonDePaperoniEntity entity) {
		return new ResourceLocation("cum:textures/entities/paperon_de_paperoni.png");
	}
}
