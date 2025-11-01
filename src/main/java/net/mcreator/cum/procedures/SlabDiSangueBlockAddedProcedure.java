package net.mcreator.cum.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;
import net.mcreator.cum.CumMod;

public class SlabDiSangueBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CumMod.queueServerWork(250, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CumModBlocks.SLAB_DI_SANGUE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
