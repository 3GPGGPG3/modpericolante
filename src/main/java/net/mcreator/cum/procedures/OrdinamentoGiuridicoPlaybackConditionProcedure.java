package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OrdinamentoGiuridicoEntity;

public class OrdinamentoGiuridicoPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OrdinamentoGiuridicoEntity _datEntL0 && _datEntL0.getEntityData().get(OrdinamentoGiuridicoEntity.DATA_alzato)) == true) {
			return true;
		}
		return false;
	}
}
