
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.GiolittiEntity;
import net.mcreator.cum.client.model.Modelgiolitti_unito;

public class GiolittiRenderer extends MobRenderer<GiolittiEntity, Modelgiolitti_unito<GiolittiEntity>> {
	public GiolittiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiolitti_unito<GiolittiEntity>(context.bakeLayer(Modelgiolitti_unito.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiolittiEntity entity) {
		return new ResourceLocation("cum:textures/entities/giolitti_unito.png");
	}
}
