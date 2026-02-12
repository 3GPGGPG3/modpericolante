package net.mcreator.cum.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.entity.LibraCreatureOfNightEntity;
import net.mcreator.cum.CumMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FolliaRiduzioneProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
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
			if (Math.random() < 0.5) {
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
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("follia", entity) >= 520 && entity instanceof LibraCreatureOfNightEntity) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("follia");
				if (_so == null)
					_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (entity instanceof LibraCreatureOfNightEntity _datEntSetL)
				_datEntSetL.getEntityData().set(LibraCreatureOfNightEntity.DATA_follia, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CumModMobEffects.FOLLIA.get(), 60, 0));
			CumMod.queueServerWork(60, () -> {
				if (entity instanceof LibraCreatureOfNightEntity _datEntSetL)
					_datEntSetL.getEntityData().set(LibraCreatureOfNightEntity.DATA_follia, false);
			});
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("follia", entity) >= 420 && !(entity instanceof LibraCreatureOfNightEntity)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("follia");
				if (_so == null)
					_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CumModMobEffects.FOLLIA.get(), 80, 0));
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("follia", entity) < 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("follia");
				if (_so == null)
					_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
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
		}.getScore("pa", entity) < 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("pa");
				if (_so == null)
					_so = _sc.addObjective("pa", ObjectiveCriteria.DUMMY, Component.literal("pa"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
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
		}.getScore("pa_lev", entity) == 1 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("pa", entity) > 140) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("pa");
				if (_so == null)
					_so = _sc.addObjective("pa", ObjectiveCriteria.DUMMY, Component.literal("pa"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(140);
			}
		}
	}
}
