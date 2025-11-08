package net.mcreator.cum.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgiolitti_unito<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelgiolitti_unito"), "main");
	public final ModelPart giolitti;
	public final ModelPart gamba_dxC;
	public final ModelPart corpoC;
	public final ModelPart braccio_dxC;
	public final ModelPart braccio_sxC;
	public final ModelPart testaC;
	public final ModelPart corpoB;
	public final ModelPart braccio_dxB;
	public final ModelPart braccio_sxB;
	public final ModelPart testaB;
	public final ModelPart gamba_dxB;
	public final ModelPart gamba_sxB;
	public final ModelPart gamba_sxC;

	public Modelgiolitti_unito(ModelPart root) {
		this.giolitti = root.getChild("giolitti");
		this.gamba_dxC = this.giolitti.getChild("gamba_dxC");
		this.corpoC = this.giolitti.getChild("corpoC");
		this.braccio_dxC = this.corpoC.getChild("braccio_dxC");
		this.braccio_sxC = this.corpoC.getChild("braccio_sxC");
		this.testaC = this.corpoC.getChild("testaC");
		this.corpoB = this.giolitti.getChild("corpoB");
		this.braccio_dxB = this.corpoB.getChild("braccio_dxB");
		this.braccio_sxB = this.corpoB.getChild("braccio_sxB");
		this.testaB = this.corpoB.getChild("testaB");
		this.gamba_dxB = this.giolitti.getChild("gamba_dxB");
		this.gamba_sxB = this.giolitti.getChild("gamba_sxB");
		this.gamba_sxC = this.giolitti.getChild("gamba_sxC");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition giolitti = partdefinition.addOrReplaceChild("giolitti", CubeListBuilder.create(), PartPose.offset(0.5F, 12.0F, -2.0F));
		PartDefinition gamba_dxC = giolitti.addOrReplaceChild("gamba_dxC", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = gamba_dxC.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.2182F));
		PartDefinition corpoC = giolitti.addOrReplaceChild("corpoC", CubeListBuilder.create(), PartPose.offset(6.9504F, -13.0801F, 1.5F));
		PartDefinition cube_r2 = corpoC.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 73).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3504F, 5.6801F, 0.5F, 0.0F, 0.0F, 0.4712F));
		PartDefinition cube_r3 = corpoC.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(72, 48).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5504F, 5.6801F, 0.5F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r4 = corpoC.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 42).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4504F, 13.0801F, 0.5F, 0.0F, -1.5708F, 0.3054F));
		PartDefinition braccio_dxC = corpoC.addOrReplaceChild("braccio_dxC", CubeListBuilder.create(), PartPose.offset(-4.7504F, 1.4801F, -6.5F));
		PartDefinition cube_r5 = braccio_dxC.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition braccio_sxC = corpoC.addOrReplaceChild("braccio_sxC", CubeListBuilder.create(), PartPose.offset(-4.7504F, 1.3801F, 5.5F));
		PartDefinition cube_r6 = braccio_sxC.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 58).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition testaC = corpoC.addOrReplaceChild("testaC", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r7 = testaC.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(38, 76).addBox(1.0F, 0.465F, -2.9504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 76).addBox(-1.0F, 0.465F, -2.9504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, 0.0F, -1.5708F, 0.0873F));
		PartDefinition cube_r8 = testaC.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 56).addBox(-1.0F, 0.969F, -2.2955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.48F));
		PartDefinition cube_r9 = testaC.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 74).addBox(-1.0F, 2.2042F, -1.7979F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.3316F));
		PartDefinition cube_r10 = testaC.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 41).addBox(0.0F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6776F, -0.7729F, 3.6F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r11 = testaC.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(6, 79).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 77).addBox(0.0F, -2.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 74)
						.addBox(0.0F, -3.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 79).addBox(0.0F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6776F, -0.7729F, 3.8F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r12 = testaC.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 21).addBox(0.0F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6776F, -0.7729F, -3.6F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r13 = testaC.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(18, 79).addBox(0.0F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 74).addBox(0.0F, -3.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 77)
						.addBox(0.0F, -2.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 45).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6776F, -0.7729F, -3.8F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r14 = testaC.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(48, 16).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2496F, -6.1199F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r15 = testaC.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, -2.4729F, -1.5F, -1.5708F, -1.2828F, 2.2078F));
		PartDefinition cube_r16 = testaC.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, -2.4729F, 2.5F, 1.5708F, -1.2915F, -0.9338F));
		PartDefinition cube_r17 = testaC.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6224F, -1.1729F, 2.5F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r18 = testaC.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6224F, -1.1729F, -1.5F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r19 = testaC.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(72, 16).addBox(0.0F, -3.535F, -2.9504F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0F, -1.5708F, -0.0436F));
		PartDefinition cube_r20 = testaC.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 26).addBox(-3.5F, -4.7199F, -1.8496F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition corpoB = giolitti.addOrReplaceChild("corpoB", CubeListBuilder.create(), PartPose.offset(-10.4727F, -15.553F, 0.0F));
		PartDefinition cube_r21 = corpoB.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 73).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0727F, 8.153F, 2.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r22 = corpoB.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(72, 52).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 73).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8727F, 8.153F, 1.5F, 0.0F, 0.0F, -0.4712F));
		PartDefinition cube_r23 = corpoB.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9727F, 15.553F, 2.0F, 0.0F, 1.5708F, -0.3054F));
		PartDefinition braccio_dxB = corpoB.addOrReplaceChild("braccio_dxB", CubeListBuilder.create(), PartPose.offset(7.2727F, 3.853F, 7.0F));
		PartDefinition cube_r24 = braccio_dxB.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 57).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition braccio_sxB = corpoB.addOrReplaceChild("braccio_sxB", CubeListBuilder.create(), PartPose.offset(7.2727F, 3.953F, -5.0F));
		PartDefinition cube_r25 = braccio_sxB.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(48, 58).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition testaB = corpoB.addOrReplaceChild("testaB", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r26 = testaB.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 23).addBox(-2.0F, 2.2042F, -1.7979F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, 2.4729F, 1.5F, 0.0F, 1.5708F, -0.3316F));
		PartDefinition cube_r27 = testaB.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 41).addBox(-1.0F, -3.535F, -2.9504F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, 2.6729F, 1.5F, 0.0F, 1.5708F, 0.0436F));
		PartDefinition cube_r28 = testaB.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, 0.465F, -2.9504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(-2.0F, 0.465F, -2.9504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, 2.2729F, 1.5F, 0.0F, 1.5708F, -0.0873F));
		PartDefinition cube_r29 = testaB.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 74).addBox(-2.0F, 0.969F, -2.2955F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, 2.4729F, 1.5F, 0.0F, 1.5708F, -0.48F));
		PartDefinition cube_r30 = testaB.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 43).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 1.7F, -2.1F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r31 = testaB.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(10, 79).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 16).addBox(-1.0F, -2.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 74)
						.addBox(-1.0F, -3.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 79).addBox(-1.0F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 1.7F, -2.3F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r32 = testaB.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(78, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 74).addBox(-1.0F, -3.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 77)
						.addBox(-1.0F, -2.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 79).addBox(-1.0F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 1.7F, 5.3F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r33 = testaB.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 19).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 1.7F, 5.1F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r34 = testaB.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 13).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2727F, -3.647F, 2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r35 = testaB.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -1.5708F, 1.501F, -2.2078F));
		PartDefinition cube_r36 = testaB.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 1.3F, 4.0F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r37 = testaB.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(24, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 1.3F, 0.0F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r38 = testaB.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(32, 26).addBox(-4.5F, -4.7199F, -1.8496F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5224F, 2.4729F, 1.5F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r39 = testaB.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(6, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 1.4661F, 0.9338F));
		PartDefinition gamba_dxB = giolitti.addOrReplaceChild("gamba_dxB", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 3.9F));
		PartDefinition cube_r40 = gamba_dxB.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0873F));
		PartDefinition gamba_sxB = giolitti.addOrReplaceChild("gamba_sxB", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));
		PartDefinition cube_r41 = gamba_sxB.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(56, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.2182F));
		PartDefinition gamba_sxC = giolitti.addOrReplaceChild("gamba_sxC", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.9F));
		PartDefinition cube_r42 = gamba_sxC.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		giolitti.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.gamba_dxB.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gamba_dxC.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.testaC.yRot = headPitch / (180F / (float) Math.PI);
		this.testaB.yRot = headPitch / (180F / (float) Math.PI);
		this.braccio_dxC.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.braccio_dxB.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.giolitti.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.gamba_sxB.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.gamba_sxC.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.braccio_sxC.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.braccio_sxB.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
