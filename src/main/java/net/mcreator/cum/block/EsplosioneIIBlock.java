
package net.mcreator.cum.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.procedures.EsplosioneIIBlockAddedProcedure;

import java.util.List;

public class EsplosioneIIBlock extends Block {
	public EsplosioneIIBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.break"))))
				.strength(1f, 10f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("block.cum.esplosione_ii.description_0"));
		list.add(Component.translatable("block.cum.esplosione_ii.description_1"));
		list.add(Component.translatable("block.cum.esplosione_ii.description_2"));
		list.add(Component.translatable("block.cum.esplosione_ii.description_3"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		EsplosioneIIBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
