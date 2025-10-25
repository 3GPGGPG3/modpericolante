
package net.mcreator.cum.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cum.procedures.BatteriaPlayerFinishesUsingItemProcedure;

public class BatteriaItem extends Item {
	public BatteriaItem() {
		super(new Item.Properties().stacksTo(2).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-0.2f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return -4;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		BatteriaPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
