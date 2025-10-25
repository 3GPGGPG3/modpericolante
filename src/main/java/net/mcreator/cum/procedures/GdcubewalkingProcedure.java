package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class GdcubewalkingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive();
	}
}
