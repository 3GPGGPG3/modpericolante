
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.cum.potion.SanguinamentoeffectMobEffect;
import net.mcreator.cum.potion.SanguinamentocoagulatoMobEffect;
import net.mcreator.cum.potion.PenalizzatoMobEffect;
import net.mcreator.cum.potion.MarcescenzaScarlattaMobEffect;
import net.mcreator.cum.potion.FolliaMobEffect;
import net.mcreator.cum.potion.DivietousocellulareeffectMobEffect;
import net.mcreator.cum.CumMod;

public class CumModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CumMod.MODID);
	public static final RegistryObject<MobEffect> MARCESCENZA_SCARLATTA = REGISTRY.register("marcescenza_scarlatta", () -> new MarcescenzaScarlattaMobEffect());
	public static final RegistryObject<MobEffect> FOLLIA = REGISTRY.register("follia", () -> new FolliaMobEffect());
	public static final RegistryObject<MobEffect> SANGUINAMENTOEFFECT = REGISTRY.register("sanguinamentoeffect", () -> new SanguinamentoeffectMobEffect());
	public static final RegistryObject<MobEffect> SANGUINAMENTOCOAGULATO = REGISTRY.register("sanguinamentocoagulato", () -> new SanguinamentocoagulatoMobEffect());
	public static final RegistryObject<MobEffect> PENALIZZATO = REGISTRY.register("penalizzato", () -> new PenalizzatoMobEffect());
	public static final RegistryObject<MobEffect> DIVIETOUSOCELLULAREEFFECT = REGISTRY.register("divietousocellulareeffect", () -> new DivietousocellulareeffectMobEffect());
}
