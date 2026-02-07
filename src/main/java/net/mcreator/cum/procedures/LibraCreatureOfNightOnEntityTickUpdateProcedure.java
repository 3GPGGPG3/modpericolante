package net.mcreator.cum.procedures;

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
		if ((entity instanceof LibraCreatureOfNightEntity _datEntL0 && _datEntL0.getEntityData().get(LibraCreatureOfNightEntity.DATA_follia)) == true
				&& (entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_interruzione) : 0) == 0) {
			if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_interruzione, 1);
			if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 0);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect clear @a cum:follia_accumulazione");
				}
			}
			CumMod.queueServerWork(70, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "effect clear @a cum:follia_accumulazione");
					}
				}
				if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_libraatt, 0);
				if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_interruzione, 0);
			});
		}
		if (entity instanceof Mob _mobEnt9 && _mobEnt9.isAggressive() && (entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_libraatt) : 0) == 0) {
			if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_libraatt, 1);
			if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
				_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_whattodo, (int) Mth.nextDouble(RandomSource.create(), 1, 4));
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("action:" + (entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_whattodo) : 0))), false);
			if ((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_whattodo) : 0) == 1
					|| (entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_whattodo) : 0) == 4) {
				CumMod.queueServerWork(100, () -> {
					if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_libraatt, 0);
				});
			}
			if ((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_whattodo) : 0) == 2) {
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
				if (!((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_interruzione) : 0) == 1)) {
					CumMod.queueServerWork(72, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"effect give @a cum:follia_accumulazione 6 7 true");
					});
					CumMod.queueServerWork(280, () -> {
						if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
							_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 0);
						CumMod.queueServerWork(400, () -> {
							if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
								_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_libraatt, 0);
						});
					});
				}
			}
			if ((entity instanceof LibraCreatureOfNightEntity _datEntI ? _datEntI.getEntityData().get(LibraCreatureOfNightEntity.DATA_whattodo) : 0) == 3) {
				if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
					_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 2);
				CumMod.queueServerWork(30, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CumModEntities.LIBRACERCHIO.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
				CumMod.queueServerWork(50, () -> {
					if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
						_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_pietre, 0);
					CumMod.queueServerWork(200, () -> {
						if (entity instanceof LibraCreatureOfNightEntity _datEntSetI)
							_datEntSetI.getEntityData().set(LibraCreatureOfNightEntity.DATA_libraatt, 0);
					});
				});
			}
		}
	}
}
