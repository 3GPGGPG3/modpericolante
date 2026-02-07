// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellibra_cerchio<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "libra_cerchio"), "main");
	private final ModelPart hexadecagon;
	private final ModelPart bb_main;

	public Modellibra_cerchio(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create()
				.texOffs(136, 132).addBox(7.0F, -27.5F, -5.4701F, 1.0F, 55.0F, 10.9402F, new CubeDeformation(0.0F))
				.texOffs(112, 0).addBox(7.0F, -5.4701F, -27.5F, 1.0F, 10.9402F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create()
				.texOffs(160, 132).addBox(14.5F, -27.5F, -5.4701F, 1.0F, 55.0F, 10.9402F, new CubeDeformation(0.0F))
				.texOffs(112, 66).addBox(14.5F, -5.4701F, -27.5F, 1.0F, 10.9402F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create()
				.texOffs(112, 132).addBox(14.5F, -27.5F, -5.4701F, 1.0F, 55.0F, 10.9402F, new CubeDeformation(0.0F))
				.texOffs(0, 66).addBox(14.5F, -5.4701F, -27.5F, 1.0F, 10.9402F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 132).addBox(14.5F, -5.4701F, -27.5F, 1.0F, 10.9402F, 55.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild(
				"hexadecagon_r4", CubeListBuilder.create().texOffs(0, 0).addBox(14.5F, -5.4701F, -27.5F, 1.0F, 10.9402F,
						55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(14, 0)
				.addBox(-17.0F, -0.6F, -17.0F, 34.0F, 1.0F, 34.0F, new CubeDeformation(0.0F)),
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
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}