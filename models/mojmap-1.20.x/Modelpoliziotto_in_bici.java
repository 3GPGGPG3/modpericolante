// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpoliziotto_in_bici<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "poliziotto_in_bici"), "main");
	private final ModelPart all;
	private final ModelPart bici;
	private final ModelPart ruota1;
	private final ModelPart ruota2;
	private final ModelPart pedale_dx;
	private final ModelPart pedale_dx2;
	private final ModelPart pedale_sx;
	private final ModelPart predale_sx2;
	private final ModelPart poliziotto;
	private final ModelPart gamba_dx;
	private final ModelPart gamba_dx2;
	private final ModelPart gamba_sx;
	private final ModelPart gamba_sx2;
	private final ModelPart testa;
	private final ModelPart braccio_sx;

	public Modelpoliziotto_in_bici(ModelPart root) {
		this.all = root.getChild("all");
		this.bici = this.all.getChild("bici");
		this.ruota1 = this.bici.getChild("ruota1");
		this.ruota2 = this.bici.getChild("ruota2");
		this.pedale_dx = this.bici.getChild("pedale_dx");
		this.pedale_dx2 = this.pedale_dx.getChild("pedale_dx2");
		this.pedale_sx = this.bici.getChild("pedale_sx");
		this.predale_sx2 = this.pedale_sx.getChild("predale_sx2");
		this.poliziotto = this.all.getChild("poliziotto");
		this.gamba_dx = this.poliziotto.getChild("gamba_dx");
		this.gamba_dx2 = this.gamba_dx.getChild("gamba_dx2");
		this.gamba_sx = this.poliziotto.getChild("gamba_sx");
		this.gamba_sx2 = this.gamba_sx.getChild("gamba_sx2");
		this.testa = this.poliziotto.getChild("testa");
		this.braccio_sx = this.poliziotto.getChild("braccio_sx");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(),
				PartPose.offset(1.175F, 24.2813F, 14.7872F));

		PartDefinition bici = all.addOrReplaceChild("bici",
				CubeListBuilder.create().texOffs(78, 25)
						.addBox(-1.0F, -25.1F, -23.8F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 6)
						.addBox(-1.0F, -28.1F, -23.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 85)
						.addBox(-5.4F, -28.7F, -23.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 85)
						.addBox(3.4F, -28.7F, -23.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(95, 112)
						.addBox(-3.0F, -22.6F, -7.4F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.175F, -0.2813F, -0.7872F));

		PartDefinition cube_r1 = bici.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(72, 71)
						.addBox(0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 58)
						.addBox(5.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4F, -27.7F, -23.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r2 = bici.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 81).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7F, -27.5F, -22.0F, 0.0F, 0.0F, -0.2269F));

		PartDefinition cube_r3 = bici.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(76, 80).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7F, -27.5F, -22.0F, 0.0F, 0.0F, 0.2269F));

		PartDefinition cube_r4 = bici.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 114).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.1F, -23.8F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bici.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(84, 0)
						.addBox(-7.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 67)
						.addBox(-5.0F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4F, -27.7F, -23.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r6 = bici.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(84, 33)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 20)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -15.3138F, -6.9482F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bici.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(84, 16)
						.addBox(1.0F, -1.9888F, -9.8673F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-1.0F, -1.9888F, -8.8673F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.7265F, -5.7707F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bici.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(64, 59).addBox(-1.0F, -17.9903F, -0.6136F, 2.0F, 18.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.9177F, -9.7422F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bici.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(50, 72)
						.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 72)
						.addBox(3.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.5F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bici.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(34, 72)
						.addBox(-1.0F, -11.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 72)
						.addBox(3.0F, -11.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.5F, 0.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bici.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.4138F, -7.0482F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bici.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.5F, -28.0F, 1.2043F, 0.0F, 0.0F));

		PartDefinition ruota1 = bici.addOrReplaceChild("ruota1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.5F, 0.0169F));

		PartDefinition cube_r13 = ruota1.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(86, 70)
						.addBox(4.5F, -1.0F, 10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 67)
						.addBox(-4.5F, -1.0F, 19.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 76)
						.addBox(-1.5F, -1.0F, 12.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 64)
						.addBox(-6.5F, -1.0F, 17.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 86)
						.addBox(3.5F, -1.0F, 19.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
						.addBox(-5.5F, -1.0F, 16.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 30)
						.addBox(5.5F, -1.0F, 17.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 86)
						.addBox(-3.5F, -1.0F, 18.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 27)
						.addBox(4.5F, -1.0F, 16.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 24)
						.addBox(2.5F, -1.0F, 8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 86)
						.addBox(2.5F, -1.0F, 18.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 112)
						.addBox(3.5F, -1.0F, 7.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 85)
						.addBox(-3.5F, -1.0F, 8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 64)
						.addBox(-4.5F, -1.0F, 7.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 33)
						.addBox(5.5F, -1.0F, 9.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 68)
						.addBox(-5.5F, -1.0F, 10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 41)
						.addBox(3.5F, -1.0F, 8.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 110)
						.addBox(-6.5F, -1.0F, 9.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 68)
						.addBox(-3.5F, -1.0F, 19.5F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 54)
						.addBox(-3.5F, -1.0F, 6.5F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 84)
						.addBox(3.5F, -1.0F, 17.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 40)
						.addBox(-5.5F, -1.0F, 8.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 16)
						.addBox(5.5F, -1.0F, 10.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(84, 53)
						.addBox(-5.5F, -1.0F, 17.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 27)
						.addBox(-7.5F, -1.0F, 10.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -14.0169F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r14 = ruota1.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(72, 75).addBox(-0.5F, -16.2225F, 9.3995F, 1.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -14.0169F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition cube_r15 = ruota1.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -16.2225F, 9.3995F, 1.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -14.0169F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ruota2 = bici.addOrReplaceChild("ruota2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.5F, -27.9831F));

		PartDefinition cube_r16 = ruota2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(20, 89)
						.addBox(4.5F, -1.0F, -17.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 89)
						.addBox(-4.5F, -1.0F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 75)
						.addBox(-1.5F, -1.0F, -15.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 89)
						.addBox(-6.5F, -1.0F, -10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 88)
						.addBox(3.5F, -1.0F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 88)
						.addBox(-5.5F, -1.0F, -11.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 88)
						.addBox(5.5F, -1.0F, -10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 76)
						.addBox(-3.5F, -1.0F, -9.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 123)
						.addBox(4.5F, -1.0F, -11.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 73)
						.addBox(2.5F, -1.0F, -19.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 98)
						.addBox(2.5F, -1.0F, -9.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 88)
						.addBox(3.5F, -1.0F, -20.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 48)
						.addBox(-3.5F, -1.0F, -19.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 45)
						.addBox(-4.5F, -1.0F, -20.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 88)
						.addBox(5.5F, -1.0F, -18.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 87)
						.addBox(-5.5F, -1.0F, -17.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 85)
						.addBox(3.5F, -1.0F, -19.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 80)
						.addBox(-6.5F, -1.0F, -18.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 72)
						.addBox(-3.5F, -1.0F, -8.5F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 12)
						.addBox(-3.5F, -1.0F, -21.5F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 11)
						.addBox(3.5F, -1.0F, -10.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 84)
						.addBox(-5.5F, -1.0F, -19.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 45)
						.addBox(5.5F, -1.0F, -17.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(-5.5F, -1.0F, -10.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 36)
						.addBox(-7.5F, -1.0F, -17.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 13.9831F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r17 = ruota2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(62, 79).addBox(-0.5F, 3.5765F, -10.3995F, 1.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 13.9831F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = ruota2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(20, 76).addBox(-0.5F, 3.5765F, -10.3995F, 1.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 13.9831F, -0.7854F, 0.0F, 0.0F));

		PartDefinition pedale_dx = bici.addOrReplaceChild("pedale_dx", CubeListBuilder.create(),
				PartPose.offset(-3.5F, -8.4F, -10.0F));

		PartDefinition cube_r19 = pedale_dx
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(66, 79).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition pedale_dx2 = pedale_dx.addOrReplaceChild("pedale_dx2", CubeListBuilder.create().texOffs(68, 0)
				.addBox(-3.0F, -0.6F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 0.1F, -6.0F));

		PartDefinition pedale_sx = bici.addOrReplaceChild("pedale_sx", CubeListBuilder.create(),
				PartPose.offset(3.5F, -8.4F, -10.0F));

		PartDefinition cube_r20 = pedale_sx
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(84, 45).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition predale_sx2 = pedale_sx.addOrReplaceChild("predale_sx2", CubeListBuilder.create().texOffs(68, 6)
				.addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 0.0F, 6.0F));

		PartDefinition poliziotto = all.addOrReplaceChild("poliziotto", CubeListBuilder.create(),
				PartPose.offset(-1.325F, -22.7187F, -6.5128F));

		PartDefinition cube_r21 = poliziotto.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(72, 58).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7F, -0.7803F, 1.69F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r22 = poliziotto.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(50, 43).addBox(-4.0F, 0.2172F, -0.4683F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.65F, -10.7162F, -4.5123F, -1.3847F, 0.2055F, 0.1438F));

		PartDefinition cube_r23 = poliziotto.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(36, 27).addBox(-4.0F, -11.0F, -1.1022F, 8.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.15F, -0.1625F, -1.2721F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gamba_dx = poliziotto.addOrReplaceChild("gamba_dx", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.9F, 0.6F, -0.7F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r24 = gamba_dx.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 53).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.05F, 0.2375F, 0.3257F, -0.3709F, 0.0564F, 0.2594F));

		PartDefinition gamba_dx2 = gamba_dx.addOrReplaceChild("gamba_dx2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.1853F, 8.5324F, -2.6974F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r25 = gamba_dx2.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(48, 59).addBox(-2.2342F, -0.0753F, -2.2945F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.1353F, 0.0564F, 0.2594F));

		PartDefinition gamba_sx = poliziotto.addOrReplaceChild("gamba_sx", CubeListBuilder.create(),
				PartPose.offset(3.1999F, 0.6F, -0.7F));

		PartDefinition cube_r26 = gamba_sx.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(16, 53).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.05F, 0.2375F, 0.3257F, -0.3709F, -0.0564F, -0.2594F));

		PartDefinition gamba_sx2 = gamba_sx.addOrReplaceChild("gamba_sx2", CubeListBuilder.create(),
				PartPose.offset(1.1853F, 8.5324F, -2.6974F));

		PartDefinition cube_r27 = gamba_sx2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(32, 59).addBox(-1.7658F, -0.0753F, -2.2945F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, 0.9381F, -0.0564F, -0.2594F));

		PartDefinition testa = poliziotto.addOrReplaceChild("testa", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.15F, -10.1643F, -5.1829F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r28 = testa.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(36, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.1F, -0.1F, 0.1134F, 0.0F, 0.0F));

		PartDefinition braccio_sx = poliziotto.addOrReplaceChild("braccio_sx", CubeListBuilder.create(),
				PartPose.offset(3.95F, -9.5162F, -4.7123F));

		PartDefinition cube_r29 = braccio_sx.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(34, 43).addBox(0.0F, 0.2172F, -0.4683F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2F, 0.2F, -1.3847F, -0.2055F, -0.1438F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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