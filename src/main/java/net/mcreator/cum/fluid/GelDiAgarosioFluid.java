
package net.mcreator.cum.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModFluids;
import net.mcreator.cum.init.CumModFluidTypes;
import net.mcreator.cum.init.CumModBlocks;

public abstract class GelDiAgarosioFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CumModFluidTypes.GEL_DI_AGAROSIO_TYPE.get(), () -> CumModFluids.GEL_DI_AGAROSIO.get(), () -> CumModFluids.FLOWING_GEL_DI_AGAROSIO.get())
			.explosionResistance(100f).slopeFindDistance(2).bucket(() -> CumModItems.GEL_DI_AGAROSIO_BUCKET.get()).block(() -> (LiquidBlock) CumModBlocks.GEL_DI_AGAROSIO.get());

	private GelDiAgarosioFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GelDiAgarosioFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GelDiAgarosioFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
