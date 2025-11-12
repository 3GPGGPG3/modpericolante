
package net.mcreator.cum.block;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.world.inventory.VascaElettroforeticaGUIMenu;
import net.mcreator.cum.block.entity.VascaDopoElettroforesiBlockEntity;

import java.util.List;

import io.netty.buffer.Unpooled;

public class VascaDopoElettroforesiBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public VascaDopoElettroforesiBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(0f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.cum.vasca_dopo_elettroforesi.description_0"));
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
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 0, 5, 10, 1, 11), box(6, 1, 5, 6.6, 3, 11), box(9.4, 1, 5, 10, 3, 11), box(6.6, 1, 5, 9.4, 3, 5.6), box(6.6, 1, 10.4, 9.4, 3, 11), box(9.9, 0.5, 7.9, 10.4, 2.5, 8.6), box(6.8, 0, 10.4, 9.2, 0.8, 12.4),
					box(6.6, 0, 10.6, 9.4, 0.3, 12.6));
			case NORTH -> Shapes.or(box(6, 0, 5, 10, 1, 11), box(9.4, 1, 5, 10, 3, 11), box(6, 1, 5, 6.6, 3, 11), box(6.6, 1, 10.4, 9.4, 3, 11), box(6.6, 1, 5, 9.4, 3, 5.6), box(5.6, 0.5, 7.4, 6.1, 2.5, 8.1), box(6.8, 0, 3.6, 9.2, 0.8, 5.6),
					box(6.6, 0, 3.4, 9.4, 0.3, 5.4));
			case EAST -> Shapes.or(box(5, 0, 6, 11, 1, 10), box(5, 1, 9.4, 11, 3, 10), box(5, 1, 6, 11, 3, 6.6), box(5, 1, 6.6, 5.6, 3, 9.4), box(10.4, 1, 6.6, 11, 3, 9.4), box(7.9, 0.5, 5.6, 8.6, 2.5, 6.1), box(10.4, 0, 6.8, 12.4, 0.8, 9.2),
					box(10.6, 0, 6.6, 12.6, 0.3, 9.4));
			case WEST -> Shapes.or(box(5, 0, 6, 11, 1, 10), box(5, 1, 6, 11, 3, 6.6), box(5, 1, 9.4, 11, 3, 10), box(10.4, 1, 6.6, 11, 3, 9.4), box(5, 1, 6.6, 5.6, 3, 9.4), box(7.4, 0.5, 9.9, 8.1, 2.5, 10.4), box(3.6, 0, 6.8, 5.6, 0.8, 9.2),
					box(3.4, 0, 6.6, 5.4, 0.3, 9.4));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openScreen(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Vasca elettroforetica dopo elettroforesi");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new VascaElettroforeticaGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new VascaDopoElettroforesiBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof VascaDopoElettroforesiBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof VascaDopoElettroforesiBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
