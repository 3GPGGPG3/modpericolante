
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.CharlieChaplinWalkPlaybackConditionProcedure;
import net.mcreator.cum.entity.CharlieChaplinEntity;
import net.mcreator.cum.client.model.animations.charlie_chaplinAnimation;
import net.mcreator.cum.client.model.Modelcharlie_chaplin;

public class CharlieChaplinRenderer extends MobRenderer<CharlieChaplinEntity, Modelcharlie_chaplin<CharlieChaplinEntity>> {
	public CharlieChaplinRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcharlie_chaplin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CharlieChaplinEntity entity) {
		return new ResourceLocation("cum:textures/entities/charlie_chaplin.png");
	}

	private static final class AnimatedModel extends Modelcharlie_chaplin<CharlieChaplinEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CharlieChaplinEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CharlieChaplinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (CharlieChaplinWalkPlaybackConditionProcedure.execute(entity))
					this.animateWalk(charlie_chaplinAnimation.cammina, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CharlieChaplinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
