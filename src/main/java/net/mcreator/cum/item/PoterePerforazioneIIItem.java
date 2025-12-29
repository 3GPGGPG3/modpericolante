
package net.mcreator.cum.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.procedures.PoterePerforazioneLivingEntityIsHitWithItemProcedure;

import java.util.List;

public class PoterePerforazioneIIItem extends Item {
	public PoterePerforazioneIIItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.cum.potere_perforazione_ii.description_0"));
		list.add(Component.translatable("item.cum.potere_perforazione_ii.description_1"));
		list.add(Component.translatable("item.cum.potere_perforazione_ii.description_2"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PoterePerforazioneLivingEntityIsHitWithItemProcedure.execute(entity.level(), entity, sourceentity, itemstack);
		return retval;
	}
}
