package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.entity.LibraCreatureOfNightEntity;
import net.mcreator.cum.CumMod;

public class LibraCreatureOfNightOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive() && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("libraatt", entity) == 0) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("libraatt");
				if (_so == null)
					_so = _sc.addObjective("libraatt", ObjectiveCriteria.DUMMY, Component.literal("libraatt"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
			}
			if (Math.random() < 0.5) {
				if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 1);
				for (int index0 = 0; index0 < 3; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CumModEntities.PIETRA_LIBRA.get().spawn(_level,
								BlockPos.containing(entity.getX() + Mth.nextDouble(RandomSource.create(), -12, 12), entity.getY(), entity.getZ() + Mth.nextDouble(RandomSource.create(), -12, 12)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				for (int index1 = 0; index1 < 10; index1++) {
					CumMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CumModEntities.PIETRA_LIBRA.get().spawn(_level,
									BlockPos.containing(entity.getX() + Mth.nextDouble(RandomSource.create(), -12, 12), entity.getY(), entity.getZ() + Mth.nextDouble(RandomSource.create(), -12, 12)), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					});
				}
				CumMod.queueServerWork(72, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"effect give @a cum:follia_accumulazione 6 8 true");
				});
				CumMod.queueServerWork(280, () -> {
					if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 0);
					CumMod.queueServerWork(400, () -> {
						{
							Entity _ent = entity;
							Scoreboard _sc = _ent.level().getScoreboard();
							Objective _so = _sc.getObjective("libraatt");
							if (_so == null)
								_so = _sc.addObjective("libraatt", ObjectiveCriteria.DUMMY, Component.literal("libraatt"), ObjectiveCriteria.RenderType.INTEGER);
							_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
						}
					});
				});
			} else {
				CumMod.queueServerWork(100, () -> {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("libraatt");
						if (_so == null)
							_so = _sc.addObjective("libraatt", ObjectiveCriteria.DUMMY, Component.literal("libraatt"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
				});
			}
		}
	}
}
