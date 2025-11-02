package net.mcreator.cum.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.init.CumModItems;

public class PenalizzatoOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_CHESTPLATE.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_CHESTPLATE.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_LEGGINGS.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_LEGGINGS.get()));
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_BOOTS.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(CumModItems.ARMATURA_PENALIZZATA_BOOTS.get()));
			}
		}
		{
			final int _slotid = 0;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 1;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 2;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 3;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 4;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 5;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 6;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 7;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 8;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 9;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 10;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 11;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 12;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 13;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 14;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 15;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 16;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 17;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 18;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 19;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 20;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 21;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 22;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 23;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 24;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 25;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 26;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 27;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 28;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 29;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 30;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 31;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 32;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 33;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 34;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 35;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 36;
			final ItemStack _setstack = new ItemStack(CumModItems.ARMATURA_PENALIZZATA_HELMET.get()).copy();
			_setstack.setCount(1);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
	}
}
