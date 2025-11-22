package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.CumMod;

public class DestudentazioneoneffectactivetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CumMod.queueServerWork(200, () -> {
			if (Math.random() < 0.25) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CumModEntities.TOPO.get().spawn(_level,
							BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -50, 50), y + Mth.nextDouble(RandomSource.create(), 5, 50), z + Mth.nextDouble(RandomSource.create(), -50, 50)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		});
	}
}
