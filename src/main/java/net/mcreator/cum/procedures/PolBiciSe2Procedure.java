package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.PoliziottoInBiciEntity;

public class PolBiciSe2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PoliziottoInBiciEntity _datEntI ? _datEntI.getEntityData().get(PoliziottoInBiciEntity.DATA_staattaccando) : 0) == 1) {
			return true;
		}
		return false;
	}
}
