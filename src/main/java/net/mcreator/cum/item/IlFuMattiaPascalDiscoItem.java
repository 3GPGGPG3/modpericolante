
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cum.procedures.IlFuMattiaPascalDiscoRightclickedOnBlockProcedure;

public class IlFuMattiaPascalDiscoItem extends RecordItem {
	public IlFuMattiaPascalDiscoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:ilfumattia")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3840);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IlFuMattiaPascalDiscoRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
