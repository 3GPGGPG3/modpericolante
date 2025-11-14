
package net.mcreator.cum.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.cum.procedures.TopoWalkinCeckProcedure;
import net.mcreator.cum.entity.TopoEntity;
import net.mcreator.cum.client.model.animations.topoAnimation;
import net.mcreator.cum.client.model.Modeltopo;

public class TopoRenderer extends MobRenderer<TopoEntity, Modeltopo<TopoEntity>> {
	public TopoRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeltopo.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(TopoEntity entity) {
		return new ResourceLocation("cum:textures/entities/topo.png");
	}

	private static final class AnimatedModel extends Modeltopo<TopoEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<TopoEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(TopoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, topoAnimation.idle, ageInTicks, 0.5f);
				if (TopoWalkinCeckProcedure.execute(entity))
					this.animateWalk(topoAnimation.walk, limbSwing, limbSwingAmount, 2f, 1.5f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(TopoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
