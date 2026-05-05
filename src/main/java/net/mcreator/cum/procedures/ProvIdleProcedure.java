package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.ProvidenceEntity;

public class ProvIdleProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof ProvidenceEntity _datEntL0 && _datEntL0.getEntityData().get(ProvidenceEntity.DATA_is_attacking)) == false) {
			return true;
		}
		return false;
	}
}
