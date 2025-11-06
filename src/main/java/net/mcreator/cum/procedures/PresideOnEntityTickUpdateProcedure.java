package net.mcreator.cum.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.entity.PresideEntity;

public class PresideOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PresideEntity _datEntL0 && _datEntL0.getEntityData().get(PresideEntity.DATA_incazzato)) == true) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CumModItems.SPADA_GODEVOLE.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
