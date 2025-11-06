package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.PresideEntity;

public class PresideEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PresideEntity _datEntSetL)
			_datEntSetL.getEntityData().set(PresideEntity.DATA_incazzato, false);
	}
}
