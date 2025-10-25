
package net.mcreator.cum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueOrbItem extends Item {
	public BlueOrbItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
