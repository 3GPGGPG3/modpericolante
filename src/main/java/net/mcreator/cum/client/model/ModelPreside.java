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
public class ModelPreside<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "model_preside"), "main");
	public final ModelPart gambasinistra;
	public final ModelPart bracciosinistro;
	public final ModelPart testa;
	public final ModelPart busto;
	public final ModelPart bracciodestro;
	public final ModelPart gambadestra;

	public ModelPreside(ModelPart root) {
		this.gambasinistra = root.getChild("gambasinistra");
		this.bracciosinistro = root.getChild("bracciosinistro");
		this.testa = root.getChild("testa");
		this.busto = root.getChild("busto");
		this.bracciodestro = root.getChild("bracciodestro");
		this.gambadestra = root.getChild("gambadestra");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gambasinistra = partdefinition.addOrReplaceChild("gambasinistra", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 11.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 1.0F, 0.0F));
		PartDefinition bracciosinistro = partdefinition.addOrReplaceChild("bracciosinistro", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 1.0F, 0.0F));
		PartDefinition testa = partdefinition.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition busto = partdefinition.addOrReplaceChild("busto", CubeListBuilder.create().texOffs(0, 16).addBox(-7.0F, -12.0F, -1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.0F, 0.0F));
		PartDefinition bracciodestro = partdefinition.addOrReplaceChild("bracciodestro", CubeListBuilder.create().texOffs(16, 32).addBox(-8.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition gambadestra = partdefinition.addOrReplaceChild("gambadestra", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gambasinistra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bracciosinistro.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		busto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bracciodestro.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gambadestra.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bracciodestro.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.gambadestra.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gambasinistra.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bracciosinistro.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.testa.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.testa.xRot = headPitch / (180F / (float) Math.PI);
	}
}
