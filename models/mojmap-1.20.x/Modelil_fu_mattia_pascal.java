// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelil_fu_mattia_pascal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "il_fu_mattia_pascal"), "main");
	private final ModelPart main;
	private final ModelPart gambasx;
	private final ModelPart gambadx;
	private final ModelPart bracciodx;
	private final ModelPart bracciosx;
	private final ModelPart corpo;
	private final ModelPart testa;
	private final ModelPart cappello;

	public Modelil_fu_mattia_pascal(ModelPart root) {
		this.main = root.getChild("main");
		this.gambasx = this.main.getChild("gambasx");
		this.gambadx = this.main.getChild("gambadx");
		this.bracciodx = this.main.getChild("bracciodx");
		this.bracciosx = this.main.getChild("bracciosx");
		this.corpo = this.main.getChild("corpo");
		this.testa = this.main.getChild("testa");
		this.cappello = this.testa.getChild("cappello");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition gambasx = main.addOrReplaceChild("gambasx",
				CubeListBuilder.create().texOffs(40, 42).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -11.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition gambadx = main.addOrReplaceChild("gambadx",
				CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bracciodx = main.addOrReplaceChild("bracciodx", CubeListBuilder.create().texOffs(32, 13).addBox(
				0.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -23.0F, 0.0F));

		PartDefinition bracciosx = main.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(24, 42)
				.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -23.0F, 0.0F));

		PartDefinition corpo = main.addOrReplaceChild("corpo", CubeListBuilder.create(),
				PartPose.offset(0.0F, -15.0F, 0.0F));

		PartDefinition corpo_r1 = corpo
				.addOrReplaceChild("corpo_r1",
						CubeListBuilder.create().texOffs(0, 31).addBox(-7.0F, -13.0F, -2.0F, 8.0F, 13.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.0F, 3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition testa = main.addOrReplaceChild("testa", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -25.0F, -1.0F, 3.098F, 0.0F, 3.1416F));

		PartDefinition naso_r1 = testa.addOrReplaceChild("naso_r1",
				CubeListBuilder.create().texOffs(16, 48).addBox(0.5257F, 1.5F, -3.3462F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9743F, -6.0F, 0.3462F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition testa_r1 = testa.addOrReplaceChild("testa_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 10.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0257F, -3.0114F, -0.6538F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cappello = testa.addOrReplaceChild("cappello",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -1.0F, -7.0F, 14.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 21)
						.addBox(3.0F, -3.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 31)
						.addBox(-3.0F, -6.0F, -4.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
						.addBox(-5.0F, -3.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 17)
						.addBox(-5.0F, -3.0F, 2.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 13)
						.addBox(-5.0F, -3.0F, -6.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -0.1396F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}