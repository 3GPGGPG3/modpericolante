
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cum.CumMod;

public class CumModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CumMod.MODID);
	public static final RegistryObject<Potion> POZIONE_MARCESCENTE = REGISTRY.register("pozione_marcescente",
			() -> new Potion(new MobEffectInstance(CumModMobEffects.MARCESCENZA_SCARLATTA.get(), 3600, 0, false, true), new MobEffectInstance(MobEffects.CONFUSION, 1000, 0, false, true)));
	public static final RegistryObject<Potion> POZIONE_GODEVOLE = REGISTRY.register("pozione_godevole",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true), new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0, false, true), new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true), new MobEffectInstance(MobEffects.REGENERATION, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, false, true), new MobEffectInstance(MobEffects.SATURATION, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0, false, true), new MobEffectInstance(MobEffects.LUCK, 3600, 0, false, true), new MobEffectInstance(MobEffects.JUMP, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.HEAL, 3600, 0, false, true), new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 0, false, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, false, true)));
	public static final RegistryObject<Potion> POZIONE_NON_GODEVOLE = REGISTRY.register("pozione_non_godevole",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, true), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true), new MobEffectInstance(MobEffects.HARM, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.WITHER, 3600, 0, false, true), new MobEffectInstance(MobEffects.GLOWING, 3600, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, false, true), new MobEffectInstance(MobEffects.DARKNESS, 3600, 0, false, true)));
	public static final RegistryObject<Potion> POZIONE_FRENESIA = REGISTRY.register("pozione_frenesia", () -> new Potion(new MobEffectInstance(CumModMobEffects.FOLLIA.get(), 120, 0, false, true)));
}
