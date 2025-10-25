
package net.mcreator.cum.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BloccoSicuroBlock extends Block {
	public BloccoSicuroBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(7f, 20f).lightLevel(s -> 11));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
