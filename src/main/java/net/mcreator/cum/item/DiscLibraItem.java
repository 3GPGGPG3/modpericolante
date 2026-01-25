
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscLibraItem extends RecordItem {
	public DiscLibraItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:libra_creature_of_night")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 8620);
	}
}
