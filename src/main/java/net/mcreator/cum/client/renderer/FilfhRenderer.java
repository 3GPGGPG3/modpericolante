
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.FilfhEntity;
import net.mcreator.cum.client.model.Modelfilfh;

public class FilfhRenderer extends MobRenderer<FilfhEntity, Modelfilfh<FilfhEntity>> {
	public FilfhRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfilfh<FilfhEntity>(context.bakeLayer(Modelfilfh.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FilfhEntity entity) {
		return new ResourceLocation("cum:textures/entities/filfh.png");
	}
}
