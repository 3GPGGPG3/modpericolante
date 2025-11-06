
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.PresideEntity;
import net.mcreator.cum.client.model.ModelPreside;

public class PresideRenderer extends MobRenderer<PresideEntity, ModelPreside<PresideEntity>> {
	public PresideRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPreside<PresideEntity>(context.bakeLayer(ModelPreside.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PresideEntity entity) {
		return new ResourceLocation("cum:textures/entities/preside.png");
	}
}
