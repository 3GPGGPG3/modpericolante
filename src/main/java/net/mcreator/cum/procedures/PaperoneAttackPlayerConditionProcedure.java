package net.mcreator.cum.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.PaperonDePaperoniEntity;

public class PaperoneAttackPlayerConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof PaperonDePaperoniEntity _datEntL0 && _datEntL0.getEntityData().get(PaperonDePaperoniEntity.DATA_Paperone_player_attack_condition);
	}
}
