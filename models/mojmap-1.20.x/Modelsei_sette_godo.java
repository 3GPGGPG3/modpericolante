// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsei_sette_godo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sei_sette_godo"), "main");
	private final ModelPart abramo;
	private final ModelPart anns;
	private final ModelPart giodo;

	public Modelsei_sette_godo(ModelPart root) {
		this.abramo = root.getChild("abramo");
		this.anns = root.getChild("anns");
		this.giodo = root.getChild("giodo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition abramo = partdefinition.addOrReplaceChild("abramo", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-26.0F, -22.0F, -1.0F, 57.0F, 63.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -17.0F, 19.0F));

		PartDefinition anns = partdefinition.addOrReplaceChild("anns", CubeListBuilder.create().texOffs(0, 36)
				.addBox(-13.0F, -8.0F, -9.0F, 15.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-19.0F, 24.0F, 7.0F));

		PartDefinition cube_r1 = anns.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(4, 41).addBox(-2.0F, -3.0F, -7.5F, 4.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.3739F, -6.5599F, -13.0824F, -0.5672F, 0.5672F, 0.0F));

		PartDefinition cube_r2 = anns.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.25F, -5.424F, -19.8146F, -0.5236F, 0.0698F, 0.0F));

		PartDefinition cube_r3 = anns.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.75F, -5.424F, -19.8146F, -0.5236F, 0.0349F, 0.0F));

		PartDefinition cube_r4 = anns.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -5.424F, -19.9146F, -0.5236F, -0.0349F, 0.0F));

		PartDefinition cube_r5 = anns.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, -5.424F, -19.9146F, -0.5236F, -0.1047F, 0.0F));

		PartDefinition cube_r6 = anns
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(4, 41).addBox(-14.0F, -6.0F, -22.0F, 4.0F, 6.0F, 15.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.1F, 0.0F, 3.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r7 = anns.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, -5.424F, -19.9146F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r8 = anns.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -5.424F, -19.9146F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r9 = anns.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.75F, -5.424F, -19.8146F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r10 = anns.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(6, 43).addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.25F, -5.424F, -19.8146F, 0.0F, 0.0698F, 0.0F));

		PartDefinition giodo = partdefinition.addOrReplaceChild("giodo",
				CubeListBuilder.create().texOffs(0, 30).mirror()
						.addBox(-0.4F, -2.576F, 10.9146F, 15.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(17.4F, -6.424F, -12.9146F));

		PartDefinition cube_r11 = giodo.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(12, 42).mirror()
						.addBox(10.0F, -6.0F, -22.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 5.424F, 22.9146F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r12 = giodo.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(14, 44).mirror()
						.addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.85F, 0.0F, 0.1F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r13 = giodo.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(14, 44).mirror()
						.addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.35F, 0.0F, 0.1F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r14 = giodo.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(14, 44).mirror()
						.addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.85F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r15 = giodo.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(14, 44).mirror()
						.addBox(-1.5F, -1.576F, -1.1854F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r16 = giodo.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(12, 42).mirror()
						.addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.85F, 0.0F, 0.1F, -0.5236F, -0.0698F, 0.0F));

		PartDefinition cube_r17 = giodo.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(12, 42).mirror()
						.addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.85F, 0.0F, 0.0F, -0.5236F, 0.0349F, 0.0F));

		PartDefinition cube_r18 = giodo.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(12, 42).mirror()
						.addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.35F, 0.0F, 0.1F, -0.5236F, -0.0349F, 0.0F));

		PartDefinition cube_r19 = giodo.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(12, 42).mirror()
						.addBox(-2.0F, -3.0F, -7.5F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(23.9739F, -1.1359F, 6.8322F, -0.5672F, -0.5672F, 0.0F));

		PartDefinition cube_r20 = giodo.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 30).mirror()
						.addBox(-1.5F, -1.576F, -11.8146F, 3.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.1047F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		abramo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		anns.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		giodo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}