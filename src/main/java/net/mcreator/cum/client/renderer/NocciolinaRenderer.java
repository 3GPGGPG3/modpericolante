
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.NocciolinaEntity;
import net.mcreator.cum.client.model.animations.nocciolinaAnimation;
import net.mcreator.cum.client.model.Modelnocciolina;

public class NocciolinaRenderer extends MobRenderer<NocciolinaEntity, Modelnocciolina<NocciolinaEntity>> {
	public NocciolinaRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelnocciolina.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(NocciolinaEntity entity) {
		return new ResourceLocation("cum:textures/entities/nocciolina.png");
	}

	private static final class AnimatedModel extends Modelnocciolina<NocciolinaEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<NocciolinaEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(NocciolinaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, nocciolinaAnimation.nocciolina_idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(NocciolinaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
