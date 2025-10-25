
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.DiFazioEntity;
import net.mcreator.cum.client.model.ModelOlivia;

public class DiFazioRenderer extends MobRenderer<DiFazioEntity, ModelOlivia<DiFazioEntity>> {
	public DiFazioRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOlivia<DiFazioEntity>(context.bakeLayer(ModelOlivia.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiFazioEntity entity) {
		return new ResourceLocation("cum:textures/entities/di_fazio.png");
	}
}
