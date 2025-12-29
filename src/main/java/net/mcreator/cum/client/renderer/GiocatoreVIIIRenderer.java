
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.GiocatoreVIIIEntity;

public class GiocatoreVIIIRenderer extends HumanoidMobRenderer<GiocatoreVIIIEntity, HumanoidModel<GiocatoreVIIIEntity>> {
	public GiocatoreVIIIRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<GiocatoreVIIIEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GiocatoreVIIIEntity entity) {
		return new ResourceLocation("cum:textures/entities/skin.png");
	}
}
