package net.mcreator.cum.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.LibraCreatureOfNightEntity;

public class FolliaEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LibraCreatureOfNightEntity) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 100) * 4));
		} else if (entity instanceof Player) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 100) * 40));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 100) * 25));
		}
	}
}
