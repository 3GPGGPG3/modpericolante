
package net.mcreator.cum.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.procedures.BacchettaRangedItemShootsProjectileProcedure;
import net.mcreator.cum.procedures.BacchettaOnPlayerStoppedUsingProcedure;

import java.util.List;

public class BacchettaItem extends Item {
	public BacchettaItem() {
		super(new Item.Properties().durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.cum.bacchetta.description_0"));
		list.add(Component.translatable("item.cum.bacchetta.description_1"));
		list.add(Component.translatable("item.cum.bacchetta.description_2"));
		list.add(Component.translatable("item.cum.bacchetta.description_3"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		BacchettaRangedItemShootsProjectileProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		BacchettaOnPlayerStoppedUsingProcedure.execute(entity, itemstack);
	}
}
