package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.GdCubeEntity;

public class GdCubePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof GdCubeEntity _datEntL0 && _datEntL0.getEntityData().get(GdCubeEntity.DATA_walk) || entity instanceof Mob _mobEnt1 && _mobEnt1.isAggressive();
	}
}
