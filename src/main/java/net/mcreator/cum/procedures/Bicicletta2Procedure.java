package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

public class Bicicletta2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().x() != 0 && entity.getDeltaMovement().z() != 0 && entity.isVehicle()) {
			return true;
		}
		return false;
	}
}
