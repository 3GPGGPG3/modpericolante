
package net.mcreator.cum.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.procedures.SlabDiSangueBlockAddedProcedure;

public class SlabDiSangueBlock extends SlabBlock {
	public SlabDiSangueBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(0.1f, 0.5f).friction(0.7f).speedFactor(1.2f));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		SlabDiSangueBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
