
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.cum.CumMod;

public class CumModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CumMod.MODID);
	public static final RegistryObject<SimpleParticleType> PERICOLO = REGISTRY.register("pericolo", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BALATRO_LOG_PARTICLE = REGISTRY.register("balatro_log_particle", () -> new SimpleParticleType(false));
}
