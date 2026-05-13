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

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmiraldi<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelmiraldi"), "main");
	public final ModelPart all;
	public final ModelPart gamba_sx;
	public final ModelPart gamba_dx;
	public final ModelPart corpo;
	public final ModelPart testa;
	public final ModelPart s_dx;
	public final ModelPart s_sx;
	public final ModelPart braccio_sx;
	public final ModelPart b_sx_2;
	public final ModelPart braccio_dx;
	public final ModelPart b_dx_2;

	public Modelmiraldi(ModelPart root) {
		this.all = root.getChild("all");
		this.gamba_sx = this.all.getChild("gamba_sx");
		this.gamba_dx = this.all.getChild("gamba_dx");
		this.corpo = this.all.getChild("corpo");
		this.testa = this.corpo.getChild("testa");
		this.s_dx = this.testa.getChild("s_dx");
		this.s_sx = this.testa.getChild("s_sx");
		this.braccio_sx = this.corpo.getChild("braccio_sx");
		this.b_sx_2 = this.braccio_sx.getChild("b_sx_2");
		this.braccio_dx = this.corpo.getChild("braccio_dx");
		this.b_dx_2 = this.braccio_dx.getChild("b_dx_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(-2.0F, 24.0F, -0.4F));
		PartDefinition gamba_sx = all.addOrReplaceChild("gamba_sx", CubeListBuilder.create().texOffs(29, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -5.0F, 0.5F));
		PartDefinition gamba_dx = all.addOrReplaceChild("gamba_dx", CubeListBuilder.create().texOffs(18, 23).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, -5.0F, 0.5F));
		PartDefinition corpo = all.addOrReplaceChild("corpo",
				CubeListBuilder.create().texOffs(2, 0).addBox(-3.5F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 12).addBox(-3.1F, -11.0F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -5.0F, 0.4F));
		PartDefinition testa = corpo.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 22).addBox(-2.1F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -11.0F, 0.0F));
		PartDefinition cube_r1 = testa.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(25, 62).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 62).addBox(-1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -2.1F, -1.6F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = testa.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -2.3F, -1.4F, -0.7854F, 0.0F, 0.0F));
		PartDefinition s_dx = testa.addOrReplaceChild("s_dx", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.7F, -2.0F));
		PartDefinition cube_r3 = s_dx.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 12).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 0.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		PartDefinition s_sx = testa.addOrReplaceChild("s_sx", CubeListBuilder.create(), PartPose.offset(0.8F, -2.7F, -2.0F));
		PartDefinition cube_r4 = s_sx.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		PartDefinition braccio_sx = corpo.addOrReplaceChild("braccio_sx", CubeListBuilder.create(), PartPose.offset(2.8895F, -10.9979F, 0.0F));
		PartDefinition cube_r5 = braccio_sx.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, 31).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.0F, -0.1F, 0.0F, 0.0F, -0.3927F));
		PartDefinition b_sx_2 = braccio_sx.addOrReplaceChild("b_sx_2", CubeListBuilder.create().texOffs(45, 10).addBox(0.3105F, 3.3979F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 3.6F, 0.0F));
		PartDefinition cube_r6 = b_sx_2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 31).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.4F, -0.1F, 0.0F, 0.0F, -0.3927F));
		PartDefinition braccio_dx = corpo.addOrReplaceChild("braccio_dx", CubeListBuilder.create(), PartPose.offset(-3.0895F, -10.9979F, 0.0F));
		PartDefinition cube_r7 = braccio_dx.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 31).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.0F, -0.1F, 0.0F, 0.0F, 0.3927F));
		PartDefinition b_dx_2 = braccio_dx.addOrReplaceChild("b_dx_2", CubeListBuilder.create(), PartPose.offset(-1.5F, 3.6F, 0.0F));
		PartDefinition cube_r8 = b_dx_2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 31).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.4F, -0.1F, 0.0F, 0.0F, 0.3927F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
