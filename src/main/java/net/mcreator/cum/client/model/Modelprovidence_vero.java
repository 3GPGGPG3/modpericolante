package net.mcreator.cum.client.model;

import org.checkerframework.checker.units.qual.h;
import org.checkerframework.checker.units.qual.g;

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
public class Modelprovidence_vero<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelprovidence_vero"), "main");
	public final ModelPart tutto;
	public final ModelPart all;
	public final ModelPart primary_wings;
	public final ModelPart c;
	public final ModelPart b;
	public final ModelPart d;
	public final ModelPart e;
	public final ModelPart a;
	public final ModelPart secondary_wings;
	public final ModelPart j;
	public final ModelPart g;
	public final ModelPart f;
	public final ModelPart h;
	public final ModelPart i;

	public Modelprovidence_vero(ModelPart root) {
		this.tutto = root.getChild("tutto");
		this.all = this.tutto.getChild("all");
		this.primary_wings = this.all.getChild("primary_wings");
		this.c = this.primary_wings.getChild("c");
		this.b = this.primary_wings.getChild("b");
		this.d = this.primary_wings.getChild("d");
		this.e = this.primary_wings.getChild("e");
		this.a = this.primary_wings.getChild("a");
		this.secondary_wings = this.all.getChild("secondary_wings");
		this.j = this.secondary_wings.getChild("j");
		this.g = this.secondary_wings.getChild("g");
		this.f = this.secondary_wings.getChild("f");
		this.h = this.secondary_wings.getChild("h");
		this.i = this.secondary_wings.getChild("i");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tutto = partdefinition.addOrReplaceChild("tutto", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, -1.0F));
		PartDefinition all = tutto.addOrReplaceChild("all", CubeListBuilder.create().texOffs(64, 32).addBox(-10.0F, -23.0F, 1.0F, 20.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition primary_wings = all.addOrReplaceChild("primary_wings", CubeListBuilder.create(), PartPose.offset(-4.0F, -16.0F, 4.0F));
		PartDefinition c = primary_wings.addOrReplaceChild("c", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 1.0F));
		PartDefinition cube_r1 = c.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 52).addBox(-8.0F, -18.0F, 1.0F, 16.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -2.0F, -1.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition b = primary_wings.addOrReplaceChild("b", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 1.0F));
		PartDefinition cube_r2 = b.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 70).addBox(-8.0F, -18.0F, 1.0F, 16.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition d = primary_wings.addOrReplaceChild("d", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 1.0F));
		PartDefinition cube_r3 = d.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 68).addBox(-8.0F, -18.0F, 1.0F, 16.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, -1.0F, 0.0F, 0.0F, -1.9635F));
		PartDefinition e = primary_wings.addOrReplaceChild("e", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 1.0F));
		PartDefinition cube_r4 = e.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 86).addBox(-8.0F, -28.0F, 1.0F, 16.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition a = primary_wings.addOrReplaceChild("a", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 1.0F));
		PartDefinition cube_r5 = a.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 68).addBox(-8.0F, -18.0F, 1.0F, 16.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 4.0F, -1.0F, 0.0F, 0.0F, 1.9635F));
		PartDefinition secondary_wings = all.addOrReplaceChild("secondary_wings", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 8.0F));
		PartDefinition j = secondary_wings.addOrReplaceChild("j", CubeListBuilder.create(), PartPose.offset(-0.0224F, -5.5F, 1.0F));
		PartDefinition cube_r6 = j.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 0).addBox(-8.0F, -34.0F, 1.0F, 16.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0224F, 5.5F, -1.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition g = secondary_wings.addOrReplaceChild("g", CubeListBuilder.create().texOffs(64, 0).addBox(-7.9776F, -23.5F, 0.0F, 16.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 86)
				.addBox(-14.9776F, -31.5F, 0.0F, 14.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 88).addBox(1.0224F, -31.5F, 0.0F, 14.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0224F, -5.5F, 1.0F));
		PartDefinition f = secondary_wings.addOrReplaceChild("f", CubeListBuilder.create(), PartPose.offset(-0.0224F, -5.5F, 1.0F));
		PartDefinition cube_r7 = f.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 34).addBox(-8.0F, -34.0F, 1.0F, 16.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0224F, 5.5F, -1.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition h = secondary_wings.addOrReplaceChild("h", CubeListBuilder.create(), PartPose.offset(-0.0224F, -5.5F, 1.0F));
		PartDefinition cube_r8 = h.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -34.0F, 1.0F, 16.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9776F, 1.5F, -1.0F, 0.0F, 0.0F, 2.5307F));
		PartDefinition i = secondary_wings.addOrReplaceChild("i", CubeListBuilder.create(), PartPose.offset(-0.0224F, -5.5F, 1.0F));
		PartDefinition cube_r9 = i.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 34).addBox(-8.0F, -34.0F, 1.0F, 16.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0224F, 1.5F, -1.0F, 0.0F, 0.0F, -2.5307F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tutto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.all.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tutto.yRot = headPitch / (180F / (float) Math.PI);
	}
}
