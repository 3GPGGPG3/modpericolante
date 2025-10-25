package net.mcreator.cum.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class DispositivoNeutralizzanteItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity instanceof Player _player)
			_player.getInventory().clearContent();
		entity.clearFire();
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(-(entity instanceof Player _plr ? _plr.experienceLevel : 0));
	}
}
