
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.cum.fluid.types.GelDiAgarosioFluidType;
import net.mcreator.cum.fluid.types.BloodFluidType;
import net.mcreator.cum.fluid.types.AcquaDelGodoFluidType;
import net.mcreator.cum.CumMod;

public class CumModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CumMod.MODID);
	public static final RegistryObject<FluidType> ACQUA_DEL_GODO_TYPE = REGISTRY.register("acqua_del_godo", () -> new AcquaDelGodoFluidType());
	public static final RegistryObject<FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
	public static final RegistryObject<FluidType> GEL_DI_AGAROSIO_TYPE = REGISTRY.register("gel_di_agarosio", () -> new GelDiAgarosioFluidType());
}
