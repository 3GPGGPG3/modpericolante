
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.MarcWalkProcedure;
import net.mcreator.cum.entity.MarcoEntity;
import net.mcreator.cum.client.model.animations.marcoAnimation;
import net.mcreator.cum.client.model.Modelmarco_vero;

public class MarcoRenderer extends MobRenderer<MarcoEntity, Modelmarco_vero<MarcoEntity>> {
	public MarcoRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmarco_vero.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarcoEntity entity) {
		return new ResourceLocation("cum:textures/entities/marco_vero.png");
	}

	private static final class AnimatedModel extends Modelmarco_vero<MarcoEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MarcoEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MarcoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, marcoAnimation.idle, ageInTicks, 1f);
				if (MarcWalkProcedure.execute(entity))
					this.animateWalk(marcoAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, marcoAnimation.ehhhhhhhhhh_boom, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MarcoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
