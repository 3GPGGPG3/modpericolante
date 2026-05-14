package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.MarcoEntity;

public class MarcoCalciaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof MarcoEntity _datEntL0 && _datEntL0.getEntityData().get(MarcoEntity.DATA_sta_calciando)) == true) {
			return true;
		}
		return false;
	}
}
