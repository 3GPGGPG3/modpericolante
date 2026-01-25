package net.mcreator.cum.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.init.CumModItems;

public class BoloStabilizzantePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.level().getScoreboard();
			Objective _so = _sc.getObjective("follia");
			if (_so == null)
				_so = _sc.addObjective("follia", ObjectiveCriteria.DUMMY, Component.literal("follia"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(CumModItems.BOLO_STABILIZZANTE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
