package net.mcreator.cum.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
<<<<<<< HEAD
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
=======
>>>>>>> 23a504245bad4f51631475b03918983f19a724a5
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
<<<<<<< HEAD
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
=======

import net.mcreator.cum.init.CumModEntities;
>>>>>>> 23a504245bad4f51631475b03918983f19a724a5

import net.mcreator.cum.init.CumModEntities;

public class DanieleLucianoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("Daniele_incazzato", entity) * 0.005) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.SOCIALISTA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.SOCIALISTA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
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
<<<<<<< HEAD
		}.getScore("Daniele_incazzato", entity) > 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scoreboard players set @e[type=cum:socialista] socialista_incazzato 1");
=======
		}.getScore("Daniele_incazzato", entity) >= 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.SOCIALISTA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.SOCIALISTA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("Daniele_incazzato");
				if (_so == null)
					_so = _sc.addObjective("Daniele_incazzato", ObjectiveCriteria.DUMMY, Component.literal("Daniele_incazzato"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
>>>>>>> 23a504245bad4f51631475b03918983f19a724a5
		}
	}
}
