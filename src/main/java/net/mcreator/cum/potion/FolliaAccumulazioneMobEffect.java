
package net.mcreator.cum.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.FolliaAccumulazioneOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class FolliaAccumulazioneMobEffect extends MobEffect {
	public FolliaAccumulazioneMobEffect() {
		super(MobEffectCategory.HARMFUL, -3368704);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FolliaAccumulazioneOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
