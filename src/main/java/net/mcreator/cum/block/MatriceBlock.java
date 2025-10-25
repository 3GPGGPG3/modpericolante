
package net.mcreator.cum.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class MatriceBlock extends Block {
	public MatriceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(0f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(6.5, 0, 6, 9.4, 1, 9.3), box(6.5, 0, 9.6, 9.4, 1, 10), box(6.5, 0, 9.3, 9.4, 0.4, 9.6), box(7, 0.4, 9.3, 7.5, 1, 9.6), box(6.5, 0.4, 9.3, 6.8, 1, 9.6), box(9.1, 0.4, 9.3, 9.4, 1, 9.6), box(8.4, 0.4, 9.3, 8.9, 1, 9.6),
				box(7.7, 0.4, 9.3, 8.2, 1, 9.6));
	}
}
