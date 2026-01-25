
package net.mcreator.cum.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BloccoDiSborraBlock extends Block {
	public BloccoDiSborraBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:sbirrisound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:sbirrisound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cum:sbirrisound")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.fall"))))
				.strength(0.15f, 2f).friction(0.7f).speedFactor(0.5f).jumpFactor(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}
}
