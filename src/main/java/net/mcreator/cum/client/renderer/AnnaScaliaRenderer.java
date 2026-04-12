
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.AnnaScaliaEntity;
import net.mcreator.cum.client.model.ModelAnna_Scalia;

public class AnnaScaliaRenderer extends MobRenderer<AnnaScaliaEntity, ModelAnna_Scalia<AnnaScaliaEntity>> {
	public AnnaScaliaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAnna_Scalia<AnnaScaliaEntity>(context.bakeLayer(ModelAnna_Scalia.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnnaScaliaEntity entity) {
		return new ResourceLocation("cum:textures/entities/anna_scalia.png");
	}
}
