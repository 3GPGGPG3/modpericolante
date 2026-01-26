
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.PietraLibraEntity;
import net.mcreator.cum.client.model.Modelraccogli;

public class PietraLibraRenderer extends MobRenderer<PietraLibraEntity, Modelraccogli<PietraLibraEntity>> {
	public PietraLibraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelraccogli<PietraLibraEntity>(context.bakeLayer(Modelraccogli.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(PietraLibraEntity entity) {
		return new ResourceLocation("cum:textures/entities/raccogli.png");
	}
}
