
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.cum.entity.Pericolante4Entity;

public class Pericolante4Renderer extends HumanoidMobRenderer<Pericolante4Entity, HumanoidModel<Pericolante4Entity>> {
	public Pericolante4Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Pericolante4Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Pericolante4Entity entity) {
		return new ResourceLocation("cum:textures/entities/pericolante4.png");
	}
}
