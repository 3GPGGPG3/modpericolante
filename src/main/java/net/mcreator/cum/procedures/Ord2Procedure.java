package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OrdinamentoGiuridicoEntity;

public class Ord2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OrdinamentoGiuridicoEntity _datEntL0 && _datEntL0.getEntityData().get(OrdinamentoGiuridicoEntity.DATA_alzato)) == false || !(entity instanceof Mob _mobEnt1 && _mobEnt1.isAggressive())) {
			return true;
		}
		return false;
	}
}
