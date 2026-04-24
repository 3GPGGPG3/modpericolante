package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.CumMod;

public class ProvidenceEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (Math.random() < 0.5) {
				entity.push(0, 0, 0.3);
				CumMod.queueServerWork(10, () -> {
					if (Math.random() < 0.5) {
						entity.push(0, 0.3, 0);
					} else {
						entity.push(0, (-0.3), 0);
					}
				});
			} else {
				entity.push(0, 0, (-0.3));
				CumMod.queueServerWork(10, () -> {
					if (Math.random() < 0.5) {
						entity.push(0, 0.3, 0);
					} else {
						entity.push(0, (-0.3), 0);
					}
				});
			}
		} else {
			if (Math.random() < 0.5) {
				entity.push(0, 0.3, 0);
				CumMod.queueServerWork(10, () -> {
					if (Math.random() < 0.5) {
						entity.push(0, 0, 0.3);
					} else {
						entity.push(0, 0, (-0.3));
					}
				});
			} else {
				entity.push(0, (-0.3), 0);
				CumMod.queueServerWork(10, () -> {
					if (Math.random() < 0.5) {
						entity.push(0, 0, 0.3);
					} else {
						entity.push(0, 0, (-0.3));
					}
				});
			}
		}
	}
}
