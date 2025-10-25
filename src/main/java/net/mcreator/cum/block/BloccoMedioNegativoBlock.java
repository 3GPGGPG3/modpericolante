
package net.mcreator.cum.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BloccoMedioNegativoBlock extends Block {
	public BloccoMedioNegativoBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3.5f, 13.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
