
package net.mcreator.cum.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.procedures.BloodMobplayerCollidesBlockProcedure;
import net.mcreator.cum.procedures.BloodBlockAddedProcedure;
import net.mcreator.cum.init.CumModFluids;

public class BloodBlock extends LiquidBlock {
	public BloodBlock() {
		super(() -> CumModFluids.BLOOD.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		BloodBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BloodMobplayerCollidesBlockProcedure.execute(entity);
	}
}
