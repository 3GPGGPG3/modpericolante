
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.ShrekEntity;
import net.mcreator.cum.client.model.Modelshrek;

public class ShrekRenderer extends MobRenderer<ShrekEntity, Modelshrek<ShrekEntity>> {
	public ShrekRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshrek<ShrekEntity>(context.bakeLayer(Modelshrek.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShrekEntity entity) {
		return new ResourceLocation("cum:textures/entities/shrek.png");
	}
}
