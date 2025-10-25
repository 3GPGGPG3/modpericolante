
package net.mcreator.cum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClonatoreItem extends Item {
	public ClonatoreItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.RARE));
	}
}
