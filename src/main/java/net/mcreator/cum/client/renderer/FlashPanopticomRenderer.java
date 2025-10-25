
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.FlashPanopticomEntity;
import net.mcreator.cum.client.model.animations.flesh_panopticomAnimation;
import net.mcreator.cum.client.model.Modelflesh_panopticom;

public class FlashPanopticomRenderer extends MobRenderer<FlashPanopticomEntity, Modelflesh_panopticom<FlashPanopticomEntity>> {
	public FlashPanopticomRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelflesh_panopticom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlashPanopticomEntity entity) {
		return new ResourceLocation("cum:textures/entities/panopticom.png");
	}

	private static final class AnimatedModel extends Modelflesh_panopticom<FlashPanopticomEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<FlashPanopticomEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(FlashPanopticomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, flesh_panopticomAnimation.rotatinghead, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(FlashPanopticomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
