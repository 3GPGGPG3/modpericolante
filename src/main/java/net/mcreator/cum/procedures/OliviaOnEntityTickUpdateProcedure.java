package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;

public class OliviaOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().x() > 0.000001 || entity.getDeltaMovement().z() > 0.000001) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_Walk, true);
		} else {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_Walk, false);
		}
	}
}
