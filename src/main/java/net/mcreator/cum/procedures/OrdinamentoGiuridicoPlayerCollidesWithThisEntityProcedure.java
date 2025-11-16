package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OrdinamentoGiuridicoEntity;
import net.mcreator.cum.CumMod;

public class OrdinamentoGiuridicoPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive() && (entity instanceof OrdinamentoGiuridicoEntity _datEntL1 && _datEntL1.getEntityData().get(OrdinamentoGiuridicoEntity.DATA_cammina)) == true) {
			if (entity instanceof OrdinamentoGiuridicoEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OrdinamentoGiuridicoEntity.DATA_attempt_to_hit, true);
			CumMod.queueServerWork(20, () -> {
				if (entity instanceof OrdinamentoGiuridicoEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OrdinamentoGiuridicoEntity.DATA_attempt_to_hit, false);
			});
		}
	}
}
