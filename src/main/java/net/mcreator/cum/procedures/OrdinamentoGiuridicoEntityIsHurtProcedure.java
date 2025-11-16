package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OrdinamentoGiuridicoEntity;
import net.mcreator.cum.CumMod;

public class OrdinamentoGiuridicoEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof OrdinamentoGiuridicoEntity _datEntL0 && _datEntL0.getEntityData().get(OrdinamentoGiuridicoEntity.DATA_alzato)) == false) {
			if (entity instanceof OrdinamentoGiuridicoEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OrdinamentoGiuridicoEntity.DATA_alzato, true);
			CumMod.queueServerWork(20, () -> {
				if (entity instanceof OrdinamentoGiuridicoEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OrdinamentoGiuridicoEntity.DATA_cammina, true);
				if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			});
		}
	}
}
