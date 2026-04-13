package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.CumMod;

public class AlunnedimodaRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Alunna> Prof quanto \u00E8 giovane!!!"), false);
		CumMod.queueServerWork(40, () -> {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Alunna> Ma \u00E8 sposato?"), false);
		});
		CumMod.queueServerWork(80, () -> {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Alunna> Io sono Cinese ;)"), false);
		});
		for (int index0 = 0; index0 < 20; index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.OLIVIA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
