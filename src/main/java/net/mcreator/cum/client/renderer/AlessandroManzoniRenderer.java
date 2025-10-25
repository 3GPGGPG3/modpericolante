
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.AlessandroManzoniEntity;

public class AlessandroManzoniRenderer extends HumanoidMobRenderer<AlessandroManzoniEntity, HumanoidModel<AlessandroManzoniEntity>> {
	public AlessandroManzoniRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AlessandroManzoniEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AlessandroManzoniEntity entity) {
		return new ResourceLocation("cum:textures/entities/alessandromanzoni.png");
	}
}
