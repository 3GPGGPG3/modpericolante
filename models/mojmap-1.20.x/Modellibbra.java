// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellibbra<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "libbra"), "main");
	private final ModelPart all;
	private final ModelPart gamba_dx;
	private final ModelPart gamba_dx2;
	private final ModelPart gamba_dx3;
	private final ModelPart gamba_sx;
	private final ModelPart gamba_sx2;
	private final ModelPart gamba_sx3;
	private final ModelPart corpo;
	private final ModelPart braccio_dx;
	private final ModelPart braccio_dx2;
	private final ModelPart testa;
	private final ModelPart braccio_sx;
	private final ModelPart braccio_sx2;
	private final ModelPart scettro;

	public Modellibbra(ModelPart root) {
		this.all = root.getChild("all");
		this.gamba_dx = this.all.getChild("gamba_dx");
		this.gamba_dx2 = this.gamba_dx.getChild("gamba_dx2");
		this.gamba_dx3 = this.gamba_dx2.getChild("gamba_dx3");
		this.gamba_sx = this.all.getChild("gamba_sx");
		this.gamba_sx2 = this.gamba_sx.getChild("gamba_sx2");
		this.gamba_sx3 = this.gamba_sx2.getChild("gamba_sx3");
		this.corpo = this.all.getChild("corpo");
		this.braccio_dx = this.corpo.getChild("braccio_dx");
		this.braccio_dx2 = this.braccio_dx.getChild("braccio_dx2");
		this.testa = this.corpo.getChild("testa");
		this.braccio_sx = this.corpo.getChild("braccio_sx");
		this.braccio_sx2 = this.braccio_sx.getChild("braccio_sx2");
		this.scettro = this.braccio_sx2.getChild("scettro");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(0.2271F, 5.8629F, 10.2798F));

		PartDefinition gamba_dx = all.addOrReplaceChild("gamba_dx", CubeListBuilder.create(),
				PartPose.offset(-6.4354F, -0.0155F, 0.6485F));

		PartDefinition cube_r1 = gamba_dx.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(60, 194).addBox(-2.9776F, -2.5801F, -7.521F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8726F, 4.1365F, -9.6158F, 0.2425F, 0.1931F, 0.0157F));

		PartDefinition cube_r2 = gamba_dx.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(60, 179).addBox(-3.0F, -3.5F, -12.0F, 6.0F, 7.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4471F, 2.2055F, -4.668F, 0.3109F, 0.2327F, 0.1211F));

		PartDefinition gamba_dx2 = gamba_dx.addOrReplaceChild("gamba_dx2", CubeListBuilder.create(),
				PartPose.offset(-3.5056F, 6.2798F, -13.5674F));

		PartDefinition cube_r3 = gamba_dx2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(60, 183).addBox(-2.3937F, -0.3414F, -5.7501F, 5.0F, 5.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.633F, -2.1434F, 3.9516F, -0.0605F, 0.3303F, 0.0032F));

		PartDefinition gamba_dx3 = gamba_dx2.addOrReplaceChild("gamba_dx3", CubeListBuilder.create(),
				PartPose.offset(4.1024F, 3.7578F, 10.6656F));

		PartDefinition cube_r4 = gamba_dx3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(132, 181).addBox(-6.9152F, 10.25F, -12.054F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6114F, -5.135F, -4.6892F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r5 = gamba_dx3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(72, 192).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4959F, 6.115F, -8.6666F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r6 = gamba_dx3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(65, 189).addBox(-1.0F, -1.0F, -6.5F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3759F, 6.115F, -10.0987F, 0.0F, 0.2007F, 0.0F));

		PartDefinition cube_r7 = gamba_dx3.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(78, 187).addBox(-1.845F, 0.1125F, -2.1759F, 4.0F, 14.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.1F, 4.7F, -1.0552F, 0.1829F, 0.1027F));

		PartDefinition cube_r8 = gamba_dx3.addOrReplaceChild(
				"cube_r8", CubeListBuilder.create().texOffs(156, 200).addBox(-1.0886F, -6.0219F, 1.0309F, 4.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition gamba_sx = all.addOrReplaceChild("gamba_sx", CubeListBuilder.create(),
				PartPose.offset(5.9811F, -0.0155F, 0.6485F));

		PartDefinition cube_r9 = gamba_sx.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(152, 198).addBox(-2.0224F, -2.5801F, -7.521F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8726F, 4.1365F, -9.6158F, 0.2425F, -0.1931F, -0.0157F));

		PartDefinition cube_r10 = gamba_sx.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(122, 178).addBox(-3.0F, -3.5F, -12.0F, 6.0F, 7.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4471F, 2.2055F, -4.668F, 0.3109F, -0.2327F, -0.1211F));

		PartDefinition gamba_sx2 = gamba_sx.addOrReplaceChild("gamba_sx2", CubeListBuilder.create(),
				PartPose.offset(4.8726F, 7.1365F, -12.6158F));

		PartDefinition cube_r11 = gamba_sx2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(60, 178).addBox(-2.6063F, -0.3414F, -5.7501F, 5.0F, 5.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, 3.0F, -0.0605F, -0.3303F, -0.0032F));

		PartDefinition gamba_sx3 = gamba_sx2.addOrReplaceChild("gamba_sx3", CubeListBuilder.create(),
				PartPose.offset(-5.4694F, 2.9012F, 9.714F));

		PartDefinition cube_r12 = gamba_sx3.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(78, 188).addBox(-2.155F, 0.1125F, -2.1759F, 4.0F, 14.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.1F, 4.7F, -1.0552F, -0.1829F, -0.1027F));

		PartDefinition cube_r13 = gamba_sx3.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(130, 181).addBox(3.9152F, 10.25F, -12.054F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6114F, -5.135F, -4.6892F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r14 = gamba_sx3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(64, 192).addBox(-2.0F, -1.0F, -6.5F, 3.0F, 3.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3759F, 6.115F, -10.0987F, 0.0F, -0.2007F, 0.0F));

		PartDefinition cube_r15 = gamba_sx3.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(72, 189).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4959F, 6.115F, -8.6666F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r16 = gamba_sx3.addOrReplaceChild(
				"cube_r16", CubeListBuilder.create().texOffs(60, 194).addBox(-2.9114F, -6.0219F, 1.0309F, 4.0F, 4.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition corpo = all.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(92, 130)
				.addBox(-9.6814F, -15.894F, -1.9829F, 18.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(116, 191)
				.addBox(-3.6814F, 4.106F, -3.9829F, 6.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(107, 185)
				.addBox(-5.6814F, 0.106F, -3.9829F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(99, 176)
				.addBox(-9.6814F, -2.894F, -2.9829F, 18.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 101)
				.addBox(-6.6814F, -24.894F, -1.9829F, 12.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.4543F, 0.0311F, -1.2969F));

		PartDefinition cube_r17 = corpo.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(117, 74).addBox(-0.5F, 2.0F, 0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6814F, -30.1917F, -5.9295F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r18 = corpo.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(72, 195).addBox(-1.5F, 1.5F, -4.5F, 2.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2186F, -26.694F, 2.5171F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r19 = corpo.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(73, 193).addBox(-1.0F, -0.5F, -4.5F, 4.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8808F, -22.9915F, 2.5171F, 0.0F, 0.0F, -0.576F));

		PartDefinition cube_r20 = corpo.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(73, 195).addBox(-0.5F, 1.5F, -4.5F, 2.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5814F, -26.694F, 2.5171F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r21 = corpo.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(71, 195).addBox(-3.0F, -0.5F, -4.5F, 4.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.518F, -22.9915F, 2.5171F, 0.0F, 0.0F, 0.576F));

		PartDefinition cube_r22 = corpo.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(107, 97).addBox(-4.5F, -4.0F, -4.5F, 11.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4814F, -18.694F, 2.5171F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r23 = corpo.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(86, 95).addBox(-6.5F, -4.0F, -4.5F, 11.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1186F, -18.694F, 2.5171F, 0.0F, 0.0F, 0.2618F));

		PartDefinition braccio_dx = corpo.addOrReplaceChild("braccio_dx", CubeListBuilder.create(),
				PartPose.offset(-10.5468F, -18.9891F, 3.2624F));

		PartDefinition cube_r24 = braccio_dx.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(64, 195).addBox(-6.4111F, -0.9282F, 2.1012F, 14.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 5.0F, -5.0F, -0.2755F, 0.0227F, -1.0479F));

		PartDefinition cube_r25 = braccio_dx.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(125, 98).addBox(5.1388F, -5.7153F, 1.1293F, 7.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 5.0F, -5.0F, -0.0349F, 0.0604F, -0.3327F));

		PartDefinition braccio_dx2 = braccio_dx.addOrReplaceChild("braccio_dx2", CubeListBuilder.create(),
				PartPose.offset(-9.8891F, 0.5997F, -6.0535F));

		PartDefinition cube_r26 = braccio_dx2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(206, 125).addBox(6.0392F, 0.5319F, 0.8577F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4341F, 0.2602F, -1.6212F));

		PartDefinition cube_r27 = braccio_dx2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(203, 131).addBox(4.008F, -0.2063F, -4.6328F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1813F, 1.1385F, -2.3681F));

		PartDefinition cube_r28 = braccio_dx2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(216, 130).addBox(5.8247F, 0.045F, 0.0653F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9409F, 0.3887F, -1.2975F));

		PartDefinition cube_r29 = braccio_dx2.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(206, 121).addBox(5.052F, 1.5506F, 3.0021F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3217F, -0.0008F, -1.3843F));

		PartDefinition cube_r30 = braccio_dx2.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(212, 131).addBox(4.3605F, 0.5628F, -1.3835F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3795F, 0.511F, -1.8523F));

		PartDefinition cube_r31 = braccio_dx2.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(204, 131).addBox(3.2967F, 0.4244F, -2.8789F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4643F, 0.9188F, -1.8508F));

		PartDefinition cube_r32 = braccio_dx2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(211, 132).addBox(3.9076F, 0.0571F, -0.7805F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9366F, 0.5215F, -1.3336F));

		PartDefinition cube_r33 = braccio_dx2.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(208, 121).addBox(4.6504F, 0.2973F, -1.2644F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2152F, 0.3008F, -2.0512F));

		PartDefinition cube_r34 = braccio_dx2.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(205, 123).addBox(-7.2843F, -0.4654F, 2.3216F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1379F, 0.1883F, 1.6435F));

		PartDefinition cube_r35 = braccio_dx2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(209, 121).addBox(7.9238F, 0.5725F, -1.7598F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4258F, 0.5004F, -1.8301F));

		PartDefinition cube_r36 = braccio_dx2.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(210, 122).addBox(5.8414F, 0.4792F, 3.5816F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8405F, 0.1435F, -1.4259F));

		PartDefinition cube_r37 = braccio_dx2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(205, 131).addBox(7.6714F, -0.0677F, 0.8798F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9942F, 0.2771F, -1.2963F));

		PartDefinition cube_r38 = braccio_dx2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(205, 131).addBox(-6.0615F, -0.9546F, -1.6281F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3297F, 0.3282F, 0.9963F));

		PartDefinition cube_r39 = braccio_dx2.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(204, 132).addBox(0.8626F, 1.1641F, 7.5691F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9892F, -0.57F, -0.5411F));

		PartDefinition cube_r40 = braccio_dx2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(217, 125).addBox(-9.8096F, -0.3335F, 0.1658F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2037F, 0.3141F, 1.373F));

		PartDefinition cube_r41 = braccio_dx2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 199)
				.addBox(-3.3189F, -2.6458F, -2.1839F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(79, 194)
				.addBox(7.6811F, -3.6458F, -3.1839F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3827F, -0.318F, 1.461F));

		PartDefinition cube_r42 = braccio_dx2.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(154, 67).addBox(3.225F, -0.9456F, -2.5113F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6262F, -0.3156F, 1.3317F));

		PartDefinition cube_r43 = braccio_dx2.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(81, 202).addBox(3.5207F, -2.6104F, -0.5886F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7495F, -0.5369F, 1.4861F));

		PartDefinition cube_r44 = braccio_dx2.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(70, 196).addBox(-3.0454F, -2.9745F, -2.1839F, 11.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.4059F, -0.3773F, 1.5291F));

		PartDefinition cube_r45 = braccio_dx2.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(74, 201).addBox(-3.1009F, -2.6458F, -2.5001F, 11.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3606F, -0.3807F, 1.3964F));

		PartDefinition cube_r46 = braccio_dx2.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(67, 201).addBox(-2.7478F, 0.714F, -2.1839F, 11.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3641F, -0.2573F, 1.3956F));

		PartDefinition cube_r47 = braccio_dx2.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(79, 198).addBox(-0.4694F, 3.0222F, 5.5007F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8891F, 2.1003F, 1.0535F, -0.0041F, 0.6114F, 1.0146F));

		PartDefinition cube_r48 = braccio_dx2.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(80, 194).addBox(-4.6422F, -3.0644F, -1.5552F, 2.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.6321F, -0.1638F, 1.7116F));

		PartDefinition cube_r49 = braccio_dx2.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(74, 199).addBox(-2.9575F, -2.6677F, -0.6753F, 11.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.4156F, -0.1763F, 1.5948F));

		PartDefinition testa = corpo.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(104, 96)
				.addBox(-3.0671F, -4.01F, -3.0549F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(78, 58)
				.addBox(-12.5671F, -13.01F, -2.0549F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(146, 60)
				.addBox(8.4329F, -13.01F, -3.0549F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 58)
				.addBox(-10.5671F, -13.01F, -4.0549F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(146, 59)
				.addBox(7.4329F, -13.01F, -2.0549F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 55)
				.addBox(-10.5671F, -15.01F, -2.0549F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(146, 58)
				.addBox(9.4329F, -13.01F, -4.0549F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(80, 56)
				.addBox(-11.5671F, -14.01F, -2.0549F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(149, 55)
				.addBox(9.4329F, -15.01F, -2.0549F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 60)
				.addBox(-11.5671F, -13.01F, -3.0549F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(147, 55)
				.addBox(9.4329F, -14.01F, -3.0549F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 56)
				.addBox(-10.5671F, -14.01F, -3.0549F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(146, 57)
				.addBox(8.4329F, -14.01F, -2.0549F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.6814F, -25.884F, 1.1195F));

		PartDefinition cube_r50 = testa.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(141, 48).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2525F, -8.6076F, -1.0549F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r51 = testa.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(78, 115).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8868F, -8.1076F, -1.0549F, 0.0F, 0.0F, 1.789F));

		PartDefinition cube_r52 = testa.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(144, 47)
						.addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(140, 48)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.4392F, -6.5932F, -1.0549F, 0.0F, 0.0F, -1.5184F));

		PartDefinition cube_r53 = testa.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(92, 46).addBox(-0.0999F, -3.0052F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.7735F, -6.4932F, -1.0549F, 0.0F, 0.0F, 1.213F));

		PartDefinition cube_r54 = testa.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(142, 47).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7702F, -7.3757F, -1.0549F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r55 = testa.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(89, 47).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3868F, -8.6076F, -1.0549F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r56 = testa.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(142, 47).addBox(-0.9001F, -3.0052F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6392F, -6.4932F, -1.0549F, 0.0F, 0.0F, -1.213F));

		PartDefinition cube_r57 = testa.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(87, 48).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9044F, -7.3757F, -1.0549F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r58 = testa.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(88, 46)
						.addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 48)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5735F, -6.5932F, -1.0549F, 0.0F, 0.0F, 1.5184F));

		PartDefinition cube_r59 = testa.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(139, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0623F, -6.9681F, -1.0549F, 0.0F, 0.0F, -1.7977F));

		PartDefinition cube_r60 = testa.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(104, 49).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6748F, -13.4188F, -1.0549F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r61 = testa.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(126, 50).addBox(-0.774F, -4.9235F, -1.0F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.709F, -13.2188F, -1.0549F, 0.0F, 0.0F, -0.7069F));

		PartDefinition cube_r62 = testa.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(146, 48).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.8305F, -8.4322F, -1.0549F, 0.0F, 0.0F, -2.426F));

		PartDefinition cube_r63 = testa.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(87, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.1966F, -6.9681F, -1.0549F, 0.0F, 0.0F, 1.7977F));

		PartDefinition cube_r64 = testa.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(147, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.5998F, -10.6953F, -1.0549F, 0.0F, 0.0F, -2.9845F));

		PartDefinition cube_r65 = testa.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(94, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.9647F, -8.4322F, -1.0549F, 0.0F, 0.0F, 2.426F));

		PartDefinition cube_r66 = testa.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(147, 46).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1682F, -14.2078F, -1.0549F, 0.0F, 0.0F, 2.9322F));

		PartDefinition cube_r67 = testa.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(90, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.734F, -10.6953F, -1.0549F, 0.0F, 0.0F, 2.9845F));

		PartDefinition cube_r68 = testa.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(145, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.8222F, -16.2019F, -1.0549F, 0.0F, 0.0F, 2.3911F));

		PartDefinition cube_r69 = testa.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(90, 46).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3024F, -14.2078F, -1.0549F, 0.0F, 0.0F, -2.9322F));

		PartDefinition cube_r70 = testa.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(144, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7386F, -16.8155F, -1.0549F, 0.0F, 0.0F, 1.6755F));

		PartDefinition cube_r71 = testa.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(87, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9564F, -16.2019F, -1.0549F, 0.0F, 0.0F, -2.3911F));

		PartDefinition cube_r72 = testa.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(138, 46).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9538F, -16.6669F, -1.0549F, 0.0F, 0.0F, 1.4835F));

		PartDefinition cube_r73 = testa.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(86, 48).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.8728F, -16.8155F, -1.0549F, 0.0F, 0.0F, -1.6755F));

		PartDefinition cube_r74 = testa.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(132, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7218F, -16.4669F, -1.0549F, 0.0F, 0.0F, 1.2392F));

		PartDefinition cube_r75 = testa.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(90, 46).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0881F, -16.6669F, -1.0549F, 0.0F, 0.0F, -1.4835F));

		PartDefinition cube_r76 = testa.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(108, 51).addBox(-0.226F, -4.9235F, -1.0F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5748F, -13.2188F, -1.0549F, 0.0F, 0.0F, 0.7069F));

		PartDefinition cube_r77 = testa.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(100, 46).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.856F, -16.4669F, -1.0549F, 0.0F, 0.0F, -1.2392F));

		PartDefinition cube_r78 = testa.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(109, 56).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4329F, -8.01F, -1.0549F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r79 = testa.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(126, 50).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.809F, -13.4188F, -1.0549F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r80 = testa.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(78, 116).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7525F, -8.1076F, -1.0549F, 0.0F, 0.0F, -1.789F));

		PartDefinition cube_r81 = testa.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(120, 56).addBox(-1.0F, -5.0F, -1.0F, 3.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5671F, -8.01F, -1.0549F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r82 = testa.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(117, 63).addBox(-0.5F, -4.5F, -1.5F, 1.0F, 10.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3438F, -3.4083F, -5.7167F, -0.2174F, 0.3076F, 0.0875F));

		PartDefinition cube_r83 = testa.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(109, 59).addBox(-0.3834F, -2.8538F, -2.337F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8181F, -7.6901F, -4.1181F, -0.3627F, 0.0082F, 1.1149F));

		PartDefinition cube_r84 = testa.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(123, 72).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7329F, -4.7489F, -4.9108F, 0.1113F, 0.3302F, 0.6377F));

		PartDefinition cube_r85 = testa.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(0, 161).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0671F, -8.2489F, -4.6108F, 0.3164F, 0.147F, -2.2973F));

		PartDefinition cube_r86 = testa.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(125, 68).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5329F, -6.2489F, -5.0108F, -0.0445F, 0.3451F, 0.175F));

		PartDefinition cube_r87 = testa.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(115, 67).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8671F, -4.7489F, -4.9108F, 0.1113F, -0.3302F, -0.6377F));

		PartDefinition cube_r88 = testa.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(126, 69).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9329F, -8.2489F, -4.6108F, 0.3164F, -0.147F, 2.2973F));

		PartDefinition cube_r89 = testa.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(106, 68).addBox(-1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6671F, -6.5489F, -4.9108F, -0.0465F, -0.4497F, -0.1699F));

		PartDefinition cube_r90 = testa.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(128, 68).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5329F, -6.5489F, -4.9108F, -0.0465F, 0.4497F, 0.1699F));

		PartDefinition cube_r91 = testa.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(183, 179)
						.addBox(-2.5F, -4.0F, 0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(188, 182)
						.addBox(-1.5F, 0.0F, 0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, -4.3078F, -6.3015F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r92 = testa.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(117, 71).addBox(-0.5F, -4.0F, 0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0671F, -4.1078F, -7.0015F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r93 = testa.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(116, 71)
						.addBox(-0.5F, -2.0F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 74)
						.addBox(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0671F, -4.2078F, -7.0015F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r94 = testa.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(110, 65).addBox(-3.0F, -4.0F, -4.5F, 5.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9329F, -2.0974F, -3.0312F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r95 = testa.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(118, 69)
						.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 70)
						.addBox(-1.5F, 1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, -4.1078F, -6.7015F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r96 = testa.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(116, 59).addBox(-0.6166F, -2.8538F, -2.337F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6839F, -7.6901F, -4.1181F, -0.3627F, -0.0082F, -1.1149F));

		PartDefinition cube_r97 = testa.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(109, 61).addBox(-0.5F, -4.5F, -1.5F, 1.0F, 10.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.478F, -3.4083F, -5.7167F, -0.2174F, -0.3076F, -0.0875F));

		PartDefinition cube_r98 = testa.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(107, 67).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6671F, -6.2489F, -5.0108F, -0.0445F, -0.3451F, -0.175F));

		PartDefinition cube_r99 = testa.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(109, 62).addBox(-2.0F, -6.0F, -4.5F, 4.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, -1.9974F, -3.0312F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r100 = testa.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(112, 59).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, -6.31F, 4.0451F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r101 = testa.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(144, 148).addBox(-3.5F, -2.5F, -0.5F, 7.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4329F, -1.51F, 5.0451F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r102 = testa.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(110, 103).addBox(-0.5F, -2.5F, -4.5F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8329F, -1.51F, 1.4451F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r103 = testa.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(92, 95).addBox(-0.5F, -2.5F, -4.5F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9671F, -1.51F, 1.4451F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r104 = testa.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(109, 75).addBox(-2.0F, 2.0F, -4.5F, 2.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4329F, -2.2974F, -3.0312F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r105 = testa.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(94, 90).addBox(-3.0F, -5.0F, -5.0F, 7.0F, 5.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0671F, -3.51F, 2.2451F, 0.1222F, 0.0F, 0.0F));

		PartDefinition braccio_sx = corpo.addOrReplaceChild("braccio_sx", CubeListBuilder.create(),
				PartPose.offset(9.4739F, -21.1829F, 1.8429F));

		PartDefinition cube_r106 = braccio_sx.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(104, 81).addBox(-3.5F, -4.0F, -4.0F, 7.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.179F, 2.889F, 1.0757F, -0.0349F, -0.0604F, 0.5247F));

		PartDefinition cube_r107 = braccio_sx.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(63, 193).addBox(-1.0F, -6.0F, -1.0F, 14.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.779F, 4.289F, -2.1243F, -0.2755F, -0.0227F, 1.2399F));

		PartDefinition braccio_sx2 = braccio_sx.addOrReplaceChild("braccio_sx2", CubeListBuilder.create(),
				PartPose.offset(6.7365F, 12.098F, 0.3633F));

		PartDefinition cube_r108 = braccio_sx2.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(169, 142).addBox(-2.5F, -1.5F, -1.5F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4725F, 1.4481F, 0.6091F, -0.0041F, -0.6114F, -0.8226F));

		PartDefinition cube_r109 = braccio_sx2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(161, 134)
				.addBox(-9.6734F, -3.3016F, -2.4442F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(79, 200)
				.addBox(0.3266F, -2.3016F, -1.4442F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, -0.365F, 0.456F, -0.4692F));

		PartDefinition cube_r110 = braccio_sx2.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(148, 146).addBox(-7.3748F, -2.1285F, -0.2199F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, 0.3683F, 0.3714F, -0.2472F));

		PartDefinition cube_r111 = braccio_sx2.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(206, 125).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0486F, -5.4492F, -9.2145F, 3.0225F, -0.2164F, -0.2195F));

		PartDefinition cube_r112 = braccio_sx2.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(203, 132).addBox(-2.1304F, 0.337F, -0.1466F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3576F, -3.5853F, -8.7528F, 3.0032F, -0.1713F, -0.1927F));

		PartDefinition cube_r113 = braccio_sx2.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(206, 121).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0876F, -2.9017F, -9.2913F, 3.088F, -0.1175F, -0.0263F));

		PartDefinition cube_r114 = braccio_sx2.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(210, 121).addBox(-1.8715F, -0.4769F, -0.1508F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5393F, -6.4333F, -8.1227F, 2.8057F, -0.6589F, -0.0816F));

		PartDefinition cube_r115 = braccio_sx2.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(206, 132).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.9691F, -5.6248F, -8.8688F, 1.2976F, -1.2397F, 1.5078F));

		PartDefinition cube_r116 = braccio_sx2.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(202, 131).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.9597F, -4.3953F, -8.6413F, 1.2197F, -1.1232F, 1.7467F));

		PartDefinition cube_r117 = braccio_sx2.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(207, 121).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.1479F, -2.7128F, -8.2143F, 1.5363F, -1.2839F, 1.4957F));

		PartDefinition cube_r118 = braccio_sx2.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(207, 121).addBox(-0.1503F, -0.5231F, -0.1008F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.2393F, -6.4333F, -8.1227F, 1.2723F, -1.3144F, 1.6486F));

		PartDefinition cube_r119 = braccio_sx2.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(205, 122).addBox(0.0197F, 0.2165F, 0.492F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6385F, -6.3379F, -7.4781F, 3.0636F, 0.6429F, 0.058F));

		PartDefinition cube_r120 = braccio_sx2.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(209, 121).addBox(0.1802F, -0.3952F, 0.6508F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9413F, -6.1996F, -7.4771F, 0.5602F, -0.6858F, 2.4422F));

		PartDefinition cube_r121 = braccio_sx2.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(207, 128).addBox(1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4773F, -5.4736F, -7.9007F, 0.4342F, -0.7316F, 2.4902F));

		PartDefinition cube_r122 = braccio_sx2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(209, 124)
				.addBox(0.9293F, 0.0579F, -0.5406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 124)
				.addBox(1.0707F, -1.0579F, -0.4594F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4519F, -3.4734F, -7.8755F, 0.5398F, -0.8812F, 2.5057F));

		PartDefinition cube_r123 = braccio_sx2.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(209, 121).addBox(-1.1976F, -0.2977F, 0.2957F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6385F, -6.2379F, -7.4781F, 0.5623F, 1.2734F, -1.6668F));

		PartDefinition cube_r124 = braccio_sx2.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(212, 126).addBox(-2.1405F, -0.5115F, 0.5836F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6385F, -6.2379F, -7.4781F, -0.0382F, 0.3042F, -1.792F));

		PartDefinition cube_r125 = braccio_sx2.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(80, 192).addBox(-2.5973F, -0.3991F, -1.7439F, 2.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.654F, -5.5102F, -6.8875F, -0.7914F, 0.9733F, -1.0036F));

		PartDefinition cube_r126 = braccio_sx2.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(160, 148).addBox(-7.1931F, -0.1884F, -2.3042F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, 0.3292F, 0.3445F, -0.5255F));

		PartDefinition cube_r127 = braccio_sx2.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(162, 145).addBox(-7.2783F, 1.1447F, -1.4442F, 11.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, -0.4031F, 0.4233F, -0.5587F));

		PartDefinition cube_r128 = braccio_sx2.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(159, 143).addBox(-6.9206F, -2.7194F, -1.4442F, 11.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, -0.3232F, 0.4854F, -0.3771F));

		PartDefinition cube_r129 = braccio_sx2.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(158, 139).addBox(-7.1944F, -2.3236F, 0.2431F, 11.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, -0.4091F, 0.6339F, -0.5539F));

		PartDefinition cube_r130 = braccio_sx2.addOrReplaceChild("cube_r130",
				CubeListBuilder.create().texOffs(159, 146).addBox(-6.8307F, -2.3016F, -1.8511F, 11.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5562F, -1.4226F, -4.435F, -0.3515F, 0.3742F, -0.4358F));

		PartDefinition scettro = braccio_sx2.addOrReplaceChild("scettro",
				CubeListBuilder.create().texOffs(207, 53)
						.addBox(-1.0867F, -10.68F, -1.0F, 2.0F, 62.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(209, 67)
						.addBox(-1.0867F, 43.32F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(204, 65)
						.addBox(-2.0867F, 43.32F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(206, 55)
						.addBox(-1.0867F, -2.68F, -2.0F, 2.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(208, 53)
						.addBox(-2.0867F, -2.68F, -1.0F, 4.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(202, 69)
						.addBox(-2.0867F, 5.32F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(204, 53)
						.addBox(-2.0867F, 43.32F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(207, 57)
						.addBox(-1.0867F, 30.32F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(208, 58)
						.addBox(-2.0867F, 30.32F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(202, 56)
						.addBox(-2.0867F, 1.32F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(203, 57)
						.addBox(-2.0867F, -1.68F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(200, 51)
						.addBox(-3.0867F, -3.68F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(210, 53)
						.addBox(-1.0867F, -7.68F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(203, 64)
						.addBox(-2.0867F, -7.68F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(205, 58)
						.addBox(-1.0867F, -1.68F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(202, 59)
						.addBox(-3.0867F, -1.68F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(194, 50)
						.addBox(-4.0867F, -8.68F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(205, 60)
						.addBox(-3.0867F, -6.68F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(205, 50)
						.addBox(-1.0867F, -6.68F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(203, 61)
						.addBox(-2.0867F, -6.68F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(200, 54)
						.addBox(-4.0867F, -7.68F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(202, 48)
						.addBox(-1.0867F, -7.68F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(201, 50)
						.addBox(-3.0867F, -7.68F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(200, 48)
						.addBox(-2.0867F, -7.68F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(204, 20)
						.addBox(-1.0867F, -20.68F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(204, 19)
						.addBox(-2.0867F, -17.68F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(213, 28)
						.addBox(0.9133F, -14.68F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.2712F, -24.1291F, -7.6876F));

		PartDefinition cube_r131 = scettro.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(209, 23).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4133F, -16.68F, 0.0F, 0.0F, 0.0F, 0.4451F));

		PartDefinition cube_r132 = scettro.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(204, 27).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1133F, -15.98F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r133 = scettro.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(206, 18).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1867F, -18.98F, 0.0F, 0.0F, 0.0F, 0.2443F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}