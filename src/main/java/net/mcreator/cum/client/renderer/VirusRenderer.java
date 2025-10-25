
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.VirusEntity;
import net.mcreator.cum.client.model.Modelorthomyxoviridae;

public class VirusRenderer extends MobRenderer<VirusEntity, Modelorthomyxoviridae<VirusEntity>> {
	public VirusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorthomyxoviridae<VirusEntity>(context.bakeLayer(Modelorthomyxoviridae.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(VirusEntity entity) {
		return new ResourceLocation("cum:textures/entities/virus.png");
	}
}
