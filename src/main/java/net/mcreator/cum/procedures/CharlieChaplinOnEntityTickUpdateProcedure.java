package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.CharlieChaplinEntity;

public class CharlieChaplinOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CharlieChaplinEntity _datEntSetL)
			_datEntSetL.getEntityData().set(CharlieChaplinEntity.DATA_Walk, true);
	}
}
