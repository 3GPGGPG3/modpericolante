package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.CumMod;

public class SpogliatiClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_walk_normal)) == true && (entity instanceof OliviaEntity _datEntL1 && _datEntL1.getEntityData().get(OliviaEntity.DATA_angry)) == false) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_normal, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_spogliati, true);
			CumMod.queueServerWork(100, () -> {
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_spogliati, false);
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, true);
			});
		} else if ((entity instanceof OliviaEntity _datEntL7 && _datEntL7.getEntityData().get(OliviaEntity.DATA_walk_naked)) == true && (entity instanceof OliviaEntity _datEntL8 && _datEntL8.getEntityData().get(OliviaEntity.DATA_angry)) == false) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, true);
			CumMod.queueServerWork(100, () -> {
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, false);
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_walk_naked, true);
			});
		}
	}
}
