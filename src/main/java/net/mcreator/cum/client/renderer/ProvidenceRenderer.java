
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.ProvidenceEntity;
import net.mcreator.cum.client.model.animations.providence_completoAnimation;
import net.mcreator.cum.client.model.Modelprovidence_completo;

import com.mojang.blaze3d.vertex.PoseStack;

public class ProvidenceRenderer extends MobRenderer<ProvidenceEntity, Modelprovidence_completo<ProvidenceEntity>> {
	public ProvidenceRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelprovidence_completo.LAYER_LOCATION)), 1.8f);
	}

	@Override
	protected void scale(ProvidenceEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.35f, 1.35f, 1.35f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProvidenceEntity entity) {
		return new ResourceLocation("cum:textures/entities/pro_veerrr.png");
	}

	private static final class AnimatedModel extends Modelprovidence_completo<ProvidenceEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ProvidenceEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ProvidenceEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, providence_completoAnimation.idle, ageInTicks, 1f);
				this.animate(entity.animationState1, providence_completoAnimation.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ProvidenceEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
