package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.CharlieChaplinEntity;

public class CharlieChaplinWalkPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof CharlieChaplinEntity _datEntL0 && _datEntL0.getEntityData().get(CharlieChaplinEntity.DATA_Walk)) == true) {
			return true;
		}
		return false;
	}
}
