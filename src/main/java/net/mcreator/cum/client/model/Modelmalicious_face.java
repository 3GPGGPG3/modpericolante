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
public class Modelmalicious_face<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelmalicious_face"), "main");
	public final ModelPart face;
	public final ModelPart bb_main;

	public Modelmalicious_face(ModelPart root) {
		this.face = root.getChild("face");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition face = partdefinition.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 56).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.4F, -23.1F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, -23.7F, -17.0F, -0.6545F, 0.0F, 1.309F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 28).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.4F, -23.7F, -17.0F, -0.6545F, 0.0F, -1.309F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 56).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, -23.2F, 15.4F, 0.5672F, 0.0F, 1.309F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, -28.0F, -1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.4F, -23.1F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 21).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.4F, -23.2F, 15.4F, 0.5672F, 0.0F, -1.309F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -28.0F, -1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 28).addBox(-1.0F, -26.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.0F, 0.0F, -22.0F, -0.2084F, -0.0651F, -0.2986F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 28).addBox(-1.0F, -26.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.0F, 0.0F, 22.0F, 0.2716F, 0.0651F, 0.2986F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 28).addBox(-1.0F, -26.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.0F, 0.0F, 22.0F, 0.2716F, -0.0651F, -0.2986F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 28).addBox(-1.0F, -26.0F, -1.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.0F, 0.0F, -22.0F, -0.2084F, 0.0651F, 0.2986F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		face.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
