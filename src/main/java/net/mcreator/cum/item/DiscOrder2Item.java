
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscOrder2Item extends RecordItem {
	public DiscOrder2Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:order2")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 3380);
	}
}
