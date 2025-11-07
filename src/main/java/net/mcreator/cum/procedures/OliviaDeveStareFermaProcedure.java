package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;

public class OliviaDeveStareFermaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_infiling)) == true || (entity instanceof OliviaEntity _datEntL1 && _datEntL1.getEntityData().get(OliviaEntity.DATA_spogliati)) == true
				|| (entity instanceof OliviaEntity _datEntL2 && _datEntL2.getEntityData().get(OliviaEntity.DATA_sexing)) == true) {
			return false;
		}
		return true;
	}
}
