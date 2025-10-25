
package net.mcreator.cum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedCumItem extends Item {
	public RedCumItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
