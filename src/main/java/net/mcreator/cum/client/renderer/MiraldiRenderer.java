
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.MiraldiPlaybackConditionProcedure;
import net.mcreator.cum.entity.MiraldiEntity;
import net.mcreator.cum.client.model.animations.miraldiAnimation;
import net.mcreator.cum.client.model.Modelmiraldi;

import com.mojang.blaze3d.vertex.PoseStack;

public class MiraldiRenderer extends MobRenderer<MiraldiEntity, Modelmiraldi<MiraldiEntity>> {
	public MiraldiRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmiraldi.LAYER_LOCATION)), 0.6f);
	}

	@Override
	protected void scale(MiraldiEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiraldiEntity entity) {
		return new ResourceLocation("cum:textures/entities/miraldi.png");
	}

	private static final class AnimatedModel extends Modelmiraldi<MiraldiEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MiraldiEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MiraldiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, miraldiAnimation.idle, ageInTicks, 1.1f);
				if (MiraldiPlaybackConditionProcedure.execute(entity))
					this.animateWalk(miraldiAnimation.walk, limbSwing, limbSwingAmount, 3.5f, 3f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MiraldiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
