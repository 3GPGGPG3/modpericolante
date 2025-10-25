
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.potion.MarcescenzaScarlattaMobEffect;
import net.mcreator.cum.potion.FolliaMobEffect;
import net.mcreator.cum.CumMod;

public class CumModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CumMod.MODID);
	public static final RegistryObject<MobEffect> MARCESCENZA_SCARLATTA = REGISTRY.register("marcescenza_scarlatta", () -> new MarcescenzaScarlattaMobEffect());
	public static final RegistryObject<MobEffect> FOLLIA = REGISTRY.register("follia", () -> new FolliaMobEffect());
}
