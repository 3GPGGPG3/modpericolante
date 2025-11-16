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

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelordinamentogiuridico<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelordinamentogiuridico"), "main");
	public final ModelPart tutto;
	public final ModelPart corpo;
	public final ModelPart roteazione;
	public final ModelPart coso2;
	public final ModelPart coso1;
	public final ModelPart base;
	public final ModelPart gamba_dx;
	public final ModelPart gamba_sx;

	public Modelordinamentogiuridico(ModelPart root) {
		this.tutto = root.getChild("tutto");
		this.corpo = this.tutto.getChild("corpo");
		this.roteazione = this.corpo.getChild("roteazione");
		this.coso2 = this.roteazione.getChild("coso2");
		this.coso1 = this.roteazione.getChild("coso1");
		this.base = this.corpo.getChild("base");
		this.gamba_dx = this.base.getChild("gamba_dx");
		this.gamba_sx = this.base.getChild("gamba_sx");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tutto = partdefinition.addOrReplaceChild("tutto", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition corpo = tutto.addOrReplaceChild("corpo", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 0.0F));
		PartDefinition roteazione = corpo.addOrReplaceChild(
				"roteazione", CubeListBuilder.create().texOffs(0, 7).addBox(-6.0F, -5.1045F, -0.9431F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 3).addBox(-6.0F, -4.1045F, -0.9431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(16, 27).addBox(5.0F, -4.1045F, -0.9431F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-1.0F, -4.1045F, -0.9431F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.1045F, -0.0569F));
		PartDefinition coso2 = roteazione.addOrReplaceChild("coso2", CubeListBuilder.create().texOffs(8, 15).addBox(-1.9518F, 1.7182F, -1.9147F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.5482F, 1.1773F, -0.0284F));
		PartDefinition cube_r1 = coso2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0312F, -0.3035F, -0.8013F, -0.3422F, 0.9939F, -0.1029F));
		PartDefinition cube_r2 = coso2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 20).addBox(0.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4518F, -1.5818F, 0.5853F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r3 = coso2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9348F, -0.2035F, -0.7942F, -0.3422F, -0.9939F, 0.1029F));
		PartDefinition coso1 = roteazione.addOrReplaceChild("coso1", CubeListBuilder.create().texOffs(16, 10).addBox(-2.0482F, 1.7182F, -1.9147F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5482F, 1.1773F, -0.0284F));
		PartDefinition cube_r4 = coso1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 20).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9348F, -0.2035F, -0.7942F, -0.3422F, 0.9939F, -0.1029F));
		PartDefinition cube_r5 = coso1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 27).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0312F, -0.3035F, -0.8013F, -0.3422F, -0.9939F, 0.1029F));
		PartDefinition cube_r6 = coso1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4518F, -1.5818F, 0.5853F, 0.2618F, 0.0F, 0.0F));
		PartDefinition base = corpo.addOrReplaceChild("base", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
				.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition gamba_dx = base.addOrReplaceChild("gamba_dx", CubeListBuilder.create().texOffs(24, 22).addBox(-0.2F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition gamba_sx = base.addOrReplaceChild("gamba_sx", CubeListBuilder.create().texOffs(24, 15).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tutto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
