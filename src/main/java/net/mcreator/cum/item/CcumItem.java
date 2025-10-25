
package net.mcreator.cum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CcumItem extends Item {
	public CcumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
