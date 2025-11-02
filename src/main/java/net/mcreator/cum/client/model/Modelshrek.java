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
public class Modelshrek<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelshrek"), "main");
	public final ModelPart gamba_dx;
	public final ModelPart gamba_sx;
	public final ModelPart corpo;
	public final ModelPart braccio_sx;
	public final ModelPart braccio_dx;
	public final ModelPart testa;

	public Modelshrek(ModelPart root) {
		this.gamba_dx = root.getChild("gamba_dx");
		this.gamba_sx = root.getChild("gamba_sx");
		this.corpo = root.getChild("corpo");
		this.braccio_sx = this.corpo.getChild("braccio_sx");
		this.braccio_dx = this.corpo.getChild("braccio_dx");
		this.testa = this.corpo.getChild("testa");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gamba_dx = partdefinition.addOrReplaceChild("gamba_dx",
				CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 27).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 20.0F, 1.0F));
		PartDefinition gamba_sx = partdefinition.addOrReplaceChild("gamba_sx",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 33).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 20.0F, 1.0F));
		PartDefinition corpo = partdefinition.addOrReplaceChild("corpo",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -28.0F, -4.0F, 16.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-7.0F, -13.0F, -3.0F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition braccio_sx = corpo.addOrReplaceChild("braccio_sx", CubeListBuilder.create().texOffs(46, 39).addBox(-2.0F, -7.5F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, -20.5F, 2.0F));
		PartDefinition braccio_dx = corpo.addOrReplaceChild("braccio_dx", CubeListBuilder.create().texOffs(30, 39).addBox(-2.0F, -7.5F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -20.5F, 2.0F));
		PartDefinition testa = corpo.addOrReplaceChild(
				"testa", CubeListBuilder.create().texOffs(0, 39).addBox(-4.0F, -3.3243F, -1.4167F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 54).addBox(-1.0F, -0.3243F, -3.4167F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(24, 54).addBox(-2.0F, 0.6757F, -2.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(1.0F, 0.6757F, -2.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -32.6757F, -0.5833F));
		PartDefinition cube_r1 = testa.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 17).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.2243F, 2.5833F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r2 = testa.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 15).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.2243F, 2.5833F, 0.0F, 0.0F, 0.3054F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gamba_dx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gamba_sx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.braccio_dx.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.braccio_sx.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.corpo.yRot = headPitch / (180F / (float) Math.PI);
		this.gamba_dx.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gamba_sx.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.testa.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}
