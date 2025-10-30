package net.mcreator.cum.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cum.init.CumModMobEffects;

public class PeneDellaFrenesiaRangedItemShootsProjectileProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.001) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CumModMobEffects.FOLLIA.get(), 80, 1));
			entity.setSecondsOnFire(4);
		}
	}
}
