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
public class Modelrat_king<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cum", "modelrat_king"), "main");
	public final ModelPart topo1;
	public final ModelPart coda;
	public final ModelPart sottocoda;
	public final ModelPart sotto_s_coda;
	public final ModelPart testa;
	public final ModelPart zampa4;
	public final ModelPart zampa3;
	public final ModelPart zampa2;
	public final ModelPart zampa1;
	public final ModelPart topo2;
	public final ModelPart coda2;
	public final ModelPart sottocoda2;
	public final ModelPart sotto_s_coda2;
	public final ModelPart testa2;
	public final ModelPart zampa5;
	public final ModelPart zampa6;
	public final ModelPart zampa7;
	public final ModelPart zampa8;
	public final ModelPart topo3;
	public final ModelPart coda3;
	public final ModelPart sottocoda3;
	public final ModelPart sotto_s_coda3;
	public final ModelPart testa3;
	public final ModelPart zampa9;
	public final ModelPart zampa10;
	public final ModelPart zampa11;
	public final ModelPart zampa12;
	public final ModelPart topo4;
	public final ModelPart coda4;
	public final ModelPart sottocoda4;
	public final ModelPart sotto_s_coda4;
	public final ModelPart testa4;
	public final ModelPart zampa13;
	public final ModelPart zampa14;
	public final ModelPart zampa15;
	public final ModelPart zampa16;
	public final ModelPart topo5;
	public final ModelPart coda5;
	public final ModelPart sottocoda5;
	public final ModelPart sotto_s_coda5;
	public final ModelPart testa5;
	public final ModelPart zampa17;
	public final ModelPart zampa18;
	public final ModelPart zampa19;
	public final ModelPart zampa20;
	public final ModelPart topo6;
	public final ModelPart coda6;
	public final ModelPart sottocoda6;
	public final ModelPart sotto_s_coda6;
	public final ModelPart testa6;
	public final ModelPart zampa21;
	public final ModelPart zampa22;
	public final ModelPart zampa23;
	public final ModelPart zampa24;
	public final ModelPart topo7;
	public final ModelPart coda7;
	public final ModelPart sottocoda7;
	public final ModelPart sotto_s_coda7;
	public final ModelPart testa7;
	public final ModelPart zampa25;
	public final ModelPart zampa26;
	public final ModelPart zampa27;
	public final ModelPart zampa28;
	public final ModelPart topo8;
	public final ModelPart coda8;
	public final ModelPart sottocoda8;
	public final ModelPart sotto_s_coda8;
	public final ModelPart testa8;
	public final ModelPart zampa29;
	public final ModelPart zampa30;
	public final ModelPart zampa31;
	public final ModelPart zampa32;
	public final ModelPart topo9;
	public final ModelPart coda9;
	public final ModelPart sottocoda9;
	public final ModelPart sotto_s_coda9;
	public final ModelPart testa9;
	public final ModelPart zampa33;
	public final ModelPart zampa34;
	public final ModelPart zampa35;
	public final ModelPart zampa36;

	public Modelrat_king(ModelPart root) {
		this.topo1 = root.getChild("topo1");
		this.coda = this.topo1.getChild("coda");
		this.sottocoda = this.coda.getChild("sottocoda");
		this.sotto_s_coda = this.sottocoda.getChild("sotto_s_coda");
		this.testa = this.topo1.getChild("testa");
		this.zampa4 = this.topo1.getChild("zampa4");
		this.zampa3 = this.topo1.getChild("zampa3");
		this.zampa2 = this.topo1.getChild("zampa2");
		this.zampa1 = this.topo1.getChild("zampa1");
		this.topo2 = root.getChild("topo2");
		this.coda2 = this.topo2.getChild("coda2");
		this.sottocoda2 = this.coda2.getChild("sottocoda2");
		this.sotto_s_coda2 = this.sottocoda2.getChild("sotto_s_coda2");
		this.testa2 = this.topo2.getChild("testa2");
		this.zampa5 = this.topo2.getChild("zampa5");
		this.zampa6 = this.topo2.getChild("zampa6");
		this.zampa7 = this.topo2.getChild("zampa7");
		this.zampa8 = this.topo2.getChild("zampa8");
		this.topo3 = root.getChild("topo3");
		this.coda3 = this.topo3.getChild("coda3");
		this.sottocoda3 = this.coda3.getChild("sottocoda3");
		this.sotto_s_coda3 = this.sottocoda3.getChild("sotto_s_coda3");
		this.testa3 = this.topo3.getChild("testa3");
		this.zampa9 = this.topo3.getChild("zampa9");
		this.zampa10 = this.topo3.getChild("zampa10");
		this.zampa11 = this.topo3.getChild("zampa11");
		this.zampa12 = this.topo3.getChild("zampa12");
		this.topo4 = root.getChild("topo4");
		this.coda4 = this.topo4.getChild("coda4");
		this.sottocoda4 = this.coda4.getChild("sottocoda4");
		this.sotto_s_coda4 = this.sottocoda4.getChild("sotto_s_coda4");
		this.testa4 = this.topo4.getChild("testa4");
		this.zampa13 = this.topo4.getChild("zampa13");
		this.zampa14 = this.topo4.getChild("zampa14");
		this.zampa15 = this.topo4.getChild("zampa15");
		this.zampa16 = this.topo4.getChild("zampa16");
		this.topo5 = root.getChild("topo5");
		this.coda5 = this.topo5.getChild("coda5");
		this.sottocoda5 = this.coda5.getChild("sottocoda5");
		this.sotto_s_coda5 = this.sottocoda5.getChild("sotto_s_coda5");
		this.testa5 = this.topo5.getChild("testa5");
		this.zampa17 = this.topo5.getChild("zampa17");
		this.zampa18 = this.topo5.getChild("zampa18");
		this.zampa19 = this.topo5.getChild("zampa19");
		this.zampa20 = this.topo5.getChild("zampa20");
		this.topo6 = root.getChild("topo6");
		this.coda6 = this.topo6.getChild("coda6");
		this.sottocoda6 = this.coda6.getChild("sottocoda6");
		this.sotto_s_coda6 = this.sottocoda6.getChild("sotto_s_coda6");
		this.testa6 = this.topo6.getChild("testa6");
		this.zampa21 = this.topo6.getChild("zampa21");
		this.zampa22 = this.topo6.getChild("zampa22");
		this.zampa23 = this.topo6.getChild("zampa23");
		this.zampa24 = this.topo6.getChild("zampa24");
		this.topo7 = root.getChild("topo7");
		this.coda7 = this.topo7.getChild("coda7");
		this.sottocoda7 = this.coda7.getChild("sottocoda7");
		this.sotto_s_coda7 = this.sottocoda7.getChild("sotto_s_coda7");
		this.testa7 = this.topo7.getChild("testa7");
		this.zampa25 = this.topo7.getChild("zampa25");
		this.zampa26 = this.topo7.getChild("zampa26");
		this.zampa27 = this.topo7.getChild("zampa27");
		this.zampa28 = this.topo7.getChild("zampa28");
		this.topo8 = root.getChild("topo8");
		this.coda8 = this.topo8.getChild("coda8");
		this.sottocoda8 = this.coda8.getChild("sottocoda8");
		this.sotto_s_coda8 = this.sottocoda8.getChild("sotto_s_coda8");
		this.testa8 = this.topo8.getChild("testa8");
		this.zampa29 = this.topo8.getChild("zampa29");
		this.zampa30 = this.topo8.getChild("zampa30");
		this.zampa31 = this.topo8.getChild("zampa31");
		this.zampa32 = this.topo8.getChild("zampa32");
		this.topo9 = root.getChild("topo9");
		this.coda9 = this.topo9.getChild("coda9");
		this.sottocoda9 = this.coda9.getChild("sottocoda9");
		this.sotto_s_coda9 = this.sottocoda9.getChild("sotto_s_coda9");
		this.testa9 = this.topo9.getChild("testa9");
		this.zampa33 = this.topo9.getChild("zampa33");
		this.zampa34 = this.topo9.getChild("zampa34");
		this.zampa35 = this.topo9.getChild("zampa35");
		this.zampa36 = this.topo9.getChild("zampa36");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition topo1 = partdefinition.addOrReplaceChild("topo1", CubeListBuilder.create().texOffs(20, 10).addBox(-6.0297F, -1.3F, -2.021F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0297F, 23.0F, -3.779F));
		PartDefinition cube_r1 = topo1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 17).addBox(-0.9421F, 0.7143F, -12.5133F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5876F, -1.6079F, 3.6347F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = topo1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 10).addBox(-1.4421F, 0.0651F, -12.6279F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5876F, -1.6079F, 3.6347F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r3 = topo1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9421F, 0.9126F, -13.3884F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5876F, -1.6079F, 3.6347F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda = topo1.addOrReplaceChild("coda", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4 = coda.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 22).addBox(-0.977F, 0.4079F, -4.6992F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5876F, -1.6079F, 3.6347F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda = coda.addOrReplaceChild("sottocoda", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r5 = sottocoda.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 21).addBox(-1.274F, -0.4531F, -2.7811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6632F, -1.8079F, 2.9177F, 0.3491F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda = sottocoda.addOrReplaceChild("sotto_s_coda", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r6 = sotto_s_coda.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 21).addBox(-1.1919F, 1.1787F, 0.5168F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0324F, -1.8079F, 0.4596F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa = topo1.addOrReplaceChild("testa", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0978F, -3.3076F, -10.9938F, 0.6247F, 0.2097F, -0.2811F));
		PartDefinition cube_r7 = testa.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 14).addBox(3.2336F, -4.1797F, -14.0054F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7259F, 8.0997F, 10.5708F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r8 = testa.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 25).addBox(3.6379F, -1.9402F, -13.3115F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7259F, 8.0997F, 10.5708F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r9 = testa.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 17).addBox(2.294F, -7.9748F, -12.6206F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(2.694F, -7.062F, -13.6244F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7259F, 8.0997F, 10.5708F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa4 = topo1.addOrReplaceChild("zampa4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r10 = zampa4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 26).addBox(-2.6687F, 1.6666F, -13.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5888F, 0.9826F, 12.1557F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r11 = zampa4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 26).addBox(-2.0125F, 0.8664F, -12.6557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5888F, 0.9826F, 12.1557F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa3 = topo1.addOrReplaceChild("zampa3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r12 = zampa3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 6).addBox(-2.7679F, 1.6535F, -8.5057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0589F, 0.8216F, 7.1557F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r13 = zampa3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 26).addBox(-2.3478F, 1.2021F, -7.4409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0589F, 0.8216F, 7.1557F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa2 = topo1.addOrReplaceChild("zampa2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r14 = zampa2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 3).addBox(2.9412F, 1.7388F, -8.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7204F, -1.9864F, 7.0557F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r15 = zampa2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 22).addBox(1.3442F, 1.7874F, -7.6557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7204F, -1.9864F, 7.0557F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa1 = topo1.addOrReplaceChild("zampa1", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r16 = zampa1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 0).addBox(2.9412F, 1.7388F, -13.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2606F, -0.3919F, 12.1557F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r17 = zampa1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 14).addBox(1.9815F, 1.4965F, -12.6557F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2606F, -0.3919F, 12.1557F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo2 = partdefinition.addOrReplaceChild("topo2", CubeListBuilder.create().texOffs(20, 10).addBox(-5.5778F, -1.3F, -3.868F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3297F, 23.0F, -2.379F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r18 = topo2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 17).addBox(-2.3716F, 0.6259F, -11.842F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7062F, -1.6079F, 1.1106F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r19 = topo2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 10).addBox(-2.8716F, 0.0356F, -11.9515F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7062F, -1.6079F, 1.1106F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r20 = topo2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3716F, 0.8536F, -12.7139F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7062F, -1.6079F, 1.1106F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda2 = topo2.addOrReplaceChild("coda2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r21 = coda2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 22).addBox(-2.1825F, 0.4079F, -3.6752F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7062F, -1.6079F, 1.1106F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda2 = coda2.addOrReplaceChild("sottocoda2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r22 = sottocoda2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 21).addBox(-2.2834F, 1.2079F, -1.0776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3727F, -1.8079F, 0.0462F, 0.0F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda2 = sottocoda2.addOrReplaceChild("sotto_s_coda2", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r23 = sotto_s_coda2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 21).addBox(-1.851F, 0.9846F, 1.9415F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7419F, -1.8079F, -2.4119F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa2 = topo2.addOrReplaceChild("testa2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6459F, -1.6076F, -12.5407F, -0.5138F, 0.3678F, 0.3753F));
		PartDefinition cube_r24 = testa2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 14).addBox(10.6215F, 4.8528F, -4.8492F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0934F, -6.715F, 11.198F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r25 = testa2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 25).addBox(-3.436F, 9.159F, -6.4726F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0934F, -6.715F, 11.198F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r26 = testa2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 17).addBox(2.6615F, 6.8382F, -11.9541F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(3.0615F, 7.751F, -12.9579F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0934F, -6.715F, 11.198F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa5 = topo2.addOrReplaceChild("zampa5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r27 = zampa5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(8, 26).addBox(-4.0962F, 1.7414F, -13.0786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0961F, -0.1628F, 9.6316F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r28 = zampa5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 26).addBox(-3.3758F, 1.2963F, -11.9786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0961F, -0.1628F, 9.6316F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa6 = topo2.addOrReplaceChild("zampa6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r29 = zampa6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(26, 6).addBox(-4.1954F, 1.7283F, -7.8286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5178F, -0.2575F, 4.6316F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r30 = zampa6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 26).addBox(-3.6047F, 1.7408F, -6.646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5178F, -0.2575F, 4.6316F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa7 = topo2.addOrReplaceChild("zampa7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r31 = zampa7.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(26, 3).addBox(1.5131F, 1.6765F, -8.0786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8675F, -1.6597F, 4.5316F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r32 = zampa7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 22).addBox(0.1063F, 1.0727F, -6.9786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8675F, -1.6597F, 4.5316F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa8 = topo2.addOrReplaceChild("zampa8", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r33 = zampa8.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 0).addBox(1.5131F, 1.6765F, -13.0786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3792F, -0.3919F, 9.6316F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r34 = zampa8.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 14).addBox(0.6382F, 1.0076F, -11.9786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3792F, -0.3919F, 9.6316F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo3 = partdefinition.addOrReplaceChild("topo3", CubeListBuilder.create().texOffs(20, 10).addBox(-4.1789F, -1.3F, -5.3946F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9703F, 23.0F, -1.379F, 0.0F, 1.0036F, 0.0F));
		PartDefinition cube_r35 = topo3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 17).addBox(-2.8592F, 0.8122F, -13.257F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8197F, -1.6079F, 1.0112F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r36 = topo3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 10).addBox(-3.3592F, 0.0978F, -13.3773F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8197F, -1.6079F, 1.0112F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r37 = topo3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-3.8592F, 0.978F, -14.1357F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8197F, -1.6079F, 1.0112F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda3 = topo3.addOrReplaceChild("coda3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r38 = coda3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 22).addBox(-3.0229F, 0.4079F, -4.9276F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8197F, -1.6079F, 1.0112F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda3 = coda3.addOrReplaceChild("sottocoda3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r39 = sottocoda3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(22, 21).addBox(-3.3285F, -0.035F, -2.5482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5524F, -1.8079F, -0.4591F, 0.3491F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda3 = sottocoda3.addOrReplaceChild("sotto_s_coda3", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r40 = sotto_s_coda3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(12, 21).addBox(-3.1422F, 1.0712F, 1.1669F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0783F, -1.8079F, -2.9172F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa3 = topo3.addOrReplaceChild("testa3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0978F, -4.8076F, -11.7937F, 0.4531F, 0.272F, -0.5042F));
		PartDefinition cube_r41 = testa3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 14).addBox(4.118F, -2.2752F, -15.2396F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5377F, 7.3489F, 9.4896F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r42 = testa3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 25).addBox(2.5214F, -0.5231F, -14.9479F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5377F, 7.3489F, 9.4896F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r43 = testa3.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(0, 17).addBox(1.9566F, -7.0272F, -14.8388F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(2.3566F, -6.1143F, -15.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5377F, 7.3489F, 9.4896F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa9 = topo3.addOrReplaceChild("zampa9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r44 = zampa9.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(8, 26).addBox(-4.5831F, 1.7669F, -14.5058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4005F, -1.3112F, 9.5322F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r45 = zampa9.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(18, 26).addBox(-3.8408F, 1.4429F, -13.4058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4005F, -1.3112F, 9.5322F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa10 = topo3.addOrReplaceChild("zampa10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r46 = zampa10.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 6).addBox(-4.6824F, 1.7538F, -9.2558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0275F, -1.3395F, 4.5322F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r47 = zampa10.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(14, 26).addBox(-4.1767F, 1.9434F, -8.0268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0275F, -1.3395F, 4.5322F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa11 = topo3.addOrReplaceChild("zampa11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r48 = zampa11.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(26, 3).addBox(1.0259F, 1.6552F, -9.5058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0098F, -1.3321F, 4.4322F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r49 = zampa11.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(8, 22).addBox(-0.316F, 0.8289F, -8.4058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0098F, -1.3321F, 4.4322F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa12 = topo3.addOrReplaceChild("zampa12", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r50 = zampa12.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 0).addBox(1.0259F, 1.6552F, -14.5058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4928F, -0.3919F, 9.5322F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r51 = zampa12.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(20, 14).addBox(0.18F, 0.8408F, -13.4058F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4928F, -0.3919F, 9.5322F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo4 = partdefinition.addOrReplaceChild("topo4", CubeListBuilder.create().texOffs(20, 10).addBox(-0.3393F, -1.3F, -5.6462F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9703F, 23.0F, 1.121F, 0.0F, 2.0071F, 0.0F));
		PartDefinition cube_r52 = topo4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(12, 17).addBox(-0.8117F, 0.8317F, -13.4047F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9725F, -1.6079F, 0.9085F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r53 = topo4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 10).addBox(-1.3117F, 0.1043F, -13.5261F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9725F, -1.6079F, 0.9085F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r54 = topo4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8117F, 0.991F, -14.2841F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9725F, -1.6079F, 0.9085F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda4 = topo4.addOrReplaceChild("coda4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r55 = coda4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0837F, 0.4079F, -5.6014F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9725F, -1.6079F, 0.9085F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda4 = coda4.addOrReplaceChild("sottocoda4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r56 = sottocoda4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(22, 21).addBox(-1.5358F, 1.0413F, -2.6059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.175F, -1.8079F, -0.9472F, -0.2618F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda4 = sottocoda4.addOrReplaceChild("sotto_s_coda4", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r57 = sotto_s_coda4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(12, 21).addBox(-1.6703F, -0.4444F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8058F, -1.8079F, -3.4054F, -0.6915F, -0.4804F, -0.0128F));
		PartDefinition testa4 = topo4.addOrReplaceChild("testa4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5926F, -2.0076F, -14.119F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r58 = testa4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(24, 14).addBox(1.2335F, -1.5253F, -15.5097F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6202F, 8.4113F, 12.4593F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r59 = testa4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(22, 25).addBox(0.7757F, -2.9202F, -15.3504F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6202F, 8.4113F, 12.4593F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r60 = testa4.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(0, 17).addBox(-0.8117F, -8.1207F, -14.5291F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(-0.4117F, -7.2079F, -15.5329F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6202F, 8.4113F, 12.4593F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa13 = topo4.addOrReplaceChild("zampa13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r61 = zampa13.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(8, 26).addBox(-2.5385F, 1.6597F, -14.6548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8223F, -2.4022F, 9.4295F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r62 = zampa13.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(18, 26).addBox(-1.8881F, 0.8272F, -13.5548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8223F, -2.4022F, 9.4295F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa14 = topo4.addOrReplaceChild("zampa14", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r63 = zampa14.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 6).addBox(-2.6377F, 1.6466F, -9.4048F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4956F, -2.3675F, 4.4295F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r64 = zampa14.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 26).addBox(-2.3055F, 1.1625F, -8.3475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4956F, -2.3675F, 4.4295F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa15 = topo4.addOrReplaceChild("zampa15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r65 = zampa15.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(26, 3).addBox(3.0715F, 1.7445F, -9.6548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -1.0209F, 4.3295F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r66 = zampa15.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(8, 22).addBox(1.4572F, 1.8527F, -8.5548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -1.0209F, 4.3295F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa16 = topo4.addOrReplaceChild("zampa16", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r67 = zampa16.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(26, 0).addBox(3.0715F, 1.7445F, -14.6548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7006F, -0.3919F, 9.4295F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r68 = zampa16.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(20, 14).addBox(2.104F, 1.5411F, -13.5548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7006F, -0.3919F, 9.4295F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo5 = partdefinition.addOrReplaceChild("topo5", CubeListBuilder.create().texOffs(20, 10).addBox(1.6658F, -1.3F, -3.5517F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1703F, 23.0F, 3.121F, 0.0F, 2.7489F, 0.0F));
		PartDefinition cube_r69 = topo5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(12, 17).addBox(0.5581F, 0.8141F, -13.2713F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6077F, -1.6079F, 2.8684F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r70 = topo5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 10).addBox(0.0581F, 0.0984F, -13.3917F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6077F, -1.6079F, 2.8684F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r71 = topo5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4419F, 0.9793F, -14.15F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6077F, -1.6079F, 2.8684F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda5 = topo5.addOrReplaceChild("coda5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r72 = coda5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 22).addBox(0.2743F, 0.4079F, -5.826F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6077F, -1.6079F, 2.8684F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda5 = coda5.addOrReplaceChild("sottocoda5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r73 = sottocoda5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 21).addBox(-0.2374F, 1.2079F, -3.6223F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2194F, -1.8079F, 0.8287F, 0.0F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda5 = sottocoda5.addOrReplaceChild("sotto_s_coda5", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r74 = sotto_s_coda5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(12, 21).addBox(-0.5348F, 1.3873F, -1.0195F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8502F, -1.8079F, -1.6294F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa5 = topo5.addOrReplaceChild("testa5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1022F, -3.2076F, -10.9937F, 0.6037F, -0.0998F, 0.1434F));
		PartDefinition cube_r75 = testa5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(24, 14).addBox(0.8397F, -2.0546F, -15.4288F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0909F, 8.8593F, 10.4377F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r76 = testa5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(22, 25).addBox(1.081F, -3.4754F, -15.1496F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0909F, 8.8593F, 10.4377F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r77 = testa5.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(0, 17).addBox(-0.8272F, -8.6097F, -14.0791F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(-0.4272F, -7.6969F, -15.0829F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0909F, 8.8593F, 10.4377F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa17 = topo5.addOrReplaceChild("zampa17", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r78 = zampa17.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(8, 26).addBox(-1.1705F, 1.588F, -14.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3263F, -2.7889F, 11.3894F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r79 = zampa17.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(18, 26).addBox(-0.5816F, 0.4153F, -13.4202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3263F, -2.7889F, 11.3894F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa18 = topo5.addOrReplaceChild("zampa18", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r80 = zampa18.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 6).addBox(-1.2697F, 1.5749F, -9.2702F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0159F, -2.7318F, 6.3894F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r81 = zampa18.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0332F, 0.6374F, -8.3288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0159F, -2.7318F, 6.3894F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa19 = topo5.addOrReplaceChild("zampa19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r82 = zampa19.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(26, 3).addBox(4.44F, 1.8043F, -9.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6192F, -0.9106F, 6.2894F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r83 = zampa19.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(8, 22).addBox(2.6435F, 2.5376F, -8.4202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6192F, -0.9106F, 6.2894F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa20 = topo5.addOrReplaceChild("zampa20", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r84 = zampa20.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(26, 0).addBox(4.44F, 1.8043F, -14.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0654F, -0.3919F, 11.3894F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r85 = zampa20.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 14).addBox(3.3913F, 2.0096F, -13.4202F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0654F, -0.3919F, 11.3894F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo6 = partdefinition.addOrReplaceChild("topo6", CubeListBuilder.create().texOffs(20, 10).addBox(1.9095F, -1.3F, -1.3264F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5297F, 23.0F, 3.121F, 0.0F, -2.9671F, 0.0F));
		PartDefinition cube_r86 = topo6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(12, 17).addBox(-1.049F, 0.6616F, -12.113F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4585F, -1.6079F, 3.9255F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r87 = topo6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 10).addBox(-1.549F, 0.0475F, -12.2245F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4585F, -1.6079F, 3.9255F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r88 = topo6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 0).addBox(-2.049F, 0.8774F, -12.9862F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4585F, -1.6079F, 3.9255F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda6 = topo6.addOrReplaceChild("coda6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r89 = coda6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 22).addBox(-0.9756F, 0.4079F, -4.2816F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4585F, -1.6079F, 3.9255F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda6 = coda6.addOrReplaceChild("sottocoda6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r90 = sottocoda6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(22, 21).addBox(-1.2002F, -0.0582F, -2.9535F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2551F, -1.8079F, 1.4602F, 0.6545F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda6 = sottocoda6.addOrReplaceChild("sotto_s_coda6", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r91 = sotto_s_coda6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(12, 21).addBox(-1.014F, 1.1316F, 0.8917F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8859F, -1.8079F, -0.998F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa6 = topo6.addOrReplaceChild("testa6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3022F, -0.6076F, -11.2937F, 0.5831F, -0.2201F, -0.143F));
		PartDefinition cube_r92 = testa6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(24, 14).addBox(-1.2318F, 0.4003F, -13.8765F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.51F, 7.3336F, 12.1007F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r93 = testa6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(22, 25).addBox(-2.246F, -4.3038F, -14.1639F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.51F, 7.3336F, 12.1007F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r94 = testa6.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.0027F, -7.1389F, -13.3859F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(-3.6027F, -6.2261F, -14.3897F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.51F, 7.3336F, 12.1007F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa21 = topo6.addOrReplaceChild("zampa21", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r95 = zampa21.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(8, 26).addBox(-2.7754F, 1.6722F, -13.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7946F, -3.9156F, 12.4465F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r96 = zampa21.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(18, 26).addBox(-2.1143F, 0.8985F, -12.2519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7946F, -3.9156F, 12.4465F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa22 = topo6.addOrReplaceChild("zampa22", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r97 = zampa22.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(26, 6).addBox(-2.8746F, 1.6591F, -8.1019F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.532F, -3.7934F, 7.4465F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r98 = zampa22.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(14, 26).addBox(-2.4112F, 1.2384F, -7.0297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.532F, -3.7934F, 7.4465F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa23 = topo6.addOrReplaceChild("zampa23", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r99 = zampa23.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(26, 3).addBox(2.8345F, 1.7342F, -8.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2034F, -0.5892F, 7.3465F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r100 = zampa23.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(8, 22).addBox(1.2517F, 1.734F, -7.2519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2034F, -0.5892F, 7.3465F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa24 = topo6.addOrReplaceChild("zampa24", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r101 = zampa24.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(26, 0).addBox(2.8345F, 1.7342F, -13.3519F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7854F, -0.3919F, 12.4465F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r102 = zampa24.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 14).addBox(1.8811F, 1.46F, -12.2519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7854F, -0.3919F, 12.4465F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo7 = partdefinition.addOrReplaceChild("topo7", CubeListBuilder.create().texOffs(20, 10).addBox(1.0344F, -1.3F, 0.5502F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1297F, 23.0F, 1.021F, 0.0F, -2.4435F, 0.0F));
		PartDefinition cube_r103 = topo7.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 17).addBox(-2.8395F, 0.5819F, -11.5075F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3739F, -1.6079F, 5.1914F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r104 = topo7.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 10).addBox(-3.3395F, 0.0208F, -11.6144F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3739F, -1.6079F, 5.1914F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r105 = topo7.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 0).addBox(-3.8395F, 0.8242F, -12.3779F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3739F, -1.6079F, 5.1914F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda7 = topo7.addOrReplaceChild("coda7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r106 = coda7.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5471F, 0.4079F, -3.2283F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3739F, -1.6079F, 5.1914F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda7 = coda7.addOrReplaceChild("sottocoda7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r107 = sottocoda7.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(22, 21).addBox(-2.5649F, 0.2397F, -1.2599F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4228F, -1.8079F, 2.4979F, 0.3927F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda7 = sottocoda7.addOrReplaceChild("sotto_s_coda7", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r108 = sotto_s_coda7.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 21).addBox(-1.9922F, 0.9104F, 2.4958F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0536F, -1.8079F, 0.0398F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa7 = topo7.addOrReplaceChild("testa7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9663F, -1.6076F, -7.4226F, 0.6981F, 0.5388F, -0.1248F));
		PartDefinition cube_r109 = testa7.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(24, 14).addBox(4.0932F, -5.761F, -12.3202F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2734F, 7.5541F, 8.7305F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r110 = testa7.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(22, 25).addBox(5.0542F, -1.5864F, -11.3245F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2734F, 7.5541F, 8.7305F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r111 = testa7.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(0, 17).addBox(3.8415F, -7.5917F, -10.7396F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(4.2415F, -6.6789F, -11.7434F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2734F, 7.5541F, 8.7305F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa25 = topo7.addOrReplaceChild("zampa25", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r112 = zampa25.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(8, 26).addBox(-4.5634F, 1.7659F, -12.7412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5209F, -4.4729F, 13.7124F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r113 = zampa25.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(18, 26).addBox(-3.822F, 1.4369F, -11.6412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5209F, -4.4729F, 13.7124F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa26 = topo7.addOrReplaceChild("zampa26", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r114 = zampa26.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 6).addBox(-4.6627F, 1.7528F, -7.4912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2819F, -4.3185F, 8.7124F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r115 = zampa26.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 26).addBox(-4.0061F, 1.9158F, -6.2706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2819F, -4.3185F, 8.7124F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa27 = topo7.addOrReplaceChild("zampa27", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r116 = zampa27.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(26, 3).addBox(1.0457F, 1.6561F, -7.7412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.105F, -0.4302F, 8.6124F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r117 = zampa27.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(8, 22).addBox(-0.2989F, 0.8388F, -6.6412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.105F, -0.4302F, 8.6124F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa28 = topo7.addOrReplaceChild("zampa28", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r118 = zampa28.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(26, 0).addBox(1.0457F, 1.6561F, -12.7412F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7009F, -0.3919F, 13.7124F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r119 = zampa28.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 14).addBox(0.1986F, 0.8476F, -11.6412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7009F, -0.3919F, 13.7124F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo8 = partdefinition.addOrReplaceChild("topo8", CubeListBuilder.create().texOffs(20, 10).addBox(-0.9945F, -1.3F, 1.8427F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4297F, 23.0F, -1.479F, 0.0F, -1.8326F, 0.0F));
		PartDefinition cube_r120 = topo8.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 17).addBox(-3.851F, 0.6976F, -12.386F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3565F, -1.6079F, 7.37F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r121 = topo8.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 10).addBox(-4.351F, 0.0595F, -12.4996F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3565F, -1.6079F, 7.37F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r122 = topo8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 0).addBox(-4.851F, 0.9014F, -13.2605F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3565F, -1.6079F, 7.37F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda8 = topo8.addOrReplaceChild("coda8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r123 = coda8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 22).addBox(-3.7535F, 0.4079F, -3.8223F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3565F, -1.6079F, 7.37F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda8 = coda8.addOrReplaceChild("sottocoda8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r124 = sottocoda8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(22, 21).addBox(-3.856F, 1.2079F, -0.9497F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9011F, -1.8079F, 4.845F, 0.0F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda8 = sottocoda8.addOrReplaceChild("sotto_s_coda8", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r125 = sotto_s_coda8.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(12, 21).addBox(-3.3365F, 0.8989F, 2.4662F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5319F, -1.8079F, 2.3869F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa8 = topo8.addOrReplaceChild("testa8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9374F, -2.2076F, -6.53F, 0.8727F, 0.0F, 0.4363F));
		PartDefinition cube_r126 = testa8.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(24, 14).addBox(-3.2681F, -2.6332F, -14.2448F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4459F, 10.3402F, 9.3016F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r127 = testa8.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(22, 25).addBox(-0.2423F, -7.3625F, -13.8265F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4459F, 10.3402F, 9.3016F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r128 = testa8.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(0, 17).addBox(-3.8778F, -10.3175F, -11.5515F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(-3.4778F, -9.4046F, -12.5553F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4459F, 10.3402F, 9.3016F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa29 = topo8.addOrReplaceChild("zampa29", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r129 = zampa29.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(8, 26).addBox(-5.5736F, 1.8188F, -13.6273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7137F, -3.8535F, 15.891F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r130 = zampa29.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(18, 26).addBox(-4.7867F, 1.7411F, -12.5273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7137F, -3.8535F, 15.891F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa30 = topo8.addOrReplaceChild("zampa30", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r131 = zampa30.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(26, 6).addBox(-5.6728F, 1.8057F, -8.3773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4485F, -3.7349F, 10.891F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r132 = zampa30.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(14, 26).addBox(-5.0135F, 2.3124F, -7.0681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4485F, -3.7349F, 10.891F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa31 = topo8.addOrReplaceChild("zampa31", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r133 = zampa31.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(26, 3).addBox(0.0351F, 1.6119F, -8.6273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.103F, -0.6069F, 10.791F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r134 = zampa31.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(8, 22).addBox(-1.1749F, 0.333F, -7.5273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.103F, -0.6069F, 10.791F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa32 = topo8.addOrReplaceChild("zampa32", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r135 = zampa32.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(26, 0).addBox(0.0351F, 1.6119F, -13.6273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6835F, -0.3919F, 15.891F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r136 = zampa32.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(20, 14).addBox(-0.7519F, 0.5016F, -12.5273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6835F, -0.3919F, 15.891F, 0.0F, 0.0F, -0.3491F));
		PartDefinition topo9 = partdefinition.addOrReplaceChild("topo9", CubeListBuilder.create().texOffs(20, 10).addBox(-4.6009F, -1.3F, 1.0432F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8297F, 23.0F, -2.679F, 0.0F, -0.8727F, 0.0F));
		PartDefinition cube_r137 = topo9.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(12, 17).addBox(-1.2939F, 0.7913F, -13.0979F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.807F, -1.6079F, 7.2885F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r138 = topo9.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 10).addBox(-1.7939F, 0.0908F, -13.217F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.807F, -1.6079F, 7.2885F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r139 = topo9.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2939F, 0.964F, -13.9758F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.807F, -1.6079F, 7.2885F, -0.0873F, 0.0F, 0.0F));
		PartDefinition coda9 = topo9.addOrReplaceChild("coda9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r140 = coda9.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(0, 22).addBox(-1.4693F, 0.4079F, -5.1777F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.807F, -1.6079F, 7.2885F, 0.0F, -0.2618F, 0.0F));
		PartDefinition sottocoda9 = coda9.addOrReplaceChild("sottocoda9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3797F, 0.2F, 1.579F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r141 = sottocoda9.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(22, 21).addBox(-1.842F, 1.2079F, -2.6811F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.134F, -1.8079F, 6.0995F, 0.0F, -0.2182F, 0.0F));
		PartDefinition sotto_s_coda9 = sottocoda9.addOrReplaceChild("sotto_s_coda9", CubeListBuilder.create(), PartPose.offset(-0.6308F, 0.0F, 2.4581F));
		PartDefinition cube_r142 = sotto_s_coda9.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(12, 21).addBox(-1.8404F, 1.2006F, 0.2925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5032F, -1.8079F, 3.6414F, -0.1242F, -0.4804F, -0.0128F));
		PartDefinition testa9 = topo9.addOrReplaceChild("testa9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0978F, -0.3076F, -9.9938F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r143 = testa9.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(24, 14).addBox(1.2903F, -0.655F, -14.9767F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7091F, 7.515F, 15.617F, -0.6265F, 0.3614F, 0.5185F));
		PartDefinition cube_r144 = testa9.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(22, 25).addBox(-0.0913F, -2.4872F, -15.0255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7091F, 7.515F, 15.617F, -0.4895F, -0.2031F, -0.5239F));
		PartDefinition cube_r145 = testa9.addOrReplaceChild("cube_r145",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.2939F, -7.2196F, -14.5441F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(-0.8939F, -6.3068F, -15.5479F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7091F, 7.515F, 15.617F, -0.0873F, 0.0F, 0.0F));
		PartDefinition zampa33 = topo9.addOrReplaceChild("zampa33", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.729F, -1.4203F, -8.521F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r146 = zampa33.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(8, 26).addBox(-3.02F, 1.685F, -14.3453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1761F, -0.1014F, 15.8095F, 0.0F, 0.0F, -0.6021F));
		PartDefinition cube_r147 = zampa33.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(18, 26).addBox(-2.3479F, 0.9722F, -13.2453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1761F, -0.1014F, 15.8095F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa34 = topo9.addOrReplaceChild("zampa34", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, -1.1F, -3.521F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r148 = zampa34.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 6).addBox(-3.1192F, 1.6719F, -9.0953F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6004F, -0.1997F, 10.8095F, 0.0F, 0.0F, -0.5585F));
		PartDefinition cube_r149 = zampa34.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 26).addBox(-2.7224F, 1.3433F, -7.9987F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6004F, -0.1997F, 10.8095F, -0.0114F, -0.0865F, -0.2177F));
		PartDefinition zampa35 = topo9.addOrReplaceChild("zampa35", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3756F, -0.8187F, -3.421F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r150 = zampa35.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(26, 3).addBox(2.5898F, 1.7235F, -9.3453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9668F, -1.6772F, 10.7095F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r151 = zampa35.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(8, 22).addBox(1.0396F, 1.6116F, -8.2453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9668F, -1.6772F, 10.7095F, 0.0F, 0.0F, -0.3491F));
		PartDefinition zampa36 = topo9.addOrReplaceChild("zampa36", CubeListBuilder.create(), PartPose.offset(2.673F, -1.216F, -8.521F));
		PartDefinition cube_r152 = zampa36.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(26, 0).addBox(2.5898F, 1.7235F, -14.3453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.48F, -0.3919F, 15.8095F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r153 = zampa36.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 14).addBox(1.6509F, 1.3762F, -13.2453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.48F, -0.3919F, 15.8095F, 0.0F, 0.0F, -0.3491F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		topo1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		topo9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
