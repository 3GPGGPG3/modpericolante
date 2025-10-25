
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.IlFuMattiaPascal2Entity;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;

public class IlFuMattiaPascal2Renderer extends MobRenderer<IlFuMattiaPascal2Entity, Modelil_fu_mattia_pascal<IlFuMattiaPascal2Entity>> {
	public IlFuMattiaPascal2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelil_fu_mattia_pascal<IlFuMattiaPascal2Entity>(context.bakeLayer(Modelil_fu_mattia_pascal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IlFuMattiaPascal2Entity entity) {
		return new ResourceLocation("cum:textures/entities/il_fu_mattia_pascal.png");
	}
}
