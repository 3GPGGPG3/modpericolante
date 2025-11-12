
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

public class MatraccioBlock extends Block {
	public MatraccioBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.6f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(3.4, 0, 3.4, 12.6, 1, 12.6), box(3, 1, 3, 13, 3, 13), box(3.4, 3, 3.4, 12.6, 4.6, 12.6), box(4.1, 4.5, 4.1, 11.9, 5.7, 11.9), box(5.1, 5.7, 5.1, 10.9, 6.2, 10.9), box(6, 6.2, 6, 10, 6.4, 10), box(7, 6, 6.5, 9, 17, 7),
				box(7, 6, 9, 9, 17, 9.5), box(6.5, 6, 7, 7, 17, 9), box(9, 6, 7, 9.5, 17, 9));
	}
}
