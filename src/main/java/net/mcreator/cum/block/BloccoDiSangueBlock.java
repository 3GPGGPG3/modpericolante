
package net.mcreator.cum.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.procedures.BloccoDiSangueBlockAddedProcedure;

public class BloccoDiSangueBlock extends FallingBlock {
	public BloccoDiSangueBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(0.25f, 0.5f).friction(0.9f).speedFactor(1.2f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		BloccoDiSangueBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
