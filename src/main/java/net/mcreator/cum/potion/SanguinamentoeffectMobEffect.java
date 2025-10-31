
package net.mcreator.cum.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.SanguinamentoeffectOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class SanguinamentoeffectMobEffect extends MobEffect {
	public SanguinamentoeffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407872);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SanguinamentoeffectOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
