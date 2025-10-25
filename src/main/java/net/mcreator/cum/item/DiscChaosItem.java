
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscChaosItem extends RecordItem {
	public DiscChaosItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:chaos")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 1280);
	}
}
