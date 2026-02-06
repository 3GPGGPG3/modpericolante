package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.LibraCreatureOfNightEntity;

public class LibraCreatureFolliaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LibraCreatureOfNightEntity _datEntL0 && _datEntL0.getEntityData().get(LibraCreatureOfNightEntity.DATA_follia)) == true) {
			return true;
		}
		return false;
	}
}
