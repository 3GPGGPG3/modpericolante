// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelflesh_panopticom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flesh_panopticom"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelflesh_panopticom(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(46, 100)
						.addBox(4.0F, -96.0F, -3.0F, 1.0F, 96.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-4.0F, -96.0F, -4.0F, 8.0F, 96.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 100)
						.addBox(-5.0F, -96.0F, -3.0F, 1.0F, 96.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 100)
						.addBox(-3.0F, -96.0F, -5.0F, 6.0F, 96.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 100)
						.addBox(-3.0F, -96.0F, 4.0F, 6.0F, 96.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-25.0F, -146.0F, -25.0F, 50.0F, 50.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}