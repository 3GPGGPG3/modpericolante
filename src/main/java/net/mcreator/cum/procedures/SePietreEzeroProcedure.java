package net.mcreator.cum.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.entity.LibraCreatureOfNightEntity;

public class SePietreEzeroProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_pietre) : 0) == 0 && !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CumModMobEffects.FOLLIA.get()))) {
			return true;
		}
		return false;
	}
}
