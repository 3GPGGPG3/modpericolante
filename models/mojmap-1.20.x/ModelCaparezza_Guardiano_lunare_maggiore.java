// Made with Blockbench 5.1.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCaparezza_Guardiano_lunare_maggiore<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "caparezza_guardiano_lunare_maggiore"), "main");
	private final ModelPart gambasx;
	private final ModelPart ginocchiosx;
	private final ModelPart gambadx;
	private final ModelPart ginocchiodx;
	private final ModelPart bracciosx;
	private final ModelPart gomitosx;
	private final ModelPart bracciodx;
	private final ModelPart gomitodx;
	private final ModelPart corpo;
	private final ModelPart testa;
	private final ModelPart capelli;
	private final ModelPart barba;

	public ModelCaparezza_Guardiano_lunare_maggiore(ModelPart root) {
		this.gambasx = root.getChild("gambasx");
		this.ginocchiosx = this.gambasx.getChild("ginocchiosx");
		this.gambadx = root.getChild("gambadx");
		this.ginocchiodx = this.gambadx.getChild("ginocchiodx");
		this.bracciosx = root.getChild("bracciosx");
		this.gomitosx = this.bracciosx.getChild("gomitosx");
		this.bracciodx = root.getChild("bracciodx");
		this.gomitodx = this.bracciodx.getChild("gomitodx");
		this.corpo = root.getChild("corpo");
		this.testa = root.getChild("testa");
		this.capelli = this.testa.getChild("capelli");
		this.barba = this.testa.getChild("barba");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gambasx = partdefinition.addOrReplaceChild("gambasx", CubeListBuilder.create().texOffs(22, 44)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition ginocchiosx = gambasx.addOrReplaceChild("ginocchiosx", CubeListBuilder.create().texOffs(44, 33)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition gambadx = partdefinition.addOrReplaceChild("gambadx", CubeListBuilder.create().texOffs(38, 44)
				.addBox(-2.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 11.0F, 0.0F));

		PartDefinition ginocchiodx = gambadx.addOrReplaceChild("ginocchiodx", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition bracciosx = partdefinition.addOrReplaceChild("bracciosx", CubeListBuilder.create()
				.texOffs(16, 54).addBox(0.5F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 1.0F, 0.0F));

		PartDefinition gomitosx = bracciosx.addOrReplaceChild("gomitosx", CubeListBuilder.create().texOffs(30, 54)
				.addBox(-1.5F, 1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 5.0F, 0.0F));

		PartDefinition bracciodx = partdefinition.addOrReplaceChild("bracciodx", CubeListBuilder.create()
				.texOffs(50, 19).addBox(-3.5F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 1.0F, 0.0F));

		PartDefinition gomitodx = bracciodx.addOrReplaceChild("gomitodx", CubeListBuilder.create().texOffs(54, 0)
				.addBox(-1.5F, 1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 5.0F, 0.0F));

		PartDefinition corpo = partdefinition.addOrReplaceChild("corpo",
				CubeListBuilder.create().texOffs(24, 24)
						.addBox(-8.0F, -6.0F, -1.0F, 9.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 13)
						.addBox(-7.5F, -1.0F, -1.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 43)
						.addBox(-6.0F, -7.0F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 6.0F, -1.0F));

		PartDefinition cube_r1 = corpo.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(60, 34).addBox(-6.0F, -2.0F, -1.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8F, -4.8F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = corpo.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(60, 52).addBox(3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, -4.8F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition testa = partdefinition.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 13).addBox(
				-3.0F, -7.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition capelli = testa.addOrReplaceChild("capelli",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-6.0F, 2.0F, -3.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-16.0F, 5.0F, -2.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 33)
						.addBox(-15.0F, 2.0F, -3.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 54)
						.addBox(-15.0F, 9.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-6.0F, 9.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, 1.0F, -4.0F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 11)
						.addBox(-12.0F, 4.0F, 3.0F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 48)
						.addBox(-12.0F, 9.0F, 3.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 30)
						.addBox(-12.0F, 11.0F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-6.0F, 5.0F, -2.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, -11.0F, 0.0F));

		PartDefinition barba = testa.addOrReplaceChild("barba",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 51)
						.addBox(-2.0F, -5.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(1.0F, -5.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 11)
						.addBox(-1.0F, -5.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -4.0F));

		PartDefinition cube_r3 = barba.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(50, 30).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.4F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r4 = barba.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 11).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.4F, 0.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gambasx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gambadx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bracciosx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bracciodx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.gambasx.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bracciodx.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.gambadx.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bracciosx.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.testa.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.testa.xRot = headPitch / (180F / (float) Math.PI);
	}
}