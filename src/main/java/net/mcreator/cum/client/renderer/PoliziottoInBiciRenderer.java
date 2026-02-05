
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.PoliziottoInBiciEntity;
import net.mcreator.cum.client.model.animations.poliziotto_in_biciAnimation;
import net.mcreator.cum.client.model.Modelpoliziotto_in_bici;

public class PoliziottoInBiciRenderer extends MobRenderer<PoliziottoInBiciEntity, Modelpoliziotto_in_bici<PoliziottoInBiciEntity>> {
	public PoliziottoInBiciRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelpoliziotto_in_bici.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PoliziottoInBiciEntity entity) {
		return new ResourceLocation("cum:textures/entities/poliziotto_in_bici.png");
	}

	private static final class AnimatedModel extends Modelpoliziotto_in_bici<PoliziottoInBiciEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PoliziottoInBiciEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PoliziottoInBiciEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, poliziotto_in_biciAnimation.idle, ageInTicks, 1f);
				this.animate(entity.animationState1, poliziotto_in_biciAnimation.walk, ageInTicks, 1f);
				this.animate(entity.animationState2, poliziotto_in_biciAnimation.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PoliziottoInBiciEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
