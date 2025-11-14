// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltopo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "topo"), "main");
	private final ModelPart coda;
	private final ModelPart sottocoda;
	private final ModelPart sotto_s_coda;
	private final ModelPart testa;
	private final ModelPart zampa4;
	private final ModelPart zampa3;
	private final ModelPart zampa2;
	private final ModelPart zampa1;
	private final ModelPart bb_main;

	public Modeltopo(ModelPart root) {
		this.coda = root.getChild("coda");
		this.sottocoda = this.coda.getChild("sottocoda");
		this.sotto_s_coda = this.sottocoda.getChild("sotto_s_coda");
		this.testa = root.getChild("testa");
		this.zampa4 = root.getChild("zampa4");
		this.zampa3 = root.getChild("zampa3");
		this.zampa2 = root.getChild("zampa2");
		this.zampa1 = root.getChild("zampa1");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition coda = partdefinition.addOrReplaceChild("coda", CubeListBuilder.create(),
				PartPose.offset(0.0297F, 23.0F, 5.221F));

		PartDefinition cube_r1 = coda.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(-0.6489F, -2.0F, 0.0328F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3203F, 0.8F, -1.021F, 0.0F, -0.2618F, 0.0F));

		PartDefinition sottocoda = coda.addOrReplaceChild("sottocoda", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = sottocoda.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(22, 21).addBox(-0.8911F, -1.0F, 0.4814F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4692F, 0.4F, -0.7419F, 0.0F, -0.2182F, 0.0F));

		PartDefinition sotto_s_coda = sottocoda.addOrReplaceChild("sotto_s_coda", CubeListBuilder.create(),
				PartPose.offset(-0.6308F, 0.0F, 2.4581F));

		PartDefinition cube_r3 = sotto_s_coda.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 21).addBox(-0.4739F, -0.675F, 0.8103F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -1.2F, -0.1242F, -0.4804F, -0.0128F));

		PartDefinition testa = partdefinition.addOrReplaceChild("testa", CubeListBuilder.create(),
				PartPose.offset(-0.0681F, 20.7924F, -4.7727F));

		PartDefinition cube_r4 = testa.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 14).addBox(1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6819F, -0.0424F, 0.5727F, -0.6265F, 0.3614F, 0.5185F));

		PartDefinition cube_r5 = testa.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(22, 25).addBox(1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9319F, 1.4576F, -0.0273F, -0.4895F, -0.2031F, -0.5239F));

		PartDefinition cube_r6 = testa.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.4F, -3.0F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4319F, 1.7076F, 1.4727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = testa.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 19).addBox(-2.0F, -1.4F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9681F, 1.7076F, 2.4727F, -0.0873F, 0.0F, 0.0F));

		PartDefinition zampa4 = partdefinition.addOrReplaceChild("zampa4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.6993F, 21.5797F, -3.3F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r8 = zampa4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(8, 26).addBox(-0.9962F, -0.9128F, -1.8F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6673F, 1.6206F, 0.2F, 0.0F, 0.0F, -0.6021F));

		PartDefinition cube_r9 = zampa4.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(18, 26).addBox(-0.9537F, -1.6993F, -0.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4673F, 1.3206F, 0.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition zampa3 = partdefinition.addOrReplaceChild("zampa3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.4F, 21.9F, 1.7F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r10 = zampa3.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(26, 6).addBox(-0.7164F, 0.9495F, -1.2032F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1491F, 0.2115F, -0.1468F, 0.0F, 0.0F, -0.5585F));

		PartDefinition cube_r11 = zampa3.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(14, 26).addBox(-0.0249F, -0.2284F, -0.3284F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1491F, 0.2115F, -0.1468F, -0.0114F, -0.0865F, -0.2177F));

		PartDefinition zampa2 = partdefinition.addOrReplaceChild("zampa2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.4054F, 22.1813F, 1.8F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r12 = zampa2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(26, 3).addBox(-0.999F, -1.0436F, -1.8F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7622F, 1.9811F, 0.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r13 = zampa2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(8, 22).addBox(-0.866F, -2.5F, -0.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7622F, 1.9811F, 0.2F, 0.0F, 0.0F, -0.3491F));

		PartDefinition zampa1 = partdefinition.addOrReplaceChild("zampa1", CubeListBuilder.create(),
				PartPose.offset(2.7028F, 21.784F, -3.3F));

		PartDefinition cube_r14 = zampa1.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(26, 0).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2028F, 2.216F, 0.4F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r15 = zampa1.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(20, 14).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2028F, 2.216F, 0.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(20, 10)
				.addBox(-2.0F, -2.3F, 3.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(12, 17).addBox(-1.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -2.15F, -0.8F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.0F, 7.0F, 4.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.4F, -10.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, 6.0F, 5.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -0.4F, -10.8F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		coda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		zampa4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		zampa3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		zampa2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		zampa1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}