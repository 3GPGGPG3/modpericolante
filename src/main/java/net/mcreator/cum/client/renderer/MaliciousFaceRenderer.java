
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cum.entity.MaliciousFaceEntity;
import net.mcreator.cum.client.model.Modelmalicious_face;

public class MaliciousFaceRenderer extends MobRenderer<MaliciousFaceEntity, Modelmalicious_face<MaliciousFaceEntity>> {
	public MaliciousFaceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmalicious_face<MaliciousFaceEntity>(context.bakeLayer(Modelmalicious_face.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaliciousFaceEntity entity) {
		return new ResourceLocation("cum:textures/entities/maliciousface.png");
	}
}
