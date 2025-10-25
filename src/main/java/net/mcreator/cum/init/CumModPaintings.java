
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.cum.CumMod;

public class CumModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, CumMod.MODID);
	public static final RegistryObject<PaintingVariant> PAPERONE_CASINO = REGISTRY.register("paperone_casino", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> PAPERONE_CASINO_2 = REGISTRY.register("paperone_casino_2", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> CANI_CASINO = REGISTRY.register("cani_casino", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> UN_VOTO_IN_MENO = REGISTRY.register("un_voto_in_meno", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> WANTED_IL_FU_MATTIA_PASCAL = REGISTRY.register("wanted_il_fu_mattia_pascal", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> GODOPERKEO = REGISTRY.register("godoperkeo", () -> new PaintingVariant(16, 32));
}
