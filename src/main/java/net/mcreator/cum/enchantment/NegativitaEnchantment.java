
package net.mcreator.cum.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.cum.init.CumModItems;

public class NegativitaEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("cum_negativita",
			item -> Ingredient.of(new ItemStack(CumModItems.ECTOPLASMA_NEGATIVO.get()), new ItemStack(CumModItems.STELLA_DEL_GODO_NEGATIVA.get()), new ItemStack(CumModItems.STAFFA_DEL_GODO_NEGATIVA.get())).test(new ItemStack(item)));

	public NegativitaEnchantment() {
		super(Enchantment.Rarity.UNCOMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public boolean isCurse() {
		return true;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
