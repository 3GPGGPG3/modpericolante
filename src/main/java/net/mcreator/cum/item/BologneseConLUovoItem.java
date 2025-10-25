
package net.mcreator.cum.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.procedures.BologneseConLUovoOnPlayerStoppedUsingProcedure;

import java.util.List;

public class BologneseConLUovoItem extends Item {
	public BologneseConLUovoItem() {
		super(new Item.Properties().durability(3).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationMod(2f).build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.cum.bolognese_con_l_uovo.description_0"));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		BologneseConLUovoOnPlayerStoppedUsingProcedure.execute(world, entity, itemstack);
	}
}
