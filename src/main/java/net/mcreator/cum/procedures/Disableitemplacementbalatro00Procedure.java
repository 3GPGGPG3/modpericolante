package net.mcreator.cum.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.cum.init.CumModItems;

public class Disableitemplacementbalatro00Procedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getItem() == CumModItems.JOKER.get();
	}
}
