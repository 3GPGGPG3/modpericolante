package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;

public class OliviaEntityIsHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_normal, true);
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, false);
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_spogliati, false);
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, false);
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_infiling, false);
		if (entity instanceof OliviaEntity _datEntSetL)
			_datEntSetL.getEntityData().set(OliviaEntity.DATA_angry, true);
	}
}
