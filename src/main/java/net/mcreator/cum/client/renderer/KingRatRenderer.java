
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.KingRatEntity;
import net.mcreator.cum.client.model.Modelrat_king;

public class KingRatRenderer extends MobRenderer<KingRatEntity, Modelrat_king<KingRatEntity>> {
	public KingRatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrat_king<KingRatEntity>(context.bakeLayer(Modelrat_king.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingRatEntity entity) {
		return new ResourceLocation("cum:textures/entities/topo.png");
	}
}
