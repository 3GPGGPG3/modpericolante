
package net.mcreator.cum.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.cum.procedures.IMPENETRAZIONEHelmetTickEventProcedure;
import net.mcreator.cum.init.CumModItems;

import java.util.List;

import com.google.common.collect.Iterables;

public abstract class IMPENETRAZIONEItem extends ArmorItem {
	public IMPENETRAZIONEItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 300;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{57, 126, 150, 60}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CumModItems.IMPENETRAZIONE_HELMET.get()), new ItemStack(CumModItems.IMPENETRAZIONE_CHESTPLATE.get()), new ItemStack(CumModItems.IMPENETRAZIONE_LEGGINGS.get()),
						new ItemStack(CumModItems.IMPENETRAZIONE_BOOTS.get()));
			}

			@Override
			public String getName() {
				return "impenetrazione";
			}

			@Override
			public float getToughness() {
				return 16.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1.2f;
			}
		}, type, properties);
	}

	public static class Helmet extends IMPENETRAZIONEItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cum:textures/models/armor/impenetrazione_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				IMPENETRAZIONEHelmetTickEventProcedure.execute(world, entity, itemstack);
			}
		}
	}

	public static class Chestplate extends IMPENETRAZIONEItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cum:textures/models/armor/impenetrazione_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				IMPENETRAZIONEHelmetTickEventProcedure.execute(world, entity, itemstack);
			}
		}
	}

	public static class Leggings extends IMPENETRAZIONEItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.cum.impenetrazione_leggings.description_0"));
			list.add(Component.translatable("item.cum.impenetrazione_leggings.description_1"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cum:textures/models/armor/impenetrazione_layer_2.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				IMPENETRAZIONEHelmetTickEventProcedure.execute(world, entity, itemstack);
			}
		}
	}

	public static class Boots extends IMPENETRAZIONEItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cum:textures/models/armor/impenetrazione_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				IMPENETRAZIONEHelmetTickEventProcedure.execute(world, entity, itemstack);
			}
		}
	}
}
