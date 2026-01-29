package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.LibraCreatureOfNightEntity;

public class SePietreEzeroProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_pietre) : 0) == 0) {
			return true;
		}
		return false;
	}
}
