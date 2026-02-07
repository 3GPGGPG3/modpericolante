
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.LibracerchioEntity;
import net.mcreator.cum.client.model.Modellibra_cerchio;

import com.mojang.blaze3d.vertex.PoseStack;

public class LibracerchioRenderer extends MobRenderer<LibracerchioEntity, Modellibra_cerchio<LibracerchioEntity>> {
	public LibracerchioRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellibra_cerchio<LibracerchioEntity>(context.bakeLayer(Modellibra_cerchio.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(LibracerchioEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LibracerchioEntity entity) {
		return new ResourceLocation("cum:textures/entities/libra_cerchio.png");
	}
}
