
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.SeiSetteEntity;
import net.mcreator.cum.client.model.Modelseisette;

public class SeiSetteRenderer extends MobRenderer<SeiSetteEntity, Modelseisette<SeiSetteEntity>> {
	public SeiSetteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseisette<SeiSetteEntity>(context.bakeLayer(Modelseisette.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeiSetteEntity entity) {
		return new ResourceLocation("cum:textures/entities/67_meme.png");
	}
}
