
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.entity.MattiaPascalEntity;
import net.mcreator.cum.client.model.animations.il_fu_mattia_pascalAnimation;
import net.mcreator.cum.client.model.Modelil_fu_mattia_pascal;

public class MattiaPascalRenderer extends MobRenderer<MattiaPascalEntity, Modelil_fu_mattia_pascal<MattiaPascalEntity>> {
	public MattiaPascalRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelil_fu_mattia_pascal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MattiaPascalEntity entity) {
		return new ResourceLocation("cum:textures/entities/il_fu_mattia_pascal.png");
	}

	private static final class AnimatedModel extends Modelil_fu_mattia_pascal<MattiaPascalEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MattiaPascalEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MattiaPascalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, il_fu_mattia_pascalAnimation.ballo_fu_mattia_pascal, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MattiaPascalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
