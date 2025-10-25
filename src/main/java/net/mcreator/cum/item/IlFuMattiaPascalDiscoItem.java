
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IlFuMattiaPascalDiscoItem extends RecordItem {
	public IlFuMattiaPascalDiscoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:ilfumattia")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 3840);
	}
}
