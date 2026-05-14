package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.MarcoEntity;

public class MarcWalkProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDeltaMovement().z() != 0 || entity.getDeltaMovement().x() != 0) && (entity instanceof MarcoEntity _datEntL2 && _datEntL2.getEntityData().get(MarcoEntity.DATA_sta_calciando)) == false) {
			return true;
		}
		return false;
	}
}
