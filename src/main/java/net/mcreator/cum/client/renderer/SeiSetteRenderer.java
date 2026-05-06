
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.SeiSetteEntity;
import net.mcreator.cum.client.model.animations.sei_sette_godo_veroAnimation;
import net.mcreator.cum.client.model.Modelsei_sette_godo;

public class SeiSetteRenderer extends MobRenderer<SeiSetteEntity, Modelsei_sette_godo<SeiSetteEntity>> {
	public SeiSetteRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelsei_sette_godo.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeiSetteEntity entity) {
		return new ResourceLocation("cum:textures/entities/67_meme.png");
	}

	private static final class AnimatedModel extends Modelsei_sette_godo<SeiSetteEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SeiSetteEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SeiSetteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, sei_sette_godo_veroAnimation.sixseven, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SeiSetteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
