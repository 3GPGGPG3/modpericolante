package net.mcreator.cum.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbad_piggies<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelbad_piggies"), "main");
	public final ModelPart tutto;
	public final ModelPart corpo;
	public final ModelPart hexadecagon;
	public final ModelPart hexadecagon2;
	public final ModelPart hexadecagon3;
	public final ModelPart hexadecagon4;
	public final ModelPart hexadecagon5;
	public final ModelPart hexadecagon6;
	public final ModelPart hexadecagon7;
	public final ModelPart hexadecagon8;
	public final ModelPart hexadecagon9;
	public final ModelPart hexadecagon10;
	public final ModelPart hexadecagon11;
	public final ModelPart hexadecagon28;
	public final ModelPart hexadecagon37;
	public final ModelPart pupilla;
	public final ModelPart hexadecagon46;
	public final ModelPart hexadecagon55;
	public final ModelPart occhi;
	public final ModelPart hexadecagon64;
	public final ModelPart hexadecagon73;
	public final ModelPart denti;
	public final ModelPart hexadecagon82;
	public final ModelPart hexadecagon91;
	public final ModelPart hexadecagon100;
	public final ModelPart naso;
	public final ModelPart hexadecagon117;
	public final ModelPart hexadecagon126;
	public final ModelPart orecchie;
	public final ModelPart hexadecagon135;
	public final ModelPart hexadecagon144;

	public Modelbad_piggies(ModelPart root) {
		this.tutto = root.getChild("tutto");
		this.corpo = this.tutto.getChild("corpo");
		this.hexadecagon = this.corpo.getChild("hexadecagon");
		this.hexadecagon2 = this.corpo.getChild("hexadecagon2");
		this.hexadecagon3 = this.corpo.getChild("hexadecagon3");
		this.hexadecagon4 = this.corpo.getChild("hexadecagon4");
		this.hexadecagon5 = this.corpo.getChild("hexadecagon5");
		this.hexadecagon6 = this.corpo.getChild("hexadecagon6");
		this.hexadecagon7 = this.corpo.getChild("hexadecagon7");
		this.hexadecagon8 = this.corpo.getChild("hexadecagon8");
		this.hexadecagon9 = this.corpo.getChild("hexadecagon9");
		this.hexadecagon10 = this.corpo.getChild("hexadecagon10");
		this.hexadecagon11 = this.corpo.getChild("hexadecagon11");
		this.hexadecagon28 = this.corpo.getChild("hexadecagon28");
		this.hexadecagon37 = this.corpo.getChild("hexadecagon37");
		this.pupilla = this.tutto.getChild("pupilla");
		this.hexadecagon46 = this.pupilla.getChild("hexadecagon46");
		this.hexadecagon55 = this.pupilla.getChild("hexadecagon55");
		this.occhi = this.tutto.getChild("occhi");
		this.hexadecagon64 = this.occhi.getChild("hexadecagon64");
		this.hexadecagon73 = this.occhi.getChild("hexadecagon73");
		this.denti = this.tutto.getChild("denti");
		this.hexadecagon82 = this.denti.getChild("hexadecagon82");
		this.hexadecagon91 = this.denti.getChild("hexadecagon91");
		this.hexadecagon100 = this.denti.getChild("hexadecagon100");
		this.naso = this.tutto.getChild("naso");
		this.hexadecagon117 = this.naso.getChild("hexadecagon117");
		this.hexadecagon126 = this.naso.getChild("hexadecagon126");
		this.orecchie = this.tutto.getChild("orecchie");
		this.hexadecagon135 = this.orecchie.getChild("hexadecagon135");
		this.hexadecagon144 = this.orecchie.getChild("hexadecagon144");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tutto = partdefinition.addOrReplaceChild("tutto", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition corpo = tutto.addOrReplaceChild("corpo", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon = corpo.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(190, 190).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(200, 190).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(180, 190).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon2 = corpo.addOrReplaceChild("hexadecagon2",
				CubeListBuilder.create().texOffs(36, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(10, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2443F, 0.0F));
		PartDefinition hexadecagon_r5 = hexadecagon2.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(20, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = hexadecagon2.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(0, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = hexadecagon2.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(72, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = hexadecagon2.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(36, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon3 = corpo.addOrReplaceChild("hexadecagon3",
				CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(40, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4887F, 0.0F));
		PartDefinition hexadecagon_r9 = hexadecagon3.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(50, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 76).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = hexadecagon3.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(30, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(72, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r11 = hexadecagon3.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(72, 76).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = hexadecagon3.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(72, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon4 = corpo.addOrReplaceChild("hexadecagon4",
				CubeListBuilder.create().texOffs(72, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(70, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.733F, 0.0F));
		PartDefinition hexadecagon_r13 = hexadecagon4.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(80, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r14 = hexadecagon4.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(60, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r15 = hexadecagon4.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(108, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r16 = hexadecagon4.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon5 = corpo.addOrReplaceChild("hexadecagon5",
				CubeListBuilder.create().texOffs(220, 236).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(100, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.9774F, 0.0F));
		PartDefinition hexadecagon_r17 = hexadecagon5.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(110, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r18 = hexadecagon5.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(90, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r19 = hexadecagon5.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r20 = hexadecagon5.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(108, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon6 = corpo.addOrReplaceChild("hexadecagon6",
				CubeListBuilder.create().texOffs(108, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(130, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r21 = hexadecagon6.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(140, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(0, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r22 = hexadecagon6.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(120, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(72, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r23 = hexadecagon6.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(36, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r24 = hexadecagon6.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(36, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon7 = corpo.addOrReplaceChild("hexadecagon7",
				CubeListBuilder.create().texOffs(144, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(160, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.4661F, 0.0F));
		PartDefinition hexadecagon_r25 = hexadecagon7.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(170, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(144, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r26 = hexadecagon7.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(150, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r27 = hexadecagon7.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(144, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r28 = hexadecagon7.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(72, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon8 = corpo.addOrReplaceChild("hexadecagon8",
				CubeListBuilder.create().texOffs(144, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(190, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7104F, 0.0F));
		PartDefinition hexadecagon_r29 = hexadecagon8.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(200, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(144, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r30 = hexadecagon8.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(180, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(144, 76).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r31 = hexadecagon8.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(144, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r32 = hexadecagon8.addOrReplaceChild("hexadecagon_r32", CubeListBuilder.create().texOffs(144, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon9 = corpo.addOrReplaceChild("hexadecagon9",
				CubeListBuilder.create().texOffs(72, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(210, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.9548F, 0.0F));
		PartDefinition hexadecagon_r33 = hexadecagon9.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(216, 0).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r34 = hexadecagon9.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(210, 190).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r35 = hexadecagon9.addOrReplaceChild("hexadecagon_r35", CubeListBuilder.create().texOffs(144, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r36 = hexadecagon9.addOrReplaceChild("hexadecagon_r36", CubeListBuilder.create().texOffs(0, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon10 = corpo.addOrReplaceChild("hexadecagon10",
				CubeListBuilder.create().texOffs(72, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(216, 38).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.1991F, 0.0F));
		PartDefinition hexadecagon18_r1 = hexadecagon10.addOrReplaceChild("hexadecagon18_r1",
				CubeListBuilder.create().texOffs(216, 57).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon16_r1 = hexadecagon10.addOrReplaceChild("hexadecagon16_r1",
				CubeListBuilder.create().texOffs(216, 19).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon15_r1 = hexadecagon10.addOrReplaceChild("hexadecagon15_r1", CubeListBuilder.create().texOffs(144, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon11_r1 = hexadecagon10.addOrReplaceChild("hexadecagon11_r1", CubeListBuilder.create().texOffs(0, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon11 = corpo.addOrReplaceChild("hexadecagon11",
				CubeListBuilder.create().texOffs(180, 38).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(216, 95).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.4435F, 0.0F));
		PartDefinition hexadecagon27_r1 = hexadecagon11.addOrReplaceChild("hexadecagon27_r1",
				CubeListBuilder.create().texOffs(216, 114).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(180, 57).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon25_r1 = hexadecagon11.addOrReplaceChild("hexadecagon25_r1",
				CubeListBuilder.create().texOffs(216, 76).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(180, 19).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon24_r1 = hexadecagon11.addOrReplaceChild("hexadecagon24_r1", CubeListBuilder.create().texOffs(180, 76).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon20_r1 = hexadecagon11.addOrReplaceChild("hexadecagon20_r1", CubeListBuilder.create().texOffs(180, 0).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon28 = corpo.addOrReplaceChild("hexadecagon28",
				CubeListBuilder.create().texOffs(180, 133).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(216, 152).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.6878F, 0.0F));
		PartDefinition hexadecagon36_r1 = hexadecagon28.addOrReplaceChild("hexadecagon36_r1",
				CubeListBuilder.create().texOffs(216, 171).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(180, 152).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon34_r1 = hexadecagon28.addOrReplaceChild("hexadecagon34_r1",
				CubeListBuilder.create().texOffs(216, 133).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(180, 114).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon33_r1 = hexadecagon28.addOrReplaceChild("hexadecagon33_r1", CubeListBuilder.create().texOffs(180, 171).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon29_r1 = hexadecagon28.addOrReplaceChild("hexadecagon29_r1", CubeListBuilder.create().texOffs(180, 95).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon37 = corpo.addOrReplaceChild("hexadecagon37",
				CubeListBuilder.create().texOffs(72, 190).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)).texOffs(220, 209).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.9322F, 0.0F));
		PartDefinition hexadecagon45_r1 = hexadecagon37.addOrReplaceChild("hexadecagon45_r1",
				CubeListBuilder.create().texOffs(226, 0).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(108, 190).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon43_r1 = hexadecagon37.addOrReplaceChild("hexadecagon43_r1",
				CubeListBuilder.create().texOffs(220, 190).addBox(-1.0F, -8.0F, -1.5913F, 2.0F, 16.0F, 3.1826F, new CubeDeformation(0.0F)).texOffs(36, 190).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon42_r1 = hexadecagon37.addOrReplaceChild("hexadecagon42_r1", CubeListBuilder.create().texOffs(144, 190).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon38_r1 = hexadecagon37.addOrReplaceChild("hexadecagon38_r1", CubeListBuilder.create().texOffs(0, 190).addBox(-1.0F, -1.5913F, -8.0F, 2.0F, 3.1826F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition pupilla = tutto.addOrReplaceChild("pupilla", CubeListBuilder.create(), PartPose.offset(4.0F, 7.0F, -15.0F));
		PartDefinition hexadecagon46 = pupilla.addOrReplaceChild("hexadecagon46",
				CubeListBuilder.create().texOffs(184, 239).addBox(-8.0995F, -8.5F, 7.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(184, 239).addBox(-8.5F, -8.0995F, 7.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon54_r1 = hexadecagon46.addOrReplaceChild("hexadecagon54_r1",
				CubeListBuilder.create().texOffs(184, 239).addBox(-0.5F, -0.0995F, -0.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)).texOffs(184, 239).addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon52_r1 = hexadecagon46.addOrReplaceChild("hexadecagon52_r1",
				CubeListBuilder.create().texOffs(184, 239).addBox(-0.5F, -0.0995F, -0.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)).texOffs(184, 239).addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon51_r1 = hexadecagon46.addOrReplaceChild("hexadecagon51_r1", CubeListBuilder.create().texOffs(184, 239).addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon47_r1 = hexadecagon46.addOrReplaceChild("hexadecagon47_r1", CubeListBuilder.create().texOffs(184, 239).addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon55 = pupilla.addOrReplaceChild("hexadecagon55", CubeListBuilder.create().texOffs(184, 239).mirror().addBox(7.9005F, -8.5F, 7.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(184, 239)
				.mirror().addBox(7.5F, -8.0995F, 7.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon63_r1 = hexadecagon55.addOrReplaceChild("hexadecagon63_r1", CubeListBuilder.create().texOffs(184, 239).mirror().addBox(-0.5F, -0.0995F, -0.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(184, 239).mirror().addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon61_r1 = hexadecagon55.addOrReplaceChild("hexadecagon61_r1", CubeListBuilder.create().texOffs(184, 239).mirror().addBox(-0.5F, -0.0995F, -0.5F, 1.0F, 0.1989F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(184, 239).mirror().addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon60_r1 = hexadecagon55.addOrReplaceChild("hexadecagon60_r1", CubeListBuilder.create().texOffs(184, 239).mirror().addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon56_r1 = hexadecagon55.addOrReplaceChild("hexadecagon56_r1", CubeListBuilder.create().texOffs(184, 239).mirror().addBox(-0.0995F, -0.5F, -0.5F, 0.1989F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition occhi = tutto.addOrReplaceChild("occhi", CubeListBuilder.create(), PartPose.offset(0.0F, 6.7F, -17.3F));
		PartDefinition hexadecagon64 = occhi.addOrReplaceChild("hexadecagon64",
				CubeListBuilder.create().texOffs(39, 94).addBox(-8.4973F, -10.5F, 7.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(151, 254).addBox(-10.5F, -8.4973F, 7.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition hexadecagon72_r1 = hexadecagon64.addOrReplaceChild("hexadecagon72_r1",
				CubeListBuilder.create().texOffs(151, 254).addBox(-2.5F, -0.4973F, -0.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 94).addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon70_r1 = hexadecagon64.addOrReplaceChild("hexadecagon70_r1",
				CubeListBuilder.create().texOffs(151, 254).addBox(-2.5F, -0.4973F, -0.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 94).addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon69_r1 = hexadecagon64.addOrReplaceChild("hexadecagon69_r1", CubeListBuilder.create().texOffs(39, 94).addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon65_r1 = hexadecagon64.addOrReplaceChild("hexadecagon65_r1", CubeListBuilder.create().texOffs(39, 94).addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon73 = occhi.addOrReplaceChild("hexadecagon73", CubeListBuilder.create().texOffs(39, 94).mirror().addBox(7.5027F, -10.5F, 7.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(151, 254).mirror()
				.addBox(5.5F, -8.4973F, 7.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition hexadecagon81_r1 = hexadecagon73.addOrReplaceChild("hexadecagon81_r1", CubeListBuilder.create().texOffs(151, 254).mirror().addBox(-2.5F, -0.4973F, -0.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 94).mirror().addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon79_r1 = hexadecagon73.addOrReplaceChild("hexadecagon79_r1", CubeListBuilder.create().texOffs(151, 254).mirror().addBox(-2.5F, -0.4973F, -0.5F, 5.0F, 0.9946F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 94).mirror().addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon78_r1 = hexadecagon73.addOrReplaceChild("hexadecagon78_r1", CubeListBuilder.create().texOffs(39, 94).mirror().addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon74_r1 = hexadecagon73.addOrReplaceChild("hexadecagon74_r1", CubeListBuilder.create().texOffs(39, 94).mirror().addBox(-0.4973F, -2.5F, -0.5F, 0.9946F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition denti = tutto.addOrReplaceChild("denti", CubeListBuilder.create(), PartPose.offset(-1.6F, 2.3F, -7.0F));
		PartDefinition hexadecagon82 = denti.addOrReplaceChild("hexadecagon82",
				CubeListBuilder.create().texOffs(226, 166).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 152).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition hexadecagon90_r1 = hexadecagon82.addOrReplaceChild("hexadecagon90_r1",
				CubeListBuilder.create().texOffs(226, 153).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 169).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon88_r1 = hexadecagon82.addOrReplaceChild("hexadecagon88_r1",
				CubeListBuilder.create().texOffs(226, 151).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 163).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon87_r1 = hexadecagon82.addOrReplaceChild("hexadecagon87_r1", CubeListBuilder.create().texOffs(226, 172).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon83_r1 = hexadecagon82.addOrReplaceChild("hexadecagon83_r1", CubeListBuilder.create().texOffs(226, 160).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon91 = denti.addOrReplaceChild("hexadecagon91",
				CubeListBuilder.create().texOffs(226, 181).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 155).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.4F, -0.3F, 0.1309F, 0.0F, 0.0F));
		PartDefinition hexadecagon99_r1 = hexadecagon91.addOrReplaceChild("hexadecagon99_r1",
				CubeListBuilder.create().texOffs(226, 156).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 184).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon97_r1 = hexadecagon91.addOrReplaceChild("hexadecagon97_r1",
				CubeListBuilder.create().texOffs(226, 154).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 178).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon96_r1 = hexadecagon91.addOrReplaceChild("hexadecagon96_r1", CubeListBuilder.create().texOffs(226, 187).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon92_r1 = hexadecagon91.addOrReplaceChild("hexadecagon92_r1", CubeListBuilder.create().texOffs(226, 175).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon100 = denti.addOrReplaceChild("hexadecagon100",
				CubeListBuilder.create().texOffs(4, 228).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 158).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2F, 0.0F, -0.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition hexadecagon108_r1 = hexadecagon100.addOrReplaceChild("hexadecagon108_r1",
				CubeListBuilder.create().texOffs(226, 159).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 228).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon106_r1 = hexadecagon100.addOrReplaceChild("hexadecagon106_r1",
				CubeListBuilder.create().texOffs(226, 157).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 228).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon105_r1 = hexadecagon100.addOrReplaceChild("hexadecagon105_r1", CubeListBuilder.create().texOffs(8, 228).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon101_r1 = hexadecagon100.addOrReplaceChild("hexadecagon101_r1", CubeListBuilder.create().texOffs(0, 228).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition naso = tutto.addOrReplaceChild("naso",
				CubeListBuilder.create().texOffs(226, 46).addBox(-0.6962F, -3.5F, -1.0F, 1.3924F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 22).addBox(-3.5F, -0.6962F, -1.0F, 7.0F, 1.3924F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.5F, -7.5F));
		PartDefinition hexadecagon116_r1 = naso.addOrReplaceChild("hexadecagon116_r1",
				CubeListBuilder.create().texOffs(226, 25).addBox(-3.5F, -0.6962F, -0.5F, 7.0F, 1.3924F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 55).addBox(-0.6962F, -3.5F, -0.5F, 1.3924F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon114_r1 = naso.addOrReplaceChild("hexadecagon114_r1",
				CubeListBuilder.create().texOffs(226, 19).addBox(-3.5F, -0.6962F, -0.5F, 7.0F, 1.3924F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 37).addBox(-0.6962F, -3.5F, -0.5F, 1.3924F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon113_r1 = naso.addOrReplaceChild("hexadecagon113_r1", CubeListBuilder.create().texOffs(226, 64).addBox(-0.6962F, -3.5F, -0.5F, 1.3924F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon109_r1 = naso.addOrReplaceChild("hexadecagon109_r1", CubeListBuilder.create().texOffs(226, 28).addBox(-0.6962F, -3.5F, -0.5F, 1.3924F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon117 = naso.addOrReplaceChild("hexadecagon117",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.1989F, -9.0F, 7.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, -8.1989F, 7.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5F, 8.1F, -8.6F));
		PartDefinition hexadecagon125_r1 = hexadecagon117.addOrReplaceChild("hexadecagon125_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon123_r1 = hexadecagon117.addOrReplaceChild("hexadecagon123_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon122_r1 = hexadecagon117.addOrReplaceChild("hexadecagon122_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon118_r1 = hexadecagon117.addOrReplaceChild("hexadecagon118_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon126 = naso.addOrReplaceChild("hexadecagon126", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(7.8011F, -9.0F, 7.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(7.0F, -8.1989F, 7.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.5F, 8.1F, -8.6F));
		PartDefinition hexadecagon134_r1 = hexadecagon126.addOrReplaceChild("hexadecagon134_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon132_r1 = hexadecagon126.addOrReplaceChild("hexadecagon132_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.1989F, -0.5F, 2.0F, 0.3978F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon131_r1 = hexadecagon126.addOrReplaceChild("hexadecagon131_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon127_r1 = hexadecagon126.addOrReplaceChild("hexadecagon127_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1989F, -1.0F, -0.5F, 0.3978F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition orecchie = tutto.addOrReplaceChild("orecchie", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2F, -7.0F));
		PartDefinition hexadecagon135 = orecchie.addOrReplaceChild("hexadecagon135",
				CubeListBuilder.create().texOffs(226, 133).addBox(7.6022F, -10.0F, 6.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 85).addBox(6.0F, -8.3978F, 6.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.4F, 0.0F, 0.0F));
		PartDefinition hexadecagon143_r1 = hexadecagon135.addOrReplaceChild("hexadecagon143_r1",
				CubeListBuilder.create().texOffs(226, 88).addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 139).addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon141_r1 = hexadecagon135.addOrReplaceChild("hexadecagon141_r1",
				CubeListBuilder.create().texOffs(226, 82).addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 127).addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon140_r1 = hexadecagon135.addOrReplaceChild("hexadecagon140_r1", CubeListBuilder.create().texOffs(226, 145).addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition hexadecagon136_r1 = hexadecagon135.addOrReplaceChild("hexadecagon136_r1", CubeListBuilder.create().texOffs(226, 121).addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon144 = orecchie.addOrReplaceChild("hexadecagon144", CubeListBuilder.create().texOffs(226, 133).mirror().addBox(-8.3978F, -10.0F, 6.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(226, 85)
				.mirror().addBox(-10.0F, -8.3978F, 6.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(11.4F, 0.0F, 0.0F));
		PartDefinition hexadecagon152_r1 = hexadecagon144.addOrReplaceChild("hexadecagon152_r1", CubeListBuilder.create().texOffs(226, 88).mirror().addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(226, 139).mirror().addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition hexadecagon150_r1 = hexadecagon144.addOrReplaceChild("hexadecagon150_r1", CubeListBuilder.create().texOffs(226, 82).mirror().addBox(-2.0F, -0.3978F, -1.5F, 4.0F, 0.7956F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(226, 127).mirror().addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition hexadecagon149_r1 = hexadecagon144.addOrReplaceChild("hexadecagon149_r1", CubeListBuilder.create().texOffs(226, 145).mirror().addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition hexadecagon145_r1 = hexadecagon144.addOrReplaceChild("hexadecagon145_r1", CubeListBuilder.create().texOffs(226, 121).mirror().addBox(-0.3978F, -2.0F, -1.5F, 0.7956F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tutto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
