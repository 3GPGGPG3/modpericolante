// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelOlivia<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "olivia"), "main");
	private final ModelPart main;
	private final ModelPart gambasx;
	private final ModelPart gambadx;
	private final ModelPart bracciodx;
	private final ModelPart bracciosx;
	private final ModelPart corpo;
	private final ModelPart seno;
	private final ModelPart testa;
	private final ModelPart capelli;

	public ModelOlivia(ModelPart root) {
		this.main = root.getChild("main");
		this.gambasx = this.main.getChild("gambasx");
		this.gambadx = this.main.getChild("gambadx");
		this.bracciodx = this.main.getChild("bracciodx");
		this.bracciosx = this.main.getChild("bracciosx");
		this.corpo = this.main.getChild("corpo");
		this.seno = this.corpo.getChild("seno");
		this.testa = this.main.getChild("testa");
		this.capelli = this.testa.getChild("capelli");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition gambasx = main.addOrReplaceChild("gambasx", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F,
				-1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -11.0F, 0.0F));

		PartDefinition gambadx = main.addOrReplaceChild("gambadx", CubeListBuilder.create().texOffs(24, 16)
				.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -11.0F, 0.0F));

		PartDefinition bracciodx = main.addOrReplaceChild("bracciodx", CubeListBuilder.create().texOffs(16, 32)
				.addBox(0.0F, -1.4202F, -2.4209F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -23.0F, 0.0F));

		PartDefinition bracciosx = main.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -23.0F, 0.0F));

		PartDefinition corpo = main.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F,
				-9.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -15.0F, 0.0F));

		PartDefinition seno = corpo.addOrReplaceChild("seno",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(4.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -5.0F, -3.0F));

		PartDefinition testa = main.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0257F,
				-8.0114F, -4.6538F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition capelli = testa.addOrReplaceChild("capelli", CubeListBuilder.create(),
				PartPose.offset(-7.0257F, -3.0114F, 1.3462F));

		PartDefinition cube_r1 = capelli.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 39)
						.addBox(0.0F, -4.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(12.0F, -4.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.gambasx.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bracciodx.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.gambadx.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bracciosx.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.testa.yRot = headPitch / (180F / (float) Math.PI);
	}
}