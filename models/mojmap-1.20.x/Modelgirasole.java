// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgirasole<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "girasole"), "main");
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelgirasole(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 11).addBox(
				-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				-3.0468F, -1.0914F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0518F, -10.7483F, -0.3086F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 4.8702F, -0.0128F, 0.6981F, 0.0F, 2.2166F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 4.8702F, -0.0128F, 0.0F, 0.0F, 2.2166F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 35).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, 5.7702F, -0.0128F, 0.6981F, 0.0F, -2.8711F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, 5.7702F, -0.0128F, 0.0F, 0.0F, -2.8711F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(24, 34).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 0.4702F, -0.0128F, 0.6981F, 0.0F, 1.5795F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 26).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 0.4702F, -0.0128F, 0.0F, 0.0F, 1.5795F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 2.9702F, -0.0128F, 0.6981F, 0.0F, -1.6842F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 25).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 2.9702F, -0.0128F, 0.0F, 0.0F, -1.6842F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(8, 33).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0298F, -0.0128F, 0.6981F, 0.0F, 1.4399F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.0298F, -0.0128F, 0.0F, 0.0F, 1.4399F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 0.4702F, -0.0128F, 0.6981F, 0.0F, -1.5795F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(24, 15).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 0.4702F, -0.0128F, 0.0F, 0.0F, -1.5795F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(32, 28).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, -3.5298F, -0.0128F, 0.6981F, 0.0F, 0.8727F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, -3.5298F, -0.0128F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(32, 24).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.0298F, -0.0128F, 0.6981F, 0.0F, -1.4399F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.0298F, -0.0128F, 0.0F, 0.0F, -1.4399F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(32, 20).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, -3.5298F, -0.0128F, 0.6981F, 0.0F, -0.8727F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(8, 23).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, -3.5298F, -0.0128F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(32, 16).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, 5.7702F, -0.0128F, 0.6981F, 0.0F, 2.8711F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(22, 5).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, 5.7702F, -0.0128F, 0.0F, 0.0F, 2.8711F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.2298F, -0.0128F, 0.0F, 0.0F, -0.2007F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(32, 12).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.2298F, -0.0128F, 0.6981F, 0.0F, -0.2007F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 2.9702F, -0.0128F, 0.0F, 0.0F, 1.6842F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, 2.9702F, -0.0128F, 0.6981F, 0.0F, 1.6842F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(16, 31).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 4.8702F, -0.0128F, 0.6981F, 0.0F, -2.2166F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 4.8702F, -0.0128F, 0.0F, 0.0F, -2.2166F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(24, 30).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.5298F, -0.0128F, 0.6981F, 0.0F, -0.0611F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(30, 4).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -4.5298F, -0.0128F, 0.6981F, 0.0F, 0.0611F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -1.8707F, -0.8195F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.2298F, -0.0128F, 0.6981F, 0.0F, 0.2007F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(8, 18).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.2298F, -0.0128F, 0.0F, 0.0F, 0.2007F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -4.5298F, -0.0128F, 0.0F, 0.0F, 0.0611F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(16, 11).addBox(-1.0F, -0.717F, -0.5786F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.5298F, -0.0128F, 0.0F, 0.0F, -0.0611F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(8, 11)
				.addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}