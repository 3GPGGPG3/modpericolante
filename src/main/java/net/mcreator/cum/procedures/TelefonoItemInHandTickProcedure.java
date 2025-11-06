package net.mcreator.cum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cum.init.CumModMobEffects;
import net.mcreator.cum.init.CumModItems;
import net.mcreator.cum.init.CumModEntities;
import net.mcreator.cum.entity.PresideEntity;
import net.mcreator.cum.CumMod;

public class TelefonoItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CumModMobEffects.DIVIETOUSOCELLULAREEFFECT.get())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CumModEntities.PRESIDE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CumModItems.TELEFONO.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			CumMod.queueServerWork(20, () -> {
				if (entity instanceof PresideEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PresideEntity.DATA_incazzato, true);
			});
			CumMod.queueServerWork(10000, () -> {
				if (entity instanceof PresideEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PresideEntity.DATA_incazzato, false);
			});
		}
	}
}
