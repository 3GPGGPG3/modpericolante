
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.CharlieChaplinWalkPlaybackConditionProcedure;
import net.mcreator.cum.entity.BadpiggiesEntity;
import net.mcreator.cum.client.model.animations.bad_piggiesAnimation;
import net.mcreator.cum.client.model.Modelbad_piggies;

public class BadpiggiesRenderer extends MobRenderer<BadpiggiesEntity, Modelbad_piggies<BadpiggiesEntity>> {
	public BadpiggiesRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbad_piggies.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BadpiggiesEntity entity) {
		return new ResourceLocation("cum:textures/entities/bad_piggies.png");
	}

	private static final class AnimatedModel extends Modelbad_piggies<BadpiggiesEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BadpiggiesEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BadpiggiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (CharlieChaplinWalkPlaybackConditionProcedure.execute(entity))
					this.animateWalk(bad_piggiesAnimation.bad_piggies_cammina, limbSwing, limbSwingAmount, 2f, 2.5f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BadpiggiesEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
