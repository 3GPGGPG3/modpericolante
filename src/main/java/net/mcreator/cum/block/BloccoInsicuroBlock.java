
package net.mcreator.cum.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BloccoInsicuroBlock extends Block {
	public BloccoInsicuroBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(5.75f, 15f).lightLevel(s -> 11));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
