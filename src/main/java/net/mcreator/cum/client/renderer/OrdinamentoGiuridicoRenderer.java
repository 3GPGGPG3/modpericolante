
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.OrdinamentoGiuridicoPlaybackCondition3Procedure;
import net.mcreator.cum.procedures.OrdCamminaProcedure;
import net.mcreator.cum.entity.OrdinamentoGiuridicoEntity;
import net.mcreator.cum.client.model.animations.ordinamentogiuridicoAnimation;
import net.mcreator.cum.client.model.Modelordinamentogiuridico;

public class OrdinamentoGiuridicoRenderer extends MobRenderer<OrdinamentoGiuridicoEntity, Modelordinamentogiuridico<OrdinamentoGiuridicoEntity>> {
	public OrdinamentoGiuridicoRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelordinamentogiuridico.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrdinamentoGiuridicoEntity entity) {
		return new ResourceLocation("cum:textures/entities/ordinamentogiuridico.png");
	}

	private static final class AnimatedModel extends Modelordinamentogiuridico<OrdinamentoGiuridicoEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<OrdinamentoGiuridicoEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(OrdinamentoGiuridicoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, ordinamentogiuridicoAnimation.wake_up, ageInTicks, 1f);
				this.animate(entity.animationState1, ordinamentogiuridicoAnimation.sit_down, ageInTicks, 1f);
				if (OrdCamminaProcedure.execute(entity))
					this.animateWalk(ordinamentogiuridicoAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				if (OrdinamentoGiuridicoPlaybackCondition3Procedure.execute(entity))
					this.animateWalk(ordinamentogiuridicoAnimation.attempt_to_hit, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(OrdinamentoGiuridicoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
