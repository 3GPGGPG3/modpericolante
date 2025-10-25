
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.client.model.ModelOlivia;

public class OliviaRenderer extends MobRenderer<OliviaEntity, ModelOlivia<OliviaEntity>> {
	public OliviaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOlivia<OliviaEntity>(context.bakeLayer(ModelOlivia.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OliviaEntity entity) {
		return new ResourceLocation("cum:textures/entities/olivia.png");
	}
}
