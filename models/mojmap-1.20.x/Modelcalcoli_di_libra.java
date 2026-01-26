// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcalcoli_di_libra<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "calcoli_di_libra"), "main");
	private final ModelPart cubo;
	private final ModelPart part1;
	private final ModelPart part2;
	private final ModelPart part3;

	public Modelcalcoli_di_libra(ModelPart root) {
		this.cubo = root.getChild("cubo");
		this.part1 = root.getChild("part1");
		this.part2 = root.getChild("part2");
		this.part3 = root.getChild("part3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cubo = partdefinition.addOrReplaceChild("cubo", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition part1 = partdefinition.addOrReplaceChild("part1", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition part2 = partdefinition.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition part3 = partdefinition.addOrReplaceChild("part3", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cubo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		part1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		part2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		part3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}