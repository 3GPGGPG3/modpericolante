package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

public class AssassinaDeiNeriColtelliEntityIsHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.push(((-2) * entity.getLookAngle().x), 0, ((-2) * entity.getLookAngle().z));
	}
}
