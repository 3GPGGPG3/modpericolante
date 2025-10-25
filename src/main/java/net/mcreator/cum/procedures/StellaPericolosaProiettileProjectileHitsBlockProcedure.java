package net.mcreator.cum.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;
import net.mcreator.cum.CumMod;

import java.util.Map;

public class StellaPericolosaProiettileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = CumModBlocks.BLOCCO_PERICOLOSO.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 7, Level.ExplosionInteraction.TNT);
		for (int index0 = 0; index0 < 7; index0++) {
			CumMod.queueServerWork(20, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 6, Level.ExplosionInteraction.TNT);
				CumMod.queueServerWork(15, () -> {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.TNT);
					CumMod.queueServerWork(10, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
						CumMod.queueServerWork(5, () -> {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.TNT);
							CumMod.queueServerWork(1, () -> {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.TNT);
							});
						});
					});
				});
			});
		}
	}
}
