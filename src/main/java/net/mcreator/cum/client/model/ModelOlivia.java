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

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelOlivia<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "model_olivia"), "main");
	public final ModelPart main;
	public final ModelPart cazzo;
	public final ModelPart figa;
	public final ModelPart gambasx;
	public final ModelPart gambadx;
	public final ModelPart bracciodx;
	public final ModelPart bracciosx;
	public final ModelPart corpo;
	public final ModelPart reggiseno;
	public final ModelPart seno;
	public final ModelPart testa;
	public final ModelPart capelli;

	public ModelOlivia(ModelPart root) {
		this.main = root.getChild("main");
		this.cazzo = this.main.getChild("cazzo");
		this.figa = this.main.getChild("figa");
		this.gambasx = this.main.getChild("gambasx");
		this.gambadx = this.main.getChild("gambadx");
		this.bracciodx = this.main.getChild("bracciodx");
		this.bracciosx = this.main.getChild("bracciosx");
		this.corpo = this.main.getChild("corpo");
		this.reggiseno = this.corpo.getChild("reggiseno");
		this.seno = this.corpo.getChild("seno");
		this.testa = this.main.getChild("testa");
		this.capelli = this.testa.getChild("capelli");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cazzo = main.addOrReplaceChild("cazzo", CubeListBuilder.create().texOffs(57, 50).addBox(-0.5F, -5.3F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 59)
				.addBox(-2.25F, -0.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 58).addBox(0.25F, -0.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, -8.45F, -0.5F));
		PartDefinition figa = main.addOrReplaceChild("figa", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0092F, -11.6656F, -0.3733F, -0.2618F, 0.5672F, -1.5708F));
		PartDefinition cube_r1 = figa.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6861F, 1.0915F, 0.089F, 0.4799F, 0.3475F, -0.094F));
		PartDefinition cube_r2 = figa.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 56).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0361F, 0.5915F, 1.239F, 1.3759F, 0.9379F, 1.1053F));
		PartDefinition cube_r3 = figa.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 28).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0361F, -0.3085F, 0.639F, 0.5234F, 1.4166F, 0.6456F));
		PartDefinition cube_r4 = figa.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5361F, 0.0915F, -0.361F, 0.1239F, 0.3736F, 0.3289F));
		PartDefinition gambasx = main.addOrReplaceChild("gambasx", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -11.0F, 0.0F));
		PartDefinition gambadx = main.addOrReplaceChild("gambadx", CubeListBuilder.create().texOffs(24, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -11.0F, 0.0F));
		PartDefinition bracciodx = main.addOrReplaceChild("bracciodx", CubeListBuilder.create().texOffs(16, 32).addBox(0.0F, -0.9202F, -2.1709F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -23.0F, 0.0F));
		PartDefinition bracciosx = main.addOrReplaceChild("bracciosx", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -23.0F, 0.0F));
		PartDefinition corpo = main.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(0, 16).addBox(-2.9167F, -5.4444F, 0.0556F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0833F, -18.5556F, -2.0556F));
		PartDefinition reggiseno = corpo.addOrReplaceChild("reggiseno", CubeListBuilder.create().texOffs(40, 20).addBox(-4.0F, -3.8333F, -0.8333F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
				.addBox(1.0F, -3.8333F, -0.8333F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52).addBox(-4.0F, -0.8333F, 0.1667F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0833F, 0.3889F, -1.1111F));
		PartDefinition seno = corpo.addOrReplaceChild("seno",
				CubeListBuilder.create().texOffs(23, 56).addBox(4.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 49).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9167F, -1.4444F, -0.9444F));
		PartDefinition testa = main.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -3.5F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4743F, -28.5114F, 0.3462F));
		PartDefinition capelli = testa.addOrReplaceChild("capelli", CubeListBuilder.create(), PartPose.offset(-7.5F, 1.5F, 1.0F));
		PartDefinition cube_r5 = capelli.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 39).addBox(0.0F, -4.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(12.0F, -4.0F, 0.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
