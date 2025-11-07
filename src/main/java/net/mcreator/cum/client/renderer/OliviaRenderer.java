
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.OliviaSpogliataProcedure;
import net.mcreator.cum.procedures.OliviaNormaleProcedure;
import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.client.model.animations.OliviaAnimation;
import net.mcreator.cum.client.model.ModelOlivia;

public class OliviaRenderer extends MobRenderer<OliviaEntity, ModelOlivia<OliviaEntity>> {
	public OliviaRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelOlivia.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OliviaEntity entity) {
		return new ResourceLocation("cum:textures/entities/olivia_really_olivant.png");
	}

	private static final class AnimatedModel extends ModelOlivia<OliviaEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<OliviaEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(OliviaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (OliviaNormaleProcedure.execute(entity))
					this.animateWalk(OliviaAnimation.WALKING_ANIMATION, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, OliviaAnimation.SPOGLIATI_ANIMATION, ageInTicks, 1f);
				if (OliviaSpogliataProcedure.execute(entity))
					this.animateWalk(OliviaAnimation.WALKINGSPOGLIATA_ANIMATION, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState3, OliviaAnimation.IDLEVESTITA_ANIMATION, ageInTicks, 1f);
				this.animate(entity.animationState4, OliviaAnimation.IDLENUDA_ANIMATION, ageInTicks, 1f);
				this.animate(entity.animationState5, OliviaAnimation.SEXING_ANIMATION, ageInTicks, 1f);
				this.animate(entity.animationState6, OliviaAnimation.INFILING_ANIMATION, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(OliviaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
