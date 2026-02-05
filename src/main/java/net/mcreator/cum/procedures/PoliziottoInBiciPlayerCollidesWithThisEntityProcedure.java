package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cum.entity.PoliziottoInBiciEntity;
import net.mcreator.cum.CumMod;

public class PoliziottoInBiciPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PoliziottoInBiciEntity _datEntI ? _datEntI.getEntityData().get(PoliziottoInBiciEntity.DATA_staattaccando) : 0) == 0 && entity instanceof Mob _mobEnt1 && _mobEnt1.isAggressive()) {
			if (entity instanceof PoliziottoInBiciEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PoliziottoInBiciEntity.DATA_staattaccando, 1);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false));
			CumMod.queueServerWork(60, () -> {
				if (entity instanceof PoliziottoInBiciEntity _datEntSetI)
					_datEntSetI.getEntityData().set(PoliziottoInBiciEntity.DATA_staattaccando, 0);
			});
		}
	}
}
