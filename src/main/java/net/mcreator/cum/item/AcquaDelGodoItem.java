
package net.mcreator.cum.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.cum.init.CumModFluids;

public class AcquaDelGodoItem extends BucketItem {
	public AcquaDelGodoItem() {
		super(CumModFluids.ACQUA_DEL_GODO, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
