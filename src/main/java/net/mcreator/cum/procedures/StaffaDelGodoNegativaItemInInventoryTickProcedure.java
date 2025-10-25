package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.cum.init.CumModEnchantments;

public class StaffaDelGodoNegativaItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(EnchantmentHelper.getItemEnchantmentLevel(CumModEnchantments.NEGATIVITA.get(), itemstack) != 0)) {
			itemstack.enchant(CumModEnchantments.NEGATIVITA.get(), 1);
		}
	}
}
