
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.Pericolante1Entity;

public class Pericolante1Renderer extends HumanoidMobRenderer<Pericolante1Entity, HumanoidModel<Pericolante1Entity>> {
	public Pericolante1Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Pericolante1Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Pericolante1Entity entity) {
		return new ResourceLocation("cum:textures/entities/pericolante1.png");
	}
}
