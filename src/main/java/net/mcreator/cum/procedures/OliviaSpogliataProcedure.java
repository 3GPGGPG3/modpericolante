package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;

public class OliviaSpogliataProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_walk_naked)) == true) {
			return true;
		}
		return false;
	}
}
