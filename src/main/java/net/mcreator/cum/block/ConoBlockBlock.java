
package net.mcreator.cum.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;

public class ConoBlockBlock extends FallingBlock {
	public ConoBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO_WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.cum.cono_block.description_0"));
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
		return Shapes.or(box(3.5, 0, 10.5, 12.5, 0.6, 12.5), box(3.5, 0, 3.5, 12.5, 0.6, 5.5), box(3.5, 0, 5.5, 5.5, 0.6, 10.5), box(10, 0, 5.5, 10.5, 3.5, 10.5), box(9.5, 3, 6, 10, 8.1, 10), box(9, 8.1, 7, 9.5, 10.9, 9), box(7, 10.9, 7, 9, 11.4, 9),
				box(6.5, 8.1, 7, 7, 10.9, 9), box(6, 3, 6, 6.5, 8.1, 10), box(6, 0, 5.5, 10, 3.5, 6), box(6, 0, 10, 10, 3.5, 10.5), box(6.5, 3.5, 9.5, 9.5, 8.1, 10), box(6.5, 3.5, 6, 9.5, 8.1, 6.5), box(6.5, 7.9, 6.5, 9.5, 10.9, 7),
				box(6.5, 7.9, 9, 9.5, 10.9, 9.5), box(5.5, 0, 5.5, 6, 3.5, 10.5), box(10.5, 0, 5.5, 12.5, 0.6, 10.5));
	}
}
