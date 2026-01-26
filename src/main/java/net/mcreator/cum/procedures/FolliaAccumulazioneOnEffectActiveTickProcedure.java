package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.init.CumModMobEffects;

public class FolliaAccumulazioneOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.level().getScoreboard();
			Objective _so = _sc.getObjective("follia");
			if (_so == null)
				_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.level().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("follia", entity) + 1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CumModMobEffects.FOLLIA_ACCUMULAZIONE.get()) ? _livEnt.getEffect(CumModMobEffects.FOLLIA_ACCUMULAZIONE.get()).getAmplifier() : 0)));
		}
	}
}
