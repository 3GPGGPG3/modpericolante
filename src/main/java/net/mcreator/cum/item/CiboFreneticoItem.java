
package net.mcreator.cum.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cum.procedures.CiboFreneticoOnPlayerStoppedUsingProcedure;

public class CiboFreneticoItem extends Item {
	public CiboFreneticoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(1).saturationMod(-0.4f).alwaysEat().build()));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		CiboFreneticoOnPlayerStoppedUsingProcedure.execute(entity);
	}
}
