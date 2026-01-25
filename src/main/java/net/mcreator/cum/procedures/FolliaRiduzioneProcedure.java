package net.mcreator.cum.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.init.CumModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FolliaRiduzioneProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("follia", entity) > 0) {
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
				}.getScore("follia", entity) - 1));
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("follia", entity) >= 100) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("follia");
				if (_so == null)
					_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CumModMobEffects.FOLLIA.get(), 60, 1));
		}
	}
}
