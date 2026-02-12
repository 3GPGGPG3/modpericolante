package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

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
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.level().getScoreboard();
			Objective _so = _sc.getObjective("pa");
			if (_so == null)
				_so = _sc.addObjective("pa", ObjectiveCriteria.DUMMY, Component.literal("pa"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.level().getScoreboard();
			Objective _so = _sc.getObjective("pa_lev");
			if (_so == null)
				_so = _sc.addObjective("pa_lev", ObjectiveCriteria.DUMMY, Component.literal("pa_lev"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
		}
	}
}
