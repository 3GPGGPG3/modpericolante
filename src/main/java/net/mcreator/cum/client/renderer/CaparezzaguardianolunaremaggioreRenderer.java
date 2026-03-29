
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.CaparezzaguardianolunaremaggioreEntity;
import net.mcreator.cum.client.model.ModelCaparezza_Guardiano_lunare_maggiore;

public class CaparezzaguardianolunaremaggioreRenderer extends MobRenderer<CaparezzaguardianolunaremaggioreEntity, ModelCaparezza_Guardiano_lunare_maggiore<CaparezzaguardianolunaremaggioreEntity>> {
	public CaparezzaguardianolunaremaggioreRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCaparezza_Guardiano_lunare_maggiore<CaparezzaguardianolunaremaggioreEntity>(context.bakeLayer(ModelCaparezza_Guardiano_lunare_maggiore.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaparezzaguardianolunaremaggioreEntity entity) {
		return new ResourceLocation("cum:textures/entities/caparezza_guardiano_lunare_maggiore.png");
	}
}
