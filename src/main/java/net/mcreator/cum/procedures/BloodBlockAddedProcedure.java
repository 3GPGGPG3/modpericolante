package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;
import net.mcreator.cum.CumMod;

public class BloodBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CumMod.queueServerWork(300, () -> {
			world.setBlock(BlockPos.containing(x, y, z), CumModBlocks.BLOCCO_DI_SANGUE.get().defaultBlockState(), 3);
		});
	}
}
