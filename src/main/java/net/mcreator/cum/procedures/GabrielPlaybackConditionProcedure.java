package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.GabrielEntity;

public class GabrielPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof GabrielEntity _datEntL0 && _datEntL0.getEntityData().get(GabrielEntity.DATA_idle);
	}
}
