
package net.mcreator.cum.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.PenalizzatoOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class PenalizzatoMobEffect extends MobEffect {
	public PenalizzatoMobEffect() {
		super(MobEffectCategory.HARMFUL, -7929856);
		this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "5aee54f7-ba0e-3da5-8140-fd319177cc1c", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "23ac3b92-7579-35f1-aec5-de24544ca367", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "d4f4b312-b5cb-38ea-995f-ea2b9faed6fc", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ARMOR_TOUGHNESS, "7f58a560-eb68-3c0d-bfdb-1fa55a12f92a", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ARMOR, "05bf2106-63af-370b-8d24-b11438265afa", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "255be046-d749-3191-8aae-8cacd33c2e8c", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, "559eea84-7a88-3f89-840e-6c4aeee18585", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "f87bd87f-a679-31ee-843d-6eab056cf58f", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "56c9d0b8-13a0-3615-8851-b0b665cbbe32", -10, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "8224396e-0d3a-3fea-9da7-f40a4820531f", 0, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PenalizzatoOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
