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
public class Modelcharlie_chaplin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelcharlie_chaplin"), "main");
	public final ModelPart tutto;
	public final ModelPart gambasx;
	public final ModelPart gambadx;
	public final ModelPart bracciosx;
	public final ModelPart bracciodx;
	public final ModelPart bastone;
	public final ModelPart bombetta;
	public final ModelPart corpo;
	public final ModelPart testa;

	public Modelcharlie_chaplin(ModelPart root) {
		this.tutto = root.getChild("tutto");
		this.gambasx = this.tutto.getChild("gambasx");
		this.gambadx = this.tutto.getChild("gambadx");
		this.bracciosx = this.tutto.getChild("bracciosx");
		this.bracciodx = this.tutto.getChild("bracciodx");
		this.bastone = this.bracciodx.getChild("bastone");
		this.bombetta = this.tutto.getChild("bombetta");
		this.corpo = this.tutto.getChild("corpo");
		this.testa = this.tutto.getChild("testa");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tutto = partdefinition.addOrReplaceChild("tutto", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition gambasx = tutto.addOrReplaceChild("gambasx", CubeListBuilder.create(), PartPose.offset(0.1F, -12.0F, 1.0F));
		PartDefinition scarpasx_r1 = gambasx.addOrReplaceChild("scarpasx_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-2.2129F, -1.6754F, -7.9865F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7F, 12.0F, -0.2F, -0.1124F, -0.6807F, 0.0119F));
		PartDefinition cube_r1 = gambasx.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 25).addBox(-1.7775F, -1.0F, -1.3445F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, 5.6F, -2.2F, 0.0F, -0.6807F, 0.0F));
		PartDefinition cube_r2 = gambasx.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 50).addBox(-1.0003F, -1.0F, -2.9738F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, -0.6807F, 0.0F));
		PartDefinition gambadx = tutto.addOrReplaceChild("gambadx", CubeListBuilder.create(), PartPose.offset(-0.4F, -11.4F, 0.0F));
		PartDefinition scarpadx_r1 = gambadx.addOrReplaceChild("scarpadx_r1", CubeListBuilder.create().texOffs(40, 26).addBox(-0.9543F, -1.7086F, -7.6926F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1F, 11.4F, 0.0F, -0.1124F, 0.6807F, 0.0119F));
		PartDefinition cube_r3 = gambadx.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 54).addBox(-2.5546F, -1.5752F, -4.4749F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7F, 0.4F, 2.2F, -0.3054F, 0.6807F, 0.0F));
		PartDefinition cube_r4 = gambadx.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 61).addBox(-3.5543F, 5.5F, -2.7586F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5213F, -1.5F, -0.9973F, 0.0F, 0.6807F, 0.0F));
		PartDefinition bracciosx = tutto.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(52, 9).addBox(-0.5F, -1.9284F, 0.2981F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, -23.0716F, -1.2981F));
		PartDefinition bracciodx = tutto.addOrReplaceChild("bracciodx", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, -19.0937F, 0.7127F, 0.9163F, 0.0F, 0.0F));
		PartDefinition bracciodx_r1 = bracciodx.addOrReplaceChild("bracciodx_r1", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -0.4288F, 1.0642F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -5.9284F, 2.2981F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bastone = bracciodx.addOrReplaceChild("bastone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 5.0496F, -4.791F, -0.9512F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bastone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(64, 43).addBox(-1.0F, 2.0F, -16.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 35).addBox(-1.0F, -2.0F, -17.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9779F, -2.0109F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bastone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4133F, -16.2175F, 2.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9779F, -0.0109F, -0.9163F, 0.0F, 0.0F));
		PartDefinition bombetta = tutto.addOrReplaceChild("bombetta",
				CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 38).addBox(-4.0F, -5.0F, -3.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -34.0F, 0.0F));
		PartDefinition corpo = tutto.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(32, 50).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 1.0F));
		PartDefinition testa = tutto.addOrReplaceChild("testa",
				CubeListBuilder.create().texOffs(0, 38).addBox(-4.0F, -3.057F, -0.41F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 36).addBox(-1.0F, 0.743F, -1.01F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 36)
						.addBox(-2.0F, 3.443F, -0.61F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 65).addBox(-3.0F, -0.757F, -0.71F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(-1.5F, 1.743F, -1.01F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 9).addBox(1.0F, -0.757F, -0.71F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -29.943F, -2.59F));
		PartDefinition cube_r7 = testa.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 65).addBox(0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.657F, -1.01F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r8 = testa.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 13).addBox(1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, -0.457F, -1.01F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r9 = testa.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 11).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -0.457F, -1.01F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r10 = testa.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 48).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.657F, -1.01F, 0.0F, 0.0F, -0.2618F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tutto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
