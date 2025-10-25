
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.AnticorpoEntity;
import net.mcreator.cum.client.model.Modelanticorpo;

public class AnticorpoRenderer extends MobRenderer<AnticorpoEntity, Modelanticorpo<AnticorpoEntity>> {
	public AnticorpoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanticorpo<AnticorpoEntity>(context.bakeLayer(Modelanticorpo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnticorpoEntity entity) {
		return new ResourceLocation("cum:textures/entities/anticorpo.png");
	}
}
