
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.AbramoEntity;
import net.mcreator.cum.client.model.ModelAbramo;

public class AbramoRenderer extends MobRenderer<AbramoEntity, ModelAbramo<AbramoEntity>> {
	public AbramoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAbramo<AbramoEntity>(context.bakeLayer(ModelAbramo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AbramoEntity entity) {
		return new ResourceLocation("cum:textures/entities/abramo.png");
	}
}
