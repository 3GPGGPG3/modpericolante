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

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgabriel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelgabriel"), "main");
	public final ModelPart gamba_dx;
	public final ModelPart coscia_sx2;
	public final ModelPart coscia_dx2;
	public final ModelPart coscia_dx1;
	public final ModelPart coscia_sx1;
	public final ModelPart gamba_sx;
	public final ModelPart bacino;
	public final ModelPart corpo;
	public final ModelPart mano_sx;
	public final ModelPart spalla_dx;
	public final ModelPart testa;
	public final ModelPart braccio_sx2;
	public final ModelPart spalla_sx;
	public final ModelPart braccio_sx1;
	public final ModelPart ali;
	public final ModelPart braccio_dx1;
	public final ModelPart braccio_dx2;
	public final ModelPart mano_dx;

	public Modelgabriel(ModelPart root) {
		this.gamba_dx = root.getChild("gamba_dx");
		this.coscia_sx2 = root.getChild("coscia_sx2");
		this.coscia_dx2 = root.getChild("coscia_dx2");
		this.coscia_dx1 = root.getChild("coscia_dx1");
		this.coscia_sx1 = root.getChild("coscia_sx1");
		this.gamba_sx = root.getChild("gamba_sx");
		this.bacino = root.getChild("bacino");
		this.corpo = root.getChild("corpo");
		this.mano_sx = root.getChild("mano_sx");
		this.spalla_dx = root.getChild("spalla_dx");
		this.testa = root.getChild("testa");
		this.braccio_sx2 = root.getChild("braccio_sx2");
		this.spalla_sx = root.getChild("spalla_sx");
		this.braccio_sx1 = root.getChild("braccio_sx1");
		this.ali = root.getChild("ali");
		this.braccio_dx1 = root.getChild("braccio_dx1");
		this.braccio_dx2 = root.getChild("braccio_dx2");
		this.mano_dx = root.getChild("mano_dx");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gamba_dx = partdefinition.addOrReplaceChild("gamba_dx",
				CubeListBuilder.create().texOffs(54, 23).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 51).addBox(-1.0F, -12.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 24.0F, 0.6F));
		PartDefinition cube_r1 = gamba_dx.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 53).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r2 = gamba_dx.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 51).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -4.0F, 0.3F, 0.0981F, -0.6594F, 0.0092F));
		PartDefinition cube_r3 = gamba_dx.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 51).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition coscia_sx2 = partdefinition.addOrReplaceChild("coscia_sx2",
				CubeListBuilder.create().texOffs(44, 25).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 44).addBox(-1.0F, -7.0F, 1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.05F, 12.0F, -0.95F));
		PartDefinition coscia_dx2 = partdefinition.addOrReplaceChild("coscia_dx2",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 18).addBox(-1.0F, -7.0F, 1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.05F, 12.0F, -0.95F));
		PartDefinition coscia_dx1 = partdefinition.addOrReplaceChild("coscia_dx1",
				CubeListBuilder.create().texOffs(6, 55).addBox(-3.0F, -8.0F, 3.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 29).addBox(-3.0F, -4.0F, 3.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 8.0F, -2.4F));
		PartDefinition cube_r4 = coscia_dx1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 24).addBox(0.0F, 3.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.0F, -6.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r5 = coscia_dx1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -2.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, 2.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r6 = coscia_dx1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 41).addBox(-2.0F, -4.0F, 1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.5F, 3.0F, -0.4887F, 1.5658F, -0.4788F));
		PartDefinition cube_r7 = coscia_dx1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 11).addBox(-2.0F, -5.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 5.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r8 = coscia_dx1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 45).addBox(-2.0F, -5.0F, 1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition coscia_sx1 = partdefinition.addOrReplaceChild("coscia_sx1", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, -2.4F));
		PartDefinition cube_r9 = coscia_sx1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 5).addBox(-1.0F, -5.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 5.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r10 = coscia_sx1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -4.0F, 1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.5F, 3.0F, -0.4887F, -1.5658F, 0.4788F));
		PartDefinition cube_r11 = coscia_sx1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 47).addBox(-1.0F, -5.0F, 1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition gamba_sx = partdefinition.addOrReplaceChild("gamba_sx",
				CubeListBuilder.create().texOffs(26, 53).addBox(0.0F, -12.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 24.0F, 0.6F));
		PartDefinition cube_r12 = gamba_sx.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 44).addBox(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, -4.0F, 0.3F, 0.0981F, 0.6594F, -0.0092F));
		PartDefinition cube_r13 = gamba_sx.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 35).addBox(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r14 = gamba_sx.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 28).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bacino = partdefinition.addOrReplaceChild("bacino",
				CubeListBuilder.create().texOffs(14, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 6).addBox(-3.0F, -3.0F, -0.2F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, -0.2F));
		PartDefinition cube_r15 = bacino.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 44).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 1.3F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r16 = bacino.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(56, 36).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 55).addBox(2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.3F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bacino.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(30, 18).addBox(-4.0F, -1.0F, -1.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.3F, 3.3F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bacino.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 22).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.2F, 0.1F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bacino.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 40).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 1.3F, 0.0F, 0.0F, -0.4363F));
		PartDefinition corpo = partdefinition.addOrReplaceChild("corpo",
				CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 30).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 49)
						.addBox(2.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(-3.0F, -7.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.6F));
		PartDefinition mano_sx = partdefinition.addOrReplaceChild("mano_sx", CubeListBuilder.create(), PartPose.offset(-0.4F, -1.2F, -0.8F));
		PartDefinition cube_r20 = mano_sx.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 33).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.178F, -1.0094F, -2.5503F));
		PartDefinition spalla_dx = partdefinition.addOrReplaceChild("spalla_dx", CubeListBuilder.create(), PartPose.offset(-10.0F, -0.5F, 0.6F));
		PartDefinition cube_r21 = spalla_dx.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 53).addBox(-3.0F, -8.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.7F, -1.0F, 0.0F, 1.5708F, 1.0472F));
		PartDefinition cube_r22 = spalla_dx.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 29).addBox(-3.0F, -8.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r23 = spalla_dx.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 0).addBox(-3.0F, -8.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.7F, -3.0F, 0.0F, 1.5708F, 1.0472F));
		PartDefinition cube_r24 = spalla_dx.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 39).addBox(-3.0F, -8.0F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition testa = partdefinition.addOrReplaceChild("testa",
				CubeListBuilder.create().texOffs(18, 39).addBox(-1.0F, -4.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 59).addBox(2.5F, -6.0F, 2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 21)
						.addBox(-1.5F, -7.0F, 2.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 4).addBox(-2.5F, -6.0F, 2.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 55)
						.addBox(-0.5F, -11.0F, 2.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 60).addBox(0.0F, -13.0F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -6.0F, 1.2F));
		PartDefinition braccio_sx2 = partdefinition.addOrReplaceChild("braccio_sx2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.5F, 0.2F));
		PartDefinition cube_r25 = braccio_sx2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, -6.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8891F, 0.2412F, -2.8942F));
		PartDefinition spalla_sx = partdefinition.addOrReplaceChild("spalla_sx", CubeListBuilder.create(), PartPose.offset(10.0F, -0.5F, 0.6F));
		PartDefinition cube_r26 = spalla_sx.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 7).addBox(2.0F, -8.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.7F, -1.0F, 0.0F, -1.5708F, -1.0472F));
		PartDefinition cube_r27 = spalla_sx.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 29).addBox(2.0F, -8.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r28 = spalla_sx.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(42, 53).addBox(2.0F, -8.0F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.7F, -3.0F, 0.0F, -1.5708F, -1.0472F));
		PartDefinition cube_r29 = spalla_sx.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 41).addBox(2.0F, -8.0F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition braccio_sx1 = partdefinition.addOrReplaceChild("braccio_sx1", CubeListBuilder.create(), PartPose.offset(6.0F, 0.5F, 3.1F));
		PartDefinition cube_r30 = braccio_sx1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 17).addBox(1.0F, -6.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.644F, 0.3958F, -2.9797F));
		PartDefinition ali = partdefinition.addOrReplaceChild("ali",
				CubeListBuilder.create().texOffs(0, 24).addBox(-8.0F, -4.0F, -1.0F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 39)
						.addBox(8.0F, -2.0F, -1.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-15.0F, -9.0F, -1.0F, 13.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 24)
						.addBox(11.0F, -4.0F, -1.0F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-19.0F, -11.0F, -1.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 48)
						.addBox(27.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 53).addBox(-5.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(14.0F, -9.0F, -1.0F, 13.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 51).addBox(16.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 55).addBox(13.0F, -7.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 60)
						.addBox(1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 10).addBox(12.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 12)
						.addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 60).addBox(10.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(-10.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 60).addBox(13.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 59)
						.addBox(-17.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(20.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(17.0F, -11.0F, -1.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-2.0F, -7.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -5.0F, 4.5F));
		PartDefinition cube_r31 = ali.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 3).addBox(-21.0F, -3.0F, -1.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.7F, 5.5F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r32 = ali.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(6.0F, -3.0F, -1.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.7F, 5.5F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition braccio_dx1 = partdefinition.addOrReplaceChild("braccio_dx1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r33 = braccio_dx1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, -6.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -23.5F, 3.1F, 2.5997F, -0.5474F, 3.0769F));
		PartDefinition braccio_dx2 = partdefinition.addOrReplaceChild("braccio_dx2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r34 = braccio_dx2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(28, 15).addBox(-6.0F, -6.0F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -23.5F, 0.1F, 2.6709F, -0.2412F, 2.8942F));
		PartDefinition mano_dx = partdefinition.addOrReplaceChild("mano_dx", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r35 = mano_dx.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 14).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, -28.3F, 0.9F, 1.9571F, 0.2054F, -2.5819F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gamba_dx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		coscia_sx2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		coscia_dx2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		coscia_dx1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		coscia_sx1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gamba_sx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bacino.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_sx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spalla_dx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccio_sx2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spalla_sx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccio_sx1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ali.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccio_dx1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccio_dx2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_dx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.testa.xRot = headPitch / (180F / (float) Math.PI);
	}
}
