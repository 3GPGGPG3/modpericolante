
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.AdrianoMeisEntity;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;

public class AdrianoMeisRenderer extends MobRenderer<AdrianoMeisEntity, Modelil_fu_mattia_pascal<AdrianoMeisEntity>> {
	public AdrianoMeisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelil_fu_mattia_pascal<AdrianoMeisEntity>(context.bakeLayer(Modelil_fu_mattia_pascal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AdrianoMeisEntity entity) {
		return new ResourceLocation("cum:textures/entities/il_fu_mattia_pascal.png");
	}
}
