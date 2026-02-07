
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.Libra2Procedure;
import net.mcreator.cum.entity.LibraCreatureOfNightEntity;
import net.mcreator.cum.client.model.animations.libbraAnimation;
import net.mcreator.cum.client.model.Modellibbra;

public class LibraCreatureOfNightRenderer extends MobRenderer<LibraCreatureOfNightEntity, Modellibbra<LibraCreatureOfNightEntity>> {
	public LibraCreatureOfNightRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modellibbra.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(LibraCreatureOfNightEntity entity) {
		return new ResourceLocation("cum:textures/entities/libra_2.png");
	}

	private static final class AnimatedModel extends Modellibbra<LibraCreatureOfNightEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LibraCreatureOfNightEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LibraCreatureOfNightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, libbraAnimation.idle, ageInTicks, 1f);
				if (Libra2Procedure.execute(entity))
					this.animateWalk(libbraAnimation.walk, limbSwing, limbSwingAmount, 1f, 1.1f);
				this.animate(entity.animationState2, libbraAnimation.pietre, ageInTicks, 1f);
				this.animate(entity.animationState3, libbraAnimation.follia, ageInTicks, 1f);
				this.animate(entity.animationState4, libbraAnimation.schiaccia_pietra, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LibraCreatureOfNightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
