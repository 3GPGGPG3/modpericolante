
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.DanieleLucianoEntity;

public class DanieleLucianoRenderer extends HumanoidMobRenderer<DanieleLucianoEntity, HumanoidModel<DanieleLucianoEntity>> {
	public DanieleLucianoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DanieleLucianoEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DanieleLucianoEntity entity) {
		return new ResourceLocation("cum:textures/entities/daniele.png");
	}
}
