package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

public class MiraldiPlayback2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().z() != 0 || entity.getDeltaMovement().x() != 0) {
			return false;
		}
		return true;
	}
}
