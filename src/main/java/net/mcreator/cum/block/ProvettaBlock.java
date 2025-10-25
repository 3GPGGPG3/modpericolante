
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

public class ProvettaBlock extends Block {
	public ProvettaBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(7.8, 0, 7.8, 8.2, 0.1, 8.2), box(7.7, 0.1, 7.8, 7.8, 0.3, 8.2), box(8.2, 0.1, 7.8, 8.3, 0.3, 8.2), box(7.8, 0.1, 7.7, 8.2, 0.3, 7.8), box(7.8, 0.1, 8.2, 8.2, 0.3, 8.3), box(7.8, 0.3, 8.3, 8.2, 5.2, 8.4),
				box(7.8, 0.3, 7.6, 8.2, 5.2, 7.7), box(7.6, 0.3, 7.8, 7.7, 5.2, 8.2), box(8.3, 0.3, 7.8, 8.4, 5.2, 8.2), box(8.2, 0.3, 8.2, 8.3, 5.2, 8.3), box(8.2, 0.3, 7.7, 8.3, 5.2, 7.8), box(7.7, 0.3, 7.7, 7.8, 5.2, 7.8),
				box(7.7, 0.3, 8.2, 7.8, 5.2, 8.3));
	}
}
