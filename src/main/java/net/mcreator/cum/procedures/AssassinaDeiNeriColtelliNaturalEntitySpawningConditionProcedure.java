package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class AssassinaDeiNeriColtelliNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return !(world instanceof Level _lvl0 && _lvl0.isDay());
	}
}
