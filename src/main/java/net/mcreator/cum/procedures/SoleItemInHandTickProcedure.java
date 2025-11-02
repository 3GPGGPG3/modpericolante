package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

public class SoleItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(99);
	}
}
