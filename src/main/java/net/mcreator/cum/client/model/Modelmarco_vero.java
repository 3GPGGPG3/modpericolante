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
public class Modelmarco_vero<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelmarco_vero"), "main");
	public final ModelPart gamba_dx;
	public final ModelPart ginocchiodx;
	public final ModelPart piededx;
	public final ModelPart gamba_sx;
	public final ModelPart ginocchio_sx;
	public final ModelPart piedesx;
	public final ModelPart corpo;
	public final ModelPart bracciodx;
	public final ModelPart gomitodx;
	public final ModelPart bracciosx;
	public final ModelPart gomitosx;
	public final ModelPart testa;

	public Modelmarco_vero(ModelPart root) {
		this.gamba_dx = root.getChild("gamba_dx");
		this.ginocchiodx = this.gamba_dx.getChild("ginocchiodx");
		this.piededx = this.ginocchiodx.getChild("piededx");
		this.gamba_sx = root.getChild("gamba_sx");
		this.ginocchio_sx = this.gamba_sx.getChild("ginocchio_sx");
		this.piedesx = this.ginocchio_sx.getChild("piedesx");
		this.corpo = root.getChild("corpo");
		this.bracciodx = this.corpo.getChild("bracciodx");
		this.gomitodx = this.bracciodx.getChild("gomitodx");
		this.bracciosx = this.corpo.getChild("bracciosx");
		this.gomitosx = this.bracciosx.getChild("gomitosx");
		this.testa = this.corpo.getChild("testa");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gamba_dx = partdefinition.addOrReplaceChild("gamba_dx", CubeListBuilder.create().texOffs(24, 16).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.5F, 0.0F));
		PartDefinition ginocchiodx = gamba_dx.addOrReplaceChild("ginocchiodx", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.5F, -2.0F));
		PartDefinition piededx = ginocchiodx.addOrReplaceChild("piededx", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 1.0F));
		PartDefinition gamba_sx = partdefinition.addOrReplaceChild("gamba_sx", CubeListBuilder.create().texOffs(24, 27).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.5F, 0.0F));
		PartDefinition ginocchio_sx = gamba_sx.addOrReplaceChild("ginocchio_sx", CubeListBuilder.create().texOffs(40, 21).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.5F, -2.0F));
		PartDefinition piedesx = ginocchio_sx.addOrReplaceChild("piedesx", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 1.0F));
		PartDefinition corpo = partdefinition.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -1.0F));
		PartDefinition bracciodx = corpo.addOrReplaceChild("bracciodx", CubeListBuilder.create().texOffs(16, 38).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -5.0F, 0.0F));
		PartDefinition gomitodx = bracciodx.addOrReplaceChild("gomitodx", CubeListBuilder.create().texOffs(32, 38).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 6.0F, 0.0F));
		PartDefinition bracciosx = corpo.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -5.0F, 0.0F));
		PartDefinition gomitosx = bracciosx.addOrReplaceChild("gomitosx", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 6.0F, 0.0F));
		PartDefinition testa = corpo.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 0.0F));
		PartDefinition cube_r1 = testa.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 62).addBox(-5.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.3F, -3.6F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = testa.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 62).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gamba_dx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gamba_sx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
