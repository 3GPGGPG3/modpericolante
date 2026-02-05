package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.PoliziottoInBiciEntity;

public class PoliziottoInBiciPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().z() == 0 && entity.getDeltaMovement().x() == 0 && (entity instanceof PoliziottoInBiciEntity _datEntI ? _datEntI.getEntityData().get(PoliziottoInBiciEntity.DATA_staattaccando) : 0) == 0) {
			return true;
		}
		return false;
	}
}
