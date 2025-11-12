package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;

public class ShowCaricaVascaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return CumModBlocks.VASCA_ELETTROFORETICA.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock();
	}
}
