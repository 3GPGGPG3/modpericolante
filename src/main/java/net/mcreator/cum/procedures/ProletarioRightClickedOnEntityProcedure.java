package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;

public class ProletarioRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CumModItems.IL_CAPITALE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(0);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.SOCIALISTA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
