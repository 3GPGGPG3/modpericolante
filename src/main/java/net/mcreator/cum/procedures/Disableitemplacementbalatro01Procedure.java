package net.mcreator.cum.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.cum.init.CumModItems;

public class Disableitemplacementbalatro01Procedure {
	public static boolean execute(ItemStack itemstack) {
		return !(itemstack.getItem() == CumModItems.JOKER.get() || itemstack.getItem() == CumModItems.MOLT.get() || itemstack.getItem() == CumModItems.CARTA_DI_PIETRA.get());
	}
}
