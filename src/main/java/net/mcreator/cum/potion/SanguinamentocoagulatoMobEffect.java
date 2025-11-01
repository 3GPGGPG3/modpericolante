
package net.mcreator.cum.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.procedures.SanguinamentocoagulatoprocedureProcedure;

import java.util.List;
import java.util.ArrayList;

public class SanguinamentocoagulatoMobEffect extends MobEffect {
	public SanguinamentocoagulatoMobEffect() {
		super(MobEffectCategory.HARMFUL, -11401722);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SanguinamentocoagulatoprocedureProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
