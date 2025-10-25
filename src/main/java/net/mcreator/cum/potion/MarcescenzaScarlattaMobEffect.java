
package net.mcreator.cum.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.MarcescenzaScarlattaActiveTickConditionProcedure;
import net.mcreator.cum.procedures.MarcescenzaScarlattaActiveTickCondition2Procedure;

import java.util.List;
import java.util.ArrayList;

public class MarcescenzaScarlattaMobEffect extends MobEffect {
	public MarcescenzaScarlattaMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "4ec116fc-ba51-3c8f-878c-593f9e906883", -0.04, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "5958c2a4-fb4b-381c-901c-c029d1a3a458", -0.04, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "b5e3fbc0-9294-3b16-872e-5b745053786d", -0.05, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "8ce5e211-d934-3297-8872-64f3bdfc0278", -0.05, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "d9cf29e2-2abd-39b0-9d1e-79ec0834a3b4", -0.05, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MarcescenzaScarlattaActiveTickConditionProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return MarcescenzaScarlattaActiveTickCondition2Procedure.execute(amplifier, duration);
	}
}
