// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpaperon_de_paperoni<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "paperon_de_paperoni"), "main");
	private final ModelPart main;
	private final ModelPart gambasx;
	private final ModelPart piede2;
	private final ModelPart gambadx;
	private final ModelPart piede;
	private final ModelPart bracciodx;
	private final ModelPart bracciosx;
	private final ModelPart corpo;
	private final ModelPart testa;
	private final ModelPart tuba;
	private final ModelPart becco;
	private final ModelPart occhiali;

	public Modelpaperon_de_paperoni(ModelPart root) {
		this.main = root.getChild("main");
		this.gambasx = this.main.getChild("gambasx");
		this.piede2 = this.gambasx.getChild("piede2");
		this.gambadx = this.main.getChild("gambadx");
		this.piede = this.gambadx.getChild("piede");
		this.bracciodx = this.main.getChild("bracciodx");
		this.bracciosx = this.main.getChild("bracciosx");
		this.corpo = this.main.getChild("corpo");
		this.testa = this.main.getChild("testa");
		this.tuba = this.testa.getChild("tuba");
		this.becco = this.testa.getChild("becco");
		this.occhiali = this.testa.getChild("occhiali");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition gambasx = main.addOrReplaceChild("gambasx",
				CubeListBuilder.create().texOffs(32, 14).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -11.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition piede2 = gambasx.addOrReplaceChild("piede2",
				CubeListBuilder.create().texOffs(48, 23)
						.addBox(-2.0F, 9.0F, 2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 49)
						.addBox(-2.0F, 8.0F, 2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gambadx = main.addOrReplaceChild("gambadx",
				CubeListBuilder.create().texOffs(24, 42).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition piede = gambadx.addOrReplaceChild("piede",
				CubeListBuilder.create().texOffs(48, 16)
						.addBox(-2.0F, 9.0F, 2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 46)
						.addBox(-2.0F, 8.0F, 2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bracciodx = main.addOrReplaceChild("bracciodx", CubeListBuilder.create().texOffs(40, 42).addBox(
				0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -23.0F, 0.0F));

		PartDefinition bracciosx = main.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(0, 46)
				.addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -23.0F, 0.0F));

		PartDefinition corpo = main.addOrReplaceChild("corpo", CubeListBuilder.create(),
				PartPose.offset(0.0F, -15.0F, 0.0F));

		PartDefinition corpo_r1 = corpo
				.addOrReplaceChild("corpo_r1",
						CubeListBuilder.create().texOffs(0, 30).addBox(-7.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition testa = main.addOrReplaceChild("testa",
				CubeListBuilder.create().texOffs(0, 14).addBox(-4.0257F, -8.0114F, -4.6538F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tuba = testa.addOrReplaceChild("tuba",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -2.0F, -7.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 30)
						.addBox(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
						.addBox(-3.0F, -8.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 38)
						.addBox(-5.0F, -4.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-5.0F, -4.0F, 2.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(-5.0F, -4.0F, -6.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition becco = testa.addOrReplaceChild("becco",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-5.0F, -2.0F, -21.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(1.0F, -3.0F, -21.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(-6.0F, -3.0F, -21.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -2.0F, 24.0F));

		PartDefinition occhiali = testa.addOrReplaceChild("occhiali",
				CubeListBuilder.create().texOffs(48, 40)
						.addBox(1.0F, -5.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 52)
						.addBox(-3.0F, -5.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 38)
						.addBox(-1.0F, -4.0F, 5.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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
	}
}