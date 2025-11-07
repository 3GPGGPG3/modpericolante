package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;

public class OliviaIdleVestitaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_walk_normal)) == true && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().z() == 0) {
			return true;
		}
		return false;
	}
}
