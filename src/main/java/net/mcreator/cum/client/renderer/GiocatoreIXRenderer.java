
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.GiocatoreIXEntity;

public class GiocatoreIXRenderer extends HumanoidMobRenderer<GiocatoreIXEntity, HumanoidModel<GiocatoreIXEntity>> {
	public GiocatoreIXRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<GiocatoreIXEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GiocatoreIXEntity entity) {
		return new ResourceLocation("cum:textures/entities/skin.png");
	}
}
