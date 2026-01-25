
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.MattiaPascalEntity;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;

public class MattiaPascalRenderer extends MobRenderer<MattiaPascalEntity, Modelil_fu_mattia_pascal<MattiaPascalEntity>> {
	public MattiaPascalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelil_fu_mattia_pascal<MattiaPascalEntity>(context.bakeLayer(Modelil_fu_mattia_pascal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MattiaPascalEntity entity) {
		return new ResourceLocation("cum:textures/entities/il_fu_mattia_pascal.png");
	}
}
