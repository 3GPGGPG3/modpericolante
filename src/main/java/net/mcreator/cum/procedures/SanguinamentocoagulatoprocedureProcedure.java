package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;

public class SanguinamentocoagulatoprocedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			world.setBlock(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()), CumModBlocks.BLOCCO_DI_SANGUE.get().defaultBlockState(), 3);
		}
	}
}
