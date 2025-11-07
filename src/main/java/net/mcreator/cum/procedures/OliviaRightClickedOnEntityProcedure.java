package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.CumMod;

public class OliviaRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof OliviaEntity _datEntL0 && _datEntL0.getEntityData().get(OliviaEntity.DATA_sexing)) == true && (entity instanceof OliviaEntity _datEntL1 && _datEntL1.getEntityData().get(OliviaEntity.DATA_infiling)) == false) {
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_sexing, false);
			if (entity instanceof OliviaEntity _datEntSetL)
				_datEntSetL.getEntityData().set(OliviaEntity.DATA_infiling, true);
			CumMod.queueServerWork(80, () -> {
				if (entity instanceof OliviaEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OliviaEntity.DATA_infiling, false);
			});
		}
	}
}
