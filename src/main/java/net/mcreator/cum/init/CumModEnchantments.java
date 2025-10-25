
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.cum.enchantment.NegativitaEnchantment;
import net.mcreator.cum.CumMod;

public class CumModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CumMod.MODID);
	public static final RegistryObject<Enchantment> NEGATIVITA = REGISTRY.register("negativita", () -> new NegativitaEnchantment());
}
