
package net.mcreator.cum.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.procedures.SchiacciataII2Procedure;
import net.mcreator.cum.procedures.SchiacciataII1Procedure;

import java.util.List;

public class PotereSchiacciataIIItem extends Item {
	public PotereSchiacciataIIItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.cum.potere_schiacciata_ii.description_0"));
		list.add(Component.translatable("item.cum.potere_schiacciata_ii.description_1"));
		list.add(Component.translatable("item.cum.potere_schiacciata_ii.description_2"));
		list.add(Component.translatable("item.cum.potere_schiacciata_ii.description_3"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SchiacciataII2Procedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SchiacciataII1Procedure.execute(entity.level(), entity, sourceentity, itemstack);
		return retval;
	}
}
