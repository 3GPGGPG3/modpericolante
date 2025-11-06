package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.PresideEntity;

public class PresideincazzatoProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof PresideEntity _datEntL0 && _datEntL0.getEntityData().get(PresideEntity.DATA_incazzato);
	}
}
