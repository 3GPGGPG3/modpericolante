package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModBlocks;
import net.mcreator.cum.CumMod;

public class SanguinamentoeffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CumMod.queueServerWork(10, () -> {
			world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), CumModBlocks.BLOOD.get().defaultBlockState(), 3);
		});
		CumMod.queueServerWork(20, () -> {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("cum:sanguinamento")))), 1);
		});
	}
}
