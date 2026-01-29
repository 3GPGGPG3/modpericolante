package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.CumMod;

public class PietraLibraOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CumMod.queueServerWork(700, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
		});
	}
}
