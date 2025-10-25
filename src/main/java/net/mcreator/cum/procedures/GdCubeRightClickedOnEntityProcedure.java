package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.GdCubeEntity;
import net.mcreator.cum.CumMod;

public class GdCubeRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GdCubeEntity _datEntSetL)
			_datEntSetL.getEntityData().set(GdCubeEntity.DATA_walk, true);
		CumMod.queueServerWork(40, () -> {
			if (entity instanceof GdCubeEntity _datEntSetL)
				_datEntSetL.getEntityData().set(GdCubeEntity.DATA_walk, false);
		});
	}
}
