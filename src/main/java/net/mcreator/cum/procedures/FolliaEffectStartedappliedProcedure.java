package net.mcreator.cum.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.init.CumModMobEffects;

public class FolliaEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) (((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 100)
					* (7 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CumModMobEffects.FOLLIA.get()) ? _livEnt.getEffect(CumModMobEffects.FOLLIA.get()).getAmplifier() : 0))));
	}
}
