
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.cum.fluid.GelDiAgarosioFluid;
import net.mcreator.cum.fluid.BloodFluid;
import net.mcreator.cum.fluid.AcquaDelGodoFluid;
import net.mcreator.cum.CumMod;

public class CumModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CumMod.MODID);
	public static final RegistryObject<FlowingFluid> ACQUA_DEL_GODO = REGISTRY.register("acqua_del_godo", () -> new AcquaDelGodoFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ACQUA_DEL_GODO = REGISTRY.register("flowing_acqua_del_godo", () -> new AcquaDelGodoFluid.Flowing());
	public static final RegistryObject<FlowingFluid> BLOOD = REGISTRY.register("blood", () -> new BloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLOOD = REGISTRY.register("flowing_blood", () -> new BloodFluid.Flowing());
	public static final RegistryObject<FlowingFluid> GEL_DI_AGAROSIO = REGISTRY.register("gel_di_agarosio", () -> new GelDiAgarosioFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GEL_DI_AGAROSIO = REGISTRY.register("flowing_gel_di_agarosio", () -> new GelDiAgarosioFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACQUA_DEL_GODO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACQUA_DEL_GODO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GEL_DI_AGAROSIO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GEL_DI_AGAROSIO.get(), RenderType.translucent());
		}
	}
}
