package net.mcreator.cum.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.init.CumModItems;

public class PerInv2SpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.4) {
			if (Math.random() < 0.7) {
				{
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(CumModItems.ILGODO.get()).copy();
					_setstack.setCount(1);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
							_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
					});
				}
			} else {
				{
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(CumModItems.SPADA_SUPER_GODEVOLE.get()).copy();
					_setstack.setCount(1);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
							_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
					});
				}
			}
		}
		if (Math.random() < 0.2) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(CumModItems.ARMATURA_DEL_GODO_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CumModItems.ARMATURA_DEL_GODO_HELMET.get()));
				}
			}
		}
		if (Math.random() < 0.2) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(CumModItems.ARMATURA_DEL_GODO_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CumModItems.ARMATURA_DEL_GODO_CHESTPLATE.get()));
				}
			}
		}
		if (Math.random() < 0.2) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(CumModItems.ARMATURA_DEL_GODO_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CumModItems.ARMATURA_DEL_GODO_LEGGINGS.get()));
				}
			}
		}
		if (Math.random() < 0.2) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(CumModItems.ARMATURA_DEL_GODO_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(CumModItems.ARMATURA_DEL_GODO_BOOTS.get()));
				}
			}
		}
	}
}
