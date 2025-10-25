
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

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CumModFluidTypes.BLOOD_TYPE.get(), () -> CumModFluids.BLOOD.get(), () -> CumModFluids.FLOWING_BLOOD.get()).explosionResistance(100f).tickRate(7)
			.slopeFindDistance(1).bucket(() -> CumModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) CumModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
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
