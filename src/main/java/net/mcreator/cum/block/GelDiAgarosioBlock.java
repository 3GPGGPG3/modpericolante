
package net.mcreator.cum.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModFluids;

public class GelDiAgarosioBlock extends LiquidBlock {
	public GelDiAgarosioBlock() {
		super(() -> CumModFluids.GEL_DI_AGAROSIO.get(), BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 8;
	}
}
