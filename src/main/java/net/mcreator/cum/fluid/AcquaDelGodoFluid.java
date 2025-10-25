
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

public abstract class AcquaDelGodoFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CumModFluidTypes.ACQUA_DEL_GODO_TYPE.get(), () -> CumModFluids.ACQUA_DEL_GODO.get(), () -> CumModFluids.FLOWING_ACQUA_DEL_GODO.get())
			.explosionResistance(100f).bucket(() -> CumModItems.ACQUA_DEL_GODO_BUCKET.get()).block(() -> (LiquidBlock) CumModBlocks.ACQUA_DEL_GODO.get());

	private AcquaDelGodoFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcquaDelGodoFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcquaDelGodoFluid {
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
