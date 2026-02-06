
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.Bicicletta2Procedure;
import net.mcreator.cum.entity.BiciclettaEntity;
import net.mcreator.cum.client.model.animations.biciclettaAnimation;
import net.mcreator.cum.client.model.Modelbicicletta;

public class BiciclettaRenderer extends MobRenderer<BiciclettaEntity, Modelbicicletta<BiciclettaEntity>> {
	public BiciclettaRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbicicletta.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(BiciclettaEntity entity) {
		return new ResourceLocation("cum:textures/entities/poliziotto_in_bici.png");
	}

	private static final class AnimatedModel extends Modelbicicletta<BiciclettaEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BiciclettaEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BiciclettaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, biciclettaAnimation.idle, ageInTicks, 1f);
				if (Bicicletta2Procedure.execute(entity))
					this.animateWalk(biciclettaAnimation.walk, limbSwing, limbSwingAmount, 1f, 2f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BiciclettaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
